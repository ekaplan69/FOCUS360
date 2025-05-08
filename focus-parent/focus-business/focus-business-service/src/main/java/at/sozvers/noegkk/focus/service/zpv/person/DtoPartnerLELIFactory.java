package at.sozvers.noegkk.focus.service.zpv.person;

import java.math.BigInteger;
import java.util.UUID;
import at.itsv.noegkk.commons.RequestHeadersCommons;
import at.sozialversicherung.schema.zpv.ibs.partnerlesenlang_20_0.*;
import at.sozvers.noegkk.focus.service.common.Fachschluessel;
import jakarta.annotation.Resource;
import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

import static at.sozvers.noegkk.focus.service.zpv.infrastructure.ZpvConstants.*;

@Dependent
public class DtoPartnerLELIFactory {

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

  public DtoPartnerLELI createDtoPartnerLELIWithFachschluessel(Fachschluessel fachschluessel) {
	DtoPartnerLELI input = getDtoPartnerLELI(fachschluessel, null);

	DtoRequestHeader dtoRequestHeader = getDtoRequestHeader();

	input.setDtoRequestHeader(dtoRequestHeader);

	return input;
  }

  private static DtoPartnerLELI getDtoPartnerLELI(Fachschluessel fachschluessel, String partnerrollenartKurzAnforderung) {
	DtoPartnerLELI                   input                         = new DtoPartnerLELI();
	DtoPartnerParrolleIdentifikation partnerParrolleIdentifikation = new DtoPartnerParrolleIdentifikation();
	BkFachschluesselAngabeVO         fachschluesselAngabeVO        = new BkFachschluesselAngabeVO();
	fachschluesselAngabeVO.setFachschluessel(fachschluessel.getFachschluessel());
	fachschluesselAngabeVO.setFachschluesselartKurz(fachschluessel.getFachschluesselArt());
	partnerParrolleIdentifikation.setBkFachschluesselAngabe(fachschluesselAngabeVO);
	input.setDtoPartnerParrolleIdentifikationPartner(partnerParrolleIdentifikation);

	input.setPartnerDiakritischJN(ZPV_TRUE);
	input.setNamenszusammenfassungJN(ZPV_TRUE);
	input.setLaengezusammenfassung(BigInteger.valueOf(70));
	input.setAnschriftJN(ZPV_TRUE);
	input.setAnschriftVerwaltungsgliederungJN(ZPV_TRUE);
	input.setErmittlungsartAdresseKurzAnschrift(ERMITTLUNGSART_AUTOR);
	input.setZustelladresseBerueckJNAnschrift(ZPV_FALSE);
	input.setVoruebergehendeAdresseBerueckJNAnschrift(ZPV_FALSE);
	input.setGeldadresseJN(ZPV_FALSE);
	input.setEinzelunternehmerschaftenJN(ZPV_TRUE);
	input.setPartnerrollenartKurzAnforderung(partnerrollenartKurzAnforderung);
	input.setWeitereNamenJN("N");
	input.setFremdidentifikationJN("N");
	input.setKlassifizierungJN("N");
	input.setInsolvenzverfahrenJN("N");
	input.setNeuFoegJN("N");
	input.setNotizJN("N");
	input.setVerweiseJN("N");
	input.setBeziehungJN("N");
	input.setBearbeiterinfoJN("N");
	input.setKlassifzierungFachgebietJN("N");
	input.setVertragspartnernummerJN("N");

	return input;
  }

  private DtoRequestHeader getDtoRequestHeader() {
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
	dtoKontextRQ.setPrimaerSystemId(PRIMAER_SYSTEM_ID);
	dtoKontextRQ.setBearbeitungsGrund("FOCUS360");
	dtoKontextRQ.setEbenenSequenzNummer(BigInteger.valueOf(1L));
	dtoRequestHeader.setDtoKontextRQ(dtoKontextRQ);

	DtoZielsystem dtoZielsystem = new DtoZielsystem();
	dtoZielsystem.setZielSystemModus(ZIEL_SYSTEM_MODUS);
	dtoRequestHeader.setDtoZielsystem(dtoZielsystem);

	UUID   uuid         = UUID.randomUUID();
	String uuidAsString = uuid.toString();
	dtoRequestHeader.setNachrichtId(uuidAsString);
	return dtoRequestHeader;
  }
}

