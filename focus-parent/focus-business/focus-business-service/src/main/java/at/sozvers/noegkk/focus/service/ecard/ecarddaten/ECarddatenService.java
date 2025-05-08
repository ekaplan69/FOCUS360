package at.sozvers.noegkk.focus.service.ecard.ecarddaten;

import java.time.LocalDate;
import at.siemens.ecard.server.onlineservices.valueobject.*;
import at.sozvers.focus.persistence.focus.dao.FocusSteuerungDAO;
import at.sozvers.noegkk.focus.service.api.ecard.ECarddatenBTO;
import at.sozvers.noegkk.focus.service.common.*;
import at.sozvers.noegkk.focus.ws.client.ecard.*;
import jakarta.inject.Inject;

public class ECarddatenService {

  @Inject
  @ECardService
  private ECardClient                        eCardClient;
  @Inject
  private ECarddatenBTOExternalServiceMapper eCarddatenBTOExternalServiceMapper;
  @Inject
  private ECarddatenRequestFactory           eCarddatenRequestFactory;
  @Inject
  private FocusSteuerungDAO                  focusfocusSteuerungDAO;

  public ECarddatenBTO searchEcardByFachschluessel(Fachschluessel fachschluessel) {

	ECardAuskunftV2Req  request = eCarddatenRequestFactory.eCardAuskunft(fachschluessel.getFachschluessel());
	ECardAuskunftV2Resp response;

	try {
	  response = eCardClient.eCardAuskunft(request);
	} catch(Exception e) {
	  throw new SubsystemNotAvailableException(e);
	}

	return eCarddatenBTOExternalServiceMapper.map(response);
  }

  public LocalDate searchLetzteKonsultationDatum(Fachschluessel fachschluessel) {
	int                                  konsultationAb = focusfocusSteuerungDAO.getEcardStartZeitraum();
	SVPersonKonsultationenAuskunftV4Req  request        = eCarddatenRequestFactory.konsultationenAuskunftV4Req(fachschluessel.getFachschluessel(), konsultationAb);
	SVPersonKonsultationenAuskunftV4Resp resp;

	try {
	  resp = eCardClient.svPersonKonsultationenAuskunftV4(request);
	} catch(Exception e) {
	  throw new SubsystemNotAvailableException(e);
	}

	if(!resp.getSVPersonKonsultation().isEmpty()) {
	  return DateUtil.toLocalDateFromFormatDDMMYYYY(resp.getSVPersonKonsultation().get(0).getKonDatum());
	} else {
	  return null;
	}
  }
}
