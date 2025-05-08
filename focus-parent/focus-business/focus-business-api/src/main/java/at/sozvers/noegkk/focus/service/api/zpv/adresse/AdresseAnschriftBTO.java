package at.sozvers.noegkk.focus.service.api.zpv.adresse;

public class AdresseAnschriftBTO extends AdresseBTO {

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

  @Override
  public AdresseType getType() {
	return AdresseType.ANSCHRIFT;
  }
}
