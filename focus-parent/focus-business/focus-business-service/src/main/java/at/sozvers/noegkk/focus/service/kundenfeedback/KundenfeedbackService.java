package at.sozvers.noegkk.focus.service.kundenfeedback;

import java.util.List;
import at.itsv.noegkk.commons.RequestHeadersCommons;
import at.sozvers.noegkk.focus.service.api.common.MeldungBTO;
import at.sozvers.noegkk.focus.service.api.kundenfeedback.*;
import at.sozvers.noegkk.focus.service.common.Fachschluessel;
import at.sozvers.noegkk.focus.service.context.Messages;
import at.sozvers.noegkk.focus.service.kundenfeedback.mapping.*;
import at.sozvers.noegkk.focus.ws.client.kundenfeedback.*;
import at.sozvers.noegkk.sckont.kundenfeedback.focus.*;
import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class KundenfeedbackService {
  @Inject
  @FeedbackWS
  private FeedbackClient                              feedbackClient;
  @Inject
  private KfFeedbackAendernBTOExternalServiceMapper   kfFeedbackAendernBTOExternalServiceMapper;
  @Inject
  private KfFeedbackErstellenBTOExternalServiceMapper kfFeedbackErstellenBTOExternalServiceMapper;
  @Inject
  private KfFeedbackKurzBTOExternalServiceMapper      kfFeedbackKurzBTOExternalServiceMapper;
  @Inject
  private KfFeedbackLangBTOExternalServiceMapper      kfFeedbackLangBTOExternalServiceMapper;
  @Inject
  private KfFeedbackgrundBTOExternalServiceMapper     kfFeedbackgrundBTOExternalServiceMapper;
  @Inject
  private KfThemaBTOExternalServiceMapper             kfThemaBTOExternalServiceMapper;
  @Inject
  private KfThemaFbgMapBTOExternalServiceMapper       kfThemaFbgMapBTOExternalServiceMapper;
  @Inject
  private KfUnterkategorieBTOExternalServiceMapper    kfUnterkategorieBTOExternalServiceMapper;
  @Inject
  private KfUnterkategorieFbgMapExternalServiceMapper kfUnterkategorieFbgMapExternalServiceMapper;
  @Inject
  private Messages                                    messages;
  @Inject
  private RequestHeadersCommons                       requestHeaders;

  public Long createFeedback(KundenfeedbackErstellenBTO bto) {
	KfFeedbackErstellenRequest request = kfFeedbackErstellenBTOExternalServiceMapper.map(bto);
	request.setStatus(0);
	request.setKontext(RqKontextFactory.createRqKontext(requestHeaders));
	request.setQuellSystem(QuellSystemFactory.createQuellSystem());
	try {
	  KfFeedbackErstellenResponse response = feedbackClient.kfFeedbackErstellen(request);
	  checkReturnInfo(response.getReturnInfo());

	  return response.getId();
	} catch(Exception e) {
	  throw new RuntimeException(e);
	}
  }

  private void checkReturnInfo(ReturnInfo returnInfo) {
	if(!"0".equals(returnInfo.getReturnCode())) {
	  returnInfo.getMeldungen().forEach(m -> messages.getMessages().add(MeldungBTO.of(m.getId(), "Webservice Fehler", m.getText())));
	}
  }

  public List<KundenfeedbackKurzBTO> searchFeedbackKurz(Fachschluessel fachschluessel, String ersteller) {
	KfFeedbackKurzListeErmittelnRequest request = new KfFeedbackKurzListeErmittelnRequest();
	request.setErsteller(ersteller);
	if(fachschluessel != null) {
	  request.setFs(fachschluessel.getFachschluessel());
	  request.setFsArtKurz(fachschluessel.getFachschluesselArt());
	}
	request.setKontext(RqKontextFactory.createRqKontext(requestHeaders));
	request.setQuellSystem(QuellSystemFactory.createQuellSystem());
	try {
	  KfFeedbackKurzListeErmittelnResponse response = feedbackClient.kfFeedbackKurzListeErmitteln(request);
	  checkReturnInfo(response.getReturnInfo());

	  return kfFeedbackKurzBTOExternalServiceMapper.mapToBtoList(response.getFeedbackKurzListe());
	} catch(Exception e) {
	  throw new RuntimeException(e);
	}
  }

  public KundenfeedbackLangBTO searchFeedbackLang(Long id) {
	KfFeedbackLangErmittelnRequest request = new KfFeedbackLangErmittelnRequest();
	request.setId(id);
	request.setKontext(RqKontextFactory.createRqKontext(requestHeaders));
	request.setQuellSystem(QuellSystemFactory.createQuellSystem());
	try {
	  KfFeedbackLangErmittelnResponse response = feedbackClient.kfFeedbackLangErmitteln(request);
	  checkReturnInfo(response.getReturnInfo());

	  return kfFeedbackLangBTOExternalServiceMapper.map(response.getKfFeedbackLang());
	} catch(Exception e) {
	  throw new RuntimeException(e);
	}
  }

  public List<KundenfeedbackFeedbackgrundBTO> searchFeedbackgruende() {
	KfFeedbackgruendeErmittelnRequest request = new KfFeedbackgruendeErmittelnRequest();
	request.setKontext(RqKontextFactory.createRqKontext(requestHeaders));
	request.setQuellSystem(QuellSystemFactory.createQuellSystem());
	try {
	  KfFeedbackgreundeErmittelnResponse response = feedbackClient.kfFeedbackgreundeErmitteln(request);
	  checkReturnInfo(response.getReturnInfo());

	  return kfFeedbackgrundBTOExternalServiceMapper.mapToBtoList(response.getFeedbackgruende());
	} catch(Exception e) {
	  throw new RuntimeException(e);
	}
  }

  public List<KundenfeedbackThemaFbgMapBTO> searchThemaFbgMaps() {
	KfThemaFbgMapsErmittelnRequest request = new KfThemaFbgMapsErmittelnRequest();
	request.setKontext(RqKontextFactory.createRqKontext(requestHeaders));
	request.setQuellSystem(QuellSystemFactory.createQuellSystem());
	try {
	  KfThemaFbgMapsErmittelnResponse response = feedbackClient.kfThemaFbgMapsErmitteln(request);
	  checkReturnInfo(response.getReturnInfo());

	  return kfThemaFbgMapBTOExternalServiceMapper.mapToBtoList(response.getKfThemaFbgMaps());
	} catch(Exception e) {
	  throw new RuntimeException(e);
	}
  }

  public List<KundenfeedbackThemaBTO> searchThemen() {
	KfThemenErmittelnRequest request = new KfThemenErmittelnRequest();
	request.setKontext(RqKontextFactory.createRqKontext(requestHeaders));
	request.setQuellSystem(QuellSystemFactory.createQuellSystem());
	try {
	  KfThemenErmittelnResponse response = feedbackClient.kfThemenErmitteln(request);
	  checkReturnInfo(response.getReturnInfo());

	  return kfThemaBTOExternalServiceMapper.mapToBtoList(response.getKfThemen());
	} catch(Exception e) {
	  throw new RuntimeException(e);
	}
  }

  public List<KundenfeedbackUnterkategorieFbgMapBTO> searchUnterkategorieFbgMaps() {
	KfUnterkategorieFbgMapsErmittelnRequest request = new KfUnterkategorieFbgMapsErmittelnRequest();
	request.setKontext(RqKontextFactory.createRqKontext(requestHeaders));
	request.setQuellSystem(QuellSystemFactory.createQuellSystem());
	try {
	  KfUnterkategorieFbgMapsErmittelnResponse response = feedbackClient.kfUnterkategorieFbgMapsErmitteln(request);
	  checkReturnInfo(response.getReturnInfo());

	  return kfUnterkategorieFbgMapExternalServiceMapper.mapToBtoList(response.getKfUnterkategorieFbgMaps());
	} catch(Exception e) {
	  throw new RuntimeException(e);
	}
  }

  public List<KundenfeedbackUnterkategorieBTO> searchUnterkategorien() {
	KfUnterkategorienErmittelnRequest request = new KfUnterkategorienErmittelnRequest();
	request.setKontext(RqKontextFactory.createRqKontext(requestHeaders));
	request.setQuellSystem(QuellSystemFactory.createQuellSystem());
	try {
	  KfUnterkategorienErmittelnResponse response = feedbackClient.kfUnterkategorienErmitteln(request);
	  checkReturnInfo(response.getReturnInfo());

	  return kfUnterkategorieBTOExternalServiceMapper.mapToBtoList(response.getKfUnterkategorien());
	} catch(Exception e) {
	  throw new RuntimeException(e);
	}
  }

  public Long updateFeedback(KundenfeedbackAendernBTO bto) {
	KfFeedbackAendernRequest request = kfFeedbackAendernBTOExternalServiceMapper.map(bto);
	request.setKontext(RqKontextFactory.createRqKontext(requestHeaders));
	request.setQuellSystem(QuellSystemFactory.createQuellSystem());
	try {
	  KfFeedbackAendernResponse response = feedbackClient.kfFeedbackAendern(request);
	  checkReturnInfo(response.getReturnInfo());

	  return response.getUpdatecount();
	} catch(Exception e) {
	  throw new RuntimeException(e);
	}
  }
}
