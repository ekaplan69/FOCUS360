package at.sozvers.noegkk.focus.rest.endpoint.kva.abzsuc;

import javax.xml.datatype.DatatypeConfigurationException;
import java.util.List;
import at.sozvers.noegkk.focus.interceptors.*;
import at.sozvers.noegkk.focus.rest.api.common.*;
import at.sozvers.noegkk.focus.rest.api.kva.abzsuc.AngehoerigeDTO;
import at.sozvers.noegkk.focus.rest.api.kva.abzsuc.VersicherterDTO;
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
@Path(KVA_COINSURANCE_ENDPOINT)
public class AbzsucEndpoint {

  @Inject
  private AbzsucController abzsucController;
  @Inject
  private Messages         messages;

  @GET
  @Path(KVA_ANGEHOERIGE_ENDPOINT + PATH_FS)
  @Consumes(APPLICATION_JSON_CHARSET_UTF_8)
  @Produces(APPLICATION_JSON_CHARSET_UTF_8)
  // @formatter:off
    public BaseResponseCollectionDTO<List<AngehoerigeDTO>> searchAngehoerige(
            @PathParam(PATH_PARAM_FS)
                    String fachschluesselParam,
            @PathParam(PATH_PARAM_FSART)
                    String fachschluesselArtParam,
            @QueryParam(PATH_PARAM_PID) String pid
            // @formatter:on
																			) throws DatatypeConfigurationException {
	Fachschluessel       fachschluessel = Fachschluessel.of(fachschluesselParam, fachschluesselArtParam);
	List<AngehoerigeDTO> dto            = abzsucController.searchAngehoerige(fachschluessel);
	return BaseResponseCollectionDTO.of(dto, MetainformationDTO.of(messages.getMessages()), new ZupInfoDTO(fachschluesselArtParam, fachschluesselParam, pid));
  }

  @GET
  @Path(KVA_VERSICHERTER_ENDPOINT + PATH_FS)
  @Consumes(APPLICATION_JSON_CHARSET_UTF_8)
  @Produces(APPLICATION_JSON_CHARSET_UTF_8)
  // @formatter:off
    public BaseResponseCollectionDTO<List<VersicherterDTO>> searchVersicherter(
            @PathParam(PATH_PARAM_FS)
                    String fachschluesselParam,
            @PathParam(PATH_PARAM_FSART)
                    String fachschluesselArtParam,
            @QueryParam(PATH_PARAM_PID) String pid
            // @formatter:on
																			  ) throws DatatypeConfigurationException {
	Fachschluessel        fachschluessel = Fachschluessel.of(fachschluesselParam, fachschluesselArtParam);
	List<VersicherterDTO> dto            = abzsucController.searchVersicherter(fachschluessel);
	return BaseResponseCollectionDTO.of(dto, MetainformationDTO.of(messages.getMessages()), new ZupInfoDTO(fachschluesselArtParam, fachschluesselParam, pid));
  }
}
