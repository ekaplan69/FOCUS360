package at.sozvers.noegkk.focus.service.lgkk;

import javax.xml.datatype.DatatypeConfigurationException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import at.sozvers.focus.persistence.QueryConstants;
import at.sozvers.focus.persistence.focus.FocusSteuerung;
import at.sozvers.noegkk.focus.service.api.common.MeldungBTO;
import at.sozvers.noegkk.focus.service.api.kva.gbfsuc.GebuehrenbefreiungBTO;
import at.sozvers.noegkk.focus.service.api.lgkk.DokumenteBTO;
import at.sozvers.noegkk.focus.service.api.lgkk.LeistungenBTO;
import at.sozvers.noegkk.focus.service.common.*;
import at.sozvers.noegkk.focus.service.kva.gbfsuc.GebuehrenbefreiungService;
import at.sozvers.noegkk.focus.service.lgkk.mapper.DokumenteBTOExternalServiceMapper;
import at.sozvers.noegkk.focus.service.lgkk.mapper.LeistungenBTOExternalServiceMapper;
import at.sozvers.noegkk.focus.ws.client.lgkk.LgkkClient;
import at.sozvers.service.lgkk.infrastructure.LgkkService;
import at.sozvers.service.lgkk.infrastructure.SucheLgkkFaelleRequestFactory;
import at.sozvers.stp.lgkk.webservice.focus360.v20.*;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

public class LeistungService {

  @Inject
  private DokumenteBTOExternalServiceMapper dokumenteBTOExternalServiceMapper;
  @Inject
  private EntityManager                     em;

  @Inject
  private GebuehrenbefreiungService          gbService;
  @Inject
  private LeistungenBTOExternalServiceMapper leistungenBTOExternalServiceMapper;
  @Inject
  @LgkkService
  private LgkkClient                         lgkkClient;
  @Inject
  private SucheLgkkFaelleRequestFactory      sucheLgkkFaelleRequestFactory;

  public DokumenteBTO leseDokumente(String vsnr) {
	FocusSteuerung focusSteuerung = getFocusSteuerungQueryResult("VERSICHERUNG_BEENDET_ZEITRAUM_START");

	SucheLGKDokumenteV1 serviceInput = sucheLgkkFaelleRequestFactory.createRequest(vsnr, DateUtil.toXMLGregorianCalendar(LocalDateTime.now().minusDays(Long.valueOf(focusSteuerung.getWert()))));
	return dokumenteBTOExternalServiceMapper.map(leseLGKDokumente(serviceInput));
  }

  public FocusSteuerung getFocusSteuerungQueryResult(String parameter) {
	TypedQuery<FocusSteuerung> query = em.createNamedQuery(FocusSteuerung.QUERY_STEUERUNG_PARAMETER, FocusSteuerung.class);
	query.setParameter(QueryConstants.QUERY_PARAMETER_PARAMETER, parameter);

	return query.getSingleResult();
  }

  private SucheLGKDokumenteV1Response leseLGKDokumente(SucheLGKDokumenteV1 serviceInput) {
	SucheLGKDokumenteV1Response serviceResponse = lgkkClient.sucheLGKKDokumenteV1(serviceInput);

	if(!serviceResponse.getReturn().getMeldungen().getFehlerMeldungListe().isEmpty() || !serviceResponse.getReturn().getMeldungen().getSystemfehlerMeldungListe().isEmpty()) {
	  throw buildSubSubsystemNotAvailableException(serviceResponse.getReturn().getMeldungen());
	}

	return serviceResponse;
  }

  private SubSubSystemNotAvailable buildSubSubsystemNotAvailableException(Meldungen meldungen) {
	StringBuilder exceptionString = new StringBuilder("Schnittstelle lieferte Fehler zurück: \n");

	for(Meldung m : meldungen.getFehlerMeldungListe()) {
	  exceptionString.append(m.getText()).append(" \n");
	}

	for(Meldung m : meldungen.getSystemfehlerMeldungListe()) {
	  exceptionString.append(m.getText()).append(" \n");
	}

	return new SubSubSystemNotAvailable(exceptionString.toString());
  }

  public LeistungenBTO leseLeistungen(String vsnr, Double personPid, List<Integer> landesStellen) throws DatatypeConfigurationException {
	SucheLGKFaelleV2 serviceInput = sucheLgkkFaelleRequestFactory.createRequest(vsnr, personPid, landesStellen);
	List<GebuehrenbefreiungBTO> gblist = gbService.searchGebuehrenbefreiungenByFachschluessel(new Fachschluessel(vsnr, "VSNR")).stream().filter(n -> n.getBefreiung().equals("Rezeptgebührenbefreiung"))
												  .toList();
	SucheLGKFaelleV2Response response = leseLeistungenRaw(serviceInput);
	LeistungenBTO            lbto     = leistungenBTOExternalServiceMapper.map(response);
	if(response.getReturn().getMeldungen() != null && (response.getReturn().getMeldungen().getFehlerMeldungListe() != null && !response.getReturn().getMeldungen().getFehlerMeldungListe()
																																	   .isEmpty()) || response.getReturn().getMeldungen()
																																							  .getSystemfehlerMeldungListe() != null && !response.getReturn()
																																																				 .getMeldungen()
																																																				 .getSystemfehlerMeldungListe()
																																																				 .isEmpty()) {
	  List<MeldungBTO> meldungBTOList = new ArrayList<>();
	  MeldungBTO       bto;
	  for(Meldung m : response.getReturn().getMeldungen().getFehlerMeldungListe()) {
		bto = MeldungBTO.of(m.getId(), m.getKategorie().value(), m.getText());
		meldungBTOList.add(bto);
	  }
	  lbto.setMeldungen(meldungBTOList);
	}
	lbto.setGbs(gblist);
	return lbto;
  }

  private SucheLGKFaelleV2Response leseLeistungenRaw(SucheLGKFaelleV2 serviceInput) {
	return lgkkClient.sucheLGKKFaelleV2(serviceInput);
  }

  public LeistungenBTO leseLeistungenDSGVO(String vsnr, Double personPid, List<Integer> landesStellen) throws DatatypeConfigurationException {
	SucheLGKFaelleV2         serviceInput = sucheLgkkFaelleRequestFactory.createRequestDSGVO(vsnr, personPid, landesStellen);
	SucheLGKFaelleV2Response response     = leseLeistungenRaw(serviceInput);
	LeistungenBTO            lbto         = leistungenBTOExternalServiceMapper.map(response);
	if(response.getReturn().getMeldungen() != null && (response.getReturn().getMeldungen().getFehlerMeldungListe() != null && !response.getReturn().getMeldungen().getFehlerMeldungListe()
																																	   .isEmpty()) || response.getReturn().getMeldungen()
																																							  .getSystemfehlerMeldungListe() != null && !response.getReturn()
																																																				 .getMeldungen()
																																																				 .getSystemfehlerMeldungListe()
																																																				 .isEmpty()) {
	  List<MeldungBTO> meldungBTOList = new ArrayList<>();
	  MeldungBTO       bto;
	  for(Meldung m : response.getReturn().getMeldungen().getFehlerMeldungListe()) {
		bto = MeldungBTO.of(m.getId(), m.getKategorie().value(), m.getText());
		meldungBTOList.add(bto);
	  }
	  lbto.setMeldungen(meldungBTOList);
	}
	return lbto;
  }
}
