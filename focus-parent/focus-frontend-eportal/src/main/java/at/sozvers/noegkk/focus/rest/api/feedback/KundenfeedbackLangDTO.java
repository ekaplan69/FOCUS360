package at.sozvers.noegkk.focus.rest.api.feedback;

import java.time.LocalDateTime;
import at.sozvers.noegkk.focus.rest.api.common.BaseDTO;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;

public class KundenfeedbackLangDTO implements BaseDTO {
  protected String        name;
  protected String        ort;
  protected String        plz;
  protected String        staatISOA3;
  private   String        beschreibung;
  private   String        email;
  @JsonDeserialize(using=LocalDateTimeDeserializer.class)
  @JsonSerialize(using=LocalDateTimeSerializer.class)
  private   LocalDateTime erstellTs;
  private   String        fachschluessel;
  private   String        faschluesselArtKurz;
  private   Long          feedbackArt;
  private   Long          feedbackgrundId;
  private   Long          id;
  private   Long          kontaktartId;
  private   String        mitarbeiterOE;
  private   Long          statusId;
  private   String        telNr;
  private   Long          themaId;
  private   Long          unterkategorieId;
  private   Long          updatecount;
  private   String        verbesserungspotential;

  public String getBeschreibung() {
	return beschreibung;
  }

  public void setBeschreibung(String beschreibung) {
	this.beschreibung = beschreibung;
  }

  public String getEmail() {
	return email;
  }

  public void setEmail(String email) {
	this.email = email;
  }

  public LocalDateTime getErstellTs() {
	return erstellTs;
  }

  public void setErstellTs(LocalDateTime erstellTs) {
	this.erstellTs = erstellTs;
  }

  public String getFachschluessel() {
	return fachschluessel;
  }

  public void setFachschluessel(String fachschluessel) {
	this.fachschluessel = fachschluessel;
  }

  public String getFaschluesselArtKurz() {
	return faschluesselArtKurz;
  }

  public void setFaschluesselArtKurz(String faschluesselArtKurz) {
	this.faschluesselArtKurz = faschluesselArtKurz;
  }

  public Long getFeedbackArt() {
	return feedbackArt;
  }

  public void setFeedbackArt(Long feedbackArt) {
	this.feedbackArt = feedbackArt;
  }

  public Long getFeedbackgrundId() {
	return feedbackgrundId;
  }

  public void setFeedbackgrundId(Long feedbackgrundId) {
	this.feedbackgrundId = feedbackgrundId;
  }

  public Long getId() {
	return id;
  }

  public void setId(Long id) {
	this.id = id;
  }

  public Long getKontaktartId() {
	return kontaktartId;
  }

  public void setKontaktartId(Long kontaktartId) {
	this.kontaktartId = kontaktartId;
  }

  public String getMitarbeiterOE() {
	return mitarbeiterOE;
  }

  public void setMitarbeiterOE(String mitarbeiterOE) {
	this.mitarbeiterOE = mitarbeiterOE;
  }

  public String getName() {
	return name;
  }

  public void setName(String name) {
	this.name = name;
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

  public String getStaatISOA3() {
	return staatISOA3;
  }

  public void setStaatISOA3(String staatISOA3) {
	this.staatISOA3 = staatISOA3;
  }

  public Long getStatusId() {
	return statusId;
  }

  public void setStatusId(Long statusId) {
	this.statusId = statusId;
  }

  public String getTelNr() {
	return telNr;
  }

  public void setTelNr(String telNr) {
	this.telNr = telNr;
  }

  public Long getThemaId() {
	return themaId;
  }

  public void setThemaId(Long themaId) {
	this.themaId = themaId;
  }

  public Long getUnterkategorieId() {
	return unterkategorieId;
  }

  public void setUnterkategorieId(Long unterkategorieId) {
	this.unterkategorieId = unterkategorieId;
  }

  public Long getUpdatecount() {
	return updatecount;
  }

  public void setUpdatecount(Long updatecount) {
	this.updatecount = updatecount;
  }

  public String getVerbesserungspotential() {
	return verbesserungspotential;
  }

  public void setVerbesserungspotential(String verbesserungspotential) {
	this.verbesserungspotential = verbesserungspotential;
  }
}
