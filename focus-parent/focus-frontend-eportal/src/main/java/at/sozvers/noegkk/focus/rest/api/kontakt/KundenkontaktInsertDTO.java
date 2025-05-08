package at.sozvers.noegkk.focus.rest.api.kontakt;

import java.time.LocalDateTime;
import java.util.List;
import at.sozvers.noegkk.focus.rest.api.common.BaseDTO;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class KundenkontaktInsertDTO implements BaseDTO {

  private boolean       abgabeDurchDritte;
  @Size(max=4000)
  private String        anmerkungGenerell;
  @Size(max=100)
  private String        anmerkungKontaktart;
  @Size(max=4000)
  private String        anmerkungSonstigerKontaktgrund;
  @Size(max=4000)
  private String        externeGewalt;
  @NotNull
  @Size(min=1)
  private String        fachschluessel;
  @NotNull
  @Size(min=1)
  private String        fachschluesselArt;
  private Long          kanalId;
  private Long          kontaktId; //kein @NotNull, da diese Objekt für save und update verwendet wird!
  private Long          kontaktartId;
  private Long          kontaktdetailId;
  private String        kontaktpunktBereOrg;
  private Long          kontaktpunktId;
  @NotNull
  @Size(min=1)
  private String        mitarbeiterkennung;
  @NotNull
  @Size(min=1)
  private String        mitarbeitername;
  private String        name;
  private String        ort;
  private String        postleitzahl;
  private String        staatIsoA3;
  private List<Long>    unterDetailIds;
  private Long          updatecount;
  @JsonDeserialize(using=LocalDateTimeDeserializer.class)
  @JsonSerialize(using=LocalDateTimeSerializer.class)
  private LocalDateTime zeitpunktEnde;
  @NotNull
  @JsonDeserialize(using=LocalDateTimeDeserializer.class)
  @JsonSerialize(using=LocalDateTimeSerializer.class)
  private LocalDateTime zeitpunktStart;

  public String getAnmerkungGenerell() {
	return anmerkungGenerell;
  }

  public void setAnmerkungGenerell(String anmerkungGenerell) {
	this.anmerkungGenerell = anmerkungGenerell;
  }

  public String getAnmerkungKontaktart() {
	return anmerkungKontaktart;
  }

  public void setAnmerkungKontaktart(String anmerkungKontaktart) {
	this.anmerkungKontaktart = anmerkungKontaktart;
  }

  public String getAnmerkungSonstigerKontaktgrund() {
	return anmerkungSonstigerKontaktgrund;
  }

  public void setAnmerkungSonstigerKontaktgrund(String anmerkungSonstigerKontaktgrund) {
	this.anmerkungSonstigerKontaktgrund = anmerkungSonstigerKontaktgrund;
  }

  public String getExterneGewalt() {
	return externeGewalt;
  }

  public void setExterneGewalt(String externeGewalt) {
	this.externeGewalt = externeGewalt;
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

  public Long getKontaktId() {
	return kontaktId;
  }

  public void setKontaktId(Long kontaktId) {
	this.kontaktId = kontaktId;
  }

  public Long getKontaktartId() {
	return kontaktartId;
  }

  public void setKontaktartId(Long kontaktartId) {
	this.kontaktartId = kontaktartId;
  }

  public Long getKontaktdetailId() {
	return kontaktdetailId;
  }

  public void setKontaktdetailId(Long kontaktdetailId) {
	this.kontaktdetailId = kontaktdetailId;
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

  public String getStaatIsoA3() {
	return staatIsoA3;
  }

  public void setStaatIsoA3(String staatIsoA3) {
	this.staatIsoA3 = staatIsoA3;
  }

  public List<Long> getUnterDetailIds() {
	return unterDetailIds;
  }

  public void setUnterDetailIds(List<Long> unterDetailIds) {
	this.unterDetailIds = unterDetailIds;
  }

  public Long getUpdatecount() {
	return updatecount;
  }

  public void setUpdatecount(Long updatecount) {
	this.updatecount = updatecount;
  }

  public LocalDateTime getZeitpunktEnde() {
	return zeitpunktEnde;
  }

  public void setZeitpunktEnde(LocalDateTime zeitpunktEnde) {
	this.zeitpunktEnde = zeitpunktEnde;
  }

  public LocalDateTime getZeitpunktStart() {
	return zeitpunktStart;
  }

  public void setZeitpunktStart(LocalDateTime zeitpunktStart) {
	this.zeitpunktStart = zeitpunktStart;
  }

  public boolean isAbgabeDurchDritte() {
	return abgabeDurchDritte;
  }

  public void setAbgabeDurchDritte(boolean abgabeDurchDritte) {
	this.abgabeDurchDritte = abgabeDurchDritte;
  }
}
