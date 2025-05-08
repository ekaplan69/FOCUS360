package at.sozvers.noegkk.focus.rest.zup;

import at.sozvers.noegkk.focus.interceptors.*;
import at.sozvers.noegkk.focus.rest.api.common.*;
import at.sozvers.noegkk.focus.rest.api.zup.ZUPDTO;
import at.sozvers.noegkk.focus.service.context.Messages;
import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.ws.rs.*;

import static at.sozvers.noegkk.focus.rest.endpoint.constants.RestPaths.*;

@Transactional
@RequestLogging
@ExceptionMeldungsMapper
@Dependent
@ZupRequestValues
@Path(ZUP_ENDPOINT)
public class ZUPEndpoint {

  @Inject
  private Messages      messages;
  @Inject
  private ZUPController zupController;

  @POST
  @Consumes(APPLICATION_JSON_CHARSET_UTF_8)
  @Produces(APPLICATION_JSON_CHARSET_UTF_8)
  public BaseResponseDTO logZup(@Valid @NotNull ZUPDTO dto, @QueryParam(PATH_PARAM_PID) String pid, @QueryParam(PATH_PARAM_PROTID) String protLogId) {
	ZupInfoDTO zupInfoDTO = new ZupInfoDTO(dto.getFachschluesselArtKurz(), dto.getFachschluessel(), pid);
	zupController.log(zupInfoDTO, protLogId);

	return BaseResponseDTO.of(null, MetainformationDTO.of(messages.getMessages()), zupInfoDTO);
  }
}
