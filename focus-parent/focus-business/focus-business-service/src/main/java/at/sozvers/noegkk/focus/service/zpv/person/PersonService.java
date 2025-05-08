package at.sozvers.noegkk.focus.service.zpv.person;

import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;
import at.itsv.noegkk.commons.RequestHeadersCommons;
import at.sozialversicherung.schema.zpv.ibs.beziehungsuchen_11_0.DtoBeziehungListeSUO;
import at.sozialversicherung.schema.zpv.ibs.beziehungsuchen_11_0.DtoBeziehungSUI;
import at.sozialversicherung.schema.zpv.ibs.clklinkinitialisieren_1_0.DtoclkLinkINI;
import at.sozialversicherung.schema.zpv.ibs.clklinkinitialisieren_1_0.DtoclkLinkINO;
import at.sozialversicherung.schema.zpv.ibs.clkpartnersucheergebnisabfragen_2_0.DtoclkPartnersucheEAI;
import at.sozialversicherung.schema.zpv.ibs.clkpartnersucheergebnisabfragen_2_0.DtoclkPartnersucheEAO;
import at.sozialversicherung.schema.zpv.ibs.clkpartnersucheinitialisieren_4_0.DtoclkPartnersucheINI;
import at.sozialversicherung.schema.zpv.ibs.clkpartnersucheinitialisieren_4_0.DtoclkPartnersucheINO;
import at.sozialversicherung.schema.zpv.ibs.mitarbeiteridentifikationlesen_7_0.*;
import at.sozialversicherung.schema.zpv.ibs.partnerlesenkurz_15_0.*;
import at.sozialversicherung.schema.zpv.ibs.partnerlesenkurz_15_0.Meldung;
import at.sozialversicherung.schema.zpv.ibs.partnerlesenkurz_15_0.Parameter;
import at.sozialversicherung.schema.zpv.ibs.partnerlesenlang_20_0.DtoPartnerLELI;
import at.sozialversicherung.schema.zpv.ibs.partnerlesenlang_20_0.DtoPartnerLELO;
import at.sozialversicherung.schema.zpv.ibs.partnersuchen_14_0.DtoPartnerListeSUO;
import at.sozialversicherung.schema.zpv.ibs.partnersuchen_14_0.DtoPartnerSUI;
import at.sozvers.noegkk.focus.service.api.zpv.person.*;
import at.sozvers.noegkk.focus.service.common.Fachschluessel;
import at.sozvers.noegkk.focus.service.common.TextUtil;
import at.sozvers.noegkk.focus.service.zpv.infrastructure.ZPVService;
import at.sozvers.noegkk.focus.service.zpv.infrastructure.ZpvCaller;
import at.sozvers.noegkk.jsszpvbe2.action.ZPVServices;
import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

import static at.sozvers.noegkk.focus.service.zpv.infrastructure.ZpvConstants.ZPV_FALSE;
import static at.sozvers.noegkk.focus.service.zpv.infrastructure.ZpvConstants.ZPV_TRUE;

@Dependent
public class PersonService {

  @Inject
  private ZpvCaller<DtoclkPartnersucheEAI, DtoclkPartnersucheEAO>                               abfragenSearchPersonZpvCaller;
  @Inject
  private ZpvCaller<DtoBeziehungSUI, DtoBeziehungListeSUO>                                      beziehungSuchenZpvCaller;
  @Inject
  private ClkSuchergebnisBTOExternalServiceMapper                                               clkSuchergebnisBTOExternalServiceMapper;
  @Inject
  private ClkTokenLBTOExternalServiceMapper                                                     clkTokenLBTOExternalServiceMapper;
  @Inject
  private ClkTokenPSBTOExternalServiceMapper                                                    clkTokenPSBTOExternalServiceMapper;
  @Inject
  private DtoBeziehungSUIFactory                                                                dtoBeziehungSUIFactory;
  @Inject
  private DtoMitarbeiterIdentifikationLEIFactory                                                dtoMitarbeiterIdentifikationLEIFactory;
  @Inject
  private DtoPartnerLELIFactory                                                                 dtoPartnerLELIFactory;
  @Inject
  private DtoPartnerListeLEKIFactory                                                            dtoPartnerListeLEKIFactory;
  @Inject
  private DtoPartnerSUIFactory                                                                  dtoPartnerSUIFactory;
  @Inject
  private DTOCLKLinkINIFactory                                                                  dtoclkLinkINIFactory;
  @Inject
  private DTOCLKPartnersucheEAIFactory                                                          dtoclkPartnersucheEAIFactory;
  @Inject
  private DTOCLKPartnersucheINIFactory                                                          dtoclkPartnersucheINIFactory;
  @Inject
  private ZpvCaller<DtoclkLinkINI, DtoclkLinkINO>                                               initLinkZpvCaller;
  @Inject
  private ZpvCaller<DtoclkPartnersucheINI, DtoclkPartnersucheINO>                               initSearchPersonZpvCaller;
  @Inject
  private ZpvCaller<DtoMitarbeiterIdentifikationListeLEI, DtoMitarbeiterIdentifikationListeLEO> mitarbeiterIdentifikationLesenZpvCaller;
  @Inject
  private ZpvCaller<DtoPartnerListeLEKI, DtoPartnerListeLEKO>                                   partnerLesenKurzZpvCaller;
  @Inject
  private ZpvCaller<DtoPartnerLELI, DtoPartnerLELO>                                             partnerLesenLangZpvCaller;
  @Inject
  private ZpvCaller<DtoPartnerSUI, DtoPartnerListeSUO>                                          partnerSuchenZpvCaller;
  @Inject
  private RequestHeadersCommons                                                                 requestHeadersCommons;
  @Inject
  private StammdatenBTOLongExternalServiceMapper                                                stammdatenBTOLongExternalServiceMapper;
  @Inject
  private StammdatenKurzBTOExternalServiceMapper                                                stammdatenKurzBTOExternalServiceMapper;
  @Inject
  private SuchpersonBTOExternalServiceMapper                                                    suchpersonBTOExternalServiceMapper;
  @Inject
  private VollmachtBTOExternalServiceMapper                                                     vollmachtBTOExternalServiceMapper;
  @Inject
  @ZPVService
  private ZPVServices                                                                           zpvServices;

  public List<ClkSuchergebnisBTO> abfragenSearchPersonClientCoopNew(String clkToken) throws Exception {
	DtoclkPartnersucheEAI dtoclkPartnersucheEAI = dtoclkPartnersucheEAIFactory.createDtoclkPartnersucheEAI(clkToken);
	DtoclkPartnersucheEAO dtoclkPartnersucheEAO = abfragenSearchPersonZpvCaller.call(zpvServices::clkPartnersucheErgebnisAbfragen_2_0, dtoclkPartnersucheEAI);

	if(ZPV_FALSE.equals(dtoclkPartnersucheEAO.getFehlerpaket().getIstOk()) || dtoclkPartnersucheEAO.getDtoclkPartnersuchErgebnis().getDtoclkPartnerinformationListe().isEmpty()) {
	  return null;
	}

	return clkSuchergebnisBTOExternalServiceMapper.mapToBtoList(dtoclkPartnersucheEAO.getDtoclkPartnersuchErgebnis().getDtoclkPartnerinformationListe());
  }

  public ClkTokenBTO initLinkClientCoopNew(String partnerId) throws Exception {
	DtoclkLinkINI dtoclkLinkINI = dtoclkLinkINIFactory.createDtoclkLinkINI(partnerId);
	DtoclkLinkINO dtoclkLinkINO = initLinkZpvCaller.call(zpvServices::clkLinkInitialisieren_1_0, dtoclkLinkINI);

	if(ZPV_FALSE.equals(dtoclkLinkINO.getFehlerpaket().getIstOk())) {
	  return null;
	}

	return clkTokenLBTOExternalServiceMapper.map(dtoclkLinkINO);
  }

  public ClkTokenBTO initSearchPersonClientCoopNew() throws Exception {
	DtoclkPartnersucheINI dtoclkPartnersucheINI = dtoclkPartnersucheINIFactory.createDtoclkPartnersucheINI();
	DtoclkPartnersucheINO dtoclkPartnersucheINO = initSearchPersonZpvCaller.call(zpvServices::clkPartnersucheInitialisieren_4_0, dtoclkPartnersucheINI);

	if(ZPV_FALSE.equals(dtoclkPartnersucheINO.getFehlerpaket().getIstOk())) {
	  return null;
	}

	return clkTokenPSBTOExternalServiceMapper.map(dtoclkPartnersucheINO);
  }

  public StammdatenBTO searchByFachschluessel(Fachschluessel fachschluessel) throws Exception {
	DtoPartnerLELO dtoPartnerLELO = getDtoPartnerLELO(fachschluessel);
	if(Objects.equals(dtoPartnerLELO.getFehlerpaket().getIstOk(), "N")) {
	  return null;
	}

	StammdatenBTO bto = stammdatenBTOLongExternalServiceMapper.map(dtoPartnerLELO, fachschluessel);

	BigInteger partnerRolleID = bto.getPartnerVersicherterRolleId() != null ? bto.getPartnerVersicherterRolleId() : bto.getPartnerBetreuterRolleId();

	if(!bto.isStorniert()) {
	  DtoMitarbeiterIdentifikationListeLEO maDto = searchMitarbeiterByParParRolleId(partnerRolleID);
	  setAndererMitarbeiter(bto, maDto);
	} else {
	  bto.setAndererMitarbeiter(false);
	}

	setGesetzlichVertreten(bto, fachschluessel);
	setVollmachtenForBeziehungsart(bto, fachschluessel, "GESVE");
	setVollmachtenForBeziehungsart(bto, fachschluessel, "BEVOL");

	return bto;
  }

  private DtoPartnerLELO getDtoPartnerLELO(Fachschluessel fachschluessel) throws Exception {
	DtoPartnerLELI dtoPartnerLELI = dtoPartnerLELIFactory.createDtoPartnerLELIWithFachschluessel(fachschluessel);
	return partnerLesenLangZpvCaller.call(zpvServices::partnerLesenLang_20_0, dtoPartnerLELI);
  }

  public DtoMitarbeiterIdentifikationListeLEO searchMitarbeiterByParParRolleId(BigInteger parParRolleId) throws Exception {
	DtoMitarbeiterIdentifikationListeLEO dtoMitarbeiterIdentifikationListeLEO = getDtoMitarbeiterIdentifikationListeLEO(parParRolleId);
	if(dtoMitarbeiterIdentifikationListeLEO == null || dtoMitarbeiterIdentifikationListeLEO.getDtoMitarbeiterIdentifikationLEOListe() == null || dtoMitarbeiterIdentifikationListeLEO.getDtoMitarbeiterIdentifikationLEOListe()
																																													 .isEmpty()) {
	  return null;
	}

	return dtoMitarbeiterIdentifikationListeLEO;
  }

  public void setAndererMitarbeiter(StammdatenBTO bto, DtoMitarbeiterIdentifikationListeLEO maDto) {
	if(maDto == null || maDto.getDtoMitarbeiterIdentifikationLEOListe().isEmpty()) {
	  return;
	}
	List<DtoMitarbeiterIdentifikationLEO> maDtoList = maDto.getDtoMitarbeiterIdentifikationLEOListe();
	for(DtoMitarbeiterIdentifikationLEO ma : maDtoList) {
	  if(ma.getDtoPartnerrolleSUOListe() != null && !ma.getDtoPartnerrolleSUOListe().isEmpty()) {
		List<DtoPartnerrolleSUO> partnerrolleSUOList = ma.getDtoPartnerrolleSUOListe();
		for(DtoPartnerrolleSUO parRolle : partnerrolleSUOList) {
		  if(parRolle instanceof DtoPartnerrolleMitarbeiter) {
			DtoPartnerrolleMitarbeiter parRolleMA = (DtoPartnerrolleMitarbeiter) parRolle;
			if(!requestHeadersCommons.getBearbeiterID().equals(parRolleMA.getMitarbeiterkennung())) {
			  bto.setAndererMitarbeiter(true);
			  return;
			}
		  }
		}
	  }
	}
	bto.setAndererMitarbeiter(false);
  }

  private void setGesetzlichVertreten(StammdatenBTO bto, Fachschluessel fachschluessel) throws Exception {
	DtoBeziehungSUI      input  = dtoBeziehungSUIFactory.createDtoBeziehungSUIWithFachschluessel(fachschluessel);
	DtoBeziehungListeSUO output = beziehungSuchenZpvCaller.call(zpvServices::beziehungSuchen_11_0, input, true);
	bto.setGesetzlichVertreten((output != null && !output.getDtoBeziehungAllgemeinSUOListe().isEmpty()));
  }

  private void setVollmachtenForBeziehungsart(StammdatenBTO bto, Fachschluessel fachschluessel, String beziehungsart) throws Exception {
	DtoBeziehungSUI      input  = dtoBeziehungSUIFactory.createDtoBeziehungSUIWithFachschluessel(fachschluessel, beziehungsart);
	DtoBeziehungListeSUO output = beziehungSuchenZpvCaller.call(zpvServices::beziehungSuchen_11_0, input, true);
	bto.getVollmachten().addAll(vollmachtBTOExternalServiceMapper.mapToBtoList(output.getDtoBeziehungAllgemeinSUOListe()));
  }

  private DtoMitarbeiterIdentifikationListeLEO getDtoMitarbeiterIdentifikationListeLEO(BigInteger parParRolleId) throws Exception {
	DtoMitarbeiterIdentifikationListeLEI dtoMitarbeiterIdentifikationListeLEI = dtoMitarbeiterIdentifikationLEIFactory.createDtoMitarbeiterIdentifikationListeLEIWithFachschluessel(parParRolleId);
	DtoMitarbeiterIdentifikationListeLEO dtoMitarbeiterIdentifikationListeLEO = mitarbeiterIdentifikationLesenZpvCaller.call(zpvServices::mitarbeiterIdentifikationLesen_7_0,
																															 dtoMitarbeiterIdentifikationListeLEI);

	if(dtoMitarbeiterIdentifikationListeLEO.getDtoMitarbeiterIdentifikationLEOListe().isEmpty() || ZPV_FALSE.equals(dtoMitarbeiterIdentifikationListeLEO.getFehlerpaket().getIstOk())) {
	  return null;
	}

	return dtoMitarbeiterIdentifikationListeLEO;
  }

  public List<StammdatenKurzBTO> searchByPartnerId(String partnerId) throws Exception {
	DtoPartnerListeLEKO dtoPartnerListeLEKO = getDtoPartnerListeLEKO(partnerId);
	if(dtoPartnerListeLEKO == null) {
	  return null;
	}

	return stammdatenKurzBTOExternalServiceMapper.mapToBtoList(dtoPartnerListeLEKO.getDtoPartnerLEKOListe());
  }

  private DtoPartnerListeLEKO getDtoPartnerListeLEKO(String partnerId) throws Exception {
	DtoPartnerListeLEKI dtoPartnerListeLEKI = dtoPartnerListeLEKIFactory.createDtoPartnerListeLEKIWithPartnerId(partnerId);
	DtoPartnerListeLEKO dtoPartnerListeLEKO = partnerLesenKurzZpvCaller.call(zpvServices::partnerLesenKurz_15_0, dtoPartnerListeLEKI);

	if(dtoPartnerListeLEKO != null && dtoPartnerListeLEKO.getDtoPartnerLEKOListe() != null) {
	  if(dtoPartnerListeLEKO.getDtoPartnerLEKOListe().get(0).getZusatzFehlerpaket() != null && ZPV_FALSE.equals(
			  dtoPartnerListeLEKO.getDtoPartnerLEKOListe().get(0).getZusatzFehlerpaket().getIstOk())) {
		throw new IllegalStateException("ZPV-Fehlermeldung: " + getZPVMeldungenAsString(dtoPartnerListeLEKO));
	  }
	} else {
	  return null;
	}
	return dtoPartnerListeLEKO;
  }

  private String getZPVMeldungenAsString(DtoPartnerListeLEKO dtoPartnerListeLEKO) {
	StringBuilder meldungenText = new StringBuilder();
	if(dtoPartnerListeLEKO.getDtoPartnerLEKOListe().get(0).getZusatzFehlerpaket() != null) {
	  for(Meldung meldung : dtoPartnerListeLEKO.getDtoPartnerLEKOListe().get(0).getZusatzFehlerpaket().getMeldungen()) {
		meldungenText.append(TextUtil.replacePlaceholder(meldung.getText(), meldung.getParameter().stream().map(Parameter::getWert).collect(Collectors.toList())) + " ");
	  }
	}
	return meldungenText.toString();
  }

  public List<SuchpersonBTO> searchByPartnername(String orgName, String plz) throws Exception {
	DtoPartnerListeSUO dtoPartnerListeSUO = getDtoPartnerListeSUO(orgName, plz);
	if(dtoPartnerListeSUO == null) {
	  return Collections.emptyList();
	}

	return suchpersonBTOExternalServiceMapper.mapToBtoList(dtoPartnerListeSUO.getDtoPartnerSUOListe());
  }

  private DtoPartnerListeSUO getDtoPartnerListeSUO(String orgName, String plz) throws Exception {
	DtoPartnerSUI      dtoPartnerSUI      = dtoPartnerSUIFactory.createDtoPartnerSuiOrg(orgName, plz);
	DtoPartnerListeSUO dtoPartnerListeSUO = partnerSuchenZpvCaller.call(zpvServices::partnerSuchen_14_0, dtoPartnerSUI);

	if(dtoPartnerListeSUO.getDtoPartnerSUOListe().isEmpty() || ZPV_FALSE.equals(dtoPartnerListeSUO.getFehlerpaket().getIstOk())) {
	  return null;
	}

	return dtoPartnerListeSUO;
  }

  public List<SuchpersonBTO> searchByPartnername(String vorname, String nachname, String plz, String geburtsdatum) throws Exception {
	DtoPartnerListeSUO dtoPartnerListeSUO = getDtoPartnerListeSUO(vorname, nachname, plz, geburtsdatum);
	if(dtoPartnerListeSUO == null) {
	  return Collections.emptyList();
	}

	return suchpersonBTOExternalServiceMapper.mapToBtoList(dtoPartnerListeSUO.getDtoPartnerSUOListe());
  }

  private DtoPartnerListeSUO getDtoPartnerListeSUO(String vorname, String nachname, String plz, String geburtsdatum) throws Exception {
	DtoPartnerSUI      dtoPartnerSUI      = dtoPartnerSUIFactory.createDtoPartnerSUI(vorname, nachname, plz, geburtsdatum);
	DtoPartnerListeSUO dtoPartnerListeSUO = partnerSuchenZpvCaller.call(zpvServices::partnerSuchen_14_0, dtoPartnerSUI);

	DtoPartnerSUI      dtoPartnerSuiEinzelunternehmer      = dtoPartnerSUIFactory.createDtoPartnerSUIEinzelunternehmer(vorname, nachname, plz, geburtsdatum);
	DtoPartnerListeSUO dtoPartnerListeSuoEinzelunternehmer = partnerSuchenZpvCaller.call(zpvServices::partnerSuchen_14_0, dtoPartnerSuiEinzelunternehmer, true);

	if(!dtoPartnerListeSuoEinzelunternehmer.getDtoPartnerSUOListe().isEmpty() && ZPV_TRUE.equals(dtoPartnerListeSuoEinzelunternehmer.getFehlerpaket().getIstOk())) {
	  dtoPartnerListeSUO.getDtoPartnerSUOListe().addAll(dtoPartnerListeSuoEinzelunternehmer.getDtoPartnerSUOListe());
	}

	if(dtoPartnerListeSUO.getDtoPartnerSUOListe().isEmpty() || ZPV_FALSE.equals(dtoPartnerListeSUO.getFehlerpaket().getIstOk())) {
	  return null;
	}

	return dtoPartnerListeSUO;
  }
}
