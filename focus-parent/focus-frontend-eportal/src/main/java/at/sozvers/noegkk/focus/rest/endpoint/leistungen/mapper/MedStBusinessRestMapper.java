package at.sozvers.noegkk.focus.rest.endpoint.leistungen.mapper;

import at.sozvers.noegkk.focus.rest.api.lgkk.MedStDTO;
import at.sozvers.noegkk.focus.rest.mapping.BusinessRestMapper;
import at.sozvers.noegkk.focus.service.api.lgkk.MedStBTO;

public class MedStBusinessRestMapper extends BusinessRestMapper<MedStDTO, MedStBTO> {

  @Override
  public MedStDTO map(MedStBTO bto) {
	MedStDTO dto = new MedStDTO();

	dto.setGueltigBisDat(bto.getGueltigBisDat());
	dto.setLgebiet(bto.getLgebiet());
	dto.setStellungnahme(bto.getStellungnahme());

	return dto;
  }
}
