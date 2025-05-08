package at.sozvers.noegkk.focus.ws.client.ecard;

import javax.xml.namespace.QName;
import java.net.URL;
import at.siemens.ecard.server.onlineservices.OnlineServicesFocus360;
import at.siemens.ecard.server.onlineservices.OnlineServicesFocus360Service;
import at.siemens.ecard.server.onlineservices.valueobject.*;
import jakarta.enterprise.context.Dependent;
import jakarta.xml.ws.BindingProvider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Dependent
public class ECardClient {

  private static final Logger                 LOG = LoggerFactory.getLogger(ECardClient.class);
  private              OnlineServicesFocus360 onlineServices;
  private              String                 wsUrl;

  public ECardClient() {
  }

  public ECardClient(String wsUrl) {
	this.wsUrl = wsUrl;
  }

  public ECardAuskunftV2Resp eCardAuskunft(ECardAuskunftV2Req auskunft) {
	if(onlineServices == null) {
	  onlineServices = initOnlineServices();
	}

	return onlineServices.eCardAuskunftV2(auskunft);
  }

  private OnlineServicesFocus360 initOnlineServices() {
	QName qName   = new QName("http://onlineservices.server.ecard.siemens.at", "OnlineServices_Focus360_Service");
	URL   wsdlURL = ECardClient.class.getResource("/wsdl/OnlineServices/OnlineServices.wsdl");

	OnlineServicesFocus360Service onlineServicesService = new OnlineServicesFocus360Service(wsdlURL, qName);
	return addEndpoint(onlineServicesService.getOnlineServicesFocus360(), "OnlineServices");
  }

  private OnlineServicesFocus360 addEndpoint(OnlineServicesFocus360 obj, String endpoint) {
	LOG.info(wsUrl);
	((BindingProvider) obj).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, wsUrl + endpoint);
	return obj;
  }

  public SVPersonKonsultationenAuskunftV4Resp svPersonKonsultationenAuskunftV4(SVPersonKonsultationenAuskunftV4Req request) {
	if(onlineServices == null) {
	  onlineServices = initOnlineServices();
	}

	return onlineServices.svPersonKonsultationenAuskunftV4(request);
  }
}
