package at.sozvers.noegkk.focus.service.api.kundenfeedback;

import java.time.LocalDateTime;
import at.sozvers.noegkk.focus.service.api.common.BaseBTO;

public class KundenfeedbackThemaBTO implements BaseBTO {
  private LocalDateTime gueltigBis;
  private LocalDateTime gueltigVon;
  private Long          ktThemaId;
  private String        themaBezeichnung;
  private Long          themaId;

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

  public Long getKtThemaId() {
	return ktThemaId;
  }

  public void setKtThemaId(Long ktThemaId) {
	this.ktThemaId = ktThemaId;
  }

  public String getThemaBezeichnung() {
	return themaBezeichnung;
  }

  public void setThemaBezeichnung(String themaBezeichnung) {
	this.themaBezeichnung = themaBezeichnung;
  }

  public Long getThemaId() {
	return themaId;
  }

  public void setThemaId(Long themaId) {
	this.themaId = themaId;
  }
}
