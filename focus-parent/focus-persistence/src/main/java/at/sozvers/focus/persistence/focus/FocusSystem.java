package at.sozvers.focus.persistence.focus;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import jakarta.persistence.*;

@Entity
@Table(name="focus_system")
public class FocusSystem implements Serializable {
  private static final long       serialVersionUID = 1L;
  private              String     beschreibung;
  private              Date       erstellTs;
  private              String     ersteller;
  private              String     letztaend;
  private              Date       letztaendTs;
  private              String     parameter;
  private              BigDecimal updatecount;
  private              String     wert;

  public FocusSystem() {
	//Default Constructor
  }

  public String getBeschreibung() {
	return this.beschreibung;
  }

  public void setBeschreibung(String beschreibung) {
	this.beschreibung = beschreibung;
  }

  @Temporal(TemporalType.DATE)
  @Column(name="erstell_ts")
  public Date getErstellTs() {
	return this.erstellTs;
  }

  public void setErstellTs(Date erstellTs) {
	this.erstellTs = erstellTs;
  }

  public String getErsteller() {
	return this.ersteller;
  }

  public void setErsteller(String ersteller) {
	this.ersteller = ersteller;
  }

  public String getLetztaend() {
	return this.letztaend;
  }

  public void setLetztaend(String letztaend) {
	this.letztaend = letztaend;
  }

  @Temporal(TemporalType.DATE)
  @Column(name="letztaend_ts")
  public Date getLetztaendTs() {
	return this.letztaendTs;
  }

  public void setLetztaendTs(Date letztaendTs) {
	this.letztaendTs = letztaendTs;
  }

  @Id
  public String getParameter() {
	return this.parameter;
  }

  public void setParameter(String parameter) {
	this.parameter = parameter;
  }

  public BigDecimal getUpdatecount() {
	return this.updatecount;
  }

  public void setUpdatecount(BigDecimal updatecount) {
	this.updatecount = updatecount;
  }

  public String getWert() {
	return this.wert;
  }

  public void setWert(String wert) {
	this.wert = wert;
  }
}
