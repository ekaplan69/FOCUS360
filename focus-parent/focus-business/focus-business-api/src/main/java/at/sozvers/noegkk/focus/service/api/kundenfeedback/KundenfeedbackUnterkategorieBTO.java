package at.sozvers.noegkk.focus.service.api.kundenfeedback;

import java.time.LocalDateTime;
import at.sozvers.noegkk.focus.service.api.common.BaseBTO;

public class KundenfeedbackUnterkategorieBTO implements BaseBTO {
  private String        bezeichnung;
  private LocalDateTime gueltigBis;
  private LocalDateTime gueltigVon;
  private Long          id;
  private Long          themaId;

  public String getBezeichnung() {
	return bezeichnung;
  }

  public void setBezeichnung(String bezeichnung) {
	this.bezeichnung = bezeichnung;
  }

  public LocalDateTime getGueltigBis() {
	return gueltigBis;
  }

  public void setGueltigBis(LocalDateTime gueltigBis) {
	this.gueltigBis = gueltigBis;
  }

  public LocalDateTime getGueltigVon() {
	return gueltigVon;
  }

  public void setGueltigVon(LocalDateTime gueltigVon) {
	this.gueltigVon = gueltigVon;
  }

  public Long getId() {
	return id;
  }

  public void setId(Long id) {
	this.id = id;
  }

  public Long getThemaId() {
	return themaId;
  }

  public void setThemaId(Long themaId) {
	this.themaId = themaId;
  }
}
