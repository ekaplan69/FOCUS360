package at.sozvers.noegkk.focus.service.zugriffsprotokollierung;

import at.sozvers.noegkk.focus.service.api.zugriffsprotokollierung.ZugriffsprotokollBTO;
import com.oracle.xmlns.zupws.ModEnum;
import com.oracle.xmlns.zupws.Protokolle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZugriffsprotokollBTOExternalServiceMapperTest {
  @Test
  void testZugriffsprotokollBTOExternalServiceMapper() {
	ZugriffsprotokollBTOExternalServiceMapper mapper    = new ZugriffsprotokollBTOExternalServiceMapper();
	Protokolle.Prot                           protokoll = mapper.map(createZugriffsprotokollBTO());

	assertNotNull(protokoll);
	assertEquals("12", protokoll.getApplBetreiber());
	assertEquals("BE2", protokoll.getApplikation());
	assertEquals("brunnere", protokoll.getBenutzerID());
	assertEquals("ESB_E_103", protokoll.getFehler());
	assertEquals("Test", protokoll.getGrund());
	assertEquals("VSNR", protokoll.getKRITTYP1());
	assertNull(protokoll.getKRITTYP2());
	assertNull(protokoll.getKRITTYP3());
	assertEquals("1234123456", protokoll.getKRITWERT1());
	assertNull(protokoll.getKRITWERT2());
	assertNull(protokoll.getKRITWERT3());
	assertEquals("zusatz1", protokoll.getOPT1());
	assertEquals("zusatz2", protokoll.getOPT2());
	assertEquals("zusatz4", protokoll.getOPT4());
	assertEquals("zusatz5", protokoll.getOPT5());
	assertEquals("zusatz6", protokoll.getOPT6());
	assertEquals("zusatz8", protokoll.getOPT8());
	assertEquals("orgit", protokoll.getOrg());
	assertEquals("1BEKONLE", protokoll.getProtLogID());
	assertEquals("1", protokoll.getSystemumgebung());
	assertEquals("1234567890123", protokoll.getTrans());
	assertEquals(1, protokoll.getVersion());
	assertEquals("12", protokoll.getVSTR());
	assertEquals(ModEnum.O, protokoll.getMod());
  }

  private ZugriffsprotokollBTO createZugriffsprotokollBTO() {
	ZugriffsprotokollBTO zupBto = new ZugriffsprotokollBTO();
	zupBto.setApplBetreiber("12");
	zupBto.setApplikation("BE2");
	zupBto.setBenutzerID("brunnere");
	zupBto.setQuellsystemId("1234");
	zupBto.setBerechtigungsSystemId("12");
	zupBto.setProtokollierungspflicht("A");
	zupBto.setFehler("ESB_E_103");
	zupBto.setGrund("Test");
	zupBto.setKrittyp1("VSNR");
	zupBto.setKrittyp2(null);
	zupBto.setKrittyp3(null);
	zupBto.setKritwert1("1234123456");
	zupBto.setKritwert2(null);
	zupBto.setKritwert3(null);
	zupBto.setOrg("orgit");
	zupBto.setProtLogID("1BEKONLE");
	zupBto.setSystemumgebung("E");
	zupBto.setTransaktionskennung("1234567890123");
	zupBto.setVerarbeitungsmodus("O");
	zupBto.setVersion(1);
	zupBto.setVstr("12");
	zupBto.setZupId(123L);
	zupBto.setZusatz1("zusatz1");
	zupBto.setZusatz2("zusatz2");
	zupBto.setZusatz3("zusatz3");
	zupBto.setZusatz4("zusatz4");
	zupBto.setZusatz5("zusatz5");
	zupBto.setZusatz6("zusatz6");
	zupBto.setZusatz7("zusatz7");
	zupBto.setZusatz8("zusatz8");
	return zupBto;
  }
}
