package at.sozvers.noegkk.focus.service.api.kontaktneu;

import java.time.LocalDateTime;
import at.sozvers.noegkk.focus.service.api.common.BaseBTO;

public class KontaktAufggThemaMstBTO implements BaseBTO {

  private String        anzeigenAls;
  private Long          aufgabengebietId;
  private Long          aufggThemaMstMapId;
  private LocalDateTime gueltigBis;
  private LocalDateTime gueltigVon;
  private Long          mstCode;
  private Long          themaId;

  public String getAnzeigenAls() {
	return anzeigenAls;
  }

  public void setAnzeigenAls(String anzeigenAls) {
	this.anzeigenAls = anzeigenAls;
  }

  public Long getAufgabengebietId() {
	return aufgabengebietId;
  }

  public void setAufgabengebietId(Long aufgabengebietId) {
	this.aufgabengebietId = aufgabengebietId;
  }

  public Long getAufggThemaMstMapId() {
	return aufggThemaMstMapId;
  }

  public void setAufggThemaMstMapId(Long aufggThemaMstMapId) {
	this.aufggThemaMstMapId = aufggThemaMstMapId;
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

  public Long getMstCode() {
	return mstCode;
  }

  public void setMstCode(Long mstCode) {
	this.mstCode = mstCode;
  }

  public Long getThemaId() {
	return themaId;
  }

  public void setThemaId(Long themaId) {
	this.themaId = themaId;
  }
}
