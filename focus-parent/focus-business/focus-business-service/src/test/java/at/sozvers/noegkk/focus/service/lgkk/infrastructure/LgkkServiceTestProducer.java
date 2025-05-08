package at.sozvers.noegkk.focus.service.lgkk.infrastructure;

import java.io.IOException;
import java.util.Properties;
import at.sozvers.noegkk.focus.ws.client.lgkk.LgkkClient;
import at.sozvers.service.lgkk.infrastructure.LgkkService;
import jakarta.annotation.Priority;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Alternative;
import jakarta.enterprise.inject.Produces;
import jakarta.interceptor.Interceptor;

@Alternative
@ApplicationScoped
@Priority(Interceptor.Priority.APPLICATION + 10)
public class LgkkServiceTestProducer {

  private static final String PASSWORD           = "/at/sozvers/noegkk/focus/lgkk/wssecurity/password";
  private static final String SYSTEMMODUS        = "/at/sozvers/noegkk/focus/lgkk/SYSTEMMODUS";
  private static final String USERNAME           = "/at/sozvers/noegkk/focus/lgkk/wssecurity/username";
  private static final String VERARBEITUNGSMODUS = "/at/sozvers/noegkk/focus/lgkk/VERARBEITUNGSMODUS";
  private static final String WS_URL             = "/at/sozvers/noegkk/focus/lgkk/URL";

  @Produces
  @ApplicationScoped
  @LgkkService
  public LgkkClient init() throws IOException {
	Properties properties = new Properties();
	properties.load(this.getClass().getClassLoader().getResourceAsStream("lgkk/lgkk-ws-parameter.properties"));

	String url                = properties.getProperty(WS_URL);
	String user               = properties.getProperty(USERNAME);
	String pass               = properties.getProperty(PASSWORD);
	String systemmodus        = properties.getProperty(SYSTEMMODUS);
	String verarbeitungsmdous = properties.getProperty(VERARBEITUNGSMODUS);

	if(user == null || pass == null || url == null || systemmodus == null || verarbeitungsmdous == null) {
	  throw new RuntimeException("Could not read parameter from properties");
	}

	return new LgkkClient(url, verarbeitungsmdous, systemmodus, user, pass);
  }
}
