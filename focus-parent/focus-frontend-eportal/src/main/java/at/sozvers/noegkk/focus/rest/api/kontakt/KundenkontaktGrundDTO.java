package at.sozvers.noegkk.focus.rest.api.kontakt;

import java.util.List;
import at.sozvers.noegkk.focus.rest.api.common.BaseDTO;

public class KundenkontaktGrundDTO implements BaseDTO {

  private List<KundenkontaktDetailDTO> kontaktdetails;
  private String                       kontaktgrundBezeichnung;
  private Long                         kontaktgrundId;

  public List<KundenkontaktDetailDTO> getKontaktdetails() {
	return kontaktdetails;
  }

  public void setKontaktdetails(List<KundenkontaktDetailDTO> kontaktdetails) {
	this.kontaktdetails = kontaktdetails;
  }

  public String getKontaktgrundBezeichnung() {
	return kontaktgrundBezeichnung;
  }

  public void setKontaktgrundBezeichnung(String kontaktgrundBezeichnung) {
	this.kontaktgrundBezeichnung = kontaktgrundBezeichnung;
  }

  public Long getKontaktgrundId() {
	return kontaktgrundId;
  }

  public void setKontaktgrundId(Long kontaktgrundId) {
	this.kontaktgrundId = kontaktgrundId;
  }
}
