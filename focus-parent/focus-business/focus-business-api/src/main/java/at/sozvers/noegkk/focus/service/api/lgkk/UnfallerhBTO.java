package at.sozvers.noegkk.focus.service.api.lgkk;

import java.time.LocalDate;
import at.sozvers.noegkk.focus.service.api.common.BaseBTO;
import at.sozvers.noegkk.focus.service.api.common.xml.LocalDateAdapter;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlAccessorType(XmlAccessType.FIELD)
public class UnfallerhBTO implements BaseBTO {
  @XmlJavaTypeAdapter(value=LocalDateAdapter.class)
  private LocalDate eingelagtDat;
  @XmlJavaTypeAdapter(value=LocalDateAdapter.class)
  private LocalDate erstellDat;
  @XmlJavaTypeAdapter(value=LocalDateAdapter.class)
  private LocalDate urgenz1Dat;
  @XmlJavaTypeAdapter(value=LocalDateAdapter.class)
  private LocalDate urgenz2Dat;

  public LocalDate getEingelagtDat() {
	return eingelagtDat;
  }

  public void setEingelagtDat(LocalDate eingelagtDat) {
	this.eingelagtDat = eingelagtDat;
  }

  public LocalDate getErstellDat() {
	return erstellDat;
  }

  public void setErstellDat(LocalDate erstellDat) {
	this.erstellDat = erstellDat;
  }

  public LocalDate getUrgenz1Dat() {
	return urgenz1Dat;
  }

  public void setUrgenz1Dat(LocalDate urgenz1Dat) {
	this.urgenz1Dat = urgenz1Dat;
  }

  public LocalDate getUrgenz2Dat() {
	return urgenz2Dat;
  }

  public void setUrgenz2Dat(LocalDate urgenz2Dat) {
	this.urgenz2Dat = urgenz2Dat;
  }
}
