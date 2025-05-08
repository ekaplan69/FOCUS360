package at.sozvers.noegkk.focus.rest.api.ecard;

import java.time.LocalDate;
import at.sozvers.noegkk.focus.rest.api.common.BaseDTO;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;

public class ECarddatenDTO implements BaseDTO {

  @JsonDeserialize(using=LocalDateDeserializer.class)
  @JsonSerialize(using=LocalDateSerializer.class)
  private LocalDate ausstellungsDatum;
  @JsonDeserialize(using=LocalDateDeserializer.class)
  @JsonSerialize(using=LocalDateSerializer.class)
  private LocalDate endeDatum;
  private String    laufnummer;
  @JsonDeserialize(using=LocalDateDeserializer.class)
  @JsonSerialize(using=LocalDateSerializer.class)
  private LocalDate letzteKonsultation;

  public LocalDate getAusstellungsDatum() {
	return ausstellungsDatum;
  }

  public void setAusstellungsDatum(LocalDate ausstellungsDatum) {
	this.ausstellungsDatum = ausstellungsDatum;
  }

  public LocalDate getEndeDatum() {return endeDatum;}

  public void setEndeDatum(LocalDate endeDatum) {this.endeDatum = endeDatum;}

  public String getLaufnummer() {
	return laufnummer;
  }

  public void setLaufnummer(String laufnummer) {
	this.laufnummer = laufnummer;
  }

  public LocalDate getLetzteKonsultation() {
	return letzteKonsultation;
  }

  public void setLetzteKonsultation(LocalDate letzteKonsultation) {
	this.letzteKonsultation = letzteKonsultation;
  }
}
