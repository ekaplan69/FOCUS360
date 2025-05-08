package at.sozvers.noegkk.sckont.kontakt.focus;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;

/**
 * This object contains factory methods for each Java content interface and Java element interface generated in the at.sozvers.noegkk.sckont.kontakt.focus package.
 * <p>An ObjectFactory allows you to programatically
 * construct new instances of the Java representation for XML content. The Java representation of XML content can consist of schema derived interfaces and classes representing the binding of schema
 * type definitions, element declarations and model groups.  Factory methods for each of these are provided in this class.
 */
@XmlRegistry
public class ObjectFactory {

  private static final String BASEURI                                         = "http://focus.kontakt.sckont.noegkk.sozvers.at/";
  private static final QName  _KontaktAendernResponse_QNAME                   = new QName(BASEURI, "kontaktAendernResponse");
  private static final QName  _KontaktAendern_QNAME                           = new QName(BASEURI, "kontaktAendern");
  private static final QName  _KontaktAufggAaMstMapErmittelnResponse_QNAME    = new QName(BASEURI, "kontaktAufggAaMstMapErmittelnResponse");
  private static final QName  _KontaktAufggAaMstMapErmitteln_QNAME            = new QName(BASEURI, "kontaktAufggAaMstMapErmitteln");
  private static final QName  _KontaktAufggKtMstMapErmittelnResponse_QNAME    = new QName(BASEURI, "kontaktAufggKtMstMapErmittelnResponse");
  private static final QName  _KontaktAufggKtMstMapErmitteln_QNAME            = new QName(BASEURI, "kontaktAufggKtMstMapErmitteln");
  private static final QName  _KontaktAufggThemaMstMapErmittelnResponse_QNAME = new QName(BASEURI, "kontaktAufggThemaMstMapErmittelnResponse");
  private static final QName  _KontaktAufggThemaMstMapErmitteln_QNAME         = new QName(BASEURI, "kontaktAufggThemaMstMapErmitteln");
  private static final QName  _KontaktabschlussartErmittelnResponse_QNAME     = new QName(BASEURI, "kontaktabschlussartErmittelnResponse");
  private static final QName  _KontaktabschlussartErmitteln_QNAME             = new QName(BASEURI, "kontaktabschlussartErmitteln");
  private static final QName  _KontaktaufgabengebietErmittelnResponse_QNAME   = new QName(BASEURI, "kontaktaufgabengebietErmittelnResponse");
  private static final QName  _KontaktaufgabengebietErmitteln_QNAME           = new QName(BASEURI, "kontaktaufgabengebietErmitteln");
  private static final QName  _KontaktgrundErmittelnResponse_QNAME            = new QName(BASEURI, "kontaktgrundErmittelnResponse");
  private static final QName  _KontaktgrundErmitteln_QNAME                    = new QName(BASEURI, "kontaktgrundErmitteln");
  private static final QName  _KontaktkontaktAendernResponse_QNAME            = new QName(BASEURI, "kontaktkontaktAendernResponse");
  private static final QName  _KontaktkontaktAendern_QNAME                    = new QName(BASEURI, "kontaktkontaktAendern");
  private static final QName  _KontaktkontaktErstellenResponse_QNAME          = new QName(BASEURI, "kontaktkontaktErstellenResponse");
  private static final QName  _KontaktkontaktErstellen_QNAME                  = new QName(BASEURI, "kontaktkontaktErstellen");
  private static final QName  _KontaktkontaktLesenResponse_QNAME              = new QName(BASEURI, "kontaktkontaktLesenResponse");
  private static final QName  _KontaktkontaktLesen_QNAME                      = new QName(BASEURI, "kontaktkontaktLesen");
  private static final QName  _KontaktkontaktLoeschenResponse_QNAME           = new QName(BASEURI, "kontaktkontaktLoeschenResponse");
  private static final QName  _KontaktkontaktLoeschen_QNAME                   = new QName(BASEURI, "kontaktkontaktLoeschen");
  private static final QName  _KontaktkontaktartErmittelnResponse_QNAME       = new QName(BASEURI, "kontaktkontaktartErmittelnResponse");
  private static final QName  _KontaktkontaktartErmitteln_QNAME               = new QName(BASEURI, "kontaktkontaktartErmitteln");
  private static final QName  _KontaktkontakteErmittelnResponse_QNAME         = new QName(BASEURI, "kontaktkontakteErmittelnResponse");
  private static final QName  _KontaktkontakteErmitteln_QNAME                 = new QName(BASEURI, "kontaktkontakteErmitteln");
  private static final QName  _KontaktthemaErmittelnResponse_QNAME            = new QName(BASEURI, "kontaktthemaErmittelnResponse");
  private static final QName  _KontaktthemaErmitteln_QNAME                    = new QName(BASEURI, "kontaktthemaErmitteln");

  /**
   * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: at.sozvers.noegkk.sckont.kontakt.focus
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
   * Create an instance of {@link JAXBElement }{@code <}{@link KontaktAendernRequest }{@code >}}
   */
  @XmlElementDecl(namespace=BASEURI, name="kontaktAendern")
  public JAXBElement<KontaktAendernRequest> createKontaktAendern(KontaktAendernRequest value) {
	return new JAXBElement<>(_KontaktAendern_QNAME, KontaktAendernRequest.class, null, value);
  }

  /**
   * Create an instance of {@link KontaktAendernRequest }
   */
  public KontaktAendernRequest createKontaktAendernRequest() {
	return new KontaktAendernRequest();
  }

  /**
   * Create an instance of {@link KontaktAendernRequest.DetailDetailIds }
   */
  public KontaktAendernRequest.DetailDetailIds createKontaktAendernRequestDetailDetailIds() {
	return new KontaktAendernRequest.DetailDetailIds();
  }

  /**
   * Create an instance of {@link KontaktAendernResponse }
   */
  public KontaktAendernResponse createKontaktAendernResponse() {
	return new KontaktAendernResponse();
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link KontaktAendernResponse }{@code >}}
   */
  @XmlElementDecl(namespace=BASEURI, name="kontaktAendernResponse")
  public JAXBElement<KontaktAendernResponse> createKontaktAendernResponse(KontaktAendernResponse value) {
	return new JAXBElement<>(_KontaktAendernResponse_QNAME, KontaktAendernResponse.class, null, value);
  }

  /**
   * Create an instance of {@link KontaktAufggAaMstMap }
   */
  public KontaktAufggAaMstMap createKontaktAufggAaMstMap() {
	return new KontaktAufggAaMstMap();
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link KontaktAufggAaMstMapErmittelnRequest }{@code >}}
   */
  @XmlElementDecl(namespace=BASEURI, name="kontaktAufggAaMstMapErmitteln")
  public JAXBElement<KontaktAufggAaMstMapErmittelnRequest> createKontaktAufggAaMstMapErmitteln(KontaktAufggAaMstMapErmittelnRequest value) {
	return new JAXBElement<>(_KontaktAufggAaMstMapErmitteln_QNAME, KontaktAufggAaMstMapErmittelnRequest.class, null, value);
  }

  /**
   * Create an instance of {@link KontaktAufggAaMstMapErmittelnRequest }
   */
  public KontaktAufggAaMstMapErmittelnRequest createKontaktAufggAaMstMapErmittelnRequest() {
	return new KontaktAufggAaMstMapErmittelnRequest();
  }

  /**
   * Create an instance of {@link KontaktAufggAaMstMapErmittelnResponse }
   */
  public KontaktAufggAaMstMapErmittelnResponse createKontaktAufggAaMstMapErmittelnResponse() {
	return new KontaktAufggAaMstMapErmittelnResponse();
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link KontaktAufggAaMstMapErmittelnResponse }{@code >}}
   */
  @XmlElementDecl(namespace=BASEURI, name="kontaktAufggAaMstMapErmittelnResponse")
  public JAXBElement<KontaktAufggAaMstMapErmittelnResponse> createKontaktAufggAaMstMapErmittelnResponse(KontaktAufggAaMstMapErmittelnResponse value) {
	return new JAXBElement<>(_KontaktAufggAaMstMapErmittelnResponse_QNAME, KontaktAufggAaMstMapErmittelnResponse.class, null, value);
  }

  /**
   * Create an instance of {@link KontaktAufggKtMstMap }
   */
  public KontaktAufggKtMstMap createKontaktAufggKtMstMap() {
	return new KontaktAufggKtMstMap();
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link KontaktAufggKtMstMapErmittelnRequest }{@code >}}
   */
  @XmlElementDecl(namespace=BASEURI, name="kontaktAufggKtMstMapErmitteln")
  public JAXBElement<KontaktAufggKtMstMapErmittelnRequest> createKontaktAufggKtMstMapErmitteln(KontaktAufggKtMstMapErmittelnRequest value) {
	return new JAXBElement<>(_KontaktAufggKtMstMapErmitteln_QNAME, KontaktAufggKtMstMapErmittelnRequest.class, null, value);
  }

  /**
   * Create an instance of {@link KontaktAufggKtMstMapErmittelnRequest }
   */
  public KontaktAufggKtMstMapErmittelnRequest createKontaktAufggKtMstMapErmittelnRequest() {
	return new KontaktAufggKtMstMapErmittelnRequest();
  }

  /**
   * Create an instance of {@link KontaktAufggKtMstMapErmittelnResponse }
   */
  public KontaktAufggKtMstMapErmittelnResponse createKontaktAufggKtMstMapErmittelnResponse() {
	return new KontaktAufggKtMstMapErmittelnResponse();
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link KontaktAufggKtMstMapErmittelnResponse }{@code >}}
   */
  @XmlElementDecl(namespace=BASEURI, name="kontaktAufggKtMstMapErmittelnResponse")
  public JAXBElement<KontaktAufggKtMstMapErmittelnResponse> createKontaktAufggKtMstMapErmittelnResponse(KontaktAufggKtMstMapErmittelnResponse value) {
	return new JAXBElement<>(_KontaktAufggKtMstMapErmittelnResponse_QNAME, KontaktAufggKtMstMapErmittelnResponse.class, null, value);
  }

  /**
   * Create an instance of {@link KontaktAufggThemaMstMap }
   */
  public KontaktAufggThemaMstMap createKontaktAufggThemaMstMap() {
	return new KontaktAufggThemaMstMap();
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link KontaktAufggThemaMstMapErmittelnRequest }{@code >}}
   */
  @XmlElementDecl(namespace=BASEURI, name="kontaktAufggThemaMstMapErmitteln")
  public JAXBElement<KontaktAufggThemaMstMapErmittelnRequest> createKontaktAufggThemaMstMapErmitteln(KontaktAufggThemaMstMapErmittelnRequest value) {
	return new JAXBElement<>(_KontaktAufggThemaMstMapErmitteln_QNAME, KontaktAufggThemaMstMapErmittelnRequest.class, null, value);
  }

  /**
   * Create an instance of {@link KontaktAufggThemaMstMapErmittelnRequest }
   */
  public KontaktAufggThemaMstMapErmittelnRequest createKontaktAufggThemaMstMapErmittelnRequest() {
	return new KontaktAufggThemaMstMapErmittelnRequest();
  }

  /**
   * Create an instance of {@link KontaktAufggThemaMstMapErmittelnResponse }
   */
  public KontaktAufggThemaMstMapErmittelnResponse createKontaktAufggThemaMstMapErmittelnResponse() {
	return new KontaktAufggThemaMstMapErmittelnResponse();
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link KontaktAufggThemaMstMapErmittelnResponse }{@code >}}
   */
  @XmlElementDecl(namespace=BASEURI, name="kontaktAufggThemaMstMapErmittelnResponse")
  public JAXBElement<KontaktAufggThemaMstMapErmittelnResponse> createKontaktAufggThemaMstMapErmittelnResponse(KontaktAufggThemaMstMapErmittelnResponse value) {
	return new JAXBElement<>(_KontaktAufggThemaMstMapErmittelnResponse_QNAME, KontaktAufggThemaMstMapErmittelnResponse.class, null, value);
  }

  /**
   * Create an instance of {@link Kontaktabschlussart }
   */
  public Kontaktabschlussart createKontaktabschlussart() {
	return new Kontaktabschlussart();
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link KontaktabschlussartErmittelnRequest }{@code >}}
   */
  @XmlElementDecl(namespace=BASEURI, name="kontaktabschlussartErmitteln")
  public JAXBElement<KontaktabschlussartErmittelnRequest> createKontaktabschlussartErmitteln(KontaktabschlussartErmittelnRequest value) {
	return new JAXBElement<>(_KontaktabschlussartErmitteln_QNAME, KontaktabschlussartErmittelnRequest.class, null, value);
  }

  /**
   * Create an instance of {@link KontaktabschlussartErmittelnRequest }
   */
  public KontaktabschlussartErmittelnRequest createKontaktabschlussartErmittelnRequest() {
	return new KontaktabschlussartErmittelnRequest();
  }

  /**
   * Create an instance of {@link KontaktabschlussartErmittelnResponse }
   */
  public KontaktabschlussartErmittelnResponse createKontaktabschlussartErmittelnResponse() {
	return new KontaktabschlussartErmittelnResponse();
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link KontaktabschlussartErmittelnResponse }{@code >}}
   */
  @XmlElementDecl(namespace=BASEURI, name="kontaktabschlussartErmittelnResponse")
  public JAXBElement<KontaktabschlussartErmittelnResponse> createKontaktabschlussartErmittelnResponse(KontaktabschlussartErmittelnResponse value) {
	return new JAXBElement<>(_KontaktabschlussartErmittelnResponse_QNAME, KontaktabschlussartErmittelnResponse.class, null, value);
  }

  /**
   * Create an instance of {@link Kontaktaufgabengebiet }
   */
  public Kontaktaufgabengebiet createKontaktaufgabengebiet() {
	return new Kontaktaufgabengebiet();
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link KontaktaufgabengebietErmittelnRequest }{@code >}}
   */
  @XmlElementDecl(namespace=BASEURI, name="kontaktaufgabengebietErmitteln")
  public JAXBElement<KontaktaufgabengebietErmittelnRequest> createKontaktaufgabengebietErmitteln(KontaktaufgabengebietErmittelnRequest value) {
	return new JAXBElement<>(_KontaktaufgabengebietErmitteln_QNAME, KontaktaufgabengebietErmittelnRequest.class, null, value);
  }

  /**
   * Create an instance of {@link KontaktaufgabengebietErmittelnRequest }
   */
  public KontaktaufgabengebietErmittelnRequest createKontaktaufgabengebietErmittelnRequest() {
	return new KontaktaufgabengebietErmittelnRequest();
  }

  /**
   * Create an instance of {@link KontaktaufgabengebietErmittelnResponse }
   */
  public KontaktaufgabengebietErmittelnResponse createKontaktaufgabengebietErmittelnResponse() {
	return new KontaktaufgabengebietErmittelnResponse();
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link KontaktaufgabengebietErmittelnResponse }{@code >}}
   */
  @XmlElementDecl(namespace=BASEURI, name="kontaktaufgabengebietErmittelnResponse")
  public JAXBElement<KontaktaufgabengebietErmittelnResponse> createKontaktaufgabengebietErmittelnResponse(KontaktaufgabengebietErmittelnResponse value) {
	return new JAXBElement<>(_KontaktaufgabengebietErmittelnResponse_QNAME, KontaktaufgabengebietErmittelnResponse.class, null, value);
  }

  /**
   * Create an instance of {@link Kontaktdetail }
   */
  public Kontaktdetail createKontaktdetail() {
	return new Kontaktdetail();
  }

  /**
   * Create an instance of {@link Kontaktgrund }
   */
  public Kontaktgrund createKontaktgrund() {
	return new Kontaktgrund();
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link KontaktgrundErmittelnRequest }{@code >}}
   */
  @XmlElementDecl(namespace=BASEURI, name="kontaktgrundErmitteln")
  public JAXBElement<KontaktgrundErmittelnRequest> createKontaktgrundErmitteln(KontaktgrundErmittelnRequest value) {
	return new JAXBElement<>(_KontaktgrundErmitteln_QNAME, KontaktgrundErmittelnRequest.class, null, value);
  }

  /**
   * Create an instance of {@link KontaktgrundErmittelnRequest }
   */
  public KontaktgrundErmittelnRequest createKontaktgrundErmittelnRequest() {
	return new KontaktgrundErmittelnRequest();
  }

  /**
   * Create an instance of {@link KontaktgrundErmittelnResponse }
   */
  public KontaktgrundErmittelnResponse createKontaktgrundErmittelnResponse() {
	return new KontaktgrundErmittelnResponse();
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link KontaktgrundErmittelnResponse }{@code >}}
   */
  @XmlElementDecl(namespace=BASEURI, name="kontaktgrundErmittelnResponse")
  public JAXBElement<KontaktgrundErmittelnResponse> createKontaktgrundErmittelnResponse(KontaktgrundErmittelnResponse value) {
	return new JAXBElement<>(_KontaktgrundErmittelnResponse_QNAME, KontaktgrundErmittelnResponse.class, null, value);
  }

  /**
   * Create an instance of {@link Kontaktkontakt }
   */
  public Kontaktkontakt createKontaktkontakt() {
	return new Kontaktkontakt();
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link KontaktkontaktAendernRequest }{@code >}}
   */
  @XmlElementDecl(namespace=BASEURI, name="kontaktkontaktAendern")
  public JAXBElement<KontaktkontaktAendernRequest> createKontaktkontaktAendern(KontaktkontaktAendernRequest value) {
	return new JAXBElement<>(_KontaktkontaktAendern_QNAME, KontaktkontaktAendernRequest.class, null, value);
  }

  /**
   * Create an instance of {@link KontaktkontaktAendernRequest }
   */
  public KontaktkontaktAendernRequest createKontaktkontaktAendernRequest() {
	return new KontaktkontaktAendernRequest();
  }

  /**
   * Create an instance of {@link KontaktkontaktAendernResponse }
   */
  public KontaktkontaktAendernResponse createKontaktkontaktAendernResponse() {
	return new KontaktkontaktAendernResponse();
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link KontaktkontaktAendernResponse }{@code >}}
   */
  @XmlElementDecl(namespace=BASEURI, name="kontaktkontaktAendernResponse")
  public JAXBElement<KontaktkontaktAendernResponse> createKontaktkontaktAendernResponse(KontaktkontaktAendernResponse value) {
	return new JAXBElement<>(_KontaktkontaktAendernResponse_QNAME, KontaktkontaktAendernResponse.class, null, value);
  }

  /**
   * Create an instance of {@link KontaktkontaktErmittelnRequest }
   */
  public KontaktkontaktErmittelnRequest createKontaktkontaktErmittelnRequest() {
	return new KontaktkontaktErmittelnRequest();
  }

  /**
   * Create an instance of {@link KontaktkontaktErmittelnResponse }
   */
  public KontaktkontaktErmittelnResponse createKontaktkontaktErmittelnResponse() {
	return new KontaktkontaktErmittelnResponse();
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link KontaktkontaktErstellenRequest }{@code >}}
   */
  @XmlElementDecl(namespace=BASEURI, name="kontaktkontaktErstellen")
  public JAXBElement<KontaktkontaktErstellenRequest> createKontaktkontaktErstellen(KontaktkontaktErstellenRequest value) {
	return new JAXBElement<>(_KontaktkontaktErstellen_QNAME, KontaktkontaktErstellenRequest.class, null, value);
  }

  /**
   * Create an instance of {@link KontaktkontaktErstellenRequest }
   */
  public KontaktkontaktErstellenRequest createKontaktkontaktErstellenRequest() {
	return new KontaktkontaktErstellenRequest();
  }

  /**
   * Create an instance of {@link KontaktkontaktErstellenResponse }
   */
  public KontaktkontaktErstellenResponse createKontaktkontaktErstellenResponse() {
	return new KontaktkontaktErstellenResponse();
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link KontaktkontaktErstellenResponse }{@code >}}
   */
  @XmlElementDecl(namespace=BASEURI, name="kontaktkontaktErstellenResponse")
  public JAXBElement<KontaktkontaktErstellenResponse> createKontaktkontaktErstellenResponse(KontaktkontaktErstellenResponse value) {
	return new JAXBElement<>(_KontaktkontaktErstellenResponse_QNAME, KontaktkontaktErstellenResponse.class, null, value);
  }

  /**
   * Create an instance of {@link KontaktkontaktKurz }
   */
  public KontaktkontaktKurz createKontaktkontaktKurz() {
	return new KontaktkontaktKurz();
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link KontaktkontaktLesenRequest }{@code >}}
   */
  @XmlElementDecl(namespace=BASEURI, name="kontaktkontaktLesen")
  public JAXBElement<KontaktkontaktLesenRequest> createKontaktkontaktLesen(KontaktkontaktLesenRequest value) {
	return new JAXBElement<>(_KontaktkontaktLesen_QNAME, KontaktkontaktLesenRequest.class, null, value);
  }

  /**
   * Create an instance of {@link KontaktkontaktLesenRequest }
   */
  public KontaktkontaktLesenRequest createKontaktkontaktLesenRequest() {
	return new KontaktkontaktLesenRequest();
  }

  /**
   * Create an instance of {@link KontaktkontaktLesenResponse }
   */
  public KontaktkontaktLesenResponse createKontaktkontaktLesenResponse() {
	return new KontaktkontaktLesenResponse();
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link KontaktkontaktLesenResponse }{@code >}}
   */
  @XmlElementDecl(namespace=BASEURI, name="kontaktkontaktLesenResponse")
  public JAXBElement<KontaktkontaktLesenResponse> createKontaktkontaktLesenResponse(KontaktkontaktLesenResponse value) {
	return new JAXBElement<>(_KontaktkontaktLesenResponse_QNAME, KontaktkontaktLesenResponse.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link KontaktkontaktLoeschenRequest }{@code >}}
   */
  @XmlElementDecl(namespace=BASEURI, name="kontaktkontaktLoeschen")
  public JAXBElement<KontaktkontaktLoeschenRequest> createKontaktkontaktLoeschen(KontaktkontaktLoeschenRequest value) {
	return new JAXBElement<>(_KontaktkontaktLoeschen_QNAME, KontaktkontaktLoeschenRequest.class, null, value);
  }

  /**
   * Create an instance of {@link KontaktkontaktLoeschenRequest }
   */
  public KontaktkontaktLoeschenRequest createKontaktkontaktLoeschenRequest() {
	return new KontaktkontaktLoeschenRequest();
  }

  /**
   * Create an instance of {@link KontaktkontaktLoeschenResponse }
   */
  public KontaktkontaktLoeschenResponse createKontaktkontaktLoeschenResponse() {
	return new KontaktkontaktLoeschenResponse();
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link KontaktkontaktLoeschenResponse }{@code >}}
   */
  @XmlElementDecl(namespace=BASEURI, name="kontaktkontaktLoeschenResponse")
  public JAXBElement<KontaktkontaktLoeschenResponse> createKontaktkontaktLoeschenResponse(KontaktkontaktLoeschenResponse value) {
	return new JAXBElement<>(_KontaktkontaktLoeschenResponse_QNAME, KontaktkontaktLoeschenResponse.class, null, value);
  }

  /**
   * Create an instance of {@link Kontaktkontaktart }
   */
  public Kontaktkontaktart createKontaktkontaktart() {
	return new Kontaktkontaktart();
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link KontaktkontaktartErmittelnRequest }{@code >}}
   */
  @XmlElementDecl(namespace=BASEURI, name="kontaktkontaktartErmitteln")
  public JAXBElement<KontaktkontaktartErmittelnRequest> createKontaktkontaktartErmitteln(KontaktkontaktartErmittelnRequest value) {
	return new JAXBElement<>(_KontaktkontaktartErmitteln_QNAME, KontaktkontaktartErmittelnRequest.class, null, value);
  }

  /**
   * Create an instance of {@link KontaktkontaktartErmittelnRequest }
   */
  public KontaktkontaktartErmittelnRequest createKontaktkontaktartErmittelnRequest() {
	return new KontaktkontaktartErmittelnRequest();
  }

  /**
   * Create an instance of {@link KontaktkontaktartErmittelnResponse }
   */
  public KontaktkontaktartErmittelnResponse createKontaktkontaktartErmittelnResponse() {
	return new KontaktkontaktartErmittelnResponse();
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link KontaktkontaktartErmittelnResponse }{@code >}}
   */
  @XmlElementDecl(namespace=BASEURI, name="kontaktkontaktartErmittelnResponse")
  public JAXBElement<KontaktkontaktartErmittelnResponse> createKontaktkontaktartErmittelnResponse(KontaktkontaktartErmittelnResponse value) {
	return new JAXBElement<>(_KontaktkontaktartErmittelnResponse_QNAME, KontaktkontaktartErmittelnResponse.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link KontaktkontaktErmittelnRequest }{@code >}}
   */
  @XmlElementDecl(namespace=BASEURI, name="kontaktkontakteErmitteln")
  public JAXBElement<KontaktkontaktErmittelnRequest> createKontaktkontakteErmitteln(KontaktkontaktErmittelnRequest value) {
	return new JAXBElement<>(_KontaktkontakteErmitteln_QNAME, KontaktkontaktErmittelnRequest.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link KontaktkontaktErmittelnResponse }{@code >}}
   */
  @XmlElementDecl(namespace=BASEURI, name="kontaktkontakteErmittelnResponse")
  public JAXBElement<KontaktkontaktErmittelnResponse> createKontaktkontakteErmittelnResponse(KontaktkontaktErmittelnResponse value) {
	return new JAXBElement<>(_KontaktkontakteErmittelnResponse_QNAME, KontaktkontaktErmittelnResponse.class, null, value);
  }

  /**
   * Create an instance of {@link Kontaktthema }
   */
  public Kontaktthema createKontaktthema() {
	return new Kontaktthema();
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link KontaktthemaErmittelnRequest }{@code >}}
   */
  @XmlElementDecl(namespace=BASEURI, name="kontaktthemaErmitteln")
  public JAXBElement<KontaktthemaErmittelnRequest> createKontaktthemaErmitteln(KontaktthemaErmittelnRequest value) {
	return new JAXBElement<>(_KontaktthemaErmitteln_QNAME, KontaktthemaErmittelnRequest.class, null, value);
  }

  /**
   * Create an instance of {@link KontaktthemaErmittelnRequest }
   */
  public KontaktthemaErmittelnRequest createKontaktthemaErmittelnRequest() {
	return new KontaktthemaErmittelnRequest();
  }

  /**
   * Create an instance of {@link KontaktthemaErmittelnResponse }
   */
  public KontaktthemaErmittelnResponse createKontaktthemaErmittelnResponse() {
	return new KontaktthemaErmittelnResponse();
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link KontaktthemaErmittelnResponse }{@code >}}
   */
  @XmlElementDecl(namespace=BASEURI, name="kontaktthemaErmittelnResponse")
  public JAXBElement<KontaktthemaErmittelnResponse> createKontaktthemaErmittelnResponse(KontaktthemaErmittelnResponse value) {
	return new JAXBElement<>(_KontaktthemaErmittelnResponse_QNAME, KontaktthemaErmittelnResponse.class, null, value);
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

  /**
   * Create an instance of {@link Unterdetail }
   */
  public Unterdetail createUnterdetail() {
	return new Unterdetail();
  }
}
