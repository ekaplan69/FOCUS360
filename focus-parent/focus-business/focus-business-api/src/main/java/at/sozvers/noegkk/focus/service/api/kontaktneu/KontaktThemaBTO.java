package at.sozvers.noegkk.focus.service.api.kontaktneu;

import java.time.LocalDateTime;
import at.sozvers.noegkk.focus.service.api.common.BaseBTO;

public class KontaktThemaBTO implements BaseBTO {

  private LocalDateTime gueltigBis;
  private LocalDateTime gueltigVon;
  private String        themaBezeichnung;
  private String        themaHilfetext;
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

  public String getThemaBezeichnung() {
	return themaBezeichnung;
  }

  public void setThemaBezeichnung(String themaBezeichnung) {
	this.themaBezeichnung = themaBezeichnung;
  }

  public String getThemaHilfetext() {
	return themaHilfetext;
  }

  public void setThemaHilfetext(String themaHilfetext) {
	this.themaHilfetext = themaHilfetext;
  }

  public Long getThemaId() {
	return themaId;
  }

  public void setThemaId(Long themaId) {
	this.themaId = themaId;
  }
}
