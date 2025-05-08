package at.sozvers.noegkk.focus.rest.endpoint.kundenfeedback;

import java.util.List;
import at.sozvers.noegkk.architektur.zup.Zugriffprotokolliert;
import at.sozvers.noegkk.architektur.zup.model.Zusatz30;
import at.sozvers.noegkk.architektur.zup.model.Zusatzinfo;
import at.sozvers.noegkk.focus.interceptors.*;
import at.sozvers.noegkk.focus.rest.api.common.*;
import at.sozvers.noegkk.focus.rest.api.feedback.*;
import at.sozvers.noegkk.focus.rest.api.kontakt.UpdateCountDTO;
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
@Path(FEEDBACK_ENDPOINT)
public class KundenfeedbackEndpoint {
  private static final String                   DATENSATZID = "Datensatz-ID";
  @Inject
  private              KundenfeedbackController controller;
  @Inject
  private              Messages                 messages;

  @PUT
  @Consumes(APPLICATION_JSON_CHARSET_UTF_8)
  @Produces(APPLICATION_JSON_CHARSET_UTF_8)
  @Zugriffprotokolliert(logId="F360_UPD_COMPLAINT")
  public BaseResponseDTO feedbackAendern(@Valid @NotNull KundenfeedbackAendernDTO dto) {
	Long       updatecount = controller.updateFeedback(dto);
	Zusatzinfo zusatzinfo  = new Zusatzinfo();
	zusatzinfo.addZusatz30(new Zusatz30(DATENSATZID, dto.getId().toString()));

	return BaseResponseDTO.of(new UpdateCountDTO(updatecount), MetainformationDTO.of(messages.getMessages()), new ZupInfoDTO(zusatzinfo));
  }

  @POST
  @Consumes(APPLICATION_JSON_CHARSET_UTF_8)
  @Produces(APPLICATION_JSON_CHARSET_UTF_8)
  @Zugriffprotokolliert(logId="F360_SAVE_COMPLAINT")
  public BaseResponseDTO feedbackErstellen(@Valid @NotNull KundenfeedbackErstellenDTO dto) {
	Long       id         = controller.createFeedback(dto);
	Zusatzinfo zusatzinfo = new Zusatzinfo();
	zusatzinfo.addZusatz30(new Zusatz30(DATENSATZID, id.toString()));

	return BaseResponseDTO.of(null, MetainformationDTO.of(messages.getMessages()), new ZupInfoDTO(zusatzinfo));
  }

  @GET
  @Path("{id}")
  @Consumes(APPLICATION_JSON_CHARSET_UTF_8)
  @Produces(APPLICATION_JSON_CHARSET_UTF_8)
  @Zugriffprotokolliert(logId="F360_READ_COMPLAINT")
  public BaseResponseDTO<KundenfeedbackLangDTO> searchFeedbackLang(@PathParam("id") Long id, @QueryParam(PATH_PARAM_PID) String pid) {
	KundenfeedbackLangDTO dto = controller.searchFeedbackLang(id);
	return BaseResponseDTO.of(dto, MetainformationDTO.of(messages.getMessages()), new ZupInfoDTO());
  }

  @GET
  @Path("feedbackgruende")
  @Consumes(APPLICATION_JSON_CHARSET_UTF_8)
  @Produces(APPLICATION_JSON_CHARSET_UTF_8)
  public BaseResponseCollectionDTO<List<KundenfeedbackFeedbackgrundDTO>> searchFeedbackgruende() {
	List<KundenfeedbackFeedbackgrundDTO> dtoList = controller.searchFeedbackgruende();
	return BaseResponseCollectionDTO.of(dtoList, MetainformationDTO.of(messages.getMessages()));
  }

  @GET
  @Consumes(APPLICATION_JSON_CHARSET_UTF_8)
  @Produces(APPLICATION_JSON_CHARSET_UTF_8)
  @Zugriffprotokolliert(logId="F360_READ_COMPLAINT")
  public BaseResponseCollectionDTO<List<KundenfeedbackKurzDTO>> searchFeedbackliste(@QueryParam("fs") String fs, @QueryParam("fsArtKurz") String fsArtKurz, @QueryParam("ersteller") String ersteller,
																					@QueryParam(PATH_PARAM_PID) String pid) {
	List<KundenfeedbackKurzDTO> dtoList = controller.searchFeedbackKurzListe(fs, fsArtKurz, ersteller);
	return BaseResponseCollectionDTO.of(dtoList, MetainformationDTO.of(messages.getMessages()), new ZupInfoDTO());
  }

  @GET
  @Path("themaFbgMaps")
  @Consumes(APPLICATION_JSON_CHARSET_UTF_8)
  @Produces(APPLICATION_JSON_CHARSET_UTF_8)
  public BaseResponseCollectionDTO<List<KundenfeedbackThemaFbgMapDTO>> searchThemaFbgMaps() {
	List<KundenfeedbackThemaFbgMapDTO> dtoList = controller.searchThemaFbgMaps();
	return BaseResponseCollectionDTO.of(dtoList, MetainformationDTO.of(messages.getMessages()));
  }

  @GET
  @Path("themen")
  @Consumes(APPLICATION_JSON_CHARSET_UTF_8)
  @Produces(APPLICATION_JSON_CHARSET_UTF_8)
  public BaseResponseCollectionDTO<List<KundenfeedbackThemaDTO>> searchThemen() {
	List<KundenfeedbackThemaDTO> dtoList = controller.searchThemen();
	return BaseResponseCollectionDTO.of(dtoList, MetainformationDTO.of(messages.getMessages()));
  }

  @GET
  @Path("unterkategorieFbgMaps")
  @Consumes(APPLICATION_JSON_CHARSET_UTF_8)
  @Produces(APPLICATION_JSON_CHARSET_UTF_8)
  public BaseResponseCollectionDTO<List<KundenfeedbackUnterkategorieFbgMapDTO>> searchUnterkategorieFbgMaps() {
	List<KundenfeedbackUnterkategorieFbgMapDTO> dtoList = controller.searchUnterkategorieFbgMaps();
	return BaseResponseCollectionDTO.of(dtoList, MetainformationDTO.of(messages.getMessages()));
  }

  @GET
  @Path("unterkategorien")
  @Consumes(APPLICATION_JSON_CHARSET_UTF_8)
  @Produces(APPLICATION_JSON_CHARSET_UTF_8)
  public BaseResponseCollectionDTO<List<KundenfeedbackUnterkategorieDTO>> searchUnterkategorien() {
	List<KundenfeedbackUnterkategorieDTO> dtoList = controller.searchUnterkategorien();
	return BaseResponseCollectionDTO.of(dtoList, MetainformationDTO.of(messages.getMessages()));
  }
}
