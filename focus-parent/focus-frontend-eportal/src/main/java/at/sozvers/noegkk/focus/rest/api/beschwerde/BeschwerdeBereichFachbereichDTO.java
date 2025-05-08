package at.sozvers.noegkk.focus.rest.api.beschwerde;

import java.util.ArrayList;
import java.util.List;
import at.sozvers.noegkk.focus.rest.api.common.BaseDTO;

public class BeschwerdeBereichFachbereichDTO implements BaseDTO {

  private String                                      fachbereichBezeichnung;
  private List<BeschwerdeBereichFachbereichDetailDTO> fachbereichDetails;
  private String                                      fachbereichHilfetext;
  private Long                                        fachbereichId;

  public String getFachbereichBezeichnung() {
	return fachbereichBezeichnung;
  }

  public void setFachbereichBezeichnung(String fachbereichBezeichnung) {
	this.fachbereichBezeichnung = fachbereichBezeichnung;
  }

  public List<BeschwerdeBereichFachbereichDetailDTO> getFachbereichDetails() {
	if(fachbereichDetails == null) {
	  fachbereichDetails = new ArrayList<>();
	}
	return fachbereichDetails;
  }

  public String getFachbereichHilfetext() {
	return fachbereichHilfetext;
  }

  public void setFachbereichHilfetext(String fachbereichHilfetext) {
	this.fachbereichHilfetext = fachbereichHilfetext;
  }

  public Long getFachbereichId() {
	return fachbereichId;
  }

  public void setFachbereichId(Long fachbereichId) {
	this.fachbereichId = fachbereichId;
  }
}
