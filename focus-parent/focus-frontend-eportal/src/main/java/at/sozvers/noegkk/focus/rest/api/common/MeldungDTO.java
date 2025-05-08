package at.sozvers.noegkk.focus.rest.api.common;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class MeldungDTO implements BaseDTO {

  private String fehlerId;
  private String fehlerkategorie;
  private String meldungstext;

  private MeldungDTO() {
  }

  public static MeldungDTO of(String fehlerId, String fehlerkategorie, String meldungstext) {
	MeldungDTO meldungDTO = new MeldungDTO();
	meldungDTO.setFehlerId(fehlerId);
	meldungDTO.setFehlerkategorie(fehlerkategorie);
	meldungDTO.setMeldungstext(meldungstext);
	return meldungDTO;
  }

  @JsonIgnore
  @Override
  public String toString() {
	return String.format("%s (%s) : %s", this.getFehlerId(), this.getFehlerkategorie(), this.getMeldungstext());
  }

  public String getFehlerId() {
	return fehlerId;
  }

  public void setFehlerId(String fehlerId) {
	this.fehlerId = fehlerId;
  }

  public String getFehlerkategorie() {
	return fehlerkategorie;
  }

  public void setFehlerkategorie(String fehlerkategorie) {
	this.fehlerkategorie = fehlerkategorie;
  }

  public String getMeldungstext() {
	return meldungstext;
  }

  public void setMeldungstext(String meldungstext) {
	this.meldungstext = meldungstext;
  }
}
