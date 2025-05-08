package at.sozvers.noegkk.focus.service.api.zpv.person;

import at.sozvers.noegkk.focus.service.api.common.BaseBTO;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
public class ClkSuchergebnisBTO implements BaseBTO {

  private String partnerId;

  public String getPartnerId() {
	return partnerId;
  }

  public void setPartnerId(String partnerId) {
	this.partnerId = partnerId;
  }
}
