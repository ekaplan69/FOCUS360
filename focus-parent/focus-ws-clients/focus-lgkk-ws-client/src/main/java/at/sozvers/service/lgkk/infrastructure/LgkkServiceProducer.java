package at.sozvers.service.lgkk.infrastructure;

import at.sozvers.noegkk.focus.ws.client.lgkk.LgkkClient;
import jakarta.annotation.Resource;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Produces;

@ApplicationScoped
public class LgkkServiceProducer {

  private static final String PASSWORD_PATH    = "java:global/at/sozvers/noegkk/focus/lgkk/wssecurity/password";
  private static final String SYSTEMMODUS_PATH = "java:global/at/sozvers/noegkk/focus/lgkk/SYSTEMMODUS";
  private static final String USERNAME_PATH    = "java:global/at/sozvers/noegkk/focus/lgkk/wssecurity/username";
  private static final String WS_URL_PATH      = "java:global/at/sozvers/noegkk/focus/lgkk/URL";
  @Resource(lookup=PASSWORD_PATH)
  private              String pass;
  @Resource(lookup=SYSTEMMODUS_PATH)
  private              String systemmodus;
  @Resource(lookup=WS_URL_PATH)
  private              String url;
  @Resource(lookup=USERNAME_PATH)
  private              String user;

  @Produces
  @ApplicationScoped
  @LgkkService
  public LgkkClient init() {
	String verarbeitungsmdous = "O";
	if(user == null || pass == null || url == null || systemmodus == null) {
	  throw new IllegalArgumentException("Could not read LGKK Connection Parameters from JNDI");
	}
	return new LgkkClient(url, verarbeitungsmdous, systemmodus, user, pass);
  }
}
