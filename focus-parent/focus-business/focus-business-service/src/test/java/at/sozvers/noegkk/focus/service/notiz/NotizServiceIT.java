package at.sozvers.noegkk.focus.service.notiz;

import at.sozvers.noegkk.focus.CdiExtension;
import at.sozvers.noegkk.focus.service.api.notiz.NotizBTO;
import at.sozvers.noegkk.focus.service.common.Fachschluessel;
import at.sozvers.noegkk.focus.testresources.testdb.*;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import org.jboss.weld.context.RequestContext;
import org.jboss.weld.context.unbound.Unbound;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(CdiExtension.class)
class NotizServiceIT extends DbUnitTestBase {
  @Inject
  NotizService notizService;
  @Inject
  private EntityManager  em;
  @Inject
  @Unbound
  private RequestContext requestContext;

  @BeforeEach
  public void activateRequestContext() {
	if(requestContext.isActive()) {
	  requestContext.deactivate();
	}
	requestContext.activate();
  }

  @Test
  @DbTestData(filename="NotizServiceIT/newNotizVSNR_expected.xml")
  void neueNotizBereitsVorhanden() {
	Fachschluessel fs = Fachschluessel.of("4263060898", "VSNR");
	assertThrows(Exception.class, () -> notizService.createNotizForFachschluessel(fs, "Integration Test"));
  }

  @Test
  void neueNotizSchreiben_BTNR() {
	Fachschluessel fs = Fachschluessel.of("0226231100", "BTNR");
	notizService.createNotizForFachschluessel(fs, "Integration Test");

	// commit before trying to compare the database
	em.getTransaction().commit();
	em.clear();

	DbCompare.assertDbEquals("newNotizBTNR_expected.xml", this.getConnection());
  }

  @Test
  void neueNotizSchreiben_VSNR() {
	Fachschluessel fs = Fachschluessel.of("4263060898", "VSNR");
	notizService.createNotizForFachschluessel(fs, "Integration Test");

	// commit before trying to compare the database
	em.getTransaction().commit();
	em.clear();

	DbCompare.assertDbEquals("newNotizVSNR_expected.xml", this.getConnection());
  }

  @BeforeEach
  public void setup() {
	if(em.getTransaction().isActive()) {
	  em.getTransaction().commit();
	}
	em.getTransaction().begin();
  }

  @AfterEach
  public void teardown() {
	if(em.getTransaction().isActive()) {
	  em.getTransaction().commit();
	}
  }

  @Test
  @DbTestData(filename="NotizServiceIT/newNotizVSNR_expected.xml")
  void testLeseNotiz() {
	Fachschluessel fs = Fachschluessel.of("4263060898", "VSNR");

	NotizBTO expectedNotizBTO = new NotizBTO("Integration Test", 0L, fs.getFachschluessel(), fs.getFachschluesselArt());
	NotizBTO actualNotizBTO   = notizService.readNotizByFachschluessel(fs);

	assertTrue(actualNotizBTO.toString().contains(expectedNotizBTO.toString()));
  }

  @Test
  void testNotizNichtGefunden() {
	Fachschluessel fs       = Fachschluessel.of("4263060898", "VSNR");
	NotizBTO       notizBTO = notizService.readNotizByFachschluessel(fs);
	assertNull(notizBTO);
  }

  @Test
  @DbTestData(filename="NotizServiceIT/updatedNotizVSNR_expected.xml")
  void testUnterschliedlicheUpdateCounts() {
	Fachschluessel fs = Fachschluessel.of("4263060898", "VSNR");
	assertThrows(Exception.class, () -> notizService.updateNotizForFachschluessel(fs, "Updated", 0));
  }

  @Test
  void updateNichtVorhandeneNotiz() {
	Fachschluessel fs = Fachschluessel.of("4263060898", "VSNR");
	notizService.createNotizForFachschluessel(fs, "Integration Test");

	// commit before trying to compare the database
	em.getTransaction().commit();
	em.clear();

	DbCompare.assertDbEquals("newNotizVSNR_expected.xml", this.getConnection());
  }

  @Test
  @DbTestData(filename="NotizServiceIT/newNotizBTNR_expected.xml")
  void updateNotizBTNR() {
	Fachschluessel fs = Fachschluessel.of("0226231100", "BTNR");
	notizService.updateNotizForFachschluessel(fs, "Updated", 0);

	// commit before trying to compare the database
	em.getTransaction().commit();
	em.clear();

	DbCompare.assertDbEquals("updatedNotizBTNR_expected.xml", this.getConnection());
  }

  @Test
  @DbTestData(filename="NotizServiceIT/newNotizVSNR_expected.xml")
  void updateNotizVSNR() {
	Fachschluessel fs = Fachschluessel.of("4263060898", "VSNR");
	notizService.updateNotizForFachschluessel(fs, "Updated", 0);

	// commit before trying to compare the database
	em.getTransaction().commit();
	em.clear();

	DbCompare.assertDbEquals("updatedNotizVSNR_expected.xml", this.getConnection());
  }
}
