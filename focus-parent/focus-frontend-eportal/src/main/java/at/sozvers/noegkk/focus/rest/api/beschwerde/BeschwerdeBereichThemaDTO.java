package at.sozvers.noegkk.focus.rest.api.beschwerde;

import java.util.ArrayList;
import java.util.List;
import at.sozvers.noegkk.focus.rest.api.common.BaseDTO;

public class BeschwerdeBereichThemaDTO implements BaseDTO {

  private List<BeschwerdeBereichFachbereichDTO> fachbereiche;
  private String                                themaBezeichnung;
  private String                                themaHilfetext;
  private Long                                  themaId;

  public List<BeschwerdeBereichFachbereichDTO> getFachbereiche() {
	if(fachbereiche == null) {
	  fachbereiche = new ArrayList<>();
	}

	return fachbereiche;
  }

  public String getThemaBezeichnung() {
	return themaBezeichnung;
  }

  public void setThemaBezeichnung(String themaBezeichnung) {
	this.themaBezeichnung = themaBezeichnung;
  }

  public String getThemaHilfetext() {
	return themaHilfetext;
  }

  public void setThemaHilfetext(String themaHilfetext) {
	this.themaHilfetext = themaHilfetext;
  }

  public Long getThemaId() {
	return themaId;
  }

  public void setThemaId(Long themaId) {
	this.themaId = themaId;
  }
}
