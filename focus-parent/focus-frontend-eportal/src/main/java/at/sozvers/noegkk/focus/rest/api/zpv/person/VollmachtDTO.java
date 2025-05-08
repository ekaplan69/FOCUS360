package at.sozvers.noegkk.focus.rest.api.zpv.person;

import java.time.LocalDate;
import at.sozvers.noegkk.focus.rest.api.common.BaseDTO;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;

public class VollmachtDTO implements BaseDTO {
  private String    artDerVollmacht;
  private String    beziehungsart;
  @JsonDeserialize(using=LocalDateDeserializer.class)
  @JsonSerialize(using=LocalDateSerializer.class)
  private LocalDate gueltigBis;
  @JsonDeserialize(using=LocalDateDeserializer.class)
  @JsonSerialize(using=LocalDateSerializer.class)
  private LocalDate gueltigVon;
  private String    name;

  public VollmachtDTO() {
  }

  public String getArtDerVollmacht() {
	return artDerVollmacht;
  }

  public void setArtDerVollmacht(String artDerVollmacht) {
	this.artDerVollmacht = artDerVollmacht;
  }

  public String getBeziehungsart() {
	return beziehungsart;
  }

  public void setBeziehungsart(String beziehungsart) {
	this.beziehungsart = beziehungsart;
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

  public String getName() {
	return name;
  }

  public void setName(String name) {
	this.name = name;
  }
}
