package at.sozvers.noegkk.focus.rest.endpoint.person;

import at.sozvers.noegkk.focus.rest.api.zpv.adresse.GeldadresseDTO;
import at.sozvers.noegkk.focus.service.api.zpv.adresse.GeldadresseBTO;
import org.assertj.core.api.SoftAssertions;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GeldadresseBusinessRestMapperTest {

  private GeldadresseBusinessRestMapper mapper = new GeldadresseBusinessRestMapper();

  @Test
  public void test_map_input() {
	GeldadresseBTO bto = new GeldadresseBTO();
	bto.setBic("12345678");
	bto.setIban("tve5wz4w47");
	bto.setVerwendungsartKurz("String");

	GeldadresseDTO dto = mapper.map(bto);

	assertThat(dto).isNotNull();

	SoftAssertions softly = new SoftAssertions();
	softly.assertThat(dto.getBic()).isEqualTo("12345678");
	softly.assertThat(dto.getIban()).isEqualTo("tve5wz4w47");
	softly.assertThat(dto.getVerwendungsartKurz()).isEqualTo("String");
	softly.assertAll();
  }

  @Test
  public void test_map_null() {
	GeldadresseBTO bto = null;
	GeldadresseDTO dto = mapper.map(bto);

	assertThat(dto).isNotNull();

	SoftAssertions softly = new SoftAssertions();
	softly.assertThat(dto.getBic()).isNull();
	softly.assertThat(dto.getIban()).isNull();
	softly.assertThat(dto.getVerwendungsartKurz()).isNull();
	softly.assertAll();
  }
}