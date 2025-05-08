package at.sozvers.noegkk.focus.ws.client.kontakt;

import javax.xml.namespace.QName;
import java.net.URL;
import at.itsv.security.servicesecurity.client.SecuredServiceClient;
import at.sozvers.noegkk.sckont.kontakt.focus.*;
import jakarta.enterprise.context.Dependent;
import jakarta.xml.ws.BindingProvider;
import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Dependent
public class KontaktClient {

  private static final Logger                 LOG          = LoggerFactory.getLogger(KontaktClient.class);
  private static final QName                  SERVICE_NAME = new QName("http://focus.kontakt.sckont.noegkk.sozvers.at/", "SCKONTKontaktService_1_0Service");
  private              String                 password;
  private              SCKONTKontaktService10 sckontKontaktService;
  private              String                 systemmodus;
  private              String                 username;
  private              String                 wsUrl;

  public KontaktClient() {

  }

  public KontaktClient(String wsUrl, String systemmodus, String username, String password) {
	this.wsUrl = wsUrl;
	this.systemmodus = systemmodus;
	this.username = username;
	this.password = password;
  }

  public String getSystemmodus() {
	return systemmodus;
  }

  public KontaktAufggAaMstMapErmittelnResponse kontaktAufggAaMstMapErmitteln(KontaktAufggAaMstMapErmittelnRequest request) {
	if(sckontKontaktService == null) {
	  sckontKontaktService = init();
	}

	return sckontKontaktService.kontaktAufggAaMstMapErmitteln(request);
  }

  private SCKONTKontaktService10 init() {

	URL                           wsdlURL        = KontaktClient.class.getResource("/wsdl/SCKONTKontaktService_1_0.wsdl");
	SCKONTKontaktService10Service service        = new SCKONTKontaktService10Service(wsdlURL, SERVICE_NAME);
	SCKONTKontaktService10        kontaktService = service.getSCKONTKontaktService10Port();

	addEndpoint(kontaktService, "/SCKONTKontaktService_1_0");
	addWebServiceSecurity(kontaktService, username, password);

	return kontaktService;
  }

  private void addEndpoint(Object obj, String endpoint) {
	LOG.info(wsUrl);
	((BindingProvider) obj).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, wsUrl + endpoint);
  }

  private <I> void addWebServiceSecurity(I port, String wsUser, String wsPassword) {
	SecuredServiceClient.createForService(port).withCredentials(wsUser, wsPassword).apply();
	Client cl = ClientProxy.getClient(port);
  }

  public KontaktAufggKtMstMapErmittelnResponse kontaktAufggKtMstMapErmitteln(KontaktAufggKtMstMapErmittelnRequest request) {
	if(sckontKontaktService == null) {
	  sckontKontaktService = init();
	}

	return sckontKontaktService.kontaktAufggKtMstMapErmitteln(request);
  }

  public KontaktAufggSubMapErmittelnReponse kontaktAufggSubMapsErmitteln(KontaktAufggSubMapErmittelnRequest request) {
	if(sckontKontaktService == null) {
	  sckontKontaktService = init();
	}

	return sckontKontaktService.kontaktAufggSubMapErmitteln(request);
  }

  public KontaktAufggThemaMstMapErmittelnResponse kontaktAufggThemaMstMapErmitteln(KontaktAufggThemaMstMapErmittelnRequest request) {
	if(sckontKontaktService == null) {
	  sckontKontaktService = init();
	}

	return sckontKontaktService.kontaktAufggThemaMstMapErmitteln(request);
  }

  public KontaktHistorieErmittelnResponse kontaktHistorieErmitteln(KontaktHistorieErmittelnRequest request) {
	if(sckontKontaktService == null) {
	  sckontKontaktService = init();
	}

	return sckontKontaktService.kontaktHistorieErmitteln(request);
  }

  public KontaktUnterthemenErmittelnResponse kontaktUnterthemenErmitteln(KontaktUnterthemenErmittelnRequest request) {
	if(sckontKontaktService == null) {
	  sckontKontaktService = init();
	}

	return sckontKontaktService.kontaktUnterthemenErmitteln(request);
  }

  public KontaktabschlussartErmittelnResponse kontaktabschlussartErmitteln(KontaktabschlussartErmittelnRequest request) {
	if(sckontKontaktService == null) {
	  sckontKontaktService = init();
	}

	return sckontKontaktService.kontaktabschlussartErmitteln(request);
  }

  public KontaktaufgabengebietErmittelnResponse kontaktaufgabengebietErmitteln(KontaktaufgabengebietErmittelnRequest request) {
	if(sckontKontaktService == null) {
	  sckontKontaktService = init();
	}

	return sckontKontaktService.kontaktaufgabengebietErmitteln(request);
  }

  public KontaktkontaktAendernResponse kontaktkontaktAendern(KontaktkontaktAendernRequest request) {
	if(sckontKontaktService == null) {
	  sckontKontaktService = init();
	}

	return sckontKontaktService.kontaktkontaktAendern(request);
  }

  public KontaktkontaktErmittelnResponse kontaktkontaktErmitteln(KontaktkontaktErmittelnRequest request) {
	if(sckontKontaktService == null) {
	  sckontKontaktService = init();
	}

	return sckontKontaktService.kontaktkontakteErmitteln(request);
  }

  public KontaktkontaktErstellenResponse kontaktkontaktErstellen(KontaktkontaktErstellenRequest request) {
	if(sckontKontaktService == null) {
	  sckontKontaktService = init();
	}

	return sckontKontaktService.kontaktkontaktErstellen(request);
  }

  public KontaktkontaktLesenResponse kontaktkontaktLesen(KontaktkontaktLesenRequest request) {
	if(sckontKontaktService == null) {
	  sckontKontaktService = init();
	}

	return sckontKontaktService.kontaktkontaktLesen(request);
  }

  public KontaktkontaktLoeschenResponse kontaktkontaktLoeschen(KontaktkontaktLoeschenRequest request) {
	if(sckontKontaktService == null) {
	  sckontKontaktService = init();
	}

	return sckontKontaktService.kontaktkontaktLoeschen(request);
  }

  public KontaktkontaktartErmittelnResponse kontaktkontaktartErmitteln(KontaktkontaktartErmittelnRequest request) {
	if(sckontKontaktService == null) {
	  sckontKontaktService = init();
	}

	return sckontKontaktService.kontaktkontaktartErmitteln(request);
  }

  public KontaktthemaErmittelnResponse kontaktthemaErmitteln(KontaktthemaErmittelnRequest request) {
	if(sckontKontaktService == null) {
	  sckontKontaktService = init();
	}

	return sckontKontaktService.kontaktthemaErmitteln(request);
  }

  public GueltigeOesErmittelnResponse leseGueltigeOes(GueltigeOesErmittelnRequest request) {
	if(sckontKontaktService == null) {
	  sckontKontaktService = init();
	}

	return sckontKontaktService.leseGueltigeOes(request);
  }

  public OffeneKontakteErmittelnResponse offenekontaktErmitteln(OffeneKontakteErmittelnRequest request) {
	if(sckontKontaktService == null) {
	  sckontKontaktService = init();
	}

	return sckontKontaktService.offeneKontakteErmitteln(request);
  }

  public OffeneKontakteErmittelnForFSResponse offenekontaktErmittelnForFs(OffeneKontakteErmittelnForFSRequest request) {
	if(sckontKontaktService == null) {
	  sckontKontaktService = init();
	}

	return sckontKontaktService.offeneKontakteErmittelnForFS(request);
  }
}
