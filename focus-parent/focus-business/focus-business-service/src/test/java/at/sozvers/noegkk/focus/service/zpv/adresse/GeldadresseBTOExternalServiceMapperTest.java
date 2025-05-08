package at.sozvers.noegkk.focus.service.zpv.adresse;

import at.sozialversicherung.schema.zpv.ibs.adresszuordnungsuchen_10_0.DtoGeldadresseBankkontoSUO;
import at.sozvers.noegkk.focus.service.api.zpv.adresse.AdresseBTO.AdresseType;
import at.sozvers.noegkk.focus.service.api.zpv.adresse.GeldadresseBTO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GeldadresseBTOExternalServiceMapperTest {

  private GeldadresseBTOExternalServiceMapper mapper;

  @BeforeEach
  void setUp() {
	mapper = new GeldadresseBTOExternalServiceMapper();
  }

  @Test
  void test_map_NULL() {
	DtoGeldadresseBankkontoSUO suo = null;

	GeldadresseBTO bto = mapper.map(suo);

	assertNull(bto);
  }

  @Test
  void test_map_mitWerten() {
	DtoGeldadresseBankkontoSUO suo = new DtoGeldadresseBankkontoSUO();
	suo.setVerwendungsartKurz("Test");
	suo.setVerwendungsart("Darf nicht verwendet werden"); // Darf nicht herangezogen werden
	suo.setInternationaleBankkontonummer("AT1234567890");
	suo.setBankIdentifikationsCode("XYZABCD");
	suo.setBankkontonummer("987654321"); // Darf nicht herangezogen werden
	suo.setBankleitzahl("12890"); // Darf nicht herangezogen werden

	GeldadresseBTO bto = mapper.map(suo);

	assertNotNull(bto);
	assertEquals("Test", bto.getVerwendungsartKurz());
	assertEquals("AT1234567890", bto.getIban());
	assertEquals("XYZABCD", bto.getBic());
	assertEquals(AdresseType.GELDADRESSE, bto.getType());
  }
}
