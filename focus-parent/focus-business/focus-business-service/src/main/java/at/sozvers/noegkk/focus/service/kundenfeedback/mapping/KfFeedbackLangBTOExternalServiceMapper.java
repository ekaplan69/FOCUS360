package at.sozvers.noegkk.focus.service.kundenfeedback.mapping;

import at.sozvers.noegkk.focus.service.api.kundenfeedback.KundenfeedbackLangBTO;
import at.sozvers.noegkk.focus.service.common.DateUtil;
import at.sozvers.noegkk.focus.service.mapping.BTOExternalServiceMapper;
import at.sozvers.noegkk.sckont.kundenfeedback.focus.KfFeedbackLang;

public class KfFeedbackLangBTOExternalServiceMapper extends BTOExternalServiceMapper<KundenfeedbackLangBTO, KfFeedbackLang> {
  @Override
  public KundenfeedbackLangBTO map(KfFeedbackLang feedbackLang) {
	KundenfeedbackLangBTO bto = new KundenfeedbackLangBTO();

	bto.setBeschreibung(feedbackLang.getBeschreibung());
	bto.setUpdatecount(feedbackLang.getUpdatecount());
	bto.setVerbesserungspotential(feedbackLang.getVerbesserungspotential());
	bto.setEmail(feedbackLang.getEmail());
	bto.setThemaId(feedbackLang.getThemaId());
	bto.setFachschluessel(feedbackLang.getFachschluessel());
	bto.setId(feedbackLang.getId());
	bto.setErstellTs(DateUtil.toLocalDateTime(feedbackLang.getErstellTs()));
	bto.setFeedbackArt(feedbackLang.getFeedbackArt());
	bto.setKontaktartId(feedbackLang.getKontaktartId());
	bto.setMitarbeiterOE(feedbackLang.getMitarbeiterOE());
	bto.setFeedbackgrundId(feedbackLang.getFeedbackgrundId());
	bto.setStatusId(feedbackLang.getStatusId());
	bto.setTelNr(feedbackLang.getTelNr());
	bto.setEmail(feedbackLang.getEmail());
	bto.setOrt(feedbackLang.getOrt());
	bto.setPlz(feedbackLang.getPlz());
	bto.setStaatISOA3(feedbackLang.getStaatISOA3());
	bto.setName(feedbackLang.getName());
	bto.setUnterkategorieId(feedbackLang.getUnterkategorieId());

	return bto;
  }
}
