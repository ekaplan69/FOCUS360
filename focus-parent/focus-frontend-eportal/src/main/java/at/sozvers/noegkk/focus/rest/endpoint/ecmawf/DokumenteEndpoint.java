package at.sozvers.noegkk.focus.rest.endpoint.ecmawf;

import java.util.List;
import at.sozvers.noegkk.architektur.zup.Zugriffprotokolliert;
import at.sozvers.noegkk.focus.interceptors.*;
import at.sozvers.noegkk.focus.rest.api.common.*;
import at.sozvers.noegkk.focus.rest.api.ecmawf.DokumentDTO;
import at.sozvers.noegkk.focus.rest.api.zpv.person.ClkTokenDTO;
import at.sozvers.noegkk.focus.service.context.Messages;
import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;

import static at.sozvers.noegkk.focus.rest.endpoint.constants.RestPaths.*;

@Transactional
@RequestLogging
@ExceptionMeldungsMapper
@ZupRequestValues
@Dependent
@Path(ECMAWF_DOKUMENTE_ENDPOINT)
public class DokumenteEndpoint {

  @Inject
  private DokumenteController dokumenteController;
  @Inject
  private Messages            messages;

  @GET
  @Path(PATH_SEARCH_DOCS)
  @Consumes(APPLICATION_JSON_CHARSET_UTF_8)
  @Produces(APPLICATION_JSON_CHARSET_UTF_8)
  @Zugriffprotokolliert(logId="F360_SUCH_DOC_ECM")
  public BaseResponseCollectionDTO<List<DokumentDTO>> searchDocsWithPartnerId(@PathParam(PATH_PARAM_PID) String partnerId) {
	List<DokumentDTO> dtoList = dokumenteController.searchDokumenteWithPartnerId(partnerId);

	return BaseResponseCollectionDTO.of(dtoList, MetainformationDTO.of(messages.getMessages()), new ZupInfoDTO(null, null, partnerId));
  }

  @GET
  @Path(PATH_SHOW_DOCS)
  @Consumes(APPLICATION_JSON_CHARSET_UTF_8)
  @Produces(APPLICATION_JSON_CHARSET_UTF_8)
  @Zugriffprotokolliert(logId="F360_ANZ_DOC_ECM")
  public BaseResponseDTO<ClkTokenDTO> showDocWithDocumentId(@PathParam(PATH_PARAM_PID) String partnerId, @PathParam(PATH_PARAM_TOKEN) String dokumentId) {
	ClkTokenDTO dto = dokumenteController.showDokumentByDokumentId(dokumentId);

	return BaseResponseDTO.of(dto, MetainformationDTO.of(messages.getMessages()), new ZupInfoDTO(null, null, partnerId));
  }
}
