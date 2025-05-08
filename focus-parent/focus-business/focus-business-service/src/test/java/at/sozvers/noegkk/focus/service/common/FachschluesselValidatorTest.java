package at.sozvers.noegkk.focus.service.common;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

class FachschluesselValidatorTest {

  private FachschluesselValidator validator = new FachschluesselValidator();

  @Test
  void test_fachschluesselArt_falsch_throwsException() {
	Fachschluessel fachschluessel = new Fachschluessel();
	fachschluessel.setFachschluessel("48292703");
	fachschluessel.setFachschluesselArt("ALKSD");

	assertThrows(ValidationException.class, () -> validator.validate(fachschluessel));
  }

  @Test
  void test_fachschluessel_buchstabe_throwsException() {
	Fachschluessel fachschluessel = new Fachschluessel();
	fachschluessel.setFachschluessel("asdf");
	fachschluessel.setFachschluesselArt("VSNR");

	assertThrows(ValidationException.class, () -> validator.validate(fachschluessel));
  }

  @Test
  void test_fachschluessel_empty_throwsException() {
	Fachschluessel fs = new Fachschluessel();

	assertThrows(ValidationException.class, () -> validator.validate(fs));
  }

  @Test
  void test_fachschluessel_falsch_throwsException() {
	Fachschluessel fachschluessel = new Fachschluessel();
	fachschluessel.setFachschluessel("4263060899");
	fachschluessel.setFachschluesselArt("VSNR");

	assertThrows(ValidationException.class, () -> validator.validate(fachschluessel));
  }

  @Test
  void test_fachschluessel_null_throwsException() {
	Fachschluessel fachschluessel = null;

	assertThrows(NullPointerException.class, () -> validator.validate(fachschluessel));
  }

  @Test
  void test_fachschluessel_zuKurz_throwsException() {
	Fachschluessel fachschluessel = new Fachschluessel();
	fachschluessel.setFachschluessel("10");
	fachschluessel.setFachschluesselArt("VSNR");

	assertThrows(ValidationException.class, () -> validator.validate(fachschluessel));
  }
}