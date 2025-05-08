package at.sozvers.noegkk.focus.service.beschwerde;

import java.time.LocalDateTime;
import at.sozvers.noegkk.focus.CdiExtension;
import at.sozvers.noegkk.focus.service.api.beschwerde.BeschwerdeBTO;
import at.sozvers.noegkk.focus.service.common.DateUtil;
import at.sozvers.noegkk.sckont.beschwerde.focus.BeschwerdeKurz;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.*;

@Deprecated(forRemoval=true)
@ExtendWith(CdiExtension.class)
class BeschwerdeBTOExternalServiceMapperTest {

  @Inject
  private BeschwerdeBTOExternalServiceMapper mapper;

  @Test
  void test_map_allesGesetzt() {
	BeschwerdeKurz beschwerdeKurz = new BeschwerdeKurz();

	beschwerdeKurz.setBeschwerdeId(1L);
	beschwerdeKurz.setFachbereichBez("FachbereichBezeichnung");
	beschwerdeKurz.setKanalBez("KanalBezeichnung");
	beschwerdeKurz.setKontaktpunktBez("KontaktpunktBezeichnung");
	beschwerdeKurz.setThemaBez("ThemaBezeichnung");
	beschwerdeKurz.setZeitpunkt(DateUtil.toXMLGregorianCalendar(LocalDateTime.of(2019, 12, 31, 10, 15, 0)));

	BeschwerdeBTO bto = mapper.map(beschwerdeKurz);
	assertNotNull(bto);

	assertEquals(1L, bto.getBeschwerdeId());
	assertEquals("FachbereichBezeichnung", bto.getFachbereichBezeichnung());
	assertEquals("KanalBezeichnung", bto.getKanalBezeichnung());
	assertEquals("KontaktpunktBezeichnung", bto.getKontaktpunktBezeichnung());
	assertEquals("ThemaBezeichnung", bto.getThemaBezeichnung());
	assertEquals(2019, bto.getZeitpunkt().getYear());
	assertEquals(12, bto.getZeitpunkt().getMonthValue());
	assertEquals(31, bto.getZeitpunkt().getDayOfMonth());
	assertEquals(10, bto.getZeitpunkt().getHour());
	assertEquals(15, bto.getZeitpunkt().getMinute());
	assertEquals(0, bto.getZeitpunkt().getSecond());
  }

  @Test
  void test_map_allesNull() {
	BeschwerdeKurz beschwerdeKurz = new BeschwerdeKurz();

	BeschwerdeBTO bto = mapper.map(beschwerdeKurz);
	assertNotNull(bto);

	assertEquals(0L, bto.getBeschwerdeId());
	assertNull(bto.getFachbereichBezeichnung());
	assertNull(bto.getKanalBezeichnung());
	assertNull(bto.getKontaktpunktBezeichnung());
	assertNull(bto.getThemaBezeichnung());
	assertNull(bto.getZeitpunkt());
  }

  @Test
  void test_map_null() {
	BeschwerdeKurz beschwerdeKurz = null;
	BeschwerdeBTO  bto            = mapper.map(beschwerdeKurz);
	assertNull(bto);
  }
}
