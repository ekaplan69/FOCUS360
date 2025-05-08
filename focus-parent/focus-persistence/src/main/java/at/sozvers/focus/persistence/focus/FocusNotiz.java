package at.sozvers.focus.persistence.focus;

import java.io.Serializable;
import java.util.Date;
import at.sozvers.focus.persistence.QueryConstants;
import jakarta.persistence.*;

@Entity
@Table(name="focus_notiz")
@NamedQuery(name="notizByVSNR",
			query="SELECT f FROM FocusNotiz f WHERE f.fachschluesselartkurz =:" + QueryConstants.QUERY_PARAMETER_FACHSCHLUESSEL_ART + " AND f.fachschluessel =:" + QueryConstants.QUERY_PARAMETER_FACHSCHLUESSEL)
public class FocusNotiz implements Serializable {
  public static final  String QUERY_NOTIZ_BY_VSNR = "notizByVSNR";
  private static final long   serialVersionUID    = 1L;
  @Column(name="erstell_ts")
  private              Date   erstellTs;
  private              String ersteller;
  private              String fachschluessel;
  private              String fachschluesselartkurz;
  @Id
  @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="focus_notiz_s")
  @SequenceGenerator(name="focus_notiz_s", sequenceName="focus_notiz_s", initialValue=1, allocationSize=1)
  private              long   id;
  private              String letztaend;
  @Column(name="letztaend_ts")
  private              Date   letztaendTs;
  private              String text;
  private              Long   updatecount;

  public FocusNotiz() {
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

  public String getFachschluessel() {
	return this.fachschluessel;
  }

  public void setFachschluessel(String fachschluessel) {
	this.fachschluessel = fachschluessel;
  }

  public String getFachschluesselartkurz() {
	return this.fachschluesselartkurz;
  }

  public void setFachschluesselartkurz(String fachschluesselartkurz) {
	this.fachschluesselartkurz = fachschluesselartkurz;
  }

  public long getId() {
	return this.id;
  }

  public void setId(long id) {
	this.id = id;
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

  public String getText() {
	return this.text;
  }

  public void setText(String text) {
	this.text = text;
  }

  public Long getUpdatecount() {
	return this.updatecount;
  }

  public void setUpdatecount(Long updatecount) {
	this.updatecount = updatecount;
  }
}
