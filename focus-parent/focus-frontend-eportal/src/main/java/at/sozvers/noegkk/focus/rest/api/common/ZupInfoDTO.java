package at.sozvers.noegkk.focus.rest.api.common;

import at.sozvers.noegkk.architektur.zup.model.Zusatzinfo;

public class ZupInfoDTO implements BaseDTO {
  private String     fachschluessel;
  private String     fachschluesselArt;
  private String     partnerId;
  private Zusatzinfo zusatzinfo;

  public ZupInfoDTO() {
  }

  public ZupInfoDTO(String fachschluesselArt, String fachschluessel, String partnerId) {
	super();
	this.fachschluesselArt = fachschluesselArt;
	this.fachschluessel = fachschluessel;
	this.partnerId = partnerId;
	this.zusatzinfo = null;
  }

  public ZupInfoDTO(String fachschluesselArt, String fachschluessel, String partnerId, Zusatzinfo zusatzinfo) {
	super();
	this.fachschluesselArt = fachschluesselArt;
	this.fachschluessel = fachschluessel;
	this.partnerId = partnerId;
	this.zusatzinfo = zusatzinfo;
  }

  public ZupInfoDTO(Zusatzinfo zusatzinfo) {
	super();
	this.fachschluesselArt = null;
	this.fachschluessel = null;
	this.partnerId = null;
	this.zusatzinfo = zusatzinfo;
  }

  public String getFachschluessel() {
	return fachschluessel;
  }

  public void setFachschluessel(String fachschluessel) {
	this.fachschluessel = fachschluessel;
  }

  public String getFachschluesselArt() {
	return fachschluesselArt;
  }

  public void setFachschluesselArt(String fachschluesselArt) {
	this.fachschluesselArt = fachschluesselArt;
  }

  public String getPartnerId() {
	return partnerId;
  }

  public void setPartnerId(String partnerId) {
	this.partnerId = partnerId;
  }

  public Zusatzinfo getZusatzinfo() {
	return zusatzinfo;
  }

  public void setZusatzinfo(Zusatzinfo zusatzinfo) {
	this.zusatzinfo = zusatzinfo;
  }
}
