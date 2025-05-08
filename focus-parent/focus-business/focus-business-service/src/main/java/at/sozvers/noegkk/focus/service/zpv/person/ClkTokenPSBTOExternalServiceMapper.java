package at.sozvers.noegkk.focus.service.zpv.person;

import at.sozialversicherung.schema.zpv.ibs.clkpartnersucheinitialisieren_4_0.DtoclkPartnersucheINO;
import at.sozvers.noegkk.focus.service.api.zpv.person.ClkTokenBTO;
import at.sozvers.noegkk.focus.service.mapping.BTOExternalServiceMapper;
import jakarta.enterprise.context.Dependent;

@Dependent
public class ClkTokenPSBTOExternalServiceMapper extends BTOExternalServiceMapper<ClkTokenBTO, DtoclkPartnersucheINO> {

  @Override
  public ClkTokenBTO map(DtoclkPartnersucheINO dtoclkPartnersucheINO) {
	ClkTokenBTO bto = new ClkTokenBTO();

	bto.setClkToken(dtoclkPartnersucheINO.getClkToken());

	return bto;
  }
}
