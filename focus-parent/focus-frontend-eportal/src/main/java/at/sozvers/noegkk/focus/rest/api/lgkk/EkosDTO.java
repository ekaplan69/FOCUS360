package at.sozvers.noegkk.focus.rest.api.lgkk;

import java.time.LocalDate;
import at.sozvers.noegkk.focus.rest.api.common.BaseDTO;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;

public class EkosDTO implements BaseDTO {
  private String    antragStatus;
  @JsonDeserialize(using=LocalDateDeserializer.class)
  @JsonSerialize(using=LocalDateSerializer.class)
  private LocalDate eingelangtDat;

  public String getAntragStatus() {
	return antragStatus;
  }

  public void setAntragStatus(String antragStatus) {
	this.antragStatus = antragStatus;
  }

  public LocalDate getEingelangtDat() {
	return eingelangtDat;
  }

  public void setEingelangtDat(LocalDate eingelangtDat) {
	this.eingelangtDat = eingelangtDat;
  }
}
