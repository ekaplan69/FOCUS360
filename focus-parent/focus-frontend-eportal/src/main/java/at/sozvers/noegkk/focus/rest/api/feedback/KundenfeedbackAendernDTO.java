package at.sozvers.noegkk.focus.rest.api.feedback;

import at.sozvers.noegkk.focus.rest.api.common.BaseDTO;

public class KundenfeedbackAendernDTO implements BaseDTO {
  private String beschreibung;
  private String email;
  private Long   feedbackArt;
  private Long   feedbackgrundId;
  private Long   id;
  private Long   kontaktartId;
  private String letztaend;
  private String name;
  private String ort;
  private String plz;
  private String staatISOA3;
  private Long   status;
  private String telNr;
  private Long   themaId;
  private Long   unterkategorieId;
  private Long   updateCount;
  private String verbesserungspotential;

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

  public String getLetztaend() {
	return letztaend;
  }

  public void setLetztaend(String letztaend) {
	this.letztaend = letztaend;
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

  public Long getStatus() {
	return status;
  }

  public void setStatus(Long status) {
	this.status = status;
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

  public Long getUpdateCount() {
	return updateCount;
  }

  public void setUpdateCount(Long updateCount) {
	this.updateCount = updateCount;
  }

  public String getVerbesserungspotential() {
	return verbesserungspotential;
  }

  public void setVerbesserungspotential(String verbesserungspotential) {
	this.verbesserungspotential = verbesserungspotential;
  }
}
