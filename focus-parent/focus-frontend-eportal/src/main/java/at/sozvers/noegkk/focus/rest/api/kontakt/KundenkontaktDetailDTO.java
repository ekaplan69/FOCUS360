package at.sozvers.noegkk.focus.rest.api.kontakt;

import java.util.List;
import at.sozvers.noegkk.focus.rest.api.common.BaseDTO;

public class KundenkontaktDetailDTO implements BaseDTO {

  private String                            kontaktdetailBezeichnung;
  private String                            kontaktdetailHilfetext;
  private Long                              kontaktdetailId;
  private List<KundenKontaktUnterdetailDTO> unterdetails;

  public String getKontaktdetailBezeichnung() {
	return kontaktdetailBezeichnung;
  }

  public void setKontaktdetailBezeichnung(String kontaktdetailBezeichnung) {
	this.kontaktdetailBezeichnung = kontaktdetailBezeichnung;
  }

  public String getKontaktdetailHilfetext() {
	return kontaktdetailHilfetext;
  }

  public void setKontaktdetailHilfetext(String kontaktdetailHilfetext) {
	this.kontaktdetailHilfetext = kontaktdetailHilfetext;
  }

  public Long getKontaktdetailId() {
	return kontaktdetailId;
  }

  public void setKontaktdetailId(Long kontaktdetailId) {
	this.kontaktdetailId = kontaktdetailId;
  }

  public List<KundenKontaktUnterdetailDTO> getUnterdetails() {
	return unterdetails;
  }

  public void setUnterdetails(List<KundenKontaktUnterdetailDTO> unterdetails) {
	this.unterdetails = unterdetails;
  }
}
