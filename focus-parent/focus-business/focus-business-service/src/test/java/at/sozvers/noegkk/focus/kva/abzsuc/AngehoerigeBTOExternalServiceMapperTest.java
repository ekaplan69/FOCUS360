package at.sozvers.noegkk.focus.kva.abzsuc;

import javax.xml.datatype.*;
import java.time.LocalDate;
import java.util.*;
import at.sozvers.kva.schema.angehoerigenbeziehung.suchen.AngehoerigenBeziehungDTO;
import at.sozvers.noegkk.focus.CdiExtension;
import at.sozvers.noegkk.focus.service.api.kva.abzsuc.AngehoerigeBTO;
import at.sozvers.noegkk.focus.service.kva.abzsuc.AngehoerigeBTOExternalServiceMapper;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(CdiExtension.class)
class AngehoerigeBTOExternalServiceMapperTest {

  @Inject
  private AngehoerigeBTOExternalServiceMapper mapper;

  @Test
  void test_map_angehoerigenBeziehung_allesGesetzt() throws DatatypeConfigurationException {
	List<AngehoerigenBeziehungDTO> dtoList = new ArrayList<>();
	AngehoerigenBeziehungDTO       dto     = new AngehoerigenBeziehungDTO();
	dto.setVsnrAng("1111111111");
	dto.setVondat(createXmlCalendar(2019, 8, 6));
	dto.setBisdat(createXmlCalendar(2999, 8, 6));
	dto.setVorname("Paul");
	dto.setFamname("Peter");
	dto.setMeldendeStelle("12");
	dto.setAngTypBez("Kind");

	dtoList.add(dto);

	List<AngehoerigeBTO> bto = mapper.mapAngehoerigenBeziehungToBTOList(dtoList);

	assertThat(bto).isNotNull().isNotEmpty();
	assertEquals(LocalDate.of(2019, 8, 6), bto.get(0).getGueltigVon());
	assertEquals(LocalDate.of(2999, 8, 6), bto.get(0).getGueltigBis());
	assertEquals("1111111111", bto.get(0).getVersicherungsnummer());
	assertEquals("12", bto.get(0).getMeldendeStelle());
	assertEquals("Peter", bto.get(0).getNachname());
	assertEquals("Paul", bto.get(0).getVorname());
	assertEquals("Kind", bto.get(0).getTyp());
  }

  private XMLGregorianCalendar createXmlCalendar(int year, int month, int day) throws DatatypeConfigurationException {
	GregorianCalendar gregorianCalendar = new GregorianCalendar();
	gregorianCalendar.set(year, month - 1, day, 0, 0, 0); // Month is 0-based in GregorianCalendar
	return DatatypeFactory.newInstance().newXMLGregorianCalendar(gregorianCalendar);
  }

  @Test
  void test_map_angehoerigenBeziehung_bisDatum_null() throws DatatypeConfigurationException {
	List<AngehoerigenBeziehungDTO> dtoList = new ArrayList<>();
	AngehoerigenBeziehungDTO       dto     = new AngehoerigenBeziehungDTO();
	dto.setVsnrAng("1111111111");
	dto.setVondat(createXmlCalendar(2019, 8, 6));
	dto.setBisdat(null);
	dto.setVorname("Paul");
	dto.setFamname("Peter");
	dto.setMeldendeStelle("12");
	dto.setAngTypBez("Kind");

	dtoList.add(dto);

	List<AngehoerigeBTO> bto = mapper.mapAngehoerigenBeziehungToBTOList(dtoList);

	assertThat(bto).isNotNull().isNotEmpty();
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
