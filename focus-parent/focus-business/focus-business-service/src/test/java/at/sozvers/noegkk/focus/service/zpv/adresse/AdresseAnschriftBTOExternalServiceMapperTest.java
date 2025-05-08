package at.sozvers.noegkk.focus.service.zpv.adresse;

import at.sozialversicherung.schema.zpv.ibs.adresszuordnungsuchen_10_0.DtoAnschriftStrasseSUO;
import at.sozialversicherung.schema.zpv.ibs.adresszuordnungsuchen_10_0.DtoAnschriftszusammenfassung;
import at.sozvers.noegkk.focus.service.api.zpv.adresse.AdresseAnschriftBTO;
import at.sozvers.noegkk.focus.service.api.zpv.adresse.AdresseBTO.AdresseType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static junit.framework.TestCase.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class AdresseAnschriftBTOExternalServiceMapperTest {

  private AdresseAnschriftBTOExternalServiceMapper mapper;

  @BeforeEach
  void setUp() {
	mapper = new AdresseAnschriftBTOExternalServiceMapper();
  }

  @Test
  void test_map_NULL() {
	DtoAnschriftStrasseSUO anschriftSUO = null;
	AdresseAnschriftBTO    anschriftBTO = (AdresseAnschriftBTO) mapper.map(anschriftSUO);

	assertNull(anschriftBTO);
  }

  @Test
  void test_map_mitWerten() {
	DtoAnschriftStrasseSUO anschriftSUO = new DtoAnschriftStrasseSUO();
	anschriftSUO.setStrasse("Eine falsche Straße"); // Darf nicht herangezogen werden
	anschriftSUO.setHausnummer("15/27/899"); // Darf nicht herangezogen werden
	anschriftSUO.setPostleitzahl("3100");
	anschriftSUO.setOrt("St. Pölten");
	DtoAnschriftszusammenfassung zusammenfassung = new DtoAnschriftszusammenfassung();
	zusammenfassung.setAnschriftszeile1("Kremser Landstraße 3");
	// Müssen ignoriert werden
	zusammenfassung.setAnschriftszeile2("Zeile 2 darf nicht drin sein");
	zusammenfassung.setAnschriftszeile3("Zeile 3 darf auch nicht drin sein");
	zusammenfassung.setAnschriftszeile4("Zeile 4 ebenso nicht");
	zusammenfassung.setAnschriftszeile5("Und Zeile 5 auch nicht");
	anschriftSUO.setDtoAnschriftszusammenfassung(zusammenfassung);

	AdresseAnschriftBTO anschriftBTO = (AdresseAnschriftBTO) mapper.map(anschriftSUO);

	assertNotNull(anschriftBTO);
	assertEquals("Kremser Landstraße 3", anschriftBTO.getAnschrift());
	assertEquals("St. Pölten", anschriftBTO.getOrt());
	assertEquals("3100", anschriftBTO.getPlz());
	assertEquals(AdresseType.ANSCHRIFT, anschriftBTO.getType());
  }
}
