package at.sozvers.focus.ws.client;

import at.sozvers.focus.ws.geschaeftsfall.starten.GeschaeftsfallStarten;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.core.Response;

@ApplicationScoped
public class GeschaeftsfallRestClient extends ECMAWFAbstractRestClient<GeschaeftsfallStarten> {
  private static final String PATH_GESCHAEFTSFALL_STARTEN_METHOD = "/awf-api/stp-basic/rest/%s/v1/geschaeftsfall/starten";

  public Response geschaefstfallStarten(GeschaeftsfallStarten geschaeftsfallStarten, ECMAWFHeader header) {
	header.setBearbeitungsGrund("Kundenfeedback FOCUS360");
	return doPost(geschaeftsfallStarten, PATH_GESCHAEFTSFALL_STARTEN_METHOD, header);
  }
}
