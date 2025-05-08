package at.sozvers.noegkk.focus.rest.endpoint.kundenfeedback.mapping;

import at.sozvers.noegkk.focus.rest.api.feedback.KundenfeedbackFeedbackgrundDTO;
import at.sozvers.noegkk.focus.rest.mapping.BusinessRestMapper;
import at.sozvers.noegkk.focus.service.api.kundenfeedback.KundenfeedbackFeedbackgrundBTO;

public class KundenfeedbackFeedbackgrundBusinessRestMapper extends BusinessRestMapper<KundenfeedbackFeedbackgrundDTO, KundenfeedbackFeedbackgrundBTO> {
  @Override
  public KundenfeedbackFeedbackgrundDTO map(KundenfeedbackFeedbackgrundBTO bto) {
	KundenfeedbackFeedbackgrundDTO dto = new KundenfeedbackFeedbackgrundDTO();

	dto.setId(bto.getId());
	dto.setBezeichnung(bto.getBezeichnung());
	dto.setGueltigVon(bto.getGueltigVon());
	dto.setGueltigBis(bto.getGueltigBis());

	return dto;
  }
}
