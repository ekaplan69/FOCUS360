package at.sozvers.noegkk.focus.service.zpv.person;

import at.sozialversicherung.schema.zpv.ibs.partnerlesenkurz_15_0.DtoPartnerLEKO;
import at.sozialversicherung.schema.zpv.ibs.partnerlesenkurz_15_0.DtoPartnerrolleKurz;
import at.sozvers.noegkk.focus.service.api.zpv.person.StammdatenKurzBTO;
import at.sozvers.noegkk.focus.service.mapping.BTOExternalServiceMapper;
import jakarta.enterprise.context.Dependent;

@Dependent
public class StammdatenKurzBTOExternalServiceMapper extends BTOExternalServiceMapper<StammdatenKurzBTO, DtoPartnerLEKO> {

  @Override
  public StammdatenKurzBTO map(DtoPartnerLEKO dtoPartnerLEKO) {
	StammdatenKurzBTO bto = new StammdatenKurzBTO();

	if(dtoPartnerLEKO == null || dtoPartnerLEKO.getDtoPartnerrolleKurz() == null) {
	  return bto;
	}

	DtoPartnerrolleKurz dtoPartnerrolleKurz = dtoPartnerLEKO.getDtoPartnerrolleKurz();

	bto.setFachschluessel(dtoPartnerrolleKurz.getFsPartnerrolle());
	bto.setFachschluesselArt(dtoPartnerrolleKurz.getFachschluesselartKurzbez());

	return bto;
  }
}
