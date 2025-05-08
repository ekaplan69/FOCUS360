package at.sozvers.noegkk.focus.service.api.common;

public class MeldungBTO implements BaseBTO {

  private String fehlerId;
  private String fehlerkategorie;
  private String meldungstext;

  private MeldungBTO() {
  }

  public static MeldungBTO of(String fehlerId, String fehlerkategorie, String meldungstext) {
	MeldungBTO meldungDTO = new MeldungBTO();
	meldungDTO.setFehlerId(fehlerId);
	meldungDTO.setFehlerkategorie(fehlerkategorie);
	meldungDTO.setMeldungstext(meldungstext);
	return meldungDTO;
  }

  @Override
  public String toString() {
	return String.format("%s (%s) : %s", this.getFehlerId(), this.getFehlerkategorie(), this.getMeldungstext());
  }

  public String getFehlerId() {
	return fehlerId;
  }

  public void setFehlerId(String fehlerId) {
	this.fehlerId = fehlerId;
  }

  public String getFehlerkategorie() {
	return fehlerkategorie;
  }

  public void setFehlerkategorie(String fehlerkategorie) {
	this.fehlerkategorie = fehlerkategorie;
  }

  public String getMeldungstext() {
	return meldungstext;
  }

  public void setMeldungstext(String meldungstext) {
	this.meldungstext = meldungstext;
  }
}
