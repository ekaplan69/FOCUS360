package at.sozvers.noegkk.focus.service.lgkk.mapper;

import at.sozvers.noegkk.focus.service.api.lgkk.MedStBTO;
import at.sozvers.noegkk.focus.service.common.DateUtil;
import at.sozvers.noegkk.focus.service.mapping.BTOExternalServiceMapper;
import at.sozvers.stp.lgkk.webservice.focus360.v20.Focus360MedStElementV2Dto;

public class MedStBTOExternalServiceMapper extends BTOExternalServiceMapper<MedStBTO, Focus360MedStElementV2Dto> {
  @Override
  public MedStBTO map(Focus360MedStElementV2Dto dto) {
	MedStBTO medStBTO = new MedStBTO();
	medStBTO.setGueltigBisDat(DateUtil.toLocalDateOrNull(dto.getGueltigBisDat()));
	medStBTO.setLgebiet(dto.getLgebiet());
	medStBTO.setStellungnahme(dto.getStellungnahme());
	return medStBTO;
  }
}
