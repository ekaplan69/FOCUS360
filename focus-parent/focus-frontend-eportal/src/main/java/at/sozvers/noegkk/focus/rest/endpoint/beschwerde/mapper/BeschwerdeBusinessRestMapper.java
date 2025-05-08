package at.sozvers.noegkk.focus.rest.endpoint.beschwerde.mapper;

import at.sozvers.noegkk.focus.rest.api.beschwerde.BeschwerdeDTO;
import at.sozvers.noegkk.focus.rest.mapping.BusinessRestMapper;
import at.sozvers.noegkk.focus.service.api.beschwerde.BeschwerdeBTO;

public class BeschwerdeBusinessRestMapper extends BusinessRestMapper<BeschwerdeDTO, BeschwerdeBTO> {

  @Override
  public BeschwerdeDTO map(BeschwerdeBTO bto) {
	BeschwerdeDTO dto = new BeschwerdeDTO();

	dto.setBeschwerdeId(bto.getBeschwerdeId());
	dto.setFachbereichBezeichnung(bto.getFachbereichBezeichnung());
	dto.setKanalBezeichnung(bto.getKanalBezeichnung());
	dto.setKontaktpunktBezeichnung(bto.getKontaktpunktBezeichnung());
	dto.setThemaBezeichnung(bto.getThemaBezeichnung());
	dto.setZeitpunkt(bto.getZeitpunkt());
	dto.setStatusId(bto.getStatusId());
	dto.setStorno(bto.getStorno());

	return dto;
  }
}
