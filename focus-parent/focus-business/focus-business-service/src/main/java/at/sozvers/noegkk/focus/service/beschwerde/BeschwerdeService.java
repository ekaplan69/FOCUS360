package at.sozvers.noegkk.focus.service.beschwerde;

import javax.xml.datatype.DatatypeFactory;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import at.itsv.noegkk.commons.RequestHeadersCommons;
import at.sozvers.focus.persistence.focus.FocusSteuerung;
import at.sozvers.focus.persistence.focus.dao.FocusSteuerungDAO;
import at.sozvers.noegkk.focus.service.api.beschwerde.*;
import at.sozvers.noegkk.focus.service.api.common.MeldungBTO;
import at.sozvers.noegkk.focus.service.common.*;
import at.sozvers.noegkk.focus.service.context.Messages;
import at.sozvers.noegkk.focus.ws.client.beschwerde.*;
import at.sozvers.noegkk.sckont.beschwerde.focus.*;
import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class BeschwerdeService {
  @Inject
  private BeschwerdeBTOExternalServiceMapper           beschwerdeBTOExternalServiceMapper;
  @Inject
  private BeschwerdeBereichBTOExternalServiceMapper    beschwerdeBereichBTOExternalServiceMapper;
  @Inject
  @BeschwerdeWS
  private BeschwerdeClient                             beschwerdeClient;
  @Inject
  private BeschwerdeDetailBTOExternalServiceMapper     beschwerdeDetailBTOExternalServiceMapper;
  @Inject
  private BeschwerdeInsertBTOExternalServiceMapper     beschwerdeInsertBTOExternalServiceMapper;
  @Inject
  private BeschwerdeStornierenBTOExternalServiceMapper beschwerdeStornierenBTOExternalServiceMapper;
  @Inject
  private BeschwerdeUpdateBTOExternalServiceMapper     beschwerdeUpdateBTOExternalServiceMapper;
  @Inject
  private FocusSteuerungDAO                            focusSteuerungDAO;
  @Inject
  private Messages                                     messages;
  @Inject
  private RequestHeadersCommons                        requestHeaders;
  @Inject
  private RequestHeadersCommons                        requestHeadersCommons;

  public Long createBeschwerde(BeschwerdeInsertBTO beschwerdeInsertBTO) {
	BeschwerdeErstellenRequest  request  = beschwerdeInsertBTOExternalServiceMapper.map(beschwerdeInsertBTO);
	BeschwerdeErstellenResponse response = beschwerdeClient.beschwerdeErstellen(request);
	checkReturnInfo(response.getReturnInfo());
	return response.getId();
  }

  private void checkReturnInfo(ReturnInfo returnInfo) {
	if(!"0".equals(returnInfo.getReturnCode())) {
	  returnInfo.getMeldungen().forEach(m -> messages.getMessages().add(MeldungBTO.of(m.getId(), "Webservice Fehler", m.getText())));
	}
  }

  public BeschwerdeDetailBTO searchBeschwerde(Long beschwerdeId) {
	BeschwerdeLesenRequest request = new BeschwerdeLesenRequest();
	request.setId(beschwerdeId);
	request.setKontext(RqKontextFactory.createRqKontext(requestHeaders));
	request.setQuellSystem(QuellSystemFactory.createQuellSystem());

	try {
	  BeschwerdeLesenResponse response = beschwerdeClient.beschwerdeLesen(request);
	  checkReturnInfo(response.getReturnInfo());
	  return beschwerdeDetailBTOExternalServiceMapper.map(response.getBeschwerde());
	} catch(Exception e) {
	  throw new SubsystemNotAvailableException(e);
	}
  }

  public List<BeschwerdeBTO> searchBeschwerdeListe(Fachschluessel fs) {
	BeschwerdenErmittelnRequest request = new BeschwerdenErmittelnRequest();
	request.setFachschluessel(fs.getFachschluessel());
	request.setFachschluesselArt(fs.getFachschluesselArt());
	request.setKontext(RqKontextFactory.createRqKontext(requestHeaders));
	request.setQuellSystem(QuellSystemFactory.createQuellSystem());

	try {
	  FocusSteuerung focusSteuerung = focusSteuerungDAO.getFocusSteuerungQueryResult(FocusSteuerungDAO.BESCHWERDE_ERMITTLUNG_ZEITRAUM_START);
	  request.setStichtagDat(DatatypeFactory.newInstance().newXMLGregorianCalendar(LocalDate.now().minusDays(Long.parseLong(focusSteuerung.getWert())).toString()));

	  BeschwerdenErmittelnResponse response = beschwerdeClient.beschwerdenErmitteln(request);
	  checkReturnInfo(response.getReturnInfo());
	  return beschwerdeBTOExternalServiceMapper.mapToBtoList(response.getBeschwerden());
	} catch(Exception e) {
	  throw new SubsystemNotAvailableException(e);
	}
  }

  public List<BeschwerdeBereichBTO> searchBeschwerdebereich(Long oeId, String bereOrg, Date abfrageDat) {
	BeschwerdebereichErmittelnRequest request = new BeschwerdebereichErmittelnRequest();
	request.setAbfrageDat(DateUtil.convertDate2XMLDate(abfrageDat));
	request.setKontext(RqKontextFactory.createRqKontext(requestHeaders));
	request.setQuellSystem(QuellSystemFactory.createQuellSystem());

	if(oeId != null) {
	  request.setOrgeinheit(oeId);
	} else {
	  request.setBereOrg(bereOrg);
	}

	try {
	  BeschwerdebereichErmittelnResponse response = beschwerdeClient.beschwerdebereichErmitteln(request);
	  checkReturnInfo(response.getReturnInfo());
	  return beschwerdeBereichBTOExternalServiceMapper.mapToBtoList(response.getBeschwerdebereich());
	} catch(Exception e) {
	  throw new SubsystemNotAvailableException(e);
	}
  }

  public void storniereBeschwerde(BeschwerdeStornierenBTO beschwerdeStornierenBTO) {
	BeschwerdeStornierenRequest request = beschwerdeStornierenBTOExternalServiceMapper.map(beschwerdeStornierenBTO);

	try {
	  BeschwerdeStornierenResponse response = beschwerdeClient.beschwerdeStornieren(request);
	  checkReturnInfo(response.getReturnInfo());
	} catch(Exception e) {
	  throw new SubsystemNotAvailableException(e);
	}
  }

  public Long updateBeschwerde(BeschwerdeUpdateBTO beschwerdeUpdateBTO) {
	BeschwerdeAendernRequest request = beschwerdeUpdateBTOExternalServiceMapper.map(beschwerdeUpdateBTO);

	try {
	  BeschwerdeAendernResponse response = beschwerdeClient.beschwerdeAendern(request);
	  checkReturnInfo(response.getReturnInfo());
	  return response.getUpdatecount();
	} catch(Exception e) {
	  throw new SubsystemNotAvailableException(e);
	}
  }
}
