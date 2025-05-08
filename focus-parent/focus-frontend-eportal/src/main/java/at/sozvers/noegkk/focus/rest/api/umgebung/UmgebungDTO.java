package at.sozvers.noegkk.focus.rest.api.umgebung;

import at.sozvers.noegkk.focus.rest.api.common.BaseDTO;

public class UmgebungDTO implements BaseDTO {

  private String umgebung;

  public UmgebungDTO(String umgebung) {
	this.umgebung = umgebung;
  }

  public String getUmgebung() {
	return umgebung;
  }

  public void setUmgebung(String umgebung) {
	this.umgebung = umgebung;
  }
}
