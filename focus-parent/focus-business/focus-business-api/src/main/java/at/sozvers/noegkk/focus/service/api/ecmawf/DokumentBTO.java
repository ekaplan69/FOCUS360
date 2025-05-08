package at.sozvers.noegkk.focus.service.api.ecmawf;

import java.time.LocalDate;
import at.sozvers.noegkk.focus.service.api.common.BaseBTO;
import at.sozvers.noegkk.focus.service.api.common.xml.LocalDateAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

public class DokumentBTO implements BaseBTO {

  private String    anzeigeUrl;
  private String    art;
  @XmlJavaTypeAdapter(value=LocalDateAdapter.class)
  private LocalDate datum;
  private String    dokumentId;
  private String    dokumentenklasse;
  private String    kategorie;
  private String    thema;

  public DokumentBTO() {
	//Default Constructor
  }

  public String getAnzeigeUrl() {
	return anzeigeUrl;
  }

  public void setAnzeigeUrl(String anzeigeUrl) {
	this.anzeigeUrl = anzeigeUrl;
  }

  public String getArt() {
	return art;
  }

  public void setArt(String art) {
	this.art = art;
  }

  public LocalDate getDatum() {
	return datum;
  }

  public void setDatum(LocalDate datum) {
	this.datum = datum;
  }

  public String getDokumentId() {
	return dokumentId;
  }

  public void setDokumentId(String dokumentId) {
	this.dokumentId = dokumentId;
  }

  public String getDokumentenklasse() {
	return dokumentenklasse;
  }

  public void setDokumentenklasse(String dokumentenklasse) {
	this.dokumentenklasse = dokumentenklasse;
  }

  public String getKategorie() {
	return kategorie;
  }

  public void setKategorie(String kategorie) {
	this.kategorie = kategorie;
  }

  public String getThema() {
	return thema;
  }

  public void setThema(String thema) {
	this.thema = thema;
  }
}
