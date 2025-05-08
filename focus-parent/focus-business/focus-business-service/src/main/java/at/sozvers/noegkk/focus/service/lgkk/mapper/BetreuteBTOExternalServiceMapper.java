package at.sozvers.noegkk.focus.service.lgkk.mapper;

import at.sozvers.noegkk.focus.service.api.lgkk.BetreuungszeitenBTO;
import at.sozvers.noegkk.focus.service.common.DateUtil;
import at.sozvers.noegkk.focus.service.mapping.BTOExternalServiceMapper;
import at.sozvers.stp.lgkk.webservice.focus360.v20.Focus360BetreuungszeitenElementV2Dto;

public class BetreuteBTOExternalServiceMapper extends BTOExternalServiceMapper<BetreuungszeitenBTO, Focus360BetreuungszeitenElementV2Dto> {
  @Override
  public BetreuungszeitenBTO map(Focus360BetreuungszeitenElementV2Dto focus360BetreuungszeitenElementDto) {
	BetreuungszeitenBTO bto = new BetreuungszeitenBTO();
	bto.setBetreuungBis(DateUtil.toLocalDateOrNull(focus360BetreuungszeitenElementDto.getBetreuungBis()));
	bto.setBetreuungVon(DateUtil.toLocalDateOrNull(focus360BetreuungszeitenElementDto.getBetreuungVon()));
	bto.setLandesstelle(focus360BetreuungszeitenElementDto.getLandesstellen());
	bto.setStatus(focus360BetreuungszeitenElementDto.getStatus());
	return bto;
  }
}
