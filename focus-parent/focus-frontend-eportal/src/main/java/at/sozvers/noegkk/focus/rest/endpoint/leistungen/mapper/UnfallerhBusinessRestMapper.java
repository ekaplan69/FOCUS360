package at.sozvers.noegkk.focus.rest.endpoint.leistungen.mapper;

import at.sozvers.noegkk.focus.rest.api.lgkk.UnfallerhDTO;
import at.sozvers.noegkk.focus.rest.mapping.BusinessRestMapper;
import at.sozvers.noegkk.focus.service.api.lgkk.UnfallerhBTO;

public class UnfallerhBusinessRestMapper extends BusinessRestMapper<UnfallerhDTO, UnfallerhBTO> {

  @Override
  public UnfallerhDTO map(UnfallerhBTO bto) {
	UnfallerhDTO dto = new UnfallerhDTO();

	dto.setEingelangtDat(bto.getEingelagtDat());
	dto.setErstellDat(bto.getErstellDat());
	dto.setUrgenz1Dat(bto.getUrgenz1Dat());
	dto.setUrgenz2Dat(bto.getUrgenz2Dat());

	return dto;
  }
}
