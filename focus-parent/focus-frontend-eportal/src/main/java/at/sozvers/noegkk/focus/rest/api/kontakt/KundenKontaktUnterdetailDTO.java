package at.sozvers.noegkk.focus.rest.api.kontakt;

import at.sozvers.noegkk.focus.rest.api.common.BaseDTO;

public class KundenKontaktUnterdetailDTO implements BaseDTO {

  private String unterdetailBezeichnung;
  private String unterdetailHilfetext;
  private Long   unterdetailId;

  public String getUnterdetailBezeichnung() {
	return unterdetailBezeichnung;
  }

  public void setUnterdetailBezeichnung(String unterdetailBezeichnung) {
	this.unterdetailBezeichnung = unterdetailBezeichnung;
  }

  public String getUnterdetailHilfetext() {
	return unterdetailHilfetext;
  }

  public void setUnterdetailHilfetext(String unterdetailHilfetext) {
	this.unterdetailHilfetext = unterdetailHilfetext;
  }

  public Long getUnterdetailId() {
	return unterdetailId;
  }

  public void setUnterdetailId(Long unterdetailId) {
	this.unterdetailId = unterdetailId;
  }
}
