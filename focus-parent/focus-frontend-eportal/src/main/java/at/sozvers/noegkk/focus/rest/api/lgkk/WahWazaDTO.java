package at.sozvers.noegkk.focus.rest.api.lgkk;

import java.time.LocalDate;
import at.sozvers.noegkk.focus.rest.api.common.BaseDTO;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;

public class WahWazaDTO implements BaseDTO {
  @JsonDeserialize(using=LocalDateDeserializer.class)
  @JsonSerialize(using=LocalDateSerializer.class)
  private LocalDate behDat;
  private String    lgebiet;
  private String    status;

  public LocalDate getBehDat() {
	return behDat;
  }

  public void setBehDat(LocalDate behDat) {
	this.behDat = behDat;
  }

  public String getLgebiet() {
	return lgebiet;
  }

  public void setLgebiet(String lgebiet) {
	this.lgebiet = lgebiet;
  }

  public String getStatus() {
	return status;
  }

  public void setStatus(String status) {
	this.status = status;
  }
}
