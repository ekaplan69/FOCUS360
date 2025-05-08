package at.sozvers.noegkk.focus.rest.api.feedback;

import java.time.LocalDateTime;
import at.sozvers.noegkk.focus.rest.api.common.BaseDTO;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;

public class KundenfeedbackKurzDTO implements BaseDTO {
  @JsonDeserialize(using=LocalDateTimeDeserializer.class)
  @JsonSerialize(using=LocalDateTimeSerializer.class)
  private LocalDateTime erstellTs;
  private Long          feedbackartId;
  private String        feedbackgrundBezeichnung;
  private Long          id;
  private Long          kontaktartId;
  private Long          statusId;
  private String        themaBezeichnung;
  private String        unterkategorieBezeichnung;

  public LocalDateTime getErstellTs() {
	return erstellTs;
  }

  public void setErstellTs(LocalDateTime erstellTs) {
	this.erstellTs = erstellTs;
  }

  public Long getFeedbackartId() {
	return feedbackartId;
  }

  public void setFeedbackartId(Long feedbackartId) {
	this.feedbackartId = feedbackartId;
  }

  public String getFeedbackgrundBezeichnung() {
	return feedbackgrundBezeichnung;
  }

  public void setFeedbackgrundBezeichnung(String feedbackgrundBezeichnung) {
	this.feedbackgrundBezeichnung = feedbackgrundBezeichnung;
  }

  public Long getId() {
	return id;
  }

  public void setId(Long id) {
	this.id = id;
  }

  public Long getKontaktartId() {
	return kontaktartId;
  }

  public void setKontaktartId(Long kontaktartId) {
	this.kontaktartId = kontaktartId;
  }

  public Long getStatusId() {
	return statusId;
  }

  public void setStatusId(Long statusId) {
	this.statusId = statusId;
  }

  public String getThemaBezeichnung() {
	return themaBezeichnung;
  }

  public void setThemaBezeichnung(String themaBezeichnung) {
	this.themaBezeichnung = themaBezeichnung;
  }

  public String getUnterkategorieBezeichnung() {
	return unterkategorieBezeichnung;
  }

  public void setUnterkategorieBezeichnung(String unterkategorieBezeichnung) {
	this.unterkategorieBezeichnung = unterkategorieBezeichnung;
  }
}
