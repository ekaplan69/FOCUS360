package at.sozvers.noegkk.focus.rest.endpoint.person;

import at.sozvers.noegkk.focus.rest.api.zpv.adresse.AdresseAnschriftDTO;
import at.sozvers.noegkk.focus.service.api.zpv.adresse.AdresseAnschriftBTO;
import org.assertj.core.api.SoftAssertions;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AdresseAnschriftBusinessRestMapperTest {

  private AdresseAnschriftBusinessRestMapper mapper = new AdresseAnschriftBusinessRestMapper();

  @Test
  public void test_map_input() {
	AdresseAnschriftBTO bto = new AdresseAnschriftBTO();
	bto.setAnschrift("Haus");
	bto.setOrt("Amstetten");
	bto.setPlz("3300");

	AdresseAnschriftDTO dto = mapper.map(bto);

	assertThat(dto).isNotNull();

	SoftAssertions softly = new SoftAssertions();
	softly.assertThat(dto.getAnschrift()).isEqualTo("Haus");
	softly.assertThat(dto.getOrt()).isEqualTo("Amstetten");
	softly.assertThat(dto.getPlz()).isEqualTo("3300");
	softly.assertAll();
  }

  @Test
  public void test_map_null() {
	AdresseAnschriftBTO bto = null;
	AdresseAnschriftDTO dto = mapper.map(bto);

	assertThat(dto).isNotNull();
	SoftAssertions softly = new SoftAssertions();
	softly.assertThat(dto.getAnschrift()).isNull();
	softly.assertThat(dto.getOrt()).isNull();
	softly.assertThat(dto.getPlz()).isNull();
	softly.assertAll();
  }
}