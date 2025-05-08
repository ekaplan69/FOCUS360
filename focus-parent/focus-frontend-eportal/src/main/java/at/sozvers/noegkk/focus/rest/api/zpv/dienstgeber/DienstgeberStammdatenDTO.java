package at.sozvers.noegkk.focus.rest.api.zpv.dienstgeber;

import java.math.BigInteger;
import java.util.List;
import at.sozvers.noegkk.focus.rest.api.common.BaseDTO;
import at.sozvers.noegkk.focus.rest.api.zpv.adresse.AdresseAnschriftDTO;
import at.sozvers.noegkk.focus.rest.api.zpv.adresse.GeldadresseDTO;

public class DienstgeberStammdatenDTO implements BaseDTO {

  private AdresseAnschriftDTO          adresse;
  private String                       bundesland;
  private List<FremdIdentifikationDTO> firmenbuchNr;
  private List<GeldadresseDTO>         geldadressen;
  private String                       gemeinde;
  private String                       gemeindecode;
  private List<FremdIdentifikationDTO> kur;
  private String                       mailAdresse;
  private String                       name;
  private BigInteger                   parParrolleIDPartner;
  private String                       polBezirk;
  private String                       staatIsoA3;
  private boolean                      storniert;
  private String                       svtBeitragskontoNr;
  private String                       telefonNummer;
  private List<FremdIdentifikationDTO> uid;

  public AdresseAnschriftDTO getAdresse() {
	return adresse;
  }

  public void setAdresse(AdresseAnschriftDTO adresse) {
	this.adresse = adresse;
  }

  public String getBundesland() {
	return bundesland;
  }

  public void setBundesland(String bundesland) {
	this.bundesland = bundesland;
  }

  public List<FremdIdentifikationDTO> getFirmenbuchNr() {
	return firmenbuchNr;
  }

  public void setFirmenbuchNr(List<FremdIdentifikationDTO> firmenbuchNr) {
	this.firmenbuchNr = firmenbuchNr;
  }

  public List<GeldadresseDTO> getGeldadressen() {
	return geldadressen;
  }

  public void setGeldadressen(List<GeldadresseDTO> geldadressen) {
	this.geldadressen = geldadressen;
  }

  public String getGemeinde() {
	return gemeinde;
  }

  public void setGemeinde(String gemeinde) {
	this.gemeinde = gemeinde;
  }

  public String getGemeindecode() {
	return gemeindecode;
  }

  public void setGemeindecode(String gemeindecode) {
	this.gemeindecode = gemeindecode;
  }

  public List<FremdIdentifikationDTO> getKur() {
	return kur;
  }

  public void setKur(List<FremdIdentifikationDTO> kur) {
	this.kur = kur;
  }

  public String getMailAdresse() {
	return mailAdresse;
  }

  public void setMailAdresse(String mailAdresse) {
	this.mailAdresse = mailAdresse;
  }

  public String getName() {
	return name;
  }

  public void setName(String name) {
	this.name = name;
  }

  public BigInteger getParParrolleIDPartner() {
	return parParrolleIDPartner;
  }

  public void setParParrolleIDPartner(BigInteger parParrolleIDPartner) {
	this.parParrolleIDPartner = parParrolleIDPartner;
  }

  public String getPolBezirk() {
	return polBezirk;
  }

  public void setPolBezirk(String polBezirk) {
	this.polBezirk = polBezirk;
  }

  public String getStaatIsoA3() {
	return staatIsoA3;
  }

  public void setStaatIsoA3(String staatIsoA3) {
	this.staatIsoA3 = staatIsoA3;
  }

  public String getSvtBeitragskontoNr() {
	return svtBeitragskontoNr;
  }

  public void setSvtBeitragskontoNr(String svtBeitragskontoNr) {
	this.svtBeitragskontoNr = svtBeitragskontoNr;
  }

  public String getTelefonNummer() {
	return telefonNummer;
  }

  public void setTelefonNummer(String telefonNummer) {
	this.telefonNummer = telefonNummer;
  }

  public List<FremdIdentifikationDTO> getUid() {
	return uid;
  }

  public void setUid(List<FremdIdentifikationDTO> uid) {
	this.uid = uid;
  }

  public boolean isStorniert() {
	return storniert;
  }

  public void setStorniert(boolean storniert) {
	this.storniert = storniert;
  }
}
