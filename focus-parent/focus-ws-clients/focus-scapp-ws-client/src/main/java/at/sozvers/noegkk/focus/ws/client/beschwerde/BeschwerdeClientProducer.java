package at.sozvers.noegkk.focus.ws.client.beschwerde;

import jakarta.annotation.Resource;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Produces;

@ApplicationScoped
public class BeschwerdeClientProducer {

  private static final String PASSWORD    = "java:global/at/sozvers/noegkk/focus/scapp/wssecurity/password";
  private static final String SYSTEMMODUS = "java:global/at/sozvers/noegkk/focus/scapp/SYSTEMMODUS";
  private static final String USERNAME    = "java:global/at/sozvers/noegkk/focus/scapp/wssecurity/username";
  private static final String WS_URL      = "java:global/at/sozvers/noegkk/focus/scapp/URL";
  @Resource(lookup=PASSWORD)
  private              String pass;
  @Resource(lookup=SYSTEMMODUS)
  private              String sysModus;
  @Resource(lookup=WS_URL)
  private              String url;
  @Resource(lookup=USERNAME)
  private              String user;

  @Produces
  @ApplicationScoped
  @BeschwerdeWS
  public BeschwerdeClient init() {
	if(user == null || pass == null || url == null || sysModus == null) {
	  throw new IllegalArgumentException("Could not read SCAPP Connection Parameters from JNDI");
	}
	return new BeschwerdeClient(url, sysModus, user, pass);
  }
}
