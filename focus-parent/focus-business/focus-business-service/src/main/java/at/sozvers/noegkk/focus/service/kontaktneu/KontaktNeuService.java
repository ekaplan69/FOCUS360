package at.sozvers.noegkk.focus.service.kontaktneu;

import java.util.*;
import at.itsv.noegkk.commons.RequestHeadersCommons;
import at.sozvers.noegkk.focus.service.api.common.MeldungBTO;
import at.sozvers.noegkk.focus.service.api.kontaktneu.*;
import at.sozvers.noegkk.focus.service.common.Fachschluessel;
import at.sozvers.noegkk.focus.service.common.SubsystemNotAvailableException;
import at.sozvers.noegkk.focus.service.context.Messages;
import at.sozvers.noegkk.focus.ws.client.kontakt.*;
import at.sozvers.noegkk.sckont.kontakt.focus.*;
import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class KontaktNeuService {

  @Inject
  private GueltigeOesBTOExternalServiceMapper             gueltigeOesBTOExternalServiceMapper;
  @Inject
  private KontaktAbschlussartBTOExternalServiceMapper     kontaktAbschlussartBTOExternalServiceMapper;
  @Inject
  private KontaktAufgabengebietBTOExternalServiceMapper   kontaktAufgabengebietBTOExternalServiceMapper;
  @Inject
  private KontaktAufggAaMstMapBTOExternalServiceMapper    kontaktAufggAaMstMapBTOExternalServiceMapper;
  @Inject
  private KontaktAufggKtMstMapBTOExternalServiceMapper    kontaktAufggKtMstMapBTOExternalServiceMapper;
  @Inject
  private KontaktAufggSubMapBTOExternalServiceMapper      kontaktAufggSubMapBTOExternalServiceMapper;
  @Inject
  private KontaktAufggThemaMstBTOExternalServiceMapper    kontaktAufggThemaMstBTOExternalServiceMapper;
  @Inject
  private KontaktBTOExternalServiceMapper                 kontaktBTOExternalServiceMapper;
  @Inject
  private KontaktBasicBTOExternalServiceMapper            kontaktBasicBTOExternalServiceMapper;
  @Inject
  @KontaktWS
  private KontaktClient                                   kontaktClient;
  @Inject
  private KontaktErstellenAendernBTOExternalServiceMapper kontaktErstellenAendernBTOExternalServiceMapper;
  @Inject
  private KontaktHistorieBTOExternalServiceMapper         kontaktHistorieBTOExternalServiceMapper;
  @Inject
  private KontaktThemaBTOExternalServiceMapper            kontaktThemaBTOExternalServiceMapper;
  @Inject
  private KontaktUnterthemenBTOExternalServiceMapper      kontaktUnterthemenBTOExternalServiceMapper;
  @Inject
  private KontaktartBTOExternalServiceMapper              kontaktartBTOExternalServiceMapper;
  @Inject
  private Messages                                        messages;
  @Inject
  private RequestHeadersCommons                           requestHeaders;

  public Long deleteKontakt(Long id) {
	KontaktkontaktLoeschenRequest request = new KontaktkontaktLoeschenRequest();
	request.setId(id);
	request.setKontext(RqKontextFactory.createRqKontext(requestHeaders));
	request.setQuellSystem(QuellSystemFactory.createQuellSystem());

	try {
	  KontaktkontaktLoeschenResponse response = kontaktClient.kontaktkontaktLoeschen(request);
	  checkReturnInfo(response.getReturnInfo());
	  return response.getAmountDeleted();
	} catch(Exception e) {
	  throw new IllegalArgumentException(e);
	}
  }

  private void checkReturnInfo(ReturnInfo returnInfo) {
	if(!"0".equals(returnInfo.getReturnCode())) {
	  returnInfo.getMeldungen().forEach(m -> messages.getMessages().add(MeldungBTO.of(m.getId(), "Webservice Fehler", m.getText())));
	}
  }

  public List<KontaktHistorieBTO> kontaktHistorieErmitteln(String bearbeiterKennung) {
	if(bearbeiterKennung.isBlank()) {
	  return Collections.emptyList();
	}

	KontaktHistorieErmittelnRequest request = new KontaktHistorieErmittelnRequest();

	request.setMitarbeiterkennung(bearbeiterKennung);
	request.setKontext(RqKontextFactory.createRqKontext(requestHeaders));
	request.setQuellSystem(QuellSystemFactory.createQuellSystem());

	try {
	  KontaktHistorieErmittelnResponse response = kontaktClient.kontaktHistorieErmitteln(request);
	  checkReturnInfo(response.getReturnInfo());

	  return kontaktHistorieBTOExternalServiceMapper.mapToBtoList(response.getKontaktHistorie());
	} catch(Exception e) {
	  throw new RuntimeException(e);
	}
  }

  public List<GueltigeOeBTO> leseGueltigeOesWithoutHeader(String benutzername, List<String> focusRollen) {
	if(focusRollen.isEmpty()) {
	  return Collections.emptyList();
	}

	GueltigeOesErmittelnRequest request = new GueltigeOesErmittelnRequest();

	request.setKontext(RqKontextFactory.createRqKontext(benutzername));
	request.setQuellSystem(QuellSystemFactory.createQuellSystem());

	request.setFocusRollen(focusRollen);

	try {
	  GueltigeOesErmittelnResponse response = kontaktClient.leseGueltigeOes(request);
	  checkReturnInfo(response.getReturnInfo());
	  return gueltigeOesBTOExternalServiceMapper.mapToBtoList(response.getGueltigeOes());
	} catch(Exception e) {
	  throw new RuntimeException(e);
	}
  }

  public Long saveKontakt(KontaktErstellenAendernBTO bto) {
	KontaktkontaktErstellenRequest request = kontaktErstellenAendernBTOExternalServiceMapper.map(bto);

	request.setKontext(RqKontextFactory.createRqKontext(requestHeaders));
	request.setQuellSystem(QuellSystemFactory.createQuellSystem());

	try {
	  KontaktkontaktErstellenResponse response = kontaktClient.kontaktkontaktErstellen(request);
	  checkReturnInfo(response.getReturnInfo());

	  return response.getId();
	} catch(Exception e) {
	  throw new IllegalArgumentException(e);
	}
  }

  public List<KontaktAbschlussartBTO> searchAbschlussarten() {
	KontaktabschlussartErmittelnRequest request = new KontaktabschlussartErmittelnRequest();

	request.setKontext(RqKontextFactory.createRqKontext(requestHeaders));
	request.setQuellSystem(QuellSystemFactory.createQuellSystem());

	try {
	  KontaktabschlussartErmittelnResponse response = kontaktClient.kontaktabschlussartErmitteln(request);
	  checkReturnInfo(response.getReturnInfo());

	  return kontaktAbschlussartBTOExternalServiceMapper.mapToBtoList(response.getKontaktabschlussarten());
	} catch(Exception e) {
	  throw new IllegalArgumentException(e);
	}
  }

  public List<KontaktAufgabengebietBTO> searchAufgabengebiete(Long mst) {
	KontaktaufgabengebietErmittelnRequest request = new KontaktaufgabengebietErmittelnRequest();

	request.setKontext(RqKontextFactory.createRqKontext(requestHeaders));
	request.setQuellSystem(QuellSystemFactory.createQuellSystem());
	request.setMstCode(mst);

	try {
	  KontaktaufgabengebietErmittelnResponse response = kontaktClient.kontaktaufgabengebietErmitteln(request);
	  checkReturnInfo(response.getReturnInfo());

	  return kontaktAufgabengebietBTOExternalServiceMapper.mapToBtoList(response.getKontaktaufgabengebiete());
	} catch(Exception e) {
	  throw new IllegalArgumentException(e);
	}
  }

  public List<KontaktAufgabengebietBTO> searchAufgabengebieteWithoutHeader(String benutzername, Long mst) {
	KontaktaufgabengebietErmittelnRequest request = new KontaktaufgabengebietErmittelnRequest();

	request.setKontext(RqKontextFactory.createRqKontext(benutzername));
	request.setQuellSystem(QuellSystemFactory.createQuellSystem());
	request.setMstCode(mst);

	try {
	  KontaktaufgabengebietErmittelnResponse response = kontaktClient.kontaktaufgabengebietErmitteln(request);
	  checkReturnInfo(response.getReturnInfo());

	  return kontaktAufgabengebietBTOExternalServiceMapper.mapToBtoList(response.getKontaktaufgabengebiete());
	} catch(Exception e) {
	  throw new IllegalArgumentException(e);
	}
  }

  public KontaktBTO searchKontakt(Long kontaktId) {
	KontaktkontaktLesenRequest request = new KontaktkontaktLesenRequest();

	request.setId(kontaktId);
	request.setKontext(RqKontextFactory.createRqKontext(requestHeaders));
	request.setQuellSystem(QuellSystemFactory.createQuellSystem());

	try {
	  KontaktkontaktLesenResponse response = kontaktClient.kontaktkontaktLesen(request);
	  checkReturnInfo(response.getReturnInfo());

	  return kontaktBTOExternalServiceMapper.map(response.getKontaktkontakt());
	} catch(Exception e) {
	  throw new RuntimeException(e);
	}
  }

  public List<KontaktAufggAaMstMapBTO> searchKontaktAufggAaMapping(Long mstCode) {
	KontaktAufggAaMstMapErmittelnRequest request = new KontaktAufggAaMstMapErmittelnRequest();

	request.setMstCode(mstCode);
	request.setKontext(RqKontextFactory.createRqKontext(requestHeaders));
	request.setQuellSystem(QuellSystemFactory.createQuellSystem());

	try {
	  KontaktAufggAaMstMapErmittelnResponse response = kontaktClient.kontaktAufggAaMstMapErmitteln(request);
	  checkReturnInfo(response.getReturnInfo());

	  return kontaktAufggAaMstMapBTOExternalServiceMapper.mapToBtoList(response.getKontaktAufggAaMstMapList());
	} catch(Exception e) {
	  throw new IllegalArgumentException(e);
	}
  }

  public List<KontaktAufggKtMstMapBTO> searchKontaktAufggKtMapping(Long mstCode) {
	KontaktAufggKtMstMapErmittelnRequest request = new KontaktAufggKtMstMapErmittelnRequest();

	request.setMstCode(mstCode);
	request.setKontext(RqKontextFactory.createRqKontext(requestHeaders));
	request.setQuellSystem(QuellSystemFactory.createQuellSystem());

	try {
	  KontaktAufggKtMstMapErmittelnResponse response = kontaktClient.kontaktAufggKtMstMapErmitteln(request);
	  checkReturnInfo(response.getReturnInfo());

	  return kontaktAufggKtMstMapBTOExternalServiceMapper.mapToBtoList(response.getKontaktAufggKtMstMapList());
	} catch(Exception e) {
	  throw new IllegalArgumentException(e);
	}
  }

  public List<KontaktAufggSubMapBTO> searchKontaktAufggSubMaps(Long aufgabengebietId) {
	KontaktAufggSubMapErmittelnRequest request = new KontaktAufggSubMapErmittelnRequest();

	request.setAufgabengebietId(aufgabengebietId);
	request.setKontext(RqKontextFactory.createRqKontext(requestHeaders));
	request.setQuellSystem(QuellSystemFactory.createQuellSystem());

	try {
	  KontaktAufggSubMapErmittelnReponse response = kontaktClient.kontaktAufggSubMapsErmitteln(request);
	  checkReturnInfo(response.getReturnInfo());

	  if(response.getKontaktAufggSubMaps() == null) {
		return Collections.emptyList();
	  }
	  return kontaktAufggSubMapBTOExternalServiceMapper.mapToBtoList(response.getKontaktAufggSubMaps());
	} catch(Exception e) {
	  throw new IllegalArgumentException(e);
	}
  }

  public List<KontaktAufggThemaMstBTO> searchKontaktAufggThemaMapping(Long mstCode) {
	KontaktAufggThemaMstMapErmittelnRequest request = new KontaktAufggThemaMstMapErmittelnRequest();

	request.setMstCode(mstCode);
	request.setKontext(RqKontextFactory.createRqKontext(requestHeaders));
	request.setQuellSystem(QuellSystemFactory.createQuellSystem());

	try {
	  KontaktAufggThemaMstMapErmittelnResponse response = kontaktClient.kontaktAufggThemaMstMapErmitteln(request);
	  checkReturnInfo(response.getReturnInfo());

	  return kontaktAufggThemaMstBTOExternalServiceMapper.mapToBtoList(response.getKontaktAufggThemaMstMapList());
	} catch(Exception e) {
	  throw new IllegalArgumentException(e);
	}
  }

  public KontaktBTO searchKontaktWithoutHeader(Long kontaktId) {
	KontaktkontaktLesenRequest request = new KontaktkontaktLesenRequest();

	request.setId(kontaktId);
	request.setKontext(RqKontextFactory.createRqKontext(kontaktId.toString()));
	request.setQuellSystem(QuellSystemFactory.createQuellSystem());

	try {
	  KontaktkontaktLesenResponse response = kontaktClient.kontaktkontaktLesen(request);
	  checkReturnInfo(response.getReturnInfo());

	  return kontaktBTOExternalServiceMapper.map(response.getKontaktkontakt());
	} catch(Exception e) {
	  throw new IllegalStateException(e);
	}
  }

  public List<KontaktKontaktartBTO> searchKontaktarten() {
	KontaktkontaktartErmittelnRequest request = new KontaktkontaktartErmittelnRequest();

	request.setKontext(RqKontextFactory.createRqKontext(requestHeaders));
	request.setQuellSystem(QuellSystemFactory.createQuellSystem());

	try {
	  KontaktkontaktartErmittelnResponse response = kontaktClient.kontaktkontaktartErmitteln(request);
	  checkReturnInfo(response.getReturnInfo());

	  return kontaktartBTOExternalServiceMapper.mapToBtoList(response.getKontaktkontaktarten());
	} catch(Exception e) {
	  throw new IllegalArgumentException(e);
	}
  }

  public List<KontaktBasicBTO> searchKontakte(Fachschluessel fs) {
	KontaktkontaktErmittelnRequest request = new KontaktkontaktErmittelnRequest();

	request.setFachschluessel(fs.getFachschluessel());
	request.setFachschlusselArtKurz(fs.getFachschluesselArt());
	request.setKontext(RqKontextFactory.createRqKontext(requestHeaders));
	request.setQuellSystem(QuellSystemFactory.createQuellSystem());

	try {
	  KontaktkontaktErmittelnResponse response = kontaktClient.kontaktkontaktErmitteln(request);
	  checkReturnInfo(response.getReturnInfo());

	  return kontaktBasicBTOExternalServiceMapper.mapToBtoList(response.getKontaktkontakteKurz());
	} catch(Exception e) {
	  throw new SubsystemNotAvailableException(e);
	}
  }

  public List<KontaktBasicBTO> searchOffeneKontakte(String ersteller) {
	OffeneKontakteErmittelnRequest request = new OffeneKontakteErmittelnRequest();

	request.setErsteller(ersteller);
	request.setKontext(RqKontextFactory.createRqKontext(ersteller));
	request.setQuellSystem(QuellSystemFactory.createQuellSystem());

	try {
	  OffeneKontakteErmittelnResponse response = kontaktClient.offenekontaktErmitteln(request);
	  checkReturnInfo(response.getReturnInfo());
	  if(response.getKontakte() == null) {
		return new ArrayList<>();
	  }

	  return kontaktBasicBTOExternalServiceMapper.mapToBtoList(response.getKontakte());
	} catch(Exception e) {
	  throw new RuntimeException(e);
	}
  }

  public List<KontaktBasicBTO> searchOffeneKontakteForFs(String fs, String fsArt) {
	OffeneKontakteErmittelnForFSRequest request = new OffeneKontakteErmittelnForFSRequest();

	request.setFs(fs);
	request.setFsart(fsArt);
	request.setKontext(RqKontextFactory.createRqKontext(requestHeaders));
	request.setQuellSystem(QuellSystemFactory.createQuellSystem());

	try {
	  OffeneKontakteErmittelnForFSResponse response = kontaktClient.offenekontaktErmittelnForFs(request);
	  checkReturnInfo(response.getReturnInfo());
	  if(response.getKontakte() == null) {
		return new ArrayList<>();
	  }

	  return kontaktBasicBTOExternalServiceMapper.mapToBtoList(response.getKontakte());
	} catch(Exception e) {
	  throw new RuntimeException(e);
	}
  }

  public List<KontaktThemaBTO> searchThemen() {
	KontaktthemaErmittelnRequest request = new KontaktthemaErmittelnRequest();

	request.setKontext(RqKontextFactory.createRqKontext(requestHeaders));
	request.setQuellSystem(QuellSystemFactory.createQuellSystem());

	try {
	  KontaktthemaErmittelnResponse response = kontaktClient.kontaktthemaErmitteln(request);
	  checkReturnInfo(response.getReturnInfo());

	  return kontaktThemaBTOExternalServiceMapper.mapToBtoList(response.getKontaktthemen());
	} catch(Exception e) {
	  throw new IllegalArgumentException(e);
	}
  }

  public List<KontaktUnterthemaBTO> searchUnterthemen() {
	KontaktUnterthemenErmittelnRequest request = new KontaktUnterthemenErmittelnRequest();

	request.setKontext(RqKontextFactory.createRqKontext(requestHeaders));
	request.setQuellSystem(QuellSystemFactory.createQuellSystem());

	try {
	  KontaktUnterthemenErmittelnResponse response = kontaktClient.kontaktUnterthemenErmitteln(request);
	  checkReturnInfo(response.getReturnInfo());

	  return kontaktUnterthemenBTOExternalServiceMapper.mapToBtoList(response.getUnterthemen());
	} catch(Exception e) {
	  throw new IllegalArgumentException(e);
	}
  }

  public Long updateKontakt(KontaktErstellenAendernBTO bto) {
	KontaktkontaktAendernRequest request = kontaktErstellenAendernBTOExternalServiceMapper.mapUpdate(bto);

	request.setKontext(RqKontextFactory.createRqKontext(requestHeaders));
	request.setQuellSystem(QuellSystemFactory.createQuellSystem());

	try {
	  KontaktkontaktAendernResponse response = kontaktClient.kontaktkontaktAendern(request);
	  checkReturnInfo(response.getReturnInfo());

	  return response.getUpdatecount();
	} catch(Exception e) {
	  throw new SubsystemNotAvailableException(e);
	}
  }
}
