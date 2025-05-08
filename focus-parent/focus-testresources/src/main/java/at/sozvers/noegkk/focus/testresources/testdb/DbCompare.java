package at.sozvers.noegkk.focus.testresources.testdb;

import java.io.*;
import java.net.MalformedURLException;
import java.sql.SQLException;
import java.util.*;
import org.dbunit.Assertion;
import org.dbunit.DatabaseUnitException;
import org.dbunit.database.IDatabaseConnection;
import org.dbunit.dataset.*;
import org.dbunit.dataset.xml.FlatXmlDataSetBuilder;
import org.dbunit.dataset.xml.FlatXmlWriter;

import static org.junit.jupiter.api.Assertions.fail;

public abstract class DbCompare {

  public static final    String   DBUNIT_NULL   = "[null]";
  public static final    String   FILEPATH      = "src/test/resources/testdata/";
  protected static final String[] ALWAYS_IGNORE = {"ERSTELL_TS", "LETZTAEND_TS", "id", "ersteller", "letztaend"};
  private static final   String   SLASH         = "/";

  private DbCompare() {
  }

  /**
   * Eine Methode zum Vergleich des aktuellen Standes der Datenbank mit einem XML-File das den erwarteten Datenstand abbildet (z.B. "test123_expected.xml"). <br>
   * <br>
   * Die gelesenen Tabellen aus der DB werden automatisch über das "expected File" ermittelt
   *
   * @param expectedXmlFileName
   * 		- Filename des XML-Files mit den erwarteten Daten, muss auf "_expected.xml" enden
   * @param connection
   * 		- Die von DBUnit zur Verfügung gestellte Datenbankverbindung (vom Typ IDatabaseConnection)
   */
  public static void assertDbEquals(String expectedXmlFileName, IDatabaseConnection connection) {
	assertDb(expectedXmlFileName, connection, null);
  }

  private static void assertDb(String expectedXmlFileName, IDatabaseConnection connection, List<String> ignoredColumns) {
	// Umständliche, aber nicht anders mögliche Variante aus einer statischen
	// Methode die aufrufende Klasse zu lesen
	String className = new Throwable().getStackTrace()[2].getClassName();
	className = className.substring(className.lastIndexOf('.') + 1);
	expectedXmlFileName = className + SLASH + expectedXmlFileName;
	checkParameter(expectedXmlFileName, connection);

	try {
	  FlatXmlDataSetBuilder builder = new FlatXmlDataSetBuilder();
	  builder.setColumnSensing(true);

	  ReplacementDataSet replacementDataSet = new ReplacementDataSet(builder.build(new File(FILEPATH + expectedXmlFileName)));
	  replacementDataSet.addReplacementObject(DBUNIT_NULL, null);
	  IDataSet expectedDataSet = new SortedDataSet(replacementDataSet);
	  IDataSet actualDataSet   = new SortedDataSet(connection.createDataSet(expectedDataSet.getTableNames()));

	  List<String> allIgnoredColumns = new ArrayList<>();
	  allIgnoredColumns.addAll(Arrays.asList(ALWAYS_IGNORE));
	  if(ignoredColumns != null && !ignoredColumns.isEmpty()) {
		allIgnoredColumns.addAll(ignoredColumns);
	  }

	  for(String tableName : actualDataSet.getTableNames()) {
		Assertion.assertEqualsIgnoreCols(expectedDataSet.getTable(tableName), actualDataSet.getTable(tableName), allIgnoredColumns.toArray(new String[0]));
	  }
	} catch(SQLException sqle) {
	  fail("Fehler beim Lesen der Datenbank");
	} catch(MalformedURLException murle) {
	  fail("Fehler beim Lesen des XML-Files");
	} catch(DataSetException dse) {
	  fail("Fehler beim Lesen der erwarteten Daten");
	} catch(DatabaseUnitException due) {
	  fail("Unterschiede");
	}
  }

  private static void checkParameter(String expectedXmlFileName, IDatabaseConnection connection) {
	if(connection == null) {
	  fail("Die DB-Verbindung ist NULL");
	}
	if(expectedXmlFileName == null || expectedXmlFileName.isEmpty()) {
	  fail("XML-Filename ist NULL bzw. leer");
	}
	if(expectedXmlFileName != null && !expectedXmlFileName.endsWith("_expected.xml")) {
	  fail("Das erwartete XML-File endet nicht mit \"_expected.xml\"");
	}
  }

  /**
   * Eine Methode zum Vergleich des aktuellen Standes der Datenbank mit einem XML-File das den erwarteten Datenstand abbildet (z.B. "test123_expected.xml"). <br> Tabellenspalten können über eine Liste
   * ignoriert werden, z.B. Erstell- und Änderungszeitpunkte, Ids,... <br>
   * <br>
   * Die gelesenen Tabellen aus der DB werden automatisch über das "expected File" ermittelt
   *
   * @param expectedXmlFileName
   * 		- Filename des XML-Files mit den erwarteten Daten, muss auf "_expected.xml" enden
   * @param connection
   * 		- Die von DBUnit zur Verfügung gestellte Datenbankverbindung (vom Typ IDatabaseConnection)
   * @param ignoredColumns
   * 		- Eine String-Liste mit den Namen der Tabellenspalten die ignoriert werden sollen (z.B. Ids, Erstellzeitpunkt,...)
   */
  public static void assertDbEquals(String expectedXmlFileName, IDatabaseConnection connection, List<String> ignoredColumns) {
	assertDb(expectedXmlFileName, connection, ignoredColumns);
  }

  public static void assertDbEquals(String expectedXmlFileName, IDatabaseConnection connection, String... ignoredColumns) {
	assertDb(expectedXmlFileName, connection, Arrays.asList(ignoredColumns));
  }

  /**
   * Eine unterstützende Methode über die der aktuelle Stand der Datenbank in ein XML-File geschrieben wird. Dieses erzeugte File kann dann als expected.xml für die Vergleichstests herangezogen
   * werden.
   *
   * @param connection
   * 		- Die von DBUnit zur Verfügung gestellte Datenbankverbindung (vom Typ IDatabaseConnection)
   * @param xmlFileName
   * 		- Name der XML-Datei die erstellt werden soll
   * @param tableNames
   * 		- Liste an Tabellen die aus der Datenbank in XML konvertiert werden sollen. Wenn null oder leer wird die gesamte DB konvertiert
   */
  public static File writeDataSetIntoXmlFile(IDatabaseConnection connection, String xmlFileName, List<String> tableNames) {
	File     f       = new File(FILEPATH + xmlFileName);
	IDataSet dataSet = null;
	try {
	  if(tableNames != null && !tableNames.isEmpty()) {
		dataSet = connection.createDataSet(tableNames.toArray(new String[0]));
	  } else {
		dataSet = connection.createDataSet();
	  }

	  FlatXmlWriter      xmlWriter          = new FlatXmlWriter(new FileOutputStream(f));
	  ReplacementDataSet replacementDataSet = new ReplacementDataSet(dataSet);
	  replacementDataSet.addReplacementObject(null, DBUNIT_NULL);
	  xmlWriter.write(replacementDataSet);
	} catch(IOException ioe) {
	  fail("Fehler beim Schreiben des XML-Files");
	} catch(DataSetException dse) {
	  fail("Fehler beim Lesen der Daten");
	} catch(SQLException sqle) {
	  fail("Fehler beim Lesen aus der Datenbank");
	}

	return f;
  }
}
