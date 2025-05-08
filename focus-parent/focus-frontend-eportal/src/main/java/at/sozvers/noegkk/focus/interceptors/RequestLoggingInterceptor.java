package at.sozvers.noegkk.focus.interceptors;

import java.util.Arrays;
import at.itsv.berez.principal.BerezPrincipal;
import at.itsv.noegkk.commons.RequestHeadersCommons;
import jakarta.inject.Inject;
import jakarta.interceptor.*;
import org.slf4j.Logger;

@Interceptor
@RequestLogging
public class RequestLoggingInterceptor {
  @Inject
  private BerezPrincipal        berezPrincipal;
  @Inject
  private Logger                logger;
  @Inject
  private RequestHeadersCommons requestHeaders;

  @AroundInvoke
  public Object logTime(InvocationContext invocationContext) throws Exception {
	long     startTime  = System.currentTimeMillis();
	Object[] parameters = invocationContext.getParameters();
	try {
	  return invocationContext.proceed();
	} finally {
	  String bearbeiterId           = "-";
	  String traeger                = "-";
	  String organisationseinheitId = requestHeaders != null ? requestHeaders.getOrgeinheitId() : "-";
	  String transaktionsId         = requestHeaders != null ? requestHeaders.getTransactionUUID() : "-";

	  if(berezPrincipal != null) {
		bearbeiterId = berezPrincipal.benutzername();
		if(berezPrincipal.traeger() != null) {
		  traeger = berezPrincipal.traeger().code();
		}
	  }

	  logger.debug(String.format("Input der Methode [%s.%s]: %s Bearbeiter: [%s] TraegerId: [%s] OrganisationseinheitId: [%s] TransaktionsId: [%s] Laufzeit: [%s] Millis",
								 invocationContext.getTarget().getClass().getName(), invocationContext.getMethod().getName(), Arrays.toString(parameters), bearbeiterId, traeger,
								 organisationseinheitId, transaktionsId, System.currentTimeMillis() - startTime));
	}
  }
}
