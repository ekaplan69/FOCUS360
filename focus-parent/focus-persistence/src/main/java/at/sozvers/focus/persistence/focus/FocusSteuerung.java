package at.sozvers.focus.persistence.focus;

import java.io.Serializable;
import java.util.Date;
import at.sozvers.focus.persistence.QueryConstants;
import jakarta.persistence.*;

@Entity
@Table(name="focus_steuerung")
@NamedQuery(name=FocusSteuerung.QUERY_STEUERUNG_PARAMETER, query="SELECT f " + "FROM FocusSteuerung f " + "WHERE f.parameter = :" + QueryConstants.QUERY_PARAMETER_PARAMETER)
public class FocusSteuerung implements Serializable {
  public static final  String QUERY_STEUERUNG_PARAMETER = "querySteuerungParameter";
  private static final long   serialVersionUID          = 1L;
  private              String beschreibung;
  private              Date   erstellTs;
  private              String ersteller;
  private              String letztaend;
  private              Date   letztaendTs;
  private              String parameter;
  private              Long   updatecount;
  private              String wert;

  public FocusSteuerung() {
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

  public Long getUpdatecount() {
	return this.updatecount;
  }

  public void setUpdatecount(Long updatecount) {
	this.updatecount = updatecount;
  }

  public String getWert() {
	return this.wert;
  }

  public void setWert(String wert) {
	this.wert = wert;
  }
}
