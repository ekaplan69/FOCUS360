package at.sozvers.noegkk.focus.rest.endpoint.leistungen.mapper;

import at.sozvers.noegkk.focus.rest.api.lgkk.EkosDTO;
import at.sozvers.noegkk.focus.rest.mapping.BusinessRestMapper;
import at.sozvers.noegkk.focus.service.api.lgkk.EkosBTO;

public class EkosBusinessRestMapper extends BusinessRestMapper<EkosDTO, EkosBTO> {

  @Override
  public EkosDTO map(EkosBTO bto) {
	EkosDTO dto = new EkosDTO();
	dto.setAntragStatus(bto.getAntragStatus());
	dto.setEingelangtDat(bto.getEingelangtDat());

	return dto;
  }
}
