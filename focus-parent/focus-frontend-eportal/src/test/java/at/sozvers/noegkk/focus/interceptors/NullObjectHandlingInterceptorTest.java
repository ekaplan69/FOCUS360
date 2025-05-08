package at.sozvers.noegkk.focus.interceptors;

import at.sozvers.noegkk.focus.CdiExtension;
import at.sozvers.noegkk.focus.rest.api.zpv.person.StammdatenDTO;
import at.sozvers.noegkk.focus.rest.endpoint.person.StammdatenBusinessRestMapper;
import at.sozvers.noegkk.focus.service.api.zpv.person.StammdatenBTO;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertNull;

@ExtendWith(CdiExtension.class)
class NullObjectHandlingInterceptorTest {

  @Inject
  private StammdatenBusinessRestMapper mapper;

  @Test
  void intercept_BTOMapper_returnNull() {
	Object out = mapper.map((StammdatenBTO) null);

	assertNull(out);
  }

  @Test
  void intercept_DTOMapper_returnNull() {
	Object out = mapper.map((StammdatenDTO) null);

	assertNull(out);
  }
}
