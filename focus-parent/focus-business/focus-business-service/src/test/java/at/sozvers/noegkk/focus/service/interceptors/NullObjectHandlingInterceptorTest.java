package at.sozvers.noegkk.focus.service.interceptors;

import at.sozialversicherung.schema.zpv.ibs.partnerlesenkurz_15_0.DtoPartnerLEKO;
import at.sozvers.noegkk.focus.CdiExtension;
import at.sozvers.noegkk.focus.service.api.zpv.person.StammdatenBTO;
import at.sozvers.noegkk.focus.service.zpv.person.StammdatenBTOExternalServiceMapper;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertNull;

@ExtendWith(CdiExtension.class)
class NullObjectHandlingInterceptorTest {

  @Inject
  private StammdatenBTOExternalServiceMapper mapper;

  @Test
  void intercept_BTOMapper_returnNull() {
	Object out = mapper.map((StammdatenBTO) null);

	assertNull(out);
  }

  @Test
  void intercept_DTOMapper_returnNull() {
	Object out = mapper.map((DtoPartnerLEKO) null);

	assertNull(out);
  }
}
