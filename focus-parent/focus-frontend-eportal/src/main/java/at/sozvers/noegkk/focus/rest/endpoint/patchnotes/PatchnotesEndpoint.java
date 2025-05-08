package at.sozvers.noegkk.focus.rest.endpoint.patchnotes;

import at.sozvers.noegkk.focus.interceptors.ExceptionMeldungsMapper;
import at.sozvers.noegkk.focus.interceptors.RequestLogging;
import at.sozvers.noegkk.focus.rest.api.common.BaseResponseDTO;
import at.sozvers.noegkk.focus.rest.api.common.MetainformationDTO;
import at.sozvers.noegkk.focus.rest.api.patchnotes.PatchnotesDTO;
import at.sozvers.noegkk.focus.service.context.Messages;
import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;

import static at.sozvers.noegkk.focus.rest.endpoint.constants.RestPaths.APPLICATION_JSON_CHARSET_UTF_8;
import static at.sozvers.noegkk.focus.rest.endpoint.constants.RestPaths.PATCHNOTES_ENDPOINT;

@Transactional
@RequestLogging
@ExceptionMeldungsMapper
@Dependent
@Path(PATCHNOTES_ENDPOINT)
public class PatchnotesEndpoint {
  @Inject
  private Messages             messages;
  @Inject
  private PatchnotesController patchnotesController;

  @GET
  @Consumes(APPLICATION_JSON_CHARSET_UTF_8)
  @Produces(APPLICATION_JSON_CHARSET_UTF_8)
  public BaseResponseDTO<PatchnotesDTO> lesePatchnotes() {
	PatchnotesDTO dto = new PatchnotesDTO();
	dto.setPatchnotes(patchnotesController.lesePatchnotes());

	MetainformationDTO metainformationDTO = MetainformationDTO.of(messages.getMessages());

	return BaseResponseDTO.of(dto, metainformationDTO);
  }
}
