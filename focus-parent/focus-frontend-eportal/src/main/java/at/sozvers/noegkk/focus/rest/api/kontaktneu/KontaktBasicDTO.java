package at.sozvers.noegkk.focus.rest.api.kontaktneu;

import java.time.LocalDateTime;
import at.sozvers.noegkk.focus.rest.api.common.BaseDTO;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;

public class KontaktBasicDTO implements BaseDTO {

  private String        abschlussart;
  private String        aufgabengebiet;
  @JsonDeserialize(using=LocalDateTimeDeserializer.class)
  @JsonSerialize(using=LocalDateTimeSerializer.class)
  private LocalDateTime endeTs;
  private Long          id;
  private String        kontaktart;
  private String        mitarbeiterOe;
  private String        scBezeichnung;
  @JsonDeserialize(using=LocalDateTimeDeserializer.class)
  @JsonSerialize(using=LocalDateTimeSerializer.class)
  private LocalDateTime startTs;
  private String        thema;

  public String getAbschlussart() {
	return abschlussart;
  }

  public void setAbschlussart(String abschlussart) {
	this.abschlussart = abschlussart;
  }

  public String getAufgabengebiet() {
	return aufgabengebiet;
  }

  public void setAufgabengebiet(String aufgabengebiet) {
	this.aufgabengebiet = aufgabengebiet;
  }

  public LocalDateTime getEndeTs() {
	return endeTs;
  }

  public void setEndeTs(LocalDateTime endeTs) {
	this.endeTs = endeTs;
  }

  public Long getId() {
	return id;
  }

  public void setId(Long id) {
	this.id = id;
  }

  public String getKontaktart() {
	return kontaktart;
  }

  public void setKontaktart(String kontaktart) {
	this.kontaktart = kontaktart;
  }

  public String getMitarbeiterOe() {
	return mitarbeiterOe;
  }

  public void setMitarbeiterOe(String mitarbeiterOe) {
	this.mitarbeiterOe = mitarbeiterOe;
  }

  public String getScBezeichnung() {
	return scBezeichnung;
  }

  public void setScBezeichnung(String scBezeichnung) {
	this.scBezeichnung = scBezeichnung;
  }

  public LocalDateTime getStartTs() {
	return startTs;
  }

  public void setStartTs(LocalDateTime startTs) {
	this.startTs = startTs;
  }

  public String getThema() {
	return thema;
  }

  public void setThema(String thema) {
	this.thema = thema;
  }
}
