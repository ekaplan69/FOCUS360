package at.sozvers.noegkk.focus.testresources.testdb;

import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import org.dbunit.database.*;
import org.dbunit.dataset.xml.FlatXmlDataSet;

public class DatabaseExport {
  public static void main(String[] args) throws Exception {
	// database connection

	try(Connection jdbcConnection = DriverManager.getConnection("jdbc:postgresql://lvgfocusdb01e.test.sozvers.at:5432/focus", "focus", "focus")) {
	  IDatabaseConnection connection = new DatabaseConnection(jdbcConnection, "public");
	  DatabaseConfig      config     = connection.getConfig();
	  config.setProperty(DatabaseConfig.FEATURE_QUALIFIED_TABLE_NAMES, true); // sorgt dafür dass das
	  // Schema
	  // bei der .dtd mit
	  // exportiert
	  // wird
	  // Untenstehende Tabellen/Daten werden lt. Select exportiert
	  QueryDataSet partialDataSet = new QueryDataSet(connection);
	  partialDataSet.addTable("focus_system", "SELECT * FROM focus_system");

	  // Mit untenstehender Zeile werden die aktuellen Daten in der angeführten
	  // Datenbank exportiert
	  FlatXmlDataSet.write(partialDataSet, new FileOutputStream("src/main/resources/testdaten.xml"));
	}
  }
}
