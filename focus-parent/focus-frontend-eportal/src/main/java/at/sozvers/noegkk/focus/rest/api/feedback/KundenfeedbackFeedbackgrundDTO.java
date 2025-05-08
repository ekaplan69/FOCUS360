package at.sozvers.noegkk.focus.rest.api.feedback;

import java.time.LocalDateTime;
import at.sozvers.noegkk.focus.rest.api.common.BaseDTO;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;

public class KundenfeedbackFeedbackgrundDTO implements BaseDTO {
  private String        bezeichnung;
  @JsonDeserialize(using=LocalDateTimeDeserializer.class)
  @JsonSerialize(using=LocalDateTimeSerializer.class)
  private LocalDateTime gueltigBis;
  @JsonDeserialize(using=LocalDateTimeDeserializer.class)
  @JsonSerialize(using=LocalDateTimeSerializer.class)
  private LocalDateTime gueltigVon;
  private Long          id;

  public String getBezeichnung() {
	return bezeichnung;
  }

  public void setBezeichnung(String bezeichnung) {
	this.bezeichnung = bezeichnung;
  }

  public LocalDateTime getGueltigBis() {
	return gueltigBis;
  }

  public void setGueltigBis(LocalDateTime gueltigBis) {
	this.gueltigBis = gueltigBis;
  }

  public LocalDateTime getGueltigVon() {
	return gueltigVon;
  }

  public void setGueltigVon(LocalDateTime gueltigVon) {
	this.gueltigVon = gueltigVon;
  }

  public Long getId() {
	return id;
  }

  public void setId(Long id) {
	this.id = id;
  }
}
