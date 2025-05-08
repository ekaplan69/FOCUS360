package at.sozvers.noegkk.focus.service.zugriffsprotokollierung;

import at.sozvers.noegkk.focus.service.api.zugriffsprotokollierung.ZugriffsprotokollBTO;
import at.sozvers.noegkk.focus.service.common.DateUtil;
import at.sozvers.noegkk.focus.service.mapping.BTOExternalServiceMapper;
import at.sozvers.noegkk.focus.ws.client.zup.UmgebungEnum;
import com.oracle.xmlns.zupws.*;

public class ZugriffsprotokollBTOExternalServiceMapper extends BTOExternalServiceMapper<ZugriffsprotokollBTO, Protokolle.Prot> {
  @Override
  public Protokolle.Prot map(ZugriffsprotokollBTO zup) {
	Protokolle.Prot prot = new Protokolle.Prot();

	//Mandatory
	prot.setApplBetreiber(zup.getApplBetreiber());
	prot.setApplikation(zup.getApplikation());
	prot.setMod(ModEnum.valueOf(zup.getVerarbeitungsmodus()));
	prot.setSystemumgebung(UmgebungEnum.getDecodedZupEnv(zup.getSystemumgebung()));
	prot.setVersion(zup.getVersion());
	prot.setVSTR(zup.getVstr());
	prot.setBenutzerID(zup.getBenutzerID());
	prot.setDatum(DateUtil.convertDate2XMLDate(zup.getDatum()));
	prot.setKRITTYP1(zup.getKrittyp1());
	prot.setKRITWERT1(zup.getKritwert1());
	prot.setProtLogID(zup.getProtLogID());
	prot.setProtokollierungspflicht(Protokollierungspflicht.fromValue(zup.getProtokollierungspflicht()));
	prot.setQuellsystemID(zup.getQuellsystemId());
	prot.setBerechtigungssystemID(zup.getBerechtigungsSystemId());
	if(zup.getTransaktionskennungkurz() != null) {
	  prot.setTransKurz(zup.getTransaktionskennungkurz());
	} else {
	  prot.setTransKurz("");
	}

	//Zusatzblock
	prot.setOPT1(zup.getZusatz1());
	prot.setOPT2(zup.getZusatz2());
	prot.setOPT3(zup.getZusatz3());
	prot.setOPT4(zup.getZusatz4());
	prot.setOPT5(zup.getZusatz5());
	prot.setOPT6(zup.getZusatz6());
	prot.setOPT7(zup.getZusatz7());
	prot.setOPT8(zup.getZusatz8());

	//Optional
	prot.setOrg(zup.getOrg());
	prot.setGrund(zup.getGrund());
	if(zup.getTransaktionskennung() == null) {
	  prot.setTrans(""); // Verhindert Absturz des ZUP-WS
	} else {
	  prot.setTrans(zup.getTransaktionskennung());
	}
	prot.setFehler(zup.getFehler());
	if(zup.getKrittyp2() != null && zup.getKrittyp2().trim().length() > 0 && zup.getKritwert2() != null && zup.getKritwert2().trim().length() > 0) {
	  prot.setKRITTYP2(zup.getKrittyp2());
	  prot.setKRITWERT2(zup.getKritwert2());
	}
	if(zup.getKrittyp3() != null && zup.getKrittyp3().trim().length() > 0 && zup.getKritwert3() != null && zup.getKritwert3().trim().length() > 0) {
	  prot.setKRITTYP3(zup.getKrittyp3());
	  prot.setKRITWERT3(zup.getKritwert3());
	}
	return prot;
  }
}
