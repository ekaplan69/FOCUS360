package at.sozvers.noegkk.focus.service.api.zvd;

import java.time.LocalDate;
import at.sozvers.noegkk.focus.service.api.common.BaseBTO;
import at.sozvers.noegkk.focus.service.api.common.xml.LocalDateAdapter;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlAccessorType(XmlAccessType.FIELD)
public class VersicherungszeitBTO implements BaseBTO {

  @XmlJavaTypeAdapter(value=LocalDateAdapter.class)
  private LocalDate bisDatum;
  private String    dienstgebername;
  private String    qualifikation;
  private String    qualifikationKurz;
  @XmlJavaTypeAdapter(value=LocalDateAdapter.class)
  private LocalDate vonDatum;

  public LocalDate getBisDatum() {
	return bisDatum;
  }

  public void setBisDatum(LocalDate bisDatum) {
	this.bisDatum = bisDatum;
  }

  public String getDienstgebername() {
	return dienstgebername;
  }

  public void setDienstgebername(String dienstgebername) {
	this.dienstgebername = dienstgebername;
  }

  public String getQualifikation() {
	return qualifikation;
  }

  public void setQualifikation(String qualifikation) {
	this.qualifikation = qualifikation;
  }

  public String getQualifikationKurz() {
	return qualifikationKurz;
  }

  public void setQualifikationKurz(String qualifikationKurz) {
	this.qualifikationKurz = qualifikationKurz;
  }

  public LocalDate getVonDatum() {
	return vonDatum;
  }

  public void setVonDatum(LocalDate vonDatum) {
	this.vonDatum = vonDatum;
  }
}
