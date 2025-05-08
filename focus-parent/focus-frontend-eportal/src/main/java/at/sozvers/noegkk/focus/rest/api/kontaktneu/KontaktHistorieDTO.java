package at.sozvers.noegkk.focus.rest.api.kontaktneu;

import at.sozvers.noegkk.focus.rest.api.common.BaseDTO;

public class KontaktHistorieDTO implements BaseDTO {

  private String fachschluessel;

  public String getFachschluessel() {
	return fachschluessel;
  }

  public void setFachschluessel(String fachschluessel) {
	this.fachschluessel = fachschluessel;
  }
}
