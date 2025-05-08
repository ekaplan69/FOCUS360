package at.itsv.services.lgkk;

import javax.xml.namespace.QName;
import at.sozvers.stp.lgkk.webservice.focus360.v20.*;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;

/**
 * This object contains factory methods for each Java content interface and Java element interface generated in the at.itsv.services.lgkk package.
 * <p>An ObjectFactory allows you to programatically
 * construct new instances of the Java representation for XML content. The Java representation of XML content can consist of schema derived interfaces and classes representing the binding of schema
 * type definitions, element declarations and model groups.  Factory methods for each of these are provided in this class.
 */
@XmlRegistry
public class ObjectFactory {

  private final static QName _Bearbeiter_QNAME            = new QName("http://types.services.itsv.at/", "bearbeiter");
  private final static QName _Meldungen_QNAME             = new QName("http://types.services.itsv.at/", "meldungen");
  private final static QName _StandardRequestHeader_QNAME = new QName("http://types.services.itsv.at/", "standardRequestHeader");
  private final static QName _Verarbeitungsmodus_QNAME    = new QName("http://types.services.itsv.at/", "verarbeitungsmodus");

  /**
   * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: at.itsv.services.lgkk
   */
  public ObjectFactory() {
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link Bearbeiter }{@code >}}
   */
  @XmlElementDecl(namespace="http://types.services.itsv.at/", name="bearbeiter")
  public JAXBElement<Bearbeiter> createBearbeiter(Bearbeiter value) {
	return new JAXBElement<Bearbeiter>(_Bearbeiter_QNAME, Bearbeiter.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link Meldungen }{@code >}}
   */
  @XmlElementDecl(namespace="http://types.services.itsv.at/", name="meldungen")
  public JAXBElement<Meldungen> createMeldungen(Meldungen value) {
	return new JAXBElement<Meldungen>(_Meldungen_QNAME, Meldungen.class, null, value);
  }

  /**
   * Create an instance of {@link StandardRequestHeader }
   */
  public StandardRequestHeader createStandardRequestHeader() {
	return new StandardRequestHeader();
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link StandardRequestHeader }{@code >}}
   */
  @XmlElementDecl(namespace="http://types.services.itsv.at/", name="standardRequestHeader")
  public JAXBElement<StandardRequestHeader> createStandardRequestHeader(StandardRequestHeader value) {
	return new JAXBElement<StandardRequestHeader>(_StandardRequestHeader_QNAME, StandardRequestHeader.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link Verarbeitungsmodus }{@code >}}
   */
  @XmlElementDecl(namespace="http://types.services.itsv.at/", name="verarbeitungsmodus")
  public JAXBElement<Verarbeitungsmodus> createVerarbeitungsmodus(Verarbeitungsmodus value) {
	return new JAXBElement<Verarbeitungsmodus>(_Verarbeitungsmodus_QNAME, Verarbeitungsmodus.class, null, value);
  }
}
