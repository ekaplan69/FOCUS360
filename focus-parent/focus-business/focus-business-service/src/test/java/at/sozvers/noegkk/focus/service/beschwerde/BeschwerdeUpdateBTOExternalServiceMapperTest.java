package at.sozvers.noegkk.focus.service.beschwerde;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import at.itsv.noegkk.commons.RequestHeadersCommons;
import at.sozvers.noegkk.focus.service.api.beschwerde.BeschwerdeUpdateBTO;
import at.sozvers.noegkk.sckont.beschwerde.focus.BeschwerdeAendernRequest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@Deprecated(forRemoval=true)
@ExtendWith(MockitoExtension.class)
class BeschwerdeUpdateBTOExternalServiceMapperTest {

  @InjectMocks
  private BeschwerdeUpdateBTOExternalServiceMapper mapper;
  @Mock
  private RequestHeadersCommons                    requestHeaders;

  @Test
  void test_map_allesGesetzt() {
	BeschwerdeUpdateBTO bto = new BeschwerdeUpdateBTO();

	List<Long> beschwerdegruendeIds = new ArrayList<>();
	beschwerdegruendeIds.add(1L);
	beschwerdegruendeIds.add(2L);

	bto.setUpdatecount(0L);
	bto.setFachbereichDetailId(1L);
	bto.setKanalId(2L);
	bto.setKontaktpunktId(3L);
	bto.setMeldendeStelleId(4L);
	bto.setStatusId(5);
	bto.setBeschwerdeId(6L);

	bto.setBeschreibung("Beschreibung");
	bto.setBeschwerdegrundAnmerkung("BeschwerdegrundAnmerkung");
	bto.setEmail("Email");
	bto.setFachschluessel("Fachschluessel");
	bto.setFachschluesselArt("FachschluesselArt");
	bto.setMassnahmen("Massnahmen");
	bto.setMitarbeiterkennung("Mitarbeiterkennung");
	bto.setMitarbeitername("Mitarbeitername");
	bto.setTelefon("Telefon");
	bto.setBeschwerdegruendeIds(beschwerdegruendeIds);
	bto.setZeitpunkt(LocalDateTime.of(2019, 12, 31, 10, 15, 0));

	BeschwerdeAendernRequest request = mapper.map(bto);
	assertNotNull(request);

	assertEquals(0L, request.getUpdatecount());
	assertEquals(1L, request.getFachbereichDetailId());
	assertEquals(2L, request.getKanalId());
	assertEquals(3L, request.getKontaktpunktId());
	assertEquals(4L, request.getMeldendeStelleId());
	assertEquals(5, request.getStatusId());
	assertEquals(6L, request.getId());

	assertEquals("Beschreibung", request.getBeschreibung());
	assertEquals("BeschwerdegrundAnmerkung", request.getBeschwerdegrundAnmerkung());
	assertEquals("Email", request.getEmail());
	assertEquals("Fachschluessel", request.getFachschluessel());
	assertEquals("FachschluesselArt", request.getFachschluesselArt());
	assertEquals(2, request.getBeschwerdegruende().size());
	assertEquals("Massnahmen", request.getMassnahmen());
	assertEquals("Mitarbeiterkennung", request.getMitarbeiterkennung());
	assertEquals("Mitarbeitername", request.getMitarbeitername());
	assertEquals("Telefon", request.getTelefon());
	assertEquals(2019, request.getZeitpunkt().getYear());
	assertEquals(12, request.getZeitpunkt().getMonth());
	assertEquals(31, request.getZeitpunkt().getDay());
	assertEquals(10, request.getZeitpunkt().getHour());
	assertEquals(15, request.getZeitpunkt().getMinute());
	assertEquals(0, request.getZeitpunkt().getSecond());
  }
}
