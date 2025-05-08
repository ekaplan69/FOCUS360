package at.sozvers.noegkk.focus.service.api.kontaktneu;

import java.time.LocalDateTime;
import at.sozvers.noegkk.focus.service.api.common.BaseBTO;

public class KontaktAufggKtMstMapBTO implements BaseBTO {

  private String        anzeigenAls;
  private Long          aufgabengebietId;
  private Long          aufggKtMstMapId;
  private LocalDateTime gueltigBis;
  private LocalDateTime gueltigVon;
  private Long          kontaktartId;
  private Long          mstCode;

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

  public Long getAufggKtMstMapId() {
	return aufggKtMstMapId;
  }

  public void setAufggKtMstMapId(Long aufggKtMstMapId) {
	this.aufggKtMstMapId = aufggKtMstMapId;
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

  public Long getKontaktartId() {
	return kontaktartId;
  }

  public void setKontaktartId(Long kontaktartId) {
	this.kontaktartId = kontaktartId;
  }

  public Long getMstCode() {
	return mstCode;
  }

  public void setMstCode(Long mstCode) {
	this.mstCode = mstCode;
  }
}
