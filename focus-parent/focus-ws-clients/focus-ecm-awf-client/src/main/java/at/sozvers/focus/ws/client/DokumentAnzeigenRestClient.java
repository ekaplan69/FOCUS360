package at.sozvers.focus.ws.client;

import jakarta.enterprise.context.Dependent;
import jakarta.ws.rs.core.Response;

@Dependent
public class DokumentAnzeigenRestClient extends ECMAWFAbstractRestClient<String> {

  private static final String PATH_RESOURCE_PATH            = "awf-api/stp-basic/rest/v1/dokument";
  private static final String PATH_DOKUMENT_ANZEIGEN_METHOD = PATH_RESOURCE_PATH + "/%s/anzeigen";

  public Response dokumentAnzeigen(String dokumentId, ECMAWFHeader header) {
	header.setBearbeitungsGrund("Dokument anzeigen FOCUS360");
	return doPost(dokumentId, String.format(PATH_DOKUMENT_ANZEIGEN_METHOD, dokumentId), header);
  }
}
