package at.sozvers.focus.ws.client.factory;

import java.util.ArrayList;
import java.util.List;
import at.sozvers.focus.ws.generated.*;
import jakarta.enterprise.context.Dependent;
import jakarta.xml.bind.JAXBElement;

@Dependent
public class SucheingabeRequestFactory {

  public static final String AUSLAENDISCHEURKUNDEN_ABLAGE           = "versicherten-ablage.auslaendischeurkunden-ablage";
  public static final String BANKVERBINDUNG_ABLAGE                  = "versicherten-ablage.bankverbindung-ablage";
  public static final String FAM_ANTRAEGE_ABLAGE                    = "fam-leistung-ablagen.fam-antraege-ablage";
  public static final String FAM_AUSGANG_ABLAGE                     = "fam-leistung-ablagen.fam-ausgang-ablage";
  public static final String FAM_AUTOMATISCHES_SCHREIBEN_ABLAGE     = "fam-leistung-ablagen.fam-automatisches-schreiben-ablage";
  public static final String FAM_BESCHEIDE_ABLAGE                   = "fam-leistung-ablagen.fam-bescheide-ablage";
  public static final String FAM_EINGANG_ABLAGE                     = "fam-leistung-ablagen.fam-eingang-ablage";
  public static final String GEBURTSURKUNDEN_ABLAGE                 = "versicherten-ablage.geburtsurkunden-ablage";
  public static final String MELDEBESTAETIGUNG_ABLAGE               = "versicherten-ablage.meldebestaetigung-ablage";
  public static final String MKP_ABLAGE                             = "fam-leistung-ablagen.mkp-ablage";
  public static final String URKUNDEN_ABLAGE                        = "versicherten-ablage.urkunden-ablage";
  public static final String VORFALLERHEBUNGSBOGEN_DOKUMENTENKLASSE = "regressarchiv-ablage-objects.oc_sUEB";
  public static final String WOCHENGELD_ABLAGE                      = "fam-leistung-ablagen.wochengeld-ablage";

  public SucheingabeRequestFactory() {
	//Standard Constructor
  }

  public List<Sucheingabe> allRequestsAsList(Long pid) {
	List<Sucheingabe> sucheingabeList = new ArrayList<>();
	sucheingabeList.add(createMeldebestaetigungAblage(pid));
	sucheingabeList.add(createBankverbindungAblage(pid));
	sucheingabeList.add(createFamAntraegeAblage(pid));
	sucheingabeList.add(createGeburtsurkundenAblage(pid));
	sucheingabeList.add(createAuslaendischeUrkundenAblage(pid));
	sucheingabeList.add(createUrkundenAblage(pid));
	sucheingabeList.add(createMkpAblage(pid));
	sucheingabeList.add(createWochengeldAblage(pid));
	sucheingabeList.add(createFamBescheideAblage(pid));
	sucheingabeList.add(createFamAusgangAblage(pid));
	sucheingabeList.add(createFamEingangAblage(pid));
	sucheingabeList.add(createFamAutomatischesSchreibenAblage(pid));
	sucheingabeList.add(createVorfallerhebungsbogen(pid));

	return sucheingabeList;
  }

  public Sucheingabe createAuslaendischeUrkundenAblage(Long pid) {
	return createSucheingabe(null, AUSLAENDISCHEURKUNDEN_ABLAGE, pid);
  }

  public Sucheingabe createBankverbindungAblage(Long pid) {
	return createSucheingabe(null, BANKVERBINDUNG_ABLAGE, pid);
  }

  private Sucheingabe createDefaultSucheingabe(Long pid) {
	ObjectFactory objectFactory = new ObjectFactory();

	Sucheingabe          sucheingabe          = new Sucheingabe();
	Suchbegriffe         suchbegriffe         = new Suchbegriffe();
	ErgebnisAufbereitung ergebnisAufbereitung = new ErgebnisAufbereitung();

	ergebnisAufbereitung.setAktuelleSeite(1);
	ergebnisAufbereitung.setAnzahlProSeite(5);
	sucheingabe.setErgebnisaufbereitung(ergebnisAufbereitung);

	PartnerSuchkriterienTyp      partnerSuchkriterien      = new PartnerSuchkriterienTyp();
	PartnerSuchkriterienFeldTyp  partnerSuchkriterienFeld  = new PartnerSuchkriterienFeldTyp();
	PartnerSuchkriterienAndOrTyp partnerSuchkriterienAndOr = new PartnerSuchkriterienAndOrTyp();

	ZpvPartnerSuchenTyp zpvPartnerSuchenTyp1 = new ZpvPartnerSuchenTyp();
	ZpvPartnerSuchen    zpvPartnerSuchen1    = new ZpvPartnerSuchen();
	zpvPartnerSuchen1.setParparolleIdPartner(pid);
	zpvPartnerSuchen1.setPartnerrolleartKurz("VS");
	zpvPartnerSuchen1.setBeteiligungsart("versicherter");
	zpvPartnerSuchenTyp1.setZpvPartner(zpvPartnerSuchen1);

	JAXBElement<ZpvPartnerSuchenTyp> jaxbElement1 = objectFactory.createPartnerSuchkriterienAndOrTypEquals(zpvPartnerSuchenTyp1);

	ZpvPartnerSuchenTyp zpvPartnerSuchenTyp2 = new ZpvPartnerSuchenTyp();
	ZpvPartnerSuchen    zpvPartnerSuchen2    = new ZpvPartnerSuchen();
	zpvPartnerSuchen2.setParparolleIdPartner(pid);
	zpvPartnerSuchen2.setPartnerrolleartKurz("VS");
	zpvPartnerSuchen2.setBeteiligungsart("antragsteller");
	zpvPartnerSuchenTyp2.setZpvPartner(zpvPartnerSuchen2);

	JAXBElement<ZpvPartnerSuchenTyp> jaxbElement2 = objectFactory.createPartnerSuchkriterienAndOrTypEquals(zpvPartnerSuchenTyp2);

	partnerSuchkriterienAndOr.getEqualsOrNotEquals().add(jaxbElement1);
	partnerSuchkriterienAndOr.getEqualsOrNotEquals().add(jaxbElement2);
	partnerSuchkriterienFeld.setName("PARTNER_ZPV");
	partnerSuchkriterienFeld.setOr(partnerSuchkriterienAndOr);
	partnerSuchkriterien.getFeld().add(partnerSuchkriterienFeld);

	suchbegriffe.setPartnerSuchkriterien(partnerSuchkriterien);
	sucheingabe.setSuchbegriffe(suchbegriffe);

	return sucheingabe;
  }

  public Sucheingabe createFamAntraegeAblage(Long pid) {
	return createSucheingabe(null, FAM_ANTRAEGE_ABLAGE, pid);
  }

  public Sucheingabe createFamAusgangAblage(Long pid) {
	return createSucheingabe(null, FAM_AUSGANG_ABLAGE, pid);
  }

  public Sucheingabe createFamAutomatischesSchreibenAblage(Long pid) {
	return createSucheingabe(null, FAM_AUTOMATISCHES_SCHREIBEN_ABLAGE, pid);
  }

  public Sucheingabe createFamBescheideAblage(Long pid) {
	return createSucheingabe(null, FAM_BESCHEIDE_ABLAGE, pid);
  }

  public Sucheingabe createFamEingangAblage(Long pid) {
	return createSucheingabe(null, FAM_EINGANG_ABLAGE, pid);
  }

  public Sucheingabe createGeburtsurkundenAblage(Long pid) {
	return createSucheingabe(null, GEBURTSURKUNDEN_ABLAGE, pid);
  }

  public Sucheingabe createMeldebestaetigungAblage(Long pid) {
	return createSucheingabe(null, MELDEBESTAETIGUNG_ABLAGE, pid);
  }

  public Sucheingabe createMkpAblage(Long pid) {
	return createSucheingabe(null, MKP_ABLAGE, pid);
  }

  private Sucheingabe createSucheingabe(String dokumentenKlasse, String archivAblage, Long pid) {
	Sucheingabe sucheingabe = createDefaultSucheingabe(pid);
	sucheingabe.getSuchbegriffe().setDokumentKlasse(dokumentenKlasse);
	sucheingabe.getSuchbegriffe().setArchivAblage(archivAblage);
	return sucheingabe;
  }

  public Sucheingabe createUrkundenAblage(Long pid) {
	return createSucheingabe(null, URKUNDEN_ABLAGE, pid);
  }

  public Sucheingabe createVorfallerhebungsbogen(Long pid) {
	return createSucheingabe(VORFALLERHEBUNGSBOGEN_DOKUMENTENKLASSE, null, pid);
  }

  public Sucheingabe createWochengeldAblage(Long pid) {
	return createSucheingabe(null, WOCHENGELD_ABLAGE, pid);
  }
}
