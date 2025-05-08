package at.sozvers.noegkk.focus.service.zugriffsprotokollierung;

import java.util.*;
import at.sozvers.noegkk.architektur.zup.model.Zugriffsprotokoll;
import at.sozvers.noegkk.focus.service.api.zugriffsprotokollierung.ZugriffsprotokollBTO;
import at.sozvers.noegkk.focus.ws.client.zup.ZupClient;
import com.oracle.xmlns.zupws.ResponseStatusEnum;
import com.oracle.xmlns.zupws.ZupwsProcessResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class ZugriffsprotokollierungServiceTest {

  @Mock
  private ZugriffsprotokollBTOEntityMapper          mockMapperBtoEntity;
  @Mock
  private ZugriffsprotokollBTOExternalServiceMapper mockMapperBtoExternalService;
  @Mock
  private ZupClient                                 mockZupClient;
  @InjectMocks
  private ZugriffsprotokollierungService            zugriffsprotokollierung;

  //Tests for Zugriffsprotokollierung.ermittleUnverarbeiteteProtkollsaetze

  @Test
  void testErmittleUnverarbeiteteProtkollsaetzeKeineDatensaetze() {
	ZugriffsprotokollierungService zugriffsprotokollierungSpy = Mockito.spy(zugriffsprotokollierung);
	List<Zugriffsprotokoll>        zugriffsprotokolle         = new ArrayList<>();

	Mockito.doReturn(zugriffsprotokolle).when(zugriffsprotokollierungSpy).getProtkollsaetzeForZup(Mockito.anyInt());

	List<ZugriffsprotokollBTO> output = zugriffsprotokollierungSpy.ermittleUnverarbeiteteProtkollsaetze(500);

	assertEquals(0, output.size());
  }

  @Test
  void testErmittleUnverarbeiteteProtkollsaetzeMitDatensaetze() {
	ZugriffsprotokollierungService zugriffsprotokollierungSpy = Mockito.spy(zugriffsprotokollierung);
	List<Zugriffsprotokoll>        zugriffsprotokolle         = new ArrayList<>();
	zugriffsprotokolle.add(new Zugriffsprotokoll());

	Mockito.doReturn(zugriffsprotokolle).when(zugriffsprotokollierungSpy).getProtkollsaetzeForZup(Mockito.anyInt());
	Mockito.doReturn(Arrays.asList(new ZugriffsprotokollBTO())).when(mockMapperBtoEntity).mapToBtoList(Mockito.any());

	List<ZugriffsprotokollBTO> output = zugriffsprotokollierungSpy.ermittleUnverarbeiteteProtkollsaetze(500);

	assertEquals(1, output.size());
  }

  //Tests for Zugriffsprotokollierung.uebermittleProtokollsaetze

  @Test
  void testUebermittleProtokollsaetzeResponseException() {
	ZugriffsprotokollierungService zugriffsprotokollierungSpy = Mockito.spy(zugriffsprotokollierung);
	Mockito.doNothing().when(zugriffsprotokollierungSpy).vermerkeFehlerAmProtkollsatz(Mockito.any(), Mockito.any());

	Mockito.doThrow(new RuntimeException()).when(mockZupClient).process(Mockito.any());

	zugriffsprotokollierungSpy.uebermittleProtokollsaetze(Arrays.asList(new ZugriffsprotokollBTO()));
  }

  @Test
  void testUebermittleProtokollsaetzeResponseNotOk() {
	ZugriffsprotokollierungService zugriffsprotokollierungSpy = Mockito.spy(zugriffsprotokollierung);
	Mockito.doNothing().when(zugriffsprotokollierungSpy).vermerkeFehlerAmProtkollsatz(Mockito.any(), Mockito.any());
	Mockito.doReturn(createZupResponseNotOk()).when(mockZupClient).process(Mockito.any());

	zugriffsprotokollierungSpy.uebermittleProtokollsaetze(Arrays.asList(new ZugriffsprotokollBTO()));
  }

  private ZupwsProcessResponse createZupResponseNotOk() {
	ZupwsProcessResponse response = new ZupwsProcessResponse();
	response.setFehlerCode("ESB_S_103");
	response.setStatus(ResponseStatusEnum.E);
	return response;
  }

  @Test
  void testUebermittleProtokollsaetzeResponseOk() {
	ZugriffsprotokollierungService zugriffsprotokollierungSpy = Mockito.spy(zugriffsprotokollierung);
	Mockito.doNothing().when(zugriffsprotokollierungSpy).bestaetigeProtokollsatz(Mockito.any());
	Mockito.doReturn(createZupResponseOk()).when(mockZupClient).process(Mockito.any());

	zugriffsprotokollierungSpy.uebermittleProtokollsaetze(Arrays.asList(new ZugriffsprotokollBTO()));
  }

  private ZupwsProcessResponse createZupResponseOk() {
	ZupwsProcessResponse response = new ZupwsProcessResponse();
	response.setFehlerCode("ESB_S_100");
	response.setStatus(ResponseStatusEnum.S);
	return response;
  }
}
