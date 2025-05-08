package at.sozvers.noegkk.focus.rest.api.beschwerde;

import java.time.LocalDateTime;
import java.util.List;
import at.sozvers.noegkk.focus.rest.api.common.BaseDTO;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class BeschwerdeUpdateDTO implements BaseDTO {

  @Size(max=4000)
  private String        beschreibung;
  private Long          beschwerdeId;
  @NotNull
  @Size(min=1)
  private List<Long>    beschwerdegruendeIds;
  private String        beschwerdegrundAnmerkung;
  @Size(max=50)
  private String        email;
  @NotNull()
  private Long          fachbereichDetailId;
  @NotNull()
  @Size(min=1)
  private String        fachschluessel;
  @NotNull()
  @Size(min=1)
  private String        fachschluesselArt;
  @NotNull()
  private Long          kanalId;
  private String        kontaktpunktBereOrg;
  private Long          kontaktpunktId;
  @Size(max=4000)
  private String        massnahmen;
  private Long          meldendeStelleId;
  @NotNull()
  @Size(min=1)
  private String        mitarbeitername;
  @NotNull()
  private Integer       statusId;
  @Size(max=20)
  private String        telefon;
  @NotNull()
  private Long          updatecount;
  @NotNull()
  @JsonDeserialize(using=LocalDateTimeDeserializer.class)
  @JsonSerialize(using=LocalDateTimeSerializer.class)
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

  public String getMitarbeitername() {
	return mitarbeitername;
  }

  public void setMitarbeitername(String mitarbeitername) {
	this.mitarbeitername = mitarbeitername;
  }

  public Integer getStatusId() {
	return statusId;
  }

  public void setStatusId(Integer statusId) {
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
