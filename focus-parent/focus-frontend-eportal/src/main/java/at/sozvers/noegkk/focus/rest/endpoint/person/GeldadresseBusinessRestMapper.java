package at.sozvers.noegkk.focus.rest.endpoint.person;

import at.sozvers.noegkk.focus.rest.api.zpv.adresse.GeldadresseDTO;
import at.sozvers.noegkk.focus.rest.mapping.BusinessRestMapper;
import at.sozvers.noegkk.focus.service.api.zpv.adresse.GeldadresseBTO;
import jakarta.enterprise.context.Dependent;

@Dependent
public class GeldadresseBusinessRestMapper extends BusinessRestMapper<GeldadresseDTO, GeldadresseBTO> {

  @Override
  public GeldadresseDTO map(GeldadresseBTO bto) {
	GeldadresseDTO dto = new GeldadresseDTO();

	if(bto == null) {
	  return dto;
	}

	dto.setVerwendungsartKurz(bto.getVerwendungsartKurz());
	dto.setBic(bto.getBic());
	dto.setIban(bto.getIban());
	dto.setInstitut(bto.getInstitut());

	return dto;
  }
}
