package at.sozvers.noegkk.focus.rest.endpoint.kundenfeedback.mapping;

import at.sozvers.noegkk.focus.rest.api.feedback.KundenfeedbackUnterkategorieFbgMapDTO;
import at.sozvers.noegkk.focus.rest.mapping.BusinessRestMapper;
import at.sozvers.noegkk.focus.service.api.kundenfeedback.KundenfeedbackUnterkategorieFbgMapBTO;

public class KundenfeedbackUnterkategorieFbgBusinessRestMapper extends BusinessRestMapper<KundenfeedbackUnterkategorieFbgMapDTO, KundenfeedbackUnterkategorieFbgMapBTO> {
  @Override
  public KundenfeedbackUnterkategorieFbgMapDTO map(KundenfeedbackUnterkategorieFbgMapBTO bto) {
	KundenfeedbackUnterkategorieFbgMapDTO dto = new KundenfeedbackUnterkategorieFbgMapDTO();

	dto.setFbgId(bto.getFbgId());
	dto.setUnterkategorieId(bto.getUnterkategorieId());
	dto.setGueltigBis(bto.getGueltigBis());
	dto.setGueltigVon(bto.getGueltigVon());

	return dto;
  }
}
