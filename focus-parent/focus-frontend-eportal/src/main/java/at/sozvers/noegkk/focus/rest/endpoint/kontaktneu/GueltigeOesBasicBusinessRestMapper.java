package at.sozvers.noegkk.focus.rest.endpoint.kontaktneu;

import at.sozvers.noegkk.focus.rest.api.kontaktneu.GueltigeOeDTO;
import at.sozvers.noegkk.focus.rest.mapping.BusinessRestMapper;
import at.sozvers.noegkk.focus.service.api.kontaktneu.GueltigeOeBTO;

public class GueltigeOesBasicBusinessRestMapper extends BusinessRestMapper<GueltigeOeDTO, GueltigeOeBTO> {

  @Override
  public GueltigeOeDTO map(GueltigeOeBTO bto) {
	GueltigeOeDTO dto = new GueltigeOeDTO();

	dto.setId(bto.getId());
	dto.setBezeichnung(bto.getBezeichnung());
	dto.setBereOrg(bto.getBere_org());

	return dto;
  }
}
