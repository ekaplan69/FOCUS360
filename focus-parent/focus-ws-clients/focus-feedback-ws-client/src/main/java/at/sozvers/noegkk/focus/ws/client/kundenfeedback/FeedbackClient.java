package at.sozvers.noegkk.focus.ws.client.kundenfeedback;

import javax.xml.namespace.QName;
import java.net.URL;
import at.itsv.security.servicesecurity.client.SecuredServiceClient;
import at.sozvers.noegkk.sckont.kundenfeedback.focus.*;
import jakarta.enterprise.context.Dependent;
import jakarta.xml.ws.BindingProvider;
import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Dependent
public class FeedbackClient {

  private static final Logger                  LOG          = LoggerFactory.getLogger(FeedbackClient.class);
  private static final QName                   SERVICE_NAME = new QName("http://focus.kundenfeedback.sckont.noegkk.sozvers.at/", "SCKONTFeedbackService_1_0Service");
  private              String                  password;
  private              SCKONTFeedbackService10 sckontFeedbackService;
  private              String                  systemmodus;
  private              String                  username;
  private              String                  wsUrl;

  public FeedbackClient() {

  }

  public FeedbackClient(String wsUrl, String systemmodus, String username, String password) {
	this.wsUrl = wsUrl;
	this.systemmodus = systemmodus;
	this.username = username;
	this.password = password;
  }

  public String getSystemmodus() {
	return systemmodus;
  }

  public KfFeedbackAendernResponse kfFeedbackAendern(KfFeedbackAendernRequest request) {
	if(sckontFeedbackService == null) {
	  sckontFeedbackService = init();
	}

	return sckontFeedbackService.kfFeedbackAendern(request);
  }

  private SCKONTFeedbackService10 init() {

	URL                            wsdlURL         = FeedbackClient.class.getResource("/wsdl/SCKONTFeedbackService_1_0.wsdl");
	SCKONTFeedbackService10Service service         = new SCKONTFeedbackService10Service(wsdlURL, SERVICE_NAME);
	SCKONTFeedbackService10        feedbackService = service.getSCKONTFeedbackService10Port();

	addEndpoint(feedbackService, "/SCKONTFeedbackService_1_0");
	addWebServiceSecurity(feedbackService, username, password);

	return feedbackService;
  }

  private void addEndpoint(Object obj, String endpoint) {
	LOG.info(wsUrl);
	((BindingProvider) obj).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, wsUrl + endpoint);
  }

  private <I> void addWebServiceSecurity(I port, String wsUser, String wsPassword) {
	SecuredServiceClient.createForService(port).withCredentials(wsUser, wsPassword).apply();
	Client cl = ClientProxy.getClient(port);
  }

  public KfFeedbackErstellenResponse kfFeedbackErstellen(KfFeedbackErstellenRequest request) {
	if(sckontFeedbackService == null) {
	  sckontFeedbackService = init();
	}

	return sckontFeedbackService.kfFeedbackErstellen(request);
  }

  public KfFeedbackKurzListeErmittelnResponse kfFeedbackKurzListeErmitteln(KfFeedbackKurzListeErmittelnRequest request) {
	if(sckontFeedbackService == null) {
	  sckontFeedbackService = init();
	}

	return sckontFeedbackService.kfFeedbackKurzListeErmitteln(request);
  }

  public KfFeedbackLangErmittelnResponse kfFeedbackLangErmitteln(KfFeedbackLangErmittelnRequest request) {
	if(sckontFeedbackService == null) {
	  sckontFeedbackService = init();
	}

	return sckontFeedbackService.kfFeedbackLangErmitteln(request);
  }

  public KfFeedbackgreundeErmittelnResponse kfFeedbackgreundeErmitteln(KfFeedbackgruendeErmittelnRequest request) {
	if(sckontFeedbackService == null) {
	  sckontFeedbackService = init();
	}

	return sckontFeedbackService.kfFeedbackgruendeErmitteln(request);
  }

  public KfThemaFbgMapsErmittelnResponse kfThemaFbgMapsErmitteln(KfThemaFbgMapsErmittelnRequest request) {
	if(sckontFeedbackService == null) {
	  sckontFeedbackService = init();
	}

	return sckontFeedbackService.kfThemaFbgMapsErmitteln(request);
  }

  public KfThemenErmittelnResponse kfThemenErmitteln(KfThemenErmittelnRequest request) {
	if(sckontFeedbackService == null) {
	  sckontFeedbackService = init();
	}

	return sckontFeedbackService.kfThemenErmitteln(request);
  }

  public KfUnterkategorieFbgMapsErmittelnResponse kfUnterkategorieFbgMapsErmitteln(KfUnterkategorieFbgMapsErmittelnRequest request) {
	if(sckontFeedbackService == null) {
	  sckontFeedbackService = init();
	}

	return sckontFeedbackService.kfUnterkategorieFbgMapsErmitteln(request);
  }

  public KfUnterkategorienErmittelnResponse kfUnterkategorienErmitteln(KfUnterkategorienErmittelnRequest request) {
	if(sckontFeedbackService == null) {
	  sckontFeedbackService = init();
	}

	return sckontFeedbackService.kfUnterkategorienErmitteln(request);
  }
}
