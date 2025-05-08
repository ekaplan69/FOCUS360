package at.sozvers.noegkk.focus.api.user;

import at.itsv.berez.principal.BerezPrincipal;
import at.sozvers.noegkk.focus.CdiExtension;
import at.sozvers.noegkk.focus.rest.api.user.UserInfo;
import at.sozvers.noegkk.focus.rest.endpoint.user.UserEndpoint;
import at.sozvers.noegkk.focus.service.kontaktneu.*;
import at.sozvers.noegkk.focus.test.producer.BerezPrincipalTestProducer;
import at.sozvers.noegkk.focus.ws.client.kontakt.KontaktClient;
import jakarta.inject.Inject;
import org.jboss.weld.context.RequestContext;
import org.jboss.weld.context.unbound.Unbound;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@Disabled("Test auf ignored seit 04.2022")
@ExtendWith(CdiExtension.class)
@ExtendWith(MockitoExtension.class)
class UserTest {

  private static final String PASSWORD    = "5XS2f`nh3wK4[ke,3Sy-";
  private static final String SYSTEMMODUS = "T";
  private static final String USERNAME    = "12610039@DVSV ";
  private static final String WS_URL      = "http://entwintranet-backend.sozvers.at/servicecenter-extern";
  @Spy
  BerezPrincipal                                berezPrincipal = BerezPrincipalTestProducer.berePrincipal();
  @Mock
  GueltigeOesBTOExternalServiceMapper           gueltigeOesBTOExternalServiceMapper;
  @Mock
  KontaktAufgabengebietBTOExternalServiceMapper kontaktAufgabengebietBTOExternalServiceMapper;
  @Spy
  KontaktClient                                 kontaktClient  = new KontaktClient(WS_URL, SYSTEMMODUS, USERNAME, PASSWORD);
  @Spy
  @InjectMocks
  KontaktNeuService                             kontaktNeuService;
  @Inject
  @Unbound
  private RequestContext requestContext;
  @InjectMocks
  private UserEndpoint   user;

  @BeforeEach
  public void activateRequestContext() {
	MockitoAnnotations.initMocks(this);

	if(requestContext.isActive()) {
	  requestContext.deactivate();
	}
	requestContext.activate();
  }

  @Test
  void testGetUser() {
	UserInfo userInfo = user.getUserInfo();

	assertNotNull(userInfo);
	assertEquals("Max", userInfo.getVorname());
	assertEquals("Mustermann", userInfo.getNachname());
	assertEquals("FOCUS360.LOGIN", userInfo.getRollen().get(0));
	assertEquals("ORGIT", userInfo.getOrganisationseinheiten().get(0));
  }
}
