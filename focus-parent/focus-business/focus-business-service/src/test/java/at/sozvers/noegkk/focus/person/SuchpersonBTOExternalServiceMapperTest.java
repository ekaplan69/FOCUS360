package at.sozvers.noegkk.focus.person;

import javax.xml.datatype.DatatypeConfigurationException;
import java.math.BigInteger;
import at.sozialversicherung.schema.zpv.ibs.partnersuchen_14_0.*;
import at.sozvers.noegkk.focus.service.api.zpv.person.SuchpersonBTO;
import at.sozvers.noegkk.focus.service.common.DateUtil;
import at.sozvers.noegkk.focus.service.zpv.person.SuchpersonBTOExternalServiceMapper;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@ExtendWith(MockitoExtension.class)
public class SuchpersonBTOExternalServiceMapperTest {

  @Spy
  private SuchpersonBTOExternalServiceMapper mapper = new SuchpersonBTOExternalServiceMapper();

  @BeforeEach
  public void setUp() {
	MockitoAnnotations.initMocks(this);
  }

  @Test
  public void test_map_success() throws DatatypeConfigurationException {
	DtoPartnerSUO dtoPartnerSUO = new DtoPartnerSUO();

	DtoAnschriftStrasseKurz hauptanschrift = new DtoAnschriftStrasseKurz();
	hauptanschrift.setHausnummer("13");
	hauptanschrift.setStrasse("Lange Straße");
	hauptanschrift.setStockTuernummer("2/7");
	hauptanschrift.setPostleitzahl("6321");
	hauptanschrift.setOrt("Tschibuti");
	dtoPartnerSUO.getDtoAnschriftKurzListe().add(hauptanschrift);

	DtoPersonKurz        personKurz           = new DtoPersonKurz();
	DtoPersonDiakritisch dtoPersonDiakritisch = new DtoPersonDiakritisch();
	dtoPersonDiakritisch.setVornameDiakritisch("Baby");
	dtoPersonDiakritisch.setFamiliennameDiakritisch("Yoda");
	personKurz.setBestaetigtesGeburtsDAT(DateUtil.createXmlCalendar(1998, 7 - 1, 4));
	personKurz.setDtoPersonDiakritisch(dtoPersonDiakritisch);
	dtoPartnerSUO.setDtoPartnerKurz(personKurz);

	DtoPartnerrolleKurz partnerrolleKurz = new DtoPartnerrolleKurz();
	partnerrolleKurz.setFsPartnerrolle("1234567890");
	partnerrolleKurz.setParParrolleIDPartnerrolle(new BigInteger("1000000000000"));
	dtoPartnerSUO.getDtoPartnerrolleKurzListe().add(partnerrolleKurz);

	SuchpersonBTO bto = mapper.map(dtoPartnerSUO);

	assertNotNull(bto);

	assertEquals("6321", bto.getPlz());
	assertEquals("Baby", bto.getVorname());
	assertEquals("Yoda", bto.getNachname());
	assertEquals("1234567890", bto.getFachschluessel());
	assertEquals("1000000000000", bto.getPrid());
	assertEquals("Lange Straße 13/2/7", bto.getAdresse());
	assertEquals("Tschibuti", bto.getOrt());
	assertEquals(1998, bto.getGeburtsdatum().getYear());
	assertEquals(7, bto.getGeburtsdatum().getMonthValue());
	assertEquals(4, bto.getGeburtsdatum().getDayOfMonth());
  }
}
