package at.sozvers.noegkk.focus.rest.endpoint.person;

import at.sozvers.noegkk.focus.rest.api.zpv.person.ClkTokenDTO;
import at.sozvers.noegkk.focus.rest.mapping.BusinessRestMapper;
import at.sozvers.noegkk.focus.service.api.zpv.person.ClkTokenBTO;
import jakarta.enterprise.context.Dependent;

@Dependent
public class ClkTokenBusinessRestMapper extends BusinessRestMapper<ClkTokenDTO, ClkTokenBTO> {

  @Override
  public ClkTokenDTO map(ClkTokenBTO bto) {
	ClkTokenDTO dto = new ClkTokenDTO();

	dto.setClkToken(bto.getClkToken());

	return dto;
  }
}
