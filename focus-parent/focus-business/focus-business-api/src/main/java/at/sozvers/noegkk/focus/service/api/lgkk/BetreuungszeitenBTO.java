package at.sozvers.noegkk.focus.service.api.lgkk;

import java.time.LocalDate;
import at.sozvers.noegkk.focus.service.api.common.BaseBTO;
import at.sozvers.noegkk.focus.service.api.common.xml.LocalDateAdapter;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlAccessorType(XmlAccessType.FIELD)
public class BetreuungszeitenBTO implements BaseBTO {
  @XmlJavaTypeAdapter(value=LocalDateAdapter.class)
  private LocalDate betreuungBis;
  @XmlJavaTypeAdapter(value=LocalDateAdapter.class)
  private LocalDate betreuungVon;
  private Integer   landesstelle;
  private String    status;

  public LocalDate getBetreuungBis() {
	return betreuungBis;
  }

  public void setBetreuungBis(LocalDate betreuungBis) {
	this.betreuungBis = betreuungBis;
  }

  public LocalDate getBetreuungVon() {
	return betreuungVon;
  }

  public void setBetreuungVon(LocalDate betreuungVon) {
	this.betreuungVon = betreuungVon;
  }

  public Integer getLandesstelle() {
	return landesstelle;
  }

  public void setLandesstelle(Integer landesstelle) {
	this.landesstelle = landesstelle;
  }

  public String getStatus() {
	return status;
  }

  public void setStatus(String status) {
	this.status = status;
  }
}
