package at.sozvers.noegkk.focus.service.api.kontaktneu;

import java.time.LocalDateTime;
import at.sozvers.noegkk.focus.service.api.common.BaseBTO;

public class KontaktBTO implements BaseBTO {

  private Long          abschlussartId;
  private boolean       agd;
  private String        agdFachschluessel;
  private String        agdName;
  private String        anmerkung;
  private Long          aufgabengebietId;
  private String        bundesland;
  private LocalDateTime endeTs;
  private String        erstellt;
  private String        erstelltName;
  private String        externeGewalt;
  private String        fachschluessel;
  private String        fachschluesselArtKurz;
  private String        fremdsystemId;
  private String        fremdsystemName;
  private String        gemeinde;
  private String        gemeindeCode;
  private Long          kontaktId;
  private Long          kontaktartId;
  private String        letztAend;
  private String        letztAendName;
  private String        mitarbeiterName;
  private String        mitarbeiterOe;
  private Long          nacherfassenGrund;
  private String        nacherfassenText;
  private String        name;
  private String        ort;
  private String        plz;
  private String        polBezirk;
  private String        scBezeichnung;
  private Long          scIdMa;
  private String        staatIsoa3;
  private LocalDateTime startTs;
  private Long          subAufgabengebietId;
  private Long          themaId;
  private Long          unterthemaId;
  private Long          updatecount;

  public Long getAbschlussartId() {
	return abschlussartId;
  }

  public void setAbschlussartId(Long abschlussartId) {
	this.abschlussartId = abschlussartId;
  }

  public String getAgdFachschluessel() {
	return agdFachschluessel;
  }

  public void setAgdFachschluessel(String agdFachschluessel) {
	this.agdFachschluessel = agdFachschluessel;
  }

  public String getAgdName() {
	return agdName;
  }

  public void setAgdName(String agdName) {
	this.agdName = agdName;
  }

  public String getAnmerkung() {
	return anmerkung;
  }

  public void setAnmerkung(String anmerkung) {
	this.anmerkung = anmerkung;
  }

  public Long getAufgabengebietId() {
	return aufgabengebietId;
  }

  public void setAufgabengebietId(Long aufgabengebietId) {
	this.aufgabengebietId = aufgabengebietId;
  }

  public String getBundesland() {
	return bundesland;
  }

  public void setBundesland(String bundesland) {
	this.bundesland = bundesland;
  }

  public LocalDateTime getEndeTs() {
	return endeTs;
  }

  public void setEndeTs(LocalDateTime endeTs) {
	this.endeTs = endeTs;
  }

  public String getErstellt() {
	return erstellt;
  }

  public void setErstellt(String erstellt) {
	this.erstellt = erstellt;
  }

  public String getErstelltName() {
	return erstelltName;
  }

  public void setErstelltName(String erstelltName) {
	this.erstelltName = erstelltName;
  }

  public String getExterneGewalt() {
	return externeGewalt;
  }

  public void setExterneGewalt(String externeGewalt) {
	this.externeGewalt = externeGewalt;
  }

  public String getFachschluessel() {
	return fachschluessel;
  }

  public void setFachschluessel(String fachschluessel) {
	this.fachschluessel = fachschluessel;
  }

  public String getFachschluesselArtKurz() {
	return fachschluesselArtKurz;
  }

  public void setFachschluesselArtKurz(String fachschluesselArtKurz) {
	this.fachschluesselArtKurz = fachschluesselArtKurz;
  }

  public String getFremdsystemId() {
	return fremdsystemId;
  }

  public void setFremdsystemId(String fremdsystemId) {
	this.fremdsystemId = fremdsystemId;
  }

  public String getFremdsystemName() {
	return fremdsystemName;
  }

  public void setFremdsystemName(String fremdsystemName) {
	this.fremdsystemName = fremdsystemName;
  }

  public String getGemeinde() {
	return gemeinde;
  }

  public void setGemeinde(String gemeinde) {
	this.gemeinde = gemeinde;
  }

  public String getGemeindeCode() {
	return gemeindeCode;
  }

  public void setGemeindeCode(String gemeindeCode) {
	this.gemeindeCode = gemeindeCode;
  }

  public Long getKontaktId() {
	return kontaktId;
  }

  public void setKontaktId(Long kontaktId) {
	this.kontaktId = kontaktId;
  }

  public Long getKontaktartId() {
	return kontaktartId;
  }

  public void setKontaktartId(Long kontaktartId) {
	this.kontaktartId = kontaktartId;
  }

  public String getLetztAend() {
	return letztAend;
  }

  public void setLetztAend(String letztAend) {
	this.letztAend = letztAend;
  }

  public String getLetztAendName() {
	return letztAendName;
  }

  public void setLetztAendName(String letztAendName) {
	this.letztAendName = letztAendName;
  }

  public String getMitarbeiterName() {
	return mitarbeiterName;
  }

  public void setMitarbeiterName(String mitarbeiterName) {
	this.mitarbeiterName = mitarbeiterName;
  }

  public String getMitarbeiterOe() {
	return mitarbeiterOe;
  }

  public void setMitarbeiterOe(String mitarbeiterOe) {
	this.mitarbeiterOe = mitarbeiterOe;
  }

  public Long getNacherfassenGrund() {
	return nacherfassenGrund;
  }

  public void setNacherfassenGrund(Long nacherfassenGrund) {
	this.nacherfassenGrund = nacherfassenGrund;
  }

  public String getNacherfassenText() {
	return nacherfassenText;
  }

  public void setNacherfassenText(String nacherfassenText) {
	this.nacherfassenText = nacherfassenText;
  }

  public String getName() {
	return name;
  }

  public void setName(String name) {
	this.name = name;
  }

  public String getOrt() {
	return ort;
  }

  public void setOrt(String ort) {
	this.ort = ort;
  }

  public String getPlz() {
	return plz;
  }

  public void setPlz(String plz) {
	this.plz = plz;
  }

  public String getPolBezirk() {
	return polBezirk;
  }

  public void setPolBezirk(String polBezirk) {
	this.polBezirk = polBezirk;
  }

  public String getScBezeichnung() {
	return scBezeichnung;
  }

  public void setScBezeichnung(String scBezeichnung) {
	this.scBezeichnung = scBezeichnung;
  }

  public Long getScIdMa() {
	return scIdMa;
  }

  public void setScIdMa(Long scIdMa) {
	this.scIdMa = scIdMa;
  }

  public String getStaatIsoa3() {
	return staatIsoa3;
  }

  public void setStaatIsoa3(String staatIsoa3) {
	this.staatIsoa3 = staatIsoa3;
  }

  public LocalDateTime getStartTs() {
	return startTs;
  }

  public void setStartTs(LocalDateTime startTs) {
	this.startTs = startTs;
  }

  public Long getSubAufgabengebietId() {
	return subAufgabengebietId;
  }

  public void setSubAufgabengebietId(Long subAufgabengebietId) {
	this.subAufgabengebietId = subAufgabengebietId;
  }

  public Long getThemaId() {
	return themaId;
  }

  public void setThemaId(Long themaId) {
	this.themaId = themaId;
  }

  public Long getUnterthemaId() {
	return unterthemaId;
  }

  public void setUnterthemaId(Long unterthemaId) {
	this.unterthemaId = unterthemaId;
  }

  public Long getUpdatecount() {
	return updatecount;
  }

  public void setUpdatecount(Long updatecount) {
	this.updatecount = updatecount;
  }

  public boolean isAgd() {
	return agd;
  }

  public void setAgd(boolean agd) {
	this.agd = agd;
  }
}
