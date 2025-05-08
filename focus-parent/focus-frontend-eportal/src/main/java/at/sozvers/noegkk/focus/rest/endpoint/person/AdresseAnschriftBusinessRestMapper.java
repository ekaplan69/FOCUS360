package at.sozvers.noegkk.focus.rest.endpoint.person;

import at.sozvers.noegkk.focus.rest.api.zpv.adresse.AdresseAnschriftDTO;
import at.sozvers.noegkk.focus.rest.mapping.BusinessRestMapper;
import at.sozvers.noegkk.focus.service.api.zpv.adresse.AdresseAnschriftBTO;
import jakarta.enterprise.context.Dependent;

@Dependent
public class AdresseAnschriftBusinessRestMapper extends BusinessRestMapper<AdresseAnschriftDTO, AdresseAnschriftBTO> {

  @Override
  public AdresseAnschriftDTO map(AdresseAnschriftBTO bto) {
	AdresseAnschriftDTO dto = new AdresseAnschriftDTO();

	if(bto == null) {
	  return dto;
	}

	dto.setAnschrift(bto.getAnschrift());
	dto.setPlz(bto.getPlz());
	dto.setOrt(bto.getOrt());

	return dto;
  }
}
