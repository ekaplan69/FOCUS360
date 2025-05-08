package at.sozvers.focus.ws.client;

import at.itsv.noegkk.commons.RequestHeadersCommons;
import jakarta.ws.rs.core.MultivaluedHashMap;
import jakarta.ws.rs.core.MultivaluedMap;

public class ECMAWFHeader {
  private static final String APPLIKATION = "FOCUS360";
  private static final String TRAEGER     = "1X";
  private              String bearbeiterId;
  private              String bearbeitungsGrund;
  private              String benutzerkreis;
  private              String orgEinheitId;
  private              String systemmodus;
  private              String transaktion;
  private              String verarbeitungsmodus;

  public ECMAWFHeader() {
	//Default Constructor
  }

  public ECMAWFHeader(RequestHeadersCommons requestHeadersCommons) {
	this.bearbeiterId = requestHeadersCommons.getBearbeiterID().split("@")[0];
	this.orgEinheitId = requestHeadersCommons.getOrgeinheitId();
	this.transaktion = requestHeadersCommons.getTransactionUUID();
  }

  public MultivaluedMap<String, Object> generateHeaders() {
	MultivaluedMap<String, Object> headers = new MultivaluedHashMap<>();
	headers.add("X-AWF-Benutzername", this.getBearbeiterId()); // Es fehlen für die Variable X-AWF-Benutzername im ECMAWFHeader die Freischaltungen der User
	headers.add("X-AWF-ZUP-BearbeiterID", this.getBearbeiterId());
	headers.add("X-AWF-ZUP-Benutzerkreis", this.getBenutzerkreis());
	headers.add("X-AWF-ZUP-Traeger", TRAEGER);
	headers.add("X-AWF-ZUP-OrgeinheitID", this.getOrgEinheitId());
	headers.add("X-AWF-ZUP-Bearbeitungsgrund", this.getBearbeitungsGrund());
	headers.add("X-AWF-ZUP-Verarbeitungsmodus", this.getVerarbeitungsmodus());
	headers.add("X-AWF-ZUP-Transaktion", this.getTransaktion());
	headers.add("X-AWF-ZUP-Applikation", APPLIKATION);
	headers.add("X-AWF-ZUP-Systemmodus", this.getSystemmodus());
	return headers;
  }

  public String getBearbeiterId() {
	return bearbeiterId;
  }

  public void setBearbeiterId(String bearbeiterId) {
	this.bearbeiterId = bearbeiterId;
  }

  public String getBenutzerkreis() {
	return benutzerkreis;
  }

  public void setBenutzerkreis(String benutzerkreis) {
	this.benutzerkreis = benutzerkreis;
  }

  public String getOrgEinheitId() {
	return orgEinheitId;
  }

  public void setOrgEinheitId(String orgEinheitId) {
	this.orgEinheitId = orgEinheitId;
  }

  public String getBearbeitungsGrund() {
	return bearbeitungsGrund;
  }

  public void setBearbeitungsGrund(String bearbeitungsGrund) {
	this.bearbeitungsGrund = bearbeitungsGrund;
  }

  public String getVerarbeitungsmodus() {
	return verarbeitungsmodus;
  }

  public void setVerarbeitungsmodus(String verarbeitungsmodus) {
	this.verarbeitungsmodus = verarbeitungsmodus;
  }

  public String getTransaktion() {
	return transaktion;
  }

  public void setTransaktion(String transaktion) {
	this.transaktion = transaktion;
  }

  public String getSystemmodus() {
	return systemmodus;
  }

  public void setSystemmodus(String systemmodus) {
	this.systemmodus = systemmodus;
  }

  public String getTraeger() {
	return TRAEGER;
  }
}
