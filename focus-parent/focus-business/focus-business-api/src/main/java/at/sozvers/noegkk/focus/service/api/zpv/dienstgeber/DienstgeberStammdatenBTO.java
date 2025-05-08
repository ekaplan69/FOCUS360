package at.sozvers.noegkk.focus.service.api.zpv.dienstgeber;

import java.math.BigInteger;
import java.util.List;
import at.sozvers.noegkk.focus.service.api.common.BaseBTO;
import at.sozvers.noegkk.focus.service.api.zpv.adresse.*;

public class DienstgeberStammdatenBTO implements BaseBTO {
  private AdresseAnschriftBTO          adresse;
  private String                       bundesland;
  private List<FremdIdentifikationBTO> firmenbuchNr;
  private List<GeldadresseBTO>         geldAdressen;
  private String                       gemeinde;
  private String                       gemeindecode;
  private KontaktEmailBTO              kontaktEmail;
  private KontaktTelefonBTO            kontaktTelefon;
  private List<FremdIdentifikationBTO> kur;
  private String                       name;
  private BigInteger                   parParrolleIDPartner;
  private String                       polBezirk;
  private String                       staatIsoA3;
  private boolean                      storniert;
  private String                       svtBeitragskontoNr;
  private List<FremdIdentifikationBTO> uid;

  public AdresseAnschriftBTO getAdresse() {
	return adresse;
  }

  public void setAdresse(AdresseAnschriftBTO adresse) {
	this.adresse = adresse;
  }

  public String getBundesland() {
	return bundesland;
  }

  public void setBundesland(String bundesland) {
	this.bundesland = bundesland;
  }

  public List<FremdIdentifikationBTO> getFirmenbuchNr() {
	return firmenbuchNr;
  }

  public void setFirmenbuchNr(List<FremdIdentifikationBTO> firmenbuchNr) {
	this.firmenbuchNr = firmenbuchNr;
  }

  public List<GeldadresseBTO> getGeldAdressen() {
	return geldAdressen;
  }

  public void setGeldAdressen(List<GeldadresseBTO> geldAdressen) {
	this.geldAdressen = geldAdressen;
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

  public KontaktEmailBTO getKontaktEmail() {
	return kontaktEmail;
  }

  public void setKontaktEmail(KontaktEmailBTO kontaktEmail) {
	this.kontaktEmail = kontaktEmail;
  }

  public KontaktTelefonBTO getKontaktTelefon() {
	return kontaktTelefon;
  }

  public void setKontaktTelefon(KontaktTelefonBTO kontaktTelefon) {
	this.kontaktTelefon = kontaktTelefon;
  }

  public List<FremdIdentifikationBTO> getKur() {
	return kur;
  }

  public void setKur(List<FremdIdentifikationBTO> kur) {
	this.kur = kur;
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

  public List<FremdIdentifikationBTO> getUid() {
	return uid;
  }

  public void setUid(List<FremdIdentifikationBTO> uid) {
	this.uid = uid;
  }

  public boolean isStorniert() {
	return storniert;
  }

  public void setStorniert(boolean storniert) {
	this.storniert = storniert;
  }
}
