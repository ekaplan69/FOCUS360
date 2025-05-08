package at.sozvers.noegkk.focus.service.beschwerde;

import java.util.Date;
import java.util.List;
import at.sozvers.noegkk.focus.CdiExtension;
import at.sozvers.noegkk.focus.service.api.beschwerde.*;
import at.sozvers.noegkk.focus.service.common.Fachschluessel;
import jakarta.inject.Inject;
import org.jboss.weld.context.RequestContext;
import org.jboss.weld.context.unbound.Unbound;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.*;

@Disabled("BeschwerdeService wurde durch FeedbackService ersetzt")
@Deprecated(forRemoval=true)
@ExtendWith(CdiExtension.class)
class BeschwerdeServiceIT {

  @Inject
  @Unbound
  private RequestContext    requestContext;
  @Inject
  private BeschwerdeService service;

  @BeforeEach
  public void activateRequestContext() {
	if(requestContext.isActive()) {
	  requestContext.deactivate();
	}
	requestContext.activate();
  }

  @Test
  void test_searchBeschwerde() {
	BeschwerdeDetailBTO bto = service.searchBeschwerde(213L);

	assertNotNull(bto);
  }

  @Test
  void test_searchBeschwerdeListe() {
	List<BeschwerdeBTO> btoList = service.searchBeschwerdeListe(new Fachschluessel("2123270595", "VSNR"));
	assertEquals(0, btoList.size());
  }

  @Test
  void test_searchBeschwerdebereich() {
	List<BeschwerdeBereichBTO> btoList = service.searchBeschwerdebereich(35L, null, new Date(1567324800000L));

	assertNotEquals(0, btoList.size());
  }
}
