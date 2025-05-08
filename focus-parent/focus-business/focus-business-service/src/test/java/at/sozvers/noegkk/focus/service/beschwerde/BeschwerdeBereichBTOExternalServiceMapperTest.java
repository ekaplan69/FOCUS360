package at.sozvers.noegkk.focus.service.beschwerde;

import at.sozvers.noegkk.focus.CdiExtension;
import at.sozvers.noegkk.focus.service.api.beschwerde.BeschwerdeBereichBTO;
import at.sozvers.noegkk.sckont.beschwerde.focus.Beschwerdebereich;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.*;

@Deprecated(forRemoval=true)
@ExtendWith(CdiExtension.class)
class BeschwerdeBereichBTOExternalServiceMapperTest {

  @Inject
  private BeschwerdeBereichBTOExternalServiceMapper mapper;

  @Test
  void test_map_allesGesetzt() {
	Beschwerdebereich beschwerdebereich = new Beschwerdebereich();

	beschwerdebereich.setBeschwerdebereichId(1L);
	beschwerdebereich.setFachbereichId(2L);
	beschwerdebereich.setThemaId(3L);

	beschwerdebereich.setFachbereichBezeichnung("FachbereichBezeichnung");
	beschwerdebereich.setFachbereichDetailBezeichnung("FachbereichDetailBezeichnung");
	beschwerdebereich.setFachbereichDetailHilfetext("FachbereichDetailHilfetext");
	beschwerdebereich.setFachbereichHilfetext("FachbereichHilfetext");
	beschwerdebereich.setThemaBezeichnung("Thema");
	beschwerdebereich.setThemaHilfetext("ThemaHilfetext");

	BeschwerdeBereichBTO bto = mapper.map(beschwerdebereich);
	assertNotNull(bto);

	assertEquals(1, bto.getBeschwerdebereichId());
	assertEquals(2L, bto.getFachbereichId());
	assertEquals(3L, bto.getThemaId());

	assertEquals("FachbereichBezeichnung", bto.getFachbereichBezeichnung());
	assertEquals("FachbereichDetailBezeichnung", bto.getFachbereichDetailBezeichnung());
	assertEquals("FachbereichDetailHilfetext", bto.getFachbereichDetailHilfetext());
	assertEquals("FachbereichHilfetext", bto.getFachbereichHilfetext());
	assertEquals("Thema", bto.getThemaBezeichnung());
	assertEquals("ThemaHilfetext", bto.getThemaHilfetext());
  }

  @Test
  void test_map_allesNull() {
	Beschwerdebereich beschwerdebereich = new Beschwerdebereich();

	BeschwerdeBereichBTO bto = mapper.map(beschwerdebereich);
	assertNotNull(bto);

	assertEquals(0L, bto.getBeschwerdebereichId());
	assertEquals(0L, bto.getFachbereichId());
	assertEquals(0L, bto.getThemaId());
	assertNull(bto.getFachbereichBezeichnung());
	assertNull(bto.getFachbereichDetailBezeichnung());
	assertNull(bto.getFachbereichDetailHilfetext());
	assertNull(bto.getFachbereichHilfetext());
	assertNull(bto.getThemaBezeichnung());
	assertNull(bto.getThemaHilfetext());
  }

  @Test
  void test_map_null() {
	Beschwerdebereich    beschwerdebereich = null;
	BeschwerdeBereichBTO bto               = mapper.map(beschwerdebereich);
	assertNull(bto);
  }
}
