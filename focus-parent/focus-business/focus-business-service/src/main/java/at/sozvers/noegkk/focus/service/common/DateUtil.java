package at.sozvers.noegkk.focus.service.common;

import javax.xml.datatype.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class DateUtil {

  private DateUtil() {
	throw new IllegalStateException("Utility class");
  }

  public static XMLGregorianCalendar convertDate2XMLDate(Date date) {
	if(date == null) {
	  return null;
	}

	GregorianCalendar cal = new GregorianCalendar();
	cal.setTime(date);
	int day         = cal.get(Calendar.DAY_OF_MONTH);
	int month       = cal.get(Calendar.MONTH) + 1;
	int year        = cal.get(Calendar.YEAR);
	int hour        = cal.get(Calendar.HOUR_OF_DAY);
	int minute      = cal.get(Calendar.MINUTE);
	int second      = cal.get(Calendar.SECOND);
	int millisecond = cal.get(Calendar.MILLISECOND);

	try {
	  return DatatypeFactory.newInstance().newXMLGregorianCalendar(year, month, day, hour, minute, second, millisecond, 0x80000000);
	} catch(DatatypeConfigurationException e1) {
	  return null;
	}
  }

  public static XMLGregorianCalendar createXmlCalendar(int year, int month, int day) throws DatatypeConfigurationException {
	return DatatypeFactory.newInstance().newXMLGregorianCalendar(new GregorianCalendar(year, month, day));
  }

  public static Date getDateFromGregorianCalendar(XMLGregorianCalendar calendar) {
	if(calendar == null) {
	  return null;
	} else {
	  return calendar.toGregorianCalendar().getTime();
	}
  }

  public static GregorianCalendar getGregorianCalendarAtStartOfDay(XMLGregorianCalendar calendar) {
	return GregorianCalendar.from(calendar.toGregorianCalendar().toZonedDateTime().toLocalDate().atStartOfDay(ZoneId.systemDefault()));
  }

  public static LocalDate getLocalDateFromGregorianCalendar(XMLGregorianCalendar calendar) {
	if(calendar == null) {
	  return null;
	} else {
	  return LocalDate.of(calendar.getYear(), calendar.getMonth(), calendar.getDay());
	}
  }

  public static LocalDate toLocalDate(XMLGregorianCalendar date) {
	if(date == null) {
	  throw new NullPointerException();
	}
	return date.toGregorianCalendar().toZonedDateTime().toLocalDate();
  }

  public static LocalDate toLocalDateFromFormatDDMMYYYY(String date) {
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMMyyyy");
	return LocalDate.parse(date, formatter);
  }

  public static LocalDate toLocalDateOrNull(XMLGregorianCalendar date) {
	if(date == null) {
	  return null;
	}
	return date.toGregorianCalendar().toZonedDateTime().toLocalDate();
  }

  public static LocalDateTime toLocalDateTime(XMLGregorianCalendar date) {
	if(date == null) {
	  return null;
	}
	return date.toGregorianCalendar().toZonedDateTime().toLocalDateTime();
  }

  public static XMLGregorianCalendar toXMLGregorianCalendar(LocalDateTime localDateTime) {
	if(localDateTime == null) {
	  return null;
	}

	int year        = localDateTime.getYear();
	int month       = localDateTime.getMonthValue();
	int day         = localDateTime.getDayOfMonth();
	int hour        = localDateTime.getHour();
	int minute      = localDateTime.getMinute();
	int second      = localDateTime.getSecond();
	int millisecond = 0;

	try {
	  return DatatypeFactory.newInstance().newXMLGregorianCalendar(year, month, day, hour, minute, second, millisecond, 0x80000000);
	} catch(DatatypeConfigurationException e) {
	  return null;
	}
  }
}
