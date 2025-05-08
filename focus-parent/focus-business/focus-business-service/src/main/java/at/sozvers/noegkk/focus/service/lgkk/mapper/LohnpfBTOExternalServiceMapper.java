package at.sozvers.noegkk.focus.service.lgkk.mapper;

import at.sozvers.noegkk.focus.service.api.lgkk.LohnPfBTO;
import at.sozvers.noegkk.focus.service.mapping.BTOExternalServiceMapper;
import at.sozvers.stp.lgkk.webservice.focus360.v20.Focus360LohnpfElementV2Dto;

public class LohnpfBTOExternalServiceMapper extends BTOExternalServiceMapper<LohnPfBTO, Focus360LohnpfElementV2Dto> {
  @Override
  public LohnPfBTO map(Focus360LohnpfElementV2Dto focus360LohnpfElementDto) {
	LohnPfBTO bto = new LohnPfBTO();
	bto.setLohnpfaendung(focus360LohnpfElementDto.isLohnpfaendung());
	return bto;
  }
}
