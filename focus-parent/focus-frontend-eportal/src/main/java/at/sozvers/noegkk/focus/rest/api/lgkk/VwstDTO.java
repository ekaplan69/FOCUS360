package at.sozvers.noegkk.focus.rest.api.lgkk;

import java.time.LocalDate;
import at.sozvers.noegkk.focus.rest.api.common.BaseDTO;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;

public class VwstDTO implements BaseDTO {
  @JsonDeserialize(using=LocalDateDeserializer.class)
  @JsonSerialize(using=LocalDateSerializer.class)
  private LocalDate gueltigBisDat;
  private String    leistungsType;

  public LocalDate getGueltigBisDat() {
	return gueltigBisDat;
  }

  public void setGueltigBisDat(LocalDate gueltigBisDat) {
	this.gueltigBisDat = gueltigBisDat;
  }

  public String getLeistungsType() {
	return leistungsType;
  }

  public void setLeistungsType(String leistungsType) {
	this.leistungsType = leistungsType;
  }
}
