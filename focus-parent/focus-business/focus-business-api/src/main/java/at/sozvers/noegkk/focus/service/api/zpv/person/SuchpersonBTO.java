package at.sozvers.noegkk.focus.service.api.zpv.person;

import java.time.LocalDate;
import at.sozvers.noegkk.focus.service.api.common.BaseBTO;
import at.sozvers.noegkk.focus.service.api.common.xml.LocalDateAdapter;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlAccessorType(XmlAccessType.FIELD)
public class SuchpersonBTO implements BaseBTO {

  private String    adresse;
  private String    fachschluessel;
  @XmlJavaTypeAdapter(value=LocalDateAdapter.class)
  private LocalDate geburtsdatum;
  private String    nachname;
  private String    orgName;
  private String    ort;
  private String    plz;
  private String    prid;
  private String    vorname;

  public SuchpersonBTO() {
	//Default Constructor
  }

  public String getAdresse() {
	return adresse;
  }

  public void setAdresse(String adresse) {
	this.adresse = adresse;
  }

  public String getFachschluessel() {
	return fachschluessel;
  }

  public void setFachschluessel(String fachschluessel) {
	this.fachschluessel = fachschluessel;
  }

  public LocalDate getGeburtsdatum() {
	return geburtsdatum;
  }

  public void setGeburtsdatum(LocalDate geburtsdatum) {
	this.geburtsdatum = geburtsdatum;
  }

  public String getNachname() {
	return nachname;
  }

  public void setNachname(String nachname) {
	this.nachname = nachname;
  }

  public String getOrgName() {
	return orgName;
  }

  public void setOrgName(String orgName) {
	this.orgName = orgName;
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

  public String getPrid() {
	return prid;
  }

  public void setPrid(String prid) {
	this.prid = prid;
  }

  public String getVorname() {
	return vorname;
  }

  public void setVorname(String vorname) {
	this.vorname = vorname;
  }
}
