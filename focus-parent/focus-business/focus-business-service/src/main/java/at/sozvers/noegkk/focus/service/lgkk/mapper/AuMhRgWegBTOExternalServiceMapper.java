package at.sozvers.noegkk.focus.service.lgkk.mapper;

import at.sozvers.noegkk.focus.service.api.lgkk.AuMhRgWegBTO;
import at.sozvers.noegkk.focus.service.common.DateUtil;
import at.sozvers.noegkk.focus.service.mapping.BTOExternalServiceMapper;
import at.sozvers.stp.lgkk.webservice.focus360.v20.Focus360AuMhRgWegElementV2Dto;

public class AuMhRgWegBTOExternalServiceMapper extends BTOExternalServiceMapper<AuMhRgWegBTO, Focus360AuMhRgWegElementV2Dto> {
  @Override
  public AuMhRgWegBTO map(Focus360AuMhRgWegElementV2Dto dto) {
	AuMhRgWegBTO bto = new AuMhRgWegBTO();
	bto.setAnweisungDat(DateUtil.toLocalDateOrNull(dto.getAnweisungDat()));
	bto.setLbisDat(DateUtil.toLocalDateOrNull(dto.getLbisDat()));
	bto.setLgebiet(dto.getLgebiet());
	bto.setLvonDat(DateUtil.toLocalDateOrNull(dto.getLvonDat()));
	bto.setStatus(dto.getStatus());
	return bto;
  }
}
