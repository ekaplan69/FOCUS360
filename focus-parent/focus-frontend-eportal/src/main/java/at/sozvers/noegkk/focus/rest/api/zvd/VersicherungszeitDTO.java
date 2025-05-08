package at.sozvers.noegkk.focus.rest.api.zvd;

import java.time.LocalDate;
import at.sozvers.noegkk.focus.rest.api.common.BaseDTO;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;

public class VersicherungszeitDTO implements BaseDTO {

  @JsonDeserialize(using=LocalDateDeserializer.class)
  @JsonSerialize(using=LocalDateSerializer.class)
  protected LocalDate beginnDatum;
  protected String    dienstgebername;
  @JsonDeserialize(using=LocalDateDeserializer.class)
  @JsonSerialize(using=LocalDateSerializer.class)
  protected LocalDate endeDatum;
  protected String    meldendeStelle;
  protected String    qualifikation;

  public LocalDate getBeginnDatum() {
	return beginnDatum;
  }

  public void setBeginnDatum(LocalDate beginnDatum) {
	this.beginnDatum = beginnDatum;
  }

  public String getDienstgebername() {
	return dienstgebername;
  }

  public void setDienstgebername(String dienstgebername) {
	this.dienstgebername = dienstgebername;
  }

  public LocalDate getEndeDatum() {
	return endeDatum;
  }

  public void setEndeDatum(LocalDate endeDatum) {
	this.endeDatum = endeDatum;
  }

  public String getMeldendeStelle() {
	return meldendeStelle;
  }

  public void setMeldendeStelle(String meldendeStelle) {
	this.meldendeStelle = meldendeStelle;
  }

  public String getQualifikation() {
	return qualifikation;
  }

  public void setQualifikation(String qualifikation) {
	this.qualifikation = qualifikation;
  }
}
