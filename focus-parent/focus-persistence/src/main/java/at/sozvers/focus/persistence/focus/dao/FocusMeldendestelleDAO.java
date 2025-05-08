package at.sozvers.focus.persistence.focus.dao;

import java.io.Serializable;
import at.sozvers.focus.persistence.QueryConstants;
import at.sozvers.focus.persistence.focus.FocusMeldendestelle;
import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

@Dependent
public class FocusMeldendestelleDAO implements Serializable {

  @Inject
  private EntityManager em;

  public String getMeldendestelleKurzbezeichnung(String id) {
	return getMeldendeStelleString(id, false);
  }

  private String getMeldendeStelleString(String id, boolean idPrefix) {
	FocusMeldendestelle meldendestelle = getFocusMeldendestelleTypedQuery(id).getSingleResult();

	if(idPrefix) {
	  return id + " - " + meldendestelle.getKurzbezeichnung();
	} else {
	  return meldendestelle.getKurzbezeichnung();
	}
  }

  private TypedQuery<FocusMeldendestelle> getFocusMeldendestelleTypedQuery(String id) {
	TypedQuery<FocusMeldendestelle> tq = em.createNamedQuery(FocusMeldendestelle.QUERY_MELDENDESTELLE_KURZBEZEICHNUNG, FocusMeldendestelle.class);
	tq.setParameter(QueryConstants.QUERY_PARAMETER_KURZBEZEICHNUNG, id);
	return tq;
  }

  public String getMeldendestelleKurzbezeichnung(String id, boolean idPrefix) {
	return getMeldendeStelleString(id, idPrefix);
  }
}
