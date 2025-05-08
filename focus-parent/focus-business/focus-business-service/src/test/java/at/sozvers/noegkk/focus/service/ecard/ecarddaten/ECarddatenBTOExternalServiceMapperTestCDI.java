package at.sozvers.noegkk.focus.service.ecard.ecarddaten;

import at.siemens.ecard.server.onlineservices.valueobject.ECardAuskunftV2Resp;
import at.sozvers.noegkk.focus.CdiExtension;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertNull;

@ExtendWith(CdiExtension.class)
class ECarddatenBTOExternalServiceMapperTestCDI {

  @Inject
  private ECarddatenBTOExternalServiceMapper mapper;

  @Test
  void test_map_ecarddaten_null() {
	assertNull(mapper.map((ECardAuskunftV2Resp) null));
  }
}
