package at.sozvers.noegkk.focus.api.user;

import at.sozvers.noegkk.focus.ws.client.kontakt.KontaktClient;
import at.sozvers.noegkk.focus.ws.client.kontakt.KontaktWS;
import jakarta.annotation.Priority;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Alternative;
import jakarta.enterprise.inject.Produces;
import jakarta.interceptor.Interceptor;

@Alternative
@Priority(Interceptor.Priority.APPLICATION + 10)
public class KontaktClientTestProducer {

  private static final String PASSWORD    = "q8K3A1hug2wpyxmjhwC8";
  private static final String SYSTEMMODUS = "V";
  private static final String USERNAME    = "12FOCUS";
  private static final String WS_URL      = "http://entwintranet-backend.sozvers.at/servicecenter-extern";

  @Produces
  @ApplicationScoped
  @KontaktWS
  public KontaktClient init() {
	return new KontaktClient(WS_URL, SYSTEMMODUS, USERNAME, PASSWORD);
  }
}
