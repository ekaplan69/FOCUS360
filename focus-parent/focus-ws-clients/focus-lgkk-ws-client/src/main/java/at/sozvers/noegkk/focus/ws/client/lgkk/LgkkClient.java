package at.sozvers.noegkk.focus.ws.client.lgkk;

import javax.xml.namespace.QName;
import java.net.URL;
import at.itsv.security.servicesecurity.client.SecuredServiceClient;
import at.itsv.services.lgkk.Focus360WsImplService;
import at.itsv.services.lgkk.Focus360WsV20;
import at.sozvers.stp.lgkk.webservice.focus360.v20.*;
import jakarta.enterprise.context.Dependent;
import jakarta.xml.ws.BindingProvider;
import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Dependent
public class LgkkClient {
  private static final Logger        LOGGER = LoggerFactory.getLogger(LgkkClient.class);
  private              Focus360WsV20 leistungsService;
  private              String        password;
  private              String        systemmodus;
  private              String        username;
  private              String        verarbeitungsmodus;
  private              String        wsURL;

  public LgkkClient() {}

  public LgkkClient(String wsURL, String verarbeitungsmodus, String systemmodus, String username, String password) {
	this.wsURL = wsURL;
	this.verarbeitungsmodus = verarbeitungsmodus;
	this.systemmodus = systemmodus;
	this.username = username;
	this.password = password;
  }

  public String getSystemmodus() {
	return systemmodus;
  }

  public SucheLGKDokumenteV1Response sucheLGKKDokumenteV1(SucheLGKDokumenteV1 input) {
	if(leistungsService == null) {
	  leistungsService = initFocus360WsV20();
	}

	input.getArg0().getHeader().setSystemmodus(systemmodus);
	input.getArg0().getHeader().setVerarbeitungsmodus(Verarbeitungsmodus.fromValue(verarbeitungsmodus));

	return leistungsService.sucheLGKDokumenteV1(input);
  }

  private Focus360WsV20 initFocus360WsV20() {
	URL                   wsdlURL               = LgkkClient.class.getResource("/wsdl/Focus360WsV20.wsdl");
	Focus360WsImplService focus360WsImplService = new Focus360WsImplService(wsdlURL, new QName("http://v20.focus360.webservice.lgkk.stp.sozvers.at/", "Focus360WsImplService"));
	Focus360WsV20         service               = focus360WsImplService.getFocus360WsV20Port();

	addEndpoint(service, "Focus360WsV20");
	addWebServiceSecurity(service, username, password);

	return service;
  }

  private void addEndpoint(Object obj, String endpoint) {
	LOGGER.info(wsURL);
	((BindingProvider) obj).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, wsURL + endpoint);
  }

  private <I> void addWebServiceSecurity(I port, String wsUser, String wsPassword) {
	SecuredServiceClient.createForService(port).withCredentials(wsUser, wsPassword).apply();
	Client cl = ClientProxy.getClient(port);
  }

  public SucheLGKFaelleV2Response sucheLGKKFaelleV2(SucheLGKFaelleV2 input) {
	if(leistungsService == null) {
	  leistungsService = initFocus360WsV20();
	}

	input.getArg0().getHeader().setSystemmodus(systemmodus);
	input.getArg0().getHeader().setVerarbeitungsmodus(Verarbeitungsmodus.fromValue(verarbeitungsmodus));

	return leistungsService.sucheLGKFaelleV2(input);
  }
}
