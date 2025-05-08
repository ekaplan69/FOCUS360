package at.sozvers.noegkk.focus.service.beschwerde;

import at.itsv.noegkk.commons.RequestHeadersCommons;
import at.sozvers.noegkk.focus.service.api.beschwerde.BeschwerdeUpdateBTO;
import at.sozvers.noegkk.focus.service.common.DateUtil;
import at.sozvers.noegkk.focus.service.mapping.BTOExternalServiceMapper;
import at.sozvers.noegkk.focus.ws.client.beschwerde.QuellSystemFactory;
import at.sozvers.noegkk.focus.ws.client.beschwerde.RqKontextFactory;
import at.sozvers.noegkk.sckont.beschwerde.focus.BeschwerdeAendernRequest;
import jakarta.inject.Inject;

public class BeschwerdeUpdateBTOExternalServiceMapper extends BTOExternalServiceMapper<BeschwerdeUpdateBTO, BeschwerdeAendernRequest> {

  @Inject
  private RequestHeadersCommons requestHeaders;

  @Override
  public BeschwerdeAendernRequest map(BeschwerdeUpdateBTO bto) {
	BeschwerdeAendernRequest request = new BeschwerdeAendernRequest();

	request.setId(bto.getBeschwerdeId());
	request.setUpdatecount(bto.getUpdatecount());
	request.setBeschreibung(bto.getBeschreibung());
	request.setBeschwerdegrundAnmerkung(bto.getBeschwerdegrundAnmerkung());
	request.setEmail(bto.getEmail());
	request.setFachbereichDetailId(bto.getFachbereichDetailId());
	request.setFachschluessel(bto.getFachschluessel());
	request.setFachschluesselArt(bto.getFachschluesselArt());
	request.setKanalId(bto.getKanalId());
	request.setKontaktpunktId(bto.getKontaktpunktId());
	request.setMassnahmen(bto.getMassnahmen());
	request.setMeldendeStelleId(bto.getMeldendeStelleId());
	request.setMitarbeiterkennung(bto.getMitarbeiterkennung());
	request.setMitarbeitername(bto.getMitarbeitername());
	request.setStatusId(bto.getStatusId());
	request.setTelefon(bto.getTelefon());
	request.setZeitpunkt(DateUtil.toXMLGregorianCalendar(bto.getZeitpunkt()));
	request.setKontext(RqKontextFactory.createRqKontext(requestHeaders));
	request.setQuellSystem(QuellSystemFactory.createQuellSystem());
	request.getBeschwerdegruende().addAll(bto.getBeschwerdegruendeIds());

	return request;
  }
}
