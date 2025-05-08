package at.sozvers.noegkk.focus.service.api.beschwerde;

import java.time.LocalDateTime;
import java.util.List;
import at.sozvers.noegkk.focus.service.api.common.BaseBTO;

public class BeschwerdeUpdateBTO implements BaseBTO {

  private String        beschreibung;
  private Long          beschwerdeId;
  private List<Long>    beschwerdegruendeIds;
  private String        beschwerdegrundAnmerkung;
  private String        email;
  private Long          fachbereichDetailId;
  private String        fachschluessel;
  private String        fachschluesselArt;
  private Long          kanalId;
  private String        kontaktpunktBereOrg;
  private Long          kontaktpunktId;
  private String        massnahmen;
  private Long          meldendeStelleId;
  private String        mitarbeiterkennung;
  private String        mitarbeitername;
  private int           statusId;
  private String        telefon;
  private Long          updatecount;
  private LocalDateTime zeitpunkt;

  public String getBeschreibung() {
	return beschreibung;
  }

  public void setBeschreibung(String beschreibung) {
	this.beschreibung = beschreibung;
  }

  public Long getBeschwerdeId() {
	return beschwerdeId;
  }

  public void setBeschwerdeId(Long beschwerdeId) {
	this.beschwerdeId = beschwerdeId;
  }

  public List<Long> getBeschwerdegruendeIds() {
	return beschwerdegruendeIds;
  }

  public void setBeschwerdegruendeIds(List<Long> beschwerdegruendeIds) {
	this.beschwerdegruendeIds = beschwerdegruendeIds;
  }

  public String getBeschwerdegrundAnmerkung() {
	return beschwerdegrundAnmerkung;
  }

  public void setBeschwerdegrundAnmerkung(String beschwerdegrundAnmerkung) {
	this.beschwerdegrundAnmerkung = beschwerdegrundAnmerkung;
  }

  public String getEmail() {
	return email;
  }

  public void setEmail(String email) {
	this.email = email;
  }

  public Long getFachbereichDetailId() {
	return fachbereichDetailId;
  }

  public void setFachbereichDetailId(Long fachbereichDetailId) {
	this.fachbereichDetailId = fachbereichDetailId;
  }

  public String getFachschluessel() {
	return fachschluessel;
  }

  public void setFachschluessel(String fachschluessel) {
	this.fachschluessel = fachschluessel;
  }

  public String getFachschluesselArt() {
	return fachschluesselArt;
  }

  public void setFachschluesselArt(String fachschluesselArt) {
	this.fachschluesselArt = fachschluesselArt;
  }

  public Long getKanalId() {
	return kanalId;
  }

  public void setKanalId(Long kanalId) {
	this.kanalId = kanalId;
  }

  public String getKontaktpunktBereOrg() {
	return kontaktpunktBereOrg;
  }

  public void setKontaktpunktBereOrg(String kontaktpunktBereOrg) {
	this.kontaktpunktBereOrg = kontaktpunktBereOrg;
  }

  public Long getKontaktpunktId() {
	return kontaktpunktId;
  }

  public void setKontaktpunktId(Long kontaktpunktId) {
	this.kontaktpunktId = kontaktpunktId;
  }

  public String getMassnahmen() {
	return massnahmen;
  }

  public void setMassnahmen(String massnahmen) {
	this.massnahmen = massnahmen;
  }

  public Long getMeldendeStelleId() {
	return meldendeStelleId;
  }

  public void setMeldendeStelleId(Long meldendeStelleId) {
	this.meldendeStelleId = meldendeStelleId;
  }

  public String getMitarbeiterkennung() {
	return mitarbeiterkennung;
  }

  public void setMitarbeiterkennung(String mitarbeiterkennung) {
	this.mitarbeiterkennung = mitarbeiterkennung;
  }

  public String getMitarbeitername() {
	return mitarbeitername;
  }

  public void setMitarbeitername(String mitarbeitername) {
	this.mitarbeitername = mitarbeitername;
  }

  public int getStatusId() {
	return statusId;
  }

  public void setStatusId(int statusId) {
	this.statusId = statusId;
  }

  public String getTelefon() {
	return telefon;
  }

  public void setTelefon(String telefon) {
	this.telefon = telefon;
  }

  public Long getUpdatecount() {
	return updatecount;
  }

  public void setUpdatecount(Long updatecount) {
	this.updatecount = updatecount;
  }

  public LocalDateTime getZeitpunkt() {
	return zeitpunkt;
  }

  public void setZeitpunkt(LocalDateTime zeitpunkt) {
	this.zeitpunkt = zeitpunkt;
  }
}
