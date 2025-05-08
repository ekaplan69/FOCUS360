package at.sozvers.noegkk.focus.rest.endpoint.dienstgeber;

import java.math.BigInteger;
import at.sozvers.noegkk.architektur.zup.Zugriffprotokolliert;
import at.sozvers.noegkk.focus.interceptors.*;
import at.sozvers.noegkk.focus.rest.api.common.*;
import at.sozvers.noegkk.focus.rest.api.zpv.dienstgeber.DienstgeberDTO;
import at.sozvers.noegkk.focus.service.common.Fachschluessel;
import at.sozvers.noegkk.focus.service.common.FachschluesselValidator;
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
@Path(ZPV_DIENSTGEBER_ENDPOINT)
public class DienstgeberEndpoint {

  @Inject
  private DienstgeberController   dienstgeberController;
  @Inject
  private FachschluesselValidator fachschluesselValidator;
  @Inject
  private Messages                messages;

  @GET
  @Path(PATH_FS)
  @Consumes(APPLICATION_JSON_CHARSET_UTF_8)
  @Produces(APPLICATION_JSON_CHARSET_UTF_8)
  @Zugriffprotokolliert(logId="F360")
  public BaseResponseDTO<DienstgeberDTO> searchDienstgeber(@PathParam(PATH_PARAM_FS) String fachschluesselParam, @PathParam(PATH_PARAM_FSART) String fachschluesselArtParam) {
	Fachschluessel fachschluessel = new Fachschluessel(fachschluesselParam, fachschluesselArtParam);
	fachschluesselValidator.validate(fachschluessel);

	try {
	  DienstgeberDTO dto = dienstgeberController.searchDienstgeber(fachschluessel);

	  BigInteger partnerRolleID       = dto.getStammdatenDTO().getParParrolleIDPartner();
	  String     partnerRolleIdString = partnerRolleID != null ? partnerRolleID.toString() : null;

	  return BaseResponseDTO.of(dto, MetainformationDTO.of(this.messages.getMessages()), new ZupInfoDTO(fachschluesselArtParam, fachschluesselParam, partnerRolleIdString));
	} catch(Exception e) {
	  return BaseResponseDTO.of(null, MetainformationDTO.of(this.messages.getMessages()), new ZupInfoDTO(fachschluesselArtParam, fachschluesselParam, null));
	}
  }
} 
