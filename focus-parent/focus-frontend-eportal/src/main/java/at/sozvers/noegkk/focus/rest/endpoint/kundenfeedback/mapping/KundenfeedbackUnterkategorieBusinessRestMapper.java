package at.sozvers.noegkk.focus.rest.endpoint.kundenfeedback.mapping;

import at.sozvers.noegkk.focus.rest.api.feedback.KundenfeedbackUnterkategorieDTO;
import at.sozvers.noegkk.focus.rest.mapping.BusinessRestMapper;
import at.sozvers.noegkk.focus.service.api.kundenfeedback.KundenfeedbackUnterkategorieBTO;

public class KundenfeedbackUnterkategorieBusinessRestMapper extends BusinessRestMapper<KundenfeedbackUnterkategorieDTO, KundenfeedbackUnterkategorieBTO> {
  @Override
  public KundenfeedbackUnterkategorieDTO map(KundenfeedbackUnterkategorieBTO bto) {
	KundenfeedbackUnterkategorieDTO dto = new KundenfeedbackUnterkategorieDTO();

	dto.setId(bto.getId());
	dto.setThemaId(bto.getThemaId());
	dto.setBezeichnung(bto.getBezeichnung());
	dto.setGueltigVon(bto.getGueltigVon());
	dto.setGueltigBis(bto.getGueltigBis());

	return dto;
  }
}
