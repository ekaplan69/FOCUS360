package at.sozvers.noegkk.focus.service.api.kva.kvkerm;

import at.sozvers.noegkk.focus.service.api.common.BaseBTO;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
public class KvkermBTO implements BaseBTO {

  private String anspruch;
  private String schutzfrist;
  private String toleranzfrist;

  public String getAnspruch() {
	return anspruch;
  }

  public void setAnspruch(String anspruch) {
	this.anspruch = anspruch;
  }

  public String getSchutzfrist() {
	return schutzfrist;
  }

  public void setSchutzfrist(String schutzfrist) {
	this.schutzfrist = schutzfrist;
  }

  public String getToleranzfrist() {
	return toleranzfrist;
  }

  public void setToleranzfrist(String toleranzfrist) {
	this.toleranzfrist = toleranzfrist;
  }
}
