package at.sozvers.noegkk.focus.service.dsgvo.fop;

import java.util.List;
import at.sozvers.noegkk.focus.service.api.ecard.ECarddatenBTO;
import at.sozvers.noegkk.focus.service.api.kva.abzsuc.AngehoerigeBTO;
import at.sozvers.noegkk.focus.service.api.kva.abzsuc.VersicherterBTO;
import at.sozvers.noegkk.focus.service.api.kva.gbfsuc.GebuehrenbefreiungBTO;
import at.sozvers.noegkk.focus.service.api.lgkk.LeistungenBTO;
import at.sozvers.noegkk.focus.service.api.zpv.adresse.AdresseBTO;
import at.sozvers.noegkk.focus.service.api.zpv.person.StammdatenBTO;
import at.sozvers.noegkk.focus.service.common.Fachschluessel;
import jakarta.xml.bind.annotation.*;

@XmlRootElement(name="dsgvoReport")
@XmlAccessorType(XmlAccessType.FIELD)
public class DSGVOReportXml {

  private List<AdresseBTO>            adressen;
  private String                      adressenError;
  private List<AngehoerigeBTO>        angehoerige;
  private String                      angehoerigeError;
  private ECarddatenBTO               ecard;
  private String                      ecardError;
  private Fachschluessel              fachschluessel;
  private List<GebuehrenbefreiungBTO> gebuehrenbefreiung;
  private String                      gebuehrenbefreiungError;
  private LeistungenBTO               leistungen;
  private String                      leistungenError;
  private StammdatenBTO               stammdaten;
  private String                      stammdatenError;
  private List<VersicherterBTO>       versicherte;
  private String                      versicherteError;

  public List<AdresseBTO> getAdressen() {
	return adressen;
  }

  public void setAdressen(List<AdresseBTO> adressen) {
	this.adressen = adressen;
  }

  public String getAdressenError() {
	return adressenError;
  }

  public void setAdressenError(String adressenError) {
	this.adressenError = adressenError;
  }

  public List<AngehoerigeBTO> getAngehoerige() {
	return angehoerige;
  }

  public void setAngehoerige(List<AngehoerigeBTO> angehoerige) {
	this.angehoerige = angehoerige;
  }

  public String getAngehoerigeError() {
	return angehoerigeError;
  }

  public void setAngehoerigeError(String angehoerigeError) {
	this.angehoerigeError = angehoerigeError;
  }

  public ECarddatenBTO getEcard() {
	return ecard;
  }

  public void setEcard(ECarddatenBTO ecard) {
	this.ecard = ecard;
  }

  public String getEcardError() {
	return ecardError;
  }

  public void setEcardError(String ecardError) {
	this.ecardError = ecardError;
  }

  public Fachschluessel getFachschluessel() {
	return fachschluessel;
  }

  public void setFachschluessel(Fachschluessel fachschluessel) {
	this.fachschluessel = fachschluessel;
  }

  public List<GebuehrenbefreiungBTO> getGebuehrenbefreiung() {
	return gebuehrenbefreiung;
  }

  public void setGebuehrenbefreiung(List<GebuehrenbefreiungBTO> gebuehrenbefreiung) {
	this.gebuehrenbefreiung = gebuehrenbefreiung;
  }

  public String getGebuehrenbefreiungError() {
	return gebuehrenbefreiungError;
  }

  public void setGebuehrenbefreiungError(String gebuehrenbefreiungError) {
	this.gebuehrenbefreiungError = gebuehrenbefreiungError;
  }

  public LeistungenBTO getLeistungen() {
	return leistungen;
  }

  public void setLeistungen(LeistungenBTO leistungen) {
	this.leistungen = leistungen;
  }

  public String getLeistungenError() {
	return leistungenError;
  }

  public void setLeistungenError(String leistungenError) {
	this.leistungenError = leistungenError;
  }

  public StammdatenBTO getStammdaten() {
	return stammdaten;
  }

  public void setStammdaten(StammdatenBTO stammdaten) {
	this.stammdaten = stammdaten;
  }

  public String getStammdatenError() {
	return stammdatenError;
  }

  public void setStammdatenError(String stammdatenError) {
	this.stammdatenError = stammdatenError;
  }

  public List<VersicherterBTO> getVersicherte() {
	return versicherte;
  }

  public void setVersicherte(List<VersicherterBTO> versicherte) {
	this.versicherte = versicherte;
  }

  public String getVersicherteError() {
	return versicherteError;
  }

  public void setVersicherteError(String versicherteError) {
	this.versicherteError = versicherteError;
  }
}
