package at.sozvers.noegkk.focus.service.beschwerde;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import at.itsv.noegkk.commons.RequestHeadersCommons;
import at.sozvers.noegkk.focus.CdiExtension;
import at.sozvers.noegkk.focus.service.api.beschwerde.BeschwerdeInsertBTO;
import at.sozvers.noegkk.sckont.beschwerde.focus.BeschwerdeErstellenRequest;
import jakarta.inject.Inject;
import org.jboss.weld.context.RequestContext;
import org.jboss.weld.context.unbound.Unbound;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.*;

@Deprecated(forRemoval=true)
@ExtendWith(CdiExtension.class)
class BeschwerdeInsertBTOExternalServiceMapperTest {
  @Inject
  private BeschwerdeInsertBTOExternalServiceMapper mapper;
  @Inject
  @Unbound
  private RequestContext                           requestContext;
  @Inject
  private RequestHeadersCommons                    requestHeaders;

  @BeforeEach
  public void activateRequestContext() {
	if(requestContext.isActive()) {
	  requestContext.deactivate();
	}
	requestContext.activate();
  }

  @Test
  void test_map_allesGesetzt() {
	BeschwerdeInsertBTO bto = new BeschwerdeInsertBTO();

	List<Long> beschwerdegruendeIds = new ArrayList<>();
	beschwerdegruendeIds.add(1L);
	beschwerdegruendeIds.add(2L);

	bto.setUpdatecount(0L);
	Long[] l = {1L};
	bto.setFachbereichDetail(l);
	bto.setKanalId(2L);
	bto.setKontaktpunktId(3L);
	bto.setMeldendeStelleId(4L);
	bto.setStatusId(5);

	bto.setBeschreibung("Beschreibung");
	bto.setBeschwerdegrundAnmerkung("BeschwerdegrundAnmerkung");
	bto.setEmail("Email");
	bto.setFachschluessel("Fachschluessel");
	bto.setFachschluesselArt("FachschluesselArt");
	bto.setMassnahmen("Massnahmen");
	bto.setMitarbeiterkennung("Mitarbeiterkennung");
	bto.setMitarbeitername("Mitarbeitername");
	bto.setTelefon("Telefon");
	bto.setKontaktpunktBereOrg("KontaktpunktBereOrg");
	bto.setBeschwerdegruendeIds(beschwerdegruendeIds);
	bto.setZeitpunkt(LocalDateTime.of(2019, 12, 31, 10, 15, 0));
	bto.setName("Name");
	bto.setOrt("Ort");
	bto.setPostleitzahl("Postleitzahl");
	bto.setStaatIsoA3("StaatIsoA3");

	BeschwerdeErstellenRequest request = mapper.map(bto);
	assertNotNull(request);

	assertEquals(1L, request.getFachbereichDetailId());
	assertEquals(2L, request.getKanalId());
	assertEquals(3L, request.getKontaktpunktId());
	assertEquals(4L, request.getMeldendeStelleId());
	assertEquals(5, request.getStatusId());

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
	assertNull(request.getKontaktpunktBereOrg());
	assertEquals(2019, request.getZeitpunkt().getYear());
	assertEquals(12, request.getZeitpunkt().getMonth());
	assertEquals(31, request.getZeitpunkt().getDay());
	assertEquals(10, request.getZeitpunkt().getHour());
	assertEquals(15, request.getZeitpunkt().getMinute());
	assertEquals(0, request.getZeitpunkt().getSecond());
	assertEquals("Name", request.getName());
	assertEquals("Ort", request.getOrt());
	assertEquals("Postleitzahl", request.getPostleitzahl());
	assertEquals("StaatIsoA3", request.getStaatIsoA3());
  }

  @Test
  void test_map_null() {
	BeschwerdeInsertBTO bto = null;

	BeschwerdeErstellenRequest request = mapper.map(bto);
	assertNull(request);
  }
}
