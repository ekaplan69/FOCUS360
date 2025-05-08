package at.sozvers.noegkk.focus.rest.api.lgkk;

import java.time.LocalDate;
import at.sozvers.noegkk.focus.rest.api.common.BaseDTO;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;

public class KhDTO implements BaseDTO {
  private String    aufnahmeArt;
  @JsonDeserialize(using=LocalDateDeserializer.class)
  @JsonSerialize(using=LocalDateSerializer.class)
  private LocalDate lbisDat;
  private String    leName;
  @JsonDeserialize(using=LocalDateDeserializer.class)
  @JsonSerialize(using=LocalDateSerializer.class)
  private LocalDate lvonDat;
  private String    vpnr;

  public String getAufnahmeArt() {
	return aufnahmeArt;
  }

  public void setAufnahmeArt(String aufnahmeArt) {
	this.aufnahmeArt = aufnahmeArt;
  }

  public LocalDate getLbisDat() {
	return lbisDat;
  }

  public void setLbisDat(LocalDate lbisDat) {
	this.lbisDat = lbisDat;
  }

  public String getLeName() {
	return leName;
  }

  public void setLeName(String leName) {
	this.leName = leName;
  }

  public LocalDate getLvonDat() {
	return lvonDat;
  }

  public void setLvonDat(LocalDate lvonDat) {
	this.lvonDat = lvonDat;
  }

  public String getVpnr() {
	return vpnr;
  }

  public void setVpnr(String vpnr) {
	this.vpnr = vpnr;
  }
}
