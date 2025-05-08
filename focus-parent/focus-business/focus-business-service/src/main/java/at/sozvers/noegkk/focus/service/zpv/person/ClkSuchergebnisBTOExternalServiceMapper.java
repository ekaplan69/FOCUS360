package at.sozvers.noegkk.focus.service.zpv.person;

import at.sozialversicherung.schema.zpv.ibs.clkpartnersucheergebnisabfragen_2_0.DtoclkPartnerinformation;
import at.sozvers.noegkk.focus.service.api.zpv.person.ClkSuchergebnisBTO;
import at.sozvers.noegkk.focus.service.mapping.BTOExternalServiceMapper;
import jakarta.enterprise.context.Dependent;

@Dependent
public class ClkSuchergebnisBTOExternalServiceMapper extends BTOExternalServiceMapper<ClkSuchergebnisBTO, DtoclkPartnerinformation> {

  @Override
  public ClkSuchergebnisBTO map(DtoclkPartnerinformation dtoclkPartnerinformation) {
	ClkSuchergebnisBTO bto = new ClkSuchergebnisBTO();

	bto.setPartnerId(dtoclkPartnerinformation.getPartnerID().toString());

	return bto;
  }
}
