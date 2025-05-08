package at.sozvers.noegkk.focus.kva.abzsuc;

import java.util.ArrayList;
import java.util.List;
import at.sozvers.focus.persistence.focus.FocusSteuerung;
import at.sozvers.focus.persistence.focus.dao.FocusMeldendestelleDAO;
import at.sozvers.kva.schema.angehoerigenbeziehung.suchen.AngehoerigenBeziehungDTO;
import at.sozvers.kva.schema.angehoerigenbeziehung.suchen.AngehoerigenBeziehungErmittelnResponse;
import at.sozvers.noegkk.focus.service.api.kva.abzsuc.VersicherterBTO;
import at.sozvers.noegkk.focus.service.common.Fachschluessel;
import at.sozvers.noegkk.focus.service.common.SubsystemNotAvailableException;
import at.sozvers.noegkk.focus.service.kva.abzsuc.VersicherterBTOExternalServiceMapper;
import at.sozvers.noegkk.focus.service.kva.abzsuc.VersicherterService;
import at.sozvers.noegkk.focus.ws.client.kva.abzsuc.AbzsucLesenRequestFactory;
import at.sozvers.noegkk.focus.ws.client.kva.abzsuc.KvaAbzsucClient;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.doReturn;

@ExtendWith(MockitoExtension.class)
class VersicherterServiceTest {

  @Mock
  private AbzsucLesenRequestFactory            mockedAbzsucLesenRequestFactory;
  @Mock
  private FocusMeldendestelleDAO               mockedDao;
  @Mock
  private EntityManager                        mockedEm;
  @Mock
  private KvaAbzsucClient                      mockedKvaAbzsucClient;
  @Mock
  private VersicherterBTOExternalServiceMapper mockedVersicherterBTOExternalServiceMapper;
  @InjectMocks
  private VersicherterService                  service;
  @Spy
  private TypedQuery<FocusSteuerung>           tq;

  @Test
  void test_searchAngehoerigeByFachschluessel_1Vers() throws Exception {
	Fachschluessel fs = Fachschluessel.of("1111111111", "VSNR");

	AngehoerigenBeziehungDTO dto1 = new AngehoerigenBeziehungDTO();
	dto1.setVsnrVers("2233220281");
	dto1.setVorname("Karl");
	dto1.setFamname("Heinz");
	dto1.setMeldendeStelle("ORGIT");
	AngehoerigenBeziehungErmittelnResponse response = new AngehoerigenBeziehungErmittelnResponse();
	response.getAngehoerigenBeziehungen().add(dto1);
	Mockito.when(mockedKvaAbzsucClient.sucheVersicherte_2_0(Mockito.any(), Mockito.any())).thenReturn(response);

	VersicherterBTO versicherter = new VersicherterBTO();
	versicherter.setVorname(dto1.getVorname());
	versicherter.setNachname(dto1.getFamname());
	versicherter.setMeldendeStelle(dto1.getMeldendeStelle());
	versicherter.setVersicherungsnummer(dto1.getVsnrVers());
	versicherter.setTyp("VERS");

	List<VersicherterBTO> btoList = new ArrayList<>();
	btoList.add(versicherter);

	Mockito.when(mockedVersicherterBTOExternalServiceMapper.mapAngehoerigenBeziehungToBTOList(Mockito.any(List.class))).thenReturn(btoList);

	FocusSteuerung steuerung = new FocusSteuerung();
	steuerung.setWert("180");
	Mockito.when(mockedEm.createNamedQuery(FocusSteuerung.QUERY_STEUERUNG_PARAMETER, FocusSteuerung.class)).thenReturn(tq);
	doReturn(steuerung).when(tq).getSingleResult();

	List<VersicherterBTO> btoResultList = service.searchVersicherteByFachschluessel(fs);
	assertEquals(1, btoResultList.size());
	assertEquals("Karl", btoResultList.get(0).getVorname());
	assertEquals("Heinz", btoResultList.get(0).getNachname());
	assertEquals("ORGIT", btoResultList.get(0).getMeldendeStelle());
	assertEquals("2233220281", btoResultList.get(0).getVersicherungsnummer());
	assertEquals("VERS", btoResultList.get(0).getTyp());
  }

  @Test
  void test_searchAngehoerigeByFachschluessel_1Vers_storniert() throws Exception {
	Fachschluessel fs = Fachschluessel.of("1111111111", "VSNR");

	AngehoerigenBeziehungDTO dto2 = new AngehoerigenBeziehungDTO();
	dto2.setVsnrVers("2233220281");
	dto2.setVorname("Samuel");
	dto2.setFamname("Storno");
	dto2.setMeldendeStelle("LA");
	dto2.setAbzStatusKz("s");

	AngehoerigenBeziehungErmittelnResponse response = new AngehoerigenBeziehungErmittelnResponse();
	response.getAngehoerigenBeziehungen().add(dto2);
	Mockito.when(mockedKvaAbzsucClient.sucheVersicherte_2_0(Mockito.any(), Mockito.any())).thenReturn(response);

	FocusSteuerung steuerung = new FocusSteuerung();
	steuerung.setWert("180");
	Mockito.when(mockedEm.createNamedQuery(FocusSteuerung.QUERY_STEUERUNG_PARAMETER, FocusSteuerung.class)).thenReturn(tq);
	doReturn(steuerung).when(tq).getSingleResult();

	List<VersicherterBTO> btoList = service.searchVersicherteByFachschluessel(fs);
	assertEquals(0, btoList.size());
  }

  @Test
  void test_searchAngehoerigeByFachschluessel_1Vers_und_1Vers_storniert() throws Exception {
	Fachschluessel fs = Fachschluessel.of("1111111111", "VSNR");

	AngehoerigenBeziehungDTO dto1 = new AngehoerigenBeziehungDTO();
	dto1.setVsnrVers("2233220281");
	dto1.setVorname("Karl");
	dto1.setFamname("Heinz");
	dto1.setMeldendeStelle("ORGIT");

	AngehoerigenBeziehungDTO dto2 = new AngehoerigenBeziehungDTO();
	dto2.setVsnrVers("2233220281");
	dto2.setVorname("Samuel");
	dto2.setFamname("Storno");
	dto2.setMeldendeStelle("LA");
	dto2.setAbzStatusKz("s");

	AngehoerigenBeziehungErmittelnResponse response = new AngehoerigenBeziehungErmittelnResponse();
	response.getAngehoerigenBeziehungen().add(dto1);
	response.getAngehoerigenBeziehungen().add(dto2);
	Mockito.when(mockedKvaAbzsucClient.sucheVersicherte_2_0(Mockito.any(), Mockito.any())).thenReturn(response);

	VersicherterBTO versicherter = new VersicherterBTO();
	versicherter.setVorname(dto1.getVorname());
	versicherter.setNachname(dto1.getFamname());
	versicherter.setMeldendeStelle(dto1.getMeldendeStelle());
	versicherter.setVersicherungsnummer(dto1.getVsnrVers());
	versicherter.setTyp("VERS");

	List<VersicherterBTO> btoList = new ArrayList<>();
	btoList.add(versicherter);

	Mockito.when(mockedVersicherterBTOExternalServiceMapper.mapAngehoerigenBeziehungToBTOList(Mockito.any(List.class))).thenReturn(btoList);

	FocusSteuerung steuerung = new FocusSteuerung();
	steuerung.setWert("180");
	Mockito.when(mockedEm.createNamedQuery(FocusSteuerung.QUERY_STEUERUNG_PARAMETER, FocusSteuerung.class)).thenReturn(tq);
	doReturn(steuerung).when(tq).getSingleResult();

	List<VersicherterBTO> btoResultList = service.searchVersicherteByFachschluessel(fs);
	assertEquals(1, btoResultList.size());
	assertEquals("Karl", btoResultList.get(0).getVorname());
	assertEquals("Heinz", btoResultList.get(0).getNachname());
	assertEquals("ORGIT", btoResultList.get(0).getMeldendeStelle());
	assertEquals("2233220281", btoResultList.get(0).getVersicherungsnummer());
	assertEquals("VERS", btoResultList.get(0).getTyp());
  }

  @Test
  void test_searchVersicherteByFachschluessel__throwsException() throws Exception {
	Fachschluessel fs = Fachschluessel.of("1111111111", "VSNR");

	FocusSteuerung steuerung = new FocusSteuerung();
	steuerung.setWert("180");

	Mockito.when(mockedKvaAbzsucClient.sucheVersicherte_2_0(Mockito.any(), Mockito.any())).thenThrow(SubsystemNotAvailableException.class);
	Mockito.when(mockedEm.createNamedQuery(FocusSteuerung.QUERY_STEUERUNG_PARAMETER, FocusSteuerung.class)).thenReturn(tq);
	doReturn(steuerung).when(tq).getSingleResult();

	assertThrows(SubsystemNotAvailableException.class, () -> service.searchVersicherteByFachschluessel(fs));
  }
}
