package at.sozvers.noegkk.focus.rest.endpoint.kva.kvkerm;

import javax.xml.datatype.DatatypeConfigurationException;
import at.sozvers.noegkk.architektur.zup.Zugriffprotokolliert;
import at.sozvers.noegkk.focus.interceptors.*;
import at.sozvers.noegkk.focus.rest.api.common.*;
import at.sozvers.noegkk.focus.rest.api.kva.kvkerm.KvkermDTO;
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
@Path(KVA_KVKERM_ENDPOINT)
public class KvkermEndpoint {

  @Inject
  private KvkermController kvkermController;
  @Inject
  private Messages         messages;

  @GET
  @Path(PATH_KVKERM)
  @Consumes(APPLICATION_JSON_CHARSET_UTF_8)
  @Produces(APPLICATION_JSON_CHARSET_UTF_8)
  @Zugriffprotokolliert(logId="F360_READ_KVA")
  public BaseResponseDTO krankenanspruchErmitteln(@PathParam(PATH_PARAM_FS) String fs, @PathParam(PATH_PARAM_PID) String pid) throws DatatypeConfigurationException {
	KvkermDTO          dto                = kvkermController.krankenanspruchErmitteln(fs);
	MetainformationDTO metainformationDTO = MetainformationDTO.of(messages.getMessages());

	return BaseResponseDTO.of(dto, metainformationDTO, new ZupInfoDTO("VSNR", fs, pid, null));
  }
}
