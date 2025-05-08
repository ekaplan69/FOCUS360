package at.sozvers.focus.persistence.focus;

import at.sozvers.noegkk.focus.CdiExtension;
import at.sozvers.noegkk.focus.testresources.testdb.DbUnitTestBase;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import org.jboss.weld.context.RequestContext;
import org.jboss.weld.context.unbound.Unbound;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@ExtendWith(CdiExtension.class)
class FocusMeldendestelleIT extends DbUnitTestBase {
  @Inject
  private EntityManager  em;
  @Inject
  @Unbound
  private RequestContext requestContext;

  @BeforeEach
  public void activateRequestContext() {
	if(requestContext.isActive()) {
	  requestContext.deactivate();
	}
	requestContext.activate();
  }

  @Test
  void testReadAll() {
	FocusMeldendestelle meldendeStelle = em.find(FocusMeldendestelle.class, "12");

	assertNotNull(meldendeStelle);
	assertEquals("12", meldendeStelle.getMeldendestelle());
	assertEquals("ÖGK-N", meldendeStelle.getKurzbezeichnung());
	assertEquals("ÖGK-Niederösterreich", meldendeStelle.getLangbezeichnung());
  }
}
