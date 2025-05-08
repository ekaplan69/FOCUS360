package at.sozvers.noegkk.focus.service.kundenfeedback.mapping;

import at.sozvers.noegkk.focus.service.api.kundenfeedback.KundenfeedbackAendernBTO;
import at.sozvers.noegkk.focus.service.mapping.BTOExternalServiceMapper;
import at.sozvers.noegkk.sckont.kundenfeedback.focus.KfFeedbackAendernRequest;

public class KfFeedbackAendernBTOExternalServiceMapper extends BTOExternalServiceMapper<KundenfeedbackAendernBTO, KfFeedbackAendernRequest> {
  @Override
  public KfFeedbackAendernRequest map(KundenfeedbackAendernBTO bto) {
	KfFeedbackAendernRequest request = new KfFeedbackAendernRequest();

	request.setId(bto.getId());
	request.setKontaktartId(bto.getKontaktartId());
	request.setThemaId(bto.getThemaId());
	request.setUnterkategorieId(bto.getUnterkategorieId());
	request.setFeedbackgrundId(bto.getFeedbackgrundId());
	request.setFeedbackArt(bto.getFeedbackArt());
	request.setBeschreibung(bto.getBeschreibung());
	request.setVerbesserungspotential(bto.getVerbesserungspotential());
	request.setEmail(bto.getEmail());
	request.setTelNr(bto.getTelNr());
	request.setName(bto.getName());
	request.setPlz(bto.getPlz());
	request.setOrt(bto.getOrt());
	request.setLetztaend(bto.getLetztaend());
	request.setStatus(bto.getStatus());
	request.setStaatISOA3(bto.getStaatISOA3());
	request.setUpdateCount(bto.getUpdateCount());

	return request;
  }
}
