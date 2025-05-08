package at.sozvers.noegkk.focus.service.zpv.infrastructure;

import java.math.BigInteger;
import at.sozialversicherung.schema.zpv.ibs.adresszuordnungsuchen_10_0.*;
import at.sozialversicherung.schema.zpv.ibs.partnerlesenkurz_15_0.*;
import at.sozialversicherung.schema.zpv.ibs.partnerlesenkurz_15_0.DtoPartnerrolleKurz;
import at.sozialversicherung.schema.zpv.ibs.partnerlesenkurz_15_0.DtoPersonKurz;
import at.sozialversicherung.schema.zpv.ibs.partnerlesenlang_20_0.DtoPartnerLELI;
import at.sozialversicherung.schema.zpv.ibs.partnerlesenlang_20_0.DtoPartnerLELO;
import at.sozialversicherung.schema.zpv.ibs.partnersuchen_14_0.DtoPartnerListeSUO;
import at.sozialversicherung.schema.zpv.ibs.partnersuchen_14_0.DtoPartnerSUI;
import at.sozvers.noegkk.focus.CdiExtension;
import at.sozvers.noegkk.focus.service.common.Fachschluessel;
import at.sozvers.noegkk.focus.service.zpv.adresse.DtoAdresszuordnungListeSUIFactory;
import at.sozvers.noegkk.focus.service.zpv.dienstgeber.DtoPartnerLeliFactory;
import at.sozvers.noegkk.focus.service.zpv.person.DtoPartnerListeLEKIFactory;
import at.sozvers.noegkk.focus.service.zpv.person.DtoPartnerSUIFactory;
import at.sozvers.noegkk.jsszpvbe2.action.ZPVServices;
import jakarta.inject.Inject;
import org.jboss.weld.context.RequestContext;
import org.jboss.weld.context.unbound.Unbound;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(CdiExtension.class)
class ZpvCallerIT {
  @Inject
  private ZpvCaller<DtoAdresszuordnungListeSUI, DtoAdresszuordnungListeSUO> adressZpvCaller;
  @Inject
  private ZpvCaller<DtoPartnerLELI, DtoPartnerLELO>                         dienstgeberZpvCaller;
  @Inject
  private DtoAdresszuordnungListeSUIFactory                                 dtoAdresszuordnungListeSUIFactory;
  @Inject
  private DtoPartnerLeliFactory                                             dtoPartnerLeliFactory;
  @Inject
  private DtoPartnerListeLEKIFactory                                        dtoPartnerListeLEKIFactory;
  @Inject
  private DtoPartnerSUIFactory                                              dtoPartnerSUIFactory;
  @Inject
  @Unbound
  private RequestContext                                                    requestContext;
  @Inject
  private ZpvCaller<DtoPartnerListeLEKI, DtoPartnerListeLEKO>               zpvCaller;
  @Inject
  @ZPVService
  private ZPVServices                                                       zpvServices;
  @Inject
  private ZpvCaller<DtoPartnerSUI, DtoPartnerListeSUO>                      zpvSucheCaller;

  @BeforeEach
  public void activateRequestContext() {
	if(requestContext.isActive()) {
	  requestContext.deactivate();
	}
	requestContext.activate();
  }

  @Test
  void test_searchAdresseWithVSNR() throws Exception {

	Fachschluessel fachschluessel = Fachschluessel.of("5436211194", "VSNR");

	DtoAdresszuordnungListeSUI dtoAdresszuordnungListeSUI = dtoAdresszuordnungListeSUIFactory.createDtoAdresszuordnungListeSUIWithFachschluessel((fachschluessel));
	dtoAdresszuordnungListeSUI.getDtoRequestHeader().getDtoQuellsystem().setQuellSystemSystemId("FOCUS360T");
	dtoAdresszuordnungListeSUI.getDtoRequestHeader().getDtoZielsystem().setZielSystemModus("V");
	dtoAdresszuordnungListeSUI.getDtoRequestHeader().getDtoKontextRQ().setPrimaerSystemId("ZPVMIG21");
	dtoAdresszuordnungListeSUI.getDtoRequestHeader().getDtoQuellsystem().setQuellSystemSystemId("FOCUS360T");
	dtoAdresszuordnungListeSUI.getDtoRequestHeader().getDtoKontextRQ().getDtoBearbeiter().setBerechtigungsSystemId("BEREZT");

	DtoAdresszuordnungListeSUO adresszuordnungListeSUOList = adressZpvCaller.call(zpvServices::adresszuordnungSuchen_10_0, dtoAdresszuordnungListeSUI);

	assertNotNull(adresszuordnungListeSUOList);
	assertEquals("J", adresszuordnungListeSUOList.getFehlerpaket().getIstOk());
	assertEquals(0, adresszuordnungListeSUOList.getFehlerpaket().getMeldungen().size());

	DtoAdresszuordnungPartnerListeSUO adrzuoPartnerListe = adresszuordnungListeSUOList.getDtoAdresszuordnungPartnerListeSUOListe().get(0);
	assertEquals("J", adrzuoPartnerListe.getZusatzFehlerpaket().getIstOk());
	assertEquals(0, adrzuoPartnerListe.getZusatzFehlerpaket().getMeldungen().size());
	assertEquals(BigInteger.valueOf(16330551L), adrzuoPartnerListe.getDtoPartnerKurz().getParParrolleIDPartner());
	assertEquals("PERS", adrzuoPartnerListe.getDtoPartnerKurz().getPartnerartKurz());
	assertEquals("N", adrzuoPartnerListe.getDtoPartnerKurz().getStornoJN());
	assertEquals("N", adrzuoPartnerListe.getDtoPartnerKurz().getSvbPKAktuellJN());

	DtoAnschriftStrasseSUO anschrift = (DtoAnschriftStrasseSUO) adrzuoPartnerListe.getDtoAdresszuordnungAllgemeinSUOListe().get(0);
	assertEquals(BigInteger.valueOf(16819710L), anschrift.getAdresseAevNummer());
	assertEquals("Anschrift", anschrift.getAdresstyp());
	assertEquals("ANSCH", anschrift.getAdresstypKurz());
	assertEquals("1100", anschrift.getPostleitzahl());
	assertEquals("Wien", anschrift.getOrt());
	assertEquals("AUT", anschrift.getStaatIsoA3());
	assertEquals("Baron-Karl-Gasse", anschrift.getStrasse());
	assertEquals("25/2", anschrift.getStockTuernummer());
	assertEquals("Hauptadresse", anschrift.getVerwendungsart());
	assertEquals("HAUPT", anschrift.getVerwendungsartKurz());

	DtoGeldadresseBankkontoSUO geldadresse1 = (DtoGeldadresseBankkontoSUO) adrzuoPartnerListe.getDtoAdresszuordnungAllgemeinSUOListe().get(1);
	assertEquals(BigInteger.valueOf(16819713L), geldadresse1.getAdresseAevNummer());
	assertEquals("Geldadresse", geldadresse1.getAdresstyp());
	assertEquals("GELDA", geldadresse1.getAdresstypKurz());
	assertEquals("BKAUATWW", geldadresse1.getBankIdentifikationsCode());
	assertEquals("UniCredit Bank Austria AG", geldadresse1.getBankinstitut());
	assertEquals("12000", geldadresse1.getBankleitzahl());
	assertEquals("privat", geldadresse1.getGebrauch());
	assertEquals("Geldadresse-Bankkonto", geldadresse1.getGeldadresstyp());
	assertEquals("GABKT", geldadresse1.getGeldadresstypKurz());
	assertEquals("AT521200000978031128", geldadresse1.getInternationaleBankkontonummer());
	assertEquals("AUT", geldadresse1.getStaatIsoA3());
	assertEquals("Hauptadresse", geldadresse1.getVerwendungsart());
	assertEquals("HAUPT", geldadresse1.getVerwendungsartKurz());

	DtoGeldadresseBankkontoSUO geldadresse2 = (DtoGeldadresseBankkontoSUO) adrzuoPartnerListe.getDtoAdresszuordnungAllgemeinSUOListe().get(2);
	assertEquals(BigInteger.valueOf(16819714L), geldadresse2.getAdresseAevNummer());
	assertEquals("Geldadresse", geldadresse2.getAdresstyp());
	assertEquals("GELDA", geldadresse2.getAdresstypKurz());
	assertEquals("RLNWATWW", geldadresse2.getBankIdentifikationsCode());
	assertEquals("RAIFFEISENLANDESBANK NIEDERÖSTERREICH-WIEN AG", geldadresse2.getBankinstitut());
	assertEquals("32000", geldadresse2.getBankleitzahl());
	assertEquals("privat", geldadresse2.getGebrauch());
	assertEquals("Geldadresse-Bankkonto", geldadresse2.getGeldadresstyp());
	assertEquals("GABKT", geldadresse2.getGeldadresstypKurz());
	assertEquals("AT923200000012371456", geldadresse2.getInternationaleBankkontonummer());
	assertEquals("AUT", geldadresse2.getStaatIsoA3());
	assertEquals("weitere Adresse", geldadresse2.getVerwendungsart());
	assertEquals("WEITE", geldadresse2.getVerwendungsartKurz());

	DtoTelefonSUO telefon = (DtoTelefonSUO) adrzuoPartnerListe.getDtoAdresszuordnungAllgemeinSUOListe().get(3);
	assertEquals(BigInteger.valueOf(16819716L), telefon.getAdresseAevNummer());
	assertEquals("Telefon", telefon.getAdresstyp());
	assertEquals("TELE", telefon.getAdresstypKurz());
	assertEquals("privat", telefon.getGebrauch());
	assertEquals("AT", telefon.getLandeskennzahl());
	assertEquals("664123456", telefon.getTeilnehmerrufnummer());
	assertEquals("Kontaktadresse", telefon.getVerwendungsart());
	assertEquals("KONTA", telefon.getVerwendungsartKurz());
	assertEquals("+43", telefon.getVorwahl());

	DtoeMailSUO mail = (DtoeMailSUO) adrzuoPartnerListe.getDtoAdresszuordnungAllgemeinSUOListe().get(4);
	assertEquals(BigInteger.valueOf(16819712L), mail.getAdresseAevNummer());
	assertEquals("E-Mail", mail.getAdresstyp());
	assertEquals("EMAIL", mail.getAdresstypKurz());
	assertEquals("luke.focustest@mail.at", mail.getEmail());
	assertEquals("privat", mail.getGebrauch());
	assertEquals("Kontaktadresse", mail.getVerwendungsart());
	assertEquals("KONTA", mail.getVerwendungsartKurz());
  }

  @Test
  void test_searchByFachschluessel_ungueltig() {

	Fachschluessel fachschluessel = Fachschluessel.of("098765432", "DGNR");

	DtoPartnerLELI input = dtoPartnerLeliFactory.createDtoPartnerLeli(fachschluessel);

	input.getDtoRequestHeader().getDtoQuellsystem().setQuellSystemSystemId("FOCUS360T");

	input.getDtoRequestHeader().getDtoKontextRQ().getDtoBearbeiter().setBerechtigungsSystemId("BEREZT");
	input.getDtoRequestHeader().getDtoKontextRQ().setPrimaerSystemId("ZPVMIG21");
	input.getDtoRequestHeader().getDtoZielsystem().setZielSystemModus("V");

	DtoPartnerLELO dtoPartnerLELO = null;
	try {
	  dtoPartnerLELO = dienstgeberZpvCaller.call(zpvServices::partnerLesenLang_20_0, input, true);
	} catch(Exception e) {
	  e.printStackTrace();
	}

	assertNotNull(dtoPartnerLELO);
  }

  @Test
  void test_searchDienstgeber() {
	DtoPartnerSUI dtoPartnerSUI = dtoPartnerSUIFactory.createDtoPartnerSuiOrg("Österreichische Gesundheitskasse", "3100");

	try {
	  zpvSucheCaller.call(zpvServices::partnerSuchen_14_0, dtoPartnerSUI, true);
	} catch(Exception e) {
	  e.printStackTrace();
	}

	assertNotNull(dtoPartnerListeLEKIFactory);
  }

  @Test
  void test_searchPartnerLang() {

	Fachschluessel fachschluessel = Fachschluessel.of("600134404", "DGNR");

	DtoPartnerLELI input = dtoPartnerLeliFactory.createDtoPartnerLeli(fachschluessel);

	input.getDtoRequestHeader().getDtoQuellsystem().setQuellSystemSystemId("FOCUS360T");

	input.getDtoRequestHeader().getDtoKontextRQ().getDtoBearbeiter().setBerechtigungsSystemId("BEREZT");
	input.getDtoRequestHeader().getDtoKontextRQ().setPrimaerSystemId("ZPVMIG21");
	input.getDtoRequestHeader().getDtoZielsystem().setZielSystemModus("V");

	DtoPartnerLELO dtoPartnerLELO = null;
	try {
	  dtoPartnerLELO = dienstgeberZpvCaller.call(zpvServices::partnerLesenLang_20_0, input, true);
	} catch(Exception e) {
	  e.printStackTrace();
	}

	assertNotNull(dtoPartnerLELO);
  }

  @Test
  void test_searchPartnerWithVSNR() throws Exception {

	Fachschluessel fachschluessel = Fachschluessel.of("5473221199", "VSNR");

	DtoPartnerListeLEKI inputList = dtoPartnerListeLEKIFactory.createDtoPartnerListeLEKIWithFachschluessel(fachschluessel);
	inputList.getDtoRequestHeader().getDtoQuellsystem().setQuellSystemSystemId("FOCUS360T");
	inputList.getDtoRequestHeader().getDtoZielsystem().setZielSystemModus("V");
	inputList.getDtoRequestHeader().getDtoKontextRQ().setPrimaerSystemId("ZPVMIG21");
	inputList.getDtoRequestHeader().getDtoQuellsystem().setQuellSystemSystemId("FOCUS360T");
	inputList.getDtoRequestHeader().getDtoKontextRQ().getDtoBearbeiter().setBerechtigungsSystemId("BEREZT");

	DtoPartnerListeLEKO partnerList = zpvCaller.call(zpvServices::partnerLesenKurz_15_0, inputList);

	assertNotNull(partnerList);
	assertEquals(1, partnerList.getDtoPartnerLEKOListe().size());

	assertEquals("J", partnerList.getFehlerpaket().getIstOk());
	assertEquals(0, partnerList.getFehlerpaket().getMeldungen().size());

	DtoPartnerLEKO partnerLEKO = partnerList.getDtoPartnerLEKOListe().get(0);
	assertNull(partnerLEKO.getDtoAnschriftKurz());
	assertNull(partnerLEKO.getDtoBeitragskonto());
	assertNull(partnerLEKO.getDtoGeldadresseKurz());
	assertNull(partnerLEKO.getDtoPartnerVPNRKurz());
	assertEquals("J", partnerLEKO.getZusatzFehlerpaket().getIstOk());

	DtoPersonKurz personKurz = (DtoPersonKurz) partnerLEKO.getDtoPartnerKurz();
	assertEquals(1999, personKurz.getBestaetigtesGeburtsDAT().getYear());
	assertEquals(11, personKurz.getBestaetigtesGeburtsDAT().getMonth());
	assertEquals(22, personKurz.getBestaetigtesGeburtsDAT().getDay());
	assertNull(personKurz.getBestaetigtesTodesDAT());
	assertNull(personKurz.getBkAmtlichesGeburtsdatum());
	assertNull(personKurz.getBkUnbestaetigtesGeburtsdatum());
	assertEquals(0, personKurz.getDtoAuskunftssperreKurzListe().size());
	assertEquals(0, personKurz.getDtoEinzelunternehmerschaftKurzListe().size());
	assertEquals("Frau", personKurz.getDtoNamenszusammenfassungDiakritisch().getNamenzeileDiakritisch1());
	assertEquals("Leia FOCUSTEST", personKurz.getDtoNamenszusammenfassungDiakritisch().getNamenzeileDiakritisch2());
	assertNotNull(personKurz.getDtoPersonDiakritisch());
	assertEquals("FOCUSTEST", personKurz.getFamilienname());
	assertNull(personKurz.getFamilienstandKurz());
	assertEquals("weiblich", personKurz.getGeschlecht());
	assertEquals("W", personKurz.getGeschlechtKZ());
	assertEquals("AUT", personKurz.getIsoA3Staatsbuergerschaft());
	assertNull(personKurz.getNamensergaenzung());
	assertNull(personKurz.getNamensergaenzungKZ());
	assertEquals(BigInteger.valueOf(16330552L), personKurz.getParParrolleIDPartner());
	assertEquals("PERS", personKurz.getPartnerartKurz());
	assertEquals("Person ohne Zusatzdaten", personKurz.getPersonenart());
	assertEquals("PEROZ", personKurz.getPersonenartKurz());
	assertEquals("N", personKurz.getStornoJN());
	assertEquals("N", personKurz.getSvbPKAktuellJN());
	assertNull(personKurz.getTitelHinten());
	assertNull(personKurz.getTitelHintenKurz());
	assertNull(personKurz.getTitelVorne());
	assertNull(personKurz.getTitelVorneKurz());
	assertNull(personKurz.getUnbestaetigtesTodesDAT());
	assertEquals("Leia", personKurz.getVorname());

	DtoPartnerrolleKurz rolleKurz = partnerLEKO.getDtoPartnerrolleKurz();
	assertNull(rolleKurz.getBkGueltigkeitszeitraum().getGueltigVonDAT());
	assertNull(rolleKurz.getBkGueltigkeitszeitraum().getGueltigBisDAT());
	assertNull(rolleKurz.getDtoAnschriftKurz());
	assertNull(rolleKurz.getDtoGeldadresseKurz());
	assertEquals("VSNR", rolleKurz.getFachschluesselartKurzbez());
	assertEquals("5473221199", rolleKurz.getFsPartnerrolle());
	assertEquals(BigInteger.valueOf(5016640617L), rolleKurz.getParParrolleIDPartnerrolle());
	assertEquals("Versicherter", rolleKurz.getPartnerrollenart());
	assertEquals("VS", rolleKurz.getPartnerrollenartKurz());
	assertEquals("N", rolleKurz.getStornoJN());
  }
}
