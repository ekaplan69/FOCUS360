package at.sozvers.noegkk.focus.rest.endpoint.notiz;

import at.sozvers.noegkk.architektur.zup.Zugriffprotokolliert;
import at.sozvers.noegkk.architektur.zup.model.Zusatz30;
import at.sozvers.noegkk.architektur.zup.model.Zusatzinfo;
import at.sozvers.noegkk.focus.interceptors.*;
import at.sozvers.noegkk.focus.rest.api.common.*;
import at.sozvers.noegkk.focus.rest.api.notiz.NotizDTO;
import at.sozvers.noegkk.focus.service.common.Fachschluessel;
import at.sozvers.noegkk.focus.service.context.Messages;
import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;

import static at.sozvers.noegkk.focus.rest.endpoint.constants.RestPaths.*;

@Transactional
@RequestLogging
@ExceptionMeldungsMapper
@Dependent
@ZupRequestValues
@Path(NOTIZ_ENDPOINT)
public class NotizEndpoint {

  private static final String          DATENSATZID = "Datensatz-ID";
  @Inject
  private              Messages        messages;
  @Inject
  private              NotizController notizController;

  @POST
  @Path(PATH_FS)
  @Consumes(APPLICATION_JSON_CHARSET_UTF_8)
  @Produces(APPLICATION_JSON_CHARSET_UTF_8)
  @Zugriffprotokolliert(logId="F360_SAVE_NOTICE")
  public BaseResponseDTO createNotiz(NotizDTO notizDTO, @PathParam(PATH_PARAM_FS) String fs, @PathParam(PATH_PARAM_FSART) String fsArt, @QueryParam(PATH_PARAM_PID) String pid) {
	Long notizId = notizController.createNotiz(notizDTO);

	Zusatzinfo zusatzinfo = new Zusatzinfo();
	zusatzinfo.addZusatz30(new Zusatz30(DATENSATZID, notizId.toString()));

	return BaseResponseDTO.of(null, MetainformationDTO.of(messages.getMessages()), new ZupInfoDTO(fsArt, fs, pid, zusatzinfo));
  }

  @GET
  @Path(PATH_FS)
  @Consumes(APPLICATION_JSON_CHARSET_UTF_8)
  @Produces(APPLICATION_JSON_CHARSET_UTF_8)
  @Zugriffprotokolliert(logId="F360_READ_NOTICE")
  public BaseResponseDTO<NotizDTO> searchNotiz(@PathParam(PATH_PARAM_FS) String fs, @PathParam(PATH_PARAM_FSART) String fsArt, @QueryParam(PATH_PARAM_PID) String pid) {
	Fachschluessel fachschluessel = Fachschluessel.of(fs, fsArt);

	NotizDTO notizDTO = notizController.searchNotiz(fachschluessel);

	Zusatzinfo zusatzinfo = new Zusatzinfo();
	zusatzinfo.addZusatz30(new Zusatz30(DATENSATZID, notizDTO != null ? notizDTO.getId().toString() : null));

	return BaseResponseDTO.of(notizDTO, MetainformationDTO.of(messages.getMessages()), new ZupInfoDTO(fsArt, fs, pid, zusatzinfo));
  }

  @PUT
  @Path(PATH_FS)
  @Consumes(APPLICATION_JSON_CHARSET_UTF_8)
  @Produces(APPLICATION_JSON_CHARSET_UTF_8)
  @Zugriffprotokolliert(logId="F360_UPD_NOTICE")
  public BaseResponseDTO updateNotiz(NotizDTO notizDTO, @PathParam(PATH_PARAM_FS) String fs, @PathParam(PATH_PARAM_FSART) String fsArt, @QueryParam(PATH_PARAM_PID) String pid) {
	Long notizId = notizController.updateNotiz(notizDTO);

	Zusatzinfo zusatzinfo = new Zusatzinfo();
	zusatzinfo.addZusatz30(new Zusatz30(DATENSATZID, notizId.toString()));

	return BaseResponseDTO.of(null, MetainformationDTO.of(messages.getMessages()), new ZupInfoDTO(fsArt, fs, pid, zusatzinfo));
  }
}
