package at.sozvers.noegkk.focus.service.api.notiz;

import at.sozvers.noegkk.focus.service.api.common.BaseBTO;

public class NotizBTO implements BaseBTO {

  private String fachSchluessel;
  private String fachschluesselArt;
  private Long   id;
  private String text;
  private Long   updateCount;

  public NotizBTO() {

  }

  public NotizBTO(String text, Long updateCount, String fachSchluessel, String fachschluesselArt) {
	this.setText(text);
	this.setUpdateCount(updateCount);
	this.setFachSchluessel(fachSchluessel);
	this.setFachschluesselArt(fachschluesselArt);
  }

  public String getFachSchluessel() {
	return fachSchluessel;
  }

  public void setFachSchluessel(String fachSchluessel) {
	this.fachSchluessel = fachSchluessel;
  }

  public String getFachschluesselArt() {
	return fachschluesselArt;
  }

  public void setFachschluesselArt(String fachschluesselArt) {
	this.fachschluesselArt = fachschluesselArt;
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

  @Override
  public String toString() {
	StringBuilder sb = new StringBuilder();
	sb.append(fachschluesselArt).append(", ").append(fachSchluessel).append(", ").append(text).append(", ").append(updateCount);

	return sb.toString();
  }
}
