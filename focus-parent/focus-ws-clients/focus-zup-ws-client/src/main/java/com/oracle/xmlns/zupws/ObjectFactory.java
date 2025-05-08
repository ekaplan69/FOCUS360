package com.oracle.xmlns.zupws;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;

/**
 * This object contains factory methods for each Java content interface and Java element interface generated in the com.oracle.xmlns.zupws package.
 * <p>An ObjectFactory allows you to programatically
 * construct new instances of the Java representation for XML content. The Java representation of XML content can consist of schema derived interfaces and classes representing the binding of schema
 * type definitions, element declarations and model groups.  Factory methods for each of these are provided in this class.
 */
@XmlRegistry
public class ObjectFactory {

  private final static QName _ZupwsProcessResponseMessageID_QNAME  = new QName("http://xmlns.oracle.com/Zupws", "MessageID");
  private final static QName _ZupwsProcessResponseTrackingID_QNAME = new QName("http://xmlns.oracle.com/Zupws", "TrackingID");

  /**
   * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.oracle.xmlns.zupws
   */
  public ObjectFactory() {
  }

  /**
   * Create an instance of {@link Protokolle }
   */
  public Protokolle createProtokolle() {
	return new Protokolle();
  }

  /**
   * Create an instance of {@link Protokolle.Prot }
   */
  public Protokolle.Prot createProtokolleProt() {
	return new Protokolle.Prot();
  }

  /**
   * Create an instance of {@link ZupwsProcessResponse }
   */
  public ZupwsProcessResponse createZupwsProcessResponse() {
	return new ZupwsProcessResponse();
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
   *
   * @param value
   * 		Java instance representing xml element's value.
   *
   * @return the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  @XmlElementDecl(namespace="http://xmlns.oracle.com/Zupws", name="MessageID", scope=ZupwsProcessResponse.class)
  public JAXBElement<String> createZupwsProcessResponseMessageID(String value) {
	return new JAXBElement<String>(_ZupwsProcessResponseMessageID_QNAME, String.class, ZupwsProcessResponse.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
   *
   * @param value
   * 		Java instance representing xml element's value.
   *
   * @return the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
   */
  @XmlElementDecl(namespace="http://xmlns.oracle.com/Zupws", name="TrackingID", scope=ZupwsProcessResponse.class)
  public JAXBElement<Long> createZupwsProcessResponseTrackingID(Long value) {
	return new JAXBElement<Long>(_ZupwsProcessResponseTrackingID_QNAME, Long.class, ZupwsProcessResponse.class, value);
  }
}
