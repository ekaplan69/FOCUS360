package at.sozvers.noegkk.focus.rest.endpoint.kundenfeedback.mapping;

import at.sozvers.noegkk.focus.rest.api.feedback.KundenfeedbackThemaFbgMapDTO;
import at.sozvers.noegkk.focus.rest.mapping.BusinessRestMapper;
import at.sozvers.noegkk.focus.service.api.kundenfeedback.KundenfeedbackThemaFbgMapBTO;

public class KundenfeedbackThemaFbgBusinessRestMapper extends BusinessRestMapper<KundenfeedbackThemaFbgMapDTO, KundenfeedbackThemaFbgMapBTO> {
  @Override
  public KundenfeedbackThemaFbgMapDTO map(KundenfeedbackThemaFbgMapBTO bto) {
	KundenfeedbackThemaFbgMapDTO dto = new KundenfeedbackThemaFbgMapDTO();

	dto.setThemaId(bto.getThemaId());
	dto.setFbgId(bto.getFbgId());
	dto.setGueltigVon(bto.getGueltigVon());
	dto.setGueltigBis(bto.getGueltigBis());

	return dto;
  }
}
