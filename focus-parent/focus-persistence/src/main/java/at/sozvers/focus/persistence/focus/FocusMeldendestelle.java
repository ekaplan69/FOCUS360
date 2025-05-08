package at.sozvers.focus.persistence.focus;

import java.io.Serializable;
import java.util.Date;
import at.sozvers.focus.persistence.QueryConstants;
import jakarta.persistence.*;

@Entity
@Table(name="focus_meldendestelle")
@NamedQuery(name=FocusMeldendestelle.QUERY_MELDENDESTELLE_KURZBEZEICHNUNG,
			query="SELECT f " + "FROM FocusMeldendestelle f " + "WHERE f.meldendestelle = :" + QueryConstants.QUERY_PARAMETER_KURZBEZEICHNUNG)
public class FocusMeldendestelle implements Serializable {
  public static final  String QUERY_MELDENDESTELLE_KURZBEZEICHNUNG = "queryMeldendestelleKurzbezeichnung";
  private static final long   serialVersionUID                     = 1L;
  private              Date   erstellTs;
  private              String ersteller;
  private              String kurzbezeichnung;
  private              String langbezeichnung;
  private              String letztaend;
  private              Date   letztaendTs;
  private              String meldendestelle;
  private              Long   updatecount;

  public FocusMeldendestelle() {
	//Default Constructor
  }

  @Temporal(TemporalType.DATE)
  @Column(name="erstell_ts")
  public Date getErstellTs() {
	return erstellTs;
  }

  public void setErstellTs(Date erstellTs) {
	this.erstellTs = erstellTs;
  }

  public String getErsteller() {
	return ersteller;
  }

  public void setErsteller(String ersteller) {
	this.ersteller = ersteller;
  }

  public String getKurzbezeichnung() {
	return kurzbezeichnung;
  }

  public void setKurzbezeichnung(String kurzbezeichnung) {
	this.kurzbezeichnung = kurzbezeichnung;
  }

  public String getLangbezeichnung() {
	return langbezeichnung;
  }

  public void setLangbezeichnung(String langbezeichnung) {
	this.langbezeichnung = langbezeichnung;
  }

  public String getLetztaend() {
	return letztaend;
  }

  public void setLetztaend(String letztaend) {
	this.letztaend = letztaend;
  }

  @Temporal(TemporalType.DATE)
  @Column(name="letztaend_ts")
  public Date getLetztaendTs() {
	return letztaendTs;
  }

  public void setLetztaendTs(Date letztaendTs) {
	this.letztaendTs = letztaendTs;
  }

  @Id
  public String getMeldendestelle() {
	return meldendestelle;
  }

  public void setMeldendestelle(String meldendestelle) {
	this.meldendestelle = meldendestelle;
  }

  public Long getUpdatecount() {
	return updatecount;
  }

  public void setUpdatecount(Long updatecount) {
	this.updatecount = updatecount;
  }
}
