package at.sozvers.noegkk.focus.producer;

import at.itsv.berez.principal.BerezPrincipal;
import jakarta.enterprise.context.Dependent;
import jakarta.enterprise.context.RequestScoped;
import jakarta.enterprise.inject.Produces;
import jakarta.servlet.http.HttpServletRequest;

@Dependent
public class BerezPrincipalProducer {
  private BerezPrincipalProducer() {
	//Private Constructor
  }

  @Produces
  @RequestScoped
  public static BerezPrincipal berePrincipal(HttpServletRequest request) {
	if("true".equals(System.getProperty("debug.enable")) && request.getUserPrincipal() == null) {
	  return new FallbackBerezPrincipal();
	}
	return (BerezPrincipal) request.getUserPrincipal();
  }
}
