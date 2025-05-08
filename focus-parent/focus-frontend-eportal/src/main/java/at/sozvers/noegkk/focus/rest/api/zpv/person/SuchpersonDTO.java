package at.sozvers.noegkk.focus.rest.api.zpv.person;

import java.time.LocalDate;
import at.sozvers.noegkk.focus.rest.api.common.BaseDTO;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;

public class SuchpersonDTO implements BaseDTO {

  private String    adresse;
  private String    fachschluessel;
  @JsonDeserialize(using=LocalDateDeserializer.class)
  @JsonSerialize(using=LocalDateSerializer.class)
  private LocalDate geburtsdatum;
  private String    nachname;
  private String    orgName;
  private String    ort;
  private String    plz;
  private String    prid;
  private String    vorname;

  public SuchpersonDTO() {
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
