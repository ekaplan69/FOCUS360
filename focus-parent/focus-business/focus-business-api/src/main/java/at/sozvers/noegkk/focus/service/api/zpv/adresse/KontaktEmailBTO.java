package at.sozvers.noegkk.focus.service.api.zpv.adresse;

public class KontaktEmailBTO extends KontaktBTO {

  private String mailAdresse;

  public String getMailAdresse() {
	return mailAdresse;
  }

  public void setMailAdresse(String mailAdresse) {
	this.mailAdresse = mailAdresse;
  }

  @Override
  public AdresseType getType() {
	return AdresseType.KONTAKT_EMAIL;
  }
}
