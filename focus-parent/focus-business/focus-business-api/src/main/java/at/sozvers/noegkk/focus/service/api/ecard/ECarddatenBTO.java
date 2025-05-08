package at.sozvers.noegkk.focus.service.api.ecard;

import java.time.LocalDate;
import at.sozvers.noegkk.focus.service.api.common.BaseBTO;
import at.sozvers.noegkk.focus.service.api.common.xml.LocalDateAdapter;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlAccessorType(XmlAccessType.FIELD)
public class ECarddatenBTO implements BaseBTO {

  @XmlJavaTypeAdapter(value=LocalDateAdapter.class)
  private LocalDate ausstellungsDatum;
  @XmlJavaTypeAdapter(value=LocalDateAdapter.class)
  private LocalDate endeDatum;
  private String    laufnummer;
  @XmlJavaTypeAdapter(value=LocalDateAdapter.class)
  private LocalDate letzteKonsultation;

  public LocalDate getAusstellungsDatum() {
	return ausstellungsDatum;
  }

  public void setAusstellungsDatum(LocalDate ausstellungsDatum) {
	this.ausstellungsDatum = ausstellungsDatum;
  }

  public LocalDate getEndeDatum() {return endeDatum;}

  public void setEndeDatum(LocalDate endeDatum) {this.endeDatum = endeDatum;}

  public String getLaufnummer() {
	return laufnummer;
  }

  public void setLaufnummer(String laufnummer) {
	this.laufnummer = laufnummer;
  }

  public LocalDate getLetzteKonsultation() {
	return letzteKonsultation;
  }

  public void setLetzteKonsultation(LocalDate letzteKonsultation) {
	this.letzteKonsultation = letzteKonsultation;
  }
}
