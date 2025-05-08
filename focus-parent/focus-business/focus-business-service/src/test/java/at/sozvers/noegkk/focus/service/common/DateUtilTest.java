package at.sozvers.noegkk.focus.service.common;

import javax.xml.datatype.*;
import java.time.LocalDate;
import java.util.GregorianCalendar;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class DateUtilTest {

  @Test
  void test_toLocalDate_NULL() {
	assertThrows(NullPointerException.class, () -> DateUtil.toLocalDate(null));
  }

  @Test
  void test_toLocalDate_mitWert() throws DatatypeConfigurationException {
	GregorianCalendar    gregCalendar = new GregorianCalendar(2019, 0, 1);
	XMLGregorianCalendar xmlCalendar  = DatatypeFactory.newInstance().newXMLGregorianCalendar(gregCalendar);

	LocalDate date = DateUtil.toLocalDate(xmlCalendar);

	assertEquals(LocalDate.of(2019, 1, 1), date);
  }
}
