package at.sozvers.noegkk.focus.rest.endpoint.leistungen.mapper;

import at.sozvers.noegkk.focus.rest.api.lgkk.FrtDTO;
import at.sozvers.noegkk.focus.rest.mapping.BusinessRestMapper;
import at.sozvers.noegkk.focus.service.api.lgkk.FrtBTO;

public class FrtBusinessRestMapper extends BusinessRestMapper<FrtDTO, FrtBTO> {

  @Override
  public FrtDTO map(FrtBTO bto) {
	FrtDTO dto = new FrtDTO();

	dto.setStatus(bto.getStatus());
	dto.setTransportDat(bto.getTransportDat());

	return dto;
  }
}
