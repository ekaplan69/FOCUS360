package at.sozvers.noegkk.focus.rest.endpoint.leistungen.mapper;

import at.sozvers.noegkk.focus.rest.api.lgkk.LohnPfDTO;
import at.sozvers.noegkk.focus.rest.mapping.BusinessRestMapper;
import at.sozvers.noegkk.focus.service.api.lgkk.LohnPfBTO;

public class LohnPfBusinessRestMapper extends BusinessRestMapper<LohnPfDTO, LohnPfBTO> {

  @Override
  public LohnPfDTO map(LohnPfBTO bto) {
	LohnPfDTO dto = new LohnPfDTO();

	dto.setLohnpfaendung(bto.getLohnpfaendung());

	return dto;
  }
}
