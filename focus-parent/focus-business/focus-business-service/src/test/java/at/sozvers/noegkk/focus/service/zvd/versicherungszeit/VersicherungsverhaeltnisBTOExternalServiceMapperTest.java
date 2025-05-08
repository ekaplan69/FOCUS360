package at.sozvers.noegkk.focus.service.zvd.versicherungszeit;

import javax.xml.datatype.*;
import java.util.*;
import at.sozvers.noegkk.focus.service.api.zvd.VersicherungsverhaeltnisBTO;
import at.sozvers.noegkk.focus.service.api.zvd.VersicherungszeitBTO;
import at.sozvers.zvd.ws.versicherungsverhaeltnisselesenservice.v3.types.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class VersicherungsverhaeltnisBTOExternalServiceMapperTest {

  @InjectMocks
  private VersicherungsverhaeltnisBTOExternalServiceMapper mapper;
  @Mock
  private VersicherungszeitBTOExternalServiceMapper        mockedVersicherungszeitBTOExternalServiceMapper;

  @Test
  void test_map_versicherungsverhaeltnis_allesGesetzt() throws DatatypeConfigurationException {
	Versicherungsverhaeltnis versicherungsverhaeltnis = new Versicherungsverhaeltnis();
	versicherungsverhaeltnis.setHvbBeitragskontonummer("KN");
	versicherungsverhaeltnis.setHvbBeitragskontonummerKennzeichen("KNKZ");
	versicherungsverhaeltnis.setMeldendeStelle("12");
	versicherungsverhaeltnis.setVersicherungszeiten(createVersicherungszeiten());

	// just return a bto so the list size changes
	Mockito.when(mockedVersicherungszeitBTOExternalServiceMapper.map(Mockito.any(Versicherungszeit.class))).thenReturn(new VersicherungszeitBTO());

	VersicherungsverhaeltnisBTO bto = mapper.map(versicherungsverhaeltnis);
	assertNotNull(bto);
	assertEquals("KN", bto.getHvbBeitragskontonummer());
	assertEquals("KNKZ", bto.getHvbBeitragskontonummerKennzeichen());
	assertEquals("12", bto.getMeldendeStelle());
	assertEquals(2, bto.getVersicherungszeiten().size());
  }

  private Versicherungszeiten createVersicherungszeiten() throws DatatypeConfigurationException {
	Versicherungszeiten versicherungszeitenSpy = Mockito.spy(Versicherungszeiten.class);

	Versicherungszeit versicherungszeit = new Versicherungszeit();
	versicherungszeit.setVonDatum(createXmlCalendar(2019, 8, 20));
	versicherungszeit.setBisDatum(createXmlCalendar(2019, 10, 29));
	versicherungszeit.setQualifikation("QUALIFIKATION");

	Versicherungszeit versicherungszeit2 = new Versicherungszeit();
	versicherungszeit2.setVonDatum(createXmlCalendar(2019, 8, 20));
	versicherungszeit2.setBisDatum(createXmlCalendar(2019, 10, 29));
	versicherungszeit2.setQualifikation("QUALIFIKATION");

	List<Versicherungszeit> versicherungszeitList = new ArrayList<>();
	versicherungszeitList.add(versicherungszeit);
	versicherungszeitList.add(versicherungszeit);

	Mockito.when(versicherungszeitenSpy.getVersicherungszeit()).thenReturn(versicherungszeitList);

	return versicherungszeitenSpy;
  }

  private XMLGregorianCalendar createXmlCalendar(int year, int month, int day) throws DatatypeConfigurationException {
	return DatatypeFactory.newInstance().newXMLGregorianCalendar(new GregorianCalendar(year, month, day));
  }

  @Test
  void test_map_versicherungsverhaeltnis_allesNull() {
	Versicherungsverhaeltnis versicherungsverhaeltnis = new Versicherungsverhaeltnis();
	versicherungsverhaeltnis.setHvbBeitragskontonummer(null);
	versicherungsverhaeltnis.setHvbBeitragskontonummerKennzeichen(null);
	versicherungsverhaeltnis.setMeldendeStelle(null);
	versicherungsverhaeltnis.setVersicherungszeiten(null);

	VersicherungsverhaeltnisBTO bto = mapper.map(versicherungsverhaeltnis);
	assertNotNull(bto);
	assertNull(bto.getHvbBeitragskontonummer());
	assertNull(bto.getHvbBeitragskontonummerKennzeichen());
	assertNull(bto.getMeldendeStelle());
	assertEquals(0, bto.getVersicherungszeiten().size());
  }

  @Test
  void test_map_versicherungsverhaeltnis_null() {
	Versicherungsverhaeltnis    versicherungsverhaeltnis = null;
	VersicherungsverhaeltnisBTO bto                      = mapper.map(versicherungsverhaeltnis);
	assertNull(bto);
  }
}
