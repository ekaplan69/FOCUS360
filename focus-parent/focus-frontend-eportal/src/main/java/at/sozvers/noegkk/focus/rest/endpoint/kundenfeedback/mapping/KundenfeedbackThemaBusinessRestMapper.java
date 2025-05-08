package at.sozvers.noegkk.focus.rest.endpoint.kundenfeedback.mapping;

import at.sozvers.noegkk.focus.rest.api.feedback.KundenfeedbackThemaDTO;
import at.sozvers.noegkk.focus.rest.mapping.BusinessRestMapper;
import at.sozvers.noegkk.focus.service.api.kundenfeedback.KundenfeedbackThemaBTO;

public class KundenfeedbackThemaBusinessRestMapper extends BusinessRestMapper<KundenfeedbackThemaDTO, KundenfeedbackThemaBTO> {
  @Override
  public KundenfeedbackThemaDTO map(KundenfeedbackThemaBTO bto) {
	KundenfeedbackThemaDTO dto = new KundenfeedbackThemaDTO();

	dto.setThemaId(bto.getThemaId());
	dto.setKtThemaId(bto.getKtThemaId());
	dto.setThemaBezeichnung(bto.getThemaBezeichnung());
	dto.setGueltigBis(bto.getGueltigBis());
	dto.setGueltigVon(bto.getGueltigVon());

	return dto;
  }
}
