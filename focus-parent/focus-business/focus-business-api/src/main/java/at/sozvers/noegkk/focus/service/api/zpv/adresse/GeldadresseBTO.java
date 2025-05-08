package at.sozvers.noegkk.focus.service.api.zpv.adresse;

public class GeldadresseBTO extends AdresseBTO {

  private String bic;
  private String iban;
  private String institut;
  private String verwendungsartKurz;

  public String getBic() {
	return bic;
  }

  public void setBic(String bic) {
	this.bic = bic;
  }

  public String getIban() {
	return iban;
  }

  public void setIban(String iban) {
	this.iban = iban;
  }

  public String getInstitut() {
	return institut;
  }

  public void setInstitut(String institut) {
	this.institut = institut;
  }

  @Override
  public AdresseType getType() {
	return AdresseType.GELDADRESSE;
  }

  public String getVerwendungsartKurz() {
	return verwendungsartKurz;
  }

  public void setVerwendungsartKurz(String verwendungsartKurz) {
	this.verwendungsartKurz = verwendungsartKurz;
  }
}
