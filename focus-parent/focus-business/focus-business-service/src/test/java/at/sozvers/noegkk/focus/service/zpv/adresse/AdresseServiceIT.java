package at.sozvers.noegkk.focus.service.zpv.adresse;

import java.util.List;
import at.sozvers.noegkk.focus.CdiExtension;
import at.sozvers.noegkk.focus.service.api.zpv.adresse.*;
import at.sozvers.noegkk.focus.service.common.Fachschluessel;
import at.sozvers.noegkk.focus.service.zpv.dienstgeber.DtoPartnerLeliFactory;
import at.sozvers.noegkk.focus.service.zpv.infrastructure.ZpvConstants;
import at.sozvers.noegkk.focus.service.zpv.person.*;
import jakarta.inject.Inject;
import org.assertj.core.api.SoftAssertions;
import org.jboss.weld.context.RequestContext;
import org.jboss.weld.context.unbound.Unbound;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(CdiExtension.class)
class AdresseServiceIT {
  @Inject
  private AdresseService adresseService;
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

  @BeforeEach
  void setUp() {
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

  @Test
  void test_searchByFachschluessel_Btnr_alleAdressen() throws Exception {

	Fachschluessel fachschluessel = Fachschluessel.of("0256211194", "BTNR");

	List<AdresseBTO> adresseList = adresseService.searchByFachschluessel(fachschluessel, ZpvConstants.GEBRAUCHART_PRIVA);

	assertEquals(5, adresseList.size());

	SoftAssertions softly = new SoftAssertions();
	softly.assertThat(adresseList.get(0).getType()).isEqualTo(AdresseBTO.AdresseType.ANSCHRIFT);
	AdresseAnschriftBTO anschrift = (AdresseAnschriftBTO) adresseList.get(0);
	softly.assertThat(anschrift.getAnschrift()).isEqualTo("Baron-Karl-Gasse 12/25/2");
	softly.assertThat(anschrift.getPlz()).isEqualTo("1100");
	softly.assertThat(anschrift.getOrt()).isEqualTo("Wien");

	softly.assertThat(adresseList.get(1).getType()).isEqualTo(AdresseBTO.AdresseType.KONTAKT_TELEFON);
	KontaktTelefonBTO telefon = (KontaktTelefonBTO) adresseList.get(1);
	softly.assertThat(telefon.getTelefonNummer()).isEqualTo("+43 664123456");

	softly.assertThat(adresseList.get(2).getType()).isEqualTo(AdresseBTO.AdresseType.KONTAKT_EMAIL);
	KontaktEmailBTO email = (KontaktEmailBTO) adresseList.get(2);
	softly.assertThat(email.getMailAdresse()).isEqualTo("lando.focustest@mail.at");

	softly.assertThat(adresseList.get(3).getType()).isEqualTo(AdresseBTO.AdresseType.GELDADRESSE);
	GeldadresseBTO geldadresse1 = (GeldadresseBTO) adresseList.get(3);
	softly.assertThat(geldadresse1.getBic()).isEqualTo("BKAUATWW");
	softly.assertThat(geldadresse1.getIban()).isEqualTo("AT521200000978031128");
	softly.assertThat(geldadresse1.getVerwendungsartKurz()).isEqualTo("HAUPT");

	softly.assertThat(adresseList.get(4).getType()).isEqualTo(AdresseBTO.AdresseType.GELDADRESSE);
	GeldadresseBTO geldadresse2 = (GeldadresseBTO) adresseList.get(4);
	softly.assertThat(geldadresse2.getBic()).isEqualTo("RLNWATWW");
	softly.assertThat(geldadresse2.getIban()).isEqualTo("AT923200000012371456");
	softly.assertThat(geldadresse2.getVerwendungsartKurz()).isEqualTo("WEITE");
	softly.assertAll();
  }

  @Test
  void test_searchByFachschluessel_Btnr_keineAdressen() throws Exception {

	Fachschluessel fachschluessel = Fachschluessel.of("0226231100", "BTNR");

	List<AdresseBTO> adresseList = adresseService.searchByFachschluessel(fachschluessel, ZpvConstants.GEBRAUCHART_PRIVA);

	assertEquals(0, adresseList.size());
  }

  @Test
  void test_searchByFachschluessel_Btnr_nichtVorhandeneBtnr() throws Exception {

	Fachschluessel fachschluessel = Fachschluessel.of("0123456789", "BTNR");

	List<AdresseBTO> adresseList = adresseService.searchByFachschluessel(fachschluessel, ZpvConstants.GEBRAUCHART_PRIVA);

	assertEquals(0, adresseList.size());
  }

  @Test
  void test_searchByFachschluessel_Vsnr_alleAdressen() throws Exception {

	Fachschluessel fachschluessel = Fachschluessel.of("5436211194", "VSNR");

	List<AdresseBTO> adresseList = adresseService.searchByFachschluessel(fachschluessel, ZpvConstants.GEBRAUCHART_PRIVA);

	assertEquals(5, adresseList.size());

	SoftAssertions softly = new SoftAssertions();
	softly.assertThat(adresseList.get(0).getType()).isEqualTo(AdresseBTO.AdresseType.ANSCHRIFT);
	AdresseAnschriftBTO anschrift = (AdresseAnschriftBTO) adresseList.get(0);
	softly.assertThat(anschrift.getAnschrift()).isEqualTo("Baron-Karl-Gasse 12/25/2");
	softly.assertThat(anschrift.getPlz()).isEqualTo("1100");
	softly.assertThat(anschrift.getOrt()).isEqualTo("Wien");

	softly.assertThat(adresseList.get(1).getType()).isEqualTo(AdresseBTO.AdresseType.KONTAKT_TELEFON);
	KontaktTelefonBTO telefon = (KontaktTelefonBTO) adresseList.get(1);
	softly.assertThat(telefon.getTelefonNummer()).isEqualTo("+43 664123456");

	softly.assertThat(adresseList.get(2).getType()).isEqualTo(AdresseBTO.AdresseType.KONTAKT_EMAIL);
	KontaktEmailBTO email = (KontaktEmailBTO) adresseList.get(2);
	softly.assertThat(email.getMailAdresse()).isEqualTo("luke.focustest@mail.at");

	softly.assertThat(adresseList.get(3).getType()).isEqualTo(AdresseBTO.AdresseType.GELDADRESSE);
	GeldadresseBTO geldadresse1 = (GeldadresseBTO) adresseList.get(3);
	softly.assertThat(geldadresse1.getBic()).isEqualTo("BKAUATWW");
	softly.assertThat(geldadresse1.getIban()).isEqualTo("AT521200000978031128");
	softly.assertThat(geldadresse1.getVerwendungsartKurz()).isEqualTo("HAUPT");

	softly.assertThat(adresseList.get(4).getType()).isEqualTo(AdresseBTO.AdresseType.GELDADRESSE);
	GeldadresseBTO geldadresse2 = (GeldadresseBTO) adresseList.get(4);
	softly.assertThat(geldadresse2.getBic()).isEqualTo("RLNWATWW");
	softly.assertThat(geldadresse2.getIban()).isEqualTo("AT923200000012371456");
	softly.assertThat(geldadresse2.getVerwendungsartKurz()).isEqualTo("WEITE");
	softly.assertAll();
  }

  @Test
  void test_searchByFachschluessel_Vsnr_keineAdressen() throws Exception {

	Fachschluessel fachschluessel = Fachschluessel.of("5473221199", "VSNR");

	List<AdresseBTO> adresseList = adresseService.searchByFachschluessel(fachschluessel, ZpvConstants.GEBRAUCHART_PRIVA);

	assertEquals(0, adresseList.size());
  }

  // Korrekte aber nicht existierende Vsnr um die Fehlermeldung zu testen
  @Test
  void test_searchByFachschluessel_Vsnr_nichtVorhandeneVsnr() throws Exception {

	Fachschluessel fachschluessel = Fachschluessel.of("9991010234", "VSNR");

	List<AdresseBTO> adresseList = adresseService.searchByFachschluessel(fachschluessel, ZpvConstants.GEBRAUCHART_PRIVA);

	assertEquals(0, adresseList.size());
  }
}
