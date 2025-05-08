package at.sozvers.noegkk.focus.test.producer;

import at.itsv.berez.principal.BerezPrincipal;
import at.sozvers.noegkk.focus.CdiExtension;
import jakarta.enterprise.context.control.RequestContextController;
import jakarta.inject.Inject;
import org.jboss.weld.contexts.ContextNotActiveException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@ExtendWith(CdiExtension.class)
class BerezPrincipalTestProducerTest {
  @Inject
  private BerezPrincipal           berezPrincpal;
  @Inject
  private RequestContextController requestContext;

  @BeforeEach
  public void activateRequestContext() {
	try {
	  requestContext.deactivate();
	} catch(ContextNotActiveException cnae) {
	  System.out.println(cnae.getMessage());
	}
	requestContext.activate();
  }

  @Test
  void testBerezPrincipalProducer() {
	assertEquals("12FOCUS", berezPrincpal.eindeutigerBenutzername());
	assertEquals("12FOCUS", berezPrincpal.benutzername());
	assertEquals("Mustermann", berezPrincpal.person().eingetrageneNachnameDaten());
	assertEquals("Max", berezPrincpal.person().eingetrageneVornameDaten());
	assertEquals("Max Mustermann", berezPrincpal.person().name());
	assertEquals("12", berezPrincpal.traeger().code());
	assertEquals("NOEGKK", berezPrincpal.traeger().name());
	assertEquals("FOCUS360", berezPrincpal.serviceFunktionen().findFirst().get().applikationsCode());
	assertEquals("SERVICE", berezPrincpal.serviceFunktionen().findFirst().get().serviceCode());
	assertEquals("CODE", berezPrincpal.serviceFunktionen().findFirst().get().code());
	assertEquals("FOCUS360", berezPrincpal.rollen().findFirst().get().applikationsCode());
	assertEquals("LOGIN", berezPrincpal.rollen().findFirst().get().code());
	assertNotNull(berezPrincpal.organisationseinheiten().findFirst().get().vergebeneRollen());
  }
}
