package at.sozvers.noegkk.focus.service.lgkk.mapper;

import at.sozvers.noegkk.focus.service.api.lgkk.VwstBTO;
import at.sozvers.noegkk.focus.service.common.DateUtil;
import at.sozvers.noegkk.focus.service.mapping.BTOExternalServiceMapper;
import at.sozvers.stp.lgkk.webservice.focus360.v20.Focus360VwstElementV2Dto;

public class VwstBTOExternalServiceMapper extends BTOExternalServiceMapper<VwstBTO, Focus360VwstElementV2Dto> {

  @Override
  public VwstBTO map(Focus360VwstElementV2Dto dto) {
	VwstBTO bto = new VwstBTO();
	bto.setGueltigBisDat(DateUtil.toLocalDateOrNull(dto.getGueltigBisDat()));
	bto.setLeistungsType(dto.getLeistungsType());
	return bto;
  }
}
