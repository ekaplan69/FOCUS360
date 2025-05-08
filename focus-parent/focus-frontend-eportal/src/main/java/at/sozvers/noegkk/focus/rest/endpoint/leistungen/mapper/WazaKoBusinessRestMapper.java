package at.sozvers.noegkk.focus.rest.endpoint.leistungen.mapper;

import at.sozvers.noegkk.focus.rest.api.lgkk.WazaKoDTO;
import at.sozvers.noegkk.focus.rest.mapping.BusinessRestMapper;
import at.sozvers.noegkk.focus.service.api.lgkk.WazaKoBTO;

public class WazaKoBusinessRestMapper extends BusinessRestMapper<WazaKoDTO, WazaKoBTO> {

  @Override
  public WazaKoDTO map(WazaKoBTO bto) {
	WazaKoDTO dto = new WazaKoDTO();

	dto.setAntragDat(bto.getAntragDat());
	dto.setStatus(bto.getStatus());

	return dto;
  }
}
