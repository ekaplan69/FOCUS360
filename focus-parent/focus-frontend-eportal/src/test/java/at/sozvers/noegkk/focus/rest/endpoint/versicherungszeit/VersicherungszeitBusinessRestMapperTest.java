package at.sozvers.noegkk.focus.rest.endpoint.versicherungszeit;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import at.sozvers.noegkk.focus.rest.api.zvd.VersicherungszeitDTO;
import at.sozvers.noegkk.focus.service.api.zvd.VersicherungsverhaeltnisBTO;
import at.sozvers.noegkk.focus.service.api.zvd.VersicherungszeitBTO;
import org.assertj.core.api.SoftAssertions;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class VersicherungszeitBusinessRestMapperTest {

  private VersicherungszeitBusinessRestMapper mapper = new VersicherungszeitBusinessRestMapper();

  @Test
  public void test_mapToDtoList_allesGesetzt() {

	List<VersicherungsverhaeltnisBTO> btoList                  = new ArrayList<>();
	VersicherungsverhaeltnisBTO       bto                      = new VersicherungsverhaeltnisBTO();
	List<VersicherungszeitBTO>        versicherungszeitBtoList = new ArrayList<>();

	VersicherungszeitBTO versicherungszeitBTO = new VersicherungszeitBTO();
	versicherungszeitBTO.setBisDatum(LocalDate.now());
	versicherungszeitBTO.setDienstgebername("NOEGKK");
	versicherungszeitBTO.setQualifikation("Praktikant");
	versicherungszeitBTO.setQualifikationKurz("P");
	versicherungszeitBTO.setVonDatum(LocalDate.now());

	versicherungszeitBtoList.add(versicherungszeitBTO);
	bto.setHvbBeitragskontonummer("HVBNR");
	bto.setHvbBeitragskontonummerKennzeichen("HVBNRKZ");
	bto.setMeldendeStelle("12");
	bto.setVersicherungszeiten(versicherungszeitBtoList);
	btoList.add(bto);

	List<VersicherungszeitDTO> dtoList = mapper.mapToDtoList(btoList);

	assertThat(dtoList).isNotEmpty();

	SoftAssertions softly = new SoftAssertions();
	softly.assertThat(dtoList.get(0).getBeginnDatum()).isEqualTo(LocalDate.now());
	softly.assertThat(dtoList.get(0).getDienstgebername()).isEqualTo("NOEGKK");
	softly.assertThat(dtoList.get(0).getEndeDatum()).isEqualTo(LocalDate.now());
	softly.assertThat(dtoList.get(0).getMeldendeStelle()).isEqualTo("12");
	softly.assertThat(dtoList.get(0).getQualifikation()).isEqualTo("Praktikant");
	softly.assertAll();
  }

  @Test
  public void test_mapToDtoList_empty() {
	List<VersicherungsverhaeltnisBTO> btoList = new ArrayList<>();
	List<VersicherungszeitDTO>        dtoList = mapper.mapToDtoList(btoList);

	assertThat(dtoList).isEmpty();
  }

  @Test
  public void test_mapToDtoList_null() {
	List<VersicherungsverhaeltnisBTO> btoList = null;
	List<VersicherungszeitDTO>        dtoList = mapper.mapToDtoList(btoList);

	assertThat(dtoList).isEmpty();
  }

  @Test
  public void test_mapToDtoList_sortierung() {
	List<VersicherungsverhaeltnisBTO> btoList = new ArrayList<>();

	List<VersicherungszeitBTO> versicherungszeitBtoList = new ArrayList<>();
	versicherungszeitBtoList.add(createVersicherungszeitBTOwithBisDatum(2000, 1, 1));
	versicherungszeitBtoList.add(createVersicherungszeitBTOwithBisDatum(2005, 2, 2));

	List<VersicherungszeitBTO> versicherungszeitBtoList2 = new ArrayList<>();
	versicherungszeitBtoList2.add(createVersicherungszeitBTOwithBisDatum(2017, 3, 3));
	versicherungszeitBtoList2.add(createVersicherungszeitBTOwithBisDatum(2010, 4, 4));

	btoList.add(createVersicherungsVerhaeltnisBTO(versicherungszeitBtoList));
	btoList.add(createVersicherungsVerhaeltnisBTO(versicherungszeitBtoList2));

	List<VersicherungszeitDTO> dtoList = mapper.mapToDtoList(btoList);

	assertThat(dtoList).hasSize(4);

	SoftAssertions softly = new SoftAssertions();
	softly.assertThat(dtoList.get(0).getEndeDatum()).isEqualTo(LocalDate.of(2017, 3, 3));
	softly.assertThat(dtoList.get(1).getEndeDatum()).isEqualTo(LocalDate.of(2010, 4, 4));
	softly.assertThat(dtoList.get(2).getEndeDatum()).isEqualTo(LocalDate.of(2005, 2, 2));
	softly.assertThat(dtoList.get(3).getEndeDatum()).isEqualTo(LocalDate.of(2000, 1, 1));
	softly.assertAll();
  }

  private VersicherungszeitBTO createVersicherungszeitBTOwithBisDatum(int y, int m, int d) {
	VersicherungszeitBTO versicherungszeitBTO = new VersicherungszeitBTO();
	versicherungszeitBTO.setBisDatum(LocalDate.of(y, m, d));
	return versicherungszeitBTO;
  }

  private VersicherungsverhaeltnisBTO createVersicherungsVerhaeltnisBTO(List<VersicherungszeitBTO> versicherungszeitBtoList) {
	VersicherungsverhaeltnisBTO bto = new VersicherungsverhaeltnisBTO();
	bto.setVersicherungszeiten(versicherungszeitBtoList);
	bto.setMeldendeStelle("12");
	return bto;
  }
}
