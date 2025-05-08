package at.sozvers.noegkk.focus.service.zvd.versicherungszeit;

import javax.xml.datatype.*;
import java.time.LocalDate;
import java.util.GregorianCalendar;
import at.sozvers.noegkk.focus.service.api.zvd.VersicherungszeitBTO;
import at.sozvers.zvd.ws.versicherungsverhaeltnisselesenservice.v3.types.Versicherungszeit;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VersicherungszeitBTOExternalServiceMapperTest {

  private VersicherungszeitBTOExternalServiceMapper mapper;

  @BeforeEach
  public void setUp() {
	mapper = new VersicherungszeitBTOExternalServiceMapper();
  }

  @Test
  void test_map_versicherungszeit_allesGesetzt() throws DatatypeConfigurationException {
	Versicherungszeit versicherungszeit = new Versicherungszeit();
	versicherungszeit.setVonDatum(createXmlCalendar(2019, 8, 20));
	versicherungszeit.setBisDatum(createXmlCalendar(2019, 10, 29));
	versicherungszeit.setQualifikation("QUALIFIKATION");

	VersicherungszeitBTO bto = mapper.map(versicherungszeit);

	assertNotNull(bto);
	assertEquals(LocalDate.of(2019, 8, 20), bto.getVonDatum());
	assertEquals(LocalDate.of(2019, 10, 29), bto.getBisDatum());
	assertEquals("QUALIFIKATION", bto.getQualifikation());
  }

  private XMLGregorianCalendar createXmlCalendar(int year, int month, int day) throws DatatypeConfigurationException {
	return DatatypeFactory.newInstance().newXMLGregorianCalendar(new GregorianCalendar(year, month - 1, day));
  }

  @Test
  void test_map_versicherungszeit_bisDatum_null() throws DatatypeConfigurationException {
	Versicherungszeit versicherungszeit = new Versicherungszeit();
	versicherungszeit.setVonDatum(createXmlCalendar(2019, 8, 20));
	versicherungszeit.setBisDatum(null);
	versicherungszeit.setQualifikation("QUALIFIKATION");

	VersicherungszeitBTO bto = mapper.map(versicherungszeit);

	assertNotNull(bto);
	assertEquals(LocalDate.of(2019, 8, 20), bto.getVonDatum());
	assertNull(bto.getBisDatum());
	assertEquals("QUALIFIKATION", bto.getQualifikation());
  }

  @Test
  void test_map_versicherungszeit_null() {
	Versicherungszeit    versicherungszeit = null;
	VersicherungszeitBTO bto               = mapper.map(versicherungszeit);
	assertNull(bto);
  }

  @Test
  void test_map_versicherungszeit_qualifikation_null() throws DatatypeConfigurationException {
	Versicherungszeit versicherungszeit = new Versicherungszeit();
	versicherungszeit.setVonDatum(createXmlCalendar(2019, 1, 1));
	versicherungszeit.setBisDatum(createXmlCalendar(2019, 12, 31));
	versicherungszeit.setQualifikation(null);

	VersicherungszeitBTO bto = mapper.map(versicherungszeit);

	assertNotNull(bto);
	assertEquals(LocalDate.of(2019, 1, 1), bto.getVonDatum());
	assertEquals(LocalDate.of(2019, 12, 31), bto.getBisDatum());
	assertNull(bto.getQualifikation());
  }

  @Test
  void test_map_versicherungszeit_vonDat_null() throws DatatypeConfigurationException {
	Versicherungszeit versicherungszeit = new Versicherungszeit();
	versicherungszeit.setVonDatum(null);
	versicherungszeit.setBisDatum(createXmlCalendar(2019, 8, 20));
	versicherungszeit.setQualifikation("QUALIFIKATION");

	VersicherungszeitBTO bto = mapper.map(versicherungszeit);

	assertNotNull(bto);
	assertNull(bto.getVonDatum());
	assertEquals(LocalDate.of(2019, 8, 20), bto.getBisDatum());
	assertEquals("QUALIFIKATION", bto.getQualifikation());
  }
}
