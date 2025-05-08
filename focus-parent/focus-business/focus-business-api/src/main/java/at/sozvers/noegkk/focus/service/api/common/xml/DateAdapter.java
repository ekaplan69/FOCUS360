package at.sozvers.noegkk.focus.service.api.common.xml;

import java.text.SimpleDateFormat;
import java.util.Date;
import jakarta.xml.bind.annotation.adapters.XmlAdapter;

public class DateAdapter extends XmlAdapter<String, Date> {

  private static final String DATE_PATTERN = "dd.MM.yyyy";

  public Date unmarshal(String v) throws Exception {
	SimpleDateFormat formatter = new SimpleDateFormat(DATE_PATTERN);
	return formatter.parse(v);
  }

  public String marshal(Date v) {
	SimpleDateFormat formatter = new SimpleDateFormat(DATE_PATTERN);
	return formatter.format(v);
  }
}
