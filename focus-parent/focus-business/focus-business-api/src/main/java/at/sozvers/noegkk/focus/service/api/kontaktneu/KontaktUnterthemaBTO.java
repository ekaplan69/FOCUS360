package at.sozvers.noegkk.focus.service.api.kontaktneu;

import at.sozvers.noegkk.focus.service.api.common.BaseBTO;

public class KontaktUnterthemaBTO implements BaseBTO {
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
