package at.sozvers.noegkk.focus.service.api.beschwerde;

import java.time.LocalDateTime;
import at.sozvers.noegkk.focus.service.api.common.BaseBTO;

public class BeschwerdeBTO implements BaseBTO {

  private Long          beschwerdeId;
  private String        fachbereichBezeichnung;
  private String        kanalBezeichnung;
  private String        kontaktpunktBezeichnung;
  private Long          statusId;
  private Boolean       storno;
  private String        themaBezeichnung;
  private LocalDateTime zeitpunkt;

  public Long getBeschwerdeId() {
	return beschwerdeId;
  }

  public void setBeschwerdeId(Long beschwerdeId) {
	this.beschwerdeId = beschwerdeId;
  }

  public String getFachbereichBezeichnung() {
	return fachbereichBezeichnung;
  }

  public void setFachbereichBezeichnung(String fachbereichBezeichnung) {
	this.fachbereichBezeichnung = fachbereichBezeichnung;
  }

  public String getKanalBezeichnung() {
	return kanalBezeichnung;
  }

  public void setKanalBezeichnung(String kanalBezeichnung) {
	this.kanalBezeichnung = kanalBezeichnung;
  }

  public String getKontaktpunktBezeichnung() {
	return kontaktpunktBezeichnung;
  }

  public void setKontaktpunktBezeichnung(String kontaktpunktBezeichnung) {
	this.kontaktpunktBezeichnung = kontaktpunktBezeichnung;
  }

  public Long getStatusId() {
	return statusId;
  }

  public void setStatusId(Long statusId) {
	this.statusId = statusId;
  }

  public Boolean getStorno() {
	return storno;
  }

  public void setStorno(Boolean storno) {
	this.storno = storno;
  }

  public String getThemaBezeichnung() {
	return themaBezeichnung;
  }

  public void setThemaBezeichnung(String themaBezeichnung) {
	this.themaBezeichnung = themaBezeichnung;
  }

  public LocalDateTime getZeitpunkt() {
	return zeitpunkt;
  }

  public void setZeitpunkt(LocalDateTime zeitpunkt) {
	this.zeitpunkt = zeitpunkt;
  }
}
