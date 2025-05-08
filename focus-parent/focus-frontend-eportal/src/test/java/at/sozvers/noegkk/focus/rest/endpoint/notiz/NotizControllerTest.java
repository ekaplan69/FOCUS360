package at.sozvers.noegkk.focus.rest.endpoint.notiz;

import at.sozvers.noegkk.focus.rest.api.notiz.NotizDTO;
import at.sozvers.noegkk.focus.service.common.Fachschluessel;
import org.assertj.core.api.SoftAssertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class NotizControllerTest {

  @InjectMocks
  NotizController controller;

  @Test(expected=NullPointerException.class)
  public void test_searchNotiz_Exception() throws Exception {
	NotizDTO actual = controller.searchNotiz(null);

	assertThat(actual).isNotNull();
  }

  @Test(expected=NullPointerException.class)
  public void test_searchNotiz_Null() throws Exception {
	NotizDTO actual = controller.searchNotiz(null);

	assertThat(actual).isNotNull();
  }

  @Test(expected=NullPointerException.class)
  public void test_searchNotiz_Output() throws Exception {
	Fachschluessel fachschluessel = new Fachschluessel("4107071288", "VSNR");

	NotizDTO notizDTO = new NotizDTO();
	notizDTO.setText("Test-Text");
	notizDTO.setFachschluessel(fachschluessel);
	notizDTO.setUpdateCount(0L);

	NotizDTO actual = controller.searchNotiz(fachschluessel);

	assertThat(actual).isNotNull();

	SoftAssertions softly = new SoftAssertions();

	softly.assertThat(actual.getFachschluessel().getFachschluessel()).isEqualTo("4107071288");
	softly.assertThat(actual.getFachschluessel().getFachschluesselArt()).isEqualTo("VSNR");
	softly.assertThat(actual.getText()).isEqualTo("Test-Text");
	softly.assertThat(actual.getUpdateCount()).isEqualTo(0L);
	softly.assertAll();
  }
}
