package at.sozvers.noegkk.focus.service.ecm.geschaeftsfall;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.XMLGregorianCalendar;
import at.sozvers.focus.ws.client.ECMAWFHeader;
import at.sozvers.focus.ws.client.GeschaeftsfallRestClient;
import at.sozvers.focus.ws.geschaeftsfall.starten.GeschaeftsfallStarten;
import at.sozvers.focus.ws.geschaeftsfall.starten.MetadatenTyp;
import at.sozvers.noegkk.focus.CdiExtension;
import at.sozvers.noegkk.focus.service.common.DateUtil;
import jakarta.ws.rs.core.Response;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.spy;

@Disabled("Anforderung wiederrufen")
@ExtendWith(CdiExtension.class)
class GeschaeftsfallRestClientIT {

  private static final String ENDPOINT           = "https://ecmservicesitu.sozvers.at";
  private static final String PASSWORD           = "rfCiqURYaadLXUzP2z2nkXD7u";
  private static final String SYSTEMMODUS        = "T";
  private static final String USERNAME           = "12FOCUS";
  private static final String VERARBEITUNGSMODUS = "O";

  private GeschaeftsfallRestClient testedObject;

  @BeforeEach
  public void before() {
	if(testedObject == null) {
	  testedObject = newInstance();
	}
  }

  public GeschaeftsfallRestClient newInstance() {
	GeschaeftsfallRestClient client = spy(new GeschaeftsfallRestClient());
	client.setEndpoint(ENDPOINT);
	client.setUsername(USERNAME);
	client.setPassword(PASSWORD);
	client.setSystemmodus(SYSTEMMODUS);
	client.setVerarbeitungsmodus(VERARBEITUNGSMODUS);
	return client;
  }

  @Test
  void geschaeftsfallStartenAndLesen_Success() throws DatatypeConfigurationException {
	GeschaeftsfallStarten startenXML = new GeschaeftsfallStarten();
	startenXML.setObjektKlasse("beschwerdemanagement.wf_beschwerdemanagement");

	MetadatenTyp metadaten = new MetadatenTyp();

	MetadatenTyp.Feld rolle = new MetadatenTyp.Feld();
	rolle.setName("beschwerdemanagement-metadata-model.kundendaten_rolle");
	rolle.setWert("vsnr");
	metadaten.getFeld().add(rolle);

	MetadatenTyp.Feld fachschluessel = new MetadatenTyp.Feld();
	fachschluessel.setName("beschwerdemanagement-metadata-model.kundendaten_fachschluessel");
	fachschluessel.setWert("1111111111");
	metadaten.getFeld().add(fachschluessel);

	MetadatenTyp.Feld beschreibung = new MetadatenTyp.Feld();
	beschreibung.setName("beschwerdemanagement-metadata-model.geschaeftsfalldetails_beschreibung");
	beschreibung.setWert("Test Beschreibung Beschwerdeworkflow");
	metadaten.getFeld().add(beschreibung);

	XMLGregorianCalendar cal = DateUtil.createXmlCalendar(2019, 4, 15);
	cal.setTime(15, 20, 0, 0);
	cal.setTimezone(0);
	//System.out.println(cal.toXMLFormat());
	MetadatenTyp.Feld einlangdatum = new MetadatenTyp.Feld();
	einlangdatum.setName("beschwerdemanagement-metadata-model.geschaeftsfalldetails_einlangdatum");
	einlangdatum.setWert(cal.toXMLFormat()); //Typ date
	metadaten.getFeld().add(einlangdatum);

	MetadatenTyp.Feld einlangart = new MetadatenTyp.Feld();
	einlangart.setName("beschwerdemanagement-metadata-model.geschaeftsfalldetails_einlangart");
	einlangart.setWert("brief");
	metadaten.getFeld().add(einlangart);

	MetadatenTyp.Feld kundenrueckmeldung = new MetadatenTyp.Feld();
	kundenrueckmeldung.setName("beschwerdemanagement-metadata-model.geschaeftsfalldetails_kundenrueckmeldung");
	kundenrueckmeldung.setWert("Lob");
	metadaten.getFeld().add(kundenrueckmeldung);

	startenXML.setMetadaten(metadaten);

	Response output = testedObject.geschaefstfallStarten(startenXML, new ECMAWFHeader());

	assertNotNull(output);
	assertEquals(200, output.getStatus());
  }
}
