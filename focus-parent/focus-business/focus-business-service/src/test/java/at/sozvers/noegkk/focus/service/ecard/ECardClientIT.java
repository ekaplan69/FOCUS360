package at.sozvers.noegkk.focus.service.ecard;

import at.siemens.ecard.server.onlineservices.valueobject.ECardAuskunftV2Req;
import at.siemens.ecard.server.onlineservices.valueobject.ECardAuskunftV2Resp;
import at.sozvers.noegkk.focus.CdiExtension;
import at.sozvers.noegkk.focus.ws.client.ecard.ECardClient;
import at.sozvers.noegkk.focus.ws.client.ecard.ECardService;
import jakarta.inject.Inject;
import org.jboss.weld.context.RequestContext;
import org.jboss.weld.context.unbound.Unbound;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertNotNull;

// Test 20250508 deaktiviert da am Jenkins nicht mehr lauffähig - spucher
@Disabled
@ExtendWith(CdiExtension.class)
class ECardClientIT {

  @Inject
  @ECardService
  private ECardClient    eCardClient;
  @Inject
  @Unbound
  private RequestContext requestContext;

  @BeforeAll
  public static void setUp() {
	// TODO File ist nirgends vorhanden!!!??? spucher 20250508
	System.setProperty("jakarta.net.ssl.trustStore", "src/test/resources/ecard/truststoreECardSS5.jks");
	System.setProperty("jakarta.net.ssl.trustStorePassword", "ecardTestJks");
  }

  @AfterAll
  public static void tearDown() {
	System.clearProperty("jakarta.net.ssl.trustStore");
	System.clearProperty("jakarta.net.ssl.trustStorePassword");
  }

  @BeforeEach
  public void activateRequestContext() {
	if(requestContext.isActive()) {
	  requestContext.deactivate();
	}
	requestContext.activate();
  }

  @Test
  void smokeTest() {
	ECardAuskunftV2Req request = new ECardAuskunftV2Req();

	request.setMxOriginatorId("FOCUS360");
	request.setTraegerId("12");
	request.setVersion("0002");
	request.setIdApp("FOCUS360");
	request.setVsNr("1239050178");

	final ECardAuskunftV2Resp[] lambdaResponse = {null};
	assertDoesNotThrow(() -> lambdaResponse[0] = eCardClient.eCardAuskunft(request));
	ECardAuskunftV2Resp response = lambdaResponse[0];

	assertNotNull(response);
  }
}
