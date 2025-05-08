package at.sozvers.noegkk.focus.kva.abzsuc;

import javax.xml.datatype.*;
import java.time.*;
import java.util.*;
import at.sozvers.kva.schema.angehoerigenbeziehung.suchen.AngehoerigenBeziehungDTO;
import at.sozvers.noegkk.focus.service.api.kva.abzsuc.VersicherterBTO;
import at.sozvers.noegkk.focus.service.kva.abzsuc.VersicherterBTOExternalServiceMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class VersicherterBTOExternalServiceMapperTest {

  private VersicherterBTOExternalServiceMapper mapper;

  @BeforeEach
  public void setUp() {mapper = new VersicherterBTOExternalServiceMapper();}

  @Test
  void test_map_angehoerigenBeziehung_allesGesetzt() throws DatatypeConfigurationException {
	List<AngehoerigenBeziehungDTO> angehoerigenBeziehungDTOList = new ArrayList<>();
	AngehoerigenBeziehungDTO       dto                          = new AngehoerigenBeziehungDTO();
	dto.setVsnrVers("1111111111");
	dto.setVondat(createXmlCalendar(2019, 8, 6));
	dto.setBisdat(createXmlCalendar(2999, 8, 6));
	dto.setVorname("Paul");
	dto.setFamname("Peter");
	dto.setMeldendeStelle("12");
	dto.setAngTypBez("Kind");

	angehoerigenBeziehungDTOList.add(dto);

	List<VersicherterBTO> bto = mapper.mapAngehoerigenBeziehungToBTOList(angehoerigenBeziehungDTOList);

	assertNotEquals(0, bto.size());
	assertEquals(LocalDate.of(2019, 8, 6), bto.get(0).getGueltigVon());
	assertEquals(LocalDate.of(2999, 8, 6), bto.get(0).getGueltigBis());
	assertEquals("1111111111", bto.get(0).getVersicherungsnummer());
	assertEquals("12", bto.get(0).getMeldendeStelle());
	assertEquals("Peter", bto.get(0).getNachname());
	assertEquals("Paul", bto.get(0).getVorname());
	assertEquals("Kind", bto.get(0).getTyp());
  }

  private XMLGregorianCalendar createXmlCalendar(int year, int month, int day) throws DatatypeConfigurationException {
	OffsetDateTime    offsetDateTime    = OffsetDateTime.of(year, month, day, 0, 0, 0, 0, ZoneOffset.of("+2"));
	GregorianCalendar gregorianCalendar = GregorianCalendar.from(offsetDateTime.toZonedDateTime());
	return DatatypeFactory.newInstance().newXMLGregorianCalendar(gregorianCalendar);
  }

  @Test
  void test_map_angehoerigenBeziehung_bisDatum_null() throws DatatypeConfigurationException {
	List<AngehoerigenBeziehungDTO> angehoerigenBeziehungDTOList = new ArrayList<>();
	AngehoerigenBeziehungDTO       dto                          = new AngehoerigenBeziehungDTO();
	dto.setVsnrVers("1111111111");
	dto.setVondat(createXmlCalendar(2019, 8, 6));
	dto.setBisdat(null);
	dto.setVorname("Paul");
	dto.setFamname("Peter");
	dto.setMeldendeStelle("12");
	dto.setAngTypBez("Kind");

	angehoerigenBeziehungDTOList.add(dto);

	List<VersicherterBTO> bto = mapper.mapAngehoerigenBeziehungToBTOList(angehoerigenBeziehungDTOList);

	assertNotEquals(0, bto.size());
	assertEquals(LocalDate.of(2019, 8, 6), bto.get(0).getGueltigVon());
	assertNull(bto.get(0).getGueltigBis());
	assertEquals("1111111111", bto.get(0).getVersicherungsnummer());
	assertEquals("12", bto.get(0).getMeldendeStelle());
	assertEquals("Peter", bto.get(0).getNachname());
	assertEquals("Paul", bto.get(0).getVorname());
	assertEquals("Kind", bto.get(0).getTyp());
  }

  @Test
  void test_map_angehoerigenBeziehung_null() {
	List<AngehoerigenBeziehungDTO> dto = null;
	assertThrows(NullPointerException.class, () -> mapper.mapAngehoerigenBeziehungToBTOList(dto));
  }
}
