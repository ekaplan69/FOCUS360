package at.sozvers.focus.persistence.focus.dao;

import at.sozvers.focus.persistence.QueryConstants;
import at.sozvers.focus.persistence.focus.FocusNotiz;
import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;
import jakarta.persistence.*;

@Dependent
public class FocusNotizDAO {

  @Inject
  private EntityManager em;

  public FocusNotiz findNotiz(String fachschluessel, String fachschluesselArt) {
	Query q = em.createNamedQuery(FocusNotiz.QUERY_NOTIZ_BY_VSNR, FocusNotiz.class);
	q.setParameter(QueryConstants.QUERY_PARAMETER_FACHSCHLUESSEL, fachschluessel);
	q.setParameter(QueryConstants.QUERY_PARAMETER_FACHSCHLUESSEL_ART, fachschluesselArt);

	try {
	  return (FocusNotiz) q.getSingleResult();
	} catch(NoResultException ex) {
	  return null;
	}
  }
}
