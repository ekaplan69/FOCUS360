package at.sozvers.zvd.ws.versicherungsverhaeltnisselesenservice.v3;

import javax.xml.namespace.QName;
import at.sozvers.zvd.ws.versicherungsverhaeltnisselesenservice.v3.types.VersicherungsverhaeltnisseLesenRequestWrapper;
import at.sozvers.zvd.ws.versicherungsverhaeltnisselesenservice.v3.types.VersicherungsverhaeltnisseLesenResponseWrapper;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;

/**
 * This object contains factory methods for each Java content interface and Java element interface generated in the at.sozvers.zvd.ws.versicherungsverhaeltnisselesenservice.v3 package.
 * <p>An ObjectFactory allows you to programatically
 * construct new instances of the Java representation for XML content. The Java representation of XML content can consist of schema derived interfaces and classes representing the binding of schema
 * type definitions, element declarations and model groups.  Factory methods for each of these are provided in this class.
 */
@XmlRegistry
public class ObjectFactory {

  private final static QName _VersicherungsverhaeltnisseLesenResponse_QNAME = new QName("http://sozvers.at/zvd/ws/VersicherungsverhaeltnisseLesenService/v3",
																						"VersicherungsverhaeltnisseLesenResponse");
  private final static QName _VersicherungsverhaeltnisseLesen_QNAME         = new QName("http://sozvers.at/zvd/ws/VersicherungsverhaeltnisseLesenService/v3", "VersicherungsverhaeltnisseLesen");

  /**
   * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: at.sozvers.zvd.ws.versicherungsverhaeltnisselesenservice.v3
   */
  public ObjectFactory() {
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link VersicherungsverhaeltnisseLesenRequestWrapper }{@code >}}
   */
  @XmlElementDecl(namespace="http://sozvers.at/zvd/ws/VersicherungsverhaeltnisseLesenService/v3", name="VersicherungsverhaeltnisseLesen")
  public JAXBElement<VersicherungsverhaeltnisseLesenRequestWrapper> createVersicherungsverhaeltnisseLesen(VersicherungsverhaeltnisseLesenRequestWrapper value) {
	return new JAXBElement<VersicherungsverhaeltnisseLesenRequestWrapper>(_VersicherungsverhaeltnisseLesen_QNAME, VersicherungsverhaeltnisseLesenRequestWrapper.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link VersicherungsverhaeltnisseLesenResponseWrapper }{@code >}}
   */
  @XmlElementDecl(namespace="http://sozvers.at/zvd/ws/VersicherungsverhaeltnisseLesenService/v3", name="VersicherungsverhaeltnisseLesenResponse")
  public JAXBElement<VersicherungsverhaeltnisseLesenResponseWrapper> createVersicherungsverhaeltnisseLesenResponse(VersicherungsverhaeltnisseLesenResponseWrapper value) {
	return new JAXBElement<VersicherungsverhaeltnisseLesenResponseWrapper>(_VersicherungsverhaeltnisseLesenResponse_QNAME, VersicherungsverhaeltnisseLesenResponseWrapper.class, null, value);
  }
}
