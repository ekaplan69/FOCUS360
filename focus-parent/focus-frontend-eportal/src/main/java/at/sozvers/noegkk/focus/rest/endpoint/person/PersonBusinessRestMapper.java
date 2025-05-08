package at.sozvers.noegkk.focus.rest.endpoint.person;

import at.sozvers.noegkk.focus.rest.api.zpv.person.PersonDTO;
import at.sozvers.noegkk.focus.rest.mapping.BusinessRestMapper;
import at.sozvers.noegkk.focus.service.api.zpv.person.PersonBTO;
import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class PersonBusinessRestMapper extends BusinessRestMapper<PersonDTO, PersonBTO> {

  @Inject
  private StammdatenBusinessRestMapper stammdatenBusinessRestMapper;

  @Override
  public PersonDTO map(PersonBTO bto) {
	PersonDTO dto = new PersonDTO();

	dto.setVsnr(bto.getVsnr());
	dto.setStammdaten(stammdatenBusinessRestMapper.map(bto.getStammdaten()));

	return dto;
  }
}
