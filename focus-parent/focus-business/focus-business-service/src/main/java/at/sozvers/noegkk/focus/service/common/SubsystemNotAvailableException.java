package at.sozvers.noegkk.focus.service.common;

public class SubsystemNotAvailableException extends RuntimeException {

  public SubsystemNotAvailableException(Throwable e) {
	super("Subsystem nicht erreichbar!", e);
  }
}

