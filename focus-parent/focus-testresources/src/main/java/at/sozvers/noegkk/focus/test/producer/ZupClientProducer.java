package at.sozvers.noegkk.focus.test.producer;

import at.sozvers.noegkk.focus.ws.client.zup.ZupClient;
import jakarta.annotation.Priority;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Alternative;
import jakarta.enterprise.inject.Produces;
import jakarta.interceptor.Interceptor;

@Alternative
@Priority(Interceptor.Priority.APPLICATION + 10) // https://docs.oracle.com/javaee/7/tutorial/cdi-adv002.htm
public class ZupClientProducer {

  @Produces
  @ApplicationScoped
  private ZupClient produceZupClient() {
	return new ZupClient("12-FOCUS360-E0001-000", "http://xidappl0.test.sozvers.at:59000", "5.0.0.0", "XID_ZUP_12-FOCUS360-E0001-000", "q90Eu7TVTw24Ah");
  }
}
