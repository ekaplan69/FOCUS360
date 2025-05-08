package at.sozvers.noegkk.focus.rest.endpoint.kontaktneu;

import java.util.List;
import at.sozvers.noegkk.architektur.zup.Zugriffprotokolliert;
import at.sozvers.noegkk.architektur.zup.model.Zusatz30;
import at.sozvers.noegkk.architektur.zup.model.Zusatzinfo;
import at.sozvers.noegkk.focus.interceptors.*;
import at.sozvers.noegkk.focus.rest.api.common.*;
import at.sozvers.noegkk.focus.rest.api.kontakt.AmountDeletedDTO;
import at.sozvers.noegkk.focus.rest.api.kontakt.UpdateCountDTO;
import at.sozvers.noegkk.focus.rest.api.kontaktneu.*;
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
@Path(CONTACT_NEW_ENDPOINT)
public class KontaktNeuEndpoint {

  private static final String               DATENSATZID = "Datensatz-ID";
  @Inject
  private              KontaktNeuController kontaktController;
  @Inject
  private              Messages             messages;

  @DELETE
  @Path("{kontaktId}")
  @Consumes(APPLICATION_JSON_CHARSET_UTF_8)
  @Produces(APPLICATION_JSON_CHARSET_UTF_8)
  public BaseResponseDTO deleteKontakt(@NotNull @PathParam("kontaktId") Long kontaktId) {
	Long amountDeleted = kontaktController.deleteKontakt(kontaktId);
	return BaseResponseDTO.of(new AmountDeletedDTO(amountDeleted), MetainformationDTO.of(messages.getMessages()));
  }

  @GET
  @Path("historie")
  @Consumes(APPLICATION_JSON_CHARSET_UTF_8)
  @Produces(APPLICATION_JSON_CHARSET_UTF_8)
  public BaseResponseCollectionDTO<List<KontaktHistorieDTO>> kontaktHistorieErmitteln(@QueryParam(PATH_PARAM_BEARBEITER) String bearbeiterKennung) {
	List<KontaktHistorieDTO> kontaktHistorie = kontaktController.kontaktHistorieErmitteln(bearbeiterKennung);
	return BaseResponseCollectionDTO.of(kontaktHistorie, MetainformationDTO.of(messages.getMessages()));
  }

  @GET
  @Path("offenekontakte")
  @Consumes(APPLICATION_JSON_CHARSET_UTF_8)
  @Produces(APPLICATION_JSON_CHARSET_UTF_8)
  public BaseResponseCollectionDTO<List<KontaktBasicDTO>> leseOffeneKontakte(@QueryParam("ersteller") Integer mst) {
	List<KontaktBasicDTO> dtoList = kontaktController.searchOffeneKontakte(mst.toString());
	return BaseResponseCollectionDTO.of(dtoList, MetainformationDTO.of(messages.getMessages()));
  }

  @GET
  @Path("offenekontakteforfs")
  @Consumes(APPLICATION_JSON_CHARSET_UTF_8)
  @Produces(APPLICATION_JSON_CHARSET_UTF_8)
  public BaseResponseCollectionDTO<List<KontaktBasicDTO>> leseOffeneKontakteForFs(@QueryParam("fs") String fs, @QueryParam("fsart") String fsart) {
	List<KontaktBasicDTO> dtoList = kontaktController.searchOffeneKontakteForFs(fs, fsart);
	return BaseResponseCollectionDTO.of(dtoList, MetainformationDTO.of(messages.getMessages()));
  }

  @POST
  @Consumes(APPLICATION_JSON_CHARSET_UTF_8)
  @Produces(APPLICATION_JSON_CHARSET_UTF_8)
  @Zugriffprotokolliert(logId="F360_SAVE_CONTACT")
  public BaseResponseDTO saveKontakt(@Valid @NotNull KontaktErstellenAendernDTO dto, @QueryParam(PATH_PARAM_PID) String pid) {
	Long       id         = kontaktController.saveKontakt(dto);
	Zusatzinfo zusatzinfo = new Zusatzinfo();
	zusatzinfo.addZusatz30(new Zusatz30(DATENSATZID, id.toString()));

	return BaseResponseDTO.of(null, MetainformationDTO.of(messages.getMessages()), new ZupInfoDTO(dto.getFachschluesselArtKurz(), dto.getFachschluessel(), pid, zusatzinfo));
  }

  @POST
  @Consumes(APPLICATION_JSON_CHARSET_UTF_8)
  @Produces(APPLICATION_JSON_CHARSET_UTF_8)
  @Zugriffprotokolliert(logId="F360_SAVE_CONTACT")
  public BaseResponseDTO saveKontakt(@Valid @NotNull KontaktErstellenAendernDTO dto) {
	Long       id         = kontaktController.saveKontakt(dto);
	Zusatzinfo zusatzinfo = new Zusatzinfo();
	zusatzinfo.addZusatz30(new Zusatz30(DATENSATZID, id.toString()));

	return BaseResponseDTO.of(null, MetainformationDTO.of(messages.getMessages()), new ZupInfoDTO(zusatzinfo));
  }

  @GET
  @Path("abschlussarten")
  @Consumes(APPLICATION_JSON_CHARSET_UTF_8)
  @Produces(APPLICATION_JSON_CHARSET_UTF_8)
  public BaseResponseCollectionDTO<List<KontaktAbschlussartDTO>> searchAbschlussarten() {
	List<KontaktAbschlussartDTO> dtoList = kontaktController.searchAbschlussarten();
	return BaseResponseCollectionDTO.of(dtoList, MetainformationDTO.of(messages.getMessages()));
  }

  @GET
  @Path("aufgabengebiete")
  @Consumes(APPLICATION_JSON_CHARSET_UTF_8)
  @Produces(APPLICATION_JSON_CHARSET_UTF_8)
  public BaseResponseCollectionDTO<List<KontaktAufgabengebietDTO>> searchAufgabengebiete(@QueryParam("mst") Long mst) {
	List<KontaktAufgabengebietDTO> dtoList = kontaktController.searchAufgabengebiete(mst);
	return BaseResponseCollectionDTO.of(dtoList, MetainformationDTO.of(messages.getMessages()));
  }

  @GET
  @Path("{kontaktId}")
  @Consumes(APPLICATION_JSON_CHARSET_UTF_8)
  @Produces(APPLICATION_JSON_CHARSET_UTF_8)
  @Zugriffprotokolliert(logId="F360_READ_CONTACT")
  public BaseResponseDTO<KontaktDTO> searchKontakt(@NotNull @PathParam("kontaktId") Long kontaktId, @QueryParam("fs") String fs, @QueryParam("fsart") String fsart,
												   @QueryParam(PATH_PARAM_PID) String pid) {
	KontaktDTO dto = kontaktController.searchKontakt(kontaktId);

	Zusatzinfo zusatzinfo = new Zusatzinfo();
	zusatzinfo.addZusatz30(new Zusatz30(DATENSATZID, kontaktId.toString()));

	return BaseResponseDTO.of(dto, MetainformationDTO.of(messages.getMessages()), new ZupInfoDTO(fsart, fs, pid, zusatzinfo));
  }

  @GET
  @Path("{kontaktId}")
  @Consumes(APPLICATION_JSON_CHARSET_UTF_8)
  @Produces(APPLICATION_JSON_CHARSET_UTF_8)
  @Zugriffprotokolliert(logId="F360_READ_CONTACT")
  public BaseResponseDTO<KontaktDTO> searchKontakt(@NotNull @PathParam("kontaktId") Long kontaktId) {
	KontaktDTO dto        = kontaktController.searchKontakt(kontaktId);
	Long       id         = dto.getKontaktId();
	Zusatzinfo zusatzinfo = new Zusatzinfo();
	zusatzinfo.addZusatz30(new Zusatz30(DATENSATZID, id.toString()));

	return BaseResponseDTO.of(dto, MetainformationDTO.of(messages.getMessages()), new ZupInfoDTO(zusatzinfo));
  }

  @GET
  @Path("aufggaamstmap")
  @Consumes(APPLICATION_JSON_CHARSET_UTF_8)
  @Produces(APPLICATION_JSON_CHARSET_UTF_8)
  public BaseResponseCollectionDTO<List<KontaktAufggAaMstDTO>> searchKontaktAufggAaMstMapping(@QueryParam("mst") Long mstCode) {
	List<KontaktAufggAaMstDTO> dtoList = kontaktController.searchKontaktAufggAaMstMaps(mstCode);
	return BaseResponseCollectionDTO.of(dtoList, MetainformationDTO.of(messages.getMessages()));
  }

  @GET
  @Path("aufggktmstmap")
  @Consumes(APPLICATION_JSON_CHARSET_UTF_8)
  @Produces(APPLICATION_JSON_CHARSET_UTF_8)
  public BaseResponseCollectionDTO<List<KontaktAufggKtMstDTO>> searchKontaktAufggKtMstMapping(@QueryParam("mst") Long mstCode) {
	List<KontaktAufggKtMstDTO> dtoList = kontaktController.searchKontaktAufggKtMstMaps(mstCode);
	return BaseResponseCollectionDTO.of(dtoList, MetainformationDTO.of(messages.getMessages()));
  }

  @GET
  @Path("aufggsubmap")
  @Consumes(APPLICATION_JSON_CHARSET_UTF_8)
  @Produces(APPLICATION_JSON_CHARSET_UTF_8)
  public BaseResponseCollectionDTO<List<KontaktAufggSubMapDTO>> searchKontaktAufggSubMapping(@QueryParam("aufgabengebietId") Long aufgabengebietId) {
	List<KontaktAufggSubMapDTO> dtoList = kontaktController.searchKontaktAufggSubMaps(aufgabengebietId);
	return BaseResponseCollectionDTO.of(dtoList, MetainformationDTO.of(messages.getMessages()));
  }

  @GET
  @Path("aufggthemamstmap")
  @Consumes(APPLICATION_JSON_CHARSET_UTF_8)
  @Produces(APPLICATION_JSON_CHARSET_UTF_8)
  public BaseResponseCollectionDTO<List<KontaktAufggThemaMstDTO>> searchKontaktAufggThemaMstMapping(@QueryParam("mst") Long mstCode) {
	List<KontaktAufggThemaMstDTO> dtoList = kontaktController.searchKontaktAufggThemaMstMaps(mstCode);
	return BaseResponseCollectionDTO.of(dtoList, MetainformationDTO.of(messages.getMessages()));
  }

  @GET
  @Path("kontaktarten")
  @Consumes(APPLICATION_JSON_CHARSET_UTF_8)
  @Produces(APPLICATION_JSON_CHARSET_UTF_8)
  public BaseResponseCollectionDTO<List<KontaktKontaktartDTO>> searchKontaktarten() {
	List<KontaktKontaktartDTO> dtoList = kontaktController.searchKontaktarten();
	return BaseResponseCollectionDTO.of(dtoList, MetainformationDTO.of(messages.getMessages()));
  }

  @GET
  @Consumes(APPLICATION_JSON_CHARSET_UTF_8)
  @Produces(APPLICATION_JSON_CHARSET_UTF_8)
  @Zugriffprotokolliert(logId="F360_READ_CONTACT")
  public BaseResponseCollectionDTO<List<KontaktBasicDTO>> searchKontakte(@NotNull @QueryParam("fs") String fs, @NotNull @QueryParam("fsart") String fsart, @QueryParam(PATH_PARAM_PID) String pid) {
	List<KontaktBasicDTO> dtoList = kontaktController.searchKontakte(fs, fsart);
	return BaseResponseCollectionDTO.of(dtoList, MetainformationDTO.of(messages.getMessages()), new ZupInfoDTO(fsart, fs, pid));
  }

  @GET
  @Path("themen")
  @Consumes(APPLICATION_JSON_CHARSET_UTF_8)
  @Produces(APPLICATION_JSON_CHARSET_UTF_8)
  public BaseResponseCollectionDTO<List<KontaktThemaDTO>> searchThemen() {
	List<KontaktThemaDTO> dtoList = kontaktController.searchThemen();
	return BaseResponseCollectionDTO.of(dtoList, MetainformationDTO.of(messages.getMessages()));
  }

  @GET
  @Path("unterthemen")
  @Consumes(APPLICATION_JSON_CHARSET_UTF_8)
  @Produces(APPLICATION_JSON_CHARSET_UTF_8)
  public BaseResponseCollectionDTO<List<KontaktUnterthemaDTO>> searchUnterthemen() {
	List<KontaktUnterthemaDTO> dtoList = kontaktController.searchUnterthemen();
	return BaseResponseCollectionDTO.of(dtoList, MetainformationDTO.of(messages.getMessages()));
  }

  @PUT
  @Consumes(APPLICATION_JSON_CHARSET_UTF_8)
  @Produces(APPLICATION_JSON_CHARSET_UTF_8)
  @Zugriffprotokolliert(logId="F360_UPD_CONTACT")
  public BaseResponseDTO updateKontakt(@Valid @NotNull KontaktErstellenAendernDTO dto, @QueryParam(PATH_PARAM_PID) String pid) {
	Long       updatecount = kontaktController.updateKontakt(dto);
	Zusatzinfo zusatzinfo  = new Zusatzinfo();
	zusatzinfo.addZusatz30(new Zusatz30(DATENSATZID, dto.getKontaktId().toString()));

	return BaseResponseDTO.of(new UpdateCountDTO(updatecount), MetainformationDTO.of(messages.getMessages()), new ZupInfoDTO(dto.getFachschluesselArtKurz(), dto.getFachschluessel(), pid, zusatzinfo));
  }
}
