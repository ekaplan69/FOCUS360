package at.sozvers.noegkk.focus.service.kundenfeedback.mapping;

import at.sozvers.noegkk.focus.service.api.kundenfeedback.KundenfeedbackUnterkategorieBTO;
import at.sozvers.noegkk.focus.service.common.DateUtil;
import at.sozvers.noegkk.focus.service.mapping.BTOExternalServiceMapper;
import at.sozvers.noegkk.sckont.kundenfeedback.focus.KfUnterkategorie;

public class KfUnterkategorieBTOExternalServiceMapper extends BTOExternalServiceMapper<KundenfeedbackUnterkategorieBTO, KfUnterkategorie> {
  @Override
  public KundenfeedbackUnterkategorieBTO map(KfUnterkategorie unterkategorie) {
	KundenfeedbackUnterkategorieBTO bto = new KundenfeedbackUnterkategorieBTO();

	bto.setId(unterkategorie.getId());
	bto.setThemaId(unterkategorie.getThemaId());
	bto.setBezeichnung(unterkategorie.getBezeichnung());
	bto.setGueltigVon(DateUtil.toLocalDateTime(unterkategorie.getGueltigVon()));
	bto.setGueltigBis(DateUtil.toLocalDateTime(unterkategorie.getGueltigBis()));

	return bto;
  }
}
