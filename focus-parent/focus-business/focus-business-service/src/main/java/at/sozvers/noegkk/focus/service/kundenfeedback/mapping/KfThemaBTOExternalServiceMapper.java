package at.sozvers.noegkk.focus.service.kundenfeedback.mapping;

import at.sozvers.noegkk.focus.service.api.kundenfeedback.KundenfeedbackThemaBTO;
import at.sozvers.noegkk.focus.service.common.DateUtil;
import at.sozvers.noegkk.focus.service.mapping.BTOExternalServiceMapper;
import at.sozvers.noegkk.sckont.kundenfeedback.focus.KfThema;

public class KfThemaBTOExternalServiceMapper extends BTOExternalServiceMapper<KundenfeedbackThemaBTO, KfThema> {
  @Override
  public KundenfeedbackThemaBTO map(KfThema kfthema) {
	KundenfeedbackThemaBTO bto = new KundenfeedbackThemaBTO();

	bto.setThemaId(kfthema.getThemaId());
	bto.setKtThemaId(kfthema.getKtThemaId());
	bto.setThemaBezeichnung(kfthema.getThemaBezeichnung());
	bto.setGueltigVon(DateUtil.toLocalDateTime(kfthema.getGueltigVon()));
	bto.setGueltigBis(DateUtil.toLocalDateTime(kfthema.getGueltigBis()));

	return bto;
  }
}
