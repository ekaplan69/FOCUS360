package at.sozvers.focus.persistence.focus.dao;

import at.sozvers.noegkk.focus.CdiExtension;
import jakarta.inject.Inject;
import jakarta.persistence.NoResultException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@ExtendWith(CdiExtension.class)
class FocusMeldendestelleDAOIT {

  @Inject
  FocusMeldendestelleDAO dao;

  @Test
  void test_getMeldendestelleKurzbezeichnungMitID_12() {
	String kurzbezeichnung = dao.getMeldendestelleKurzbezeichnung("12", true);
	assertEquals("12 - ÖGK-N", kurzbezeichnung);
  }

  @Test
  void test_getMeldendestelleKurzbezeichnung_12() {
	String kurzbezeichnung = dao.getMeldendestelleKurzbezeichnung("12");
	assertEquals("ÖGK-N", kurzbezeichnung);
  }

  @Test
  void test_getMeldendestelleKurzbezeichnung_ABCDE_in_DB_nicht_vorhanden() {
	assertThrows(NoResultException.class, () -> {
	  String kurzbezeichnung = dao.getMeldendestelleKurzbezeichnung("ABCDE");
	  assertEquals("ABCDE", kurzbezeichnung);
	});
  }

  @Test
  void test_getMeldendestelleKurzbezeichnung_leerstring() {
	assertThrows(NoResultException.class, () -> {
	  String kurzbezeichnung = dao.getMeldendestelleKurzbezeichnung("");
	  assertEquals(0, kurzbezeichnung.length());
	});
  }

  @Test
  void test_getMeldendestelleKurzbezeichnung_null() {
	assertThrows(NoResultException.class, () -> {
	  String kurzbezeichnung = dao.getMeldendestelleKurzbezeichnung(null);
	  assertEquals(0, kurzbezeichnung.length());
	});
  }
}
