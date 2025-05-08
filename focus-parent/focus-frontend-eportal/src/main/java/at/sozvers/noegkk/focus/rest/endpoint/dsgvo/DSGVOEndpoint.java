package at.sozvers.noegkk.focus.rest.endpoint.dsgvo;

import java.util.Arrays;
import java.util.List;
import at.sozvers.noegkk.architektur.zup.Zugriffprotokolliert;
import at.sozvers.noegkk.focus.interceptors.*;
import at.sozvers.noegkk.focus.service.context.Messages;
import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.validation.constraints.NotNull;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.slf4j.Logger;

import static at.sozvers.noegkk.focus.rest.endpoint.constants.RestPaths.APPLICATION_JSON_CHARSET_UTF_8;
import static at.sozvers.noegkk.focus.rest.endpoint.constants.RestPaths.DSGVO_ENDPOINT;

@Transactional
@RequestLogging
@ExceptionMeldungsMapper
@Dependent
@ZupRequestValues
@Path(DSGVO_ENDPOINT)
public class DSGVOEndpoint {

  @Inject
  private DSGVOController dsgvoController;
  @Inject
  private Logger          log;
  @Inject
  private Messages        messages;

  @GET
  @Consumes(APPLICATION_JSON_CHARSET_UTF_8)
  @Produces(MediaType.APPLICATION_OCTET_STREAM)
  @Zugriffprotokolliert(logId="F360_READ_DSGVO")
  public Response getDSGVOPdf(@NotNull @QueryParam("fs") String fs, @NotNull @QueryParam("fsArt") String fsArt, @QueryParam("pid") String pid) {
	List<Integer> landesStellen = Arrays.asList(11, 12, 13, 14, 15, 16, 17, 18, 19); // TODO: Liste mit Landesstellen richtig ermitteln (über Versicherungszeiten und Angehörige)
	Double        personPid     = null;
	log.info("pid = " + pid);
	try {
	  personPid = Double.parseDouble(pid);
	} catch(NumberFormatException e) {
	  log.error("Fehler beim Umwandeln der PersonPID in einen Double.", e);
	}
	try {
	  byte[] pdf = dsgvoController.createPdf(fs, fsArt, personPid, landesStellen);

	  return Response.ok(pdf, MediaType.APPLICATION_OCTET_STREAM).build();
	} catch(Exception e) {
	  log.error("Fehler beim Erstellen des PDF für den DSGVO-Report.", e);
	  return Response.serverError().build();
	}
  }
}
