package at.sozvers.noegkk.focus.interceptors;

import at.sozvers.noegkk.focus.rest.api.common.MeldungDTO;
import at.sozvers.noegkk.focus.service.common.*;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ExceptionRestMapper {

  private static final String          fehlerId = "error.exception.fehlerid";
  @Inject
  private              MessageProvider messageProvider;

  public MeldungDTO map(Exception e) {
	if(e instanceof SubSubSystemNotAvailable) {
	  return MeldungDTO.of(messageProvider.getMessage(fehlerId), messageProvider.getMessage("error.subsystem.notreachable"), e.getMessage());
	}

	if(e instanceof SubsystemNotAvailableException) {
	  return MeldungDTO.of(messageProvider.getMessage(fehlerId), messageProvider.getMessage("error.subsystem.notreachable"), null);
	}

	if(e instanceof NotAuthorizedException) {
	  return MeldungDTO.of(messageProvider.getMessage(fehlerId), messageProvider.getMessage("error.subsystem.notreachable"), e.getMessage());
	}

	String message = e.getMessage();

	if(message == null) {
	  message = e.getClass().getName();
	}

	return MeldungDTO.of(messageProvider.getMessage(fehlerId), messageProvider.getMessage("error.exception.fehlerkategorie"), message);
  }
}
