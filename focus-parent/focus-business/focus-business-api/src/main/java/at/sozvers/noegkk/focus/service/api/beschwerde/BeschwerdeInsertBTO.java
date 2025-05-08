package at.sozvers.noegkk.focus.service.api.beschwerde;

import java.time.LocalDateTime;
import java.util.List;
import at.sozvers.noegkk.focus.service.api.common.BaseBTO;

public class BeschwerdeInsertBTO implements BaseBTO {

  private String        beschreibung;
  private List<Long>    beschwerdegruendeIds;
  private String        beschwerdegrundAnmerkung;
  private String        bundesland;
  private String        email;
  private Object[]      fachbereich;
  private Object[]      fachbereichDetail;
  private String        fachschluessel;
  private String        fachschluesselArt;
  private String        hausnummer;
  private Long          kanalId;
  private String        kontaktpunktBereOrg;
  private Long          kontaktpunktId;
  private String        massnahmen;
  private Long          meldendeStelleId;
  private String        mitarbeiterkennung;
  private String        mitarbeitername;
  private String        name;
  private String        ort;
  private String        postleitzahl;
  private String        staat;
  private String        staatIsoA3;
  private int           statusId;
  private String        strasse;
  private String        telefon;
  private Object[]      thema;
  private Long          updatecount;
  private LocalDateTime zeitpunkt;

  public String getBeschreibung() {
	return beschreibung;
  }

  public void setBeschreibung(String beschreibung) {
	this.beschreibung = beschreibung;
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

  public String getBundesland() {
	return bundesland;
  }

  public void setBundesland(String bundesland) {
	this.bundesland = bundesland;
  }

  public String getEmail() {
	return email;
  }

  public void setEmail(String email) {
	this.email = email;
  }

  public Object[] getFachbereich() {
	return fachbereich;
  }

  public void setFachbereich(Object[] fachbereich) {
	this.fachbereich = fachbereich;
  }

  public Object[] getFachbereichDetail() {
	return fachbereichDetail;
  }

  public void setFachbereichDetail(Object[] fachbereichDetail) {
	this.fachbereichDetail = fachbereichDetail;
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

  public String getHausnummer() {
	return hausnummer;
  }

  public void setHausnummer(String hausnummer) {
	this.hausnummer = hausnummer;
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

  public String getPostleitzahl() {
	return postleitzahl;
  }

  public void setPostleitzahl(String postleitzahl) {
	this.postleitzahl = postleitzahl;
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

  public int getStatusId() {
	return statusId;
  }

  public void setStatusId(int statusId) {
	this.statusId = statusId;
  }

  public String getStrasse() {
	return strasse;
  }

  public void setStrasse(String strasse) {
	this.strasse = strasse;
  }

  public String getTelefon() {
	return telefon;
  }

  public void setTelefon(String telefon) {
	this.telefon = telefon;
  }

  public Object[] getThema() {
	return thema;
  }

  public void setThema(Object[] thema) {
	this.thema = thema;
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
