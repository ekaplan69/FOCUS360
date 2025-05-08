package at.sozvers.noegkk.focus.service.zugriffsprotokollierung;

import java.util.ArrayList;
import java.util.List;
import at.sozvers.noegkk.focus.CdiExtension;
import at.sozvers.noegkk.focus.service.api.zugriffsprotokollierung.ZugriffsprotokollBTO;
import at.sozvers.noegkk.focus.service.api.zugriffsprotokollierung.Zugriffsprotokollierung;
import at.sozvers.noegkk.focus.test.TestUtil;
import at.sozvers.noegkk.focus.testresources.testdb.*;
import at.sozvers.noegkk.focus.ws.client.zup.ZupClient;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(CdiExtension.class)
@ExtendWith(MockitoExtension.class)
@DbTestData(filename="ZugriffsprotokollierungServiceIT/testdaten.xml")
class ZugriffsprotokollierungServiceIT extends DbUnitTestBase {

  @Inject
  private EntityManager           em;
  @Inject
  private Zugriffsprotokollierung zugriffsprotokollierung;
  @Inject
  private ZupClient               zupClient;

  @BeforeEach
  public void setup() {
	if(em.getTransaction().isActive()) {
	  em.getTransaction().commit();
	}
	em.getTransaction().begin();
  }

  @AfterEach
  public void teardown() {
	if(em.getTransaction().isActive()) {
	  em.getTransaction().commit();
	}
  }

  //Tests for Zugriffsprotokollierung.ermittleUnverarbeiteteProtkollsaetze

  @Test
  void testErmittleUnverarbeiteteProtkollsaetze() {
	List<ZugriffsprotokollBTO> outputList = zugriffsprotokollierung.ermittleUnverarbeiteteProtkollsaetze(10);
	assertEquals(4, outputList.size());
  }

  @DbTestData(filename="ZugriffsprotokollierungServiceIT/testdaten_alle_verarbeitet.xml")
  @Test
  void testErmittleUnverarbeiteteProtkollsaetzeKeineUnverarbeitetenDatensaetze() {
	List<ZugriffsprotokollBTO> outputList = zugriffsprotokollierung.ermittleUnverarbeiteteProtkollsaetze(10);
	assertEquals(0, outputList.size());
  }

  @Test
  void testErmittleUnverarbeiteteProtkollsaetzeMitLimit() {
	List<ZugriffsprotokollBTO> outputList = zugriffsprotokollierung.ermittleUnverarbeiteteProtkollsaetze(1);
	assertEquals(1, outputList.size());
  }

  //Tests for Zugriffsprotokollierung.uebermittleProtokollsaetze

  @Disabled("Zurzeit keine Möglichkeit eine negative Rückmeldung von ZUP zu erzwingen")
  @Test
  @DbTestData(filename="testdaten_one_row.xml")
  void testUebermittleProtokollsaetzeResponseNichtOk() {
	List<ZugriffsprotokollBTO> input = createZugriffsprotokollBTOListe();
	input.get(0).setZusatz1("Dieser Text hat mehr als 100 Zeichen, damit wir einen Fehler in der ZUP Schnittstelle provozieren können und somit auf unserer Seite einen Negativ-Test haben.");
	zugriffsprotokollierung.uebermittleProtokollsaetze(input);

	em.getTransaction().commit();
	em.clear();

	List<String> ignoredColumns = new ArrayList<>();
	ignoredColumns.add("verarbdat");

	DbCompare.assertDbEquals("updateZugriffsprotokoll_WithError_expected.xml", this.getConnection(), ignoredColumns);
  }

  private List<ZugriffsprotokollBTO> createZugriffsprotokollBTOListe() {
	List<ZugriffsprotokollBTO> zupBtoListe = new ArrayList<>();
	ZugriffsprotokollBTO       zupBto      = new ZugriffsprotokollBTO();
	zupBto.setApplBetreiber("12");
	zupBto.setApplikation("FOCUS360");
	zupBto.setQuellsystemId("1234");
	zupBto.setBenutzerID("1224012");
	zupBto.setDatum(TestUtil.parseDate("01.014.2019/12:38:35"));
	zupBto.setFehler(null);
	zupBto.setGrund("Versichertenauskunft");
	zupBto.setKrittyp1("PAID");
	zupBto.setKrittyp2("FachschluesselArt");
	zupBto.setKrittyp3("Fachschluessel");
	zupBto.setKritwert1("2280049");
	zupBto.setKritwert2("VSNR");
	zupBto.setKritwert3("1234010100");
	zupBto.setOrg("ORGIT");
	zupBto.setProtLogID("F360_READ_VD");
	zupBto.setSystemumgebung("V");
	zupBto.setTransaktionskennung("0016189800086");
	zupBto.setVerarbeitungsmodus("O");
	zupBto.setVersion(1);
	zupBto.setVstr("12");
	zupBto.setZupId(3L);
	zupBtoListe.add(zupBto);
	return zupBtoListe;
  }

  @Test
  @DbTestData(filename="ZugriffsprotokollierungServiceIT/testdaten_one_row.xml")
  void testUebermittleProtokollsaetzeResponseOk() {
	zugriffsprotokollierung.uebermittleProtokollsaetze(createZugriffsprotokollBTOListe());

	em.getTransaction().commit();
	em.clear();

	List<String> ignoredColumns = new ArrayList<>();
	ignoredColumns.add("verarbdat");

	DbCompare.assertDbEquals("updateZugriffsprotokoll_expected.xml", this.getConnection(), ignoredColumns);
  }
}
