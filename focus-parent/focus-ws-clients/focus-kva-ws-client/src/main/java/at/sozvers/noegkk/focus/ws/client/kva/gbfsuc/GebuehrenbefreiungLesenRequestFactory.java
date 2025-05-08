package at.sozvers.noegkk.focus.ws.client.kva.gbfsuc;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import java.time.*;
import java.time.format.DateTimeFormatter;
import at.itsv.noegkk.commons.RequestHeadersCommons;
import at.sozvers.kva.schema.gebuehrenbefreiung.suchen.GebuehrenbefreiunRequest;
import jakarta.inject.Inject;

public class GebuehrenbefreiungLesenRequestFactory {

  @Inject
  @KVAGbfsucService
  private KvaGbfsucClient       kvaGbfsucClient;
  @Inject
  private RequestHeadersCommons requestHeaders;

  public GebuehrenbefreiunRequest createGbfsucRequest(String fachschluessel, String vonDatumParameter) throws DatatypeConfigurationException {
	GebuehrenbefreiunRequest input = new GebuehrenbefreiunRequest();
	input.setVsnr(fachschluessel);
	ZonedDateTime     zonedDateTime                 = LocalDate.now().minusDays(Long.parseLong(vonDatumParameter)).atStartOfDay(ZoneId.of("Europe/Vienna"));
	DatatypeFactory   datatypeFactory               = DatatypeFactory.newInstance();
	DateTimeFormatter xmlGregorianCalendarFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ssXXX");
	String            formattedDate                 = zonedDateTime.format(xmlGregorianCalendarFormatter);
	input.setVondat(datatypeFactory.newXMLGregorianCalendar(formattedDate));
	return input;
  }
}
