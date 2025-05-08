package at.sozvers.noegkk.focus.service.common;

public class Fachschluessel {

  private String fachschluessel;
  private String fachschluesselArt;

  public Fachschluessel() {
  }

  public Fachschluessel(String fachschluessel, String fachschluesselArt) {
	this.fachschluessel = fachschluessel;
	this.fachschluesselArt = fachschluesselArt;
  }

  public static Fachschluessel of(String fachschluessel, String fachschluesselArt) {
	return new Fachschluessel(fachschluessel, fachschluesselArt);
  }

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

