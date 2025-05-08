package at.sozvers.noegkk.focus.service.ecard.ecarddaten;

import java.time.LocalDate;
import at.siemens.ecard.server.onlineservices.valueobject.*;
import at.sozvers.focus.persistence.focus.dao.FocusSteuerungDAO;
import at.sozvers.noegkk.focus.service.api.ecard.ECarddatenBTO;
import at.sozvers.noegkk.focus.service.common.Fachschluessel;
import at.sozvers.noegkk.focus.service.common.SubsystemNotAvailableException;
import at.sozvers.noegkk.focus.ws.client.ecard.ECardClient;
import at.sozvers.noegkk.focus.ws.client.ecard.ECarddatenRequestFactory;
import jakarta.persistence.EntityManager;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.exceptions.base.MockitoException;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class ECarddatenServiceTest {

  private final Fachschluessel                     fs = Fachschluessel.of("5436211194", "VSNR");
  @Mock
  private       ECarddatenBTOExternalServiceMapper eCarddatenBTOExternalServiceMapper;
  @Mock
  private       ECarddatenRequestFactory           eCarddatenRequestFactory;
  @Mock
  private       EntityManager                      em;
  @Mock
  private       ECardClient                        mockedEcardClient;
  @InjectMocks
  private       ECarddatenService                  service;
  @Mock
  private       FocusSteuerungDAO                  steuerungDAO;

  @Test
  void test_searchEcardByFachschluessel() {
	Mockito.when(eCarddatenRequestFactory.eCardAuskunft(Mockito.any())).thenReturn(null);

	ECardAuskunftV2Resp response = createECardAuskunftResponse();
	Mockito.when(mockedEcardClient.eCardAuskunft(Mockito.any())).thenReturn(response);

	ECarddatenBTO eCardBTO = new ECarddatenBTO();
	eCardBTO.setLaufnummer(response.getECards().get(0).getEkvk());
	eCardBTO.setAusstellungsDatum(LocalDate.of(2019, 1, 1));
	Mockito.when(eCarddatenBTOExternalServiceMapper.map(Mockito.any(ECardAuskunftV2Resp.class))).thenReturn(eCardBTO);

	ECarddatenBTO bto = service.searchEcardByFachschluessel(fs);

	assertNotNull(bto);
  }

  private ECardAuskunftV2Resp createECardAuskunftResponse() {
	ECardAuskunftV2Resp auskunftRespSpy = Mockito.spy(ECardAuskunftV2Resp.class);
	auskunftRespSpy.setAnzahl(1);

	Mockito.when(auskunftRespSpy.getECards()).thenReturn(ECardUtils.createECardList());

	return auskunftRespSpy;
  }

  @Test
  void test_searchEcardByFachschluessel_throwsException() {
	// ECardClient client call will throw an exception, so we have a subsystem not
	// available case
	Mockito.when(mockedEcardClient.eCardAuskunft(Mockito.any())).thenThrow(MockitoException.class);
	assertThrows(SubsystemNotAvailableException.class, () -> service.searchEcardByFachschluessel(fs));
  }

  @Test
  void test_searchLetzteKonsultationDatum_throwsException() {
	// ECardClient client call will throw an exception, so we have a subsystem not
	// available case
	Mockito.when(mockedEcardClient.svPersonKonsultationenAuskunftV4(Mockito.any())).thenThrow(MockitoException.class);
	assertThrows(SubsystemNotAvailableException.class, () -> service.searchLetzteKonsultationDatum(fs));
  }

  @Test
  void test_searchLetzteKonsultationenDatum() {
	SVPersonKonsultationenAuskunftV4Resp response = new SVPersonKonsultationenAuskunftV4Resp();
	response.setAnzahl(1);
	response.setFehleranzahl(0);
	SVPersonKonsultationV2 konsultation = new SVPersonKonsultationV2();
	konsultation.setKonDatum("01012019");
	response.getSVPersonKonsultation().add(konsultation);

	Mockito.when(mockedEcardClient.svPersonKonsultationenAuskunftV4(Mockito.any())).thenReturn(response);

	assertEquals(LocalDate.of(2019, 1, 1), service.searchLetzteKonsultationDatum(fs));
  }
}
