package at.sozvers.noegkk.focus.service.api.lgkk;

import java.time.LocalDate;
import at.sozvers.noegkk.focus.service.api.common.BaseBTO;
import at.sozvers.noegkk.focus.service.api.common.xml.LocalDateAdapter;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlAccessorType(XmlAccessType.FIELD)
public class MedStBTO implements BaseBTO {

  @XmlJavaTypeAdapter(value=LocalDateAdapter.class)
  private LocalDate gueltigBisDat;
  private String    lgebiet;
  private String    stellungnahme;

  public LocalDate getGueltigBisDat() {
	return gueltigBisDat;
  }

  public void setGueltigBisDat(LocalDate gueltigBisDat) {
	this.gueltigBisDat = gueltigBisDat;
  }

  public String getLgebiet() {
	return lgebiet;
  }

  public void setLgebiet(String lgebiet) {
	this.lgebiet = lgebiet;
  }

  public String getStellungnahme() {
	return stellungnahme;
  }

  public void setStellungnahme(String stellungnahme) {
	this.stellungnahme = stellungnahme;
  }
}
