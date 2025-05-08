package at.sozvers.noegkk.focus.service.zugriffsprotokollierung;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import at.sozvers.noegkk.architektur.zup.model.Zugriffsprotokoll;
import at.sozvers.noegkk.focus.service.api.zugriffsprotokollierung.ZugriffsprotokollBTO;
import at.sozvers.noegkk.focus.service.mapping.BTOExternalServiceMapper;

public class ZugriffsprotokollBTOEntityMapper extends BTOExternalServiceMapper<ZugriffsprotokollBTO, Zugriffsprotokoll> {
  @Override
  public ZugriffsprotokollBTO map(Zugriffsprotokoll zup) {
	ZugriffsprotokollBTO zugriffsprotokollBto = new ZugriffsprotokollBTO();
	SimpleDateFormat     df                   = new SimpleDateFormat("yyyyMMddHHmmssSS");

	//Mandatory
	zugriffsprotokollBto.setZupId(zup.getId());
	zugriffsprotokollBto.setApplBetreiber(zup.getZvst());
	zugriffsprotokollBto.setApplikation(zup.getIdApp());
	zugriffsprotokollBto.setQuellsystemId(zup.getQuellSystemId());
	zugriffsprotokollBto.setSystemumgebung(zup.getSystemModus());
	zugriffsprotokollBto.setVersion(1);
	zugriffsprotokollBto.setProtokollierungspflicht(zup.getProtokollierungspflicht());
	zugriffsprotokollBto.setVerarbeitungsmodus(zup.getVerarbeitungsModus());
	zugriffsprotokollBto.setVstr(zup.getTraegerId());
	zugriffsprotokollBto.setBenutzerID(zup.getBenutzerId());
	zugriffsprotokollBto.setBerechtigungsSystemId(zup.getBerechitgungsSystemId());
	try {
	  zugriffsprotokollBto.setDatum(df.parse(zup.getProtokollDatum() + zup.getProtokollZeitpunkt()));
	} catch(ParseException e) {
	  //Ignore Exception
	}
	zugriffsprotokollBto.setKrittyp1(zup.getKriteriumTyp_1());
	zugriffsprotokollBto.setKritwert1(zup.getKriteriumWert_1());
	zugriffsprotokollBto.setProtLogID(zup.getLogId());

	//Zusatzblock
	zugriffsprotokollBto.setZusatz1(zup.getZusatz_1());
	zugriffsprotokollBto.setZusatz2(zup.getZusatz_2());
	zugriffsprotokollBto.setZusatz3(zup.getZusatz_3());
	zugriffsprotokollBto.setZusatz4(zup.getZusatz_4());
	zugriffsprotokollBto.setZusatz5(zup.getZusatz_5());
	zugriffsprotokollBto.setZusatz6(zup.getZusatz_6());
	zugriffsprotokollBto.setZusatz7(zup.getZusatz_7());
	zugriffsprotokollBto.setZusatz8(zup.getZusatz_8());
	zugriffsprotokollBto.setZusatz9(zup.getZusatz_9());
	zugriffsprotokollBto.setZusatz10(zup.getZusatz_10());
	zugriffsprotokollBto.setZusatz11(zup.getZusatz_11());
	zugriffsprotokollBto.setZusatz12(zup.getZusatz_12());
	zugriffsprotokollBto.setZusatz13(zup.getZusatz_13());
	zugriffsprotokollBto.setZusatz14(zup.getZusatz_14());
	zugriffsprotokollBto.setZusatz15(zup.getZusatz_15());

	//Optional
	zugriffsprotokollBto.setOrg(zup.getBenutzerOrgEinheit());
	zugriffsprotokollBto.setGrund(zup.getBearbeitungsGrund());
	if(zup.getTransaktionsKennung() == null) {
	  zugriffsprotokollBto.setTransaktionskennung(""); // Verhindert Absturz des ZUP-WS
	} else {
	  zugriffsprotokollBto.setTransaktionskennung(zup.getTransaktionsKennung());
	}
	if(zup.getTransaktionsKennungKurz() == null) {
	  zugriffsprotokollBto.setTransaktionskennungkurz("");
	} else {
	  zugriffsprotokollBto.setTransaktionskennungkurz(zup.getTransaktionsKennungKurz());
	}
	zugriffsprotokollBto.setFehler(zup.getFehler());
	if(zup.getKriteriumTyp_2() != null && zup.getKriteriumTyp_2().trim().length() > 0 && zup.getKriteriumWert_2() != null && zup.getKriteriumWert_2().trim().length() > 0) {
	  zugriffsprotokollBto.setKrittyp2(zup.getKriteriumTyp_2());
	  zugriffsprotokollBto.setKritwert2(zup.getKriteriumWert_2());
	}
	if(zup.getKriteriumTyp_3() != null && zup.getKriteriumTyp_3().trim().length() > 0 && zup.getKriteriumWert_3() != null && zup.getKriteriumWert_3().trim().length() > 0) {
	  zugriffsprotokollBto.setKrittyp3(zup.getKriteriumTyp_3());
	  zugriffsprotokollBto.setKritwert3(zup.getKriteriumWert_3());
	}
	if(zup.getVerarbeitetjn() != null && !zup.getVerarbeitetjn().trim().isEmpty()) {
	  zugriffsprotokollBto.setVerarbeitet_JN(zup.getVerarbeitetjn());
	} else {
	  zugriffsprotokollBto.setVerarbeitet_JN("N"); //Standardwert
	}
	if(zup.getVerarbdat() != null) {
	  zugriffsprotokollBto.setVerarbdate(zup.getVerarbdat());
	}
	if(zup.getFehlertext() != null && !zup.getFehlertext().trim().isEmpty()) {
	  zugriffsprotokollBto.setFehlertext(zup.getFehlertext());
	}

	return zugriffsprotokollBto;
  }
}
