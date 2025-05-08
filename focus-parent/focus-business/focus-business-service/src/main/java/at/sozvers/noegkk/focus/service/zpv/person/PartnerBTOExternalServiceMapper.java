package at.sozvers.noegkk.focus.service.zpv.person;

import at.sozialversicherung.schema.zpv.ibs.partnerlesenkurz_15_0.DtoPartnerLEKO;
import at.sozvers.noegkk.focus.service.api.zpv.person.PersonBTO;
import at.sozvers.noegkk.focus.service.mapping.BTOExternalServiceMapper;
import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class PartnerBTOExternalServiceMapper extends BTOExternalServiceMapper<PersonBTO, DtoPartnerLEKO> {

  @Inject
  private StammdatenBTOExternalServiceMapper stammdatenBTOExternalServiceMapper;

  @Override
  public PersonBTO map(DtoPartnerLEKO dto) {
	PersonBTO bto = new PersonBTO();

	bto.setStammdaten(stammdatenBTOExternalServiceMapper.map(dto));

	return bto;
  }
}
