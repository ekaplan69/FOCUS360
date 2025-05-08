package at.sozvers.noegkk.focus.service.beschwerde;

import at.itsv.noegkk.commons.RequestHeadersCommons;
import at.sozvers.noegkk.focus.service.api.beschwerde.BeschwerdeInsertBTO;
import at.sozvers.noegkk.focus.service.common.DateUtil;
import at.sozvers.noegkk.focus.service.mapping.BTOExternalServiceMapper;
import at.sozvers.noegkk.focus.ws.client.beschwerde.QuellSystemFactory;
import at.sozvers.noegkk.focus.ws.client.beschwerde.RqKontextFactory;
import at.sozvers.noegkk.sckont.beschwerde.focus.BeschwerdeErstellenRequest;
import jakarta.inject.Inject;

public class BeschwerdeInsertBTOExternalServiceMapper extends BTOExternalServiceMapper<BeschwerdeInsertBTO, BeschwerdeErstellenRequest> {

  @Inject
  private RequestHeadersCommons requestHeaders;

  @Override
  public BeschwerdeErstellenRequest map(BeschwerdeInsertBTO bto) {
	BeschwerdeErstellenRequest request = new BeschwerdeErstellenRequest();

	request.setBeschreibung(bto.getBeschreibung());
	request.setBeschwerdegrundAnmerkung(bto.getBeschwerdegrundAnmerkung());
	request.setEmail(bto.getEmail());
	request.setFachbereichDetailId(Long.parseLong(bto.getFachbereichDetail()[0].toString()));
	request.setFachschluessel(bto.getFachschluessel());
	request.setFachschluesselArt(bto.getFachschluesselArt());
	request.setKanalId(bto.getKanalId());
	request.setMassnahmen(bto.getMassnahmen());
	request.setMeldendeStelleId(bto.getMeldendeStelleId());
	request.setMitarbeiterkennung(bto.getMitarbeiterkennung());
	request.setMitarbeitername(bto.getMitarbeitername().replace(";", " ")); //Vorname und Nachname wird zu ECM Zwecken mit einem ; getrennt
	request.setStatusId(bto.getStatusId());
	request.setTelefon(bto.getTelefon());
	request.setZeitpunkt(DateUtil.toXMLGregorianCalendar(bto.getZeitpunkt()));
	request.setKontext(RqKontextFactory.createRqKontext(requestHeaders));
	request.setQuellSystem(QuellSystemFactory.createQuellSystem());
	request.getBeschwerdegruende().addAll(bto.getBeschwerdegruendeIds());
	request.setName(bto.getName().replace(";", " ")); //Vorname und Nachname wird zu ECM Zwecken mit einem ; getrennt
	request.setOrt(bto.getOrt());
	request.setPostleitzahl(bto.getPostleitzahl());
	request.setStaatIsoA3(bto.getStaatIsoA3());

	if(bto.getKontaktpunktId() != null) {
	  request.setKontaktpunktId(bto.getKontaktpunktId());
	} else {
	  request.setKontaktpunktBereOrg(bto.getKontaktpunktBereOrg());
	}

	return request;
  }
}
