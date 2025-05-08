package at.sozvers.noegkk.focus.testresources.testdb;

import java.io.*;
import java.sql.SQLException;
import java.util.*;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.spi.Context;
import jakarta.enterprise.inject.spi.Bean;
import jakarta.enterprise.inject.spi.BeanManager;
import jakarta.faces.context.ExternalContext;
import jakarta.faces.context.FacesContext;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import org.dbunit.DatabaseUnitException;
import org.dbunit.database.DatabaseConnection;
import org.dbunit.database.IDatabaseConnection;
import org.dbunit.dataset.DataSetException;
import org.dbunit.dataset.IDataSet;
import org.dbunit.dataset.xml.FlatXmlDataSet;
import org.dbunit.dataset.xml.FlatXmlProducer;
import org.dbunit.operation.DatabaseOperation;
import org.hibernate.Session;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.xml.sax.InputSource;

import static org.mockito.Mockito.lenient;

// Use Mockito and the custom extension (from DbTestDataExtension) to manage annotations
@ExtendWith({MockitoExtension.class, DbTestDataExtension.class})
public abstract class DbUnitTestBase {

  private static final String              DATA_FILEPATH      = "src/test/resources/testdata/";
  private static final String              RESETDB_FILENAME   = "resetDB.xml";
  private static final String              SLASH              = "/";
  private static final String              SYSTABLE_FILENAME  = "sysTable.xml";
  @Inject
  private              BeanManager         beanManager;
  private              IDatabaseConnection connection;
  private              FacesContext        context;
  @Inject
  private              EntityManager       em;
  private              boolean             systemTableRestore = false;
  private              IDataSet            systemTableSet;

  @BeforeEach
  public void beginTransaction(DbTestDataExtension extension) throws DatabaseUnitException, SQLException, IOException {
	if(em.getTransaction().isActive()) {
	  em.getTransaction().rollback();
	}
	em.getTransaction().begin();

	// Context and BeanManager handling to fetch the actual EntityManager
	final Context       injectionContext  = this.beanManager.getContext(ApplicationScoped.class);
	final Bean          entityManagerBean = this.beanManager.resolve(beanManager.getBeans(EntityManager.class));
	final EntityManager entityManager     = (EntityManager) injectionContext.get(entityManagerBean);

	connection = new DatabaseConnection(entityManager.unwrap(Session.class).doReturningWork(con -> con));

	// Reset database to a clean state
	resetDatabase();

	// Fetch DbTestData annotation if available
	DbTestData annotation = DbTestDataExtension.annotation;
	if(annotation == null) {
	  annotation = this.getClass().getAnnotation(DbTestData.class);
	}
	if(annotation != null) {
	  insertTestData(annotation);
	}

	em.getTransaction().commit();
	em.clear();

	// Mock FacesContext for JSF-related tests
	context = ContextMocker.mockFacesContext();
	Map<String, Object> session = new HashMap<>();
	ExternalContext     ext     = Mockito.mock(ExternalContext.class);
	lenient().when(ext.getSessionMap()).thenReturn(session);
	lenient().when(context.getExternalContext()).thenReturn(ext);

	em.getTransaction().begin();
  }

  private void resetDatabase() throws DatabaseUnitException, SQLException {
	FlatXmlProducer producer = new FlatXmlProducer(new InputSource(new File(DATA_FILEPATH + RESETDB_FILENAME).getAbsolutePath()));
	producer.setColumnSensing(true);
	FlatXmlDataSet xmlDataSet = new FlatXmlDataSet(producer);
	DatabaseOperation.CLEAN_INSERT.execute(connection, xmlDataSet);
  }

  private void insertTestData(DbTestData annotation) throws DatabaseUnitException, SQLException, IOException {
	String          filepath = DATA_FILEPATH + SLASH + annotation.filename();
	FlatXmlProducer producer = new FlatXmlProducer(new InputSource(new File(filepath).getAbsolutePath()));
	producer.setColumnSensing(true);
	FlatXmlDataSet xmlDataSet = new FlatXmlDataSet(producer);

	if(Arrays.asList(xmlDataSet.getTableNames()).contains("focus_system")) {
	  this.saveSystemTable();
	}

	DatabaseOperation.CLEAN_INSERT.execute(connection, xmlDataSet);
  }

  private void saveSystemTable() throws DataSetException, SQLException, IOException {
	this.systemTableSet = connection.createDataSet(new String[]{"focus_system"});
	FlatXmlDataSet.write(systemTableSet, new FileOutputStream(DATA_FILEPATH + SYSTABLE_FILENAME));
	this.systemTableRestore = true;
  }

  public IDatabaseConnection getConnection() {
	return this.connection;
  }

  @AfterEach
  public void restoreSystemTable() throws DatabaseUnitException, SQLException {
	if(this.systemTableRestore) {
	  if(em.getTransaction().isActive()) {
		em.getTransaction().rollback();
	  }
	  em.getTransaction().begin();

	  FlatXmlProducer producer = new FlatXmlProducer(new InputSource(DATA_FILEPATH + SYSTABLE_FILENAME));
	  producer.setColumnSensing(true);
	  FlatXmlDataSet xmlDataSet = new FlatXmlDataSet(producer);
	  DatabaseOperation.CLEAN_INSERT.execute(connection, xmlDataSet);

	  em.getTransaction().commit();
	  em.clear();

	  systemTableRestore = false;
	  systemTableSet = null;
	}

	context.release();
	if(em.getTransaction().isActive()) {
	  em.getTransaction().commit();
	}
  }
}
