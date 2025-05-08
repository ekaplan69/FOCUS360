package at.sozvers.noegkk.focus.service.kundenfeedback.mapping;

import at.sozvers.noegkk.focus.service.api.kundenfeedback.KundenfeedbackFeedbackgrundBTO;
import at.sozvers.noegkk.focus.service.common.DateUtil;
import at.sozvers.noegkk.focus.service.mapping.BTOExternalServiceMapper;
import at.sozvers.noegkk.sckont.kundenfeedback.focus.KfFeedbackgrund;

public class KfFeedbackgrundBTOExternalServiceMapper extends BTOExternalServiceMapper<KundenfeedbackFeedbackgrundBTO, KfFeedbackgrund> {
  @Override
  public KundenfeedbackFeedbackgrundBTO map(KfFeedbackgrund feedbackgrund) {
	KundenfeedbackFeedbackgrundBTO bto = new KundenfeedbackFeedbackgrundBTO();

	bto.setId(feedbackgrund.getId());
	bto.setBezeichnung(feedbackgrund.getBezeichnung());
	bto.setGueltigVon(DateUtil.toLocalDateTime(feedbackgrund.getGueltigVon()));
	bto.setGueltigBis(DateUtil.toLocalDateTime(feedbackgrund.getGueltigBis()));

	return bto;
  }
}
