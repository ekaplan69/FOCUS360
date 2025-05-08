package at.sozvers.noegkk.focus.rest.endpoint.person;

import java.math.BigInteger;
import java.util.List;
import at.sozvers.noegkk.architektur.zup.Zugriffprotokolliert;
import at.sozvers.noegkk.focus.interceptors.*;
import at.sozvers.noegkk.focus.rest.api.common.*;
import at.sozvers.noegkk.focus.rest.api.zpv.person.*;
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
@Path(ZPV_PERSON_ENDPOINT)
public class PersonEndpoint {

  @Inject
  private ZPVDashboardController  dashboardController;
  @Inject
  private FachschluesselValidator fachschluesselValidator;
  @Inject
  private Messages                messages;
  @Inject
  private PersonController        personController;

  @GET
  @Path(ZPV_PARTNER_SUCHEN_CC_NEW)
  @Consumes(APPLICATION_JSON_CHARSET_UTF_8)
  @Produces(APPLICATION_JSON_CHARSET_UTF_8)
  public BaseResponseCollectionDTO<List<ClkSuchergebnisDTO>> abfragenSearchPersonClientCoopNew(@PathParam(PATH_PARAM_TOKEN) String clkToken) throws Exception {
	List<ClkSuchergebnisDTO> clkSuchergebnisDTOList = personController.abfragenSearchPersonClientCoopNew(clkToken);

	return BaseResponseCollectionDTO.of(clkSuchergebnisDTOList, MetainformationDTO.of(messages.getMessages()));
  }

  @GET
  @Path(ZPV_INIT_LINK_CC_NEW)
  @Consumes(APPLICATION_JSON_CHARSET_UTF_8)
  @Produces(APPLICATION_JSON_CHARSET_UTF_8)
  public BaseResponseDTO<ClkTokenDTO> initLinkClientCoopNew(@PathParam(PATH_PARAM_PID) String partnerId) throws Exception {
	ClkTokenDTO clkTokenDTO = personController.initLinkClientCoopNew(partnerId);
	clkTokenDTO.setClkLinkUrl(dashboardController.getDashboardUrl());

	return BaseResponseDTO.of(clkTokenDTO, MetainformationDTO.of(messages.getMessages()));
  }

  @GET
  @Path(ZPV_INIT_PARTNER_SUCHEN_CC_NEW)
  @Consumes(APPLICATION_JSON_CHARSET_UTF_8)
  @Produces(APPLICATION_JSON_CHARSET_UTF_8)
  public BaseResponseDTO<ClkTokenDTO> initSearchPersonClientCoopNew() throws Exception {
	ClkTokenDTO clkTokenDTO = personController.initSearchPersonClientCoopNew();

	return BaseResponseDTO.of(clkTokenDTO, MetainformationDTO.of(messages.getMessages()));
  }

  @GET
  @Path(ZPV_PARTNER_SUCHEN_ORG)
  @Consumes(APPLICATION_JSON_CHARSET_UTF_8)
  @Produces(APPLICATION_JSON_CHARSET_UTF_8)
  public BaseResponseCollectionDTO<List<SuchpersonDTO>> searchOrgsWithoutFachschluessel(@PathParam(PATH_PARAM_ORG) String orgName, @PathParam(PATH_PARAM_PLZ) String plz) throws Exception {
	List<SuchpersonDTO> suchpersonDTOList = personController.searchOrgWithoutFachschluessel(orgName, plz);

	return BaseResponseCollectionDTO.of(suchpersonDTOList, MetainformationDTO.of(messages.getMessages()));
  }

  @GET
  @Path(PATH_FS)
  @Consumes(APPLICATION_JSON_CHARSET_UTF_8)
  @Produces(APPLICATION_JSON_CHARSET_UTF_8)
  @Zugriffprotokolliert(logId="F360_READ_PERS")
  // @formatter:off
	public BaseResponseDTO<PersonDTO> searchPerson(
		@PathParam(PATH_PARAM_FS)
		String fachschluesselParam,
		@PathParam(PATH_PARAM_FSART)
		String fachschluesselArtParam
	// @formatter:on
												  ) throws Exception {
	Fachschluessel fachschluessel = new Fachschluessel(fachschluesselParam, fachschluesselArtParam);
	fachschluesselValidator.validate(fachschluessel);

	PersonDTO dto = personController.searchPerson(fachschluessel);

	BigInteger partnerRolleID = dto.getStammdaten().getPartnerVersicherterRolleId() != null ? dto.getStammdaten().getPartnerVersicherterRolleId() : dto.getStammdaten().getPartnerBetreuterRolleId();

	return BaseResponseDTO.of(dto, MetainformationDTO.of(messages.getMessages()), new ZupInfoDTO(fachschluesselArtParam, fachschluesselParam, partnerRolleID.toString()));
  }

  @GET
  @Path(PATH_PARTNER_ID)
  @Consumes(APPLICATION_JSON_CHARSET_UTF_8)
  @Produces(APPLICATION_JSON_CHARSET_UTF_8)
  // @formatter:off
	public BaseResponseCollectionDTO<List<StammdatenKurzDTO>> searchPersonWithPartnerId(
		@PathParam(PATH_PARAM_PARTNER_ID)
		String partnerId
	// @formatter:on
																					   ) throws Exception {
	List<StammdatenKurzDTO> dtoList = personController.searchPersonWithPartnerId(partnerId);

	return BaseResponseCollectionDTO.of(dtoList, MetainformationDTO.of(messages.getMessages()));
  }

  @GET
  @Path(ZPV_PARTNER_SUCHEN)
  @Consumes(APPLICATION_JSON_CHARSET_UTF_8)
  @Produces(APPLICATION_JSON_CHARSET_UTF_8)
  public BaseResponseCollectionDTO<List<SuchpersonDTO>> searchPersonsWithoutFachschluessel(@PathParam(PATH_PARAM_VORNAME) String vorname, @PathParam(PATH_PARAM_NACHNAME) String nachname,
																						   @PathParam(PATH_PARAM_PLZ) String plz, @PathParam(PATH_PARAM_GEBURTSDATUM) String geburtsdatum)
		  throws Exception {
	List<SuchpersonDTO> suchpersonDTOList = personController.searchPersonsWithoutFachschluessel(vorname, nachname, plz, geburtsdatum);

	return BaseResponseCollectionDTO.of(suchpersonDTOList, MetainformationDTO.of(messages.getMessages()));
  }
}
