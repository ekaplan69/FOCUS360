package at.sozvers.noegkk.focus.rest.endpoint.ecarddaten;

import at.sozvers.noegkk.focus.rest.api.ecard.ECarddatenDTO;
import at.sozvers.noegkk.focus.service.api.ecard.ECarddatenBTO;
import at.sozvers.noegkk.focus.service.common.Fachschluessel;
import at.sozvers.noegkk.focus.service.common.FachschluesselValidator;
import at.sozvers.noegkk.focus.service.ecard.ecarddaten.ECarddatenService;
import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class ECardController {

  @Inject
  private ECardBusinessRestMapper eCardBusinessRestMapper;
  @Inject
  private ECarddatenService       eCarddatenService;
  @Inject
  private FachschluesselValidator fachschluesselValidator;

  public ECarddatenDTO searchECarddaten(Fachschluessel fachschluessel) {
	fachschluesselValidator.validate(fachschluessel);
	ECarddatenBTO bto = eCarddatenService.searchEcardByFachschluessel(fachschluessel);
	bto.setLetzteKonsultation(eCarddatenService.searchLetzteKonsultationDatum(fachschluessel));

	return eCardBusinessRestMapper.map(bto);
  }
}
