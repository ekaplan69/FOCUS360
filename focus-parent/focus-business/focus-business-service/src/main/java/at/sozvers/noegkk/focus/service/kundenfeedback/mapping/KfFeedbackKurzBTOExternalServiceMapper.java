package at.sozvers.noegkk.focus.service.kundenfeedback.mapping;

import at.sozvers.noegkk.focus.service.api.kundenfeedback.KundenfeedbackKurzBTO;
import at.sozvers.noegkk.focus.service.common.DateUtil;
import at.sozvers.noegkk.focus.service.mapping.BTOExternalServiceMapper;
import at.sozvers.noegkk.sckont.kundenfeedback.focus.KfFeedbackKurz;

public class KfFeedbackKurzBTOExternalServiceMapper extends BTOExternalServiceMapper<KundenfeedbackKurzBTO, KfFeedbackKurz> {
  @Override
  public KundenfeedbackKurzBTO map(KfFeedbackKurz feedbackKurz) {
	KundenfeedbackKurzBTO bto = new KundenfeedbackKurzBTO();

	bto.setId(feedbackKurz.getId());
	bto.setFeedbackartId(feedbackKurz.getFeedbackartId());
	bto.setThemaBezeichnung(feedbackKurz.getThemaBezeichnung());
	bto.setFeedbackgrundBezeichnung(feedbackKurz.getFeedbackgrundBezeichnung());
	bto.setStatusId(feedbackKurz.getStatusId());
	bto.setErstellTs(DateUtil.toLocalDateTime(feedbackKurz.getErstellTs()));
	bto.setKontaktartId(feedbackKurz.getKontaktartId());
	bto.setUnterkategorieBezeichnung(feedbackKurz.getUnterkategorieBezeichnung());

	return bto;
  }
}
