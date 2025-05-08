package at.sozvers.noegkk.focus.service.lgkk.mapper;

import at.sozvers.noegkk.focus.service.api.lgkk.WahWazaBTO;
import at.sozvers.noegkk.focus.service.common.DateUtil;
import at.sozvers.noegkk.focus.service.mapping.BTOExternalServiceMapper;
import at.sozvers.stp.lgkk.webservice.focus360.v20.Focus360WahWazaElementV2Dto;

public class WahWazaBTOExternalServiceMapper extends BTOExternalServiceMapper<WahWazaBTO, Focus360WahWazaElementV2Dto> {
  @Override
  public WahWazaBTO map(Focus360WahWazaElementV2Dto focus360WahWazaElementDto) {
	WahWazaBTO bto = new WahWazaBTO();
	bto.setBehDat(DateUtil.toLocalDateOrNull(focus360WahWazaElementDto.getBehDat()));
	bto.setLgebiet(focus360WahWazaElementDto.getLgebiet());
	bto.setStatus(focus360WahWazaElementDto.getStatus());
	return bto;
  }
}
