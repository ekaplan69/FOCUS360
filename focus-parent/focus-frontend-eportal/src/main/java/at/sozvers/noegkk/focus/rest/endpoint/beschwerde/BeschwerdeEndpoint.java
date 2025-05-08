package at.sozvers.noegkk.focus.rest.endpoint.beschwerde;

import java.util.List;
import at.sozvers.noegkk.architektur.zup.Zugriffprotokolliert;
import at.sozvers.noegkk.architektur.zup.model.Zusatz30;
import at.sozvers.noegkk.architektur.zup.model.Zusatzinfo;
import at.sozvers.noegkk.focus.interceptors.*;
import at.sozvers.noegkk.focus.rest.api.beschwerde.*;
import at.sozvers.noegkk.focus.rest.api.common.*;
import at.sozvers.noegkk.focus.service.context.Messages;
import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.ws.rs.*;

import static at.sozvers.noegkk.focus.rest.endpoint.constants.RestPaths.*;

@Transactional
@Dependent
@RequestLogging
@ExceptionMeldungsMapper
@ZupRequestValues
@Path(COMPLAINT_ENDPOINT)
public class BeschwerdeEndpoint {

  private static String               datensatzId = "Datensatz-ID";
  @Inject
  private        BeschwerdeController beschwerdeController;
  @Inject
  private        Messages             messages;

  @POST
  @Consumes(APPLICATION_JSON_CHARSET_UTF_8)
  @Produces(APPLICATION_JSON_CHARSET_UTF_8)
  @Zugriffprotokolliert(logId="F360_SAVE_COMPLAINT")
  public BaseResponseDTO createBeschwerde(@Valid @NotNull BeschwerdeInsertDTO beschwerdeInsertDTO, @QueryParam(PATH_PARAM_PID) String pid) {
	Long id = beschwerdeController.createBeschwerde(beschwerdeInsertDTO);

	Zusatzinfo zusatzinfo = new Zusatzinfo();
	zusatzinfo.addZusatz30(new Zusatz30(datensatzId, id.toString()));

	return BaseResponseDTO.of(null, MetainformationDTO.of(messages.getMessages()),
							  new ZupInfoDTO(beschwerdeInsertDTO.getFachschluesselArt(), beschwerdeInsertDTO.getFachschluessel(), pid, zusatzinfo));
  }

  @GET
  @Path("{beschwerdeId}")
  @Consumes(APPLICATION_JSON_CHARSET_UTF_8)
  @Produces(APPLICATION_JSON_CHARSET_UTF_8)
  @Zugriffprotokolliert(logId="F360_READ_COMPLAINT")
  public BaseResponseDTO<BeschwerdeDetailDTO> getBeschwerde(@PathParam("beschwerdeId") Long beschwerdeId, @QueryParam("fs") String fs, @QueryParam("fsart") String fsart,
															@QueryParam(PATH_PARAM_PID) String pid) {
	BeschwerdeDetailDTO dto = beschwerdeController.searchBeschwerde(beschwerdeId);

	Zusatzinfo zusatzinfo = new Zusatzinfo();
	zusatzinfo.addZusatz30(new Zusatz30(datensatzId, beschwerdeId.toString()));

	return BaseResponseDTO.of(dto, MetainformationDTO.of(messages.getMessages()), new ZupInfoDTO(fsart, fs, pid, zusatzinfo));
  }

  @GET
  @Consumes(APPLICATION_JSON_CHARSET_UTF_8)
  @Produces(APPLICATION_JSON_CHARSET_UTF_8)
  @Zugriffprotokolliert(logId="F360_READ_COMPLAINT")
  public BaseResponseCollectionDTO<List<BeschwerdeDTO>> getBeschwerdeListe(@QueryParam("fs") String fs, @QueryParam("fsart") String fsart, @QueryParam(PATH_PARAM_PID) String pid) {
	List<BeschwerdeDTO> dtoList = beschwerdeController.searchBeschwerdeListe(fs, fsart);
	return BaseResponseCollectionDTO.of(dtoList, MetainformationDTO.of(messages.getMessages()), new ZupInfoDTO(fsart, fs, pid));
  }

  @GET
  @Path("area")
  @Consumes(APPLICATION_JSON_CHARSET_UTF_8)
  @Produces(APPLICATION_JSON_CHARSET_UTF_8)
  public BaseResponseDTO<BeschwerdeBereichDTO> getBeschwerdebereich(@QueryParam("oeId") Long oeId, @QueryParam("bereOrg") String bereOrg, @QueryParam("abfrageDat") @NotNull String abfrageDat) {
	BeschwerdeBereichDTO dto = beschwerdeController.searchBeschwerdebereich(oeId, bereOrg, abfrageDat);
	return BaseResponseDTO.of(dto, MetainformationDTO.of(messages.getMessages()));
  }

  @PUT
  @Path("storno")
  @Consumes(APPLICATION_JSON_CHARSET_UTF_8)
  @Produces(APPLICATION_JSON_CHARSET_UTF_8)
  @Zugriffprotokolliert(logId="F360_UPD_COMPLAINT")
  public BaseResponseDTO storniereBeschwerde(@Valid @NotNull BeschwerdeStornierenDTO beschwerdeStornierenDTO, @QueryParam("fs") String fs, @QueryParam("fsart") String fsart,
											 @QueryParam(PATH_PARAM_PID) String pid) {

	beschwerdeController.storniereBeschwerde(beschwerdeStornierenDTO);

	Zusatzinfo zusatzinfo = new Zusatzinfo();
	zusatzinfo.addZusatz30(new Zusatz30(datensatzId, beschwerdeStornierenDTO.getId().toString()));

	return BaseResponseDTO.of(null, MetainformationDTO.of(messages.getMessages()), new ZupInfoDTO(fs, fsart, pid, zusatzinfo));
  }

  @PUT
  @Path("{beschwerdeId}")
  @Consumes(APPLICATION_JSON_CHARSET_UTF_8)
  @Produces(APPLICATION_JSON_CHARSET_UTF_8)
  @Zugriffprotokolliert(logId="F360_UPD_COMPLAINT")
  public BaseResponseDTO updateBeschwerde(@PathParam("beschwerdeId") Long beschwerdeId, @Valid @NotNull BeschwerdeUpdateDTO beschwerdeUpdateDTO, @QueryParam(PATH_PARAM_PID) String pid) {
	beschwerdeUpdateDTO.setBeschwerdeId(beschwerdeId);
	UpdateCountDTO dto = beschwerdeController.updateBeschwerde(beschwerdeUpdateDTO);

	Zusatzinfo zusatzinfo = new Zusatzinfo();
	zusatzinfo.addZusatz30(new Zusatz30(datensatzId, beschwerdeId.toString()));

	return BaseResponseDTO.of(dto, MetainformationDTO.of(messages.getMessages()), new ZupInfoDTO(beschwerdeUpdateDTO.getFachschluesselArt(), beschwerdeUpdateDTO.getFachschluessel(), pid, zusatzinfo));
  }
}
