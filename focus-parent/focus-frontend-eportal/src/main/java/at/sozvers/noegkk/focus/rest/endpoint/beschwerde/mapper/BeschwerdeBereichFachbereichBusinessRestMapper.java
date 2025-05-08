package at.sozvers.noegkk.focus.rest.endpoint.beschwerde.mapper;

import at.sozvers.noegkk.focus.rest.api.beschwerde.BeschwerdeBereichFachbereichDTO;
import at.sozvers.noegkk.focus.rest.mapping.BusinessRestMapper;
import at.sozvers.noegkk.focus.service.api.beschwerde.BeschwerdeBereichBTO;

public class BeschwerdeBereichFachbereichBusinessRestMapper extends BusinessRestMapper<BeschwerdeBereichFachbereichDTO, BeschwerdeBereichBTO> {

  @Override
  public BeschwerdeBereichFachbereichDTO map(BeschwerdeBereichBTO bto) {
	BeschwerdeBereichFachbereichDTO dto = new BeschwerdeBereichFachbereichDTO();

	dto.setFachbereichBezeichnung(bto.getFachbereichBezeichnung());
	dto.setFachbereichHilfetext(bto.getFachbereichHilfetext());
	dto.setFachbereichId(bto.getFachbereichId());

	return dto;
  }
}
