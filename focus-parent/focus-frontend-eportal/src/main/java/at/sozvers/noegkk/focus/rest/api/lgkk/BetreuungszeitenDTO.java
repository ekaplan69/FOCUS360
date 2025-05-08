package at.sozvers.noegkk.focus.rest.api.lgkk;

import java.time.LocalDate;
import at.sozvers.noegkk.focus.rest.api.common.BaseDTO;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;

public class BetreuungszeitenDTO implements BaseDTO {
  @JsonDeserialize(using=LocalDateDeserializer.class)
  @JsonSerialize(using=LocalDateSerializer.class)
  private LocalDate betreuungBis;
  @JsonDeserialize(using=LocalDateDeserializer.class)
  @JsonSerialize(using=LocalDateSerializer.class)
  private LocalDate betreuungVon;
  private String    landesstelle;
  private String    status;

  public LocalDate getBetreuungBis() {
	return betreuungBis;
  }

  public void setBetreuungBis(LocalDate betreuungBis) {
	this.betreuungBis = betreuungBis;
  }

  public LocalDate getBetreuungVon() {
	return betreuungVon;
  }

  public void setBetreuungVon(LocalDate betreuungVon) {
	this.betreuungVon = betreuungVon;
  }

  public String getLandesstelle() {
	return landesstelle;
  }

  public void setLandesstelle(String landesstelle) {
	this.landesstelle = landesstelle;
  }

  public String getStatus() {
	return status;
  }

  public void setStatus(String status) {
	this.status = status;
  }
}
