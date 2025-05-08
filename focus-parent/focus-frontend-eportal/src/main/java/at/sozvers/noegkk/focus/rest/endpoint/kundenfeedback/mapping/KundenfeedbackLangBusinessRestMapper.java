package at.sozvers.noegkk.focus.rest.endpoint.kundenfeedback.mapping;

import at.sozvers.noegkk.focus.rest.api.feedback.KundenfeedbackLangDTO;
import at.sozvers.noegkk.focus.rest.mapping.BusinessRestMapper;
import at.sozvers.noegkk.focus.service.api.kundenfeedback.KundenfeedbackLangBTO;

public class KundenfeedbackLangBusinessRestMapper extends BusinessRestMapper<KundenfeedbackLangDTO, KundenfeedbackLangBTO> {
  @Override
  public KundenfeedbackLangDTO map(KundenfeedbackLangBTO bto) {
	KundenfeedbackLangDTO dto = new KundenfeedbackLangDTO();

	dto.setBeschreibung(bto.getBeschreibung());
	dto.setVerbesserungspotential(bto.getVerbesserungspotential());
	dto.setEmail(bto.getEmail());
	dto.setThemaId(bto.getThemaId());
	dto.setFachschluessel(bto.getFachschluessel());
	dto.setId(bto.getId());
	dto.setErstellTs(bto.getErstellTs());
	dto.setFeedbackArt(bto.getFeedbackArt());
	dto.setKontaktartId(bto.getKontaktartId());
	dto.setMitarbeiterOE(bto.getMitarbeiterOE());
	dto.setFeedbackgrundId(bto.getFeedbackgrundId());
	dto.setStatusId(bto.getStatusId());
	dto.setTelNr(bto.getTelNr());
	dto.setEmail(bto.getEmail());
	dto.setOrt(bto.getOrt());
	dto.setPlz(bto.getPlz());
	dto.setStaatISOA3(bto.getStaatISOA3());
	dto.setName(bto.getName());
	dto.setUnterkategorieId(bto.getUnterkategorieId());
	dto.setUpdatecount(bto.getUpdatecount());

	return dto;
  }
}
