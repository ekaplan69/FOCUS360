package at.sozvers.noegkk.focus.service.lgkk.mapper;

import at.sozvers.noegkk.focus.service.api.lgkk.FrtBTO;
import at.sozvers.noegkk.focus.service.common.DateUtil;
import at.sozvers.noegkk.focus.service.mapping.BTOExternalServiceMapper;
import at.sozvers.stp.lgkk.webservice.focus360.v20.Focus360FrtElementV2Dto;

public class FrtBTOExternalServiceMapper extends BTOExternalServiceMapper<FrtBTO, Focus360FrtElementV2Dto> {
  @Override
  public FrtBTO map(Focus360FrtElementV2Dto dto) {
	FrtBTO bto = new FrtBTO();
	bto.setStatus(dto.getStatus());
	bto.setTransportDat(DateUtil.toLocalDateOrNull(dto.getTransportDat()));
	return bto;
  }
}
