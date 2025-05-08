package at.sozvers.noegkk.focus.rest.endpoint.person;

import java.time.LocalDate;
import at.sozvers.noegkk.focus.rest.api.zpv.person.SuchpersonDTO;
import at.sozvers.noegkk.focus.service.api.zpv.person.SuchpersonBTO;
import org.assertj.core.api.SoftAssertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class SuchpersonBusinessRestMapperTest {

  @Spy
  private SuchpersonBusinessRestMapper mapper;

  @Test
  public void test_map_success() {
	SuchpersonBTO bto = new SuchpersonBTO();
	bto.setPrid("1");
	bto.setFachschluessel("1234447890");
	bto.setGeburtsdatum(LocalDate.of(1998, 7, 4));
	bto.setNachname("Yoda");
	bto.setVorname("Baby");
	bto.setOrt("Daham");
	bto.setAdresse("Die Straße 1");
	bto.setPlz("2323");

	SuchpersonDTO dto = mapper.map(bto);
	assertThat(dto).isNotNull();

	SoftAssertions softly = new SoftAssertions();
	softly.assertThat(dto.getAdresse()).isEqualTo(bto.getAdresse());
	softly.assertThat(dto.getFachschluessel()).isEqualTo(bto.getFachschluessel());
	softly.assertThat(dto.getGeburtsdatum()).isEqualTo(bto.getGeburtsdatum());
	softly.assertThat(dto.getOrt()).isEqualTo(bto.getOrt());
	softly.assertThat(dto.getNachname()).isEqualTo(bto.getNachname());
	softly.assertThat(dto.getVorname()).isEqualTo(bto.getVorname());
	softly.assertThat(dto.getPlz()).isEqualTo(bto.getPlz());
	softly.assertThat(dto.getPrid()).isEqualTo(bto.getPrid());
	softly.assertAll();
  }
}
