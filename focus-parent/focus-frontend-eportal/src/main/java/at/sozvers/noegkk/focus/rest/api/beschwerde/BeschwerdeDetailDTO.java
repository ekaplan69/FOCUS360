package at.sozvers.noegkk.focus.rest.api.beschwerde;

import java.time.LocalDateTime;
import java.util.List;
import at.sozvers.noegkk.focus.rest.api.common.BaseDTO;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;

public class BeschwerdeDetailDTO implements BaseDTO {

  private String        beschreibung;
  private List<Long>    beschwerdegruendeIds;
  private String        beschwerdegrundAnmerkung;
  private String        email;
  private Long          fachbereichDetailId;
  private Long          kanalId;
  private Long          kontaktpunktId;
  private String        massnahmen;
  private Long          meldendeStelleId;
  private String        mitarbeitername;
  private int           statusId;
  private Boolean       storno;
  private String        telefon;
  private Long          updatecount;
  @JsonDeserialize(using=LocalDateTimeDeserializer.class)
  @JsonSerialize(using=LocalDateTimeSerializer.class)
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

  public Long getKanalId() {
	return kanalId;
  }

  public void setKanalId(Long kanalId) {
	this.kanalId = kanalId;
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

  public int getStatusId() {
	return statusId;
  }

  public void setStatusId(int statusId) {
	this.statusId = statusId;
  }

  public Boolean getStorno() {
	return storno;
  }

  public void setStorno(Boolean storno) {
	this.storno = storno;
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
