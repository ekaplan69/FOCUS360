package at.sozvers.focus.persistence.focus;

import java.util.List;
import at.sozvers.focus.persistence.QueryConstants;
import at.sozvers.noegkk.focus.CdiExtension;
import at.sozvers.noegkk.focus.testresources.testdb.DbUnitTestBase;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import org.jboss.weld.context.RequestContext;
import org.jboss.weld.context.unbound.Unbound;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(CdiExtension.class)
class FocusQualifikationIT extends DbUnitTestBase {
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
	List<FocusQualifikation> qualifikationen = em.createNamedQuery(FocusQualifikation.QUERY_QUALIFIKATION_ZU_QUALIFIKATIONSCODE, FocusQualifikation.class)
												 .setParameter(QueryConstants.QUERY_PARAMETER_QUALIFIKATIONSCODE, "AA").getResultList();

	assertThat(qualifikationen).hasSize(1);
	assertThat(qualifikationen.get(0).getKurzbeschreibung()).isEqualTo("Beitragsz. gem. §§564 u. 314a ASVG (Ang)");
  }
}
