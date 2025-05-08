package at.sozvers.noegkk.focus.rest.endpoint.versicherungszeit;

import javax.xml.datatype.DatatypeConfigurationException;
import java.util.List;
import at.sozvers.noegkk.architektur.zup.Zugriffprotokolliert;
import at.sozvers.noegkk.focus.interceptors.*;
import at.sozvers.noegkk.focus.rest.api.common.*;
import at.sozvers.noegkk.focus.rest.api.zvd.VersicherungszeitDTO;
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
@Path(ZVD_VERSICHERUNGSZEIT_ENDPOINT)
public class VersicherungszeitEndpoint {

  @Inject
  private Messages                    messages;
  @Inject
  private VersicherungszeitController versicherungszeitController;

  @GET
  @Path(PATH_FS)
  @Consumes(APPLICATION_JSON_CHARSET_UTF_8)
  @Produces(APPLICATION_JSON_CHARSET_UTF_8)
  @Zugriffprotokolliert(logId="F360_READ_VD")
  public BaseResponseCollectionDTO<List<VersicherungszeitDTO>> searchVersicherungszeit(@PathParam(PATH_PARAM_FS) String fachschluesselParam, @PathParam(PATH_PARAM_FSART) String fachschluesselArtParam,
																					   @QueryParam(PATH_PARAM_PID) String pid) throws DatatypeConfigurationException {
	Fachschluessel             fachschluessel = new Fachschluessel(fachschluesselParam, fachschluesselArtParam);
	List<VersicherungszeitDTO> dto            = versicherungszeitController.searchVersicherungszeit(fachschluessel);

	return BaseResponseCollectionDTO.of(dto, MetainformationDTO.of(messages.getMessages()), new ZupInfoDTO(fachschluesselArtParam, fachschluesselParam, pid));
  }
}
