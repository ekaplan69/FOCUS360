package at.sozvers.noegkk.focus.service.notiz;

import java.util.Date;
import at.itsv.berez.principal.BerezPrincipal;
import at.sozvers.focus.persistence.focus.FocusNotiz;
import at.sozvers.focus.persistence.focus.dao.FocusNotizDAO;
import at.sozvers.noegkk.focus.service.api.notiz.NotizBTO;
import at.sozvers.noegkk.focus.service.common.Fachschluessel;
import at.sozvers.noegkk.focus.service.common.MessageProvider;
import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Dependent
@Transactional(Transactional.TxType.REQUIRES_NEW)
public class NotizService {

  @Inject
  BerezPrincipal berezPrincipal;
  @Inject
  private FocusNotizDAO   dao;
  @Inject
  private EntityManager   em;
  @Inject
  private MessageProvider messageProvider;

  public NotizBTO readNotizByFachschluessel(Fachschluessel fachschluessel) {
	FocusNotiz queryResult = dao.findNotiz(fachschluessel.getFachschluessel(), fachschluessel.getFachschluesselArt());
	if(queryResult == null) {
	  return null;
	}
	NotizBTO notizBTO = new NotizBTO();
	notizBTO.setId(queryResult.getId());
	notizBTO.setText(queryResult.getText());
	notizBTO.setUpdateCount(queryResult.getUpdatecount());
	notizBTO.setFachschluesselArt(fachschluessel.getFachschluesselArt());
	notizBTO.setFachSchluessel(fachschluessel.getFachschluessel());
	return notizBTO;
  }

  public Long updateNotizForFachschluessel(Fachschluessel fachschluessel, String notizText, long updateCount) {
	FocusNotiz notiz = dao.findNotiz(fachschluessel.getFachschluessel(), fachschluessel.getFachschluesselArt());
	if(notiz == null) {
	  return createNotizForFachschluessel(fachschluessel, notizText);
	}

	if(notiz.getUpdatecount() != updateCount) {
	  throw new IllegalArgumentException(messageProvider.getMessage("error.notiz.changed"));
	}

	notiz.setText(notizText);
	notiz.setLetztaendTs(new Date());
	notiz.setLetztaend(berezPrincipal.benutzername());
	notiz.setUpdatecount(notiz.getUpdatecount() + 1L);

	return notiz.getId();
  }

  public Long createNotizForFachschluessel(Fachschluessel fachschluessel, String notizText) {
	FocusNotiz notiz = dao.findNotiz(fachschluessel.getFachschluessel(), fachschluessel.getFachschluesselArt());
	if(notiz != null) {
	  throw new IllegalArgumentException(messageProvider.getMessage("error.notiz.alreadyExists"));
	} else {
	  notiz = new FocusNotiz();
	  notiz.setFachschluesselartkurz(fachschluessel.getFachschluesselArt());
	  notiz.setFachschluessel(fachschluessel.getFachschluessel());
	  notiz.setText(notizText);
	  notiz.setErsteller(berezPrincipal.benutzername());
	  notiz.setErstellTs(new Date());
	  notiz.setLetztaend(berezPrincipal.benutzername());
	  notiz.setLetztaendTs(new Date());
	  notiz.setUpdatecount(0L);

	  notiz = em.merge(notiz);

	  return notiz.getId();
	}
  }
}
