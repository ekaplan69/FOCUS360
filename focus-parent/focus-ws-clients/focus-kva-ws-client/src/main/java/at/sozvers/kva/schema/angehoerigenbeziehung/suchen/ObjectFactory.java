package at.sozvers.kva.schema.angehoerigenbeziehung.suchen;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;

/**
 * This object contains factory methods for each Java content interface and Java element interface generated in the at.sozvers.kva.schema.angehoerigenbeziehung.suchen package.
 * <p>An ObjectFactory allows you to programatically
 * construct new instances of the Java representation for XML content. The Java representation of XML content can consist of schema derived interfaces and classes representing the binding of schema
 * type definitions, element declarations and model groups.  Factory methods for each of these are provided in this class.
 */
@XmlRegistry
public class ObjectFactory {

  private final static QName _SucheAngehoerigeResponse_QNAME = new QName("http://kva.sozvers.at/schema/angehoerigenbeziehung/suchen", "sucheAngehoerigeResponse");
  private final static QName _SucheAngehoerige_QNAME         = new QName("http://kva.sozvers.at/schema/angehoerigenbeziehung/suchen", "sucheAngehoerige");
  private final static QName _SucheVersicherteResponse_QNAME = new QName("http://kva.sozvers.at/schema/angehoerigenbeziehung/suchen", "sucheVersicherteResponse");
  private final static QName _SucheVersicherte_QNAME         = new QName("http://kva.sozvers.at/schema/angehoerigenbeziehung/suchen", "sucheVersicherte");

  /**
   * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: at.sozvers.kva.schema.angehoerigenbeziehung.suchen
   */
  public ObjectFactory() {
  }

  /**
   * Create an instance of {@link AngehoerigenBeziehungDTO }
   */
  public AngehoerigenBeziehungDTO createAngehoerigenBeziehungDTO() {
	return new AngehoerigenBeziehungDTO();
  }

  /**
   * Create an instance of {@link AngehoerigenBeziehungErmittelnRequest }
   */
  public AngehoerigenBeziehungErmittelnRequest createAngehoerigenBeziehungErmittelnRequest() {
	return new AngehoerigenBeziehungErmittelnRequest();
  }

  /**
   * Create an instance of {@link AngehoerigenBeziehungErmittelnRequestWrapper }
   */
  public AngehoerigenBeziehungErmittelnRequestWrapper createAngehoerigenBeziehungErmittelnRequestWrapper() {
	return new AngehoerigenBeziehungErmittelnRequestWrapper();
  }

  /**
   * Create an instance of {@link AngehoerigenBeziehungErmittelnResponse }
   */
  public AngehoerigenBeziehungErmittelnResponse createAngehoerigenBeziehungErmittelnResponse() {
	return new AngehoerigenBeziehungErmittelnResponse();
  }

  /**
   * Create an instance of {@link AngehoerigenBeziehungErmittelnResponseWrapper }
   */
  public AngehoerigenBeziehungErmittelnResponseWrapper createAngehoerigenBeziehungErmittelnResponseWrapper() {
	return new AngehoerigenBeziehungErmittelnResponseWrapper();
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link AngehoerigenBeziehungErmittelnRequestWrapper }{@code >}
   *
   * @param value
   * 		Java instance representing xml element's value.
   *
   * @return the new instance of {@link JAXBElement }{@code <}{@link AngehoerigenBeziehungErmittelnRequestWrapper }{@code >}
   */
  @XmlElementDecl(namespace="http://kva.sozvers.at/schema/angehoerigenbeziehung/suchen", name="sucheAngehoerige")
  public JAXBElement<AngehoerigenBeziehungErmittelnRequestWrapper> createSucheAngehoerige(AngehoerigenBeziehungErmittelnRequestWrapper value) {
	return new JAXBElement<AngehoerigenBeziehungErmittelnRequestWrapper>(_SucheAngehoerige_QNAME, AngehoerigenBeziehungErmittelnRequestWrapper.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link AngehoerigenBeziehungErmittelnResponseWrapper }{@code >}
   *
   * @param value
   * 		Java instance representing xml element's value.
   *
   * @return the new instance of {@link JAXBElement }{@code <}{@link AngehoerigenBeziehungErmittelnResponseWrapper }{@code >}
   */
  @XmlElementDecl(namespace="http://kva.sozvers.at/schema/angehoerigenbeziehung/suchen", name="sucheAngehoerigeResponse")
  public JAXBElement<AngehoerigenBeziehungErmittelnResponseWrapper> createSucheAngehoerigeResponse(AngehoerigenBeziehungErmittelnResponseWrapper value) {
	return new JAXBElement<AngehoerigenBeziehungErmittelnResponseWrapper>(_SucheAngehoerigeResponse_QNAME, AngehoerigenBeziehungErmittelnResponseWrapper.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link AngehoerigenBeziehungErmittelnRequestWrapper }{@code >}
   *
   * @param value
   * 		Java instance representing xml element's value.
   *
   * @return the new instance of {@link JAXBElement }{@code <}{@link AngehoerigenBeziehungErmittelnRequestWrapper }{@code >}
   */
  @XmlElementDecl(namespace="http://kva.sozvers.at/schema/angehoerigenbeziehung/suchen", name="sucheVersicherte")
  public JAXBElement<AngehoerigenBeziehungErmittelnRequestWrapper> createSucheVersicherte(AngehoerigenBeziehungErmittelnRequestWrapper value) {
	return new JAXBElement<AngehoerigenBeziehungErmittelnRequestWrapper>(_SucheVersicherte_QNAME, AngehoerigenBeziehungErmittelnRequestWrapper.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link AngehoerigenBeziehungErmittelnResponseWrapper }{@code >}
   *
   * @param value
   * 		Java instance representing xml element's value.
   *
   * @return the new instance of {@link JAXBElement }{@code <}{@link AngehoerigenBeziehungErmittelnResponseWrapper }{@code >}
   */
  @XmlElementDecl(namespace="http://kva.sozvers.at/schema/angehoerigenbeziehung/suchen", name="sucheVersicherteResponse")
  public JAXBElement<AngehoerigenBeziehungErmittelnResponseWrapper> createSucheVersicherteResponse(AngehoerigenBeziehungErmittelnResponseWrapper value) {
	return new JAXBElement<AngehoerigenBeziehungErmittelnResponseWrapper>(_SucheVersicherteResponse_QNAME, AngehoerigenBeziehungErmittelnResponseWrapper.class, null, value);
  }
}
