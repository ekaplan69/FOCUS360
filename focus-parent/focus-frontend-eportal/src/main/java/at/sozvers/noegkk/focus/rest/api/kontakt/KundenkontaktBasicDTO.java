package at.sozvers.noegkk.focus.rest.api.kontakt;

import java.time.LocalDateTime;
import at.sozvers.noegkk.focus.rest.api.common.BaseDTO;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;

public class KundenkontaktBasicDTO implements BaseDTO {

  private String        kanalBez;
  private Long          kontaktId;
  private String        kontaktdetailsBez;
  private String        kontaktgrundBez;
  private String        kontaktpunktBez;
  @JsonDeserialize(using=LocalDateTimeDeserializer.class)
  @JsonSerialize(using=LocalDateTimeSerializer.class)
  private LocalDateTime zeitpunkt;

  public String getKanalBez() {
	return kanalBez;
  }

  public void setKanalBez(String kanalBez) {
	this.kanalBez = kanalBez;
  }

  public Long getKontaktId() {
	return kontaktId;
  }

  public void setKontaktId(Long kontaktId) {
	this.kontaktId = kontaktId;
  }

  public String getKontaktdetailsBez() {
	return kontaktdetailsBez;
  }

  public void setKontaktdetailsBez(String kontaktdetailsBez) {
	this.kontaktdetailsBez = kontaktdetailsBez;
  }

  public String getKontaktgrundBez() {
	return kontaktgrundBez;
  }

  public void setKontaktgrundBez(String kontaktgrundBez) {
	this.kontaktgrundBez = kontaktgrundBez;
  }

  public String getKontaktpunktBez() {
	return kontaktpunktBez;
  }

  public void setKontaktpunktBez(String kontaktpunktBez) {
	this.kontaktpunktBez = kontaktpunktBez;
  }

  public LocalDateTime getZeitpunkt() {
	return zeitpunkt;
  }

  public void setZeitpunkt(LocalDateTime zeitpunkt) {
	this.zeitpunkt = zeitpunkt;
  }
}
