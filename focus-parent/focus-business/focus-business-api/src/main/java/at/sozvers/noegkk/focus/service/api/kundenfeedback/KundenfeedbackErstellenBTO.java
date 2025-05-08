package at.sozvers.noegkk.focus.service.api.kundenfeedback;

import at.sozvers.noegkk.focus.service.api.common.BaseBTO;

public class KundenfeedbackErstellenBTO implements BaseBTO {
  private String beschreibung;
  private String email;
  private String fachschluessel;
  private String fachschluesselArtKurz;
  private Long   feedbackArt;
  private Long   feedbackgrundId;
  private Long   kontaktartId;
  private String letztaend;
  private Long   meldendeStelle;
  private String mitarbeiterOe;
  private String mitarbeitername;
  private String name;
  private String telNr;
  private Long   themaId;
  private Long   unterkategorieId;
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

  public String getFachschluessel() {
	return fachschluessel;
  }

  public void setFachschluessel(String fachschluessel) {
	this.fachschluessel = fachschluessel;
  }

  public String getFachschluesselArtKurz() {
	return fachschluesselArtKurz;
  }

  public void setFachschluesselArtKurz(String fachschluesselArtKurz) {
	this.fachschluesselArtKurz = fachschluesselArtKurz;
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

  public Long getMeldendeStelle() {
	return meldendeStelle;
  }

  public void setMeldendeStelle(Long meldendeStelle) {
	this.meldendeStelle = meldendeStelle;
  }

  public String getMitarbeiterOe() {
	return mitarbeiterOe;
  }

  public void setMitarbeiterOe(String mitarbeiterOe) {
	this.mitarbeiterOe = mitarbeiterOe;
  }

  public String getMitarbeitername() {
	return mitarbeitername;
  }

  public void setMitarbeitername(String mitarbeitername) {
	this.mitarbeitername = mitarbeitername;
  }

  public String getName() {
	return name;
  }

  public void setName(String name) {
	this.name = name;
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

  public String getVerbesserungspotential() {
	return verbesserungspotential;
  }

  public void setVerbesserungspotential(String verbesserungspotential) {
	this.verbesserungspotential = verbesserungspotential;
  }
}
