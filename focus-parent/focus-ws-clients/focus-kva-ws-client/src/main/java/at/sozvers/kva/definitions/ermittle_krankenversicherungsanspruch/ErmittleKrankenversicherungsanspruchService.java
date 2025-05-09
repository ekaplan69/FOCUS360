package at.sozvers.kva.definitions.ermittle_krankenversicherungsanspruch;

import javax.xml.namespace.QName;
import java.net.MalformedURLException;
import java.net.URL;
import jakarta.xml.ws.*;

/**
 * This class was generated by the JAX-WS RI. JAX-WS RI 2.3.2 Generated source version: 2.2
 */
@WebServiceClient(name="ErmittleKrankenversicherungsanspruchService", targetNamespace="http://kva.sozvers.at/definitions/ermittle-krankenversicherungsanspruch",
				  wsdlLocation="file:/C:/ta30/Projects/FRONTEND/focus-ws-clients/focus-kva-ws-client/src/main/resources/wsdl/KrankenanspruchErmitteln.wsdl")
public class ErmittleKrankenversicherungsanspruchService extends Service {

  private final static WebServiceException ERMITTLEKRANKENVERSICHERUNGSANSPRUCHSERVICE_EXCEPTION;
  private final static QName               ERMITTLEKRANKENVERSICHERUNGSANSPRUCHSERVICE_QNAME = new QName("http://kva.sozvers.at/definitions/ermittle-krankenversicherungsanspruch",
																										 "ErmittleKrankenversicherungsanspruchService");
  private final static URL                 ERMITTLEKRANKENVERSICHERUNGSANSPRUCHSERVICE_WSDL_LOCATION;

  static {
	URL                 url = null;
	WebServiceException e   = null;
	try {
	  url = new URL("file:/C:/ta30/Projects/FRONTEND/focus-ws-clients/focus-kva-ws-client/src/main/resources/wsdl/KrankenanspruchErmitteln.wsdl");
	} catch(MalformedURLException ex) {
	  e = new WebServiceException(ex);
	}
	ERMITTLEKRANKENVERSICHERUNGSANSPRUCHSERVICE_WSDL_LOCATION = url;
	ERMITTLEKRANKENVERSICHERUNGSANSPRUCHSERVICE_EXCEPTION = e;
  }

  public ErmittleKrankenversicherungsanspruchService() {
	super(__getWsdlLocation(), ERMITTLEKRANKENVERSICHERUNGSANSPRUCHSERVICE_QNAME);
  }

  private static URL __getWsdlLocation() {
	if(ERMITTLEKRANKENVERSICHERUNGSANSPRUCHSERVICE_EXCEPTION != null) {
	  throw ERMITTLEKRANKENVERSICHERUNGSANSPRUCHSERVICE_EXCEPTION;
	}
	return ERMITTLEKRANKENVERSICHERUNGSANSPRUCHSERVICE_WSDL_LOCATION;
  }

  public ErmittleKrankenversicherungsanspruchService(WebServiceFeature... features) {
	super(__getWsdlLocation(), ERMITTLEKRANKENVERSICHERUNGSANSPRUCHSERVICE_QNAME, features);
  }

  public ErmittleKrankenversicherungsanspruchService(URL wsdlLocation) {
	super(wsdlLocation, ERMITTLEKRANKENVERSICHERUNGSANSPRUCHSERVICE_QNAME);
  }

  public ErmittleKrankenversicherungsanspruchService(URL wsdlLocation, WebServiceFeature... features) {
	super(wsdlLocation, ERMITTLEKRANKENVERSICHERUNGSANSPRUCHSERVICE_QNAME, features);
  }

  public ErmittleKrankenversicherungsanspruchService(URL wsdlLocation, QName serviceName) {
	super(wsdlLocation, serviceName);
  }

  public ErmittleKrankenversicherungsanspruchService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
	super(wsdlLocation, serviceName, features);
  }

  /**
   * @return returns ErmittleKrankenversicherungsanspruch
   */
  @WebEndpoint(name="ErmittleKrankenversicherungsanspruchPort")
  public ErmittleKrankenversicherungsanspruch getErmittleKrankenversicherungsanspruchPort() {
	return super.getPort(new QName("http://kva.sozvers.at/definitions/ermittle-krankenversicherungsanspruch", "ErmittleKrankenversicherungsanspruchPort"), ErmittleKrankenversicherungsanspruch.class);
  }

  /**
   * @param features
   * 		A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
   *
   * @return returns ErmittleKrankenversicherungsanspruch
   */
  @WebEndpoint(name="ErmittleKrankenversicherungsanspruchPort")
  public ErmittleKrankenversicherungsanspruch getErmittleKrankenversicherungsanspruchPort(WebServiceFeature... features) {
	return super.getPort(new QName("http://kva.sozvers.at/definitions/ermittle-krankenversicherungsanspruch", "ErmittleKrankenversicherungsanspruchPort"), ErmittleKrankenversicherungsanspruch.class,
						 features);
  }
}
