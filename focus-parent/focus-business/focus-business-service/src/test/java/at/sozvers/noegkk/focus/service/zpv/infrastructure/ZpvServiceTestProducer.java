package at.sozvers.noegkk.focus.service.zpv.infrastructure;

import java.io.IOException;
import java.util.Properties;
import at.sozvers.noegkk.jsszpvbe2.action.ZPVServices;
import at.sozvers.noegkk.jsszpvbe2.util.ZPVServiceFactory;
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
public class ZpvServiceTestProducer {

  private static final String ZPV_WS_PASSWORD = "/at/sozvers/noegkk/focus/zpv/wssecurity/password";
  private static final String ZPV_WS_USER     = "/at/sozvers/noegkk/focus/zpv/wssecurity/username";
  private static final Logger log             = LoggerFactory.getLogger(ZpvServiceTestProducer.class);

  @Produces
  @ApplicationScoped
  @ZPVService
  public ZPVServices init() throws IOException {
	Properties properties = new Properties();
	properties.load(this.getClass().getClassLoader().getResourceAsStream("jsszpvbe2/jsszpvbe2-parameter.properties"));

	String user = properties.getProperty(ZPV_WS_USER);
	String pass = properties.getProperty(ZPV_WS_PASSWORD);

	if(user == null || pass == null) {
	  throw new RuntimeException("Could not read ZPV_BENUTER OR ZPV_PASSWORT from JNDI");
	}

	return ZPVServiceFactory.getPropertyFileConfiguredInstance(user, pass, log);
  }
}
