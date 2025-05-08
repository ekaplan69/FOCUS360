package at.sozvers.noegkk.focus.service.api.beschwerde;

import at.sozvers.noegkk.focus.service.api.common.BaseBTO;

public class BeschwerdeBereichBTO implements BaseBTO {

  private Long   beschwerdebereichId;
  private String fachbereichBezeichnung;
  private String fachbereichDetailBezeichnung;
  private String fachbereichDetailHilfetext;
  private String fachbereichHilfetext;
  private Long   fachbereichId;
  private String themaBezeichnung;
  private String themaHilfetext;
  private Long   themaId;

  public Long getBeschwerdebereichId() {
	return beschwerdebereichId;
  }

  public void setBeschwerdebereichId(Long beschwerdebereichId) {
	this.beschwerdebereichId = beschwerdebereichId;
  }

  public String getFachbereichBezeichnung() {
	return fachbereichBezeichnung;
  }

  public void setFachbereichBezeichnung(String fachbereichBezeichnung) {
	this.fachbereichBezeichnung = fachbereichBezeichnung;
  }

  public String getFachbereichDetailBezeichnung() {
	return fachbereichDetailBezeichnung;
  }

  public void setFachbereichDetailBezeichnung(String fachbereichDetailBezeichnung) {
	this.fachbereichDetailBezeichnung = fachbereichDetailBezeichnung;
  }

  public String getFachbereichDetailHilfetext() {
	return fachbereichDetailHilfetext;
  }

  public void setFachbereichDetailHilfetext(String fachbereichDetailHilfetext) {
	this.fachbereichDetailHilfetext = fachbereichDetailHilfetext;
  }

  public String getFachbereichHilfetext() {
	return fachbereichHilfetext;
  }

  public void setFachbereichHilfetext(String fachbereichHilfetext) {
	this.fachbereichHilfetext = fachbereichHilfetext;
  }

  public Long getFachbereichId() {
	return fachbereichId;
  }

  public void setFachbereichId(Long fachbereichId) {
	this.fachbereichId = fachbereichId;
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
