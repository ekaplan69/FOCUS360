package at.sozvers.noegkk.focus.rest.api.zpv.dienstgeber;

import java.time.LocalDate;
import at.sozvers.noegkk.focus.rest.api.common.BaseDTO;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;

public class FremdIdentifikationDTO implements BaseDTO {

  public static final String    FIRMENBUCHNR = "FIRNR";
  public static final String    KUR          = "KUR";
  public static final String    UID          = "UID";
  private             String    fachschluessel;
  private             String    fachschluesselArt;
  private             String    fachschluesselArtKurz;
  @JsonDeserialize(using=LocalDateDeserializer.class)
  @JsonSerialize(using=LocalDateSerializer.class)
  private             LocalDate gueltigBis;
  @JsonDeserialize(using=LocalDateDeserializer.class)
  @JsonSerialize(using=LocalDateSerializer.class)
  private             LocalDate gueltigVon;

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

  public String getFachschluesselArtKurz() {
	return fachschluesselArtKurz;
  }

  public void setFachschluesselArtKurz(String fachschluesselArtKurz) {
	this.fachschluesselArtKurz = fachschluesselArtKurz;
  }

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
}
