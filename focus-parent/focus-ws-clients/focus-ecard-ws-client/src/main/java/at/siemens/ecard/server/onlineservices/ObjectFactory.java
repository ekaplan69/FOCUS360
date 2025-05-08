package at.siemens.ecard.server.onlineservices;

import javax.xml.namespace.QName;
import at.siemens.ecard.server.onlineservices.valueobject.*;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;

/**
 * This object contains factory methods for each Java content interface and Java element interface generated in the at.siemens.ecard.server.onlineservices package.
 * <p>An ObjectFactory allows you to programatically
 * construct new instances of the Java representation for XML content. The Java representation of XML content can consist of schema derived interfaces and classes representing the binding of schema
 * type definitions, element declarations and model groups.  Factory methods for each of these are provided in this class.
 */
@XmlRegistry
public class ObjectFactory {

  private static final String SIEMENSURI                                      = "http://onlineservices.server.ecard.siemens.at";
  private static final QName  _ECardAuskunftV2Response_QNAME                  = new QName(SIEMENSURI, "ECardAuskunftV2Response");
  private static final QName  _ECardAuskunftV2_QNAME                          = new QName(SIEMENSURI, "ECardAuskunftV2");
  private static final QName  _SVPersonKonsultationenAuskunftV4Response_QNAME = new QName(SIEMENSURI, "SVPersonKonsultationenAuskunftV4Response");
  private static final QName  _SVPersonKonsultationenAuskunftV4_QNAME         = new QName(SIEMENSURI, "SVPersonKonsultationenAuskunftV4");

  /**
   * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: at.siemens.ecard.server.onlineservices
   */
  public ObjectFactory() {
	//Default Constructor
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ECardAuskunftV2Req }{@code >}}
   */
  @XmlElementDecl(namespace=SIEMENSURI, name="ECardAuskunftV2")
  public JAXBElement<ECardAuskunftV2Req> createECardAuskunftV2(ECardAuskunftV2Req value) {
	return new JAXBElement<>(_ECardAuskunftV2_QNAME, ECardAuskunftV2Req.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ECardAuskunftV2Resp }{@code >}}
   */
  @XmlElementDecl(namespace=SIEMENSURI, name="ECardAuskunftV2Response")
  public JAXBElement<ECardAuskunftV2Resp> createECardAuskunftV2Response(ECardAuskunftV2Resp value) {
	return new JAXBElement<>(_ECardAuskunftV2Response_QNAME, ECardAuskunftV2Resp.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link SVPersonKonsultationenAuskunftV4Req }{@code >}}
   */
  @XmlElementDecl(namespace=SIEMENSURI, name="SVPersonKonsultationenAuskunftV4")
  public JAXBElement<SVPersonKonsultationenAuskunftV4Req> createSVPersonKonsultationenAuskunftV4(SVPersonKonsultationenAuskunftV4Req value) {
	return new JAXBElement<>(_SVPersonKonsultationenAuskunftV4_QNAME, SVPersonKonsultationenAuskunftV4Req.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link SVPersonKonsultationenAuskunftV4Resp }{@code >}}
   */
  @XmlElementDecl(namespace=SIEMENSURI, name="SVPersonKonsultationenAuskunftV4Response")
  public JAXBElement<SVPersonKonsultationenAuskunftV4Resp> createSVPersonKonsultationenAuskunftV4Response(SVPersonKonsultationenAuskunftV4Resp value) {
	return new JAXBElement<>(_SVPersonKonsultationenAuskunftV4Response_QNAME, SVPersonKonsultationenAuskunftV4Resp.class, null, value);
  }
}
