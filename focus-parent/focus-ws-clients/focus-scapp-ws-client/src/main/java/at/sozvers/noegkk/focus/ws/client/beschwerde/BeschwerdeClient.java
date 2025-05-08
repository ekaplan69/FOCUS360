package at.sozvers.noegkk.focus.ws.client.beschwerde;

import javax.xml.namespace.QName;
import java.net.URL;
import at.itsv.security.servicesecurity.client.SecuredServiceClient;
import at.sozvers.noegkk.sckont.beschwerde.focus.*;
import jakarta.enterprise.context.Dependent;
import jakarta.xml.ws.BindingProvider;
import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Dependent
public class BeschwerdeClient {

  private static final Logger                    LOG          = LoggerFactory.getLogger(BeschwerdeClient.class);
  private static final QName                     SERVICE_NAME = new QName("http://focus.beschwerde.sckont.noegkk.sozvers.at/", "SCKONTBeschwerdeService_1_0Service");
  private              SCKONTBeschwerdeService10 iBeschwerdeService;
  private              String                    password;
  private              String                    systemmodus;
  private              String                    username;
  private              String                    wsUrl;

  public BeschwerdeClient() {

  }

  public BeschwerdeClient(String wsUrl, String systemmodus, String username, String password) {
	this.wsUrl = wsUrl;
	this.systemmodus = systemmodus;
	this.username = username;
	this.password = password;
  }

  public BeschwerdeAendernResponse beschwerdeAendern(BeschwerdeAendernRequest input) {
	if(iBeschwerdeService == null) {
	  iBeschwerdeService = init();
	}

	return iBeschwerdeService.beschwerdeAendern(input);
  }

  private SCKONTBeschwerdeService10 init() {
	URL                              wsdlURL           = BeschwerdeClient.class.getResource("/wsdl/Scappws.wsdl");
	SCKONTBeschwerdeService10Service service           = new SCKONTBeschwerdeService10Service(wsdlURL, SERVICE_NAME);
	SCKONTBeschwerdeService10        beschwerdeService = service.getSCKONTBeschwerdeService10Port();

	addEndpoint(beschwerdeService, "/SCKONTBeschwerdeService_1_0");
	addWebServiceSecurity(beschwerdeService, username, password);

	return beschwerdeService;
  }

  private void addEndpoint(Object obj, String endpoint) {
	LOG.info(wsUrl);
	((BindingProvider) obj).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, wsUrl + endpoint);
  }

  private <I> void addWebServiceSecurity(I port, String wsUser, String wsPassword) {
	SecuredServiceClient.createForService(port).withCredentials(wsUser, wsPassword).apply();
	Client cl = ClientProxy.getClient(port);
  }

  public BeschwerdeErstellenResponse beschwerdeErstellen(BeschwerdeErstellenRequest input) {
	if(iBeschwerdeService == null) {
	  iBeschwerdeService = init();
	}

	return iBeschwerdeService.beschwerdeErstellen(input);
  }

  public BeschwerdeLesenResponse beschwerdeLesen(BeschwerdeLesenRequest input) {
	if(iBeschwerdeService == null) {
	  iBeschwerdeService = init();
	}

	return iBeschwerdeService.beschwerdeLesen(input);
  }

  public BeschwerdeStornierenResponse beschwerdeStornieren(BeschwerdeStornierenRequest input) {
	if(iBeschwerdeService == null) {
	  iBeschwerdeService = init();
	}

	return iBeschwerdeService.beschwerdeStornieren(input);
  }

  public BeschwerdebereichErmittelnResponse beschwerdebereichErmitteln(BeschwerdebereichErmittelnRequest input) {
	if(iBeschwerdeService == null) {
	  iBeschwerdeService = init();
	}

	return iBeschwerdeService.beschwerdebereichErmitteln(input);
  }

  public BeschwerdenErmittelnResponse beschwerdenErmitteln(BeschwerdenErmittelnRequest input) {
	if(iBeschwerdeService == null) {
	  iBeschwerdeService = init();
	}

	return iBeschwerdeService.beschwerdenErmitteln(input);
  }

  public String getSystemmodus() {
	return systemmodus;
  }
}
