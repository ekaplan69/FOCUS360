package at.sozvers.noegkk.focus.rest.api.zpv.person;

import java.math.BigInteger;
import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;
import at.sozvers.noegkk.focus.rest.api.common.BaseDTO;
import at.sozvers.noegkk.focus.rest.api.zpv.adresse.AdresseAnschriftDTO;
import at.sozvers.noegkk.focus.rest.api.zpv.adresse.GeldadresseDTO;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;

public class StammdatenDTO implements BaseDTO {

  private AdresseAnschriftDTO  adresse;
  private boolean              andererMitarbeiter;
  private String               anrede;
  private boolean              auskunftsSperre;
  private List<String>         auskunftsSperreGruende;
  @JsonDeserialize(using=LocalDateDeserializer.class)
  @JsonSerialize(using=LocalDateSerializer.class)
  private LocalDate            bestaetigtesSterbeDat;
  private String               bundesland;
  private String               familienname;
  @JsonDeserialize(using=LocalDateDeserializer.class)
  @JsonSerialize(using=LocalDateSerializer.class)
  private LocalDate            geburtsDatum;
  private List<GeldadresseDTO> geldAdressen;
  private String               gemeinde;
  private String               gemeindecode;
  private String               geschlecht;
  private boolean              gesetzlichVertreten;
  private List<String>         gueltigeVSNR;
  private String               hausnummer;
  private String               mailAdresse;
  private String               name;
  private String               nameFamiliennameGross;
  private String               nameOhneAnrede;
  private BigInteger           parParrolleIDPartnerrolle;
  private BigInteger           partnerBetreuterRolleId;
  private BigInteger           partnerVersicherterRolleId;
  private String               polBezirk;
  private String               staat;
  private String               staatIsoA3;
  private boolean              storniert;
  private String               strasse;
  private String               telefonNummer;
  private List<VollmachtDTO>   vollmachten;
  private String               vorname;
  private boolean              zustimmungSuen;

  public AdresseAnschriftDTO getAdresse() {
	return adresse;
  }

  public void setAdresse(AdresseAnschriftDTO adresse) {
	this.adresse = adresse;
  }

  public String getAnrede() {
	return anrede;
  }

  public void setAnrede(String anrede) {
	this.anrede = anrede;
  }

  public List<String> getAuskunftsSperreGruende() {
	if(auskunftsSperreGruende == null) {
	  auskunftsSperreGruende = new LinkedList<>();
	}
	return auskunftsSperreGruende;
  }

  public void setAuskunftsSperreGruende(List<String> auskunftsSperreGruende) {
	this.auskunftsSperreGruende = auskunftsSperreGruende;
  }

  public LocalDate getBestaetigtesSterbeDat() {
	return bestaetigtesSterbeDat;
  }

  public void setBestaetigtesSterbeDat(LocalDate bestaetigtesSterbeDat) {
	this.bestaetigtesSterbeDat = bestaetigtesSterbeDat;
  }

  public String getBundesland() {
	return bundesland;
  }

  public void setBundesland(String bundesland) {
	this.bundesland = bundesland;
  }

  public String getFamilienname() {
	return familienname;
  }

  public void setFamilienname(String familienname) {
	this.familienname = familienname;
  }

  public LocalDate getGeburtsDatum() {
	return geburtsDatum;
  }

  public void setGeburtsDatum(LocalDate geburtsDatum) {
	this.geburtsDatum = geburtsDatum;
  }

  public List<GeldadresseDTO> getGeldAdressen() {
	if(geldAdressen == null) {
	  return new LinkedList<>();
	}
	return geldAdressen;
  }

  public void setGeldAdressen(List<GeldadresseDTO> geldAdressen) {
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

  public String getGeschlecht() {
	return geschlecht;
  }

  public void setGeschlecht(String geschlecht) {
	this.geschlecht = geschlecht;
  }

  public List<String> getGueltigeVSNR() {
	return gueltigeVSNR;
  }

  public void setGueltigeVSNR(List<String> gueltigeVSNR) {
	this.gueltigeVSNR = gueltigeVSNR;
  }

  public String getHausnummer() {
	return hausnummer;
  }

  public void setHausnummer(String hausnummer) {
	this.hausnummer = hausnummer;
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

  public String getNameFamiliennameGross() {
	return nameFamiliennameGross;
  }

  public void setNameFamiliennameGross(String nameFamiliennameGross) {
	this.nameFamiliennameGross = nameFamiliennameGross;
  }

  public String getNameOhneAnrede() {
	return nameOhneAnrede;
  }

  public void setNameOhneAnrede(String nameOhneAnrede) {
	this.nameOhneAnrede = nameOhneAnrede;
  }

  public BigInteger getParParrolleIDPartnerrolle() {
	return parParrolleIDPartnerrolle;
  }

  public void setParParrolleIDPartnerrolle(BigInteger parParrolleIDPartnerrolle) {
	this.parParrolleIDPartnerrolle = parParrolleIDPartnerrolle;
  }

  public BigInteger getPartnerBetreuterRolleId() {
	return partnerBetreuterRolleId;
  }

  public void setPartnerBetreuterRolleId(BigInteger partnerBetreuterRolleId) {
	this.partnerBetreuterRolleId = partnerBetreuterRolleId;
  }

  public BigInteger getPartnerVersicherterRolleId() {
	return partnerVersicherterRolleId;
  }

  public void setPartnerVersicherterRolleId(BigInteger partnerVersicherterRolleId) {
	this.partnerVersicherterRolleId = partnerVersicherterRolleId;
  }

  public String getPolBezirk() {
	return polBezirk;
  }

  public void setPolBezirk(String polBezirk) {
	this.polBezirk = polBezirk;
  }

  public String getStaat() {
	return staat;
  }

  public void setStaat(String staat) {
	this.staat = staat;
  }

  public String getStaatIsoA3() {
	return staatIsoA3;
  }

  public void setStaatIsoA3(String staatIsoA3) {
	this.staatIsoA3 = staatIsoA3;
  }

  public String getStrasse() {
	return strasse;
  }

  public void setStrasse(String strasse) {
	this.strasse = strasse;
  }

  public String getTelefonNummer() {
	return telefonNummer;
  }

  public void setTelefonNummer(String telefonNummer) {
	this.telefonNummer = telefonNummer;
  }

  public List<VollmachtDTO> getVollmachten() {
	return vollmachten;
  }

  public void setVollmachten(List<VollmachtDTO> vollmachten) {
	this.vollmachten = vollmachten;
  }

  public String getVorname() {
	return vorname;
  }

  public void setVorname(String vorname) {
	this.vorname = vorname;
  }

  public boolean isAndererMitarbeiter() {
	return andererMitarbeiter;
  }

  public void setAndererMitarbeiter(boolean andererMitarbeiter) {
	this.andererMitarbeiter = andererMitarbeiter;
  }

  public boolean isAuskunftsSperre() {
	return auskunftsSperre;
  }

  public void setAuskunftsSperre(boolean auskunftsSperre) {
	this.auskunftsSperre = auskunftsSperre;
  }

  public boolean isGesetzlichVertreten() {
	return gesetzlichVertreten;
  }

  public void setGesetzlichVertreten(boolean gesetzlichVertreten) {
	this.gesetzlichVertreten = gesetzlichVertreten;
  }

  public boolean isStorniert() {
	return storniert;
  }

  public void setStorniert(boolean storniert) {
	this.storniert = storniert;
  }

  public boolean isZustimmungSuen() {
	return zustimmungSuen;
  }

  public void setZustimmungSuen(boolean zustimmungSuen) {
	this.zustimmungSuen = zustimmungSuen;
  }
}
