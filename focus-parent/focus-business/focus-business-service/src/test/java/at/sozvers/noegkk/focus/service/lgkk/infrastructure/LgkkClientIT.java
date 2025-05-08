package at.sozvers.noegkk.focus.service.lgkk.infrastructure;

import javax.xml.datatype.*;
import java.util.LinkedList;
import java.util.List;
import at.sozvers.noegkk.focus.CdiExtension;
import at.sozvers.noegkk.focus.ws.client.lgkk.LgkkClient;
import at.sozvers.service.lgkk.infrastructure.LgkkService;
import at.sozvers.service.lgkk.infrastructure.SucheLgkkFaelleRequestFactory;
import at.sozvers.stp.lgkk.webservice.focus360.v20.SucheLGKFaelleV2;
import at.sozvers.stp.lgkk.webservice.focus360.v20.SucheLGKFaelleV2Response;
import jakarta.inject.Inject;
import org.jboss.weld.context.RequestContext;
import org.jboss.weld.context.unbound.Unbound;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@ExtendWith(CdiExtension.class)
class LgkkClientIT {
  @Inject
  @LgkkService
  private LgkkClient                    lgkkClient;
  @Inject
  @Unbound
  private RequestContext                requestContext;
  @Inject
  private SucheLgkkFaelleRequestFactory sucheLgkkFaelleRequestFactory;

  @BeforeEach
  public void activateRequestContext() {
	if(requestContext.isActive()) {
	  requestContext.deactivate();
	}
	requestContext.activate();
  }

  @Test
  void smokeTest() throws DatatypeConfigurationException {
	String               vsnr           = "1111111111";
	XMLGregorianCalendar vonDat         = DatatypeFactory.newInstance().newXMLGregorianCalendar(2019, 8, 2, 0, 0, 0, 0, 1);
	Double               personPid      = 1340813.0;
	List<Integer>        landeststellen = new LinkedList<>();

	SucheLGKFaelleV2 request = sucheLgkkFaelleRequestFactory.createRequest(vsnr, personPid, landeststellen);

	SucheLGKFaelleV2Response response = lgkkClient.sucheLGKKFaelleV2(request);

	assertNotNull(response);
  }
}
