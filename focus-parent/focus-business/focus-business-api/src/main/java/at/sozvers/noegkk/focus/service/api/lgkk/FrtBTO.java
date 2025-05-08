package at.sozvers.noegkk.focus.service.api.lgkk;

import java.time.LocalDate;
import at.sozvers.noegkk.focus.service.api.common.BaseBTO;
import at.sozvers.noegkk.focus.service.api.common.xml.LocalDateAdapter;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlAccessorType(XmlAccessType.FIELD)
public class FrtBTO implements BaseBTO {
  private String    status;
  @XmlJavaTypeAdapter(value=LocalDateAdapter.class)
  private LocalDate transportDat;

  public String getStatus() {
	return status;
  }

  public void setStatus(String status) {
	this.status = status;
  }

  public LocalDate getTransportDat() {
	return transportDat;
  }

  public void setTransportDat(LocalDate transportDat) {
	this.transportDat = transportDat;
  }
}
