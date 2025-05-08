package at.sozvers.noegkk.focus.ws.client.beschwerde;

import at.itsv.noegkk.commons.RequestHeadersCommons;
import at.sozvers.noegkk.sckont.beschwerde.focus.Bearbeiter;
import at.sozvers.noegkk.sckont.beschwerde.focus.RqKontext;

public class RqKontextFactory {

  public static final String VERARBEITUNGSMODUS = "O";

  private RqKontextFactory() {
	throw new java.lang.UnsupportedOperationException("This is a factory class and cannot be instantiated");
  }

  public static RqKontext createRqKontext(RequestHeadersCommons requestHeaders) {
	RqKontext rqKontext = new RqKontext();

	rqKontext.setBearbeiter(createBearbeiter(requestHeaders));
	rqKontext.setBearbeitungsGrund("FOCUS360");
	rqKontext.setPrimaerSystemId("FOCUS360");
	rqKontext.setTransaktionsId(requestHeaders.getTransactionUUID());
	rqKontext.setVerarbeitungsModus(VERARBEITUNGSMODUS);

	return rqKontext;
  }

  private static Bearbeiter createBearbeiter(RequestHeadersCommons requestHeaders) {
	Bearbeiter bearbeiter = new Bearbeiter();

	bearbeiter.setBearbeiterId(requestHeaders.getBearbeiterID());
	bearbeiter.setBerechtigungsSystemId("BEREz");
	bearbeiter.setMeldendeStelle(requestHeaders.getMeldendeStelle());

	return bearbeiter;
  }
}
