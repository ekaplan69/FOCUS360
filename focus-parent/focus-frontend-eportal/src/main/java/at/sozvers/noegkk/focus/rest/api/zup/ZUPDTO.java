package at.sozvers.noegkk.focus.rest.api.zup;

import at.sozvers.noegkk.focus.rest.api.common.BaseDTO;

public class ZUPDTO implements BaseDTO {

  private String fachschluessel;
  private String fachschluesselArtKurz;

  public ZUPDTO() {
	//Default Constructor
  }

  public ZUPDTO(String fachschluessel, String fachschluesselArtKurz) {
	this.fachschluessel = fachschluessel;
	this.fachschluesselArtKurz = fachschluesselArtKurz;
  }

  public String getFachschluessel() {
	return fachschluessel;
  }

  public void setFachschluessel(String fachschluessel) {
	this.fachschluessel = fachschluessel;
  }

  public String getFachschluesselArtKurz() {
	return fachschluesselArtKurz;
  }

  public void setFachschluesselArtKurz(String fachschluesselArtKurz) {
	this.fachschluesselArtKurz = fachschluesselArtKurz;
  }
}
