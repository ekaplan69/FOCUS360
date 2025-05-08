package at.sozvers.noegkk.focus.kva.abzsuc;

import java.time.LocalDate;
import java.util.List;
import at.sozvers.focus.persistence.focus.FocusSteuerung;
import at.sozvers.noegkk.focus.CdiExtension;
import at.sozvers.noegkk.focus.service.api.kva.abzsuc.AngehoerigeBTO;
import at.sozvers.noegkk.focus.service.common.Fachschluessel;
import at.sozvers.noegkk.focus.service.kva.abzsuc.AngehoerigeService;
import at.sozvers.noegkk.focus.test.TestUtil;
import jakarta.inject.Inject;
import org.jboss.weld.context.RequestContext;
import org.jboss.weld.context.unbound.Unbound;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(CdiExtension.class)
class AngehoerigeServiceIT {
  @Inject
  @Unbound
  private RequestContext     requestContext;
  @Inject
  private AngehoerigeService service;

  @BeforeEach
  public void activateRequestContext() {
	if(requestContext.isActive()) {
	  requestContext.deactivate();
	}
	requestContext.activate();
  }

  @BeforeEach
  void setup() {
	service = Mockito.spy(service);
	FocusSteuerung mockedSteuerung = new FocusSteuerung();
	mockedSteuerung.setWert(String.valueOf(TestUtil.daysBetween(LocalDate.of(2019, 1, 1), LocalDate.now())));
	Mockito.doReturn(mockedSteuerung).when(service).getFocusSteuerungQueryResult(Mockito.any());
  }

  @Test
  void test_searchAngehoerigeByFachschluessel_gueltige_VSNR_mit_Ergebnissen() throws Exception {
	Fachschluessel       fachschluessel = Fachschluessel.of("5473221199", "VSNR");
	List<AngehoerigeBTO> btoList        = service.searchAngehoerigeByFachschluessel(fachschluessel);

	assertNotEquals(0, btoList.size());
	assertEquals("2233220281", btoList.get(0).getVersicherungsnummer());
	assertEquals("Stefan", btoList.get(0).getVorname());
	assertEquals("Karner", btoList.get(0).getNachname());
	assertEquals("Angehöriger EU/EWR/CH - nicht beitragspflichtig §51d ASVG", btoList.get(0).getTyp());
	assertEquals(LocalDate.of(2018, 8, 1), btoList.get(0).getGueltigVon());
	assertNull(btoList.get(0).getGueltigBis());
	assertEquals("12 - ÖGK-N", btoList.get(0).getMeldendeStelle());
  }

  @Test
  void test_searchAngehoerigeByFachschluessel_gueltige_VSNR_ohne_Ergebnissen() throws Exception {
	Fachschluessel       fachschluessel = Fachschluessel.of("4910040798", "VSNR");
	List<AngehoerigeBTO> btoList        = service.searchAngehoerigeByFachschluessel(fachschluessel);
	assertEquals(0, btoList.size());
  }

  @Test
  void test_searchAngehoerigeByFachschluessel_ungueltige_VSNR() throws Exception {
	Fachschluessel       fachschluessel = Fachschluessel.of("121212121", "VSNR");
	List<AngehoerigeBTO> btoList        = service.searchAngehoerigeByFachschluessel(fachschluessel);
	assertEquals(0, btoList.size());
  }
}
