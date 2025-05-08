package at.sozvers.noegkk.focus.service.lgkk.mapper;

import at.sozvers.noegkk.focus.service.api.lgkk.WazaKoBTO;
import at.sozvers.noegkk.focus.service.common.DateUtil;
import at.sozvers.noegkk.focus.service.mapping.BTOExternalServiceMapper;
import at.sozvers.stp.lgkk.webservice.focus360.v20.Focus360WazaKoElementV2Dto;

public class WazaKoBTOExternalServiceMapper extends BTOExternalServiceMapper<WazaKoBTO, Focus360WazaKoElementV2Dto> {
  @Override
  public WazaKoBTO map(Focus360WazaKoElementV2Dto dto) {
	WazaKoBTO bto = new WazaKoBTO();

	bto.setAntragDat(DateUtil.toLocalDateOrNull(dto.getAntragDat()));
	bto.setStatus(dto.getStatus());

	return bto;
  }
}
