package at.sozvers.noegkk.focus.rest.api.kontakt;

import at.sozvers.noegkk.focus.rest.api.common.BaseDTO;

public class KundenkontaktAbschlussartDTO implements BaseDTO {

  private String abschlussartBezeichnung;
  private Long   abschlussartId;

  public String getAbschlussartBezeichnung() {
	return abschlussartBezeichnung;
  }

  public void setAbschlussartBezeichnung(String abschlussartBezeichnung) {
	this.abschlussartBezeichnung = abschlussartBezeichnung;
  }

  public Long getAbschlussartId() {
	return abschlussartId;
  }

  public void setAbschlussartId(Long abschlussartId) {
	this.abschlussartId = abschlussartId;
  }
}
