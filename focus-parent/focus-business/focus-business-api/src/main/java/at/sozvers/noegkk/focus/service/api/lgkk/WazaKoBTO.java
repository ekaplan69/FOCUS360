package at.sozvers.noegkk.focus.service.api.lgkk;

import java.time.LocalDate;
import at.sozvers.noegkk.focus.service.api.common.BaseBTO;
import at.sozvers.noegkk.focus.service.api.common.xml.LocalDateAdapter;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlAccessorType(XmlAccessType.FIELD)
public class WazaKoBTO implements BaseBTO {
  @XmlJavaTypeAdapter(value=LocalDateAdapter.class)
  private LocalDate antragDat;
  private String    status;

  public LocalDate getAntragDat() {
	return antragDat;
  }

  public void setAntragDat(LocalDate antragDat) {
	this.antragDat = antragDat;
  }

  public String getStatus() {
	return status;
  }

  public void setStatus(String status) {
	this.status = status;
  }
}
