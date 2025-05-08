package at.sozvers.noegkk.focus.service.kundenfeedback.mapping;

import at.sozvers.noegkk.focus.service.api.kundenfeedback.KundenfeedbackThemaFbgMapBTO;
import at.sozvers.noegkk.focus.service.common.DateUtil;
import at.sozvers.noegkk.focus.service.mapping.BTOExternalServiceMapper;
import at.sozvers.noegkk.sckont.kundenfeedback.focus.KfThemaFbgMap;

public class KfThemaFbgMapBTOExternalServiceMapper extends BTOExternalServiceMapper<KundenfeedbackThemaFbgMapBTO, KfThemaFbgMap> {
  @Override
  public KundenfeedbackThemaFbgMapBTO map(KfThemaFbgMap kfThemaFbgMap) {
	KundenfeedbackThemaFbgMapBTO mapping = new KundenfeedbackThemaFbgMapBTO();

	mapping.setThemaId(kfThemaFbgMap.getThemaId());
	mapping.setFbgId(kfThemaFbgMap.getFeedbackgrundId());
	mapping.setGueltigBis(DateUtil.toLocalDateTime(kfThemaFbgMap.getGueltigBis()));
	mapping.setGueltigVon(DateUtil.toLocalDateTime(kfThemaFbgMap.getGueltigVon()));

	return mapping;
  }
}
