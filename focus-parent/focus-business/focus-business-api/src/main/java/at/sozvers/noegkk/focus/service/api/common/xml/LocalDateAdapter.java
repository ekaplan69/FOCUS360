package at.sozvers.noegkk.focus.service.api.common.xml;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import jakarta.xml.bind.annotation.adapters.XmlAdapter;

public class LocalDateAdapter extends XmlAdapter<String, LocalDate> {

  private static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("dd.MM.yyyy");

  public LocalDate unmarshal(String v) throws Exception {
	return LocalDate.parse(v, DATE_TIME_FORMATTER);
  }

  public String marshal(LocalDate v) throws Exception {
	return v.format(DATE_TIME_FORMATTER);
  }
}
