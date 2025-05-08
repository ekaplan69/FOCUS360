package at.sozvers.noegkk.focus.service.dsgvo;

import javax.xml.transform.*;
import javax.xml.transform.sax.SAXResult;
import javax.xml.transform.stream.StreamSource;
import java.io.*;
import java.net.URL;
import java.util.List;
import at.sozvers.noegkk.focus.service.api.ecard.ECarddatenBTO;
import at.sozvers.noegkk.focus.service.api.kva.abzsuc.AngehoerigeBTO;
import at.sozvers.noegkk.focus.service.api.kva.abzsuc.VersicherterBTO;
import at.sozvers.noegkk.focus.service.api.kva.gbfsuc.GebuehrenbefreiungBTO;
import at.sozvers.noegkk.focus.service.api.zpv.adresse.AdresseBTO;
import at.sozvers.noegkk.focus.service.api.zpv.person.StammdatenBTO;
import at.sozvers.noegkk.focus.service.common.Fachschluessel;
import at.sozvers.noegkk.focus.service.dsgvo.fop.DSGVOReportXml;
import at.sozvers.noegkk.focus.service.ecard.ecarddaten.ECarddatenService;
import at.sozvers.noegkk.focus.service.kva.abzsuc.AngehoerigeService;
import at.sozvers.noegkk.focus.service.kva.abzsuc.VersicherterService;
import at.sozvers.noegkk.focus.service.kva.gbfsuc.GebuehrenbefreiungService;
import at.sozvers.noegkk.focus.service.lgkk.LeistungService;
import at.sozvers.noegkk.focus.service.zpv.adresse.AdresseService;
import at.sozvers.noegkk.focus.service.zpv.infrastructure.ZpvConstants;
import at.sozvers.noegkk.focus.service.zpv.person.PersonService;
import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;
import jakarta.xml.bind.*;
import org.apache.avalon.framework.configuration.*;
import org.apache.fop.apps.*;
import org.slf4j.Logger;
import org.xml.sax.SAXException;

@Dependent
public class DSGVOService {
  @Inject
  private AdresseService            adresseService;
  @Inject
  private AngehoerigeService        angehoerigeService;
  @Inject
  private ECarddatenService         eCarddatenService;
  @Inject
  private GebuehrenbefreiungService gebuehrenbefreiungService;
  @Inject
  private LeistungService           leistungService;
  @Inject
  private Logger                    log;
  @Inject
  private PersonService             personService;
  @Inject
  private VersicherterService       versicherterService;

  public byte[] createPdf(String fs, String fsArt, Double personPid, List<Integer> landesStellen) throws ConfigurationException, IOException, SAXException, TransformerException, JAXBException {
	ByteArrayOutputStream out        = new ByteArrayOutputStream();
	FopFactory            fopFactory = createFopFactory(getClass());
	FOUserAgent           agent      = fopFactory.newFOUserAgent();
	agent.setBaseURL(fopFactory.getBaseURL());

	Fop fop = fopFactory.newFop(org.apache.xmlgraphics.util.MimeConstants.MIME_PDF, agent, out);

	URL          url = getClass().getResource("/fop/dsgvo/dsgvo.xsl");
	StreamSource xsl = new StreamSource(url.toString());

	TransformerFactory factory     = TransformerFactory.newInstance();
	Transformer        transformer = factory.newTransformer(xsl);
	transformer.setParameter("versionParam", "2.0");
	transformer.setErrorListener(new DefaultErrorListener());

	DSGVOReportXml report         = new DSGVOReportXml();
	Fachschluessel fachschluessel = new Fachschluessel(fs, fsArt);
	report.setFachschluessel(fachschluessel);
	fillStammdaten(report);
	fillAdressen(report, fsArt);
	fillVersicherte(report);
	fillAngehoerige(report);
	fillLeistungen(report, fs, personPid, landesStellen);
	log("fillEcard");
	fillEcarddaten(report);
	log("fillGebuehrenbefreiung");
	fillGebuehrenbefreiung(report);

	String inputXml = convertXml(report);

	log.info("DSGVO XML: ");
	log.info("\n" + inputXml);

	StreamSource xml = new StreamSource(new StringReader(inputXml));
	Result       res = new SAXResult(fop.getDefaultHandler());
	transformer.transform(xml, res);

	return out.toByteArray();
  }

  public static FopFactory createFopFactory(Class<? extends Object> klass) throws ConfigurationException, SAXException, IOException {
	FopFactory                  fopFactory     = FopFactory.newInstance();
	InputStream                 userConfigFile = klass.getResourceAsStream("/fop/fopconfig.xml");
	DefaultConfigurationBuilder cfgBuilder     = new DefaultConfigurationBuilder();
	Configuration               cfg            = cfgBuilder.build(userConfigFile);
	fopFactory.setUserConfig(cfg);
	fopFactory.setBaseURL(klass.getResource("/fop").toString());
	return fopFactory;
  }

  private void fillStammdaten(DSGVOReportXml report) {
	try {
	  StammdatenBTO stammdatenBTO = personService.searchByFachschluessel(report.getFachschluessel());
	  report.setStammdaten(stammdatenBTO);
	} catch(Exception e) {
	  String message = "Fehler beim Lesen der Stammdaten von ZPV für den DSGVO-Report. (" + e.getMessage() + ")";
	  report.setStammdatenError(message);
	  log.error(message, e);
	}
  }

  private void fillAdressen(DSGVOReportXml report, String fsArt) {
	try {
	  String           gebrauchArt    = fsArt.equals("DGNR") ? ZpvConstants.GEBRAUCHART_GESCH : ZpvConstants.GEBRAUCHART_PRIVA;
	  List<AdresseBTO> adresseBTOList = adresseService.searchByFachschluessel(report.getFachschluessel(), gebrauchArt);
	  report.setAdressen(adresseBTOList);
	} catch(Exception e) {
	  String message = "Fehler beim Lesen der Adressdaten von ZPV für den DSGVO-Report. (" + e.getMessage() + ")";
	  report.setAdressenError(message);
	  log.error(message, e);
	}
  }

  private void fillVersicherte(DSGVOReportXml report) {
	try {
	  List<VersicherterBTO> versicherterBTOList = versicherterService.searchVersicherteByFachschluessel(report.getFachschluessel());
	  report.setVersicherte(versicherterBTOList);
	} catch(Exception e) {
	  String message = "Fehler beim Lesen der Versicherten-Daten von KVA für den DSGVO-Report. (" + e.getMessage() + ")";
	  report.setVersicherteError(message);
	  log.error(message, e);
	}
  }

  private void fillAngehoerige(DSGVOReportXml report) {
	try {
	  List<AngehoerigeBTO> angehoerigeBTOList = angehoerigeService.searchAngehoerigeByFachschluessel(report.getFachschluessel());
	  report.setAngehoerige(angehoerigeBTOList);
	} catch(Exception e) {
	  String message = "Fehler beim Lesen der Angehörigen-Daten von KVA für den DSGVO-Report. (" + e.getMessage() + ")";
	  report.setAngehoerigeError(message);
	  log.error(message, e);
	}
  }

  private void fillLeistungen(DSGVOReportXml report, String fs, Double personPid, List<Integer> landesStellen) {
	try {
	  report.setLeistungen(leistungService.leseLeistungenDSGVO(fs, personPid, landesStellen));
	} catch(Exception e) {
	  String message = "Fehler beim Lesen der Daten von LGKK für den DSGVO-Report. (" + e.getMessage() + ")";
	  report.setLeistungenError(message);
	  log.error(message, e);
	}
  }

  private void log(String message) {
	log(message, null);
  }

  private void fillEcarddaten(DSGVOReportXml report) {
	try {
	  ECarddatenBTO eCarddatenBTO = eCarddatenService.searchEcardByFachschluessel(report.getFachschluessel());
	  if(eCarddatenBTO != null) {
		eCarddatenBTO.setLetzteKonsultation(eCarddatenService.searchLetzteKonsultationDatum(report.getFachschluessel()));
		if(eCarddatenBTO.getLaufnummer() != null) {
		  eCarddatenBTO.setLaufnummer(eCarddatenBTO.getLaufnummer().substring(10, 13));
		}
	  }
	  report.setEcard(eCarddatenBTO);
	} catch(Exception e) {
	  String message = "Fehler beim Lesen der E-Card-Daten für den DSGVO-Report. (" + e.getMessage() + ")";
	  report.setEcardError(message);
	  log.error(message, e);
	}
  }

  private void fillGebuehrenbefreiung(DSGVOReportXml report) {
	try {
	  List<GebuehrenbefreiungBTO> gebuehrenbefreiungBTO = gebuehrenbefreiungService.searchGebuehrenbefreiungenByFachschluessel(report.getFachschluessel());
	  report.setGebuehrenbefreiung(gebuehrenbefreiungBTO);
	} catch(Exception e) {
	  String message = "Fehler beim Laden der Gebührenbefreiungsdaten von KVA für den DSGVO-Report. (" + e.getMessage() + ")";
	  report.setGebuehrenbefreiungError(message);
	  log.error(message, e);
	}
  }

  private String convertXml(DSGVOReportXml report) throws JAXBException {
	JAXBContext jc = JAXBContext.newInstance(DSGVOReportXml.class);
	Marshaller  m  = jc.createMarshaller();
	m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
	StringWriter out = new StringWriter();
	m.marshal(report, out);
	return out.toString();
  }

  private void log(String message, Exception e) {
	if(e != null) {
	  log.error(message, e);
	  e.printStackTrace();
	}
	log.info(message);
  }

  public static class DefaultErrorListener implements ErrorListener {

	@Override
	public void warning(TransformerException exception) {
	  //Nothing to warn about
	}

	@Override
	public void error(TransformerException exception) throws TransformerException {
	  throw exception;
	}

	@Override
	public void fatalError(TransformerException exception) throws TransformerException {
	  throw exception;
	}
  }
}
