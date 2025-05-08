package at.sozvers.noegkk.focus.service.lgkk.mapper;

import at.sozvers.noegkk.focus.service.api.lgkk.EkosBTO;
import at.sozvers.noegkk.focus.service.common.DateUtil;
import at.sozvers.noegkk.focus.service.mapping.BTOExternalServiceMapper;
import at.sozvers.stp.lgkk.webservice.focus360.v20.Focus360EkosElementV2Dto;

public class EkosBTOExternalServiceMapper extends BTOExternalServiceMapper<EkosBTO, Focus360EkosElementV2Dto> {
  @Override
  public EkosBTO map(Focus360EkosElementV2Dto dto) {
	EkosBTO bto = new EkosBTO();
	bto.setAntragStatus(dto.getAntragStatus());
	bto.setEingelangtDat(DateUtil.toLocalDateOrNull(dto.getEingelangtDat()));
	return bto;
  }
}
