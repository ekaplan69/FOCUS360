package at.sozvers.noegkk.focus.rest.api.zpv.person;

import at.sozvers.noegkk.focus.rest.api.common.BaseDTO;

public class StammdatenKurzDTO implements BaseDTO {

  private String fachschluessel;
  private String fachschluesselArt;

  public String getFachschluessel() {
	return fachschluessel;
  }

  public void setFachschluessel(String fachschluessel) {
	this.fachschluessel = fachschluessel;
  }

  public String getFachschluesselArt() {
	return fachschluesselArt;
  }

  public void setFachschluesselArt(String fachschluesselArt) {
	this.fachschluesselArt = fachschluesselArt;
  }
}
