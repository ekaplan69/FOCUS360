package at.sozvers.noegkk.focus.rest.endpoint.leistungen.mapper;

import at.sozvers.noegkk.focus.rest.api.lgkk.VwstDTO;
import at.sozvers.noegkk.focus.rest.mapping.BusinessRestMapper;
import at.sozvers.noegkk.focus.service.api.lgkk.VwstBTO;

public class VwstBusinessRestMapper extends BusinessRestMapper<VwstDTO, VwstBTO> {

  @Override
  public VwstDTO map(VwstBTO bto) {
	VwstDTO dto = new VwstDTO();
	dto.setGueltigBisDat(bto.getGueltigBisDat());
	dto.setLeistungsType(bto.getLeistungsType());
	return dto;
  }
}
