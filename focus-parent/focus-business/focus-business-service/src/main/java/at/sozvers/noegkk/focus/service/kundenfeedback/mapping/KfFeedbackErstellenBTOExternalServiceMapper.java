package at.sozvers.noegkk.focus.service.kundenfeedback.mapping;

import at.sozvers.noegkk.focus.service.api.kundenfeedback.KundenfeedbackErstellenBTO;
import at.sozvers.noegkk.focus.service.mapping.BTOExternalServiceMapper;
import at.sozvers.noegkk.sckont.kundenfeedback.focus.KfFeedbackErstellenRequest;

public class KfFeedbackErstellenBTOExternalServiceMapper extends BTOExternalServiceMapper<KundenfeedbackErstellenBTO, KfFeedbackErstellenRequest> {
  @Override
  public KfFeedbackErstellenRequest map(KundenfeedbackErstellenBTO bto) {
	KfFeedbackErstellenRequest request = new KfFeedbackErstellenRequest();

	request.setFachschluessel(bto.getFachschluessel());
	request.setFachschluesselArtKurz(bto.getFachschluesselArtKurz());
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
	request.setPlz(null);
	request.setOrt(null);
	request.setMeldendeStelle(bto.getMeldendeStelle());
	request.setMitarbeitername(bto.getMitarbeitername());
	request.setLetztaend(bto.getLetztaend());
	request.setStatus(0);
	request.setMitarbeiterOe(bto.getMitarbeiterOe());
	request.setStaatISOA3(null);

	return request;
  }
}
