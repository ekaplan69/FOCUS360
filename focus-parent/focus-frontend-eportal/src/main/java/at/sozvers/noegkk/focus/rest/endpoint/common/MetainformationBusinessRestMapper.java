package at.sozvers.noegkk.focus.rest.endpoint.common;

import at.sozvers.noegkk.focus.rest.api.common.MeldungDTO;
import at.sozvers.noegkk.focus.rest.mapping.BusinessRestMapper;
import at.sozvers.noegkk.focus.service.api.common.MeldungBTO;
import jakarta.enterprise.context.Dependent;

@Dependent
public class MetainformationBusinessRestMapper extends BusinessRestMapper<MeldungDTO, MeldungBTO> {

  @Override
  public MeldungDTO map(MeldungBTO bto) {
	return MeldungDTO.of(bto.getFehlerId(), bto.getFehlerkategorie(), bto.getMeldungstext());
  }
}
