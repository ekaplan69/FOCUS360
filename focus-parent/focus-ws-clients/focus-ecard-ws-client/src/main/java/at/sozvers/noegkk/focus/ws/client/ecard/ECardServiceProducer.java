package at.sozvers.noegkk.focus.ws.client.ecard;

import jakarta.annotation.Resource;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Produces;

@ApplicationScoped
public class ECardServiceProducer {

  private static final String SYSTEMMODUS        = "java:global/at/sozvers/noegkk/focus/ecard/SYSTEMMODUS";
  private static final String WS_URL             = "java:global/at/sozvers/noegkk/focus/ecard/URL";
  @Resource(lookup=SYSTEMMODUS)
  private              String sysmodus;
  @Resource(lookup=WS_URL)
  private              String url;
  private              String verarbeitungsmdous = "O";

  @Produces
  @ApplicationScoped
  @ECardService
  public ECardClient init() {
	if(url == null || sysmodus == null || verarbeitungsmdous == null) {
	  throw new IllegalArgumentException("Could not read ECard Connection Parameters from JNDI");
	}
	return new ECardClient(url);
  }
}
