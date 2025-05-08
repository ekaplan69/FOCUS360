package at.sozvers.noegkk.focus.service.api.zpv.adresse;

public class KontaktTelefonBTO extends KontaktBTO {

  private String telefonNummer;

  public String getTelefonNummer() {
	return telefonNummer;
  }

  public void setTelefonNummer(String telefonNummer) {
	this.telefonNummer = telefonNummer;
  }

  @Override
  public AdresseType getType() {
	return AdresseType.KONTAKT_TELEFON;
  }
}
