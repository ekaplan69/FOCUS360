package at.sozvers.noegkk.focus.ws.client.kva.abzsuc;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import java.time.*;
import java.util.GregorianCalendar;
import at.itsv.noegkk.commons.RequestHeadersCommons;
import at.sozvers.kva.schema.angehoerigenbeziehung.suchen.AngehoerigenBeziehungErmittelnRequest;
import jakarta.inject.Inject;

public class AbzsucLesenRequestFactory {

  @Inject
  @KVAAbzsucService
  private KvaAbzsucClient       kvaAbzsucClient;
  @Inject
  private RequestHeadersCommons requestHeaders;

  public AngehoerigenBeziehungErmittelnRequest createAbzsucRequest_2_0(String fachschluessel, String vonDatumParameter) throws DatatypeConfigurationException {
	AngehoerigenBeziehungErmittelnRequest input = new AngehoerigenBeziehungErmittelnRequest();
	input.setVsnr(fachschluessel);
	ZonedDateTime     zonedDateTime     = LocalDate.now().minusDays(Long.parseLong(vonDatumParameter)).atStartOfDay(ZoneId.of("Europe/Vienna"));
	GregorianCalendar gregorianCalendar = GregorianCalendar.from(zonedDateTime);
	DatatypeFactory   datatypeFactory   = DatatypeFactory.newInstance();
	input.setVondat(datatypeFactory.newXMLGregorianCalendar(gregorianCalendar));
	return input;
  }
}
