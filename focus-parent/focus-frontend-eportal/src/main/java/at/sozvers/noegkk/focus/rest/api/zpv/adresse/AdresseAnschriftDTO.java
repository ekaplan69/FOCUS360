package at.sozvers.noegkk.focus.rest.api.zpv.adresse;

import at.sozvers.noegkk.focus.rest.api.common.BaseDTO;

public class AdresseAnschriftDTO implements BaseDTO {

  private String anschrift;
  private String ort;
  private String plz;

  public String getAnschrift() {
	return anschrift;
  }

  public void setAnschrift(String anschrift) {
	this.anschrift = anschrift;
  }

  public String getOrt() {
	return ort;
  }

  public void setOrt(String ort) {
	this.ort = ort;
  }

  public String getPlz() {
	return plz;
  }

  public void setPlz(String plz) {
	this.plz = plz;
  }
}
