package at.sozvers.noegkk.focus.service.context;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedList;
import java.util.List;
import at.sozialversicherung.schema.zpv.ibs.mitarbeiteridentifikationlesen_7_0.DtoMitarbeiterIdentifikationListeLEO;
import at.sozialversicherung.schema.zpv.ibs.partnerlesenkurz_15_0.DtoOutput;
import at.sozialversicherung.schema.zpv.ibs.partnerlesenlang_20_0.DtoPartnerLELO;
import at.sozialversicherung.schema.zpv.ibs.partnerlesenlang_20_0.Meldung;
import at.sozvers.noegkk.focus.service.api.common.MeldungBTO;
import jakarta.enterprise.context.RequestScoped;

@RequestScoped
public class Messages {

  private List<MeldungBTO> messages;
  private String           status;

  public void addMessage(DtoOutput dto) {
	for(at.sozialversicherung.schema.zpv.ibs.partnerlesenkurz_15_0.Meldung meldung : dto.getFehlerpaket().getMeldungen()) {
	  getMessages().add(MeldungBTO.of(meldung.getId(), meldung.getKategorie(), meldung.getText()));
	}
  }

  public List<MeldungBTO> getMessages() {
	if(messages == null) {
	  messages = new LinkedList<>();
	}
	return messages;
  }

  public void addMessage(Object dto) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
	if(dto instanceof DtoPartnerLELO) {
	  addMessage((DtoPartnerLELO) dto);
	  return;
	}

	if(dto instanceof DtoMitarbeiterIdentifikationListeLEO) {
	  addMessage((DtoMitarbeiterIdentifikationListeLEO) dto);
	  return;
	}

	Method getFehlerpaket = dto.getClass().getMethod("getFehlerpaket");
	Object fehlerpaket    = getFehlerpaket.invoke(dto);

	Method       getMeldungen = fehlerpaket.getClass().getMethod("getMeldungen");
	List<Object> meldungen    = (List<Object>) getMeldungen.invoke(fehlerpaket);

	for(Object meldung : meldungen) {
	  Method getFehlerId = meldung.getClass().getMethod("getId");
	  String fehlerId    = (String) getFehlerId.invoke(meldung);

	  Method getFehlerkategorie = meldung.getClass().getMethod("getKategorie");
	  String fehlerkategorie    = (String) getFehlerkategorie.invoke(meldung);

	  Method getMeldungstext = meldung.getClass().getMethod("getText");
	  String meldungstext    = (String) getMeldungstext.invoke(meldung);

	  getMessages().add(MeldungBTO.of(fehlerId, fehlerkategorie, meldungstext));
	}
  }

  public void addMessage(DtoPartnerLELO dto) {
	for(Meldung meldung : dto.getFehlerpaket().getMeldungen()) {
	  getMessages().add(MeldungBTO.of(meldung.getId(), meldung.getKategorie(), meldung.getText()));
	}
  }

  public void addMessage(DtoMitarbeiterIdentifikationListeLEO dto) {
	for(at.sozialversicherung.schema.zpv.ibs.mitarbeiteridentifikationlesen_7_0.Meldung meldung : dto.getFehlerpaket().getMeldungen()) {
	  getMessages().add(MeldungBTO.of(meldung.getId(), meldung.getKategorie(), meldung.getText()));
	}
  }

  public String getStatus() {
	return status;
  }

  public void setStatus(String status) {
	this.status = status;
  }
}
