package at.sozvers.noegkk.focus.rest.api.kontaktneu;

import at.sozvers.noegkk.focus.rest.api.common.BaseDTO;

public class KontaktUnterthemaDTO implements BaseDTO {
  private String unterthemaBezeichnung;
  private Long   unterthemaId;

  public String getUnterthemaBezeichnung() {
	return unterthemaBezeichnung;
  }

  public void setUnterthemaBezeichnung(String unterthemaBezeichnung) {
	this.unterthemaBezeichnung = unterthemaBezeichnung;
  }

  public Long getUnterthemaId() {
	return unterthemaId;
  }

  public void setUnterthemaId(Long unterthemaId) {
	this.unterthemaId = unterthemaId;
  }
}
