package at.sozvers.noegkk.focus.service.api.lgkk;

import java.time.LocalDate;
import at.sozvers.noegkk.focus.service.api.common.BaseBTO;
import at.sozvers.noegkk.focus.service.api.common.xml.LocalDateAdapter;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Heilbehelfe und Hilfsmittel Kostenerstattung
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class HbHmBTO implements BaseBTO {
  private String    status;
  @XmlJavaTypeAdapter(value=LocalDateAdapter.class)
  private LocalDate verordnungsDat;

  public String getStatus() {
	return status;
  }

  public void setStatus(String status) {
	this.status = status;
  }

  public LocalDate getVerordnungsDat() {
	return verordnungsDat;
  }

  public void setVerordnungsDat(LocalDate verordnungsDat) {
	this.verordnungsDat = verordnungsDat;
  }
}
