package at.sozvers.noegkk.focus.service.lgkk.mapper;

import at.sozvers.noegkk.focus.service.api.lgkk.KhBTO;
import at.sozvers.noegkk.focus.service.common.DateUtil;
import at.sozvers.noegkk.focus.service.mapping.BTOExternalServiceMapper;
import at.sozvers.stp.lgkk.webservice.focus360.v20.Focus360KhElementV2Dto;

public class KhBTOExternalServiceMapper extends BTOExternalServiceMapper<KhBTO, Focus360KhElementV2Dto> {
  @Override
  public KhBTO map(Focus360KhElementV2Dto dto) {
	KhBTO khBTO = new KhBTO();
	khBTO.setAufnahmeArt(dto.getAufnahmeArt());
	khBTO.setLbisDat(DateUtil.toLocalDateOrNull(dto.getLbisDat()));
	khBTO.setLeName(dto.getLeName());
	khBTO.setLvonDat(DateUtil.toLocalDateOrNull(dto.getLvonDat()));
	khBTO.setVpnr(dto.getVpnr());
	return khBTO;
  }
}
