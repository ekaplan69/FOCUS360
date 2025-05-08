package at.sozvers.noegkk.focus.service.zvd.infrastructure;

import java.io.IOException;
import java.util.Properties;
import at.sozvers.noegkk.focus.ws.client.zvd.ZvdClient;
import jakarta.annotation.Priority;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Alternative;
import jakarta.enterprise.inject.Produces;
import jakarta.interceptor.Interceptor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Alternative
@ApplicationScoped
@Priority(Interceptor.Priority.APPLICATION + 10)
public class ZvdServiceTestProducer {

  private static final String BERECHTIGUNGSSYSTEMID = "/at/sozvers/noegkk/focus/zvd/BERECHTIGUNGSSYSTEMID";
  private static final String PASSWORD              = "/at/sozvers/noegkk/focus/zvd/wssecurity/password";
  private static final String PRIMAERSYSTEMID       = "/at/sozvers/noegkk/focus/zvd/PRIMAERSYSTEMID";
  private static final String QUELLSYSTEMID         = "/at/sozvers/noegkk/focus/zvd/QUELLSYSTEMID";
  private static final String SYSTEMMODUS           = "/at/sozvers/noegkk/focus/zvd/SYSTEMMODUS";
  private static final String USERNAME              = "/at/sozvers/noegkk/focus/zvd/wssecurity/username";
  private static final String VERARBEITUNGSMODUS    = "/at/sozvers/noegkk/focus/zvd/VERARBEITUNGSMODUS";
  private static final String WS_URL                = "/at/sozvers/noegkk/focus/zvd/URL";
  private static final Logger log                   = LoggerFactory.getLogger(ZvdServiceTestProducer.class);

  @Produces
  @ApplicationScoped
  @ZVDService
  public ZvdClient init() throws IOException {
	Properties properties = new Properties();
	properties.load(this.getClass().getClassLoader().getResourceAsStream("zvd/zvd-ws-parameter.properties"));

	String url                  = properties.getProperty(WS_URL);
	String user                 = properties.getProperty(USERNAME);
	String pass                 = properties.getProperty(PASSWORD);
	String systemmodus          = properties.getProperty(SYSTEMMODUS);
	String verarbeitungsmdous   = properties.getProperty(VERARBEITUNGSMODUS);
	String quellsystemid        = properties.getProperty(QUELLSYSTEMID);
	String berechtigungsystemid = properties.getProperty(BERECHTIGUNGSSYSTEMID);
	String primaersystemid      = properties.getProperty(PRIMAERSYSTEMID);

	if(user == null || pass == null || url == null || systemmodus == null || verarbeitungsmdous == null || quellsystemid == null || berechtigungsystemid == null || primaersystemid == null) {
	  throw new RuntimeException("Could not read parameter from properties");
	}

	return new ZvdClient(url, verarbeitungsmdous, systemmodus, user, pass, quellsystemid, berechtigungsystemid, primaersystemid);
  }
}
