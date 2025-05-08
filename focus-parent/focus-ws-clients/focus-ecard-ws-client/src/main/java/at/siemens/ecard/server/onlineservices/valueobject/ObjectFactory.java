package at.siemens.ecard.server.onlineservices.valueobject;

import jakarta.xml.bind.annotation.XmlRegistry;

/**
 * This object contains factory methods for each Java content interface and Java element interface generated in the at.siemens.ecard.server.onlineservices.valueobject package.
 * <p>An ObjectFactory allows you to programatically
 * construct new instances of the Java representation for XML content. The Java representation of XML content can consist of schema derived interfaces and classes representing the binding of schema
 * type definitions, element declarations and model groups.  Factory methods for each of these are provided in this class.
 */
@XmlRegistry
public class ObjectFactory {

  /**
   * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: at.siemens.ecard.server.onlineservices.valueobject
   */
  public ObjectFactory() {
	//Default Constructor
  }

  /**
   * Create an instance of {@link ECardAuskunftV2Req }
   */
  public ECardAuskunftV2Req createECardAuskunftV2Req() {
	return new ECardAuskunftV2Req();
  }

  /**
   * Create an instance of {@link ECardAuskunftV2Resp }
   */
  public ECardAuskunftV2Resp createECardAuskunftV2Resp() {
	return new ECardAuskunftV2Resp();
  }

  /**
   * Create an instance of {@link ECardV2 }
   */
  public ECardV2 createECardV2() {
	return new ECardV2();
  }

  /**
   * Create an instance of {@link Fehlerbeschreibung }
   */
  public Fehlerbeschreibung createFehlerbeschreibung() {
	return new Fehlerbeschreibung();
  }

  /**
   * Create an instance of {@link SVPersonKonsultationV2 }
   */
  public SVPersonKonsultationV2 createSVPersonKonsultationV2() {
	return new SVPersonKonsultationV2();
  }

  /**
   * Create an instance of {@link SVPersonKonsultationenAuskunftV4Req }
   */
  public SVPersonKonsultationenAuskunftV4Req createSVPersonKonsultationenAuskunftV4Req() {
	return new SVPersonKonsultationenAuskunftV4Req();
  }

  /**
   * Create an instance of {@link SVPersonKonsultationenAuskunftV4Resp }
   */
  public SVPersonKonsultationenAuskunftV4Resp createSVPersonKonsultationenAuskunftV4Resp() {
	return new SVPersonKonsultationenAuskunftV4Resp();
  }

  /**
   * Create an instance of {@link StdRequest }
   */
  public StdRequest createStdRequest() {
	return new StdRequest();
  }

  /**
   * Create an instance of {@link StdResponse }
   */
  public StdResponse createStdResponse() {
	return new StdResponse();
  }

  /**
   * Create an instance of {@link Zustelladresse }
   */
  public Zustelladresse createZustelladresse() {
	return new Zustelladresse();
  }
}
