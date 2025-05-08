package at.sozvers.noegkk.focus.ws.client.zvd;

import java.net.URL;
import at.itsv.security.servicesecurity.client.SecuredServiceClient;
import at.sozvers.zvd.ws.versicherungsverhaeltnisselesenservice.v3.VersicherungsverhaeltnisseLesen;
import at.sozvers.zvd.ws.versicherungsverhaeltnisselesenservice.v3.VersicherungsverhaeltnisseLesenService;
import at.sozvers.zvd.ws.versicherungsverhaeltnisselesenservice.v3.types.VersicherungsverhaeltnisseLesenRequest;
import at.sozvers.zvd.ws.versicherungsverhaeltnisselesenservice.v3.types.VersicherungsverhaeltnisseLesenResponse;
import jakarta.enterprise.context.Dependent;
import jakarta.xml.ws.BindingProvider;
import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Dependent
public class ZvdClient {

  private static final Logger                                 LOG = LoggerFactory.getLogger(ZvdClient.class);
  private              String                                 berechtigungssystemid;
  private              String                                 password;
  private              String                                 primaersytemid;
  private              String                                 quellsystemid;
  private              String                                 systemmodus;
  private              String                                 username;
  private              String                                 verarbeitungsmodus;
  private              VersicherungsverhaeltnisseLesenService versicherungsverhaeltnisseLesenService;
  private              String                                 wsUrl;

  public ZvdClient() {

  }

  public ZvdClient(String wsUrl, String verarbeitungsmodus, String systemmodus, String username, String password, String quellsystemid, String berechtigungssystemid, String primaersytemid) {
	this.wsUrl = wsUrl;
	this.verarbeitungsmodus = verarbeitungsmodus;
	this.systemmodus = systemmodus;
	this.username = username;
	this.password = password;
	this.quellsystemid = quellsystemid;
	this.berechtigungssystemid = berechtigungssystemid;
	this.primaersytemid = primaersytemid;
  }

  public String getBerechtigungssystemid() {
	return berechtigungssystemid;
  }

  public String getPrimaersytemid() {
	return primaersytemid;
  }

  public String getQuellsystemid() {
	return quellsystemid;
  }

  public String getSystemmodus() {
	return systemmodus;
  }

  public String getVerarbeitungsmodus() {
	return verarbeitungsmodus;
  }

  public VersicherungsverhaeltnisseLesenResponse versicherungsVerhaeltnisseLesen_3_0(VersicherungsverhaeltnisseLesenRequest input) {
	if(versicherungsverhaeltnisseLesenService == null) {
	  versicherungsverhaeltnisseLesenService = initVersicherungsverhaeltnisseLesen_3_0();
	}

	return versicherungsverhaeltnisseLesenService.versicherungsverhaeltnisseLesen(input);
  }

  private VersicherungsverhaeltnisseLesenService initVersicherungsverhaeltnisseLesen_3_0() {

	URL                                    wsdlURL                   = ZvdClient.class.getResource("/wsdl/VersicherungsverhaeltnisseLesen_3_0/VersicherungsverhaeltnisseLesen_3_0.wsdl");
	VersicherungsverhaeltnisseLesen        service                   = new VersicherungsverhaeltnisseLesen(wsdlURL);
	VersicherungsverhaeltnisseLesenService verhaeltnisseLesenService = service.getVersicherungsverhaeltnisseLesenPort();

	addEndpoint(verhaeltnisseLesenService, "3_0/VersicherungsverhaeltnisseLesen");
	addWebServiceSecurity(verhaeltnisseLesenService, username, password);

	return verhaeltnisseLesenService;
  }

  private void addEndpoint(Object obj, String endpoint) {
	LOG.info(wsUrl);
	((BindingProvider) obj).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, wsUrl + endpoint);
  }

  private <I> void addWebServiceSecurity(I port, String wsUser, String wsPassword) {
	SecuredServiceClient.createForService(port).withCredentials(wsUser, wsPassword).apply();
	Client cl = ClientProxy.getClient(port);
  }
}
