package at.sozvers.noegkk.focus.service.common;

public class SubSubSystemNotAvailable extends RuntimeException {

  public SubSubSystemNotAvailable(String s) {
	super("Ein oder mehrere Subsysteme der aufgerufenen Schnittstselle sind nicht erreichbar: \n" + s);
  }
}
