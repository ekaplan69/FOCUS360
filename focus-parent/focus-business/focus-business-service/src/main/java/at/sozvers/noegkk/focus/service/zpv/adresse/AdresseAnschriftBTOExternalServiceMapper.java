package at.sozvers.noegkk.focus.service.zpv.adresse;

import at.sozialversicherung.schema.zpv.ibs.adresszuordnungsuchen_10_0.DtoAnschriftStrasseSUO;
import at.sozvers.noegkk.focus.service.api.zpv.adresse.AdresseAnschriftBTO;
import at.sozvers.noegkk.focus.service.api.zpv.adresse.AdresseBTO;
import at.sozvers.noegkk.focus.service.mapping.BTOExternalServiceMapper;
import jakarta.enterprise.context.Dependent;

@Dependent
public class AdresseAnschriftBTOExternalServiceMapper extends BTOExternalServiceMapper<AdresseBTO, DtoAnschriftStrasseSUO> {

  @Override
  public AdresseBTO map(DtoAnschriftStrasseSUO dto) {
	if(dto == null) {
	  return null;
	}

	AdresseAnschriftBTO bto = new AdresseAnschriftBTO();
	bto.setAnschrift(dto.getDtoAnschriftszusammenfassung().getAnschriftszeile1());
	bto.setPlz(dto.getPostleitzahl());
	bto.setOrt(dto.getOrt());

	return bto;
  }
}
