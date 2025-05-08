package at.sozvers.noegkk.focus.service.lgkk.mapper;

import java.util.List;
import at.sozvers.noegkk.focus.service.api.lgkk.DokumentBTO;
import at.sozvers.noegkk.focus.service.api.lgkk.DokumenteBTO;
import at.sozvers.noegkk.focus.service.mapping.BTOExternalServiceMapper;
import at.sozvers.stp.lgkk.webservice.focus360.v20.Focus360DokumentResponse;
import at.sozvers.stp.lgkk.webservice.focus360.v20.SucheLGKDokumenteV1Response;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class DokumenteBTOExternalServiceMapper extends BTOExternalServiceMapper<DokumenteBTO, SucheLGKDokumenteV1Response> {

  @Inject
  DokumentBTOExternalServiceMapper dokumentBTOExternalServiceMapper;

  @Override
  public DokumenteBTO map(SucheLGKDokumenteV1Response responseWrapper) {
	DokumenteBTO             dokumenteBTO = new DokumenteBTO();
	Focus360DokumentResponse response     = responseWrapper.getReturn();

	List<DokumentBTO> dokumentBTO = dokumentBTOExternalServiceMapper.mapToBtoList(response.getFocus360DokumentDto());
	dokumenteBTO.setDokumente(dokumentBTO);

	return dokumenteBTO;
  }
}
