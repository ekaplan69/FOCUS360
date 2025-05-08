package at.sozvers.noegkk.focus.ws.client.kundenfeedback;

import jakarta.annotation.Resource;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Produces;

public class FeedbackClientProducer {

  private static final String PASSWORD    = "java:global/at/sozvers/noegkk/focus/scapp/wssecurity/password";
  private static final String SYSTEMMODUS = "java:global/at/sozvers/noegkk/focus/scapp/SYSTEMMODUS";
  private static final String USERNAME    = "java:global/at/sozvers/noegkk/focus/scapp/wssecurity/username";
  private static final String WS_URL      = "java:global/at/sozvers/noegkk/focus/scapp/URL";
  @Resource(lookup=PASSWORD)
  private              String pass;
  @Resource(lookup=SYSTEMMODUS)
  private              String sysmodus;
  @Resource(lookup=WS_URL)
  private              String url;
  @Resource(lookup=USERNAME)
  private              String user;

  @Produces
  @ApplicationScoped
  @FeedbackWS
  public FeedbackClient init() {
	if(user == null || pass == null || url == null || sysmodus == null) {
	  throw new IllegalArgumentException("Could not read SCAPP Connection Parameters from JNDI");
	}
	return new FeedbackClient(url, sysmodus, user, pass);
  }
}
