package at.sozvers.kva.definitions.gebuehrenbefreiung.suchen;

import javax.xml.namespace.QName;
import java.net.MalformedURLException;
import java.net.URL;
import jakarta.xml.ws.*;

/**
 * This class was generated by the JAX-WS RI. JAX-WS RI 2.3.2 Generated source version: 2.2
 */
@WebServiceClient(name="GebuehrenbefreiungSuchenService", targetNamespace="http://kva.sozvers.at/definitions/gebuehrenbefreiung/suchen",
				  wsdlLocation="file:/C:/ta30/Projects/FRONTEND/focus-ws-clients/focus-kva-ws-client/src/main/resources/wsdl/GebuehrenbefreiungSuchen.wsdl")
public class GebuehrenbefreiungSuchenService extends Service {

  private final static WebServiceException GEBUEHRENBEFREIUNGSUCHENSERVICE_EXCEPTION;
  private final static QName               GEBUEHRENBEFREIUNGSUCHENSERVICE_QNAME = new QName("http://kva.sozvers.at/definitions/gebuehrenbefreiung/suchen", "GebuehrenbefreiungSuchenService");
  private final static URL                 GEBUEHRENBEFREIUNGSUCHENSERVICE_WSDL_LOCATION;

  static {
	URL                 url = null;
	WebServiceException e   = null;
	try {
	  url = new URL("file:/C:/ta30/Projects/FRONTEND/focus-ws-clients/focus-kva-ws-client/src/main/resources/wsdl/GebuehrenbefreiungSuchen.wsdl");
	} catch(MalformedURLException ex) {
	  e = new WebServiceException(ex);
	}
	GEBUEHRENBEFREIUNGSUCHENSERVICE_WSDL_LOCATION = url;
	GEBUEHRENBEFREIUNGSUCHENSERVICE_EXCEPTION = e;
  }

  public GebuehrenbefreiungSuchenService() {
	super(__getWsdlLocation(), GEBUEHRENBEFREIUNGSUCHENSERVICE_QNAME);
  }

  private static URL __getWsdlLocation() {
	if(GEBUEHRENBEFREIUNGSUCHENSERVICE_EXCEPTION != null) {
	  throw GEBUEHRENBEFREIUNGSUCHENSERVICE_EXCEPTION;
	}
	return GEBUEHRENBEFREIUNGSUCHENSERVICE_WSDL_LOCATION;
  }

  public GebuehrenbefreiungSuchenService(WebServiceFeature... features) {
	super(__getWsdlLocation(), GEBUEHRENBEFREIUNGSUCHENSERVICE_QNAME, features);
  }

  public GebuehrenbefreiungSuchenService(URL wsdlLocation) {
	super(wsdlLocation, GEBUEHRENBEFREIUNGSUCHENSERVICE_QNAME);
  }

  public GebuehrenbefreiungSuchenService(URL wsdlLocation, WebServiceFeature... features) {
	super(wsdlLocation, GEBUEHRENBEFREIUNGSUCHENSERVICE_QNAME, features);
  }

  public GebuehrenbefreiungSuchenService(URL wsdlLocation, QName serviceName) {
	super(wsdlLocation, serviceName);
  }

  public GebuehrenbefreiungSuchenService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
	super(wsdlLocation, serviceName, features);
  }

  /**
   * @return returns GebuehrenbefreiungSuchen
   */
  @WebEndpoint(name="GebuehrenbefreiungSuchenPort")
  public GebuehrenbefreiungSuchen getGebuehrenbefreiungSuchenPort() {
	return super.getPort(new QName("http://kva.sozvers.at/definitions/gebuehrenbefreiung/suchen", "GebuehrenbefreiungSuchenPort"), GebuehrenbefreiungSuchen.class);
  }

  /**
   * @param features
   * 		A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
   *
   * @return returns GebuehrenbefreiungSuchen
   */
  @WebEndpoint(name="GebuehrenbefreiungSuchenPort")
  public GebuehrenbefreiungSuchen getGebuehrenbefreiungSuchenPort(WebServiceFeature... features) {
	return super.getPort(new QName("http://kva.sozvers.at/definitions/gebuehrenbefreiung/suchen", "GebuehrenbefreiungSuchenPort"), GebuehrenbefreiungSuchen.class, features);
  }
}
