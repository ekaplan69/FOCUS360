package at.sozvers.noegkk.focus.service.zpv.infrastructure;

import at.sozvers.noegkk.focus.service.common.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class FachschluesselValidatorTest {

  private FachschluesselValidator validator;

  @BeforeEach
  public void setUp() {
	validator = new FachschluesselValidator();
  }

  @Test
  public void test_searchByFachschluessel_Btnr() throws Exception {

	Fachschluessel fachschluessel = Fachschluessel.of("0123456789", "BTNR");

	validator.validate(fachschluessel);

	// Darf keine Fehler werfen
  }

  @Test
  public void test_searchByFachschluessel_BtnrMitBuchstaben() throws Exception {

	Fachschluessel fachschluessel = Fachschluessel.of("0abcdefghi", "BTNR");

	assertThrows(ValidationException.class, () -> validator.validate(fachschluessel), "Fachschluessel 0abcdefghi ist keine gültige BTNR.");
  }

  @Test
  public void test_searchByFachschluessel_BtnrZuKurz() throws Exception {

	Fachschluessel fachschluessel = Fachschluessel.of("012345678", "BTNR");

	assertThrows(ValidationException.class, () -> validator.validate(fachschluessel), "Fachschluessel 012345678 ist keine gültige BTNR.");
  }

  @Test
  public void test_searchByFachschluessel_BtnrZuLang() throws Exception {

	Fachschluessel fachschluessel = Fachschluessel.of("01234567890", "BTNR");

	assertThrows(ValidationException.class, () -> validator.validate(fachschluessel), "Fachschluessel 01234567890 ist keine gültige BTNR.");
  }

  @Test
  public void test_searchByFachschluessel_NULLVsnr() throws Exception {

	Fachschluessel fachschluessel = Fachschluessel.of(null, null);

	assertThrows(ValidationException.class, () -> validator.validate(fachschluessel), "Fachschluessel und FachschluesselArt müssen gesetzt sein.");
  }

  @Test
  public void test_searchByFachschluessel_Vsnr() throws Exception {

	Fachschluessel fachschluessel = Fachschluessel.of("4107071288", "VSNR");

	validator.validate(fachschluessel);

	// Darf keine Fehler werfen
  }

  @Test
  //@TestCase(key = "QDASH-T59")
  public void test_searchByFachschluessel_VsnrFalschePruefziffer() throws Exception {

	Fachschluessel fachschluessel = Fachschluessel.of("1234567890", "VSNR");

	assertThrows(ValidationException.class, () -> validator.validate(fachschluessel), "Fachschluessel 1234567890 ist keine gültige VSNR.");
  }

  @Test
  //@TestCase(key = "QDASH-T59")
  public void test_searchByFachschluessel_VsnrMitBuchstaben() throws Exception {

	Fachschluessel fachschluessel = Fachschluessel.of("abcdefghij", "VSNR");

	assertThrows(ValidationException.class, () -> validator.validate(fachschluessel), "Fachschluessel abcdefghij ist keine gültige VSNR.");
  }

  @Test
  public void test_searchByFachschluessel_VsnrZuKurz() {

	Fachschluessel fachschluessel = Fachschluessel.of("123456789", "VSNR");

	assertThrows(ValidationException.class, () -> validator.validate(fachschluessel), "Fachschluessel 123456789 ist keine gültige VSNR.");
  }

  @Test
  //@TestCase(key = "QDASH-T59")
  public void test_searchByFachschluessel_VsnrZuLang() throws Exception {

	Fachschluessel fachschluessel = Fachschluessel.of("12345678901", "VSNR");

	assertThrows(ValidationException.class, () -> validator.validate(fachschluessel), "Fachschluessel 12345678901 ist keine gültige VSNR.");
  }

  // Wie kriegt man andere Fachschlüsselarten??
  @Test
  public void test_searchByFachschluessel_art() throws Exception {

	Fachschluessel fachschluessel = Fachschluessel.of("???", "???");

	assertThrows(ValidationException.class, () -> validator.validate(fachschluessel), "FachschluesselArt %s nicht erlaubt.");
  }

  @Test
  public void test_searchByFachschluessel_emptyVsnr() {

	Fachschluessel fachschluessel = Fachschluessel.of("", "");

	assertThrows(ValidationException.class, () -> validator.validate(fachschluessel), "Fachschluessel und FachschluesselArt müssen gesetzt sein.");
  }
}
