package at.sozvers.noegkk.focus.ws.client.kva.kvkerm;

import jakarta.annotation.Resource;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Produces;

@ApplicationScoped
public class KvaKvkermServiceProducer {

  private static final String BERECHTIGUNGSSYSTEMID = "java:global/at/sozvers/noegkk/focus/kva/BERECHTIGUNGSSYSTEMID";
  private static final String PASSWORD              = "java:global/at/sozvers/noegkk/focus/kva/wssecurity/password";
  private static final String PRIMAERSYSTEMID       = "java:global/at/sozvers/noegkk/focus/kva/PRIMAERSYSTEMID";
  private static final String QUELLSYSTEMID         = "java:global/at/sozvers/noegkk/focus/kva/QUELLSYSTEMID";
  private static final String SYSTEMMODUS           = "java:global/at/sozvers/noegkk/focus/kva/SYSTEMMODUS";
  private static final String USERNAME              = "java:global/at/sozvers/noegkk/focus/kva/wssecurity/username";
  private static final String WS_URL                = "java:global/at/sozvers/noegkk/focus/kva/URL";
  private final        String verarbeitungsmdous    = "O";
  @Resource(lookup=BERECHTIGUNGSSYSTEMID)
  private              String berechtigungssystem;
  @Resource(lookup=PASSWORD)
  private              String pass;
  @Resource(lookup=PRIMAERSYSTEMID)
  private              String primaersystem;
  @Resource(lookup=QUELLSYSTEMID)
  private              String quellsystem;
  @Resource(lookup=SYSTEMMODUS)
  private              String sysmodus;
  @Resource(lookup=WS_URL)
  private              String url;
  @Resource(lookup=USERNAME)
  private              String user;

  @Produces
  @ApplicationScoped
  @KVAKvkermService
  private KvaKvkermClient init() {
	if(user == null || pass == null || url == null || sysmodus == null || verarbeitungsmdous == null) {
	  throw new IllegalArgumentException("Could not read KVA Connection Parameters from JNDI");
	}
	return new KvaKvkermClient(url, verarbeitungsmdous, sysmodus, user, pass, quellsystem, berechtigungssystem, primaersystem);
  }
}
