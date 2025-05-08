package at.sozvers.noegkk.focus.service.ecard;

import java.io.IOException;
import java.util.Properties;
import at.sozvers.noegkk.focus.ws.client.ecard.ECardClient;
import at.sozvers.noegkk.focus.ws.client.ecard.ECardService;
import jakarta.annotation.Priority;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Alternative;
import jakarta.enterprise.inject.Produces;
import jakarta.interceptor.Interceptor;

@Alternative
@ApplicationScoped
@Priority(Interceptor.Priority.APPLICATION + 10)
public class ECardServiceTestProducer {

  private static final String SYSTEMMODUS        = "/at/sozvers/noegkk/focus/ecard/SYSTEMMODUS";
  private static final String WS_URL             = "/at/sozvers/noegkk/focus/ecard/URL";
  private static final String verarbeitungsmdous = "/at/sozvers/noegkk/focus/ecard/VERARBEITUNGSMODUS";

  @Produces
  @ApplicationScoped
  @ECardService
  public ECardClient init() throws IOException {
	Properties properties = new Properties();
	properties.load(this.getClass().getClassLoader().getResourceAsStream("ecard/ecard-ws-parameter.properties"));

	String url         = properties.getProperty(WS_URL);
	String systemmodus = properties.getProperty(SYSTEMMODUS);
	String vmodus      = properties.getProperty(verarbeitungsmdous);

	if(url == null || systemmodus == null || vmodus == null) {
	  throw new RuntimeException("Could not read ECard Connection Parameters from JNDI");
	}
	return new ECardClient(url);
  }
}
