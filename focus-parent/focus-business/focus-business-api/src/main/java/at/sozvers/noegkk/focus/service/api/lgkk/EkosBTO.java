package at.sozvers.noegkk.focus.service.api.lgkk;

import java.time.LocalDate;
import at.sozvers.noegkk.focus.service.api.common.BaseBTO;
import at.sozvers.noegkk.focus.service.api.common.xml.LocalDateAdapter;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlAccessorType(XmlAccessType.FIELD)
public class EkosBTO implements BaseBTO {
  private String    antragStatus;
  @XmlJavaTypeAdapter(value=LocalDateAdapter.class)
  private LocalDate eingelangtDat;

  public String getAntragStatus() {
	return antragStatus;
  }

  public void setAntragStatus(String antragStatus) {
	this.antragStatus = antragStatus;
  }

  public LocalDate getEingelangtDat() {
	return eingelangtDat;
  }

  public void setEingelangtDat(LocalDate eingelangtDat) {
	this.eingelangtDat = eingelangtDat;
  }
}
