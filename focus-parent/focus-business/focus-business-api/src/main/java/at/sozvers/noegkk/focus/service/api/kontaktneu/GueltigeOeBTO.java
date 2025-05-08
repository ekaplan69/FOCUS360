package at.sozvers.noegkk.focus.service.api.kontaktneu;

import at.sozvers.noegkk.focus.service.api.common.BaseBTO;

public class GueltigeOeBTO implements BaseBTO {
  private String  bere_org;
  private String  bezeichnung;
  private Integer id;

  public String getBere_org() {
	return bere_org;
  }

  public void setBere_org(String bere_org) {
	this.bere_org = bere_org;
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
