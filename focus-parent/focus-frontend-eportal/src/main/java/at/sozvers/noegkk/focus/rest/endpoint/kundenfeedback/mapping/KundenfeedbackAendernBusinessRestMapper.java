package at.sozvers.noegkk.focus.rest.endpoint.kundenfeedback.mapping;

import at.sozvers.noegkk.focus.rest.api.feedback.KundenfeedbackAendernDTO;
import at.sozvers.noegkk.focus.rest.mapping.BusinessRestMapper;
import at.sozvers.noegkk.focus.service.api.kundenfeedback.KundenfeedbackAendernBTO;

public class KundenfeedbackAendernBusinessRestMapper extends BusinessRestMapper<KundenfeedbackAendernDTO, KundenfeedbackAendernBTO> {
  @Override
  public KundenfeedbackAendernBTO map(KundenfeedbackAendernDTO dto) {
	KundenfeedbackAendernBTO bto = new KundenfeedbackAendernBTO();

	bto.setId(dto.getId());
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
	bto.setPlz(dto.getPlz());
	bto.setOrt(dto.getOrt());
	bto.setLetztaend(dto.getLetztaend());
	bto.setStatus(dto.getStatus());
	bto.setStaatISOA3(dto.getStaatISOA3());
	bto.setUpdateCount(dto.getUpdateCount());

	return bto;
  }
}
