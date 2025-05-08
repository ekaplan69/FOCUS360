package at.sozvers.noegkk.focus.service.zpv.person;

import javax.xml.datatype.DatatypeConfigurationException;
import java.math.BigInteger;
import java.util.UUID;
import at.itsv.noegkk.commons.RequestHeadersCommons;
import at.sozialversicherung.schema.zpv.ibs.partnersuchen_14_0.*;
import at.sozvers.noegkk.focus.service.common.DateUtil;
import jakarta.annotation.Resource;
import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

import static at.sozvers.noegkk.focus.service.zpv.infrastructure.ZpvConstants.*;

@Dependent
public class DtoPartnerSUIFactory {

  private static final String                ZPV_WS_SYSTEMMODUS = "java:global/at/sozvers/noegkk/jsszpvbe2/focus/SYSTEMMODUS";
  @Resource(lookup="java:global/at/sozvers/noegkk/focus/zpv/LL/BERECHTIGUNGSSYSTEMID")
  public static        String                BERECHTIGUNGS_SYSTEM_ID;
  @Resource(lookup="java:global/at/sozvers/noegkk/focus/zpv/LL/PRIMAERSYSTEMID")
  public static        String                PRIMAER_SYSTEM_ID;
  @Resource(lookup="java:global/at/sozvers/noegkk/focus/zpv/LL/QUELLSYSTEMID")
  public static        String                QUELL_SYSTEM_ID;
  @Resource(lookup="java:global/at/sozvers/noegkk/jsszpvbe2/focus/VERARBEITUNGSMODUS")
  public static        String                VERARBEITUNGS_MODUS;
  @Resource(lookup="java:global/at/sozvers/noegkk/focus/zpv/LL/ZIELSYSTEMMODUS")
  public static        String                ZIEL_SYSTEM_MODUS;
  @Inject
  private              RequestHeadersCommons requestHeadersCommons;
  @Resource(lookup=ZPV_WS_SYSTEMMODUS)
  private              String                systemmodus;

  public DtoPartnerSUI createDtoPartnerSUIEinzelunternehmer(String vorname, String nachname, String plz, String geburtsdatum) throws DatatypeConfigurationException {
	DtoPartnerSUI input = createDtoPartnerSUI(vorname, nachname, plz, geburtsdatum);

	input.setPartnerrollenartKurz("DG");

	return input;
  }

  public DtoPartnerSUI createDtoPartnerSUI(String vorname, String nachname, String plz, String geburtsdatum) throws DatatypeConfigurationException {
	DtoPartnerSUI input = new DtoPartnerSUI();

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

	input.setDtoRequestHeader(dtoRequestHeader);

	input.setAnschriftJN(ZPV_TRUE);
	input.setBeitragskontonrJN(ZPV_FALSE);
	input.setPartnerDiakritischJN(ZPV_TRUE);
	input.setPruefungFuerGeburtsdatumAenderungJN(ZPV_FALSE);
	input.setPruefungFuerNeuanlageJN(ZPV_FALSE);

	input.setPartnerrollenartKurz("VS");
	input.setPartnerartKurz("PERS");

	input.setPartnernameDiakritisch(nachname);
	input.setVornameDiakritisch(vorname);
	input.setPostleitzahl(plz);

	if(geburtsdatum != null && !geburtsdatum.isEmpty()) {
	  int tag   = Integer.parseInt(geburtsdatum.substring(0, 2));
	  int monat = Integer.parseInt(geburtsdatum.substring(3, 5));
	  int jahr  = Integer.parseInt(geburtsdatum.substring(6, 10));
	  input.setGeburtsDAT(DateUtil.createXmlCalendar(jahr, monat - 1, tag));
	}

	return input;
  }

  public DtoPartnerSUI createDtoPartnerSuiOrg(String orgName, String plz) {
	DtoPartnerSUI input = new DtoPartnerSUI();

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

	input.setDtoRequestHeader(dtoRequestHeader);

	input.setAnschriftJN(ZPV_TRUE);
	input.setBeitragskontonrJN(ZPV_FALSE);
	input.setPartnerDiakritischJN(ZPV_TRUE);
	input.setPruefungFuerGeburtsdatumAenderungJN(ZPV_FALSE);
	input.setPruefungFuerNeuanlageJN(ZPV_FALSE);

	input.setPartnerartKurz("ORG");
	input.setPartnerrollenartKurz("DG");

	input.setPartnername(orgName);
	input.setPostleitzahl(plz);

	return input;
  }
}
