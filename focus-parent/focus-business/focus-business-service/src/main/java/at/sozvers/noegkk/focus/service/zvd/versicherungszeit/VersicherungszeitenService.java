package at.sozvers.noegkk.focus.service.zvd.versicherungszeit;

import javax.xml.datatype.DatatypeConfigurationException;
import java.util.ArrayList;
import java.util.List;
import at.sozialversicherung.schema.zpv.ibs.partnerlesenkurz_15_0.*;
import at.sozvers.focus.persistence.QueryConstants;
import at.sozvers.focus.persistence.focus.FocusQualifikation;
import at.sozvers.focus.persistence.focus.FocusSteuerung;
import at.sozvers.focus.persistence.focus.dao.FocusMeldendestelleDAO;
import at.sozvers.noegkk.focus.service.api.zvd.VersicherungsverhaeltnisBTO;
import at.sozvers.noegkk.focus.service.common.Fachschluessel;
import at.sozvers.noegkk.focus.service.common.SubsystemNotAvailableException;
import at.sozvers.noegkk.focus.service.zpv.infrastructure.ZPVService;
import at.sozvers.noegkk.focus.service.zpv.infrastructure.ZpvCaller;
import at.sozvers.noegkk.focus.service.zpv.person.DtoPartnerListeLEKIFactory;
import at.sozvers.noegkk.focus.service.zvd.infrastructure.VersicherungsverhaeltnisLesenRequestFactory;
import at.sozvers.noegkk.focus.service.zvd.infrastructure.ZVDService;
import at.sozvers.noegkk.focus.ws.client.zvd.ZvdClient;
import at.sozvers.noegkk.jsszpvbe2.action.ZPVServices;
import at.sozvers.zvd.ws.versicherungsverhaeltnisselesenservice.v3.types.*;
import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;
import jakarta.persistence.*;

@Dependent
public class VersicherungszeitenService {

  @Inject
  private FocusMeldendestelleDAO                              dao;
  @Inject
  private DtoPartnerListeLEKIFactory                          dtoPartnerListeLEKIFactory;
  @Inject
  private EntityManager                                       em;
  @Inject
  private ZpvCaller<DtoPartnerListeLEKI, DtoPartnerListeLEKO> partnerLesenKurzZpvCaller;
  @Inject
  private VersicherungsverhaeltnisBTOExternalServiceMapper    versicherungsverhaeltnisBTOExternalServiceMapper;
  @Inject
  private VersicherungsverhaeltnisLesenRequestFactory         versicherungsverhaeltnisLesenRequestFactory;
  @Inject
  @ZPVService
  private ZPVServices                                         zpvServices;
  @Inject
  @ZVDService
  private ZvdClient                                           zvdClient;

  public String getQualifikationKurz(String qualifikation) {
	FocusQualifikation queryResult = getFocusQualifikationQueryResult(qualifikation.trim());

	if(queryResult == null || queryResult.getKurzbeschreibung() == null) {
	  return qualifikation;
	} else {
	  return queryResult.getKurzbeschreibung();
	}
  }

  protected FocusQualifikation getFocusQualifikationQueryResult(String qualifikation) {
	TypedQuery<FocusQualifikation> query = em.createNamedQuery(FocusQualifikation.QUERY_QUALIFIKATION_ZU_QUALIFIKATIONSCODE, FocusQualifikation.class);
	query.setParameter(QueryConstants.QUERY_PARAMETER_QUALIFIKATIONSCODE, qualifikation);
	try {
	  return query.getSingleResult();
	} catch(NoResultException e) {
	  return null;
	}
  }

  public String searchDienstgebername(Fachschluessel fachschluessel) {
	DtoPartnerListeLEKI dtoPartnerListeLEKI = dtoPartnerListeLEKIFactory.createDtoPartnerListeLEKIWithFachschluessel(fachschluessel);
	DtoPartnerListeLEKO dtoPartnerListeLEKO;
	try {
	  dtoPartnerListeLEKO = partnerLesenKurzZpvCaller.call(zpvServices::partnerLesenKurz_15_0, dtoPartnerListeLEKI);
	} catch(Exception e) {
	  throw new SubsystemNotAvailableException(e);
	}

	return getDienstgebernameFromDto(getDtoPartnerKurzFromLekoList(dtoPartnerListeLEKO));
  }

  private String getDienstgebernameFromDto(DtoPartnerKurz dtoPartnerKurz) {
	if(dtoPartnerKurz == null) {
	  return null;
	} else {
	  DtoNamenszusammenfassungDiakritisch namen = dtoPartnerKurz.getDtoNamenszusammenfassungDiakritisch();
	  if(namen.getNamenzeileDiakritisch2() == null) {
		return namen.getNamenzeileDiakritisch1();
	  } else {
		return namen.getNamenzeileDiakritisch1() + " " + namen.getNamenzeileDiakritisch2();
	  }
	}
  }

  private DtoPartnerKurz getDtoPartnerKurzFromLekoList(DtoPartnerListeLEKO dtoPartnerListeLEKO) {
	List<DtoPartnerLEKO> dtoPartnerLEKOList = dtoPartnerListeLEKO.getDtoPartnerLEKOListe();
	if(dtoPartnerLEKOList == null || dtoPartnerLEKOList.isEmpty()) {
	  return null;
	} else {
	  return dtoPartnerLEKOList.get(0).getDtoPartnerKurz();
	}
  }

  public List<VersicherungsverhaeltnisBTO> searchVersicherungsverhaeltnisseByFachschluessel(Fachschluessel fachschluessel) throws DatatypeConfigurationException {
	FocusSteuerung focusSteuerung = getFocusSteuerungQueryResult("VERSICHERUNG_BEENDET_ZEITRAUM_START");

	VersicherungsverhaeltnisseLesenRequest request = versicherungsverhaeltnisLesenRequestFactory.createVersicherungsverhaeltnisLesenRequest(fachschluessel.getFachschluessel(),
																																			focusSteuerung.getWert());
	VersicherungsverhaeltnisseLesenResponse response;
	try {
	  response = zvdClient.versicherungsVerhaeltnisseLesen_3_0(request);
	} catch(Exception e) {
	  throw new SubsystemNotAvailableException(e);
	}

	Versicherungsverhaeltnisse versicherungsverhaeltnisse = response.getVersicherungsverhaeltnisse();
	return mapVersicherungsverhaeltnisseToBTOList(versicherungsverhaeltnisse);
  }

  public FocusSteuerung getFocusSteuerungQueryResult(String parameter) {
	TypedQuery<FocusSteuerung> query = em.createNamedQuery(FocusSteuerung.QUERY_STEUERUNG_PARAMETER, FocusSteuerung.class);
	query.setParameter(QueryConstants.QUERY_PARAMETER_PARAMETER, parameter);

	return query.getSingleResult();
  }

  private List<VersicherungsverhaeltnisBTO> mapVersicherungsverhaeltnisseToBTOList(Versicherungsverhaeltnisse versicherungsverhaeltnisse) {
	List<VersicherungsverhaeltnisBTO> versicherungsverhaeltnisBTOList = new ArrayList<>();
	for(Versicherungsverhaeltnis versicherungsverhaeltnis : versicherungsverhaeltnisse.getVersicherungsverhaeltnis()) {
	  versicherungsverhaeltnisBTOList.add(versicherungsverhaeltnisBTOExternalServiceMapper.map(versicherungsverhaeltnis));
	}
	return versicherungsverhaeltnisBTOList;
  }
}


