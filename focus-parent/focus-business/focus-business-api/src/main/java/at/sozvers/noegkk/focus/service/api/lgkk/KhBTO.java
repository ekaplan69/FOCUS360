package at.sozvers.noegkk.focus.service.api.lgkk;

import java.time.LocalDate;
import at.sozvers.noegkk.focus.service.api.common.BaseBTO;
import at.sozvers.noegkk.focus.service.api.common.xml.LocalDateAdapter;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlAccessorType(XmlAccessType.FIELD)
public class KhBTO implements BaseBTO {
  private String    aufnahmeArt;
  @XmlJavaTypeAdapter(value=LocalDateAdapter.class)
  private LocalDate lbisDat;
  private String    leName;
  @XmlJavaTypeAdapter(value=LocalDateAdapter.class)
  private LocalDate lvonDat;
  private String    vpnr;

  public String getAufnahmeArt() {
	return aufnahmeArt;
  }

  public void setAufnahmeArt(String aufnahmeArt) {
	this.aufnahmeArt = aufnahmeArt;
  }

  public LocalDate getLbisDat() {
	return lbisDat;
  }

  public void setLbisDat(LocalDate lbisDat) {
	this.lbisDat = lbisDat;
  }

  public String getLeName() {
	return leName;
  }

  public void setLeName(String leName) {
	this.leName = leName;
  }

  public LocalDate getLvonDat() {
	return lvonDat;
  }

  public void setLvonDat(LocalDate lvonDat) {
	this.lvonDat = lvonDat;
  }

  public String getVpnr() {
	return vpnr;
  }

  public void setVpnr(String vpnr) {
	this.vpnr = vpnr;
  }
}
