package at.sozvers.stp.lgkk.webservice.focus360.v20;

import java.util.ArrayList;
import java.util.List;
import at.itsv.services.lgkk.StandardResponse;
import jakarta.xml.bind.annotation.*;

/**
 * <p>Java-Klasse für Focus360ResponseV2 complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="Focus360ResponseV2">
 *   &lt;complexContent>
 *     &lt;extension base="{http://types.services.itsv.at/}standardResponse">
 *       &lt;sequence>
 *         &lt;element name="wahWaza" type="{http://v20.focus360.webservice.lgkk.stp.sozvers.at/}Focus360WahWazaElementV2Dto" minOccurs="0"/>
 *         &lt;element name="ekos" type="{http://v20.focus360.webservice.lgkk.stp.sozvers.at/}Focus360EkosElementV2Dto" minOccurs="0"/>
 *         &lt;element name="unfallerh" type="{http://v20.focus360.webservice.lgkk.stp.sozvers.at/}Focus360UnfallerhElementV2Dto" minOccurs="0"/>
 *         &lt;element name="frt" type="{http://v20.focus360.webservice.lgkk.stp.sozvers.at/}Focus360FrtElementV2Dto" minOccurs="0"/>
 *         &lt;element name="wazaKo" type="{http://v20.focus360.webservice.lgkk.stp.sozvers.at/}Focus360WazaKoElementV2Dto" minOccurs="0"/>
 *         &lt;element name="auMhRgWeg" type="{http://v20.focus360.webservice.lgkk.stp.sozvers.at/}Focus360AuMhRgWegElementV2Dto" minOccurs="0"/>
 *         &lt;element name="hbhm" type="{http://v20.focus360.webservice.lgkk.stp.sozvers.at/}Focus360HbHmElementV2Dto" minOccurs="0"/>
 *         &lt;element name="medSt" type="{http://v20.focus360.webservice.lgkk.stp.sozvers.at/}Focus360MedStElementV2Dto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="lohnpf" type="{http://v20.focus360.webservice.lgkk.stp.sozvers.at/}Focus360LohnpfElementV2Dto" minOccurs="0"/>
 *         &lt;element name="betreute" type="{http://v20.focus360.webservice.lgkk.stp.sozvers.at/}Focus360BetreuungszeitenElementV2Dto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="vwst" type="{http://v20.focus360.webservice.lgkk.stp.sozvers.at/}Focus360VwstElementV2Dto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="kh" type="{http://v20.focus360.webservice.lgkk.stp.sozvers.at/}Focus360KhElementV2Dto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="Focus360ResponseV2", propOrder={"wahWaza", "ekos", "unfallerh", "frt", "wazaKo", "auMhRgWeg", "hbhm", "medSt", "lohnpf", "betreute", "vwst", "kh"})
public class Focus360ResponseV2 extends StandardResponse {

  protected Focus360AuMhRgWegElementV2Dto              auMhRgWeg;
  protected List<Focus360BetreuungszeitenElementV2Dto> betreute;
  protected Focus360EkosElementV2Dto                   ekos;
  protected Focus360FrtElementV2Dto                    frt;
  protected Focus360HbHmElementV2Dto                   hbhm;
  protected Focus360KhElementV2Dto                     kh;
  protected Focus360LohnpfElementV2Dto                 lohnpf;
  protected List<Focus360MedStElementV2Dto>            medSt;
  protected Focus360UnfallerhElementV2Dto              unfallerh;
  protected List<Focus360VwstElementV2Dto>             vwst;
  protected Focus360WahWazaElementV2Dto                wahWaza;
  protected Focus360WazaKoElementV2Dto                 wazaKo;

  /**
   * Ruft den Wert der auMhRgWeg-Eigenschaft ab.
   *
   * @return possible object is {@link Focus360AuMhRgWegElementV2Dto }
   */
  public Focus360AuMhRgWegElementV2Dto getAuMhRgWeg() {
	return auMhRgWeg;
  }

  /**
   * Legt den Wert der auMhRgWeg-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link Focus360AuMhRgWegElementV2Dto }
   */
  public void setAuMhRgWeg(Focus360AuMhRgWegElementV2Dto value) {
	this.auMhRgWeg = value;
  }

  /**
   * Gets the value of the betreute property.
   *
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object. This is why there is
   * not a <CODE>set</CODE> method for the betreute property.
   *
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getBetreute().add(newItem);
   * </pre>
   *
   *
   * <p>
   * Objects of the following type(s) are allowed in the list {@link Focus360BetreuungszeitenElementV2Dto }
   */
  public List<Focus360BetreuungszeitenElementV2Dto> getBetreute() {
	if(betreute == null) {
	  betreute = new ArrayList<Focus360BetreuungszeitenElementV2Dto>();
	}
	return this.betreute;
  }

  /**
   * Ruft den Wert der ekos-Eigenschaft ab.
   *
   * @return possible object is {@link Focus360EkosElementV2Dto }
   */
  public Focus360EkosElementV2Dto getEkos() {
	return ekos;
  }

  /**
   * Legt den Wert der ekos-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link Focus360EkosElementV2Dto }
   */
  public void setEkos(Focus360EkosElementV2Dto value) {
	this.ekos = value;
  }

  /**
   * Ruft den Wert der frt-Eigenschaft ab.
   *
   * @return possible object is {@link Focus360FrtElementV2Dto }
   */
  public Focus360FrtElementV2Dto getFrt() {
	return frt;
  }

  /**
   * Legt den Wert der frt-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link Focus360FrtElementV2Dto }
   */
  public void setFrt(Focus360FrtElementV2Dto value) {
	this.frt = value;
  }

  /**
   * Ruft den Wert der hbhm-Eigenschaft ab.
   *
   * @return possible object is {@link Focus360HbHmElementV2Dto }
   */
  public Focus360HbHmElementV2Dto getHbhm() {
	return hbhm;
  }

  /**
   * Legt den Wert der hbhm-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link Focus360HbHmElementV2Dto }
   */
  public void setHbhm(Focus360HbHmElementV2Dto value) {
	this.hbhm = value;
  }

  /**
   * Ruft den Wert der kh-Eigenschaft ab.
   *
   * @return possible object is {@link Focus360KhElementV2Dto }
   */
  public Focus360KhElementV2Dto getKh() {
	return kh;
  }

  /**
   * Legt den Wert der kh-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link Focus360KhElementV2Dto }
   */
  public void setKh(Focus360KhElementV2Dto value) {
	this.kh = value;
  }

  /**
   * Ruft den Wert der lohnpf-Eigenschaft ab.
   *
   * @return possible object is {@link Focus360LohnpfElementV2Dto }
   */
  public Focus360LohnpfElementV2Dto getLohnpf() {
	return lohnpf;
  }

  /**
   * Legt den Wert der lohnpf-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link Focus360LohnpfElementV2Dto }
   */
  public void setLohnpf(Focus360LohnpfElementV2Dto value) {
	this.lohnpf = value;
  }

  /**
   * Gets the value of the medSt property.
   *
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object. This is why there is
   * not a <CODE>set</CODE> method for the medSt property.
   *
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getMedSt().add(newItem);
   * </pre>
   *
   *
   * <p>
   * Objects of the following type(s) are allowed in the list {@link Focus360MedStElementV2Dto }
   */
  public List<Focus360MedStElementV2Dto> getMedSt() {
	if(medSt == null) {
	  medSt = new ArrayList<Focus360MedStElementV2Dto>();
	}
	return this.medSt;
  }

  /**
   * Ruft den Wert der unfallerh-Eigenschaft ab.
   *
   * @return possible object is {@link Focus360UnfallerhElementV2Dto }
   */
  public Focus360UnfallerhElementV2Dto getUnfallerh() {
	return unfallerh;
  }

  /**
   * Legt den Wert der unfallerh-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link Focus360UnfallerhElementV2Dto }
   */
  public void setUnfallerh(Focus360UnfallerhElementV2Dto value) {
	this.unfallerh = value;
  }

  /**
   * Gets the value of the vwst property.
   *
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object. This is why there is
   * not a <CODE>set</CODE> method for the vwst property.
   *
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getVwst().add(newItem);
   * </pre>
   *
   *
   * <p>
   * Objects of the following type(s) are allowed in the list {@link Focus360VwstElementV2Dto }
   */
  public List<Focus360VwstElementV2Dto> getVwst() {
	if(vwst == null) {
	  vwst = new ArrayList<Focus360VwstElementV2Dto>();
	}
	return this.vwst;
  }

  /**
   * Ruft den Wert der wahWaza-Eigenschaft ab.
   *
   * @return possible object is {@link Focus360WahWazaElementV2Dto }
   */
  public Focus360WahWazaElementV2Dto getWahWaza() {
	return wahWaza;
  }

  /**
   * Legt den Wert der wahWaza-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link Focus360WahWazaElementV2Dto }
   */
  public void setWahWaza(Focus360WahWazaElementV2Dto value) {
	this.wahWaza = value;
  }

  /**
   * Ruft den Wert der wazaKo-Eigenschaft ab.
   *
   * @return possible object is {@link Focus360WazaKoElementV2Dto }
   */
  public Focus360WazaKoElementV2Dto getWazaKo() {
	return wazaKo;
  }

  /**
   * Legt den Wert der wazaKo-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link Focus360WazaKoElementV2Dto }
   */
  public void setWazaKo(Focus360WazaKoElementV2Dto value) {
	this.wazaKo = value;
  }
}
