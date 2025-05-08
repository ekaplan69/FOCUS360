package at.sozvers.noegkk.focus.rest.endpoint.person;

import at.sozvers.noegkk.focus.rest.api.zpv.person.StammdatenKurzDTO;
import at.sozvers.noegkk.focus.rest.mapping.BusinessRestMapper;
import at.sozvers.noegkk.focus.service.api.zpv.person.StammdatenKurzBTO;
import jakarta.enterprise.context.Dependent;

@Dependent
public class StammdatenKurzBusinessRestMapper extends BusinessRestMapper<StammdatenKurzDTO, StammdatenKurzBTO> {

  @Override
  public StammdatenKurzDTO map(StammdatenKurzBTO bto) {
	StammdatenKurzDTO dto = new StammdatenKurzDTO();

	dto.setFachschluessel(bto.getFachschluessel());
	dto.setFachschluesselArt(bto.getFachschluesselArt());

	return dto;
  }
}
