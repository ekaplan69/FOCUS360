package at.sozvers.noegkk.focus.rest.api.lgkk;

import java.time.LocalDate;
import at.sozvers.noegkk.focus.rest.api.common.BaseDTO;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;

public class MedStDTO implements BaseDTO {
  @JsonDeserialize(using=LocalDateDeserializer.class)
  @JsonSerialize(using=LocalDateSerializer.class)
  private LocalDate gueltigBisDat;
  private String    lgebiet;
  private String    stellungnahme;

  public LocalDate getGueltigBisDat() {
	return gueltigBisDat;
  }

  public void setGueltigBisDat(LocalDate gueltigBisDat) {
	this.gueltigBisDat = gueltigBisDat;
  }

  public String getLgebiet() {
	return lgebiet;
  }

  public void setLgebiet(String lgebiet) {
	this.lgebiet = lgebiet;
  }

  public String getStellungnahme() {
	return stellungnahme;
  }

  public void setStellungnahme(String stellungnahme) {
	this.stellungnahme = stellungnahme;
  }
}
