package at.sozvers.focus.ws.client;

import at.sozvers.focus.ws.generated.Sucheingabe;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.core.Response;

@ApplicationScoped
public class DokumentSuchenRestClient extends ECMAWFAbstractRestClient<Sucheingabe> {

  private static final String PATH_RESOURCE_PATH          = "awf-api/stp-basic/rest/%s/v1/dokument";
  private static final String PATH_DOKUMENT_SUCHEN_METHOD = PATH_RESOURCE_PATH + "/suchen";

  public Response dokumentSuchen(Sucheingabe sucheingabe, ECMAWFHeader header) {
	header.setBearbeitungsGrund("Dokument suchen FOCUS360");
	return doPost(sucheingabe, PATH_DOKUMENT_SUCHEN_METHOD, header);
  }
}
