package at.sozvers.noegkk.focus.rest.api.user;

import java.io.Serializable;
import java.util.List;

public class UserInfo implements Serializable {
  private static final long         serialVersionUID = 1L;
  private              List<String> aufgabengebiete;
  private              String       benutzername;
  private              Long         bundesland;
  private              String       nachname;
  private              List<String> offeneKontakte;
  private              List<String> organisationseinheiten;
  private              List<String> rollen;
  private              String       vorname;

  public UserInfo() {
	//Standard Constructor
  }

  public UserInfo(String benutzername, String vorname, String nachname, String bundesland, List<String> organisationseinheiten, List<String> rollen, List<String> offeneKontakte) {
	super();
	this.benutzername = benutzername.split("@")[0];
	this.vorname = vorname;
	this.nachname = nachname;
	try {
	  this.bundesland = Long.parseLong(bundesland);
	} catch(NumberFormatException nfe) {
	  //Do nothing
	}
	this.organisationseinheiten = organisationseinheiten;
	this.rollen = rollen;
	this.offeneKontakte = offeneKontakte;
  }

  public List<String> getAufgabengebiete() {
	return aufgabengebiete;
  }

  public void setAufgabengebiete(List<String> aufgabengebiete) {
	this.aufgabengebiete = aufgabengebiete;
  }

  public String getBenutzername() {
	return benutzername;
  }

  public void setBenutzername(String benutzername) {
	this.benutzername = benutzername;
  }

  public Long getBundesland() {
	return bundesland;
  }

  public void setBundesland(Long bundesland) {
	this.bundesland = bundesland;
  }

  public String getNachname() {
	return nachname;
  }

  public void setNachname(String nachname) {
	this.nachname = nachname;
  }

  public List<String> getOffeneKontakte() {
	return offeneKontakte;
  }

  public void setOffeneKontakte(List<String> offeneKontakte) {
	this.offeneKontakte = offeneKontakte;
  }

  public List<String> getOrganisationseinheiten() {
	return organisationseinheiten;
  }

  public void setOrganisationseinheiten(List<String> organisationseinheiten) {
	this.organisationseinheiten = organisationseinheiten;
  }

  public List<String> getRollen() {
	return rollen;
  }

  public void setRollen(List<String> rollen) {
	this.rollen = rollen;
  }

  public String getVorname() {
	return vorname;
  }

  public void setVorname(String vorname) {
	this.vorname = vorname;
  }
}
