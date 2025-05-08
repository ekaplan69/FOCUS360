package at.sozvers.noegkk.focus.ws.client.kva.kvkerm;

import javax.xml.datatype.*;
import java.time.*;
import java.util.GregorianCalendar;
import at.itsv.noegkk.commons.RequestHeadersCommons;
import at.sozvers.kva.schema.ermittle_krankenversicherungsanspruch.KrankenversicherungsanspruchErmittlung;
import jakarta.inject.Inject;

public class KvkermRequestFactory {

  @Inject
  @KVAKvkermService
  private KvaKvkermClient       kvaKvkermClient;
  @Inject
  private RequestHeadersCommons requestHeaders;

  public KrankenversicherungsanspruchErmittlung createKvkermRequest(String fachschluessel) throws DatatypeConfigurationException {
	KrankenversicherungsanspruchErmittlung input = new KrankenversicherungsanspruchErmittlung();
	input.setVersicherungsnummer(fachschluessel);
	ZonedDateTime        zonedDateTime        = LocalDate.now().atStartOfDay(ZoneId.of("Europe/Vienna"));
	DatatypeFactory      datatypeFactory      = DatatypeFactory.newInstance();
	GregorianCalendar    gregorianCalendar    = GregorianCalendar.from(zonedDateTime);
	XMLGregorianCalendar xmlGregorianCalendar = datatypeFactory.newXMLGregorianCalendar(gregorianCalendar);
	input.setErmittlungszeitpunkt(xmlGregorianCalendar);
	input.setKvaBatch(true);
	input.setErstellungsphase(true);
	input.setQualifikation(true);
	input.setKvaOnline(false);
	return input;
  }
}
