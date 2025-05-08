package at.sozvers.noegkk.focus.rest.api.notiz;

import at.sozvers.noegkk.focus.rest.api.common.BaseDTO;
import at.sozvers.noegkk.focus.service.common.Fachschluessel;

public class NotizDTO implements BaseDTO {

  private Fachschluessel fachschluessel;
  private Long           id;
  private String         text;
  private Long           updateCount;

  public Fachschluessel getFachschluessel() {
	return fachschluessel;
  }

  public void setFachschluessel(Fachschluessel fachschluessel) {
	this.fachschluessel = fachschluessel;
  }

  public Long getId() {
	return id;
  }

  public void setId(Long id) {
	this.id = id;
  }

  public String getText() {
	return text;
  }

  public void setText(String text) {
	this.text = text;
  }

  public Long getUpdateCount() {
	return updateCount;
  }

  public void setUpdateCount(Long updateCount) {
	this.updateCount = updateCount;
  }
}
