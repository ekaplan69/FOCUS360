package at.sozvers.noegkk.focus.service.api.common;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MeldungBTOTest {
  @Test
  void test_of_with_null() {
	MeldungBTO meldung = MeldungBTO.of(null, null, null);

	assertNotNull(meldung);

	assertNull(meldung.getFehlerId());
	assertNull(meldung.getFehlerkategorie());
	assertNull(meldung.getMeldungstext());
  }

  @Test
  void test_of_with_values() {
	MeldungBTO meldung = MeldungBTO.of("0", "Allgemein", "Kritischer Fehler");

	assertNotNull(meldung);

	assertEquals("0", meldung.getFehlerId());
	assertEquals("Allgemein", meldung.getFehlerkategorie());
	assertEquals("Kritischer Fehler", meldung.getMeldungstext());
  }

  @Test
  void test_toString_with_null() {
	MeldungBTO meldung = MeldungBTO.of(null, null, null);

	assertNotNull(meldung);
	assertEquals("null (null) : null", meldung.toString());
  }

  @Test
  void test_toString_with_values() {
	MeldungBTO meldung = MeldungBTO.of("0", "Allgemein", "Kritischer Fehler");

	assertNotNull(meldung);
	assertEquals("0 (Allgemein) : Kritischer Fehler", meldung.toString());
  }
}
