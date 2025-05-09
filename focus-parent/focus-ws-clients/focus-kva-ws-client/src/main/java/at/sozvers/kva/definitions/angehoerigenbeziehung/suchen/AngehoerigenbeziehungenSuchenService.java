package at.sozvers.kva.definitions.angehoerigenbeziehung.suchen;

import javax.xml.namespace.QName;
import java.net.MalformedURLException;
import java.net.URL;
import jakarta.xml.ws.*;

/**
 * This class was generated by the JAX-WS RI. JAX-WS RI 2.3.2 Generated source version: 2.2
 */
@WebServiceClient(name="AngehoerigenbeziehungenSuchenService", targetNamespace="http://kva.sozvers.at/definitions/angehoerigenbeziehung/suchen",
				  wsdlLocation="file:/C:/ta30/Projects/FRONTEND/focus-ws-clients/focus-kva-ws-client/src/main/resources/wsdl/AngehoerigenBeziehungSuchen.wsdl")
public class AngehoerigenbeziehungenSuchenService extends Service {

  private final static WebServiceException ANGEHOERIGENBEZIEHUNGENSUCHENSERVICE_EXCEPTION;
  private final static QName               ANGEHOERIGENBEZIEHUNGENSUCHENSERVICE_QNAME = new QName("http://kva.sozvers.at/definitions/angehoerigenbeziehung/suchen",
																								  "AngehoerigenbeziehungenSuchenService");
  private final static URL                 ANGEHOERIGENBEZIEHUNGENSUCHENSERVICE_WSDL_LOCATION;

  static {
	URL                 url = null;
	WebServiceException e   = null;
	try {
	  url = new URL("file:/C:/ta30/Projects/FRONTEND/focus-ws-clients/focus-kva-ws-client/src/main/resources/wsdl/AngehoerigenBeziehungSuchen.wsdl");
	} catch(MalformedURLException ex) {
	  e = new WebServiceException(ex);
	}
	ANGEHOERIGENBEZIEHUNGENSUCHENSERVICE_WSDL_LOCATION = url;
	ANGEHOERIGENBEZIEHUNGENSUCHENSERVICE_EXCEPTION = e;
  }

  public AngehoerigenbeziehungenSuchenService() {
	super(__getWsdlLocation(), ANGEHOERIGENBEZIEHUNGENSUCHENSERVICE_QNAME);
  }

  private static URL __getWsdlLocation() {
	if(ANGEHOERIGENBEZIEHUNGENSUCHENSERVICE_EXCEPTION != null) {
	  throw ANGEHOERIGENBEZIEHUNGENSUCHENSERVICE_EXCEPTION;
	}
	return ANGEHOERIGENBEZIEHUNGENSUCHENSERVICE_WSDL_LOCATION;
  }

  public AngehoerigenbeziehungenSuchenService(WebServiceFeature... features) {
	super(__getWsdlLocation(), ANGEHOERIGENBEZIEHUNGENSUCHENSERVICE_QNAME, features);
  }

  public AngehoerigenbeziehungenSuchenService(URL wsdlLocation) {
	super(wsdlLocation, ANGEHOERIGENBEZIEHUNGENSUCHENSERVICE_QNAME);
  }

  public AngehoerigenbeziehungenSuchenService(URL wsdlLocation, WebServiceFeature... features) {
	super(wsdlLocation, ANGEHOERIGENBEZIEHUNGENSUCHENSERVICE_QNAME, features);
  }

  public AngehoerigenbeziehungenSuchenService(URL wsdlLocation, QName serviceName) {
	super(wsdlLocation, serviceName);
  }

  public AngehoerigenbeziehungenSuchenService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
	super(wsdlLocation, serviceName, features);
  }

  /**
   * @return returns AngehoerigenbeziehungenSuchen
   */
  @WebEndpoint(name="AngehoerigenBeziehungSuchenPort")
  public AngehoerigenbeziehungenSuchen getAngehoerigenBeziehungSuchenPort() {
	return super.getPort(new QName("http://kva.sozvers.at/definitions/angehoerigenbeziehung/suchen", "AngehoerigenBeziehungSuchenPort"), AngehoerigenbeziehungenSuchen.class);
  }

  /**
   * @param features
   * 		A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
   *
   * @return returns AngehoerigenbeziehungenSuchen
   */
  @WebEndpoint(name="AngehoerigenBeziehungSuchenPort")
  public AngehoerigenbeziehungenSuchen getAngehoerigenBeziehungSuchenPort(WebServiceFeature... features) {
	return super.getPort(new QName("http://kva.sozvers.at/definitions/angehoerigenbeziehung/suchen", "AngehoerigenBeziehungSuchenPort"), AngehoerigenbeziehungenSuchen.class, features);
  }
}
