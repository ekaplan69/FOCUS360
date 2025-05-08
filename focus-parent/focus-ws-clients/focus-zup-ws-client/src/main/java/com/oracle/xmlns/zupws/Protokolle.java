package com.oracle.xmlns.zupws;

import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.*;

/**
 * <p>Java-Klasse für anonymous complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Dateiversion" type="{http://xmlns.oracle.com/Zupws}VersionEnum" form="qualified"/&gt;
 *         &lt;element name="Prot" maxOccurs="5000" form="qualified"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ProtLogID" type="{http://xmlns.oracle.com/Zupws}S20" form="qualified"/&gt;
 *                   &lt;element name="ApplBetreiber" type="{http://xmlns.oracle.com/Zupws}S2" form="qualified"/&gt;
 *                   &lt;element name="Applikation" type="{http://xmlns.oracle.com/Zupws}S8" form="qualified"/&gt;
 *                   &lt;element name="QuellsystemID" type="{http://xmlns.oracle.com/Zupws}S64" form="qualified"/&gt;
 *                   &lt;element name="Version" type="{http://xmlns.oracle.com/Zupws}Nummer_4Stellig" form="qualified"/&gt;
 *                   &lt;element name="Protokollierungspflicht" type="{http://xmlns.oracle.com/Zupws}Protokollierungspflicht" form="qualified"/&gt;
 *                   &lt;element name="Mod" type="{http://xmlns.oracle.com/Zupws}ModEnum" form="qualified"/&gt;
 *                   &lt;element name="VSTR" type="{http://xmlns.oracle.com/Zupws}S2" form="qualified"/&gt;
 *                   &lt;element name="BenutzerID" type="{http://xmlns.oracle.com/Zupws}S128" form="qualified"/&gt;
 *                   &lt;element name="BerechtigungssystemID" type="{http://xmlns.oracle.com/Zupws}S64" form="qualified"/&gt;
 *                   &lt;element name="Org" type="{http://xmlns.oracle.com/Zupws}S30" minOccurs="0" form="qualified"/&gt;
 *                   &lt;element name="Grund" type="{http://xmlns.oracle.com/Zupws}S250" minOccurs="0" form="qualified"/&gt;
 *                   &lt;element name="Datum" type="{http://www.w3.org/2001/XMLSchema}dateTime" form="qualified"/&gt;
 *                   &lt;element name="Trans" type="{http://xmlns.oracle.com/Zupws}S72" form="qualified"/&gt;
 *                   &lt;element name="TransKurz" type="{http://xmlns.oracle.com/Zupws}S13" minOccurs="0" form="qualified"/&gt;
 *                   &lt;element name="Fehler" type="{http://xmlns.oracle.com/Zupws}S6" minOccurs="0" form="qualified"/&gt;
 *                   &lt;element name="Systemumgebung" type="{http://xmlns.oracle.com/Zupws}S3" form="qualified"/&gt;
 *                   &lt;element name="KRIT_TYP1" type="{http://xmlns.oracle.com/Zupws}S50" form="qualified"/&gt;
 *                   &lt;element name="KRIT_WERT1" type="{http://xmlns.oracle.com/Zupws}S20" form="qualified"/&gt;
 *                   &lt;element name="KRIT_TYP2" type="{http://xmlns.oracle.com/Zupws}S30" minOccurs="0" form="qualified"/&gt;
 *                   &lt;element name="KRIT_WERT2" type="{http://xmlns.oracle.com/Zupws}S20" minOccurs="0" form="qualified"/&gt;
 *                   &lt;element name="KRIT_TYP3" type="{http://xmlns.oracle.com/Zupws}S30" minOccurs="0" form="qualified"/&gt;
 *                   &lt;element name="KRIT_WERT3" type="{http://xmlns.oracle.com/Zupws}S20" minOccurs="0" form="qualified"/&gt;
 *                   &lt;element name="TRAEGER_VERURSACHER_ID" type="{http://xmlns.oracle.com/Zupws}S2" minOccurs="0" form="qualified"/&gt;
 *                   &lt;element name="INFOTEXT" type="{http://xmlns.oracle.com/Zupws}S4000" minOccurs="0" form="qualified"/&gt;
 *                   &lt;element name="MD5" type="{http://xmlns.oracle.com/Zupws}S256" minOccurs="0" form="qualified"/&gt;
 *                   &lt;element name="OPT1" type="{http://xmlns.oracle.com/Zupws}S200" minOccurs="0" form="qualified"/&gt;
 *                   &lt;element name="OPT2" type="{http://xmlns.oracle.com/Zupws}S200" minOccurs="0" form="qualified"/&gt;
 *                   &lt;element name="OPT3" type="{http://xmlns.oracle.com/Zupws}S200" minOccurs="0" form="qualified"/&gt;
 *                   &lt;element name="OPT4" type="{http://xmlns.oracle.com/Zupws}S200" minOccurs="0" form="qualified"/&gt;
 *                   &lt;element name="OPT5" type="{http://xmlns.oracle.com/Zupws}S200" minOccurs="0" form="qualified"/&gt;
 *                   &lt;element name="OPT6" type="{http://xmlns.oracle.com/Zupws}S200" minOccurs="0" form="qualified"/&gt;
 *                   &lt;element name="OPT7" type="{http://xmlns.oracle.com/Zupws}S200" minOccurs="0" form="qualified"/&gt;
 *                   &lt;element name="OPT8" type="{http://xmlns.oracle.com/Zupws}S200" minOccurs="0" form="qualified"/&gt;
 *                   &lt;element name="Datei" type="{http://xmlns.oracle.com/Zupws}S512" minOccurs="0" form="qualified"/&gt;
 *                   &lt;element name="ClientName" type="{http://xmlns.oracle.com/Zupws}S5-50" minOccurs="0" form="qualified"/&gt;
 *                   &lt;element name="IP" type="{http://xmlns.oracle.com/Zupws}IPAddress" minOccurs="0" form="qualified"/&gt;
 *                   &lt;element name="MODUL" type="{http://xmlns.oracle.com/Zupws}S20" minOccurs="0" form="qualified"/&gt;
 *                   &lt;element name="TrackingID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0" form="qualified"/&gt;
 *                   &lt;element name="MessageID" type="{http://xmlns.oracle.com/Zupws}S32" minOccurs="0" form="qualified"/&gt;
 *                   &lt;element name="E7" type="{http://xmlns.oracle.com/Zupws}S100" minOccurs="0" form="qualified"/&gt;
 *                   &lt;element name="E8" type="{http://xmlns.oracle.com/Zupws}S100" minOccurs="0" form="qualified"/&gt;
 *                   &lt;element name="E9" type="{http://xmlns.oracle.com/Zupws}S100" minOccurs="0" form="qualified"/&gt;
 *                   &lt;element name="E10" type="{http://xmlns.oracle.com/Zupws}S100" minOccurs="0" form="qualified"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="", propOrder={"dateiversion", "prot"})
@XmlRootElement(name="Protokolle")
public class Protokolle {

  @XmlElement(name="Dateiversion", required=true)
  protected String                dateiversion;
  @XmlElement(name="Prot", required=true)
  protected List<Protokolle.Prot> prot;

  /**
   * Ruft den Wert der dateiversion-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getDateiversion() {
	return dateiversion;
  }

  /**
   * Legt den Wert der dateiversion-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setDateiversion(String value) {
	this.dateiversion = value;
  }

  /**
   * Gets the value of the prot property.
   *
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object. This is why there is
   * not a <CODE>set</CODE> method for the prot property.
   *
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getProt().add(newItem);
   * </pre>
   *
   *
   * <p>
   * Objects of the following type(s) are allowed in the list {@link Protokolle.Prot }
   */
  public List<Protokolle.Prot> getProt() {
	if(prot == null) {
	  prot = new ArrayList<Protokolle.Prot>();
	}
	return this.prot;
  }

  /**
   * <p>Java-Klasse für anonymous complex type.
   *
   * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
   *
   * <pre>
   * &lt;complexType&gt;
   *   &lt;complexContent&gt;
   *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
   *       &lt;sequence&gt;
   *         &lt;element name="ProtLogID" type="{http://xmlns.oracle.com/Zupws}S20" form="qualified"/&gt;
   *         &lt;element name="ApplBetreiber" type="{http://xmlns.oracle.com/Zupws}S2" form="qualified"/&gt;
   *         &lt;element name="Applikation" type="{http://xmlns.oracle.com/Zupws}S8" form="qualified"/&gt;
   *         &lt;element name="QuellsystemID" type="{http://xmlns.oracle.com/Zupws}S64" form="qualified"/&gt;
   *         &lt;element name="Version" type="{http://xmlns.oracle.com/Zupws}Nummer_4Stellig" form="qualified"/&gt;
   *         &lt;element name="Protokollierungspflicht" type="{http://xmlns.oracle.com/Zupws}Protokollierungspflicht" form="qualified"/&gt;
   *         &lt;element name="Mod" type="{http://xmlns.oracle.com/Zupws}ModEnum" form="qualified"/&gt;
   *         &lt;element name="VSTR" type="{http://xmlns.oracle.com/Zupws}S2" form="qualified"/&gt;
   *         &lt;element name="BenutzerID" type="{http://xmlns.oracle.com/Zupws}S128" form="qualified"/&gt;
   *         &lt;element name="BerechtigungssystemID" type="{http://xmlns.oracle.com/Zupws}S64" form="qualified"/&gt;
   *         &lt;element name="Org" type="{http://xmlns.oracle.com/Zupws}S30" minOccurs="0" form="qualified"/&gt;
   *         &lt;element name="Grund" type="{http://xmlns.oracle.com/Zupws}S250" minOccurs="0" form="qualified"/&gt;
   *         &lt;element name="Datum" type="{http://www.w3.org/2001/XMLSchema}dateTime" form="qualified"/&gt;
   *         &lt;element name="Trans" type="{http://xmlns.oracle.com/Zupws}S72" form="qualified"/&gt;
   *         &lt;element name="TransKurz" type="{http://xmlns.oracle.com/Zupws}S13" minOccurs="0" form="qualified"/&gt;
   *         &lt;element name="Fehler" type="{http://xmlns.oracle.com/Zupws}S6" minOccurs="0" form="qualified"/&gt;
   *         &lt;element name="Systemumgebung" type="{http://xmlns.oracle.com/Zupws}S3" form="qualified"/&gt;
   *         &lt;element name="KRIT_TYP1" type="{http://xmlns.oracle.com/Zupws}S50" form="qualified"/&gt;
   *         &lt;element name="KRIT_WERT1" type="{http://xmlns.oracle.com/Zupws}S20" form="qualified"/&gt;
   *         &lt;element name="KRIT_TYP2" type="{http://xmlns.oracle.com/Zupws}S30" minOccurs="0" form="qualified"/&gt;
   *         &lt;element name="KRIT_WERT2" type="{http://xmlns.oracle.com/Zupws}S20" minOccurs="0" form="qualified"/&gt;
   *         &lt;element name="KRIT_TYP3" type="{http://xmlns.oracle.com/Zupws}S30" minOccurs="0" form="qualified"/&gt;
   *         &lt;element name="KRIT_WERT3" type="{http://xmlns.oracle.com/Zupws}S20" minOccurs="0" form="qualified"/&gt;
   *         &lt;element name="TRAEGER_VERURSACHER_ID" type="{http://xmlns.oracle.com/Zupws}S2" minOccurs="0" form="qualified"/&gt;
   *         &lt;element name="INFOTEXT" type="{http://xmlns.oracle.com/Zupws}S4000" minOccurs="0" form="qualified"/&gt;
   *         &lt;element name="MD5" type="{http://xmlns.oracle.com/Zupws}S256" minOccurs="0" form="qualified"/&gt;
   *         &lt;element name="OPT1" type="{http://xmlns.oracle.com/Zupws}S200" minOccurs="0" form="qualified"/&gt;
   *         &lt;element name="OPT2" type="{http://xmlns.oracle.com/Zupws}S200" minOccurs="0" form="qualified"/&gt;
   *         &lt;element name="OPT3" type="{http://xmlns.oracle.com/Zupws}S200" minOccurs="0" form="qualified"/&gt;
   *         &lt;element name="OPT4" type="{http://xmlns.oracle.com/Zupws}S200" minOccurs="0" form="qualified"/&gt;
   *         &lt;element name="OPT5" type="{http://xmlns.oracle.com/Zupws}S200" minOccurs="0" form="qualified"/&gt;
   *         &lt;element name="OPT6" type="{http://xmlns.oracle.com/Zupws}S200" minOccurs="0" form="qualified"/&gt;
   *         &lt;element name="OPT7" type="{http://xmlns.oracle.com/Zupws}S200" minOccurs="0" form="qualified"/&gt;
   *         &lt;element name="OPT8" type="{http://xmlns.oracle.com/Zupws}S200" minOccurs="0" form="qualified"/&gt;
   *         &lt;element name="Datei" type="{http://xmlns.oracle.com/Zupws}S512" minOccurs="0" form="qualified"/&gt;
   *         &lt;element name="ClientName" type="{http://xmlns.oracle.com/Zupws}S5-50" minOccurs="0" form="qualified"/&gt;
   *         &lt;element name="IP" type="{http://xmlns.oracle.com/Zupws}IPAddress" minOccurs="0" form="qualified"/&gt;
   *         &lt;element name="MODUL" type="{http://xmlns.oracle.com/Zupws}S20" minOccurs="0" form="qualified"/&gt;
   *         &lt;element name="TrackingID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0" form="qualified"/&gt;
   *         &lt;element name="MessageID" type="{http://xmlns.oracle.com/Zupws}S32" minOccurs="0" form="qualified"/&gt;
   *         &lt;element name="E7" type="{http://xmlns.oracle.com/Zupws}S100" minOccurs="0" form="qualified"/&gt;
   *         &lt;element name="E8" type="{http://xmlns.oracle.com/Zupws}S100" minOccurs="0" form="qualified"/&gt;
   *         &lt;element name="E9" type="{http://xmlns.oracle.com/Zupws}S100" minOccurs="0" form="qualified"/&gt;
   *         &lt;element name="E10" type="{http://xmlns.oracle.com/Zupws}S100" minOccurs="0" form="qualified"/&gt;
   *       &lt;/sequence&gt;
   *     &lt;/restriction&gt;
   *   &lt;/complexContent&gt;
   * &lt;/complexType&gt;
   * </pre>
   */
  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(name="",
		   propOrder={"protLogID", "applBetreiber", "applikation", "quellsystemID", "version", "protokollierungspflicht", "mod", "vstr", "benutzerID", "berechtigungssystemID", "org", "grund", "datum",
				   "trans", "transKurz", "fehler", "systemumgebung", "krittyp1", "kritwert1", "krittyp2", "kritwert2", "krittyp3", "kritwert3", "traegerverursacherid", "infotext", "md5", "opt1",
				   "opt2", "opt3", "opt4", "opt5", "opt6", "opt7", "opt8", "datei", "clientName", "ip", "modul", "trackingID", "messageID", "e7", "e8", "e9", "e10"})
  public static class Prot {

	@XmlElement(name="ApplBetreiber", required=true)
	protected String                  applBetreiber;
	@XmlElement(name="Applikation", required=true)
	protected String                  applikation;
	@XmlElement(name="BenutzerID", required=true)
	protected String                  benutzerID;
	@XmlElement(name="BerechtigungssystemID", required=true)
	protected String                  berechtigungssystemID;
	@XmlElement(name="ClientName")
	protected String                  clientName;
	@XmlElement(name="Datei")
	protected String                  datei;
	@XmlElement(name="Datum", required=true)
	@XmlSchemaType(name="dateTime")
	protected XMLGregorianCalendar    datum;
	@XmlElement(name="E10")
	protected String                  e10;
	@XmlElement(name="E7")
	protected String                  e7;
	@XmlElement(name="E8")
	protected String                  e8;
	@XmlElement(name="E9")
	protected String                  e9;
	@XmlElement(name="Fehler")
	protected String                  fehler;
	@XmlElement(name="Grund")
	protected String                  grund;
	@XmlElement(name="INFOTEXT")
	protected String                  infotext;
	@XmlElement(name="IP")
	protected String                  ip;
	@XmlElement(name="KRIT_TYP1", required=true)
	protected String                  krittyp1;
	@XmlElement(name="KRIT_TYP2")
	protected String                  krittyp2;
	@XmlElement(name="KRIT_TYP3")
	protected String                  krittyp3;
	@XmlElement(name="KRIT_WERT1", required=true)
	protected String                  kritwert1;
	@XmlElement(name="KRIT_WERT2")
	protected String                  kritwert2;
	@XmlElement(name="KRIT_WERT3")
	protected String                  kritwert3;
	@XmlElement(name="MD5")
	protected String                  md5;
	@XmlElement(name="MessageID")
	protected String                  messageID;
	@XmlElement(name="Mod", required=true)
	@XmlSchemaType(name="string")
	protected ModEnum                 mod;
	@XmlElement(name="MODUL")
	protected String                  modul;
	@XmlElement(name="OPT1")
	protected String                  opt1;
	@XmlElement(name="OPT2")
	protected String                  opt2;
	@XmlElement(name="OPT3")
	protected String                  opt3;
	@XmlElement(name="OPT4")
	protected String                  opt4;
	@XmlElement(name="OPT5")
	protected String                  opt5;
	@XmlElement(name="OPT6")
	protected String                  opt6;
	@XmlElement(name="OPT7")
	protected String                  opt7;
	@XmlElement(name="OPT8")
	protected String                  opt8;
	@XmlElement(name="Org")
	protected String                  org;
	@XmlElement(name="ProtLogID", required=true)
	protected String                  protLogID;
	@XmlElement(name="Protokollierungspflicht", required=true)
	@XmlSchemaType(name="string")
	protected Protokollierungspflicht protokollierungspflicht;
	@XmlElement(name="QuellsystemID", required=true)
	protected String                  quellsystemID;
	@XmlElement(name="Systemumgebung", required=true)
	protected String                  systemumgebung;
	@XmlElement(name="TrackingID")
	protected BigInteger              trackingID;
	@XmlElement(name="TRAEGER_VERURSACHER_ID")
	protected String                  traegerverursacherid;
	@XmlElement(name="Trans", required=true)
	protected String                  trans;
	@XmlElement(name="TransKurz")
	protected String                  transKurz;
	@XmlElement(name="Version")
	@XmlSchemaType(name="integer")
	protected int                     version;
	@XmlElement(name="VSTR", required=true)
	protected String                  vstr;

	/**
	 * Ruft den Wert der applBetreiber-Eigenschaft ab.
	 *
	 * @return possible object is {@link String }
	 */
	public String getApplBetreiber() {
	  return applBetreiber;
	}

	/**
	 * Legt den Wert der applBetreiber-Eigenschaft fest.
	 *
	 * @param value
	 * 		allowed object is {@link String }
	 */
	public void setApplBetreiber(String value) {
	  this.applBetreiber = value;
	}

	/**
	 * Ruft den Wert der applikation-Eigenschaft ab.
	 *
	 * @return possible object is {@link String }
	 */
	public String getApplikation() {
	  return applikation;
	}

	/**
	 * Legt den Wert der applikation-Eigenschaft fest.
	 *
	 * @param value
	 * 		allowed object is {@link String }
	 */
	public void setApplikation(String value) {
	  this.applikation = value;
	}

	/**
	 * Ruft den Wert der benutzerID-Eigenschaft ab.
	 *
	 * @return possible object is {@link String }
	 */
	public String getBenutzerID() {
	  return benutzerID;
	}

	/**
	 * Legt den Wert der benutzerID-Eigenschaft fest.
	 *
	 * @param value
	 * 		allowed object is {@link String }
	 */
	public void setBenutzerID(String value) {
	  this.benutzerID = value;
	}

	/**
	 * Ruft den Wert der berechtigungssystemID-Eigenschaft ab.
	 *
	 * @return possible object is {@link String }
	 */
	public String getBerechtigungssystemID() {
	  return berechtigungssystemID;
	}

	/**
	 * Legt den Wert der berechtigungssystemID-Eigenschaft fest.
	 *
	 * @param value
	 * 		allowed object is {@link String }
	 */
	public void setBerechtigungssystemID(String value) {
	  this.berechtigungssystemID = value;
	}

	/**
	 * Ruft den Wert der clientName-Eigenschaft ab.
	 *
	 * @return possible object is {@link String }
	 */
	public String getClientName() {
	  return clientName;
	}

	/**
	 * Legt den Wert der clientName-Eigenschaft fest.
	 *
	 * @param value
	 * 		allowed object is {@link String }
	 */
	public void setClientName(String value) {
	  this.clientName = value;
	}

	/**
	 * Ruft den Wert der datei-Eigenschaft ab.
	 *
	 * @return possible object is {@link String }
	 */
	public String getDatei() {
	  return datei;
	}

	/**
	 * Legt den Wert der datei-Eigenschaft fest.
	 *
	 * @param value
	 * 		allowed object is {@link String }
	 */
	public void setDatei(String value) {
	  this.datei = value;
	}

	/**
	 * Ruft den Wert der datum-Eigenschaft ab.
	 *
	 * @return possible object is {@link XMLGregorianCalendar }
	 */
	public XMLGregorianCalendar getDatum() {
	  return datum;
	}

	/**
	 * Legt den Wert der datum-Eigenschaft fest.
	 *
	 * @param value
	 * 		allowed object is {@link XMLGregorianCalendar }
	 */
	public void setDatum(XMLGregorianCalendar value) {
	  this.datum = value;
	}

	/**
	 * Ruft den Wert der e10-Eigenschaft ab.
	 *
	 * @return possible object is {@link String }
	 */
	public String getE10() {
	  return e10;
	}

	/**
	 * Legt den Wert der e10-Eigenschaft fest.
	 *
	 * @param value
	 * 		allowed object is {@link String }
	 */
	public void setE10(String value) {
	  this.e10 = value;
	}

	/**
	 * Ruft den Wert der e7-Eigenschaft ab.
	 *
	 * @return possible object is {@link String }
	 */
	public String getE7() {
	  return e7;
	}

	/**
	 * Legt den Wert der e7-Eigenschaft fest.
	 *
	 * @param value
	 * 		allowed object is {@link String }
	 */
	public void setE7(String value) {
	  this.e7 = value;
	}

	/**
	 * Ruft den Wert der e8-Eigenschaft ab.
	 *
	 * @return possible object is {@link String }
	 */
	public String getE8() {
	  return e8;
	}

	/**
	 * Legt den Wert der e8-Eigenschaft fest.
	 *
	 * @param value
	 * 		allowed object is {@link String }
	 */
	public void setE8(String value) {
	  this.e8 = value;
	}

	/**
	 * Ruft den Wert der e9-Eigenschaft ab.
	 *
	 * @return possible object is {@link String }
	 */
	public String getE9() {
	  return e9;
	}

	/**
	 * Legt den Wert der e9-Eigenschaft fest.
	 *
	 * @param value
	 * 		allowed object is {@link String }
	 */
	public void setE9(String value) {
	  this.e9 = value;
	}

	/**
	 * Ruft den Wert der fehler-Eigenschaft ab.
	 *
	 * @return possible object is {@link String }
	 */
	public String getFehler() {
	  return fehler;
	}

	/**
	 * Legt den Wert der fehler-Eigenschaft fest.
	 *
	 * @param value
	 * 		allowed object is {@link String }
	 */
	public void setFehler(String value) {
	  this.fehler = value;
	}

	/**
	 * Ruft den Wert der grund-Eigenschaft ab.
	 *
	 * @return possible object is {@link String }
	 */
	public String getGrund() {
	  return grund;
	}

	/**
	 * Legt den Wert der grund-Eigenschaft fest.
	 *
	 * @param value
	 * 		allowed object is {@link String }
	 */
	public void setGrund(String value) {
	  this.grund = value;
	}

	/**
	 * Ruft den Wert der infotext-Eigenschaft ab.
	 *
	 * @return possible object is {@link String }
	 */
	public String getINFOTEXT() {
	  return infotext;
	}

	/**
	 * Legt den Wert der infotext-Eigenschaft fest.
	 *
	 * @param value
	 * 		allowed object is {@link String }
	 */
	public void setINFOTEXT(String value) {
	  this.infotext = value;
	}

	/**
	 * Ruft den Wert der ip-Eigenschaft ab.
	 *
	 * @return possible object is {@link String }
	 */
	public String getIP() {
	  return ip;
	}

	/**
	 * Legt den Wert der ip-Eigenschaft fest.
	 *
	 * @param value
	 * 		allowed object is {@link String }
	 */
	public void setIP(String value) {
	  this.ip = value;
	}

	/**
	 * Ruft den Wert der krittyp1-Eigenschaft ab.
	 *
	 * @return possible object is {@link String }
	 */
	public String getKRITTYP1() {
	  return krittyp1;
	}

	/**
	 * Legt den Wert der krittyp1-Eigenschaft fest.
	 *
	 * @param value
	 * 		allowed object is {@link String }
	 */
	public void setKRITTYP1(String value) {
	  this.krittyp1 = value;
	}

	/**
	 * Ruft den Wert der krittyp2-Eigenschaft ab.
	 *
	 * @return possible object is {@link String }
	 */
	public String getKRITTYP2() {
	  return krittyp2;
	}

	/**
	 * Legt den Wert der krittyp2-Eigenschaft fest.
	 *
	 * @param value
	 * 		allowed object is {@link String }
	 */
	public void setKRITTYP2(String value) {
	  this.krittyp2 = value;
	}

	/**
	 * Ruft den Wert der krittyp3-Eigenschaft ab.
	 *
	 * @return possible object is {@link String }
	 */
	public String getKRITTYP3() {
	  return krittyp3;
	}

	/**
	 * Legt den Wert der krittyp3-Eigenschaft fest.
	 *
	 * @param value
	 * 		allowed object is {@link String }
	 */
	public void setKRITTYP3(String value) {
	  this.krittyp3 = value;
	}

	/**
	 * Ruft den Wert der kritwert1-Eigenschaft ab.
	 *
	 * @return possible object is {@link String }
	 */
	public String getKRITWERT1() {
	  return kritwert1;
	}

	/**
	 * Legt den Wert der kritwert1-Eigenschaft fest.
	 *
	 * @param value
	 * 		allowed object is {@link String }
	 */
	public void setKRITWERT1(String value) {
	  this.kritwert1 = value;
	}

	/**
	 * Ruft den Wert der kritwert2-Eigenschaft ab.
	 *
	 * @return possible object is {@link String }
	 */
	public String getKRITWERT2() {
	  return kritwert2;
	}

	/**
	 * Legt den Wert der kritwert2-Eigenschaft fest.
	 *
	 * @param value
	 * 		allowed object is {@link String }
	 */
	public void setKRITWERT2(String value) {
	  this.kritwert2 = value;
	}

	/**
	 * Ruft den Wert der kritwert3-Eigenschaft ab.
	 *
	 * @return possible object is {@link String }
	 */
	public String getKRITWERT3() {
	  return kritwert3;
	}

	/**
	 * Legt den Wert der kritwert3-Eigenschaft fest.
	 *
	 * @param value
	 * 		allowed object is {@link String }
	 */
	public void setKRITWERT3(String value) {
	  this.kritwert3 = value;
	}

	/**
	 * Ruft den Wert der md5-Eigenschaft ab.
	 *
	 * @return possible object is {@link String }
	 */
	public String getMD5() {
	  return md5;
	}

	/**
	 * Legt den Wert der md5-Eigenschaft fest.
	 *
	 * @param value
	 * 		allowed object is {@link String }
	 */
	public void setMD5(String value) {
	  this.md5 = value;
	}

	/**
	 * Ruft den Wert der modul-Eigenschaft ab.
	 *
	 * @return possible object is {@link String }
	 */
	public String getMODUL() {
	  return modul;
	}

	/**
	 * Legt den Wert der modul-Eigenschaft fest.
	 *
	 * @param value
	 * 		allowed object is {@link String }
	 */
	public void setMODUL(String value) {
	  this.modul = value;
	}

	/**
	 * Ruft den Wert der messageID-Eigenschaft ab.
	 *
	 * @return possible object is {@link String }
	 */
	public String getMessageID() {
	  return messageID;
	}

	/**
	 * Legt den Wert der messageID-Eigenschaft fest.
	 *
	 * @param value
	 * 		allowed object is {@link String }
	 */
	public void setMessageID(String value) {
	  this.messageID = value;
	}

	/**
	 * Ruft den Wert der mod-Eigenschaft ab.
	 *
	 * @return possible object is {@link ModEnum }
	 */
	public ModEnum getMod() {
	  return mod;
	}

	/**
	 * Legt den Wert der mod-Eigenschaft fest.
	 *
	 * @param value
	 * 		allowed object is {@link ModEnum }
	 */
	public void setMod(ModEnum value) {
	  this.mod = value;
	}

	/**
	 * Ruft den Wert der opt1-Eigenschaft ab.
	 *
	 * @return possible object is {@link String }
	 */
	public String getOPT1() {
	  return opt1;
	}

	/**
	 * Legt den Wert der opt1-Eigenschaft fest.
	 *
	 * @param value
	 * 		allowed object is {@link String }
	 */
	public void setOPT1(String value) {
	  this.opt1 = value;
	}

	/**
	 * Ruft den Wert der opt2-Eigenschaft ab.
	 *
	 * @return possible object is {@link String }
	 */
	public String getOPT2() {
	  return opt2;
	}

	/**
	 * Legt den Wert der opt2-Eigenschaft fest.
	 *
	 * @param value
	 * 		allowed object is {@link String }
	 */
	public void setOPT2(String value) {
	  this.opt2 = value;
	}

	/**
	 * Ruft den Wert der opt3-Eigenschaft ab.
	 *
	 * @return possible object is {@link String }
	 */
	public String getOPT3() {
	  return opt3;
	}

	/**
	 * Legt den Wert der opt3-Eigenschaft fest.
	 *
	 * @param value
	 * 		allowed object is {@link String }
	 */
	public void setOPT3(String value) {
	  this.opt3 = value;
	}

	/**
	 * Ruft den Wert der opt4-Eigenschaft ab.
	 *
	 * @return possible object is {@link String }
	 */
	public String getOPT4() {
	  return opt4;
	}

	/**
	 * Legt den Wert der opt4-Eigenschaft fest.
	 *
	 * @param value
	 * 		allowed object is {@link String }
	 */
	public void setOPT4(String value) {
	  this.opt4 = value;
	}

	/**
	 * Ruft den Wert der opt5-Eigenschaft ab.
	 *
	 * @return possible object is {@link String }
	 */
	public String getOPT5() {
	  return opt5;
	}

	/**
	 * Legt den Wert der opt5-Eigenschaft fest.
	 *
	 * @param value
	 * 		allowed object is {@link String }
	 */
	public void setOPT5(String value) {
	  this.opt5 = value;
	}

	/**
	 * Ruft den Wert der opt6-Eigenschaft ab.
	 *
	 * @return possible object is {@link String }
	 */
	public String getOPT6() {
	  return opt6;
	}

	/**
	 * Legt den Wert der opt6-Eigenschaft fest.
	 *
	 * @param value
	 * 		allowed object is {@link String }
	 */
	public void setOPT6(String value) {
	  this.opt6 = value;
	}

	/**
	 * Ruft den Wert der opt7-Eigenschaft ab.
	 *
	 * @return possible object is {@link String }
	 */
	public String getOPT7() {
	  return opt7;
	}

	/**
	 * Legt den Wert der opt7-Eigenschaft fest.
	 *
	 * @param value
	 * 		allowed object is {@link String }
	 */
	public void setOPT7(String value) {
	  this.opt7 = value;
	}

	/**
	 * Ruft den Wert der opt8-Eigenschaft ab.
	 *
	 * @return possible object is {@link String }
	 */
	public String getOPT8() {
	  return opt8;
	}

	/**
	 * Legt den Wert der opt8-Eigenschaft fest.
	 *
	 * @param value
	 * 		allowed object is {@link String }
	 */
	public void setOPT8(String value) {
	  this.opt8 = value;
	}

	/**
	 * Ruft den Wert der org-Eigenschaft ab.
	 *
	 * @return possible object is {@link String }
	 */
	public String getOrg() {
	  return org;
	}

	/**
	 * Legt den Wert der org-Eigenschaft fest.
	 *
	 * @param value
	 * 		allowed object is {@link String }
	 */
	public void setOrg(String value) {
	  this.org = value;
	}

	/**
	 * Ruft den Wert der protLogID-Eigenschaft ab.
	 *
	 * @return possible object is {@link String }
	 */
	public String getProtLogID() {
	  return protLogID;
	}

	/**
	 * Legt den Wert der protLogID-Eigenschaft fest.
	 *
	 * @param value
	 * 		allowed object is {@link String }
	 */
	public void setProtLogID(String value) {
	  this.protLogID = value;
	}

	/**
	 * Ruft den Wert der protokollierungspflicht-Eigenschaft ab.
	 *
	 * @return possible object is {@link Protokollierungspflicht }
	 */
	public Protokollierungspflicht getProtokollierungspflicht() {
	  return protokollierungspflicht;
	}

	/**
	 * Legt den Wert der protokollierungspflicht-Eigenschaft fest.
	 *
	 * @param value
	 * 		allowed object is {@link Protokollierungspflicht }
	 */
	public void setProtokollierungspflicht(Protokollierungspflicht value) {
	  this.protokollierungspflicht = value;
	}

	/**
	 * Ruft den Wert der quellsystemID-Eigenschaft ab.
	 *
	 * @return possible object is {@link String }
	 */
	public String getQuellsystemID() {
	  return quellsystemID;
	}

	/**
	 * Legt den Wert der quellsystemID-Eigenschaft fest.
	 *
	 * @param value
	 * 		allowed object is {@link String }
	 */
	public void setQuellsystemID(String value) {
	  this.quellsystemID = value;
	}

	/**
	 * Ruft den Wert der systemumgebung-Eigenschaft ab.
	 *
	 * @return possible object is {@link String }
	 */
	public String getSystemumgebung() {
	  return systemumgebung;
	}

	/**
	 * Legt den Wert der systemumgebung-Eigenschaft fest.
	 *
	 * @param value
	 * 		allowed object is {@link String }
	 */
	public void setSystemumgebung(String value) {
	  this.systemumgebung = value;
	}

	/**
	 * Ruft den Wert der traegerverursacherid-Eigenschaft ab.
	 *
	 * @return possible object is {@link String }
	 */
	public String getTRAEGERVERURSACHERID() {
	  return traegerverursacherid;
	}

	/**
	 * Legt den Wert der traegerverursacherid-Eigenschaft fest.
	 *
	 * @param value
	 * 		allowed object is {@link String }
	 */
	public void setTRAEGERVERURSACHERID(String value) {
	  this.traegerverursacherid = value;
	}

	/**
	 * Ruft den Wert der trackingID-Eigenschaft ab.
	 *
	 * @return possible object is {@link BigInteger }
	 */
	public BigInteger getTrackingID() {
	  return trackingID;
	}

	/**
	 * Legt den Wert der trackingID-Eigenschaft fest.
	 *
	 * @param value
	 * 		allowed object is {@link BigInteger }
	 */
	public void setTrackingID(BigInteger value) {
	  this.trackingID = value;
	}

	/**
	 * Ruft den Wert der trans-Eigenschaft ab.
	 *
	 * @return possible object is {@link String }
	 */
	public String getTrans() {
	  return trans;
	}

	/**
	 * Legt den Wert der trans-Eigenschaft fest.
	 *
	 * @param value
	 * 		allowed object is {@link String }
	 */
	public void setTrans(String value) {
	  this.trans = value;
	}

	/**
	 * Ruft den Wert der transKurz-Eigenschaft ab.
	 *
	 * @return possible object is {@link String }
	 */
	public String getTransKurz() {
	  return transKurz;
	}

	/**
	 * Legt den Wert der transKurz-Eigenschaft fest.
	 *
	 * @param value
	 * 		allowed object is {@link String }
	 */
	public void setTransKurz(String value) {
	  this.transKurz = value;
	}

	/**
	 * Ruft den Wert der vstr-Eigenschaft ab.
	 *
	 * @return possible object is {@link String }
	 */
	public String getVSTR() {
	  return vstr;
	}

	/**
	 * Legt den Wert der vstr-Eigenschaft fest.
	 *
	 * @param value
	 * 		allowed object is {@link String }
	 */
	public void setVSTR(String value) {
	  this.vstr = value;
	}

	/**
	 * Ruft den Wert der version-Eigenschaft ab.
	 */
	public int getVersion() {
	  return version;
	}

	/**
	 * Legt den Wert der version-Eigenschaft fest.
	 */
	public void setVersion(int value) {
	  this.version = value;
	}
  }
}
