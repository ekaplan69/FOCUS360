package at.sozvers.noegkk.focus.rest.api.beschwerde;

import at.sozvers.noegkk.focus.rest.api.common.BaseDTO;

public class BeschwerdeGrundDTO implements BaseDTO {

  private String bezeichnung;
  private String hilfetext;
  private Long   id;

  public String getBezeichnung() {
	return bezeichnung;
  }

  public void setBezeichnung(String bezeichnung) {
	this.bezeichnung = bezeichnung;
  }

  public String getHilfetext() {
	return hilfetext;
  }

  public void setHilfetext(String hilfetext) {
	this.hilfetext = hilfetext;
  }

  public Long getId() {
	return id;
  }

  public void setId(Long id) {
	this.id = id;
  }
}
