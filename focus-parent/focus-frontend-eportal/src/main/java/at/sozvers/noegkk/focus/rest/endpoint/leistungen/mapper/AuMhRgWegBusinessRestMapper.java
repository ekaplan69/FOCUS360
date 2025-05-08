package at.sozvers.noegkk.focus.rest.endpoint.leistungen.mapper;

import at.sozvers.noegkk.focus.rest.api.lgkk.AuMhRgWegDTO;
import at.sozvers.noegkk.focus.rest.mapping.BusinessRestMapper;
import at.sozvers.noegkk.focus.service.api.lgkk.AuMhRgWegBTO;

public class AuMhRgWegBusinessRestMapper extends BusinessRestMapper<AuMhRgWegDTO, AuMhRgWegBTO> {

  @Override
  public AuMhRgWegDTO map(AuMhRgWegBTO bto) {
	AuMhRgWegDTO dto = new AuMhRgWegDTO();
	dto.setAnweisungDat(bto.getAnweisungDat());
	dto.setLbisDat(bto.getLbisDat());
	dto.setLvonDat(bto.getLvonDat());
	dto.setLgebiet(bto.getLgebiet());
	dto.setStatus(bto.getStatus());

	return dto;
  }
}
