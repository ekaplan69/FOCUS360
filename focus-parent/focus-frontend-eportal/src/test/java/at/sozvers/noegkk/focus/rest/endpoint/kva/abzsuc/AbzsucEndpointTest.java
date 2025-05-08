package at.sozvers.noegkk.focus.rest.endpoint.kva.abzsuc;

import java.util.ArrayList;
import java.util.List;
import at.sozvers.noegkk.focus.rest.api.common.BaseResponseCollectionDTO;
import at.sozvers.noegkk.focus.rest.api.kva.abzsuc.AngehoerigeDTO;
import at.sozvers.noegkk.focus.rest.api.kva.abzsuc.VersicherterDTO;
import at.sozvers.noegkk.focus.service.api.common.MeldungBTO;
import at.sozvers.noegkk.focus.service.context.Messages;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.*;
import org.mockito.junit.MockitoJUnitRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class AbzsucEndpointTest {

  @InjectMocks
  private AbzsucEndpoint   endpoint;
  @Mock
  private AbzsucController mockedAbzsucController;
  @Mock
  private Messages         mockedMessages;

	/*@Test
	@Disabled("NullPointerException, es kann nie dazu kommen, dass getMessages() NULL zurückliefert")
	public void test_searchAngehoerige_NULL() throws Exception {
		Mockito.when(mockedAbzsucController.searchAngehoerige(Mockito.any())).thenReturn(null);
		Mockito.when(mockedMessages.getMessages()).thenReturn(null);

		BaseResponseCollectionDTO<List<AngehoerigeDTO>> actual = endpoint.searchAngehoerige("4107071288", "VSNR", "123456");

		assertThat(actual).isNull();
	}*/

  @Test
  public void test_searchAngehoerige_empty() throws Exception {
	Mockito.when(mockedAbzsucController.searchAngehoerige(Mockito.any())).thenReturn(new ArrayList<>());
	Mockito.when(mockedMessages.getMessages()).thenReturn(new ArrayList<>());

	BaseResponseCollectionDTO<List<AngehoerigeDTO>> actual = endpoint.searchAngehoerige("4107071288", "VSNR", "123456");

	assertThat(actual.getResponse()).isEmpty();
  }

  @Test
  public void test_searchAngehoerige_values() throws Exception {
	List<AngehoerigeDTO> dtoList = new ArrayList<>();
	AngehoerigeDTO       dto     = new AngehoerigeDTO();
	dto.setVorname("Max");
	dto.setNachname("Mustermann");
	dto.setTyp("VSNR");
	dto.setVersicherungsnummer("1234567890");
	dtoList.add(dto);
	Mockito.when(mockedAbzsucController.searchAngehoerige(Mockito.any())).thenReturn(dtoList);
	List<MeldungBTO> meldungen = new ArrayList<>();
	MeldungBTO       meldung   = MeldungBTO.of("1", "Meldungskat", "Meldungstext");
	meldungen.add(meldung);
	Mockito.when(mockedMessages.getMessages()).thenReturn(meldungen);

	BaseResponseCollectionDTO<List<AngehoerigeDTO>> actual = endpoint.searchAngehoerige("4107071288", "VSNR", "123456");

	assertThat(actual.getResponse()).isNotEmpty();
	assertThat(actual.getMetainformation().getStatus()).isEqualTo("F");
	assertThat(actual.getMetainformation().getMeldungen().get(0).getFehlerId()).isEqualTo("1");
	assertThat(actual.getMetainformation().getMeldungen().get(0).getFehlerkategorie()).isEqualTo("Meldungskat");
	assertThat(actual.getMetainformation().getMeldungen().get(0).getMeldungstext()).isEqualTo("Meldungstext");
	assertThat(actual.getResponse().get(0).getVorname()).isEqualTo("Max");
	assertThat(actual.getResponse().get(0).getNachname()).isEqualTo("Mustermann");
	assertThat(actual.getResponse().get(0).getTyp()).isEqualTo("VSNR");
	assertThat(actual.getResponse().get(0).getVersicherungsnummer()).isEqualTo("1234567890");
  }

	/*@Test
	@Disabled("NullPointerException, es kann nie dazu kommen, dass getMessages() NULL zurückliefert")
	public void test_searchVersicherte_NULL() throws Exception {
		Mockito.when(mockedAbzsucController.searchVersicherter(Mockito.any())).thenReturn(null);
		Mockito.when(mockedMessages.getMessages()).thenReturn(null);

		BaseResponseCollectionDTO<List<VersicherterDTO>> actual = endpoint.searchVersicherter("4107071288", "VSNR", "123456");

		assertThat(actual).isNull();
	}*/

  @Test
  public void test_searchVersicherte_empty() throws Exception {
	Mockito.when(mockedAbzsucController.searchVersicherter(Mockito.any())).thenReturn(new ArrayList<>());
	Mockito.when(mockedMessages.getMessages()).thenReturn(new ArrayList<>());

	BaseResponseCollectionDTO<List<VersicherterDTO>> actual = endpoint.searchVersicherter("4107071288", "VSNR", "123456");

	assertThat(actual.getResponse()).isEmpty();
  }

  @Test
  public void test_searchVersicherte_values() throws Exception {
	List<VersicherterDTO> dtoList = new ArrayList<>();
	VersicherterDTO       dto     = new VersicherterDTO();
	dto.setVorname("Max");
	dto.setNachname("Mustermann");
	dto.setTyp("VSNR");
	dto.setVersicherungsnummer("1234567890");
	dtoList.add(dto);
	Mockito.when(mockedAbzsucController.searchVersicherter(Mockito.any())).thenReturn(dtoList);
	List<MeldungBTO> meldungen = new ArrayList<>();
	MeldungBTO       meldung   = MeldungBTO.of("1", "Meldungskat", "Meldungstext");
	meldungen.add(meldung);
	Mockito.when(mockedMessages.getMessages()).thenReturn(meldungen);

	BaseResponseCollectionDTO<List<VersicherterDTO>> actual = endpoint.searchVersicherter("4107071288", "VSNR", "123456");

	assertThat(actual.getResponse()).isNotEmpty();
	assertThat(actual.getMetainformation().getStatus()).isEqualTo("F");
	assertThat(actual.getMetainformation().getMeldungen().get(0).getFehlerId()).isEqualTo("1");
	assertThat(actual.getMetainformation().getMeldungen().get(0).getFehlerkategorie()).isEqualTo("Meldungskat");
	assertThat(actual.getMetainformation().getMeldungen().get(0).getMeldungstext()).isEqualTo("Meldungstext");
	assertThat(actual.getResponse().get(0).getVorname()).isEqualTo("Max");
	assertThat(actual.getResponse().get(0).getNachname()).isEqualTo("Mustermann");
	assertThat(actual.getResponse().get(0).getTyp()).isEqualTo("VSNR");
	assertThat(actual.getResponse().get(0).getVersicherungsnummer()).isEqualTo("1234567890");
  }
}
