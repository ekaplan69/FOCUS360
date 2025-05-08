package at.sozvers.noegkk.focus.service.zvd.versicherungszeit;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;
import at.sozvers.focus.persistence.focus.FocusSteuerung;
import at.sozvers.noegkk.focus.CdiExtension;
import at.sozvers.noegkk.focus.service.api.zvd.VersicherungsverhaeltnisBTO;
import at.sozvers.noegkk.focus.service.common.Fachschluessel;
import at.sozvers.noegkk.focus.service.zpv.adresse.DtoAdresszuordnungListeSUIFactory;
import at.sozvers.noegkk.focus.service.zpv.dienstgeber.DtoPartnerLeliFactory;
import at.sozvers.noegkk.focus.service.zpv.person.*;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import org.jboss.weld.context.RequestContext;
import org.jboss.weld.context.unbound.Unbound;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

@ExtendWith(CdiExtension.class)
public class VersicherungszeitenServiceIT {
  @Inject
  private EntityManager              em;
  @Inject
  @Unbound
  private RequestContext             requestContext;
  @Inject
  private VersicherungszeitenService service;

  @BeforeAll
  public static void setup() {
	DtoPartnerListeLEKIFactory.BERECHTIGUNGS_SYSTEM_ID = "BEREZT";
	DtoPartnerListeLEKIFactory.QUELL_SYSTEM_ID = "FOCUS360T";
	DtoPartnerListeLEKIFactory.VERARBEITUNGS_MODUS = "O";
	DtoPartnerListeLEKIFactory.ZIEL_SYSTEM_MODUS = "V";
	DtoPartnerListeLEKIFactory.PRIMAER_SYSTEM_ID = "ZPVMIG21";

	DtoPartnerSUIFactory.BERECHTIGUNGS_SYSTEM_ID = "BEREZT";
	DtoPartnerSUIFactory.QUELL_SYSTEM_ID = "FOCUS360T";
	DtoPartnerSUIFactory.VERARBEITUNGS_MODUS = "O";
	DtoPartnerSUIFactory.ZIEL_SYSTEM_MODUS = "V";
	DtoPartnerSUIFactory.PRIMAER_SYSTEM_ID = "ZPVMIG21";

	DtoBeziehungSUIFactory.BERECHTIGUNGS_SYSTEM_ID = "BEREZT";
	DtoBeziehungSUIFactory.QUELL_SYSTEM_ID = "FOCUS360T";
	DtoBeziehungSUIFactory.VERARBEITUNGS_MODUS = "O";
	DtoBeziehungSUIFactory.ZIEL_SYSTEM_MODUS = "V";
	DtoBeziehungSUIFactory.PRIMAER_SYSTEM_ID = "ZPVMIG21";

	DtoPartnerLeliFactory.BERECHTIGUNGS_SYSTEM_ID = "BEREZT";
	DtoPartnerLeliFactory.QUELL_SYSTEM_ID = "FOCUS360T";
	DtoPartnerLeliFactory.VERARBEITUNGS_MODUS = "O";
	DtoPartnerLeliFactory.ZIEL_SYSTEM_MODUS = "V";
	DtoPartnerLeliFactory.PRIMAER_SYSTEM_ID = "ZPVMIG21";

	DtoMitarbeiterIdentifikationLEIFactory.BERECHTIGUNGS_SYSTEM_ID = "BEREZT";
	DtoMitarbeiterIdentifikationLEIFactory.QUELL_SYSTEM_ID = "FOCUS360T";
	DtoMitarbeiterIdentifikationLEIFactory.VERARBEITUNGS_MODUS = "O";
	DtoMitarbeiterIdentifikationLEIFactory.ZIEL_SYSTEM_MODUS = "V";
	DtoMitarbeiterIdentifikationLEIFactory.PRIMAER_SYSTEM_ID = "ZPVMIG21";

	DtoAdresszuordnungListeSUIFactory.BERECHTIGUNGS_SYSTEM_ID = "BEREZT";
	DtoAdresszuordnungListeSUIFactory.QUELL_SYSTEM_ID = "FOCUS360T";
	DtoAdresszuordnungListeSUIFactory.VERARBEITUNGS_MODUS = "O";
	DtoAdresszuordnungListeSUIFactory.ZIEL_SYSTEM_MODUS = "V";
	DtoAdresszuordnungListeSUIFactory.PRIMAER_SYSTEM_ID = "ZPVMIG21";
  }

  @BeforeEach
  public void setUp() {
	if(requestContext.isActive()) {
	  requestContext.deactivate();
	}
	requestContext.activate();
	em.getTransaction().begin();
  }

  @AfterEach
  public void tearDown() {
	em.getTransaction().rollback();
  }

  @Test
  void test_getQualifikationKurz_qualifikationKurz_Verfügbar() {
	assertEquals("Arbeiterlehrling", service.getQualifikationKurz("B1  "));
  }

  @Test
  void test_getQualifikationKurz_qualifikationKurz_nichtExistent() {
	assertEquals("BLUBB", service.getQualifikationKurz("BLUBB"));
  }

  @Test
  void test_searchDienstgebername_MSBKH() {
	Fachschluessel fachschluessel  = Fachschluessel.of("11/00903513", "MSBKH");
	String         dienstgebername = service.searchDienstgebername(fachschluessel);

	assertEquals("Firma Billa Aktiengesellschaft", dienstgebername);
  }

  @Test
  void test_searchDienstgebername_MSBKH_nichtExistent() {
	Fachschluessel fachschluessel  = Fachschluessel.of("08/00313500", "MSBKH");
	String         dienstgebername = service.searchDienstgebername(fachschluessel);

	assertNull(dienstgebername);
  }

  @Test
  void test_searchVersicherungsverhaeltnisseByFachschluessel_Exception() throws Exception {
	Fachschluessel                    fachschluessel = Fachschluessel.of("1234567890", "VSNR");
	List<VersicherungsverhaeltnisBTO> btos           = service.searchVersicherungsverhaeltnisseByFachschluessel(fachschluessel);

	assertEquals(0, btos.size());
  }

  @Test
  void test_searchVersicherungsverhaeltnisseByFachschluessel_NichtExistenteVsnr() throws Exception {
	Fachschluessel                    fachschluessel = Fachschluessel.of("1234567890", "VSNR");
	List<VersicherungsverhaeltnisBTO> btos           = service.searchVersicherungsverhaeltnisseByFachschluessel(fachschluessel);
	assertEquals(0, btos.size());
  }

  @Test
  void test_searchVersicherungsverhaeltnisseByFachschluessel_Vsnr() throws Exception {
	setupCustomFocusSteuerung();

	Fachschluessel                    fachschluessel = Fachschluessel.of("5436211194", "VSNR");
	List<VersicherungsverhaeltnisBTO> btos           = service.searchVersicherungsverhaeltnisseByFachschluessel(fachschluessel);

	assertEquals(2, btos.size());

	assertEquals("00919967", btos.get(0).getHvbBeitragskontonummer());
	assertEquals("F", btos.get(0).getHvbBeitragskontonummerKennzeichen());
	assertEquals("12", btos.get(0).getMeldendeStelle());
	assertEquals(2, btos.get(0).getVersicherungszeiten().size());

	assertEquals(LocalDate.of(2019, 6, 1), btos.get(0).getVersicherungszeiten().get(0).getVonDatum());
	assertEquals(LocalDate.of(2019, 6, 30), btos.get(0).getVersicherungszeiten().get(0).getBisDatum());
	assertEquals("I7", btos.get(0).getVersicherungszeiten().get(0).getQualifikation());
	assertNull(btos.get(0).getVersicherungszeiten().get(0).getDienstgebername());

	assertEquals(LocalDate.of(2019, 7, 1), btos.get(0).getVersicherungszeiten().get(1).getVonDatum());
	assertEquals(LocalDate.of(9999, 12, 31), btos.get(0).getVersicherungszeiten().get(1).getBisDatum());
	assertEquals("I5", btos.get(0).getVersicherungszeiten().get(1).getQualifikation());
	assertNull(btos.get(0).getVersicherungszeiten().get(1).getDienstgebername());

	assertEquals("06060237", btos.get(1).getHvbBeitragskontonummer());
	assertEquals("K", btos.get(1).getHvbBeitragskontonummerKennzeichen());
	assertEquals("12", btos.get(1).getMeldendeStelle());
	assertEquals(2, btos.get(1).getVersicherungszeiten().size());

	assertEquals(LocalDate.of(2019, 4, 1), btos.get(1).getVersicherungszeiten().get(0).getVonDatum());
	assertEquals(LocalDate.of(2019, 4, 30), btos.get(1).getVersicherungszeiten().get(0).getBisDatum());
	assertEquals("14", btos.get(1).getVersicherungszeiten().get(0).getQualifikation());
	assertNull(btos.get(1).getVersicherungszeiten().get(0).getDienstgebername());

	assertEquals(LocalDate.of(2019, 5, 1), btos.get(1).getVersicherungszeiten().get(1).getVonDatum());
	assertEquals(LocalDate.of(2019, 5, 31), btos.get(1).getVersicherungszeiten().get(1).getBisDatum());
	assertEquals("B1", btos.get(1).getVersicherungszeiten().get(1).getQualifikation());
	assertNull(btos.get(1).getVersicherungszeiten().get(1).getDienstgebername());
  }

  private void setupCustomFocusSteuerung() {
	FocusSteuerung focusSteuerung = em.find(FocusSteuerung.class, "VERSICHERUNG_BEENDET_ZEITRAUM_START");
	focusSteuerung.setWert(String.valueOf(getTimeDifference()));
  }

  private int getTimeDifference() {
	LocalDate dateNow  = LocalDate.now();
	LocalDate dateThen = LocalDate.of(2019, 4, 1);

	return (int) ChronoUnit.DAYS.between(dateThen, dateNow);
  }

  @Test
  void test_searchVersicherungsverhaeltnisseByFachschluessel_Vsnr_keineVerhaeltnisse() throws Exception {
	Fachschluessel                    fachschluessel = Fachschluessel.of("5473221199", "VSNR");
	List<VersicherungsverhaeltnisBTO> btos           = service.searchVersicherungsverhaeltnisseByFachschluessel(fachschluessel);
	assertEquals(0, btos.size());
  }
}
