package at.sozvers.kva.schema.gebuehrenbefreiung.suchen;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;

/**
 * This object contains factory methods for each Java content interface and Java element interface generated in the at.sozvers.kva.schema.gebuehrenbefreiung.suchen package.
 * <p>An ObjectFactory allows you to programatically
 * construct new instances of the Java representation for XML content. The Java representation of XML content can consist of schema derived interfaces and classes representing the binding of schema
 * type definitions, element declarations and model groups.  Factory methods for each of these are provided in this class.
 */
@XmlRegistry
public class ObjectFactory {

  private final static QName _SuchenResponse_QNAME = new QName("http://kva.sozvers.at/schema/gebuehrenbefreiung/suchen", "suchenResponse");
  private final static QName _Suchen_QNAME         = new QName("http://kva.sozvers.at/schema/gebuehrenbefreiung/suchen", "suchen");

  /**
   * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: at.sozvers.kva.schema.gebuehrenbefreiung.suchen
   */
  public ObjectFactory() {
  }

  /**
   * Create an instance of {@link GebuehrenbefreiunRequest }
   */
  public GebuehrenbefreiunRequest createGebuehrenbefreiunRequest() {
	return new GebuehrenbefreiunRequest();
  }

  /**
   * Create an instance of {@link GebuehrenbefreiunRequestWrapper }
   */
  public GebuehrenbefreiunRequestWrapper createGebuehrenbefreiunRequestWrapper() {
	return new GebuehrenbefreiunRequestWrapper();
  }

  /**
   * Create an instance of {@link GebuehrenbefreiunResponse }
   */
  public GebuehrenbefreiunResponse createGebuehrenbefreiunResponse() {
	return new GebuehrenbefreiunResponse();
  }

  /**
   * Create an instance of {@link GebuehrenbefreiungDTO }
   */
  public GebuehrenbefreiungDTO createGebuehrenbefreiungDTO() {
	return new GebuehrenbefreiungDTO();
  }

  /**
   * Create an instance of {@link GebuehrenbefreiunnResponseWrapper }
   */
  public GebuehrenbefreiunnResponseWrapper createGebuehrenbefreiunnResponseWrapper() {
	return new GebuehrenbefreiunnResponseWrapper();
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link GebuehrenbefreiunRequestWrapper }{@code >}
   *
   * @param value
   * 		Java instance representing xml element's value.
   *
   * @return the new instance of {@link JAXBElement }{@code <}{@link GebuehrenbefreiunRequestWrapper }{@code >}
   */
  @XmlElementDecl(namespace="http://kva.sozvers.at/schema/gebuehrenbefreiung/suchen", name="suchen")
  public JAXBElement<GebuehrenbefreiunRequestWrapper> createSuchen(GebuehrenbefreiunRequestWrapper value) {
	return new JAXBElement<GebuehrenbefreiunRequestWrapper>(_Suchen_QNAME, GebuehrenbefreiunRequestWrapper.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link GebuehrenbefreiunnResponseWrapper }{@code >}
   *
   * @param value
   * 		Java instance representing xml element's value.
   *
   * @return the new instance of {@link JAXBElement }{@code <}{@link GebuehrenbefreiunnResponseWrapper }{@code >}
   */
  @XmlElementDecl(namespace="http://kva.sozvers.at/schema/gebuehrenbefreiung/suchen", name="suchenResponse")
  public JAXBElement<GebuehrenbefreiunnResponseWrapper> createSuchenResponse(GebuehrenbefreiunnResponseWrapper value) {
	return new JAXBElement<GebuehrenbefreiunnResponseWrapper>(_SuchenResponse_QNAME, GebuehrenbefreiunnResponseWrapper.class, null, value);
  }
}
