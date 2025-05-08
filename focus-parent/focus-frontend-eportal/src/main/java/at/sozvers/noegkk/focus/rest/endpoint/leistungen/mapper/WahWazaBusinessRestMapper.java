package at.sozvers.noegkk.focus.rest.endpoint.leistungen.mapper;

import at.sozvers.noegkk.focus.rest.api.lgkk.WahWazaDTO;
import at.sozvers.noegkk.focus.rest.mapping.BusinessRestMapper;
import at.sozvers.noegkk.focus.service.api.lgkk.WahWazaBTO;

public class WahWazaBusinessRestMapper extends BusinessRestMapper<WahWazaDTO, WahWazaBTO> {
  @Override
  public WahWazaDTO map(WahWazaBTO bto) {
	WahWazaDTO dto = new WahWazaDTO();
	dto.setBehDat(bto.getBehDat());
	dto.setLgebiet(bto.getLgebiet());
	dto.setStatus(bto.getStatus());
	return dto;
  }
}
