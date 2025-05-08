package at.sozvers.noegkk.focus.rest.endpoint.beschwerde.mapper;

import at.sozvers.noegkk.focus.rest.api.beschwerde.BeschwerdeBereichThemaDTO;
import at.sozvers.noegkk.focus.rest.mapping.BusinessRestMapper;
import at.sozvers.noegkk.focus.service.api.beschwerde.BeschwerdeBereichBTO;

public class BeschwerdeBereichThemaBusinessRestMapper extends BusinessRestMapper<BeschwerdeBereichThemaDTO, BeschwerdeBereichBTO> {

  @Override
  public BeschwerdeBereichThemaDTO map(BeschwerdeBereichBTO bto) {
	BeschwerdeBereichThemaDTO dto = new BeschwerdeBereichThemaDTO();

	dto.setThemaBezeichnung(bto.getThemaBezeichnung());
	dto.setThemaHilfetext(bto.getThemaHilfetext());
	dto.setThemaId(bto.getThemaId());

	return dto;
  }
}
