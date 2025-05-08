package at.sozvers.noegkk.focus.rest.api.kva.abzsuc;

import java.time.LocalDate;
import at.sozvers.noegkk.focus.rest.api.common.BaseDTO;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;

public class VersicherterDTO implements BaseDTO {

  private boolean   anspruchspruefung = true;
  @JsonDeserialize(using=LocalDateDeserializer.class)
  @JsonSerialize(using=LocalDateSerializer.class)
  private LocalDate gueltigBis;
  @JsonDeserialize(using=LocalDateDeserializer.class)
  @JsonSerialize(using=LocalDateSerializer.class)
  private LocalDate gueltigVon;
  private String    meldendeStelle;
  private String    nachname;
  private String    typ;
  private String    versicherungsnummer;
  private String    vorname;

  public LocalDate getGueltigBis() {
	return gueltigBis;
  }

  public void setGueltigBis(LocalDate gueltigBis) {
	this.gueltigBis = gueltigBis;
  }

  public LocalDate getGueltigVon() {
	return gueltigVon;
  }

  public void setGueltigVon(LocalDate gueltigVon) {
	this.gueltigVon = gueltigVon;
  }

  public String getMeldendeStelle() {
	return meldendeStelle;
  }

  public void setMeldendeStelle(String meldendeStelle) {
	this.meldendeStelle = meldendeStelle;
  }

  public String getNachname() {
	return nachname;
  }

  public void setNachname(String nachname) {
	this.nachname = nachname;
  }

  public String getTyp() {
	return typ;
  }

  public void setTyp(String typ) {
	this.typ = typ;
  }

  public String getVersicherungsnummer() {
	return versicherungsnummer;
  }

  public void setVersicherungsnummer(String versicherungsnummer) {
	this.versicherungsnummer = versicherungsnummer;
  }

  public String getVorname() {
	return vorname;
  }

  public void setVorname(String vorname) {
	this.vorname = vorname;
  }

  public boolean isAnspruchspruefung() {
	return anspruchspruefung;
  }

  public void setAnspruchspruefung(boolean anspruchspruefung) {
	this.anspruchspruefung = anspruchspruefung;
  }
}
