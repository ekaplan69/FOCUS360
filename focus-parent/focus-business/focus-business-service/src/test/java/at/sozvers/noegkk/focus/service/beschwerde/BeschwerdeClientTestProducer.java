package at.sozvers.noegkk.focus.service.beschwerde;

import java.util.Properties;
import at.sozvers.noegkk.focus.ws.client.beschwerde.BeschwerdeClient;
import at.sozvers.noegkk.focus.ws.client.beschwerde.BeschwerdeWS;
import jakarta.annotation.Priority;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Alternative;
import jakarta.enterprise.inject.Produces;
import jakarta.interceptor.Interceptor;

@Deprecated(forRemoval=true)
@Alternative
@ApplicationScoped
@Priority(Interceptor.Priority.APPLICATION + 10)
public class BeschwerdeClientTestProducer {

  private static final String PASSWORD    = "/at/sozvers/noegkk/focus/scapp/wssecurity/password";
  private static final String SYSTEMMODUS = "/at/sozvers/noegkk/focus/scapp/SYSTEMMODUS";
  private static final String USERNAME    = "/at/sozvers/noegkk/focus/scapp/wssecurity/username";
  private static final String WS_URL      = "/at/sozvers/noegkk/focus/scapp/URL";

  @Produces
  @ApplicationScoped
  @BeschwerdeWS
  public BeschwerdeClient init() throws Exception {
	Properties properties = new Properties();
	properties.load(this.getClass().getClassLoader().getResourceAsStream("scapp/scapp-ws-parameter.properties"));

	String url         = properties.getProperty(WS_URL);
	String user        = properties.getProperty(USERNAME);
	String pass        = properties.getProperty(PASSWORD);
	String systemmodus = properties.getProperty(SYSTEMMODUS);

	if(user == null || pass == null || url == null || systemmodus == null) {
	  throw new RuntimeException("Could not read parameter from properties");
	}

	return new BeschwerdeClient(url, systemmodus, user, pass);
  }
}
