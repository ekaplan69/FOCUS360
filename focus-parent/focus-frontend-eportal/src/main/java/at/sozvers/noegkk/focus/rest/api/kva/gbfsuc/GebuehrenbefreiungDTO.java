package at.sozvers.noegkk.focus.rest.api.kva.gbfsuc;

import java.time.LocalDate;
import at.sozvers.noegkk.focus.rest.api.common.BaseDTO;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;

public class GebuehrenbefreiungDTO implements BaseDTO {

  private String    befreiung;
  private String    befreiungsgrund;
  @JsonDeserialize(using=LocalDateDeserializer.class)
  @JsonSerialize(using=LocalDateSerializer.class)
  private LocalDate gueltigBis;
  @JsonDeserialize(using=LocalDateDeserializer.class)
  @JsonSerialize(using=LocalDateSerializer.class)
  private LocalDate gueltigVon;

  public String getBefreiung() {
	return befreiung;
  }

  public void setBefreiung(String befreiung) {
	this.befreiung = befreiung;
  }

  public String getBefreiungsgrund() {
	return befreiungsgrund;
  }

  public void setBefreiungsgrund(String befreiungsgrund) {
	this.befreiungsgrund = befreiungsgrund;
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
