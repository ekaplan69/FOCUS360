package at.sozvers.noegkk.focus.rest.api.kontaktneu;

import at.sozvers.noegkk.focus.rest.api.common.BaseDTO;

public class GueltigeOeDTO implements BaseDTO {
  private String  bereOrg;
  private String  bezeichnung;
  private Integer id;

  public String getBereOrg() {
	return bereOrg;
  }

  public void setBereOrg(String bereOrg) {
	this.bereOrg = bereOrg;
  }

  public String getBezeichnung() {
	return bezeichnung;
  }

  public void setBezeichnung(String bezeichnung) {
	this.bezeichnung = bezeichnung;
  }

  public Integer getId() {
	return id;
  }

  public void setId(Integer id) {
	this.id = id;
  }
}
