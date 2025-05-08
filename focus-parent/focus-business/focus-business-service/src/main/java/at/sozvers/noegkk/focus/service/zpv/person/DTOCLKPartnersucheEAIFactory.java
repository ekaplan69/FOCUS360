package at.sozvers.noegkk.focus.service.zpv.person;

import java.math.BigInteger;
import java.util.UUID;
import at.itsv.noegkk.commons.RequestHeadersCommons;
import at.sozialversicherung.schema.zpv.ibs.clkpartnersucheergebnisabfragen_2_0.*;
import jakarta.annotation.Resource;
import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

import static at.sozvers.noegkk.focus.service.zpv.infrastructure.ZpvConstants.APP_ID;
import static at.sozvers.noegkk.focus.service.zpv.infrastructure.ZpvConstants.ZEICHENMENGE;

@Dependent
public class DTOCLKPartnersucheEAIFactory {

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

  public DtoclkPartnersucheEAI createDtoclkPartnersucheEAI(String clkToken) {
	DtoclkPartnersucheEAI input = new DtoclkPartnersucheEAI();

	DtoRequestHeader dtoRequestHeader = new DtoRequestHeader();

	DtoQuellsystem dtoQuellsystem = new DtoQuellsystem();
	dtoQuellsystem.setQuellSystemApplikationsId(APP_ID);
	dtoQuellsystem.setQuellSystemSystemId(QUELL_SYSTEM_ID);
	dtoRequestHeader.setDtoQuellsystem(dtoQuellsystem);
	dtoRequestHeader.setZeichenmenge(ZEICHENMENGE);

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

	input.setClkToken(clkToken);

	return input;
  }
}
