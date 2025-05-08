package at.sozvers.noegkk.focus.service.ecard.ecarddaten;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import at.sozvers.focus.persistence.focus.FocusSteuerung;
import at.sozvers.noegkk.focus.CdiExtension;
import at.sozvers.noegkk.focus.service.api.ecard.ECarddatenBTO;
import at.sozvers.noegkk.focus.service.common.Fachschluessel;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import org.jboss.weld.context.RequestContext;
import org.jboss.weld.context.unbound.Unbound;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.*;

@Disabled("Schnittstelle für Test funktioniert aktuell nicht.")
@ExtendWith(CdiExtension.class)
class ECarddatenServiceIT {
  @Inject
  private EntityManager     em;
  @Inject
  @Unbound
  private RequestContext    requestContext;
  @Inject
  private ECarddatenService service;

  @BeforeEach
  public void activateRequestContext() {
	if(requestContext.isActive()) {
	  requestContext.deactivate();
	}
	requestContext.activate();
  }

  @BeforeEach
  public void setUp() {
	em.getTransaction().begin();
  }

  private void setupCustomFocusSteuerung() {
	FocusSteuerung focusSteuerung = em.find(FocusSteuerung.class, "ECARD_ERMITTLUNG_ZEITRAUM_START");
	focusSteuerung.setWert(String.valueOf(getTimeDifference()));
  }

  private int getTimeDifference() {
	LocalDate dateNow  = LocalDate.now();
	LocalDate dateThen = LocalDate.of(2019, 3, 15);

	long daysDifference = ChronoUnit.DAYS.between(dateThen, dateNow);

	return (int) daysDifference + 180;
  }

  @AfterEach
  public void tearDown() {
	em.getTransaction().rollback();
  }

    /*//Fehlende Testdaten
    @Test
    @Disabled("Testdaten wurden von ECard-Seite geändert, aktuell ist keine ECard mit letzter Konsultation auf dieser Umgebung bekannt.")
    void test_searchLetzteKonsultationDatum() {
        setupCustomFocusSteuerung();

        Fachschluessel fachschluessel = Fachschluessel.of("1239050178", "VSNR");

        final LocalDate[] lambdaResponse = {null};
        assertDoesNotThrow(() -> lambdaResponse[0] = service.searchLetzteKonsultationDatum(fachschluessel));
        LocalDate date = lambdaResponse[0];

        assertEquals(LocalDate.of(2021, 1, 14), date);
    }*/

  @Test
  void test_searchEcardByFachschluessel() {

	Fachschluessel fachschluessel = Fachschluessel.of("1239050178", "VSNR");

	final ECarddatenBTO[] lambdaResponse = {null};
	assertDoesNotThrow(() -> lambdaResponse[0] = service.searchEcardByFachschluessel(fachschluessel));
	ECarddatenBTO bto = lambdaResponse[0];

	assertNotNull(bto);
	assertNull(bto.getLetzteKonsultation());
	assertEquals("2017-03-10", bto.getAusstellungsDatum().toString());
	assertEquals("1239050178001", bto.getLaufnummer());
  }

  @Test
  void test_searchLetzteKonsultationDatum_keineKonsultation() {
	Fachschluessel fachschluessel = Fachschluessel.of("1239050178", "VSNR");

	final LocalDate[] lambdaResponse = {null};
	assertDoesNotThrow(() -> lambdaResponse[0] = service.searchLetzteKonsultationDatum(fachschluessel));
	LocalDate date = lambdaResponse[0];

	assertNull(date);
  }

  @Test
  void test_searchLetzteKonsultationDatum_keines() {
	Fachschluessel    fachschluessel = Fachschluessel.of("1239050178", "VSNR");
	final LocalDate[] lambdaResponse = {null};
	assertDoesNotThrow(() -> lambdaResponse[0] = service.searchLetzteKonsultationDatum(fachschluessel));
	LocalDate date = lambdaResponse[0];

	assertNull(date);
  }
}
