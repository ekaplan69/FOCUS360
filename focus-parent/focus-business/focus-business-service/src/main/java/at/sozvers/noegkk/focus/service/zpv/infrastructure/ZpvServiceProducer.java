package at.sozvers.noegkk.focus.service.zpv.infrastructure;

import at.sozvers.noegkk.jsszpvbe2.action.ZPVServices;
import at.sozvers.noegkk.jsszpvbe2.util.ZPVServiceFactory;
import jakarta.annotation.Resource;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Produces;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@ApplicationScoped
public class ZpvServiceProducer {

  private static final String ZPV_WS_PASSWORD = "java:global/at/sozvers/noegkk/focus/zpv/wssecurity/password";
  private static final String ZPV_WS_USER     = "java:global/at/sozvers/noegkk/focus/zpv/wssecurity/username";
  private static final Logger log             = LoggerFactory.getLogger(ZpvServiceProducer.class);
  @Resource(lookup=ZPV_WS_PASSWORD)
  private              String pass;
  @Resource(lookup=ZPV_WS_USER)
  private              String user;

  @Produces
  @ApplicationScoped
  @ZPVService
  public ZPVServices init() {
	if(user == null || pass == null) {
	  throw new IllegalArgumentException("Could not read ZPV_BENUTER OR ZPV_PASSWORT from JNDI");
	}

	return ZPVServiceFactory.getJndiConfiguredInstance(user, pass, "focus", log);
  }
}
