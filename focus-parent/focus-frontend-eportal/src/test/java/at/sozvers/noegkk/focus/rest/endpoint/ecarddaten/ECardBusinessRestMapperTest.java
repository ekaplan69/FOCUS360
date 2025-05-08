package at.sozvers.noegkk.focus.rest.endpoint.ecarddaten;

import java.time.LocalDate;
import at.sozvers.noegkk.focus.CdiExtension;
import at.sozvers.noegkk.focus.rest.api.ecard.ECarddatenDTO;
import at.sozvers.noegkk.focus.service.api.ecard.ECarddatenBTO;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

@ExtendWith(CdiExtension.class)
class ECardBusinessRestMapperTest {

  @Inject
  private ECardBusinessRestMapper mapper;

  @Test
  void test_map_allesGesetzt() {
	ECarddatenBTO bto = new ECarddatenBTO();
	bto.setLetzteKonsultation(LocalDate.of(2000, 1, 1));
	bto.setAusstellungsDatum(LocalDate.of(2000, 1, 1));
	bto.setLaufnummer("1234");

	ECarddatenDTO dto = mapper.map(bto);

	assertThat(dto).isNotNull();

	assertEquals(LocalDate.of(2000, 1, 1), dto.getAusstellungsDatum());
	assertEquals(LocalDate.of(2000, 1, 1), dto.getLetzteKonsultation());
	assertEquals("1234", dto.getLaufnummer());
  }

  @Test
  void test_map_null() {
	assertNull(mapper.map((ECarddatenBTO) null));
  }
}
