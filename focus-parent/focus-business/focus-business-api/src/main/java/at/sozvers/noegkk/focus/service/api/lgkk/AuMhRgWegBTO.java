package at.sozvers.noegkk.focus.service.api.lgkk;

import java.time.LocalDate;
import at.sozvers.noegkk.focus.service.api.common.BaseBTO;
import at.sozvers.noegkk.focus.service.api.common.xml.LocalDateAdapter;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlAccessorType(XmlAccessType.FIELD)
public class AuMhRgWegBTO implements BaseBTO {
  @XmlJavaTypeAdapter(value=LocalDateAdapter.class)
  private LocalDate anweisungDat;
  @XmlJavaTypeAdapter(value=LocalDateAdapter.class)
  private LocalDate lbisDat;
  private String    lgebiet;
  @XmlJavaTypeAdapter(value=LocalDateAdapter.class)
  private LocalDate lvonDat;
  private String    status;

  public LocalDate getAnweisungDat() {
	return anweisungDat;
  }

  public void setAnweisungDat(LocalDate anweisungDat) {
	this.anweisungDat = anweisungDat;
  }

  public LocalDate getLbisDat() {
	return lbisDat;
  }

  public void setLbisDat(LocalDate lbisDat) {
	this.lbisDat = lbisDat;
  }

  public String getLgebiet() {
	return lgebiet;
  }

  public void setLgebiet(String lgebiet) {
	this.lgebiet = lgebiet;
  }

  public LocalDate getLvonDat() {
	return lvonDat;
  }

  public void setLvonDat(LocalDate lvonDat) {
	this.lvonDat = lvonDat;
  }

  public String getStatus() {
	return status;
  }

  public void setStatus(String status) {
	this.status = status;
  }
}
