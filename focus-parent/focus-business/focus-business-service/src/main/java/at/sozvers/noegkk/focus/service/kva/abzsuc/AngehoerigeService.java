package at.sozvers.noegkk.focus.service.kva.abzsuc;

import javax.xml.datatype.DatatypeConfigurationException;
import java.util.List;
import at.itsv.noegkk.commons.RequestHeadersCommons;
import at.sozvers.focus.persistence.focus.FocusSteuerung;
import at.sozvers.focus.persistence.focus.dao.FocusMeldendestelleDAO;
import at.sozvers.kva.schema.angehoerigenbeziehung.suchen.*;
import at.sozvers.noegkk.focus.service.api.kva.abzsuc.AngehoerigeBTO;
import at.sozvers.noegkk.focus.service.common.Fachschluessel;
import at.sozvers.noegkk.focus.service.common.SubsystemNotAvailableException;
import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class AngehoerigeService extends AbzsucService {
  @Inject
  private AngehoerigeBTOExternalServiceMapper angehoerigeBTOExternalServiceMapper;
  @Inject
  private FocusMeldendestelleDAO              dao;
  @Inject
  private RequestHeadersCommons               requestHeadersCommons;

  public List<AngehoerigeBTO> searchAngehoerigeByFachschluessel(Fachschluessel fachschluessel) throws DatatypeConfigurationException {
	FocusSteuerung focusSteuerung = getFocusSteuerungQueryResult("ANGEHORIGE_BEENDET_ZEITRAUM_START");

	AngehoerigenBeziehungErmittelnRequest  request = abzsucLesenRequestFactory.createAbzsucRequest_2_0(fachschluessel.getFachschluessel(), focusSteuerung.getWert());
	AngehoerigenBeziehungErmittelnResponse response;
	try {
	  response = kvaAbzsucClient.sucheAngehoerige_2_0(request, requestHeadersCommons);
	} catch(Exception e) {
	  throw new SubsystemNotAvailableException(e);
	}

	response.getAngehoerigenBeziehungen().stream().forEach(this::setMeldendeStelleForDTO);
	return angehoerigeBTOExternalServiceMapper.mapAngehoerigenBeziehungToBTOList(response.getAngehoerigenBeziehungen());
  }

  private void setMeldendeStelleForDTO(AngehoerigenBeziehungDTO dto) {
	if((dto.getMeldendeStelle() == null || dto.getMeldendeStelle().equalsIgnoreCase(""))) {
	  dto.setMeldendeStelle("");
	} else {
	  dto.setMeldendeStelle(dao.getMeldendestelleKurzbezeichnung(dto.getMeldendeStelle(), true));
	}
  }
}
