package at.sozvers.noegkk.focus.producer;

import at.sozvers.noegkk.architektur.zup.ZUPDefaultValues;
import jakarta.annotation.Resource;
import jakarta.enterprise.inject.Specializes;

@Specializes
public class FocusZupApplicationValues extends ZUPDefaultValues {
  private static final String ZUP_SYSTEMUMGEBUNG = "java:global/at/sozvers/noegkk/focus/zup/systemumgebung";

  @Resource(lookup=ZUP_SYSTEMUMGEBUNG)
  private String systemumgebung;

  @Override
  public String getApplBetreiber() {
	return "12";
  }

  @Override
  public String getApplikation() {
	return "FOCUS360";
  }

  @Override
  public String getSystemUmgebung() {
	if(systemumgebung == null) {
	  throw new IllegalArgumentException("Could not read ZUP Systemumgebung from JNDI");
	}

	return systemumgebung;
  }

  @Override
  public String getVersion() {
	return "1";
  }
}
