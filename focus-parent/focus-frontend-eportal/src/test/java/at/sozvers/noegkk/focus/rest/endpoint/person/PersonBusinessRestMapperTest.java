package at.sozvers.noegkk.focus.rest.endpoint.person;

import at.sozvers.noegkk.focus.CdiExtension;
import at.sozvers.noegkk.focus.rest.api.zpv.person.PersonDTO;
import at.sozvers.noegkk.focus.service.api.zpv.person.PersonBTO;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(CdiExtension.class)
class PersonBusinessRestMapperTest {

  @Inject
  private PersonBusinessRestMapper mapper;

  @Inject
  private StammdatenBusinessRestMapper stammdatendMapper;

  @Test
  void test_map_input() {
	PersonBTO bto = new PersonBTO();
	bto.setVsnr("12345678");
	bto.setStammdaten(null);

	PersonDTO dto = mapper.map(bto);

	assertNotNull(dto);

	assertEquals("12345678", dto.getVsnr());
	assertNull(dto.getStammdaten());
  }

  @Test
  void test_map_null() {
	PersonBTO bto = null;
	PersonDTO dto = mapper.map(bto);

	assertNull(dto);
  }
}