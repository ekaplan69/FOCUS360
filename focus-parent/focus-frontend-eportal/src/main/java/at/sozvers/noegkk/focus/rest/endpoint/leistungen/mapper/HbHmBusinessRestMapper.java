package at.sozvers.noegkk.focus.rest.endpoint.leistungen.mapper;

import at.sozvers.noegkk.focus.rest.api.lgkk.HbHmDTO;
import at.sozvers.noegkk.focus.rest.mapping.BusinessRestMapper;
import at.sozvers.noegkk.focus.service.api.lgkk.HbHmBTO;

public class HbHmBusinessRestMapper extends BusinessRestMapper<HbHmDTO, HbHmBTO> {

  @Override
  public HbHmDTO map(HbHmBTO bto) {
	HbHmDTO dto = new HbHmDTO();

	dto.setStatus(bto.getStatus());
	dto.setVerordnungsDat(bto.getVerordnungsDat());

	return dto;
  }
}
