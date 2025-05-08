package at.sozvers.noegkk.focus.service.zugriffsprotokollierung;

import at.sozvers.noegkk.architektur.zup.model.Zugriffsprotokoll;
import at.sozvers.noegkk.focus.service.api.zugriffsprotokollierung.ZugriffsprotokollBTO;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZugriffsprotokollBTOEntityMapperTest {
  @Test
  void testZugriffsprotokollBTOEntityMapper() {
	ZugriffsprotokollBTOEntityMapper mapper               = new ZugriffsprotokollBTOEntityMapper();
	ZugriffsprotokollBTO             zugriffsprotokollBto = mapper.map(createZugriffsprotokoll());

	assertNotNull(zugriffsprotokollBto);
	assertEquals("12", zugriffsprotokollBto.getApplBetreiber());
	assertEquals("BE2", zugriffsprotokollBto.getApplikation());
	assertEquals("brunnere", zugriffsprotokollBto.getBenutzerID());
	assertNull(zugriffsprotokollBto.getFehler());
	assertEquals("Test", zugriffsprotokollBto.getGrund());
	assertEquals("VSNR", zugriffsprotokollBto.getKrittyp1());
	assertNull(zugriffsprotokollBto.getKrittyp2());
	assertNull(zugriffsprotokollBto.getKrittyp3());
	assertEquals("1234123456", zugriffsprotokollBto.getKritwert1());
	assertNull(zugriffsprotokollBto.getKritwert2());
	assertNull(zugriffsprotokollBto.getKritwert3());
	assertEquals("orgit", zugriffsprotokollBto.getOrg());
	assertEquals("1BEKONLE", zugriffsprotokollBto.getProtLogID());
	assertEquals("V", zugriffsprotokollBto.getSystemumgebung());
	assertEquals("132465790123", zugriffsprotokollBto.getTransaktionskennung());
	assertEquals("O", zugriffsprotokollBto.getVerarbeitungsmodus());
	assertEquals(1, zugriffsprotokollBto.getVersion());
	assertEquals("12", zugriffsprotokollBto.getVstr());
	assertEquals(123L, zugriffsprotokollBto.getZupId());
	assertEquals("zusatz1", zugriffsprotokollBto.getZusatz1());
	assertEquals("zusatz3", zugriffsprotokollBto.getZusatz3());
	assertEquals("zusatz5", zugriffsprotokollBto.getZusatz5());
	assertEquals("zusatz7", zugriffsprotokollBto.getZusatz7());
	assertEquals("zusatz8", zugriffsprotokollBto.getZusatz8());
  }

  private Zugriffsprotokoll createZugriffsprotokoll() {
	Zugriffsprotokoll zup = new Zugriffsprotokoll();
	zup.setBearbeitungsGrund("Test");
	zup.setBenutzerId("brunnere");
	zup.setBenutzerOrgEinheit("orgit");
	zup.setFehler(null);
	zup.setFehlertext(null);
	zup.setId(123L);
	zup.setIdApp("BE2");
	zup.setKriteriumTyp_1("VSNR");
	zup.setKriteriumTyp_2(null);
	zup.setKriteriumTyp_3(null);
	zup.setKriteriumWert_1("1234123456");
	zup.setKriteriumWert_2(null);
	zup.setKriteriumWert_3(null);
	zup.setLogId("1BEKONLE");
	zup.setProtokollDatum("20010101");
	zup.setProtokollZeitpunkt("11300000");
	zup.setSystemModus("V");
	zup.setTraegerId("12");
	zup.setTransaktionsKennung("132465790123");
	zup.setVerarbdat(null);
	zup.setVerarbeitetjn("N");
	zup.setVerarbeitungsModus("O");
	zup.setVersion(1);
	zup.setZusatz_1("zusatz1");
	zup.setZusatz_10("zusatz10");
	zup.setZusatz_11("zusatz11");
	zup.setZusatz_12("zusatz12");
	zup.setZusatz_13("zusatz13");
	zup.setZusatz_14("zusatz14");
	zup.setZusatz_15("zusatz15");
	zup.setZusatz_2("zusatz2");
	zup.setZusatz_3("zusatz3");
	zup.setZusatz_4("zusatz4");
	zup.setZusatz_5("zusatz5");
	zup.setZusatz_6("zusatz6");
	zup.setZusatz_7("zusatz7");
	zup.setZusatz_8("zusatz8");
	zup.setZusatz_9("zusatz9");
	zup.setZvst("12");
	return zup;
  }
}
