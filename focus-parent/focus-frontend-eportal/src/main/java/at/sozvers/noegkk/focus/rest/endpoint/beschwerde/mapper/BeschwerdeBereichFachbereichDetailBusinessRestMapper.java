package at.sozvers.noegkk.focus.rest.endpoint.beschwerde.mapper;

import at.sozvers.noegkk.focus.rest.api.beschwerde.BeschwerdeBereichFachbereichDetailDTO;
import at.sozvers.noegkk.focus.rest.mapping.BusinessRestMapper;
import at.sozvers.noegkk.focus.service.api.beschwerde.BeschwerdeBereichBTO;

public class BeschwerdeBereichFachbereichDetailBusinessRestMapper extends BusinessRestMapper<BeschwerdeBereichFachbereichDetailDTO, BeschwerdeBereichBTO> {

  @Override
  public BeschwerdeBereichFachbereichDetailDTO map(BeschwerdeBereichBTO bto) {
	BeschwerdeBereichFachbereichDetailDTO dto = new BeschwerdeBereichFachbereichDetailDTO();

	dto.setBeschwerdebereichId(bto.getBeschwerdebereichId());
	dto.setFachbereichDetailBezeichnung(bto.getFachbereichDetailBezeichnung());
	dto.setFachbereichDetailHilfetext(bto.getFachbereichDetailHilfetext());

	return dto;
  }
}
