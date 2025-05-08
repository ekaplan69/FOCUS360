package at.sozvers.noegkk.focus.service.zvd.infrastructure;

import at.sozvers.noegkk.focus.CdiExtension;
import at.sozvers.noegkk.focus.ws.client.zvd.ZvdClient;
import jakarta.inject.Inject;
import org.jboss.weld.context.RequestContext;
import org.jboss.weld.context.unbound.Unbound;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(CdiExtension.class)
class ZvdClientIT {
  @Inject
  @Unbound
  private RequestContext                              requestContext;
  @Inject
  private VersicherungsverhaeltnisLesenRequestFactory versicherungsverhaeltnisLesenRequestFactory;
  @Inject
  @ZVDService
  private ZvdClient                                   zvdClient;

  @BeforeEach
  public void activateRequestContext() {
	if(requestContext.isActive()) {
	  requestContext.deactivate();
	}
	requestContext.activate();
  }

  @Test
  void smokeTest() throws Exception {

	//VersicherungsverhaeltnisLesenRequest request = versicherungsverhaeltnisLesenRequestFactory.
	//		createVersicherungsverhaeltnisLesenRequest("1561040787", "180");

	//VersicherungsverhaeltnisLesenResponse resp = zvdClient.versicherungsVerhaeltnisseLesen_1_0(request);

	//assertNotNull(resp.getVersicherungsverhaeltnisse());

  }
}
