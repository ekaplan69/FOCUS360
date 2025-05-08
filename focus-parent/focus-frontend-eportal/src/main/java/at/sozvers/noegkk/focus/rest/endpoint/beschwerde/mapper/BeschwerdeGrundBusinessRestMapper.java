package at.sozvers.noegkk.focus.rest.endpoint.beschwerde.mapper;

import at.sozvers.noegkk.focus.rest.api.beschwerde.BeschwerdeGrundDTO;
import at.sozvers.noegkk.focus.rest.mapping.BusinessRestMapper;
import at.sozvers.noegkk.focus.service.api.beschwerde.BeschwerdeGrundBTO;

public class BeschwerdeGrundBusinessRestMapper extends BusinessRestMapper<BeschwerdeGrundDTO, BeschwerdeGrundBTO> {

  @Override
  public BeschwerdeGrundDTO map(BeschwerdeGrundBTO bto) {
	BeschwerdeGrundDTO dto = new BeschwerdeGrundDTO();

	dto.setBezeichnung(bto.getBezeichnung());
	dto.setHilfetext(bto.getHilfetext());
	dto.setId(bto.getId());

	return dto;
  }
}
