package at.sozvers.noegkk.focus.rest.api.beschwerde;

import at.sozvers.noegkk.focus.rest.api.common.BaseDTO;

public class BeschwerdeBereichFachbereichDetailDTO implements BaseDTO {

  private Long   beschwerdebereichId;
  private String fachbereichDetailBezeichnung;
  private String fachbereichDetailHilfetext;

  public Long getBeschwerdebereichId() {
	return beschwerdebereichId;
  }

  public void setBeschwerdebereichId(Long beschwerdebereichId) {
	this.beschwerdebereichId = beschwerdebereichId;
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
}
