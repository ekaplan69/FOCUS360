package at.sozvers.noegkk.focus.rest.api.kontakt;

import java.time.LocalDateTime;
import java.util.List;
import at.sozvers.noegkk.focus.rest.api.common.BaseDTO;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;

public class KundenkontaktDTO implements BaseDTO {

  private boolean       abgabeDurchDritte;
  private Long          abschlussartId;
  private String        anmerkungGenerell;
  private String        anmerkungSonstigerKontaktgrund;
  @JsonDeserialize(using=LocalDateTimeDeserializer.class)
  @JsonSerialize(using=LocalDateTimeSerializer.class)
  private LocalDateTime endeTs;
  private String        externeGewalt;
  private String        fachschluessel;
  private String        fachschluesselArt;
  private Long          kanalId;
  private List<Long>    kontaktDetailDetailIds;
  private List<Long>    kontaktRubrikDetailIds;
  private String        kontaktText;
  private Long          kontaktartId;
  private String        letztAend;
  private String        letztAendName;
  private String        mitarbeitername;
  private Long          orgeinheit;
  @JsonDeserialize(using=LocalDateTimeDeserializer.class)
  @JsonSerialize(using=LocalDateTimeSerializer.class)
  private LocalDateTime startTs;
  private Long          updateCount;

  public Long getAbschlussartId() {
	return abschlussartId;
  }

  public void setAbschlussartId(Long abschlussartId) {
	this.abschlussartId = abschlussartId;
  }

  public String getAnmerkungGenerell() {
	return anmerkungGenerell;
  }

  public void setAnmerkungGenerell(String anmerkungGenerell) {
	this.anmerkungGenerell = anmerkungGenerell;
  }

  public String getAnmerkungSonstigerKontaktgrund() {
	return anmerkungSonstigerKontaktgrund;
  }

  public void setAnmerkungSonstigerKontaktgrund(String anmerkungSonstigerKontaktgrund) {
	this.anmerkungSonstigerKontaktgrund = anmerkungSonstigerKontaktgrund;
  }

  public LocalDateTime getEndeTs() {
	return endeTs;
  }

  public void setEndeTs(LocalDateTime endeTs) {
	this.endeTs = endeTs;
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

  public List<Long> getKontaktDetailDetailIds() {
	return kontaktDetailDetailIds;
  }

  public void setKontaktDetailDetailIds(List<Long> kontaktDetailDetailIds) {
	this.kontaktDetailDetailIds = kontaktDetailDetailIds;
  }

  public List<Long> getKontaktRubrikDetailIds() {
	return kontaktRubrikDetailIds;
  }

  public void setKontaktRubrikDetailIds(List<Long> kontaktRubrikDetailIds) {
	this.kontaktRubrikDetailIds = kontaktRubrikDetailIds;
  }

  public String getKontaktText() {
	return kontaktText;
  }

  public void setKontaktText(String kontaktText) {
	this.kontaktText = kontaktText;
  }

  public Long getKontaktartId() {
	return kontaktartId;
  }

  public void setKontaktartId(Long kontaktartId) {
	this.kontaktartId = kontaktartId;
  }

  public String getLetztAend() {
	return letztAend;
  }

  public void setLetztAend(String letztAend) {
	this.letztAend = letztAend;
  }

  public String getLetztAendName() {
	return letztAendName;
  }

  public void setLetztAendName(String letztAendName) {
	this.letztAendName = letztAendName;
  }

  public String getMitarbeitername() {
	return mitarbeitername;
  }

  public void setMitarbeitername(String mitarbeitername) {
	this.mitarbeitername = mitarbeitername;
  }

  public Long getOrgeinheit() {
	return orgeinheit;
  }

  public void setOrgeinheit(Long orgeinheit) {
	this.orgeinheit = orgeinheit;
  }

  public LocalDateTime getStartTs() {
	return startTs;
  }

  public void setStartTs(LocalDateTime startTs) {
	this.startTs = startTs;
  }

  public Long getUpdateCount() {
	return updateCount;
  }

  public void setUpdateCount(Long updateCount) {
	this.updateCount = updateCount;
  }

  public boolean isAbgabeDurchDritte() {
	return abgabeDurchDritte;
  }

  public void setAbgabeDurchDritte(boolean abgabeDurchDritte) {
	this.abgabeDurchDritte = abgabeDurchDritte;
  }
}
