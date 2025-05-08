package at.sozvers.noegkk.focus.rest.endpoint.kundenfeedback.mapping;

import at.sozvers.noegkk.focus.rest.api.feedback.KundenfeedbackErstellenDTO;
import at.sozvers.noegkk.focus.rest.mapping.BusinessRestMapper;
import at.sozvers.noegkk.focus.service.api.kundenfeedback.KundenfeedbackErstellenBTO;

public class KundenfeedbackErstellenBusinessRestMapper extends BusinessRestMapper<KundenfeedbackErstellenDTO, KundenfeedbackErstellenBTO> {
  @Override
  public KundenfeedbackErstellenBTO map(KundenfeedbackErstellenDTO dto) {
	KundenfeedbackErstellenBTO bto = new KundenfeedbackErstellenBTO();

	bto.setFachschluessel(dto.getFachschluessel());
	bto.setFachschluesselArtKurz(dto.getFachschluesselArtKurz());
	bto.setKontaktartId(dto.getKontaktartId());
	bto.setThemaId(dto.getThemaId());
	bto.setUnterkategorieId(dto.getUnterkategorieId());
	bto.setFeedbackgrundId(dto.getFeedbackgrundId());
	bto.setFeedbackArt(dto.getFeedbackArt());
	bto.setBeschreibung(dto.getBeschreibung());
	bto.setVerbesserungspotential(dto.getVerbesserungspotential());
	bto.setEmail(dto.getEmail());
	bto.setTelNr(dto.getTelNr());
	bto.setName(dto.getName());
	bto.setMeldendeStelle(dto.getMeldendeStelle());
	bto.setMitarbeitername(dto.getMitarbeitername());
	bto.setLetztaend(dto.getLetztaend());
	bto.setMitarbeiterOe(dto.getMitarbeiterOe());

	return bto;
  }
}
