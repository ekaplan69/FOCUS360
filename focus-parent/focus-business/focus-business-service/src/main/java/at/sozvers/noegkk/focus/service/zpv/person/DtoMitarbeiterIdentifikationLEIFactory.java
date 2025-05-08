package at.sozvers.noegkk.focus.service.zpv.person;

import java.math.BigInteger;
import java.util.UUID;
import at.itsv.noegkk.commons.RequestHeadersCommons;
import at.sozialversicherung.schema.zpv.ibs.mitarbeiteridentifikationlesen_7_0.*;
import jakarta.annotation.Resource;
import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

import static at.sozvers.noegkk.focus.service.zpv.infrastructure.ZpvConstants.APP_ID;
import static at.sozvers.noegkk.focus.service.zpv.infrastructure.ZpvConstants.ZEICHENMENGE;

@Dependent
public class DtoMitarbeiterIdentifikationLEIFactory {

  @Resource(lookup="java:global/at/sozvers/noegkk/focus/zpv/LL/BERECHTIGUNGSSYSTEMID")
  public static String BERECHTIGUNGS_SYSTEM_ID;
  @Resource(lookup="java:global/at/sozvers/noegkk/focus/zpv/LL/PRIMAERSYSTEMID")
  public static String PRIMAER_SYSTEM_ID;
  @Resource(lookup="java:global/at/sozvers/noegkk/focus/zpv/LL/QUELLSYSTEMID")
  public static String QUELL_SYSTEM_ID;
  @Resource(lookup="java:global/at/sozvers/noegkk/jsszpvbe2/focus/VERARBEITUNGSMODUS")
  public static String VERARBEITUNGS_MODUS;
  @Resource(lookup="java:global/at/sozvers/noegkk/focus/zpv/LL/ZIELSYSTEMMODUS")
  public static String ZIEL_SYSTEM_MODUS;

  @Inject
  private RequestHeadersCommons requestHeadersCommons;

  public DtoMitarbeiterIdentifikationListeLEI createDtoMitarbeiterIdentifikationListeLEIWithFachschluessel(BigInteger parParRolleId) {
	DtoMitarbeiterIdentifikationListeLEI dtoMitarbeiterIdentifikationListeLEI = new DtoMitarbeiterIdentifikationListeLEI();

	DtoMitarbeiterIdentifikationLEI  dtoMitarbeiterIdentifikationLEI  = new DtoMitarbeiterIdentifikationLEI();
	DtoPartnerParrolleIdentifikation dtoPartnerParrolleIdentifikation = new DtoPartnerParrolleIdentifikation();
	dtoPartnerParrolleIdentifikation.setParParrolleID(parParRolleId);

	DtoRequestHeader dtoRequestHeader = new DtoRequestHeader();
	DtoQuellsystem   dtoQuellsystem   = new DtoQuellsystem();
	DtoKontextRQ     dtoKontextRQ     = new DtoKontextRQ();
	DtoBearbeiter    dtoBearbeiter    = new DtoBearbeiter();
	DtoZielsystem    dtoZielsystem    = new DtoZielsystem();

	dtoQuellsystem.setQuellSystemApplikationsId(APP_ID);
	dtoQuellsystem.setQuellSystemSystemId(QUELL_SYSTEM_ID);

	dtoBearbeiter.setBearbeiterId(requestHeadersCommons.getBearbeiterID());
	dtoBearbeiter.setBerechtigungsSystemId(BERECHTIGUNGS_SYSTEM_ID);
	dtoBearbeiter.setMeldendeStelle(requestHeadersCommons.getMeldendeStelle());
	dtoBearbeiter.setOrgeinheitid(requestHeadersCommons.getOrgeinheitId());

	dtoKontextRQ.setTransaktionsID(requestHeadersCommons.getTransactionUUID());
	dtoKontextRQ.setDtoBearbeiter(dtoBearbeiter);
	dtoKontextRQ.setVerarbeitungsModus(VERARBEITUNGS_MODUS);
	dtoKontextRQ.setPrimaerSystemId(PRIMAER_SYSTEM_ID);
	dtoKontextRQ.setEbenenSequenzNummer(BigInteger.valueOf(1L));
	dtoKontextRQ.setBearbeitungsGrund("FOCUS360");

	dtoZielsystem.setZielSystemModus(ZIEL_SYSTEM_MODUS);

	UUID   uuid         = UUID.randomUUID();
	String uuidAsString = uuid.toString();
	dtoRequestHeader.setNachrichtId(uuidAsString);
	dtoRequestHeader.setZeichenmenge(ZEICHENMENGE);
	dtoRequestHeader.setDtoKontextRQ(dtoKontextRQ);
	dtoRequestHeader.setDtoQuellsystem(dtoQuellsystem);
	dtoRequestHeader.setDtoZielsystem(dtoZielsystem);

	dtoMitarbeiterIdentifikationLEI.setPartnerKurzJN("N");
	dtoMitarbeiterIdentifikationLEI.setNamenszusammenfassungJN("N");
	dtoMitarbeiterIdentifikationLEI.setMitarbeiterAdressenJN("N");
	dtoMitarbeiterIdentifikationLEI.setSvtOEAdressenJN("N");

	dtoMitarbeiterIdentifikationLEI.setDtoPartnerParrolleIdentifikationPartner(dtoPartnerParrolleIdentifikation);
	dtoMitarbeiterIdentifikationListeLEI.getDtoMitarbeiterIdentifikationLEIListe().add(dtoMitarbeiterIdentifikationLEI);
	dtoMitarbeiterIdentifikationListeLEI.setDtoRequestHeader(dtoRequestHeader);

	return dtoMitarbeiterIdentifikationListeLEI;
  }
}
