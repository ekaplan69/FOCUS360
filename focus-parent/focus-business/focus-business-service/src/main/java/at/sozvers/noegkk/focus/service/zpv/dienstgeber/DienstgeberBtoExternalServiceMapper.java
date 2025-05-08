package at.sozvers.noegkk.focus.service.zpv.dienstgeber;

import java.util.List;
import at.sozialversicherung.schema.zpv.ibs.partnerlesenlang_20_0.DtoPartner;
import at.sozialversicherung.schema.zpv.ibs.partnerlesenlang_20_0.DtoPartnerLELO;
import at.sozvers.noegkk.focus.service.api.zpv.dienstgeber.DienstgeberBTO;
import at.sozvers.noegkk.focus.service.api.zpv.dienstgeber.DienstgeberStammdatenBTO;
import at.sozvers.noegkk.focus.service.mapping.BTOExternalServiceMapper;
import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class DienstgeberBtoExternalServiceMapper extends BTOExternalServiceMapper<DienstgeberBTO, DtoPartnerLELO> {

  @Inject
  private DienstgeberStammdatenBtoExternalServiceMapper dienstgeberStammdatenBtoExternalServiceMapper;

  @Override
  public DienstgeberBTO map(DtoPartnerLELO dtoPartnerLELO) {
	DienstgeberBTO bto = new DienstgeberBTO();

	List<DtoPartner> partnerList = dtoPartnerLELO.getDtoPartnerListe();
	if(partnerList == null || partnerList.isEmpty()) {
	  return bto;
	}

	bto.setDgnr(dtoPartnerLELO.getDtoPartnerrolleKurzListe().get(0).getFsPartnerrolle());

	DienstgeberStammdatenBTO stammdatenBTO = dienstgeberStammdatenBtoExternalServiceMapper.map(dtoPartnerLELO);
	bto.setStammdatenBTO(stammdatenBTO);

	return bto;
  }
}
