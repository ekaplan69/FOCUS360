package at.sozvers.noegkk.focus.interceptors;

import at.itsv.berez.principal.BerezPrincipal;
import at.itsv.noegkk.commons.RequestHeadersCommons;
import at.sozvers.noegkk.architektur.zup.ZUPRequestValues;
import jakarta.annotation.Resource;
import jakarta.inject.Inject;
import jakarta.interceptor.*;

@Interceptor
@ZupRequestValues
public class ZupRequestValuesInterceptor {
  private static final String                ZUP_BERECHTIGUNGSSYSTEMID = "java:global/at/sozvers/noegkk/focus/zpv/LL/BERECHTIGUNGSSYSTEMID";
  private static final String                ZUP_QUELLSYSTEMID         = "java:global/at/sozvers/noegkk/focus/zpv/LL/QUELLSYSTEMID";
  @Resource(lookup=ZUP_BERECHTIGUNGSSYSTEMID)
  private              String                berechtigungssystemId;
  @Inject
  private              BerezPrincipal        berezPrincipal;
  @Resource(lookup=ZUP_QUELLSYSTEMID)
  private              String                quellsystemId;
  @Inject
  private              RequestHeadersCommons requestHeaders;
  @Inject
  private              ZUPRequestValues      zupRequestValues;

  @AroundInvoke
  public Object logTime(InvocationContext invocationContext) throws Exception {
	zupRequestValues.setBenutzerId(berezPrincipal.benutzername());
	zupRequestValues.setMeldendeStelle(berezPrincipal.traeger().code());
	zupRequestValues.setOrgeinheit(requestHeaders.getOrgeinheitId());
	zupRequestValues.setBearbeitungsgrund("Versichertenauskunft");
	zupRequestValues.setTransaktionskennung(requestHeaders.getTransactionUUID());
	zupRequestValues.setQuellsystemId(quellsystemId);
	zupRequestValues.setBerechtigungsSystemId(berechtigungssystemId);

	return invocationContext.proceed();
  }
}
