package at.sozvers.noegkk.focus.service.kundenfeedback.mapping;

import at.sozvers.noegkk.focus.service.api.kundenfeedback.KundenfeedbackUnterkategorieFbgMapBTO;
import at.sozvers.noegkk.focus.service.common.DateUtil;
import at.sozvers.noegkk.focus.service.mapping.BTOExternalServiceMapper;
import at.sozvers.noegkk.sckont.kundenfeedback.focus.KfUnterkategorieFbgMap;

public class KfUnterkategorieFbgMapExternalServiceMapper extends BTOExternalServiceMapper<KundenfeedbackUnterkategorieFbgMapBTO, KfUnterkategorieFbgMap> {
  @Override
  public KundenfeedbackUnterkategorieFbgMapBTO map(KfUnterkategorieFbgMap unterkategorieFbgMap) {
	KundenfeedbackUnterkategorieFbgMapBTO mapping = new KundenfeedbackUnterkategorieFbgMapBTO();

	mapping.setUnterkategorieId(unterkategorieFbgMap.getUnterkategorieId());
	mapping.setFbgId(unterkategorieFbgMap.getFeedbackgrundId());
	mapping.setGueltigBis(DateUtil.toLocalDateTime(unterkategorieFbgMap.getGueltigBis()));
	mapping.setGueltigVon(DateUtil.toLocalDateTime(unterkategorieFbgMap.getGueltigVon()));

	return mapping;
  }
}
