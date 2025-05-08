package at.sozvers.noegkk.focus.service.api.kontaktneu;

import at.sozvers.noegkk.focus.service.api.common.BaseBTO;

public class KontaktHistorieBTO implements BaseBTO {

  private String fachschluessel;

  public String getFachschluessel() {
	return fachschluessel;
  }

  public void setFachschluessel(String fachschluessel) {
	this.fachschluessel = fachschluessel;
  }
}
