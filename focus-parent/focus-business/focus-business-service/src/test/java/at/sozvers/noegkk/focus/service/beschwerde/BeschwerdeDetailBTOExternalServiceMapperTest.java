package at.sozvers.noegkk.focus.service.beschwerde;

import java.time.LocalDateTime;
import at.sozvers.noegkk.focus.CdiExtension;
import at.sozvers.noegkk.focus.service.api.beschwerde.BeschwerdeDetailBTO;
import at.sozvers.noegkk.focus.service.common.DateUtil;
import at.sozvers.noegkk.sckont.beschwerde.focus.Beschwerde;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

@Deprecated(forRemoval=true)
@ExtendWith(CdiExtension.class)
class BeschwerdeDetailBTOExternalServiceMapperTest {

  @Inject
  private BeschwerdeDetailBTOExternalServiceMapper mapper;

  @Test
  void test_map_allesGesetzt() {
	Beschwerde beschwerde = new Beschwerde();

	beschwerde.setUpdatecount(0L);
	beschwerde.setFachbereichDetailId(1L);
	beschwerde.setKanalId(2L);
	beschwerde.setKontaktpunktId(3L);
	beschwerde.setMeldendeStelleId(4L);
	beschwerde.setStatusId(5);

	beschwerde.setBeschreibung("Beschreibung");
	beschwerde.setBeschwerdegrundAnmerkung("BeschwerdegrundAnmerkung");
	beschwerde.setEmail("Email");
	beschwerde.setMassnahmen("Massnahmen");
	beschwerde.setMitarbeitername("Mitarbeitername");
	beschwerde.setTelefon("Telefon");
	beschwerde.setZeitpunkt(DateUtil.toXMLGregorianCalendar(LocalDateTime.of(2019, 12, 31, 10, 15, 0)));
	beschwerde.getBeschwerdegruende().add(1L);
	beschwerde.getBeschwerdegruende().add(2L);

	BeschwerdeDetailBTO bto = mapper.map(beschwerde);
	assertThat(bto).isNotNull();

	assertEquals(0L, bto.getUpdatecount());
	assertEquals(1L, bto.getFachbereichDetailId());
	assertEquals(2L, bto.getKanalId());
	assertEquals(3L, bto.getKontaktpunktId());
	assertEquals(4L, bto.getMeldendeStelleId());
	assertEquals(5, bto.getStatusId());

	assertEquals("Beschreibung", bto.getBeschreibung());
	assertEquals("BeschwerdegrundAnmerkung", bto.getBeschwerdegrundAnmerkung());
	assertEquals("Email", bto.getEmail());
	assertEquals("Massnahmen", bto.getMassnahmen());
	assertEquals("Mitarbeitername", bto.getMitarbeitername());
	assertEquals("Telefon", bto.getTelefon());
	assertEquals(2019, bto.getZeitpunkt().getYear());
	assertEquals(12, bto.getZeitpunkt().getMonthValue());
	assertEquals(31, bto.getZeitpunkt().getDayOfMonth());
	assertEquals(10, bto.getZeitpunkt().getHour());
	assertEquals(15, bto.getZeitpunkt().getMinute());
	assertEquals(0, bto.getZeitpunkt().getSecond());
	assertEquals(2, bto.getBeschwerdegruendeIds().size());
  }

  @Test
  void test_map_allesNull() {
	Beschwerde beschwerde = new Beschwerde();

	BeschwerdeDetailBTO bto = mapper.map(beschwerde);
	assertThat(bto).isNotNull();

	assertEquals(0L, bto.getUpdatecount());
	assertEquals(0L, bto.getFachbereichDetailId());
	assertEquals(0L, bto.getKanalId());
	assertEquals(0L, bto.getKontaktpunktId());
	assertEquals(0, bto.getStatusId());

	assertNull(bto.getMeldendeStelleId());
	assertNull(bto.getBeschreibung());
	assertNull(bto.getBeschwerdegrundAnmerkung());
	assertNull(bto.getEmail());
	assertNull(bto.getMassnahmen());
	assertNull(bto.getMitarbeitername());
	assertNull(bto.getTelefon());
	assertNull(bto.getZeitpunkt());
	assertEquals(0, bto.getBeschwerdegruendeIds().size());
  }

  @Test
  void test_map_null() {
	Beschwerde beschwerde = null;

	BeschwerdeDetailBTO bto = mapper.map(beschwerde);
	assertNull(bto);
  }
}
