package at.sozvers.noegkk.focus.service.lgkk.mapper;

import at.sozvers.noegkk.focus.service.api.lgkk.HbHmBTO;
import at.sozvers.noegkk.focus.service.common.DateUtil;
import at.sozvers.noegkk.focus.service.mapping.BTOExternalServiceMapper;
import at.sozvers.stp.lgkk.webservice.focus360.v20.Focus360HbHmElementV2Dto;

public class HbhmBTOExternalServiceMapper extends BTOExternalServiceMapper<HbHmBTO, Focus360HbHmElementV2Dto> {

  @Override
  public HbHmBTO map(Focus360HbHmElementV2Dto focus360HbHmElementDto) {
	HbHmBTO hbHmBTO = new HbHmBTO();

	hbHmBTO.setStatus(focus360HbHmElementDto.getStatus());
	hbHmBTO.setVerordnungsDat(DateUtil.toLocalDateOrNull(focus360HbHmElementDto.getVerordDat()));

	return hbHmBTO;
  }
}
