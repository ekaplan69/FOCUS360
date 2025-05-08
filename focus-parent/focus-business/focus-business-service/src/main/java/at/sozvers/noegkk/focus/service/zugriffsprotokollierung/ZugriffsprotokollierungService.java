package at.sozvers.noegkk.focus.service.zugriffsprotokollierung;

import java.util.*;
import at.sozvers.noegkk.architektur.zup.model.Zugriffsprotokoll;
import at.sozvers.noegkk.focus.service.api.zugriffsprotokollierung.ZugriffsprotokollBTO;
import at.sozvers.noegkk.focus.service.api.zugriffsprotokollierung.Zugriffsprotokollierung;
import at.sozvers.noegkk.focus.service.common.CollectionUtil;
import at.sozvers.noegkk.focus.ws.client.zup.ZupClient;
import com.oracle.xmlns.zupws.ResponseStatusEnum;
import com.oracle.xmlns.zupws.ZupwsProcessResponse;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import org.slf4j.Logger;

public class ZugriffsprotokollierungService implements Zugriffsprotokollierung {

  @Inject
  private EntityManager                             em;
  @Inject
  private Logger                                    log;
  @Inject
  private ZugriffsprotokollBTOEntityMapper          mapperBTOEntity;
  @Inject
  private ZugriffsprotokollBTOExternalServiceMapper mapperBTOExternalService;
  @Inject
  private ZupClient                                 zupClient;

  @Override
  public List<ZugriffsprotokollBTO> ermittleUnverarbeiteteProtkollsaetze(int limit) {
	List<Zugriffsprotokoll> limitProtokollsaetze = getProtkollsaetzeForZup(limit);

	if(CollectionUtil.isNotEmpty(limitProtokollsaetze)) {
	  return mapperBTOEntity.mapToBtoList(limitProtokollsaetze);
	}

	return new ArrayList<>();
  }

  @Override
  public void uebermittleProtokollsaetze(List<ZugriffsprotokollBTO> input) {
	try {
	  ZupwsProcessResponse zupwsProcessResponse = zupClient.process(mapperBTOExternalService.mapToDtoList(input));

	  if(!isResponseOk(zupwsProcessResponse)) {
		input.forEach(protokoll -> vermerkeFehlerAmProtkollsatz(protokoll.getZupId(), zupwsProcessResponse.getFehlerCode()));
	  } else {
		input.forEach(protokoll -> bestaetigeProtokollsatz(protokoll.getZupId()));
	  }
	} catch(Exception e) {
	  input.forEach(protokoll -> vermerkeFehlerAmProtkollsatz(protokoll.getZupId(), e.getMessage()));
	}
  }

  protected boolean isResponseOk(ZupwsProcessResponse zupwsProcessResponse) {
	return (zupwsProcessResponse.getFehlerCode().equals("ESB_S_100") && zupwsProcessResponse.getStatus().equals(ResponseStatusEnum.S));
  }

  protected void vermerkeFehlerAmProtkollsatz(Long protokollId, String fehlertext) {
	Zugriffsprotokoll protokollsatz = em.find(Zugriffsprotokoll.class, protokollId);

	if(fehlertext != null && fehlertext.length() > 150) {
	  protokollsatz.setFehlertext(fehlertext.substring(0, 150));
	} else {
	  protokollsatz.setFehlertext(fehlertext);
	}

	protokollsatz.setVerarbeitetjn("N");
	protokollsatz.setVerarbdat(new Date());
	em.merge(protokollsatz);
  }

  protected void bestaetigeProtokollsatz(Long protokollId) {
	Zugriffsprotokoll protokollsatz = em.find(Zugriffsprotokoll.class, protokollId);
	protokollsatz.setVerarbeitetjn("J");
	protokollsatz.setVerarbdat(new Date());
	em.merge(protokollsatz);
  }

  protected List<Zugriffsprotokoll> getProtkollsaetzeForZup(int limit) {

	List<Zugriffsprotokoll> unverarbeiteteProtkollsaetze = em.createNamedQuery(Zugriffsprotokoll.QUERY_SELECT_ZUPROWS, Zugriffsprotokoll.class).setParameter(Zugriffsprotokoll.PARAM_VERARBEITETJN, "N")
															 .setMaxResults(limit).getResultList();

	if(CollectionUtil.isNotEmpty(unverarbeiteteProtkollsaetze)) {
	  log.info("Anzahl ermittelter unverarbeiteter Protokollsätze: " + unverarbeiteteProtkollsaetze.size() + " (MaxPackageSize: " + limit + ")");
	  return unverarbeiteteProtkollsaetze;
	} else {
	  log.info("Es gibt keine unverarbeiteten Protokollsätze.");
	  return new ArrayList<>();
	}
  }
}
