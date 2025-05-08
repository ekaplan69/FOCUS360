package at.sozvers.noegkk.focus.service.zpv.adresse;

import at.sozialversicherung.schema.zpv.ibs.adresszuordnungsuchen_10_0.*;
import at.sozvers.noegkk.focus.service.api.zpv.adresse.*;
import at.sozvers.noegkk.focus.service.api.zpv.adresse.AdresseBTO.AdresseType;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class AdresseBTOExternalServiceMapperTest {

  @InjectMocks
  private AdresseBTOExternalServiceMapper          mapper;
  @Mock
  private AdresseAnschriftBTOExternalServiceMapper mockedAdresseAnschriftMapper;
  @Mock
  private GeldadresseBTOExternalServiceMapper      mockedGeldadresseMapper;
  @Mock
  private KontaktBTOExternalServiceMapper          mockedKontaktMapper;

  @Test
  void test_map_DtoAnschriftStrasseSUO() {
	DtoAnschriftStrasseSUO suo     = new DtoAnschriftStrasseSUO();
	AdresseAnschriftBTO    adresse = new AdresseAnschriftBTO();
	adresse.setAnschrift("Kremser Landstraße 3");
	adresse.setPlz("3100");
	adresse.setOrt("St. Pölten");
	Mockito.when(mockedAdresseAnschriftMapper.map(suo)).thenReturn(adresse);

	AdresseAnschriftBTO bto = (AdresseAnschriftBTO) mapper.map(suo);

	assertNotNull(bto);
	assertEquals("Kremser Landstraße 3", bto.getAnschrift());
	assertEquals("St. Pölten", bto.getOrt());
	assertEquals("3100", bto.getPlz());
	assertEquals(AdresseType.ANSCHRIFT, bto.getType());
  }

  @Test
  void test_map_DtoGeldadresseBankkontoSUO() {
	DtoGeldadresseBankkontoSUO suo         = new DtoGeldadresseBankkontoSUO();
	GeldadresseBTO             geldadresse = new GeldadresseBTO();
	geldadresse.setVerwendungsartKurz("Test");
	geldadresse.setIban("AT1234567890");
	geldadresse.setBic("XYZABCD");
	Mockito.when(mockedGeldadresseMapper.map(suo)).thenReturn(geldadresse);

	GeldadresseBTO bto = (GeldadresseBTO) mapper.map(suo);

	assertNotNull(bto);
	assertEquals("Test", bto.getVerwendungsartKurz());
	assertEquals("AT1234567890", bto.getIban());
	assertEquals("XYZABCD", bto.getBic());
	assertEquals(AdresseType.GELDADRESSE, bto.getType());
  }

  @Test
  void test_map_DtoTelefonSUO() {
	DtoTelefonSUO     suo     = new DtoTelefonSUO();
	KontaktTelefonBTO kontakt = new KontaktTelefonBTO();
	kontakt.setTelefonNummer("01 55555 4711");
	Mockito.when(mockedKontaktMapper.map(suo)).thenReturn(kontakt);

	KontaktTelefonBTO bto = (KontaktTelefonBTO) mapper.map(suo);

	assertNotNull(bto);
	assertEquals("01 55555 4711", bto.getTelefonNummer());
	assertEquals(AdresseType.KONTAKT_TELEFON, bto.getType());
  }

  @Test
  void test_map_DtoeMailSUO() {
	DtoeMailSUO     suo   = new DtoeMailSUO();
	KontaktEmailBTO email = new KontaktEmailBTO();
	email.setMailAdresse("test@noegkk.at");
	Mockito.when(mockedKontaktMapper.map(suo)).thenReturn(email);

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
