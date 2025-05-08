package at.sozvers.noegkk.focus.rest.endpoint.ecarddaten;

import java.time.LocalDate;
import at.sozvers.noegkk.focus.rest.api.ecard.ECarddatenDTO;
import at.sozvers.noegkk.focus.service.api.ecard.ECarddatenBTO;
import at.sozvers.noegkk.focus.service.common.Fachschluessel;
import at.sozvers.noegkk.focus.service.common.FachschluesselValidator;
import at.sozvers.noegkk.focus.service.ecard.ecarddaten.ECarddatenService;
import org.assertj.core.api.SoftAssertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.*;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertNotNull;

@RunWith(MockitoJUnitRunner.class)
public class ECardControllerTest {

  @InjectMocks
  private ECardController         controller;
  @Spy
  private ECardBusinessRestMapper eCardBusinessRestMapper;
  @Mock
  private ECarddatenService       eCarddatenService;
  @Mock
  private FachschluesselValidator mockedFachschluesselValidator;

  @Test
  public void test_searchECarddaten() {
	ECarddatenBTO bto = new ECarddatenBTO();
	bto.setLaufnummer("80040000004400001419");
	bto.setAusstellungsDatum(LocalDate.of(2017, 3, 10));

	Mockito.when(eCarddatenService.searchEcardByFachschluessel(Mockito.any())).thenReturn(bto);
	Mockito.when(eCarddatenService.searchLetzteKonsultationDatum(Mockito.any())).thenReturn(LocalDate.of(2019, 3, 15));

	Fachschluessel fachschluessel = Fachschluessel.of("1239050178", "VSNR");

	ECarddatenDTO dto = controller.searchECarddaten(fachschluessel);

	assertNotNull(dto);

	SoftAssertions softly = new SoftAssertions();
	softly.assertThat(dto.getLetzteKonsultation()).isEqualTo(LocalDate.of(2019, 3, 15));
	softly.assertThat(dto.getAusstellungsDatum()).isEqualTo("2017-03-10");
	softly.assertThat(dto.getLaufnummer()).isEqualTo("80040000004400001419");
	softly.assertAll();
  }
}
