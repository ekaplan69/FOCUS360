package at.sozvers.noegkk.focus.rest.endpoint.person;

import at.sozvers.noegkk.focus.rest.api.zpv.person.VollmachtDTO;
import at.sozvers.noegkk.focus.rest.mapping.BusinessRestMapper;
import at.sozvers.noegkk.focus.service.api.zpv.person.VollmachtBTO;

public class VollmachtBusinessRestMapper extends BusinessRestMapper<VollmachtDTO, VollmachtBTO> {

  @Override
  public VollmachtDTO map(VollmachtBTO bto) {
	VollmachtDTO dto = new VollmachtDTO();

	dto.setName(bto.getName());
	dto.setGueltigBis(bto.getGueltigBis());
	dto.setGueltigVon(bto.getGueltigVon());
	dto.setArtDerVollmacht(bto.getArtDerVollmacht());
	dto.setBeziehungsart(bto.getBeziehungsart());

	return dto;
  }
}
