package at.sozvers.noegkk.focus.service.common;

public class NotAuthorizedException extends RuntimeException {
  public NotAuthorizedException() {
	super("Sie haben nicht die notwendige Berechtigung");
  }

  public NotAuthorizedException(String message) {
	super(message);
  }
}
