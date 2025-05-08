package at.sozvers.noegkk.focus.kva.gbfsuc;

import java.util.List;
import at.sozvers.noegkk.focus.CdiExtension;
import at.sozvers.noegkk.focus.service.api.kva.gbfsuc.GebuehrenbefreiungBTO;
import at.sozvers.noegkk.focus.service.common.Fachschluessel;
import at.sozvers.noegkk.focus.service.kva.gbfsuc.GebuehrenbefreiungService;
import jakarta.inject.Inject;
import org.jboss.weld.context.RequestContext;
import org.jboss.weld.context.unbound.Unbound;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(CdiExtension.class)
class GebuehrenbefreiungServiceIT {

  @Inject
  @Unbound
  private RequestContext            requestContext;
  @Inject
  private GebuehrenbefreiungService service;

  @BeforeEach
  public void activateRequestContext() {
	if(requestContext.isActive()) {
	  requestContext.deactivate();
	}
	requestContext.activate();
  }

  @Test
  void test_searchGebuehrenbefreiungByFachschluessel_gueltige_VSNR_bisdatum_gesetzt_mit_Ergebnissen() throws Exception {
	Fachschluessel              fachschluessel = Fachschluessel.of("5473221199", "VSNR");
	List<GebuehrenbefreiungBTO> btoList        = service.searchGebuehrenbefreiungenByFachschluessel(fachschluessel);

	assertThat(btoList).isEmpty();
  }

  @Test
  void test_searchGebuehrenbefreiungByFachschluessel_gueltige_VSNR_bisdatum_null_mit_Ergebnissen() throws Exception {
	Fachschluessel              fachschluessel = Fachschluessel.of("5436211194", "VSNR");
	List<GebuehrenbefreiungBTO> btoList        = service.searchGebuehrenbefreiungenByFachschluessel(fachschluessel);

	assertThat(btoList).isNotEmpty();
	assertThat(btoList.size()).isSameAs(2);
	assertThat(btoList.get(0).getBefreiung()).isEqualTo("Rezeptgebührenbefreiung");
	assertThat(btoList.get(0).getBefreiungsgrund()).isEqualTo("§2 Abs.2 - Zugeteilte nach KOVG, HVG, OFG");

	assertThat(btoList.get(1).getBefreiung()).isEqualTo("Kostenanteilsbefreiung");
	assertThat(btoList.get(1).getBefreiungsgrund()).isEqualTo("Rezeptgebührenbefreiung");
  }

  @Test
  void test_searchGebuehrenbefreiungByFachschluessel_gueltige_VSNR_ohne_Ergebnissen() throws Exception {
	Fachschluessel              fachschluessel = Fachschluessel.of("4910040798", "VSNR");
	List<GebuehrenbefreiungBTO> btoList        = service.searchGebuehrenbefreiungenByFachschluessel(fachschluessel);
	assertThat(btoList).isEmpty();
  }

  @Test
  void test_searchGebuehrenbefreiungByFachschluessel_ungueltige_VSNR() throws Exception {
	Fachschluessel              fachschluessel = Fachschluessel.of("12122121", "VSNR");
	List<GebuehrenbefreiungBTO> btoList        = service.searchGebuehrenbefreiungenByFachschluessel(fachschluessel);
	assertThat(btoList).isEmpty();
  }
}
