package at.sozvers.noegkk.focus.rest.api.lgkk;

import java.time.LocalDate;
import at.sozvers.noegkk.focus.rest.api.common.BaseDTO;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;

public class UnfallerhDTO implements BaseDTO {
  @JsonDeserialize(using=LocalDateDeserializer.class)
  @JsonSerialize(using=LocalDateSerializer.class)
  private LocalDate eingelangtDat;
  @JsonDeserialize(using=LocalDateDeserializer.class)
  @JsonSerialize(using=LocalDateSerializer.class)
  private LocalDate erstellDat;
  @JsonDeserialize(using=LocalDateDeserializer.class)
  @JsonSerialize(using=LocalDateSerializer.class)
  private LocalDate urgenz1Dat;
  @JsonDeserialize(using=LocalDateDeserializer.class)
  @JsonSerialize(using=LocalDateSerializer.class)
  private LocalDate urgenz2Dat;

  public LocalDate getEingelangtDat() {
	return eingelangtDat;
  }

  public void setEingelangtDat(LocalDate eingelangtDat) {
	this.eingelangtDat = eingelangtDat;
  }

  public LocalDate getErstellDat() {
	return erstellDat;
  }

  public void setErstellDat(LocalDate erstellDat) {
	this.erstellDat = erstellDat;
  }

  public LocalDate getUrgenz1Dat() {
	return urgenz1Dat;
  }

  public void setUrgenz1Dat(LocalDate urgenz1Dat) {
	this.urgenz1Dat = urgenz1Dat;
  }

  public LocalDate getUrgenz2Dat() {
	return urgenz2Dat;
  }

  public void setUrgenz2Dat(LocalDate urgenz2Dat) {
	this.urgenz2Dat = urgenz2Dat;
  }
}
