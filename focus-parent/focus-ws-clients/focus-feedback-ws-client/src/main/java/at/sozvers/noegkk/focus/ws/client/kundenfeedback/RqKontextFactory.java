package at.sozvers.noegkk.focus.ws.client.kundenfeedback;

import java.util.UUID;
import at.itsv.noegkk.commons.RequestHeadersCommons;
import at.sozvers.noegkk.sckont.kundenfeedback.focus.Bearbeiter;
import at.sozvers.noegkk.sckont.kundenfeedback.focus.RqKontext;

public class RqKontextFactory {

  public static final  String VERARBEITUNGSMODUS = "O";
  private static final String FOCUS              = "FOCUS360";

  private RqKontextFactory() {
	throw new UnsupportedOperationException("This is a factory class and cannot be instantiated");
  }

  public static RqKontext createRqKontext(RequestHeadersCommons requestHeaders) {
	RqKontext rqKontext = new RqKontext();

	rqKontext.setBearbeiter(createBearbeiter(requestHeaders));
	rqKontext.setBearbeitungsGrund(FOCUS);
	rqKontext.setPrimaerSystemId(FOCUS);
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

  public static RqKontext createRqKontext(String benutzername) {
	RqKontext rqKontext = new RqKontext();

	Bearbeiter b = new Bearbeiter();
	b.setBearbeiterId(benutzername);
	b.setBerechtigungsSystemId("BEREz");
	b.setMeldendeStelle(benutzername.substring(0, 2));

	rqKontext.setBearbeiter(b);
	rqKontext.setBearbeitungsGrund(FOCUS);
	rqKontext.setPrimaerSystemId(FOCUS);
	rqKontext.setTransaktionsId(UUID.randomUUID().toString());
	rqKontext.setVerarbeitungsModus(VERARBEITUNGSMODUS);

	return rqKontext;
  }
}
