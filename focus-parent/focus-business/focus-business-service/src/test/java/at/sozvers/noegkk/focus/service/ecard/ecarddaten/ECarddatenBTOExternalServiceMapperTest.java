package at.sozvers.noegkk.focus.service.ecard.ecarddaten;

import java.time.LocalDate;
import at.siemens.ecard.server.onlineservices.valueobject.ECardAuskunftV2Resp;
import at.sozvers.noegkk.focus.CdiExtension;
import at.sozvers.noegkk.focus.service.api.ecard.ECarddatenBTO;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(CdiExtension.class)
class ECarddatenBTOExternalServiceMapperTest {

  @Inject
  private ECarddatenBTOExternalServiceMapper mapper;

  @Test
  void test_map_ecarddaten_allesGesetzt() {
	ECarddatenBTO bto = mapper.map(createECardAuskunftResponse());

	assertNotNull(bto);
	assertEquals("123456789", bto.getLaufnummer());
	assertEquals(LocalDate.of(2019, 1, 1), bto.getAusstellungsDatum());
	assertNull(bto.getLetzteKonsultation());
  }

  private ECardAuskunftV2Resp createECardAuskunftResponse() {
	ECardAuskunftV2Resp auskunftRespSpy = Mockito.spy(ECardAuskunftV2Resp.class);
	auskunftRespSpy.setAnzahl(1);

	Mockito.when(auskunftRespSpy.getECards()).thenReturn(ECardUtils.createECardList());

	return auskunftRespSpy;
  }
}
