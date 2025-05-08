package at.sozvers.noegkk.focus.service.api.zpv.person;

import at.sozvers.noegkk.focus.service.api.common.BaseBTO;

public class StammdatenKurzBTO implements BaseBTO {

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
