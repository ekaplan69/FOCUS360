package at.sozvers.noegkk.focus.person;

import java.math.BigInteger;
import java.time.LocalDate;
import java.util.List;
import at.sozvers.noegkk.focus.CdiExtension;
import at.sozvers.noegkk.focus.service.api.zpv.person.*;
import at.sozvers.noegkk.focus.service.common.Fachschluessel;
import at.sozvers.noegkk.focus.service.zpv.adresse.DtoAdresszuordnungListeSUIFactory;
import at.sozvers.noegkk.focus.service.zpv.dienstgeber.DtoPartnerLeliFactory;
import at.sozvers.noegkk.focus.service.zpv.person.*;
import jakarta.inject.Inject;
import org.jboss.weld.context.RequestContext;
import org.jboss.weld.context.unbound.Unbound;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(CdiExtension.class)
class PersonServiceIT {
  @Inject
  @Unbound
  private RequestContext requestContext;
  @Inject
  private PersonService  service;

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

	DtoPartnerLELIFactory.BERECHTIGUNGS_SYSTEM_ID = "BEREZT";
	DtoPartnerLELIFactory.QUELL_SYSTEM_ID = "FOCUS360T";
	DtoPartnerLELIFactory.VERARBEITUNGS_MODUS = "O";
	DtoPartnerLELIFactory.ZIEL_SYSTEM_MODUS = "V";
	DtoPartnerLELIFactory.PRIMAER_SYSTEM_ID = "ZPVMIG21";

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

	DTOCLKLinkINIFactory.BERECHTIGUNGS_SYSTEM_ID = "BEREZT";
	DTOCLKLinkINIFactory.QUELL_SYSTEM_ID = "FOCUS360T";
	DTOCLKLinkINIFactory.VERARBEITUNGS_MODUS = "O";
	DTOCLKLinkINIFactory.ZIEL_SYSTEM_MODUS = "V";
	DTOCLKLinkINIFactory.PRIMAER_SYSTEM_ID = "ZPVMIG21";
  }

  @BeforeEach
  public void activateRequestContext() {
	if(requestContext.isActive()) {
	  requestContext.deactivate();
	}
	requestContext.activate();
  }

  @Test
  void test_PersonService_searchByFachschluessel_201443000() throws Exception {
	Fachschluessel zpvFachschluessel = Fachschluessel.of("201443000", "DGNR");
	assertThat(service.searchByFachschluessel(zpvFachschluessel)).isNotNull();
  }

  @Test
  void test_PersonService_searchByFachschluessel_5436211194() throws Exception {
	Fachschluessel zpvFachschluessel = Fachschluessel.of("5436211194", "VSNR");
	assertThat(service.searchByFachschluessel(zpvFachschluessel)).isNotNull();
  }

  @Test
  void test_initLink() throws Exception {
	ClkTokenBTO bto = service.initLinkClientCoopNew("16330552");

	assertThat(bto).isNotNull();
  }

  @Test
  void test_searchByFachschluessel_Btnr_Auskunftssperre() throws Exception {
	Fachschluessel fachschluessel = Fachschluessel.of("0256211194", "BTNR");
	StammdatenBTO  stammdaten     = service.searchByFachschluessel(fachschluessel);

	assertThat(stammdaten).isNotNull();

	assertEquals(LocalDate.of(1994, 11, 21), stammdaten.getGeburtsDatum());
	assertEquals("M", stammdaten.getGeschlecht());
	assertEquals("Herr Dr. Lando FOCUSTEST BSc", stammdaten.getName());
	assertNull(stammdaten.getPartnerVersicherterRolleId());
	assertNull(stammdaten.getKontaktEmail());
	assertNull(stammdaten.getKontaktTelefon());
	assertNull(stammdaten.getAdresse());
	assertEquals(0, stammdaten.getGeldAdressen().size());
	assertEquals(2, stammdaten.getAuskunftsSperreGruende().size());
	assertEquals("Auskunftssperre Grund 1", stammdaten.getAuskunftsSperreGruende().get(0));
	assertNull(stammdaten.getAuskunftsSperreGruende().get(1));
	assertTrue(stammdaten.isAuskunftsSperre());
	assertTrue(stammdaten.isGesetzlichVertreten());
	assertFalse(stammdaten.isZustimmungSuen());
  }

  @Test
  void test_searchByFachschluessel_Btnr_NameGeschlechtGeburtsDatum() throws Exception {
	Fachschluessel fachschluessel = Fachschluessel.of("0226231100", "BTNR");
	StammdatenBTO  stammdaten     = service.searchByFachschluessel(fachschluessel);

	assertThat(stammdaten).isNotNull();

	assertEquals(LocalDate.of(2000, 11, 23), stammdaten.getGeburtsDatum());
	assertEquals("M", stammdaten.getGeschlecht());
	assertEquals("Herr Ben FOCUSTEST", stammdaten.getName());
	assertNull(stammdaten.getPartnerVersicherterRolleId());
	assertNull(stammdaten.getKontaktEmail());
	assertNull(stammdaten.getKontaktTelefon());
	assertNull(stammdaten.getAdresse());
	assertEquals(0, stammdaten.getGeldAdressen().size());
	assertEquals(0, stammdaten.getAuskunftsSperreGruende().size());
	assertFalse(stammdaten.isAuskunftsSperre());
	assertFalse(stammdaten.isGesetzlichVertreten());
	assertFalse(stammdaten.isZustimmungSuen());
  }

  @Test
  void test_searchByFachschluessel_NichtExistenteBtnr() throws Exception {
	Fachschluessel fachschluessel = Fachschluessel.of("0123456789", "BTNR");
	StammdatenBTO  stammdaten     = service.searchByFachschluessel(fachschluessel);
	assertNull(stammdaten);
  }

  @Test
  void test_searchByFachschluessel_Vsnr_maennlichAuskunftssperre() throws Exception {
	Fachschluessel fachschluessel = Fachschluessel.of("5436211194", "VSNR");
	StammdatenBTO  stammdaten     = service.searchByFachschluessel(fachschluessel);

	assertThat(stammdaten).isNotNull();
	assertEquals(LocalDate.of(1994, 11, 21), stammdaten.getGeburtsDatum());
	assertEquals("M", stammdaten.getGeschlecht());
	assertEquals("Herr Dr. Luke FOCUSTEST BSc", stammdaten.getName());
	assertEquals(BigInteger.valueOf(16330551L), stammdaten.getPartnerVersicherterRolleId());
	assertNull(stammdaten.getKontaktEmail());
	assertNull(stammdaten.getKontaktTelefon());
	assertNull(stammdaten.getAdresse());
	assertEquals(0, stammdaten.getGeldAdressen().size());
	assertEquals(2, stammdaten.getAuskunftsSperreGruende().size());
	assertEquals("Auskunftssperre Grund 1", stammdaten.getAuskunftsSperreGruende().get(0));
	assertNull(stammdaten.getAuskunftsSperreGruende().get(1));
	assertTrue(stammdaten.isAuskunftsSperre());
	assertTrue(stammdaten.isGesetzlichVertreten());
	assertFalse(stammdaten.isZustimmungSuen());
  }

  @Test
  void test_searchByFachschluessel_Vsnr_weiblichNameGeburtsdatum() throws Exception {
	Fachschluessel fachschluessel = Fachschluessel.of("5473221199", "VSNR");
	StammdatenBTO  stammdaten     = service.searchByFachschluessel(fachschluessel);

	assertThat(stammdaten).isNotNull();

	assertEquals(LocalDate.of(1999, 11, 22), stammdaten.getGeburtsDatum());
	assertEquals("W", stammdaten.getGeschlecht());
	assertEquals("Frau Leia FOCUSTEST", stammdaten.getName());
	assertEquals(BigInteger.valueOf(16330552L), stammdaten.getPartnerVersicherterRolleId());
	assertNull(stammdaten.getKontaktEmail());
	assertNull(stammdaten.getKontaktTelefon());
	assertNull(stammdaten.getAdresse());
	assertEquals(0, stammdaten.getGeldAdressen().size());
	assertEquals(0, stammdaten.getAuskunftsSperreGruende().size());
	assertFalse(stammdaten.isAuskunftsSperre());
	assertFalse(stammdaten.isGesetzlichVertreten());
	assertFalse(stammdaten.isZustimmungSuen());
  }

  @Test
  void test_searchByPartnerNameOrg() throws Exception {
	List<SuchpersonBTO> orgListe = service.searchByPartnername("Österreichische Gesundheitskasse", "3100");

	assertThat(orgListe).hasSizeGreaterThan(0);
  }

  @Test
  void test_searchByPartnername_allesGesetzt() throws Exception {
	List<SuchpersonBTO> personenListe = service.searchByPartnername("Andre", "Winterberg", "3100", "04.07.1998");

	SuchpersonBTO person = personenListe.get(0);

	assertThat(personenListe).isNotNull().isNotEmpty();

	assertThat(person).isNotNull();
	assertEquals("Andre", person.getVorname());
	assertEquals("Winterberg", person.getNachname());
	assertEquals(4, person.getGeburtsdatum().getDayOfMonth());
	assertEquals(7, person.getGeburtsdatum().getMonthValue());
	assertEquals(1998, person.getGeburtsdatum().getYear());
	assertEquals("3100", person.getPlz());
	assertEquals("Klostergasse 33/1/5", person.getAdresse());
	assertEquals("5012206792", person.getPrid());
	assertEquals("4910040798", person.getFachschluessel());
  }

  @Test
  void test_searchByPartnername_null() throws Exception {
	List<SuchpersonBTO> personenListe = service.searchByPartnername(null, null, null, null);

	assertEquals(0, personenListe.size());
  }

  @Test
  void test_searchEinzelunternehmer() throws Exception {
	List<SuchpersonBTO> list = service.searchByPartnername("Silvia", "Rupp", "3380", "21.07.1964");

	assertThat(list).hasSizeGreaterThan(1);
  }
}
