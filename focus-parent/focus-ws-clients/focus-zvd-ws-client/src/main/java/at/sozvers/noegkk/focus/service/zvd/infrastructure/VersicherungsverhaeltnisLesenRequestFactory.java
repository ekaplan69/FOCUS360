package at.sozvers.noegkk.focus.service.zvd.infrastructure;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import java.time.LocalDate;
import at.itsv.noegkk.commons.RequestHeadersCommons;
import at.itsv.services.svstd11.types.*;
import at.sozvers.noegkk.focus.ws.client.zvd.ZvdClient;
import at.sozvers.zvd.ws.versicherungsverhaeltnisselesenservice.v3.types.VersicherungsverhaeltnisseLesenRequest;
import jakarta.inject.Inject;

public class VersicherungsverhaeltnisLesenRequestFactory {

  @Inject
  private RequestHeadersCommons requestHeadersCommons;

  @Inject
  @ZVDService
  private ZvdClient zvdClient;

  public VersicherungsverhaeltnisseLesenRequest createVersicherungsverhaeltnisLesenRequest(String fachschluessel, String vonDatumParameter) throws DatatypeConfigurationException {

	VersicherungsverhaeltnisseLesenRequest input = new VersicherungsverhaeltnisseLesenRequest();
	input.setVersicherungsnummer(fachschluessel);
	input.setVonDatum(DatatypeFactory.newInstance().newXMLGregorianCalendar(LocalDate.now().minusDays(Long.valueOf(vonDatumParameter)).toString()));
	input.setBgErmitteln(false);
	input.setHeader(createStandardRequestHeader());
	return input;
  }

  private StandardRequestHeader createStandardRequestHeader() {
	StandardRequestHeader header = new StandardRequestHeader();

	RequestKontext requestKontext = new RequestKontext();
	QuellSystem    quellSystem    = new QuellSystem();
	ZielSystem     zielSystem     = new ZielSystem();

	requestKontext.setBearbeiter(createBearbeiter());
	requestKontext.setBearbeitungsGrund("Focus360");
	requestKontext.setVerarbeitungsmodus(Verarbeitungsmodus.fromValue(zvdClient.getVerarbeitungsmodus()));
	requestKontext.setTransaktionsId(requestHeadersCommons.getTransactionUUID());
	requestKontext.setPrimaerSystemId(zvdClient.getPrimaersytemid());

	quellSystem.setSystemId(zvdClient.getQuellsystemid());
	quellSystem.setApplikationsId("FOCUS360");

	zielSystem.setSystemModus(zvdClient.getSystemmodus());

	header.setKontext(requestKontext);
	header.setQuellSystem(quellSystem);
	header.setZielSystem(zielSystem);

	return header;
  }

  private Bearbeiter createBearbeiter() {
	Bearbeiter b = new Bearbeiter();
	b.setBearbeiterId(requestHeadersCommons.getBearbeiterID());
	b.setMeldendeStelle(requestHeadersCommons.getMeldendeStelle());
	b.setBerechtigungsSystemId(zvdClient.getBerechtigungssystemid());
	return b;
  }
}
