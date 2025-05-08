package at.sozvers.focus.persistence.focus;

import java.io.Serializable;
import java.util.Date;
import at.sozvers.focus.persistence.QueryConstants;
import jakarta.persistence.*;

//@formatter:off
@Entity
@Table(name = "focus_qualifikation")
@NamedQuery(
		name = FocusQualifikation.QUERY_QUALIFIKATION_ZU_QUALIFIKATIONSCODE,
		query = "SELECT f " 
		      + "FROM FocusQualifikation f " 
			  + "WHERE f.qualifikation = :" + QueryConstants.QUERY_PARAMETER_QUALIFIKATIONSCODE)
//@formatter:on
public class FocusQualifikation implements Serializable {
  public static final  String QUERY_QUALIFIKATION_ZU_QUALIFIKATIONSCODE = "queryQualifikationZuQualifikationsCode";
  private static final long   serialVersionUID                          = 1L;
  private              Date   erstellTs;
  private              String ersteller;
  private              String kurzbeschreibung;
  private              String letztaend;
  private              Date   letztaendTs;
  private              String qualifikation;
  private              Long   updatecount;

  public FocusQualifikation() {
	//Default Constructor
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

  public String getKurzbeschreibung() {
	return this.kurzbeschreibung;
  }

  public void setKurzbeschreibung(String kurzbeschreibung) {
	this.kurzbeschreibung = kurzbeschreibung;
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
  public String getQualifikation() {
	return this.qualifikation;
  }

  public void setQualifikation(String qualifikation) {
	this.qualifikation = qualifikation;
  }

  public Long getUpdatecount() {
	return this.updatecount;
  }

  public void setUpdatecount(Long updatecount) {
	this.updatecount = updatecount;
  }
}
