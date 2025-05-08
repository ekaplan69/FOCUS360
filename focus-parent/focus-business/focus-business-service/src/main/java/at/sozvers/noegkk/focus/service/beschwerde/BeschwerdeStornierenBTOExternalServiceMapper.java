package at.sozvers.noegkk.focus.service.beschwerde;

import at.itsv.noegkk.commons.RequestHeadersCommons;
import at.sozvers.noegkk.focus.service.api.beschwerde.BeschwerdeStornierenBTO;
import at.sozvers.noegkk.focus.service.mapping.BTOExternalServiceMapper;
import at.sozvers.noegkk.focus.ws.client.beschwerde.QuellSystemFactory;
import at.sozvers.noegkk.focus.ws.client.beschwerde.RqKontextFactory;
import at.sozvers.noegkk.sckont.beschwerde.focus.BeschwerdeStornierenRequest;
import jakarta.inject.Inject;

public class BeschwerdeStornierenBTOExternalServiceMapper extends BTOExternalServiceMapper<BeschwerdeStornierenBTO, BeschwerdeStornierenRequest> {
  @Inject
  private RequestHeadersCommons requestHeaders;

  @Override
  public BeschwerdeStornierenRequest map(BeschwerdeStornierenBTO bto) {
	BeschwerdeStornierenRequest request = new BeschwerdeStornierenRequest();

	request.setKontext(RqKontextFactory.createRqKontext(requestHeaders));
	request.setQuellSystem(QuellSystemFactory.createQuellSystem());

	request.setId(bto.getId());
	request.setUpdatecount(bto.getUpdatecount());

	return request;
  }
}
