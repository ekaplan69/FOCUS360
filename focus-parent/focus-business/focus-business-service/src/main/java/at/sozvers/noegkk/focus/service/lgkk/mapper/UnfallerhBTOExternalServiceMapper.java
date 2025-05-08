package at.sozvers.noegkk.focus.service.lgkk.mapper;

import at.sozvers.noegkk.focus.service.api.lgkk.UnfallerhBTO;
import at.sozvers.noegkk.focus.service.common.DateUtil;
import at.sozvers.noegkk.focus.service.mapping.BTOExternalServiceMapper;
import at.sozvers.stp.lgkk.webservice.focus360.v20.Focus360UnfallerhElementV2Dto;

public class UnfallerhBTOExternalServiceMapper extends BTOExternalServiceMapper<UnfallerhBTO, Focus360UnfallerhElementV2Dto> {

  @Override
  public UnfallerhBTO map(Focus360UnfallerhElementV2Dto dto) {
	UnfallerhBTO bto = new UnfallerhBTO();
	bto.setEingelagtDat(DateUtil.toLocalDateOrNull(dto.getEingelangtDat()));
	bto.setErstellDat(DateUtil.toLocalDateOrNull(dto.getErstellDat()));
	bto.setUrgenz1Dat(DateUtil.toLocalDateOrNull(dto.getUrgenz1Dat()));
	bto.setUrgenz2Dat(DateUtil.toLocalDateOrNull(dto.getUrgenz2Dat()));

	return bto;
  }
}
