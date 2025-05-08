package at.sozvers.noegkk.sckont.beschwerde.focus;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;

/**
 * This object contains factory methods for each Java content interface and Java element interface generated in the at.sozvers.noegkk.sckont.beschwerde.focus package.
 * <p>An ObjectFactory allows you to programatically
 * construct new instances of the Java representation for XML content. The Java representation of XML content can consist of schema derived interfaces and classes representing the binding of schema
 * type definitions, element declarations and model groups.  Factory methods for each of these are provided in this class.
 */
@XmlRegistry
public class ObjectFactory {

  private static final String BASICURI                                  = "http://focus.beschwerde.sckont.noegkk.sozvers.at/";
  private static final QName  _BeschwerdeAendernResponse_QNAME          = new QName(BASICURI, "beschwerdeAendernResponse");
  private static final QName  _BeschwerdeAendern_QNAME                  = new QName(BASICURI, "beschwerdeAendern");
  private static final QName  _BeschwerdeErstellenResponse_QNAME        = new QName(BASICURI, "beschwerdeErstellenResponse");
  private static final QName  _BeschwerdeErstellen_QNAME                = new QName(BASICURI, "beschwerdeErstellen");
  private static final QName  _BeschwerdeLesenResponse_QNAME            = new QName(BASICURI, "beschwerdeLesenResponse");
  private static final QName  _BeschwerdeLesen_QNAME                    = new QName(BASICURI, "beschwerdeLesen");
  private static final QName  _BeschwerdeStornierenResponse_QNAME       = new QName(BASICURI, "beschwerdeStornierenResponse");
  private static final QName  _BeschwerdeStornieren_QNAME               = new QName(BASICURI, "beschwerdeStornieren");
  private static final QName  _BeschwerdebereichErmittelnResponse_QNAME = new QName(BASICURI, "beschwerdebereichErmittelnResponse");
  private static final QName  _BeschwerdebereichErmitteln_QNAME         = new QName(BASICURI, "beschwerdebereichErmitteln");
  private static final QName  _BeschwerdegrundErmittelnResponse_QNAME   = new QName(BASICURI, "beschwerdegrundErmittelnResponse");
  private static final QName  _BeschwerdegrundErmitteln_QNAME           = new QName(BASICURI, "beschwerdegrundErmitteln");
  private static final QName  _BeschwerdenErmittelnResponse_QNAME       = new QName(BASICURI, "beschwerdenErmittelnResponse");
  private static final QName  _BeschwerdenErmitteln_QNAME               = new QName(BASICURI, "beschwerdenErmitteln");

  /**
   * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: at.sozvers.noegkk.sckont.beschwerde.focus
   */
  public ObjectFactory() {
	//Default Constructor
  }

  /**
   * Create an instance of {@link Bearbeiter }
   */
  public Bearbeiter createBearbeiter() {
	return new Bearbeiter();
  }

  /**
   * Create an instance of {@link Beschwerde }
   */
  public Beschwerde createBeschwerde() {
	return new Beschwerde();
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link BeschwerdeAendernRequest }{@code >}}
   */
  @XmlElementDecl(namespace=BASICURI, name="beschwerdeAendern")
  public JAXBElement<BeschwerdeAendernRequest> createBeschwerdeAendern(BeschwerdeAendernRequest value) {
	return new JAXBElement<>(_BeschwerdeAendern_QNAME, BeschwerdeAendernRequest.class, null, value);
  }

  /**
   * Create an instance of {@link BeschwerdeAendernRequest }
   */
  public BeschwerdeAendernRequest createBeschwerdeAendernRequest() {
	return new BeschwerdeAendernRequest();
  }

  /**
   * Create an instance of {@link BeschwerdeAendernResponse }
   */
  public BeschwerdeAendernResponse createBeschwerdeAendernResponse() {
	return new BeschwerdeAendernResponse();
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link BeschwerdeAendernResponse }{@code >}}
   */
  @XmlElementDecl(namespace=BASICURI, name="beschwerdeAendernResponse")
  public JAXBElement<BeschwerdeAendernResponse> createBeschwerdeAendernResponse(BeschwerdeAendernResponse value) {
	return new JAXBElement<>(_BeschwerdeAendernResponse_QNAME, BeschwerdeAendernResponse.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link BeschwerdeErstellenRequest }{@code >}}
   */
  @XmlElementDecl(namespace=BASICURI, name="beschwerdeErstellen")
  public JAXBElement<BeschwerdeErstellenRequest> createBeschwerdeErstellen(BeschwerdeErstellenRequest value) {
	return new JAXBElement<>(_BeschwerdeErstellen_QNAME, BeschwerdeErstellenRequest.class, null, value);
  }

  /**
   * Create an instance of {@link BeschwerdeErstellenRequest }
   */
  public BeschwerdeErstellenRequest createBeschwerdeErstellenRequest() {
	return new BeschwerdeErstellenRequest();
  }

  /**
   * Create an instance of {@link BeschwerdeErstellenResponse }
   */
  public BeschwerdeErstellenResponse createBeschwerdeErstellenResponse() {
	return new BeschwerdeErstellenResponse();
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link BeschwerdeErstellenResponse }{@code >}}
   */
  @XmlElementDecl(namespace=BASICURI, name="beschwerdeErstellenResponse")
  public JAXBElement<BeschwerdeErstellenResponse> createBeschwerdeErstellenResponse(BeschwerdeErstellenResponse value) {
	return new JAXBElement<>(_BeschwerdeErstellenResponse_QNAME, BeschwerdeErstellenResponse.class, null, value);
  }

  /**
   * Create an instance of {@link BeschwerdeKurz }
   */
  public BeschwerdeKurz createBeschwerdeKurz() {
	return new BeschwerdeKurz();
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link BeschwerdeLesenRequest }{@code >}}
   */
  @XmlElementDecl(namespace=BASICURI, name="beschwerdeLesen")
  public JAXBElement<BeschwerdeLesenRequest> createBeschwerdeLesen(BeschwerdeLesenRequest value) {
	return new JAXBElement<>(_BeschwerdeLesen_QNAME, BeschwerdeLesenRequest.class, null, value);
  }

  /**
   * Create an instance of {@link BeschwerdeLesenRequest }
   */
  public BeschwerdeLesenRequest createBeschwerdeLesenRequest() {
	return new BeschwerdeLesenRequest();
  }

  /**
   * Create an instance of {@link BeschwerdeLesenResponse }
   */
  public BeschwerdeLesenResponse createBeschwerdeLesenResponse() {
	return new BeschwerdeLesenResponse();
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link BeschwerdeLesenResponse }{@code >}}
   */
  @XmlElementDecl(namespace=BASICURI, name="beschwerdeLesenResponse")
  public JAXBElement<BeschwerdeLesenResponse> createBeschwerdeLesenResponse(BeschwerdeLesenResponse value) {
	return new JAXBElement<>(_BeschwerdeLesenResponse_QNAME, BeschwerdeLesenResponse.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link BeschwerdeStornierenRequest }{@code >}}
   */
  @XmlElementDecl(namespace=BASICURI, name="beschwerdeStornieren")
  public JAXBElement<BeschwerdeStornierenRequest> createBeschwerdeStornieren(BeschwerdeStornierenRequest value) {
	return new JAXBElement<>(_BeschwerdeStornieren_QNAME, BeschwerdeStornierenRequest.class, null, value);
  }

  /**
   * Create an instance of {@link BeschwerdeStornierenRequest }
   */
  public BeschwerdeStornierenRequest createBeschwerdeStornierenRequest() {
	return new BeschwerdeStornierenRequest();
  }

  /**
   * Create an instance of {@link BeschwerdeStornierenResponse }
   */
  public BeschwerdeStornierenResponse createBeschwerdeStornierenResponse() {
	return new BeschwerdeStornierenResponse();
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link BeschwerdeStornierenResponse }{@code >}}
   */
  @XmlElementDecl(namespace=BASICURI, name="beschwerdeStornierenResponse")
  public JAXBElement<BeschwerdeStornierenResponse> createBeschwerdeStornierenResponse(BeschwerdeStornierenResponse value) {
	return new JAXBElement<>(_BeschwerdeStornierenResponse_QNAME, BeschwerdeStornierenResponse.class, null, value);
  }

  /**
   * Create an instance of {@link Beschwerdebereich }
   */
  public Beschwerdebereich createBeschwerdebereich() {
	return new Beschwerdebereich();
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link BeschwerdebereichErmittelnRequest }{@code >}}
   */
  @XmlElementDecl(namespace=BASICURI, name="beschwerdebereichErmitteln")
  public JAXBElement<BeschwerdebereichErmittelnRequest> createBeschwerdebereichErmitteln(BeschwerdebereichErmittelnRequest value) {
	return new JAXBElement<>(_BeschwerdebereichErmitteln_QNAME, BeschwerdebereichErmittelnRequest.class, null, value);
  }

  /**
   * Create an instance of {@link BeschwerdebereichErmittelnRequest }
   */
  public BeschwerdebereichErmittelnRequest createBeschwerdebereichErmittelnRequest() {
	return new BeschwerdebereichErmittelnRequest();
  }

  /**
   * Create an instance of {@link BeschwerdebereichErmittelnResponse }
   */
  public BeschwerdebereichErmittelnResponse createBeschwerdebereichErmittelnResponse() {
	return new BeschwerdebereichErmittelnResponse();
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link BeschwerdebereichErmittelnResponse }{@code >}}
   */
  @XmlElementDecl(namespace=BASICURI, name="beschwerdebereichErmittelnResponse")
  public JAXBElement<BeschwerdebereichErmittelnResponse> createBeschwerdebereichErmittelnResponse(BeschwerdebereichErmittelnResponse value) {
	return new JAXBElement<>(_BeschwerdebereichErmittelnResponse_QNAME, BeschwerdebereichErmittelnResponse.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link BeschwerdenErmittelnRequest }{@code >}}
   */
  @XmlElementDecl(namespace=BASICURI, name="beschwerdenErmitteln")
  public JAXBElement<BeschwerdenErmittelnRequest> createBeschwerdenErmitteln(BeschwerdenErmittelnRequest value) {
	return new JAXBElement<>(_BeschwerdenErmitteln_QNAME, BeschwerdenErmittelnRequest.class, null, value);
  }

  /**
   * Create an instance of {@link BeschwerdenErmittelnRequest }
   */
  public BeschwerdenErmittelnRequest createBeschwerdenErmittelnRequest() {
	return new BeschwerdenErmittelnRequest();
  }

  /**
   * Create an instance of {@link BeschwerdenErmittelnResponse }
   */
  public BeschwerdenErmittelnResponse createBeschwerdenErmittelnResponse() {
	return new BeschwerdenErmittelnResponse();
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link BeschwerdenErmittelnResponse }{@code >}}
   */
  @XmlElementDecl(namespace=BASICURI, name="beschwerdenErmittelnResponse")
  public JAXBElement<BeschwerdenErmittelnResponse> createBeschwerdenErmittelnResponse(BeschwerdenErmittelnResponse value) {
	return new JAXBElement<>(_BeschwerdenErmittelnResponse_QNAME, BeschwerdenErmittelnResponse.class, null, value);
  }

  /**
   * Create an instance of {@link Meldung }
   */
  public Meldung createMeldung() {
	return new Meldung();
  }

  /**
   * Create an instance of {@link Parameter }
   */
  public Parameter createParameter() {
	return new Parameter();
  }

  /**
   * Create an instance of {@link QuellSystem }
   */
  public QuellSystem createQuellSystem() {
	return new QuellSystem();
  }

  /**
   * Create an instance of {@link ReturnInfo }
   */
  public ReturnInfo createReturnInfo() {
	return new ReturnInfo();
  }

  /**
   * Create an instance of {@link RqKontext }
   */
  public RqKontext createRqKontext() {
	return new RqKontext();
  }

  /**
   * Create an instance of {@link RsKontext }
   */
  public RsKontext createRsKontext() {
	return new RsKontext();
  }

  /**
   * Create an instance of {@link StandardRequest }
   */
  public StandardRequest createStandardRequest() {
	return new StandardRequest();
  }

  /**
   * Create an instance of {@link StandardResponse }
   */
  public StandardResponse createStandardResponse() {
	return new StandardResponse();
  }
}
