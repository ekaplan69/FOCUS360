package at.sozvers.noegkk.focus.service.zpv.adresse;

import at.sozialversicherung.schema.zpv.ibs.adresszuordnungsuchen_10_0.*;
import at.sozvers.noegkk.focus.CdiExtension;
import at.sozvers.noegkk.focus.service.api.zpv.adresse.*;
import at.sozvers.noegkk.focus.service.api.zpv.adresse.AdresseBTO.AdresseType;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(CdiExtension.class)
class AdresseBTOExternalServiceMapperIT {

  @Inject
  private AdresseBTOExternalServiceMapper mapper;

  @Test
  void test_map_DtoAnschriftStrasseSUO() {
	DtoAnschriftStrasseSUO suo = new DtoAnschriftStrasseSUO();
	suo.setStrasse("Eine falsche Straße"); // Darf nicht herangezogen werden
	suo.setHausnummer("15/27/899"); // Darf nicht herangezogen werden
	suo.setPostleitzahl("3100");
	suo.setOrt("St. Pölten");
	DtoAnschriftszusammenfassung zusammenfassung = new DtoAnschriftszusammenfassung();
	zusammenfassung.setAnschriftszeile1("Kremser Landstraße 3");
	// Müssen ignoriert werden
	zusammenfassung.setAnschriftszeile2("Zeile 2 darf nicht drin sein");
	zusammenfassung.setAnschriftszeile3("Zeile 3 darf auch nicht drin sein");
	zusammenfassung.setAnschriftszeile4("Zeile 4 ebenso nicht");
	zusammenfassung.setAnschriftszeile5("Und Zeile 5 auch nicht");
	suo.setDtoAnschriftszusammenfassung(zusammenfassung);

	AdresseAnschriftBTO bto = (AdresseAnschriftBTO) mapper.map(suo);

	assertNotNull(bto);
	assertEquals("Kremser Landstraße 3", bto.getAnschrift());
	assertEquals("St. Pölten", bto.getOrt());
	assertEquals("3100", bto.getPlz());
	assertEquals(AdresseType.ANSCHRIFT, bto.getType());
  }

  @Test
  void test_map_DtoGeldadresseBankkontoSUO() {
	DtoGeldadresseBankkontoSUO suo = new DtoGeldadresseBankkontoSUO();
	suo.setVerwendungsartKurz("Test");
	suo.setVerwendungsart("Darf nicht verwendet werden"); // Darf nicht herangezogen werden
	suo.setInternationaleBankkontonummer("AT1234567890");
	suo.setBankIdentifikationsCode("XYZABCD");
	suo.setBankkontonummer("987654321"); // Darf nicht herangezogen werden
	suo.setBankleitzahl("12890"); // Darf nicht herangezogen werden

	GeldadresseBTO bto = (GeldadresseBTO) mapper.map(suo);

	assertNotNull(bto);
	assertEquals("Test", bto.getVerwendungsartKurz());
	assertEquals("AT1234567890", bto.getIban());
	assertEquals("XYZABCD", bto.getBic());
	assertEquals(AdresseType.GELDADRESSE, bto.getType());
  }

  @Test
  void test_map_DtoTelefonSUO() {
	DtoTelefonSUO suo = new DtoTelefonSUO();
	suo.setVorwahl("01");
	suo.setTeilnehmerrufnummer("55555");
	suo.setDurchwahlnummer("4711");

	KontaktTelefonBTO bto = (KontaktTelefonBTO) mapper.map(suo);

	assertNotNull(bto);
	assertEquals("01 55555 4711", bto.getTelefonNummer());
	assertEquals(AdresseType.KONTAKT_TELEFON, bto.getType());
  }

  @Test
  void test_map_DtoeMailSUO() {
	DtoeMailSUO suo = new DtoeMailSUO();
	suo.setEmail("test@noegkk.at");

	KontaktEmailBTO bto = (KontaktEmailBTO) mapper.map(suo);

	assertNotNull(bto);
	assertEquals("test@noegkk.at", bto.getMailAdresse());
	assertEquals(AdresseType.KONTAKT_EMAIL, bto.getType());
  }

  @Test
  void test_map_NULL() {
	DtoAdresszuordnungAllgemeinSUO suo = null;

	AdresseBTO bto = mapper.map(suo);

	assertNull(bto);
  }

  @Test
  void test_map_andererDatenTyp() {
	DtoAdresszuordnungAllgemeinSUO suo = new DtoAdresszuordnungAllgemeinSUO();

	AdresseBTO bto = mapper.map(suo);

	assertNull(bto);
  }
}
