package at.sozvers.noegkk.focus.rest.endpoint.notiz;

import at.sozvers.noegkk.focus.rest.api.notiz.NotizDTO;
import at.sozvers.noegkk.focus.rest.mapping.BusinessRestMapper;
import at.sozvers.noegkk.focus.service.api.notiz.NotizBTO;
import org.assertj.core.api.SoftAssertions;
import org.junit.Test;
import org.mockito.Spy;

import static org.assertj.core.api.Assertions.assertThat;

public class NotizBuisnessRestMapperTest extends BusinessRestMapper<NotizDTO, NotizBTO> {

  @Spy
  NotizBusinessRestMapper mapper;

  @Test(expected=NullPointerException.class)
  public void NotizDTO_map_test_null() {
	NotizBTO notizBTO = null;
	NotizDTO notizDTO = mapper.map(notizBTO);
  }

  @Test
  public void NotizDTO_map_test_output() {
	NotizDTO notizDTO;
	NotizBTO notizBTO = new NotizBTO();
	notizBTO.setText("Test");
	notizBTO.setUpdateCount(2L);
	notizBTO.setFachSchluessel("123456789");
	notizBTO.setFachschluesselArt("VSNR");

	NotizBusinessRestMapper notizMapper = new NotizBusinessRestMapper();
	notizDTO = notizMapper.map(notizBTO);

	assertThat(notizDTO).isNotNull();
	SoftAssertions softly = new SoftAssertions();
	softly.assertThat(notizDTO.getText()).isEqualTo(notizBTO.getText());
	softly.assertThat(notizDTO.getFachschluessel().getFachschluessel()).isEqualTo(notizBTO.getFachSchluessel());
	softly.assertThat(notizDTO.getFachschluessel().getFachschluesselArt()).isEqualTo(notizBTO.getFachschluesselArt());
	softly.assertThat(notizDTO.getUpdateCount()).isEqualTo(notizBTO.getUpdateCount());
	softly.assertAll();
  }
}
