package at.sozvers.noegkk.focus.service.zpv.adresse;

import at.sozialversicherung.schema.zpv.ibs.adresszuordnungsuchen_10_0.DtoGeldadresseBankkontoSUO;
import at.sozvers.noegkk.focus.service.api.zpv.adresse.GeldadresseBTO;
import at.sozvers.noegkk.focus.service.mapping.BTOExternalServiceMapper;
import jakarta.enterprise.context.Dependent;

@Dependent
public class GeldadresseBTOExternalServiceMapper extends BTOExternalServiceMapper<GeldadresseBTO, DtoGeldadresseBankkontoSUO> {

  @Override
  public GeldadresseBTO map(DtoGeldadresseBankkontoSUO dto) {
	if(dto == null) {
	  return null;
	}

	GeldadresseBTO bto = new GeldadresseBTO();

	bto.setVerwendungsartKurz(dto.getVerwendungsartKurz());
	bto.setBic(dto.getBankIdentifikationsCode());
	bto.setIban(dto.getInternationaleBankkontonummer());
	bto.setInstitut(dto.getBankinstitut());

	return bto;
  }
}
