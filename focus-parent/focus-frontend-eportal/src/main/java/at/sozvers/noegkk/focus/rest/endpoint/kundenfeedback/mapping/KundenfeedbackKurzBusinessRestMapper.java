package at.sozvers.noegkk.focus.rest.endpoint.kundenfeedback.mapping;

import at.sozvers.noegkk.focus.rest.api.feedback.KundenfeedbackKurzDTO;
import at.sozvers.noegkk.focus.rest.mapping.BusinessRestMapper;
import at.sozvers.noegkk.focus.service.api.kundenfeedback.KundenfeedbackKurzBTO;

public class KundenfeedbackKurzBusinessRestMapper extends BusinessRestMapper<KundenfeedbackKurzDTO, KundenfeedbackKurzBTO> {
  @Override
  public KundenfeedbackKurzDTO map(KundenfeedbackKurzBTO bto) {
	KundenfeedbackKurzDTO dto = new KundenfeedbackKurzDTO();

	dto.setId(bto.getId());
	dto.setFeedbackartId(bto.getFeedbackartId());
	dto.setThemaBezeichnung(bto.getThemaBezeichnung());
	dto.setFeedbackgrundBezeichnung(bto.getFeedbackgrundBezeichnung());
	dto.setStatusId(bto.getStatusId());
	dto.setErstellTs(bto.getErstellTs());
	dto.setKontaktartId(bto.getKontaktartId());
	dto.setUnterkategorieBezeichnung(bto.getUnterkategorieBezeichnung());

	return dto;
  }
}
