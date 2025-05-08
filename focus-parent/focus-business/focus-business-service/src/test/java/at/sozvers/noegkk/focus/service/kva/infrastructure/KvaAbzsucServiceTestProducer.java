package at.sozvers.noegkk.focus.service.kva.infrastructure;

import java.io.IOException;
import java.util.Properties;
import at.sozvers.noegkk.focus.ws.client.kva.abzsuc.KVAAbzsucService;
import at.sozvers.noegkk.focus.ws.client.kva.abzsuc.KvaAbzsucClient;
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
public class KvaAbzsucServiceTestProducer {

  private static final String BERECHTIGUNGSSYSTEMID = "/at/sozvers/noegkk/focus/kva/BERECHTIGUNGSSYSTEMID";
  private static final String PASSWORD              = "/at/sozvers/noegkk/focus/kva/wssecurity/password";
  private static final String PRIMAERSYSTEMID       = "/at/sozvers/noegkk/focus/kva/PRIMAERSYSTEMID";
  private static final String QUELLSYSTEMID         = "/at/sozvers/noegkk/focus/kva/QUELLSYSTEMID";
  private static final String SYSTEMMODUS           = "/at/sozvers/noegkk/focus/kva/SYSTEMMODUS";
  private static final String USERNAME              = "/at/sozvers/noegkk/focus/kva/wssecurity/username";
  private static final String VERARBEITUNGSMODUS    = "/at/sozvers/noegkk/focus/kva/VERARBEITUNGSMODUS";
  private static final String WS_URL                = "/at/sozvers/noegkk/focus/kva/URL";
  private static final Logger log                   = LoggerFactory.getLogger(KvaAbzsucServiceTestProducer.class);

  @Produces
  @KVAAbzsucService
  @ApplicationScoped
  public KvaAbzsucClient init() throws IOException {
	Properties properties = new Properties();
	properties.load(this.getClass().getClassLoader().getResourceAsStream("kva/kva-ws-parameter.properties"));

	String url                   = properties.getProperty(WS_URL);
	String user                  = properties.getProperty(USERNAME);
	String pass                  = properties.getProperty(PASSWORD);
	String systemmodus           = properties.getProperty(SYSTEMMODUS);
	String verarbeitungsmdous    = properties.getProperty(VERARBEITUNGSMODUS);
	String quellsystemid         = properties.getProperty(QUELLSYSTEMID);
	String primaersystemid       = properties.getProperty(PRIMAERSYSTEMID);
	String berechtigungssystemid = properties.getProperty(BERECHTIGUNGSSYSTEMID);

	if(user == null || pass == null || url == null || systemmodus == null || verarbeitungsmdous == null) {
	  throw new RuntimeException("Could not read parameter from properties");
	}

	return new KvaAbzsucClient(url, verarbeitungsmdous, systemmodus, user, pass, quellsystemid, berechtigungssystemid, primaersystemid);
  }
}
