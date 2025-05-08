package at.sozvers.noegkk.focus.rest.api.lgkk;

import java.time.LocalDate;
import at.sozvers.noegkk.focus.rest.api.common.BaseDTO;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;

public class DokumentDTO implements BaseDTO {

  private String    dokumentklasse;
  private String    dokumentreferenz;
  @JsonDeserialize(using=LocalDateDeserializer.class)
  @JsonSerialize(using=LocalDateSerializer.class)
  private LocalDate einlangdatum;
  private String    kategorie;
  private String    thema;
  private String    versendungsart;

  public String getDokumentklasse() {
	return dokumentklasse;
  }

  public void setDokumentklasse(String dokumentklasse) {
	this.dokumentklasse = dokumentklasse;
  }

  public String getDokumentreferenz() {
	return dokumentreferenz;
  }

  public void setDokumentreferenz(String dokumentreferenz) {
	this.dokumentreferenz = dokumentreferenz;
  }

  public LocalDate getEinlangdatum() {
	return einlangdatum;
  }

  public void setEinlangdatum(LocalDate einlangdatum) {
	this.einlangdatum = einlangdatum;
  }

  public String getKategorie() {
	return kategorie;
  }

  public void setKategorie(String kategorie) {
	this.kategorie = kategorie;
  }

  public String getThema() {
	return thema;
  }

  public void setThema(String thema) {
	this.thema = thema;
  }

  public String getVersendungsart() {
	return versendungsart;
  }

  public void setVersendungsart(String versendungsart) {
	this.versendungsart = versendungsart;
  }
}
