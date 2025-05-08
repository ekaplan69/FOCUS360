package at.sozvers.noegkk.focus.service.api.zpv.person;

import java.math.BigInteger;
import java.time.LocalDate;
import java.util.*;
import at.sozvers.noegkk.focus.service.api.common.BaseBTO;
import at.sozvers.noegkk.focus.service.api.common.xml.LocalDateAdapter;
import at.sozvers.noegkk.focus.service.api.zpv.adresse.*;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlAccessorType(XmlAccessType.FIELD)
public class StammdatenBTO implements BaseBTO {

  private AdresseAnschriftBTO  adresse;
  private boolean              andererMitarbeiter;
  private String               anrede;
  private boolean              auskunftsSperre;
  private List<String>         auskunftsSperreGruende;
  @XmlJavaTypeAdapter(value=LocalDateAdapter.class)
  private LocalDate            bestaetigtesSterbeDat;
  private String               bundesland;
  private String               familienname;
  @XmlJavaTypeAdapter(value=LocalDateAdapter.class)
  private LocalDate            geburtsDatum;
  private List<GeldadresseBTO> geldAdressen;
  private String               gemeinde;
  private String               gemeindecode;
  private String               geschlecht;
  private boolean              gesetzlichVertreten;
  private List<String>         gueltigeVSNR = new ArrayList<>();
  private String               hausnummer;
  private KontaktEmailBTO      kontaktEmail;
  private KontaktTelefonBTO    kontaktTelefon;
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
  private List<VollmachtBTO>   vollmachten  = new ArrayList<>();
  private String               vorname;
  private boolean              zustimmungSuen;

  public AdresseAnschriftBTO getAdresse() {
	return adresse;
  }

  public void setAdresse(AdresseAnschriftBTO adresse) {
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

  public List<GeldadresseBTO> getGeldAdressen() {
	if(geldAdressen == null) {
	  geldAdressen = new LinkedList<>();
	}
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

  public List<VollmachtBTO> getVollmachten() {
	return vollmachten;
  }

  public void setVollmachten(List<VollmachtBTO> vollmachten) {
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

  @Override
  public String toString() {
	return "StammdatenBTO [name=" + name + "]";
  }
}
