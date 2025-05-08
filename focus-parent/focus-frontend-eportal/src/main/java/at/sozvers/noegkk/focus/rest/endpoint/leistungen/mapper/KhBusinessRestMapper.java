package at.sozvers.noegkk.focus.rest.endpoint.leistungen.mapper;

import at.sozvers.noegkk.focus.rest.api.lgkk.KhDTO;
import at.sozvers.noegkk.focus.rest.mapping.BusinessRestMapper;
import at.sozvers.noegkk.focus.service.api.lgkk.KhBTO;

public class KhBusinessRestMapper extends BusinessRestMapper<KhDTO, KhBTO> {

  @Override
  public KhDTO map(KhBTO bto) {
	KhDTO dto = new KhDTO();

	dto.setAufnahmeArt(bto.getAufnahmeArt());
	dto.setLvonDat(bto.getLvonDat());
	dto.setLbisDat(bto.getLbisDat());
	dto.setLeName(bto.getLeName());
	dto.setVpnr(bto.getVpnr());

	return dto;
  }
}
