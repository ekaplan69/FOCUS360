package at.sozvers.focus.scheduling.error;

public class AcquireLockFailed extends Exception {

  private static final long serialVersionUID = 1L;

  private final String owner;

  public AcquireLockFailed(String owner) {
	super("Acquire lock failed: already owned by " + owner);
	this.owner = owner;
  }

  public AcquireLockFailed(String msg, Exception e) {
	super(msg, e);
	this.owner = null;
  }

  public String getOwner() {
	return owner;
  }
}
