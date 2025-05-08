package at.sozvers.noegkk.focus.rest.endpoint.person;

import at.sozvers.noegkk.focus.rest.api.zpv.person.ClkSuchergebnisDTO;
import at.sozvers.noegkk.focus.rest.mapping.BusinessRestMapper;
import at.sozvers.noegkk.focus.service.api.zpv.person.ClkSuchergebnisBTO;
import jakarta.enterprise.context.Dependent;

@Dependent
public class ClkSuchergebnisBusinessRestMapper extends BusinessRestMapper<ClkSuchergebnisDTO, ClkSuchergebnisBTO> {

  @Override
  public ClkSuchergebnisDTO map(ClkSuchergebnisBTO bto) {
	ClkSuchergebnisDTO dto = new ClkSuchergebnisDTO();

	dto.setPartnerId(bto.getPartnerId());

	return dto;
  }
}
