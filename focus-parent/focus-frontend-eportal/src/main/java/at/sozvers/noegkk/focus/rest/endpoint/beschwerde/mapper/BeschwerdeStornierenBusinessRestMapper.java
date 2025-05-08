package at.sozvers.noegkk.focus.rest.endpoint.beschwerde.mapper;

import at.sozvers.noegkk.focus.rest.api.beschwerde.BeschwerdeStornierenDTO;
import at.sozvers.noegkk.focus.rest.mapping.BusinessRestMapper;
import at.sozvers.noegkk.focus.service.api.beschwerde.BeschwerdeStornierenBTO;

public class BeschwerdeStornierenBusinessRestMapper extends BusinessRestMapper<BeschwerdeStornierenDTO, BeschwerdeStornierenBTO> {

  @Override
  public BeschwerdeStornierenBTO map(BeschwerdeStornierenDTO dto) {
	BeschwerdeStornierenBTO bto = new BeschwerdeStornierenBTO();

	bto.setId(dto.getId());
	bto.setUpdatecount(dto.getUpdatecount());

	return bto;
  }
}
