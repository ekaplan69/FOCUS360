package at.sozvers.noegkk.focus.service.kva.abzsuc;

import at.sozvers.focus.persistence.QueryConstants;
import at.sozvers.focus.persistence.focus.FocusSteuerung;
import at.sozvers.noegkk.focus.ws.client.kva.abzsuc.*;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

public abstract class AbzsucService {

  @Inject
  protected AbzsucLesenRequestFactory abzsucLesenRequestFactory;
  @Inject
  protected EntityManager             em;
  @Inject
  @KVAAbzsucService
  protected KvaAbzsucClient           kvaAbzsucClient;

  public FocusSteuerung getFocusSteuerungQueryResult(String parameter) {
	TypedQuery<FocusSteuerung> query = em.createNamedQuery(FocusSteuerung.QUERY_STEUERUNG_PARAMETER, FocusSteuerung.class);
	query.setParameter(QueryConstants.QUERY_PARAMETER_PARAMETER, parameter);
	return query.getSingleResult();
  }
}
