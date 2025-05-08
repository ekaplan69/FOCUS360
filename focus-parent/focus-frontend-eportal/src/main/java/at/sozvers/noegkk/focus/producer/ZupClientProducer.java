package at.sozvers.noegkk.focus.producer;

import at.sozvers.noegkk.focus.ws.client.zup.ZupClient;
import jakarta.annotation.Resource;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Produces;

@ApplicationScoped
public class ZupClientProducer {
  private static final String CLIENT_USERNAME = "java:global/at/sozvers/noegkk/focus/zup/client_username";
  private static final String WS_PASSWORD     = "java:global/at/sozvers/noegkk/focus/zup/wssecurity/password";
  private static final String WS_URL          = "java:global/at/sozvers/noegkk/focus/zup/url";
  private static final String WS_USERNAME     = "java:global/at/sozvers/noegkk/focus/zup/wssecurity/username";
  @Resource(lookup=CLIENT_USERNAME)
  private              String clientUsername;
  private              String dateiversion    = "5.0.0.0";
  @Resource(lookup=WS_PASSWORD)
  private              String password;
  @Resource(lookup=WS_URL)
  private              String url;
  @Resource(lookup=WS_USERNAME)
  private              String username;

  @Produces
  @ApplicationScoped
  private ZupClient produceZupClient() {
	if(url == null || clientUsername == null) {
	  throw new IllegalArgumentException("Could not read ZUP Connection Parameters from JNDI");
	}

	return new ZupClient(clientUsername, url, dateiversion, username, password);
  }
}
