package at.sozvers.noegkk.focus.rest.api.lgkk;

import java.time.LocalDate;
import at.sozvers.noegkk.focus.rest.api.common.BaseDTO;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;

/**
 * Heilbehelfe und Hilfsmittel Kostenerstattung
 */
public class HbHmDTO implements BaseDTO {
  private String    status;
  @JsonDeserialize(using=LocalDateDeserializer.class)
  @JsonSerialize(using=LocalDateSerializer.class)
  private LocalDate verordnungsDat;

  public String getStatus() {
	return status;
  }

  public void setStatus(String status) {
	this.status = status;
  }

  public LocalDate getVerordnungsDat() {
	return verordnungsDat;
  }

  public void setVerordnungsDat(LocalDate verordnungsDat) {
	this.verordnungsDat = verordnungsDat;
  }
}
