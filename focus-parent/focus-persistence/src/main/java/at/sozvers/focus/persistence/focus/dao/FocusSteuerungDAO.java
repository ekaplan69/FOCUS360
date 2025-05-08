package at.sozvers.focus.persistence.focus.dao;

import java.io.Serializable;
import at.sozvers.focus.persistence.QueryConstants;
import at.sozvers.focus.persistence.focus.FocusSteuerung;
import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

@Dependent
public class FocusSteuerungDAO implements Serializable {
  public static final String        BESCHWERDE_ERMITTLUNG_ZEITRAUM_START = "BESCHWERDE_ERMITTLUNG_ZEITRAUM_START";
  public static final String        DSGVO_ERMITTLUNG_ZEITRAUM_START      = "DSGVO_ERMITTLUNG_ZEITRAUM_START";
  public static final String        ECARD_ZEITRUAM_START                 = "ECARD_ERMITTLUNG_ZEITRAUM_START";
  public static final String        KONTAKT_ERMITTLUNG_ZEITRAUM_START    = "KONTAKT_ERMITTLUNG_ZEITRAUM_START";
  public static final String        LEISTUNG_ZEITRAUM_START              = "LEISTUNG_ERMITTLUNG_ZEITRAUM_START";
  @Inject
  private             EntityManager em;

  public int getDSGVOErmittlungStartZeitraum() {
	FocusSteuerung fs = getFocusSteuerungQueryResult(DSGVO_ERMITTLUNG_ZEITRAUM_START);
	return Integer.parseInt(fs.getWert());
  }

  public FocusSteuerung getFocusSteuerungQueryResult(String parameter) {
	TypedQuery<FocusSteuerung> query = em.createNamedQuery(FocusSteuerung.QUERY_STEUERUNG_PARAMETER, FocusSteuerung.class);
	query.setParameter(QueryConstants.QUERY_PARAMETER_PARAMETER, parameter);
	return query.getSingleResult();
  }

  public int getEcardStartZeitraum() {
	FocusSteuerung fs = getFocusSteuerungQueryResult(ECARD_ZEITRUAM_START);
	return Integer.parseInt(fs.getWert());
  }

  public int getLeistungErmittlungStartZeitraum() {
	FocusSteuerung fs = getFocusSteuerungQueryResult(LEISTUNG_ZEITRAUM_START);
	return Integer.parseInt(fs.getWert());
  }
}
