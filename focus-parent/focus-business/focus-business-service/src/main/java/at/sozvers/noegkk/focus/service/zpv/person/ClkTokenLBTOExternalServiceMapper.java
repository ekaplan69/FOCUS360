package at.sozvers.noegkk.focus.service.zpv.person;

import at.sozialversicherung.schema.zpv.ibs.clklinkinitialisieren_1_0.DtoclkLinkINO;
import at.sozvers.noegkk.focus.service.api.zpv.person.ClkTokenBTO;
import at.sozvers.noegkk.focus.service.mapping.BTOExternalServiceMapper;
import jakarta.enterprise.context.Dependent;

@Dependent
public class ClkTokenLBTOExternalServiceMapper extends BTOExternalServiceMapper<ClkTokenBTO, DtoclkLinkINO> {

  @Override
  public ClkTokenBTO map(DtoclkLinkINO dtoclkLinkINO) {
	ClkTokenBTO bto = new ClkTokenBTO();

	bto.setClkToken(dtoclkLinkINO.getClkToken());

	return bto;
  }
}
