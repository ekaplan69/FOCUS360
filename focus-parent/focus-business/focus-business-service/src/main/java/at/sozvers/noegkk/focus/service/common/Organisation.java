package at.sozvers.noegkk.focus.service.common;

public class Organisation {

  private String bereOrg;
  private Long   oeId;

  public Organisation(Long oeId, String bereOrg) {
	this.oeId = oeId;
	this.bereOrg = bereOrg;
  }

  public static Organisation of(Long oeId, String bereOrg) {
	return new Organisation(oeId, bereOrg);
  }

  public String getBereOrg() {
	return bereOrg;
  }

  public void setBereOrg(String bereOrg) {
	this.bereOrg = bereOrg;
  }

  public Long getOeId() {
	return oeId;
  }

  public void setOeId(Long oeId) {
	this.oeId = oeId;
  }
}
