package at.sozvers.noegkk.focus.rest.endpoint.kva.abzsuc;

import java.util.ArrayList;
import java.util.List;
import at.sozvers.noegkk.focus.rest.api.kva.abzsuc.AngehoerigeDTO;
import at.sozvers.noegkk.focus.rest.api.kva.abzsuc.VersicherterDTO;
import at.sozvers.noegkk.focus.service.api.kva.abzsuc.AngehoerigeBTO;
import at.sozvers.noegkk.focus.service.api.kva.abzsuc.VersicherterBTO;
import at.sozvers.noegkk.focus.service.common.Fachschluessel;
import at.sozvers.noegkk.focus.service.common.FachschluesselValidator;
import at.sozvers.noegkk.focus.service.kva.abzsuc.AngehoerigeService;
import at.sozvers.noegkk.focus.service.kva.abzsuc.VersicherterService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.*;
import org.mockito.junit.MockitoJUnitRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class AbzsucControllerTest {

  @InjectMocks
  private AbzsucController               controller;
  @Mock
  private AngehoerigeBusinessRestMapper  mockedAngehoerigeBusinessRestMapper;
  @Mock
  private AngehoerigeService             mockedAngehoerigeService;
  @Mock
  private FachschluesselValidator        mockedFachschluesselValidator;
  @Mock
  private VersicherterBusinessRestMapper mockedVersicherterBusinessRestMapper;
  @Mock
  private VersicherterService            mockedVersicherterService;

  @Test
  public void test_searchAngehoerige_NULL() throws Exception {
	Mockito.doNothing().when(mockedFachschluesselValidator).validate(null);
	Mockito.when(mockedAngehoerigeService.searchAngehoerigeByFachschluessel(null)).thenReturn(null);
	Mockito.when(mockedAngehoerigeBusinessRestMapper.mapToDtoList(null)).thenReturn(null);

	List<AngehoerigeDTO> actual = controller.searchAngehoerige(null);

	assertThat(actual).isNull();
  }

  @Test
  public void test_searchAngehoerige_empty() throws Exception {
	Mockito.doNothing().when(mockedFachschluesselValidator).validate(Mockito.any());
	List<AngehoerigeBTO> btoList = new ArrayList<>();
	Mockito.when(mockedAngehoerigeService.searchAngehoerigeByFachschluessel(Mockito.any())).thenReturn(btoList);
	List<AngehoerigeDTO> dtoList = new ArrayList<>();
	Mockito.when(mockedAngehoerigeBusinessRestMapper.mapToDtoList(btoList)).thenReturn(dtoList);

	Fachschluessel       fachschluessel = new Fachschluessel("4107071288", "VSNR");
	List<AngehoerigeDTO> actual         = controller.searchAngehoerige(fachschluessel);

	assertThat(actual).isEmpty();
  }

  @Test
  public void test_searchAngehoerige_values() throws Exception {
	Mockito.doNothing().when(mockedFachschluesselValidator).validate(Mockito.any());

	List<AngehoerigeBTO> btoList = new ArrayList<>();
	AngehoerigeBTO       bto     = new AngehoerigeBTO();
	bto.setVorname("Max");
	bto.setNachname("Mustermann");
	bto.setTyp("VSNR");
	bto.setVersicherungsnummer("4107071288");
	btoList.add(bto);
	Mockito.when(mockedAngehoerigeService.searchAngehoerigeByFachschluessel(Mockito.any())).thenReturn(btoList);

	List<AngehoerigeDTO> dtoList = new ArrayList<>();
	AngehoerigeDTO       dto     = new AngehoerigeDTO();
	dto.setVorname("Maxime");
	dto.setNachname("Musterfrau");
	dto.setTyp("VSNR");
	dto.setVersicherungsnummer("1234567890");
	dtoList.add(dto);
	Mockito.when(mockedAngehoerigeBusinessRestMapper.mapToDtoList(btoList)).thenReturn(dtoList);

	Fachschluessel       fachschluessel = new Fachschluessel("4107071288", "VSNR");
	List<AngehoerigeDTO> actual         = controller.searchAngehoerige(fachschluessel);

	assertThat(actual).hasSize(1);
	assertThat(actual.get(0).getVorname()).isEqualTo("Maxime");
	assertThat(actual.get(0).getNachname()).isEqualTo("Musterfrau");
	assertThat(actual.get(0).getTyp()).isEqualTo("VSNR");
	assertThat(actual.get(0).getVersicherungsnummer()).isEqualTo("1234567890");
  }

  @Test
  public void test_searchVersicherter_NULL() throws Exception {
	Mockito.doNothing().when(mockedFachschluesselValidator).validate(null);
	Mockito.when(mockedVersicherterService.searchVersicherteByFachschluessel(null)).thenReturn(null);
	Mockito.when(mockedVersicherterBusinessRestMapper.mapToDtoList(null)).thenReturn(null);

	List<VersicherterDTO> actual = controller.searchVersicherter(null);

	assertThat(actual).isNull();
  }

  @Test
  public void test_searchVersicherter_empty() throws Exception {
	Mockito.doNothing().when(mockedFachschluesselValidator).validate(Mockito.any());
	List<VersicherterBTO> btoList = new ArrayList<>();
	Mockito.when(mockedVersicherterService.searchVersicherteByFachschluessel(Mockito.any())).thenReturn(btoList);
	List<VersicherterDTO> dtoList = new ArrayList<>();
	Mockito.when(mockedVersicherterBusinessRestMapper.mapToDtoList(btoList)).thenReturn(dtoList);

	Fachschluessel        fachschluessel = new Fachschluessel("4107071288", "VSNR");
	List<VersicherterDTO> actual         = controller.searchVersicherter(fachschluessel);

	assertThat(actual).isEmpty();
  }

  @Test
  public void test_searchVersicherter_values() throws Exception {
	Mockito.doNothing().when(mockedFachschluesselValidator).validate(Mockito.any());

	List<VersicherterBTO> btoList = new ArrayList<>();
	VersicherterBTO       bto     = new VersicherterBTO();
	bto.setVorname("Max");
	bto.setNachname("Mustermann");
	bto.setTyp("VSNR");
	bto.setVersicherungsnummer("4107071288");
	btoList.add(bto);
	Mockito.when(mockedVersicherterService.searchVersicherteByFachschluessel(Mockito.any())).thenReturn(btoList);

	List<VersicherterDTO> dtoList = new ArrayList<>();
	VersicherterDTO       dto     = new VersicherterDTO();
	dto.setVorname("Maxime");
	dto.setNachname("Musterfrau");
	dto.setTyp("VSNR");
	dto.setVersicherungsnummer("1234567890");
	dtoList.add(dto);
	Mockito.when(mockedVersicherterBusinessRestMapper.mapToDtoList(btoList)).thenReturn(dtoList);

	Fachschluessel        fachschluessel = new Fachschluessel("4107071288", "VSNR");
	List<VersicherterDTO> actual         = controller.searchVersicherter(fachschluessel);

	assertThat(actual).hasSize(1);
	assertThat(actual.get(0).getVorname()).isEqualTo("Maxime");
	assertThat(actual.get(0).getNachname()).isEqualTo("Musterfrau");
	assertThat(actual.get(0).getTyp()).isEqualTo("VSNR");
	assertThat(actual.get(0).getVersicherungsnummer()).isEqualTo("1234567890");
  }
}
