package at.sozvers.noegkk.focus.service.zpv.adresse;

import java.math.BigInteger;
import java.util.UUID;
import at.itsv.noegkk.commons.RequestHeadersCommons;
import at.sozialversicherung.schema.zpv.ibs.adresszuordnungsuchen_10_0.*;
import at.sozvers.noegkk.focus.service.common.Fachschluessel;
import jakarta.annotation.Resource;
import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

import static at.sozvers.noegkk.focus.service.zpv.infrastructure.ZpvConstants.*;

@Dependent
public class DtoAdresszuordnungListeSUIFactory {

  @Resource(lookup="java:global/at/sozvers/noegkk/focus/zpv/LL/BERECHTIGUNGSSYSTEMID")
  public static String                BERECHTIGUNGS_SYSTEM_ID;
  @Resource(lookup="java:global/at/sozvers/noegkk/focus/zpv/LL/PRIMAERSYSTEMID")
  public static String                PRIMAER_SYSTEM_ID;
  @Resource(lookup="java:global/at/sozvers/noegkk/focus/zpv/LL/QUELLSYSTEMID")
  public static String                QUELL_SYSTEM_ID;
  @Resource(lookup="java:global/at/sozvers/noegkk/jsszpvbe2/focus/VERARBEITUNGSMODUS")
  public static String                VERARBEITUNGS_MODUS;
  @Resource(lookup="java:global/at/sozvers/noegkk/focus/zpv/LL/ZIELSYSTEMMODUS")
  public static String                ZIEL_SYSTEM_MODUS;
  @Inject
  private       RequestHeadersCommons requestHeadersCommons;

  public DtoAdresszuordnungListeSUI createDtoAdresszuordnungListeSUIWithFachschluessel(Fachschluessel fachschluessel) {
	DtoAdresszuordnungSUI input = new DtoAdresszuordnungSUI();

	input.setDtoPartnerParrolleIdentifikationPartner(createDtoPartnerParrolleIdentifikation(fachschluessel));
	input.setBkStatusKZ(createBkStatusKZVO());
	input.setAnschriftszusammenfassungJN(ZPV_TRUE);
	input.setLaengeZusammenfassung(BigInteger.valueOf(70));
	input.setAnschriftVerwaltungsgliederungJN(ZPV_FALSE);
	input.setLandesgerichteJN(ZPV_FALSE);
	input.setBezirksgerichteJN(ZPV_FALSE);
	input.setArbeitsSozialGerichteJN(ZPV_FALSE);
	input.setGeldadressvereinbarungJN(ZPV_TRUE);
	input.setNutzungJN(ZPV_FALSE);
	input.setPartnerKurzJN(ZPV_FALSE);
	input.setBearbeiterinfoJN(ZPV_FALSE);

	return createDtoAdresszuordnungListeSUI(input);
  }

  private DtoPartnerParrolleIdentifikation createDtoPartnerParrolleIdentifikation(Fachschluessel fachschluessel) {
	DtoPartnerParrolleIdentifikation partnerParrolleIdentifikation = new DtoPartnerParrolleIdentifikation();
	partnerParrolleIdentifikation.setBkFachschluesselAngabe(createBkFachschluesselAngabeVO(fachschluessel));
	return partnerParrolleIdentifikation;
  }

  private BkStatusKZVO createBkStatusKZVO() {
	BkStatusKZVO bkStatusKZVO = new BkStatusKZVO();
	bkStatusKZVO.setStatusKZ(ZPV_STATUS_KZ);
	return bkStatusKZVO;
  }

  private DtoAdresszuordnungListeSUI createDtoAdresszuordnungListeSUI(DtoAdresszuordnungSUI input) {
	DtoAdresszuordnungListeSUI inputList = new DtoAdresszuordnungListeSUI();
	inputList.getDtoAdresszuordnungSUIListe().add(input);

	DtoRequestHeader dtoRequestHeader = new DtoRequestHeader();
	dtoRequestHeader.setZeichenmenge(ZEICHENMENGE);

	DtoQuellsystem dtoQuellsystem = new DtoQuellsystem();
	dtoQuellsystem.setQuellSystemApplikationsId(APP_ID);
	dtoQuellsystem.setQuellSystemSystemId(QUELL_SYSTEM_ID);
	dtoRequestHeader.setDtoQuellsystem(dtoQuellsystem);

	DtoKontextRQ dtoKontextRQ = new DtoKontextRQ();

	DtoBearbeiter dtoBearbeiter = new DtoBearbeiter();
	dtoBearbeiter.setBerechtigungsSystemId(BERECHTIGUNGS_SYSTEM_ID);
	dtoBearbeiter.setBearbeiterId(requestHeadersCommons.getBearbeiterID());
	dtoBearbeiter.setMeldendeStelle(requestHeadersCommons.getMeldendeStelle());
	dtoBearbeiter.setOrgeinheitid(requestHeadersCommons.getOrgeinheitId());
	dtoKontextRQ.setDtoBearbeiter(dtoBearbeiter);

	dtoKontextRQ.setTransaktionsID(requestHeadersCommons.getTransactionUUID().substring(0, 13));
	dtoKontextRQ.setVerarbeitungsModus(VERARBEITUNGS_MODUS);
	dtoKontextRQ.setBearbeitungsGrund("FOCUS360");
	dtoKontextRQ.setPrimaerSystemId(PRIMAER_SYSTEM_ID);
	dtoKontextRQ.setEbenenSequenzNummer(BigInteger.valueOf(1L));
	dtoRequestHeader.setDtoKontextRQ(dtoKontextRQ);

	DtoZielsystem dtoZielsystem = new DtoZielsystem();
	dtoZielsystem.setZielSystemModus(ZIEL_SYSTEM_MODUS);
	dtoRequestHeader.setDtoZielsystem(dtoZielsystem);

	UUID   uuid         = UUID.randomUUID();
	String uuidAsString = uuid.toString();
	dtoRequestHeader.setNachrichtId(uuidAsString);

	inputList.setDtoRequestHeader(dtoRequestHeader);

	return inputList;
  }

  private BkFachschluesselAngabeVO createBkFachschluesselAngabeVO(Fachschluessel fachschluessel) {
	BkFachschluesselAngabeVO fachschluesselAngabeVO = new BkFachschluesselAngabeVO();
	fachschluesselAngabeVO.setFachschluesselartKurz(fachschluessel.getFachschluesselArt());
	fachschluesselAngabeVO.setFachschluessel(fachschluessel.getFachschluessel());
	return fachschluesselAngabeVO;
  }
}

