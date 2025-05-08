package at.sozvers.noegkk.focus.service.zpv.adresse;

import at.sozialversicherung.schema.zpv.ibs.adresszuordnungsuchen_10_0.*;
import at.sozvers.noegkk.focus.service.api.zpv.adresse.AdresseBTO;
import at.sozvers.noegkk.focus.service.mapping.BTOExternalServiceMapper;
import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class AdresseBTOExternalServiceMapper extends BTOExternalServiceMapper<AdresseBTO, DtoAdresszuordnungAllgemeinSUO> {

  @Inject
  private AdresseAnschriftBTOExternalServiceMapper adresseAnschriftMapper;
  @Inject
  private GeldadresseBTOExternalServiceMapper      geldadresseMapper;
  @Inject
  private KontaktBTOExternalServiceMapper          kontaktMapper;

  @Override
  public AdresseBTO map(DtoAdresszuordnungAllgemeinSUO dto) {

	if(dto instanceof DtoTelefonSUO || dto instanceof DtoeMailSUO) {
	  return kontaktMapper.map(dto);
	}
	if(dto instanceof DtoGeldadresseBankkontoSUO) {
	  return geldadresseMapper.map((DtoGeldadresseBankkontoSUO) dto);
	}
	if(dto instanceof DtoAnschriftStrasseSUO) {
	  return adresseAnschriftMapper.map((DtoAnschriftStrasseSUO) dto);
	}

	return null;
  }
}
