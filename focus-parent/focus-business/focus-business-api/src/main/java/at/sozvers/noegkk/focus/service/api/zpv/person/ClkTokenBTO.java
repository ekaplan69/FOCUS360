package at.sozvers.noegkk.focus.service.api.zpv.person;

import at.sozvers.noegkk.focus.service.api.common.BaseBTO;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
public class ClkTokenBTO implements BaseBTO {

  private String clkToken;

  public String getClkToken() {
	return clkToken;
  }

  public void setClkToken(String clkToken) {
	this.clkToken = clkToken;
  }
}
