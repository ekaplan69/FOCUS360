package at.sozvers.noegkk.focus.rest.endpoint.system;

import at.sozvers.noegkk.focus.interceptors.ExceptionMeldungsMapper;
import at.sozvers.noegkk.focus.interceptors.RequestLogging;
import at.sozvers.noegkk.focus.rest.api.common.BaseResponseDTO;
import at.sozvers.noegkk.focus.rest.api.common.MetainformationDTO;
import at.sozvers.noegkk.focus.rest.api.ecard.EcAdminDashboardDTO;
import at.sozvers.noegkk.focus.rest.api.lgkk.LeistungenDashboardDTO;
import at.sozvers.noegkk.focus.rest.api.umgebung.UmgebungDTO;
import at.sozvers.noegkk.focus.rest.api.vda.VDADashboardDTO;
import at.sozvers.noegkk.focus.rest.api.zpv.ZPVDashboardDTO;
import at.sozvers.noegkk.focus.rest.endpoint.ecarddaten.EcAdminDashboardController;
import at.sozvers.noegkk.focus.rest.endpoint.leistungen.LeistungenDashboardController;
import at.sozvers.noegkk.focus.rest.endpoint.person.ZPVDashboardController;
import at.sozvers.noegkk.focus.rest.endpoint.umgebung.UmgebungController;
import at.sozvers.noegkk.focus.rest.endpoint.versicherungszeit.VDADashboardController;
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
@Path(SYSTEM_ENDPOINT)
public class SystemEndpoint {

  @Inject
  private ZPVDashboardController        dashboardController;
  @Inject
  private EcAdminDashboardController    ecAdminDashboardController;
  @Inject
  private LeistungenDashboardController leistungenDashboardController;
  @Inject
  private Messages                      messages;
  @Inject
  private UmgebungController            umgebungController;
  @Inject
  private VDADashboardController        vdaDashboardController;

  @GET
  @Path(PATH_ECADMIN_DASHBOARD)
  @Consumes(APPLICATION_JSON_CHARSET_UTF_8)
  @Produces(APPLICATION_JSON_CHARSET_UTF_8)
  public BaseResponseDTO leseEcAdminDashboardUrl() {
	EcAdminDashboardDTO dto                = new EcAdminDashboardDTO(ecAdminDashboardController.getDashboardUrl());
	MetainformationDTO  metainformationDTO = MetainformationDTO.of(messages.getMessages());

	return BaseResponseDTO.of(dto, metainformationDTO);
  }

  @GET
  @Path(PATH_LEISTUNGEN_DASHBOARD)
  @Consumes(APPLICATION_JSON_CHARSET_UTF_8)
  @Produces(APPLICATION_JSON_CHARSET_UTF_8)
  public BaseResponseDTO leseLeistungenDashboardUrl() {
	LeistungenDashboardDTO dto                = new LeistungenDashboardDTO(leistungenDashboardController.getDashboardUrl());
	MetainformationDTO     metainformationDTO = MetainformationDTO.of(messages.getMessages());

	return BaseResponseDTO.of(dto, metainformationDTO);
  }

  @GET
  @Path(PATH_UMGEBUNG)
  @Consumes(APPLICATION_JSON_CHARSET_UTF_8)
  @Produces(APPLICATION_JSON_CHARSET_UTF_8)
  public BaseResponseDTO leseUmgebungUrl() {
	UmgebungDTO        dto                = new UmgebungDTO(umgebungController.getUmgebungUrl());
	MetainformationDTO metainformationDTO = MetainformationDTO.of(messages.getMessages());
	return BaseResponseDTO.of(dto, metainformationDTO);
  }

  @GET
  @Path(PATH_VDA_DASHBOARD)
  @Consumes(APPLICATION_JSON_CHARSET_UTF_8)
  @Produces(APPLICATION_JSON_CHARSET_UTF_8)
  public BaseResponseDTO leseVDADashboardUrl() {
	VDADashboardDTO    dto                = new VDADashboardDTO(vdaDashboardController.getDashboardUrl());
	MetainformationDTO metainformationDTO = MetainformationDTO.of(messages.getMessages());
	return BaseResponseDTO.of(dto, metainformationDTO);
  }

  @GET
  @Path(PATH_ZPV_DASHBOARD)
  @Consumes(APPLICATION_JSON_CHARSET_UTF_8)
  @Produces(APPLICATION_JSON_CHARSET_UTF_8)
  public BaseResponseDTO leseZPVDashboardUrl() {
	ZPVDashboardDTO    dto                = new ZPVDashboardDTO(dashboardController.getDashboardUrl());
	MetainformationDTO metainformationDTO = MetainformationDTO.of(messages.getMessages());
	return BaseResponseDTO.of(dto, metainformationDTO);
  }
}
