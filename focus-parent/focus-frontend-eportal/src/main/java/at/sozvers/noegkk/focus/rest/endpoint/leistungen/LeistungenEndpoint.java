package at.sozvers.noegkk.focus.rest.endpoint.leistungen;

import javax.xml.datatype.DatatypeConfigurationException;
import java.util.ArrayList;
import java.util.List;
import at.sozvers.noegkk.architektur.zup.Zugriffprotokolliert;
import at.sozvers.noegkk.dda.service.DDAWs;
import at.sozvers.noegkk.dda.util.api.DDAMeldung;
import at.sozvers.noegkk.focus.interceptors.*;
import at.sozvers.noegkk.focus.rest.api.common.*;
import at.sozvers.noegkk.focus.rest.api.lgkk.*;
import at.sozvers.noegkk.focus.rest.endpoint.leistungen.dokumentlesen.DDAStandardRequestContextProducer;
import at.sozvers.noegkk.focus.service.api.common.MeldungBTO;
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
@Path(LEISTUNGEN_ENDPOINT)
@ZupRequestValues
public class LeistungenEndpoint {

  @Inject
  private DDAWs                ddaws;
  @Inject
  private LeistungenController leistungenController;
  @Inject
  private Messages             messages;

  @GET
  @Path(PATH_DOKUMENT_LESEN)
  @Consumes(APPLICATION_JSON_CHARSET_UTF_8)
  @Produces(APPLICATION_JSON_CHARSET_UTF_8)
  @Zugriffprotokolliert(logId="F360_READ_DOC_LGK")
  public BaseResponseDTO leseDokument(@PathParam(PATH_PARAM_LGK_KEY) String key, @PathParam(PATH_PARAM_PID) String pid, @QueryParam(PATH_PARAM_BEARBEITER) String bearbeiter) {
	DDAStandardRequestContextProducer.setBearbeiter(bearbeiter);
	DDAStandardRequestContextProducer.setMeldendeStelle(bearbeiter.substring(0, 2));
	LgkDokumentDTO     lgkDokumentDTO = new LgkDokumentDTO(ddaws.getDocFromArchive(key));
	MetainformationDTO metainformationDTO;
	if(lgkDokumentDTO.getDocument().getReturninfo().getReturnCode().equals("200")) {
	  metainformationDTO = MetainformationDTO.of(messages.getMessages());
	} else {
	  List<MeldungBTO> meldungen = new ArrayList<>();
	  for(DDAMeldung ddaMeldung : lgkDokumentDTO.getDocument().getReturninfo().getMeldungen()) {
		MeldungBTO meldung = MeldungBTO.of(ddaMeldung.getId(), ddaMeldung.getKategorie(), ddaMeldung.getText());
		meldungen.add(meldung);
	  }
	  metainformationDTO = MetainformationDTO.of(meldungen);
	}

	return BaseResponseDTO.of(lgkDokumentDTO, metainformationDTO, new ZupInfoDTO(null, null, pid));
  }

  @GET
  @Path(PATH_DOKUMENTE)
  @Consumes(APPLICATION_JSON_CHARSET_UTF_8)
  @Produces(APPLICATION_JSON_CHARSET_UTF_8)
  @Zugriffprotokolliert(logId="F360_SUCH_DOC_LGK")
  public BaseResponseDTO leseDokumente(@PathParam(PATH_PARAM_FS) String fs, @PathParam(PATH_PARAM_PID) String pid) throws DatatypeConfigurationException {

	DokumenteDTO       dto                = leistungenController.leseDokumente(fs);
	MetainformationDTO metainformationDTO = MetainformationDTO.of(messages.getMessages());

	return BaseResponseDTO.of(dto, metainformationDTO, new ZupInfoDTO("VSNR", fs, pid, null));
  }

  @GET
  @Path(PATH_LEISTUNGEN)
  @Consumes(APPLICATION_JSON_CHARSET_UTF_8)
  @Produces(APPLICATION_JSON_CHARSET_UTF_8)
  @Zugriffprotokolliert(logId="F360_READ_LGKK")
  public BaseResponseDTO leseLeistungen(@PathParam(PATH_PARAM_FS) String fs, @PathParam(PATH_PARAM_PID) String pid, @QueryParam(QUERY_PARAM_MITVERSICHERUNG) List<String> mitversicherungen,
										@QueryParam(QUERY_PARAM_LANDESTSTELLE) List<String> landesstellen) throws DatatypeConfigurationException {

	LeistungenDTO      dto = leistungenController.leseLeistungen(fs, pid, mitversicherungen, landesstellen);
	MetainformationDTO metainformationDTO;
	if(dto.getMeldungen() != null && !dto.getMeldungen().isEmpty()) {
	  metainformationDTO = MetainformationDTO.of(dto.getMeldungen());
	} else {
	  metainformationDTO = MetainformationDTO.of();
	}

	return BaseResponseDTO.of(dto, metainformationDTO, new ZupInfoDTO("VSNR", fs, pid, null));
  }
}
