package at.sozvers.noegkk.focus.service.api.lgkk;

import java.time.LocalDate;
import at.sozvers.noegkk.focus.service.api.common.BaseBTO;
import at.sozvers.noegkk.focus.service.api.common.xml.LocalDateAdapter;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Verwaltungsstellungsnahme
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class VwstBTO implements BaseBTO {
  @XmlJavaTypeAdapter(value=LocalDateAdapter.class)
  private LocalDate gueltigBisDat;
  private String    leistungsType;

  public LocalDate getGueltigBisDat() {
	return gueltigBisDat;
  }

  public void setGueltigBisDat(LocalDate gueltigBisDat) {
	this.gueltigBisDat = gueltigBisDat;
  }

  public String getLeistungsType() {
	return leistungsType;
  }

  public void setLeistungsType(String leistungsType) {
	this.leistungsType = leistungsType;
  }
}
