package at.sozvers.noegkk.focus.service.api.kontaktneu;

import java.time.LocalDateTime;
import at.sozvers.noegkk.focus.service.api.common.BaseBTO;

public class KontaktAufggAaMstMapBTO implements BaseBTO {

  private Long          abschlussartId;
  private String        anzeigenAls;
  private Long          aufgabengebietId;
  private Long          aufggAaMstMapId;
  private LocalDateTime gueltigBis;
  private LocalDateTime gueltigVon;
  private Long          mstCode;

  public Long getAbschlussartId() {
	return abschlussartId;
  }

  public void setAbschlussartId(Long abschlussartId) {
	this.abschlussartId = abschlussartId;
  }

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

  public Long getAufggAaMstMapId() {
	return aufggAaMstMapId;
  }

  public void setAufggAaMstMapId(Long aufggAaMstMapId) {
	this.aufggAaMstMapId = aufggAaMstMapId;
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
}
