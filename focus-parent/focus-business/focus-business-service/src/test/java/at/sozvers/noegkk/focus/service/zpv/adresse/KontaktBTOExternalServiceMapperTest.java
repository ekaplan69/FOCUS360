package at.sozvers.noegkk.focus.service.zpv.adresse;

import at.sozialversicherung.schema.zpv.ibs.adresszuordnungsuchen_10_0.*;
import at.sozvers.noegkk.focus.CdiExtension;
import at.sozvers.noegkk.focus.service.api.zpv.adresse.AdresseBTO.AdresseType;
import at.sozvers.noegkk.focus.service.api.zpv.adresse.KontaktEmailBTO;
import at.sozvers.noegkk.focus.service.api.zpv.adresse.KontaktTelefonBTO;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(CdiExtension.class)
class KontaktBTOExternalServiceMapperTest {

  @Inject
  private KontaktBTOExternalServiceMapper mapper;

  @Test
  void test_map_DtoTelefonSUO_DurchwahlNULL() {
	DtoTelefonSUO suo = new DtoTelefonSUO();
	suo.setVorwahl("01");
	suo.setTeilnehmerrufnummer("55555");
	suo.setDurchwahlnummer(null);

	KontaktTelefonBTO bto = (KontaktTelefonBTO) mapper.map(suo);

	assertNotNull(bto);

	assertEquals("01 55555", bto.getTelefonNummer());
	assertEquals(AdresseType.KONTAKT_TELEFON, bto.getType());
  }

  @Test
  void test_map_DtoTelefonSUO_mitDurchwahl() {
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
	DtoTelefonSUO suo = null;

	KontaktTelefonBTO bto = (KontaktTelefonBTO) mapper.map(suo);

	assertNull(bto);
  }

  @Test
  void test_map_andererDatentyp() {
	DtoAdresszuordnungAllgemeinSUO suo = new DtoAdresszuordnungAllgemeinSUO();

	KontaktTelefonBTO bto = (KontaktTelefonBTO) mapper.map(suo);

	assertNull(bto);
  }
}
