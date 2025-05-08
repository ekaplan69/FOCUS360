package at.sozvers.noegkk.focus.service.lgkk.leistung;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import at.sozvers.noegkk.focus.CdiExtension;
import at.sozvers.noegkk.focus.service.api.lgkk.*;
import at.sozvers.noegkk.focus.service.lgkk.LeistungService;
import jakarta.inject.Inject;
import org.jboss.weld.context.RequestContext;
import org.jboss.weld.context.unbound.Unbound;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@ExtendWith(CdiExtension.class)
class LeistungServiceIT {
  @Inject
  LeistungService leistungService;
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
  void testBetreute() throws Exception {
	LeistungenBTO bto = getLeistungenBTO("5698261079", 5019487220.0, new int[]{14});

	assertEquals(1, bto.getBetreute().size());

	BetreuungszeitenBTO betreuungszeitenBTO = bto.getBetreute().get(0);

	assertEquals("Aktuell", betreuungszeitenBTO.getStatus());
	assertEquals(14, betreuungszeitenBTO.getLandesstelle());
	assertEquals(LocalDate.of(2019, 1, 30), betreuungszeitenBTO.getBetreuungVon());
	assertEquals(LocalDate.of(2999, 12, 31), betreuungszeitenBTO.getBetreuungBis());
  }

  private LeistungenBTO getLeistungenBTO(String vsnr, double pid, int[] landesStellen) throws Exception {
	List<Integer> landesStellenListe = Arrays.stream(landesStellen).boxed().toList();
	return leistungService.leseLeistungen(vsnr, pid, landesStellenListe);
  }

  @Disabled("TODO: Simon Kein Testuser von LGKK und Schnittstellen nicht erreichbar 10/24")
  @Test
  void testKh() throws Exception {
	LeistungenBTO bto = getLeistungenBTO("3109250488", 5007334689.0, new int[]{18});

	assertNotNull(bto.getKh());

	KhBTO kh = bto.getKh();

	assertEquals("Wiederaufnahme", kh.getAufnahmeArt());
	assertEquals(LocalDate.of(2019, 5, 20), kh.getLvonDat());
	assertEquals(LocalDate.of(2019, 6, 3), kh.getLbisDat());
	assertEquals("A. ö. Landeskrankenhaus Hall i. T.", kh.getLeName());
	assertEquals("833477", kh.getVpnr());
  }

  @Test
  void testMedSt() throws Exception {
	LeistungenBTO bto = getLeistungenBTO("1090040181", 5001124622.0, new int[]{14});

	assertEquals(3, bto.getMedSt().size());

	MedStBTO medStBTO = bto.getMedSt().get(0);
	//QDASH-547 ab 07/26 wieder falsch, weil dort medst ausläuft
	// Pucher - Stand 20.03.2025 - 3 medSt (31.12.2999, 05.02.2027, 20.06.2026)
	if(!LocalDate.of(2999, 12, 31).isEqual(medStBTO.getGueltigBisDat())) {
	  medStBTO = bto.getMedSt().get(1);
	}
	assertEquals(LocalDate.of(2999, 12, 31), medStBTO.getGueltigBisDat());
	assertEquals("KAST-KO", medStBTO.getLgebiet());
	assertEquals("Bewilligung", medStBTO.getStellungnahme());
  }

  @Test
  void testVwst() throws Exception {
	LeistungenBTO bto = getLeistungenBTO("1090040181", 5001124622.0, new int[]{14});

	assertEquals(6, bto.getVwst().size());
  }
}
