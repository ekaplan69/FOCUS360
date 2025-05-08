package at.sozvers.noegkk.focus.ws.client.zup;

import javax.xml.datatype.*;
import java.net.MalformedURLException;
import java.util.*;
import com.oracle.xmlns.zupws.*;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@Disabled("Test auf Ignore seit 09.2022")
class ZupClientIT {
  @Test
  void testZupWsProcess() throws MalformedURLException {
	ZupClient zupClient = new ZupClient("12-FOCUS360-E0001-000", "http://xidappl0.test.sozvers.at:59000", "5.0.0.0", "XID_ZUP_12-FOCUS360-E0001-000", "q90Eu7TVTw24Ah");

	ZupwsProcessResponse response = zupClient.process(createProtkolle());

	assertNotNull(response);
	assertEquals("ESB_S_100", response.getFehlerCode());
	assertEquals("Datenpaket entgegengenommen", response.getFehlerMessage());
	assertEquals(ResponseStatusEnum.S, response.getStatus());
  }

  private List<Protokolle.Prot> createProtkolle() {
	List<Protokolle.Prot> protokolle      = new ArrayList<>();
	Protokolle.Prot       protokollSingle = new Protokolle.Prot();

	protokollSingle.setApplBetreiber("12");
	protokollSingle.setApplikation("FOCUS360");
	protokollSingle.setMod(ModEnum.O);
	protokollSingle.setSystemumgebung("V");
	protokollSingle.setVersion(1);
	protokollSingle.setVSTR("12");
	protokollSingle.setBenutzerID("1222736");
	protokollSingle.setDatum(convertDate2XMLDate(new Date()));
	protokollSingle.setKRITTYP1("P");
	protokollSingle.setKRITWERT1("2280049");
	protokollSingle.setKRITTYP2("FachschluesselArt");
	protokollSingle.setKRITWERT2("VSNR");
	protokollSingle.setKRITTYP3("Fachschluessel");
	protokollSingle.setKRITWERT3("1234010100");
	protokollSingle.setProtLogID("F360_READ_VD");
	protokollSingle.setOrg("ORGIT");
	protokollSingle.setGrund("Versichertenauskunft");
	protokollSingle.setTrans("1234567890abc");

	protokolle.add(protokollSingle);
	return protokolle;
  }

  private XMLGregorianCalendar convertDate2XMLDate(Date date) {
	if(date == null) {
	  return null;
	}

	GregorianCalendar cal = new GregorianCalendar();
	cal.setTime(date);
	int day         = cal.get(Calendar.DAY_OF_MONTH);
	int month       = cal.get(Calendar.MONTH) + 1;
	int year        = cal.get(Calendar.YEAR);
	int hour        = cal.get(Calendar.HOUR_OF_DAY);
	int minute      = cal.get(Calendar.MINUTE);
	int second      = cal.get(Calendar.SECOND);
	int millisecond = cal.get(Calendar.MILLISECOND);

	try {
	  return DatatypeFactory.newInstance().newXMLGregorianCalendar(year, month, day, hour, minute, second, millisecond, 0x80000000);
	} catch(DatatypeConfigurationException e1) {
	  return null;
	}
  }
}
