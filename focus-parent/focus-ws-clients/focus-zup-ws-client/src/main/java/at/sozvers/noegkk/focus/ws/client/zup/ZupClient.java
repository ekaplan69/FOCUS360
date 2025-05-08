package at.sozvers.noegkk.focus.ws.client.zup;

import java.util.List;
import at.itsv.sap.pi.egov.zup.v7.ZUPProtokolleOUTBOUNDSYNC;
import at.itsv.sap.pi.egov.zup.v7.ZUPProtokolleOUTBOUNDSYNCService;
import com.oracle.xmlns.zupws.Protokolle;
import com.oracle.xmlns.zupws.ZupwsProcessResponse;
import jakarta.xml.ws.BindingProvider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ZupClient {

  private static final Logger logger = LoggerFactory.getLogger(ZupClient.class);

  private String                    clientUserName;
  private String                    dateiversion;
  private String                    password;
  private String                    username;
  private ZUPProtokolleOUTBOUNDSYNC zupService;
  private String                    zupWsEndpoint;

  public ZupClient() {
	//Standard Constructor
  }

  public ZupClient(String clientUserName, String zupWsEndpoint, String dateiversion, String username, String password) {
	this.clientUserName = clientUserName;
	this.zupWsEndpoint = zupWsEndpoint;
	this.dateiversion = dateiversion;
	this.username = username;
	this.password = password;
  }

  public ZupwsProcessResponse process(List<Protokolle.Prot> protkolle) {
	zupService = zupService == null ? initZupwsService() : zupService;
	addClientUsername(protkolle);

	return zupService.zupProtokolleOUTBOUNDSYNC(getPayload(protkolle));
  }

  private ZUPProtokolleOUTBOUNDSYNC initZupwsService() {
	ZUPProtokolleOUTBOUNDSYNCService service   = new ZUPProtokolleOUTBOUNDSYNCService();
	ZUPProtokolleOUTBOUNDSYNC        zupwsPort = service.getDEV();

	((BindingProvider) zupwsPort).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, createFinalEndpoint(zupWsEndpoint));
	((BindingProvider) zupwsPort).getRequestContext().put(BindingProvider.USERNAME_PROPERTY, username);
	((BindingProvider) zupwsPort).getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, password);

	return zupwsPort;
  }

  //optional attribute clientName no longer in http-header
  private void addClientUsername(List<Protokolle.Prot> protkolle) {
	if(clientUserName != null && !clientUserName.isEmpty()) {
	  protkolle.forEach(prot -> prot.setClientName(clientUserName));
	}
  }

  private Protokolle getPayload(List<Protokolle.Prot> protkolle) {
	Protokolle payload = new Protokolle();
	payload.setDateiversion(dateiversion);
	payload.getProt().addAll(protkolle);
	return payload;
  }

  private String createFinalEndpoint(String endpoint) {
	endpoint = endpoint + "/XISOAPAdapter/MessageServlet?senderParty=&senderService=BC_SVAPPS&receiverParty=&receiverService=&interface=ZUP_Protokolle_OUTBOUND_SYNC&interfaceNamespace=urn:itsv.at:sap:pi:egov:zup:v7";
	logger.info(endpoint);
	return endpoint;
  }

  //necessary for negative tests
  public void setClientUserName(String clientUserName) {
	this.clientUserName = clientUserName;
  }
}
