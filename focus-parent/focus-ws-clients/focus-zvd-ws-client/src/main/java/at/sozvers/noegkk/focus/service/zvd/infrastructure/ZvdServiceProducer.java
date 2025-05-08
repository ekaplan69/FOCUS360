package at.sozvers.noegkk.focus.service.zvd.infrastructure;

import at.sozvers.noegkk.focus.ws.client.zvd.ZvdClient;
import jakarta.annotation.Resource;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Produces;

@ApplicationScoped
public class ZvdServiceProducer {

  private static final String BERECHTIGUNGSSYSTEMID = "java:global/at/sozvers/noegkk/focus/zvd/BERECHTIGUNGSSYSTEMID";
  private static final String PASSWORD              = "java:global/at/sozvers/noegkk/focus/zvd/wssecurity/password";
  private static final String PRIMAERSYSTEMID       = "java:global/at/sozvers/noegkk/focus/zvd/PRIMAERSYSTEMID";
  private static final String QUELLSYSTEMID         = "java:global/at/sozvers/noegkk/focus/zvd/QUELLSYSTEMID";
  private static final String SYSTEMMODUS           = "java:global/at/sozvers/noegkk/focus/zvd/SYSTEMMODUS";
  private static final String USERNAME              = "java:global/at/sozvers/noegkk/focus/zvd/wssecurity/username";
  private static final String VERARBEITUNGSMODUS    = "java:global/at/sozvers/noegkk/focus/zvd/VERARBEITUNGSMODUS";
  private static final String WS_URL                = "java:global/at/sozvers/noegkk/focus/zvd/URL";
  @Resource(lookup=BERECHTIGUNGSSYSTEMID)
  private              String berechtigungssystemid;
  @Resource(lookup=PASSWORD)
  private              String pass;
  @Resource(lookup=PRIMAERSYSTEMID)
  private              String primaersystemid;
  @Resource(lookup=QUELLSYSTEMID)
  private              String quellsystemid;
  @Resource(lookup=SYSTEMMODUS)
  private              String sysmodus;
  @Resource(lookup=WS_URL)
  private              String url;
  @Resource(lookup=USERNAME)
  private              String user;
  @Resource(lookup=VERARBEITUNGSMODUS)
  private              String verarbeitungsmdous;

  @Produces
  @ApplicationScoped
  @ZVDService
  public ZvdClient init() {
	if(user == null || pass == null || url == null || sysmodus == null || verarbeitungsmdous == null || quellsystemid == null || berechtigungssystemid == null || primaersystemid == null) {
	  throw new IllegalArgumentException("Could not read ZVD Connection Parameters from JNDI");
	}
	return new ZvdClient(url, verarbeitungsmdous, sysmodus, user, pass, quellsystemid, berechtigungssystemid, primaersystemid);
  }
}

