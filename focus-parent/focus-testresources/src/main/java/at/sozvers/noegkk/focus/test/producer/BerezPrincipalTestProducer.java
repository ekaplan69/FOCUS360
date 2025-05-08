package at.sozvers.noegkk.focus.test.producer;

import at.itsv.berez.principal.BerezPrincipal;
import jakarta.annotation.Priority;
import jakarta.enterprise.context.Dependent;
import jakarta.enterprise.context.RequestScoped;
import jakarta.enterprise.inject.Alternative;
import jakarta.enterprise.inject.Produces;
import jakarta.interceptor.Interceptor;

@Alternative
@Priority(Interceptor.Priority.APPLICATION + 10) // https://docs.oracle.com/javaee/7/tutorial/cdi-adv002.htm
@Dependent
public class BerezPrincipalTestProducer {
  private BerezPrincipalTestProducer() {
	//Private Constructor
  }

  @Produces
  @RequestScoped
  public static BerezPrincipal berePrincipal() {
	return new TestBerezPrincipal();
  }
}
