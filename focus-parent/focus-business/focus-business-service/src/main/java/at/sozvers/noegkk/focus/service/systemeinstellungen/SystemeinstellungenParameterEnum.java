package at.sozvers.noegkk.focus.service.systemeinstellungen;

public enum SystemeinstellungenParameterEnum {
  SCHEDULE_SECURITY_INTERVALL("12"), INTERVALL_TRANSMIT_ZUP("1-7;0-23;*;0"), PACKAGESIZE_TRANSMIT_ZUP("160");

  private String standard;

  private SystemeinstellungenParameterEnum(String standard) {
	this.standard = standard;
  }

  public String getStandard() {
	return standard;
  }
}
