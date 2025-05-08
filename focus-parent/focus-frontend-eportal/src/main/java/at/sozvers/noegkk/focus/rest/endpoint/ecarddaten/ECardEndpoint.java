package at.sozvers.noegkk.focus.rest.endpoint.ecarddaten;

import at.sozvers.noegkk.architektur.zup.Zugriffprotokolliert;
import at.sozvers.noegkk.focus.interceptors.*;
import at.sozvers.noegkk.focus.rest.api.common.*;
import at.sozvers.noegkk.focus.rest.api.ecard.ECarddatenDTO;
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
@Path(ECARD_ECARDDATEN_ENDPOINT)
public class ECardEndpoint {

  @Inject
  private ECardController eCardController;
  @Inject
  private Messages        messages;

  @GET
  @Path(PATH_FS)
  @Consumes(APPLICATION_JSON_CHARSET_UTF_8)
  @Produces(APPLICATION_JSON_CHARSET_UTF_8)
  @Zugriffprotokolliert(logId="F360_READ_ECADMIN")
  // @formatter:off
	public BaseResponseDTO<ECarddatenDTO> searchECard(
		@PathParam(PATH_PARAM_FS)
		String fachschluesselParam,
		@PathParam(PATH_PARAM_FSART)
		String fachschluesselArtParam,
		@QueryParam(PATH_PARAM_PID) String pid
	// @formatter:on
													 ) {
	Fachschluessel fachschluessel = new Fachschluessel(fachschluesselParam, fachschluesselArtParam);
	ECarddatenDTO  dto            = eCardController.searchECarddaten(fachschluessel);
	return BaseResponseDTO.of(dto, MetainformationDTO.of(messages.getMessages()), new ZupInfoDTO(fachschluesselArtParam, fachschluesselParam, pid));
  }
}
