package at.sozvers.noegkk.focus.rest.api.lgkk;

import java.time.LocalDate;
import at.sozvers.noegkk.focus.rest.api.common.BaseDTO;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;

public class AuMhRgWegDTO implements BaseDTO {
  @JsonDeserialize(using=LocalDateDeserializer.class)
  @JsonSerialize(using=LocalDateSerializer.class)
  private LocalDate anweisungDat;
  @JsonDeserialize(using=LocalDateDeserializer.class)
  @JsonSerialize(using=LocalDateSerializer.class)
  private LocalDate lbisDat;
  private String    lgebiet;
  @JsonDeserialize(using=LocalDateDeserializer.class)
  @JsonSerialize(using=LocalDateSerializer.class)
  private LocalDate lvonDat;
  private String    status;

  public LocalDate getAnweisungDat() {
	return anweisungDat;
  }

  public void setAnweisungDat(LocalDate anweisungDat) {
	this.anweisungDat = anweisungDat;
  }

  public LocalDate getLbisDat() {
	return lbisDat;
  }

  public void setLbisDat(LocalDate lbisDat) {
	this.lbisDat = lbisDat;
  }

  public String getLgebiet() {
	return lgebiet;
  }

  public void setLgebiet(String lgebiet) {
	this.lgebiet = lgebiet;
  }

  public LocalDate getLvonDat() {
	return lvonDat;
  }

  public void setLvonDat(LocalDate lvonDat) {
	this.lvonDat = lvonDat;
  }

  public String getStatus() {
	return status;
  }

  public void setStatus(String status) {
	this.status = status;
  }
}
