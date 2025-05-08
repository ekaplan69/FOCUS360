package at.sozvers.noegkk.focus.service.zpv.infrastructure;

import at.sozvers.noegkk.focus.service.common.Fachschluessel;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class FachschluesselTest {

  @Test
  void test_FachschluesselArt_Btnr() {
	Fachschluessel fachschluessel = Fachschluessel.of("0123456789", "BTNR");

	assertEquals("0123456789", fachschluessel.getFachschluessel());
	assertEquals("BTNR", fachschluessel.getFachschluesselArt());
  }

  @Test
  void test_FachschluesselArt_NULL() {
	Fachschluessel fachschluessel = Fachschluessel.of(null, null);

	assertNull(fachschluessel.getFachschluessel());
	assertNull(fachschluessel.getFachschluesselArt());
  }

  @Test
  void test_FachschluesselArt_Vsnr() {
	Fachschluessel fachschluessel = Fachschluessel.of("1234567890", "VSNR");

	assertEquals("1234567890", fachschluessel.getFachschluessel());
	assertEquals("VSNR", fachschluessel.getFachschluesselArt());
  }
}
