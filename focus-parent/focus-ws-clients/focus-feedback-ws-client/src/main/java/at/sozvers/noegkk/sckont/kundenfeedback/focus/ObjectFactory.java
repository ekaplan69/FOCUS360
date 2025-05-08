package at.sozvers.noegkk.sckont.kundenfeedback.focus;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;

/**
 * This object contains factory methods for each Java content interface and Java element interface generated in the at.sozvers.noegkk.sckont.kundenfeedback.focus package.
 * <p>An ObjectFactory allows you to programatically
 * construct new instances of the Java representation for XML content. The Java representation of XML content can consist of schema derived interfaces and classes representing the binding of schema
 * type definitions, element declarations and model groups.  Factory methods for each of these are provided in this class.
 */
@XmlRegistry
public class ObjectFactory {

  private final static QName _KfFeedbackAendernResponse_QNAME                = new QName("http://focus.kundenfeedback.sckont.noegkk.sozvers.at/", "kfFeedbackAendernResponse");
  private final static QName _KfFeedbackAendern_QNAME                        = new QName("http://focus.kundenfeedback.sckont.noegkk.sozvers.at/", "kfFeedbackAendern");
  private final static QName _KfFeedbackErstellenResponse_QNAME              = new QName("http://focus.kundenfeedback.sckont.noegkk.sozvers.at/", "kfFeedbackErstellenResponse");
  private final static QName _KfFeedbackErstellen_QNAME                      = new QName("http://focus.kundenfeedback.sckont.noegkk.sozvers.at/", "kfFeedbackErstellen");
  private final static QName _KfFeedbackKurzListeErmittelnResponse_QNAME     = new QName("http://focus.kundenfeedback.sckont.noegkk.sozvers.at/", "kfFeedbackKurzListeErmittelnResponse");
  private final static QName _KfFeedbackKurzListeErmitteln_QNAME             = new QName("http://focus.kundenfeedback.sckont.noegkk.sozvers.at/", "kfFeedbackKurzListeErmitteln");
  private final static QName _KfFeedbackLangErmittelnResponse_QNAME          = new QName("http://focus.kundenfeedback.sckont.noegkk.sozvers.at/", "kfFeedbackLangErmittelnResponse");
  private final static QName _KfFeedbackLangErmitteln_QNAME                  = new QName("http://focus.kundenfeedback.sckont.noegkk.sozvers.at/", "kfFeedbackLangErmitteln");
  private final static QName _KfFeedbackgruendeErmittelnResponse_QNAME       = new QName("http://focus.kundenfeedback.sckont.noegkk.sozvers.at/", "kfFeedbackgruendeErmittelnResponse");
  private final static QName _KfFeedbackgruendeErmitteln_QNAME               = new QName("http://focus.kundenfeedback.sckont.noegkk.sozvers.at/", "kfFeedbackgruendeErmitteln");
  private final static QName _KfThemaFbgMapsErmittelnResponse_QNAME          = new QName("http://focus.kundenfeedback.sckont.noegkk.sozvers.at/", "kfThemaFbgMapsErmittelnResponse");
  private final static QName _KfThemaFbgMapsErmitteln_QNAME                  = new QName("http://focus.kundenfeedback.sckont.noegkk.sozvers.at/", "kfThemaFbgMapsErmitteln");
  private final static QName _KfThemenErmittelnResponse_QNAME                = new QName("http://focus.kundenfeedback.sckont.noegkk.sozvers.at/", "kfThemenErmittelnResponse");
  private final static QName _KfThemenErmitteln_QNAME                        = new QName("http://focus.kundenfeedback.sckont.noegkk.sozvers.at/", "kfThemenErmitteln");
  private final static QName _KfUnterkategorieFbgMapsErmittelnResponse_QNAME = new QName("http://focus.kundenfeedback.sckont.noegkk.sozvers.at/", "kfUnterkategorieFbgMapsErmittelnResponse");
  private final static QName _KfUnterkategorieFbgMapsErmitteln_QNAME         = new QName("http://focus.kundenfeedback.sckont.noegkk.sozvers.at/", "kfUnterkategorieFbgMapsErmitteln");
  private final static QName _KfUnterkategorienErmittelnResponse_QNAME       = new QName("http://focus.kundenfeedback.sckont.noegkk.sozvers.at/", "KfUnterkategorienErmittelnResponse");
  private final static QName _KfUnterkategorienErmitteln_QNAME               = new QName("http://focus.kundenfeedback.sckont.noegkk.sozvers.at/", "KfUnterkategorienErmitteln");

  /**
   * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: at.sozvers.noegkk.sckont.kundenfeedback.focus
   */
  public ObjectFactory() {
  }

  /**
   * Create an instance of {@link Bearbeiter }
   */
  public Bearbeiter createBearbeiter() {
	return new Bearbeiter();
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link KfFeedbackAendernRequest }{@code >}}
   */
  @XmlElementDecl(namespace="http://focus.kundenfeedback.sckont.noegkk.sozvers.at/", name="kfFeedbackAendern")
  public JAXBElement<KfFeedbackAendernRequest> createKfFeedbackAendern(KfFeedbackAendernRequest value) {
	return new JAXBElement<KfFeedbackAendernRequest>(_KfFeedbackAendern_QNAME, KfFeedbackAendernRequest.class, null, value);
  }

  /**
   * Create an instance of {@link KfFeedbackAendernRequest }
   */
  public KfFeedbackAendernRequest createKfFeedbackAendernRequest() {
	return new KfFeedbackAendernRequest();
  }

  /**
   * Create an instance of {@link KfFeedbackAendernResponse }
   */
  public KfFeedbackAendernResponse createKfFeedbackAendernResponse() {
	return new KfFeedbackAendernResponse();
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link KfFeedbackAendernResponse }{@code >}}
   */
  @XmlElementDecl(namespace="http://focus.kundenfeedback.sckont.noegkk.sozvers.at/", name="kfFeedbackAendernResponse")
  public JAXBElement<KfFeedbackAendernResponse> createKfFeedbackAendernResponse(KfFeedbackAendernResponse value) {
	return new JAXBElement<KfFeedbackAendernResponse>(_KfFeedbackAendernResponse_QNAME, KfFeedbackAendernResponse.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link KfFeedbackErstellenRequest }{@code >}}
   */
  @XmlElementDecl(namespace="http://focus.kundenfeedback.sckont.noegkk.sozvers.at/", name="kfFeedbackErstellen")
  public JAXBElement<KfFeedbackErstellenRequest> createKfFeedbackErstellen(KfFeedbackErstellenRequest value) {
	return new JAXBElement<KfFeedbackErstellenRequest>(_KfFeedbackErstellen_QNAME, KfFeedbackErstellenRequest.class, null, value);
  }

  /**
   * Create an instance of {@link KfFeedbackErstellenRequest }
   */
  public KfFeedbackErstellenRequest createKfFeedbackErstellenRequest() {
	return new KfFeedbackErstellenRequest();
  }

  /**
   * Create an instance of {@link KfFeedbackErstellenResponse }
   */
  public KfFeedbackErstellenResponse createKfFeedbackErstellenResponse() {
	return new KfFeedbackErstellenResponse();
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link KfFeedbackErstellenResponse }{@code >}}
   */
  @XmlElementDecl(namespace="http://focus.kundenfeedback.sckont.noegkk.sozvers.at/", name="kfFeedbackErstellenResponse")
  public JAXBElement<KfFeedbackErstellenResponse> createKfFeedbackErstellenResponse(KfFeedbackErstellenResponse value) {
	return new JAXBElement<KfFeedbackErstellenResponse>(_KfFeedbackErstellenResponse_QNAME, KfFeedbackErstellenResponse.class, null, value);
  }

  /**
   * Create an instance of {@link KfFeedbackKurz }
   */
  public KfFeedbackKurz createKfFeedbackKurz() {
	return new KfFeedbackKurz();
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link KfFeedbackKurzListeErmittelnRequest }{@code >}}
   */
  @XmlElementDecl(namespace="http://focus.kundenfeedback.sckont.noegkk.sozvers.at/", name="kfFeedbackKurzListeErmitteln")
  public JAXBElement<KfFeedbackKurzListeErmittelnRequest> createKfFeedbackKurzListeErmitteln(KfFeedbackKurzListeErmittelnRequest value) {
	return new JAXBElement<KfFeedbackKurzListeErmittelnRequest>(_KfFeedbackKurzListeErmitteln_QNAME, KfFeedbackKurzListeErmittelnRequest.class, null, value);
  }

  /**
   * Create an instance of {@link KfFeedbackKurzListeErmittelnRequest }
   */
  public KfFeedbackKurzListeErmittelnRequest createKfFeedbackKurzListeErmittelnRequest() {
	return new KfFeedbackKurzListeErmittelnRequest();
  }

  /**
   * Create an instance of {@link KfFeedbackKurzListeErmittelnResponse }
   */
  public KfFeedbackKurzListeErmittelnResponse createKfFeedbackKurzListeErmittelnResponse() {
	return new KfFeedbackKurzListeErmittelnResponse();
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link KfFeedbackKurzListeErmittelnResponse }{@code >}}
   */
  @XmlElementDecl(namespace="http://focus.kundenfeedback.sckont.noegkk.sozvers.at/", name="kfFeedbackKurzListeErmittelnResponse")
  public JAXBElement<KfFeedbackKurzListeErmittelnResponse> createKfFeedbackKurzListeErmittelnResponse(KfFeedbackKurzListeErmittelnResponse value) {
	return new JAXBElement<KfFeedbackKurzListeErmittelnResponse>(_KfFeedbackKurzListeErmittelnResponse_QNAME, KfFeedbackKurzListeErmittelnResponse.class, null, value);
  }

  /**
   * Create an instance of {@link KfFeedbackLang }
   */
  public KfFeedbackLang createKfFeedbackLang() {
	return new KfFeedbackLang();
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link KfFeedbackLangErmittelnRequest }{@code >}}
   */
  @XmlElementDecl(namespace="http://focus.kundenfeedback.sckont.noegkk.sozvers.at/", name="kfFeedbackLangErmitteln")
  public JAXBElement<KfFeedbackLangErmittelnRequest> createKfFeedbackLangErmitteln(KfFeedbackLangErmittelnRequest value) {
	return new JAXBElement<KfFeedbackLangErmittelnRequest>(_KfFeedbackLangErmitteln_QNAME, KfFeedbackLangErmittelnRequest.class, null, value);
  }

  /**
   * Create an instance of {@link KfFeedbackLangErmittelnRequest }
   */
  public KfFeedbackLangErmittelnRequest createKfFeedbackLangErmittelnRequest() {
	return new KfFeedbackLangErmittelnRequest();
  }

  /**
   * Create an instance of {@link KfFeedbackLangErmittelnResponse }
   */
  public KfFeedbackLangErmittelnResponse createKfFeedbackLangErmittelnResponse() {
	return new KfFeedbackLangErmittelnResponse();
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link KfFeedbackLangErmittelnResponse }{@code >}}
   */
  @XmlElementDecl(namespace="http://focus.kundenfeedback.sckont.noegkk.sozvers.at/", name="kfFeedbackLangErmittelnResponse")
  public JAXBElement<KfFeedbackLangErmittelnResponse> createKfFeedbackLangErmittelnResponse(KfFeedbackLangErmittelnResponse value) {
	return new JAXBElement<KfFeedbackLangErmittelnResponse>(_KfFeedbackLangErmittelnResponse_QNAME, KfFeedbackLangErmittelnResponse.class, null, value);
  }

  /**
   * Create an instance of {@link KfFeedbackgreundeErmittelnResponse }
   */
  public KfFeedbackgreundeErmittelnResponse createKfFeedbackgreundeErmittelnResponse() {
	return new KfFeedbackgreundeErmittelnResponse();
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link KfFeedbackgruendeErmittelnRequest }{@code >}}
   */
  @XmlElementDecl(namespace="http://focus.kundenfeedback.sckont.noegkk.sozvers.at/", name="kfFeedbackgruendeErmitteln")
  public JAXBElement<KfFeedbackgruendeErmittelnRequest> createKfFeedbackgruendeErmitteln(KfFeedbackgruendeErmittelnRequest value) {
	return new JAXBElement<KfFeedbackgruendeErmittelnRequest>(_KfFeedbackgruendeErmitteln_QNAME, KfFeedbackgruendeErmittelnRequest.class, null, value);
  }

  /**
   * Create an instance of {@link KfFeedbackgruendeErmittelnRequest }
   */
  public KfFeedbackgruendeErmittelnRequest createKfFeedbackgruendeErmittelnRequest() {
	return new KfFeedbackgruendeErmittelnRequest();
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link KfFeedbackgreundeErmittelnResponse }{@code >}}
   */
  @XmlElementDecl(namespace="http://focus.kundenfeedback.sckont.noegkk.sozvers.at/", name="kfFeedbackgruendeErmittelnResponse")
  public JAXBElement<KfFeedbackgreundeErmittelnResponse> createKfFeedbackgruendeErmittelnResponse(KfFeedbackgreundeErmittelnResponse value) {
	return new JAXBElement<KfFeedbackgreundeErmittelnResponse>(_KfFeedbackgruendeErmittelnResponse_QNAME, KfFeedbackgreundeErmittelnResponse.class, null, value);
  }

  /**
   * Create an instance of {@link KfFeedbackgrund }
   */
  public KfFeedbackgrund createKfFeedbackgrund() {
	return new KfFeedbackgrund();
  }

  /**
   * Create an instance of {@link KfThema }
   */
  public KfThema createKfThema() {
	return new KfThema();
  }

  /**
   * Create an instance of {@link KfThemaFbgMap }
   */
  public KfThemaFbgMap createKfThemaFbgMap() {
	return new KfThemaFbgMap();
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link KfThemaFbgMapsErmittelnRequest }{@code >}}
   */
  @XmlElementDecl(namespace="http://focus.kundenfeedback.sckont.noegkk.sozvers.at/", name="kfThemaFbgMapsErmitteln")
  public JAXBElement<KfThemaFbgMapsErmittelnRequest> createKfThemaFbgMapsErmitteln(KfThemaFbgMapsErmittelnRequest value) {
	return new JAXBElement<KfThemaFbgMapsErmittelnRequest>(_KfThemaFbgMapsErmitteln_QNAME, KfThemaFbgMapsErmittelnRequest.class, null, value);
  }

  /**
   * Create an instance of {@link KfThemaFbgMapsErmittelnRequest }
   */
  public KfThemaFbgMapsErmittelnRequest createKfThemaFbgMapsErmittelnRequest() {
	return new KfThemaFbgMapsErmittelnRequest();
  }

  /**
   * Create an instance of {@link KfThemaFbgMapsErmittelnResponse }
   */
  public KfThemaFbgMapsErmittelnResponse createKfThemaFbgMapsErmittelnResponse() {
	return new KfThemaFbgMapsErmittelnResponse();
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link KfThemaFbgMapsErmittelnResponse }{@code >}}
   */
  @XmlElementDecl(namespace="http://focus.kundenfeedback.sckont.noegkk.sozvers.at/", name="kfThemaFbgMapsErmittelnResponse")
  public JAXBElement<KfThemaFbgMapsErmittelnResponse> createKfThemaFbgMapsErmittelnResponse(KfThemaFbgMapsErmittelnResponse value) {
	return new JAXBElement<KfThemaFbgMapsErmittelnResponse>(_KfThemaFbgMapsErmittelnResponse_QNAME, KfThemaFbgMapsErmittelnResponse.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link KfThemenErmittelnRequest }{@code >}}
   */
  @XmlElementDecl(namespace="http://focus.kundenfeedback.sckont.noegkk.sozvers.at/", name="kfThemenErmitteln")
  public JAXBElement<KfThemenErmittelnRequest> createKfThemenErmitteln(KfThemenErmittelnRequest value) {
	return new JAXBElement<KfThemenErmittelnRequest>(_KfThemenErmitteln_QNAME, KfThemenErmittelnRequest.class, null, value);
  }

  /**
   * Create an instance of {@link KfThemenErmittelnRequest }
   */
  public KfThemenErmittelnRequest createKfThemenErmittelnRequest() {
	return new KfThemenErmittelnRequest();
  }

  /**
   * Create an instance of {@link KfThemenErmittelnResponse }
   */
  public KfThemenErmittelnResponse createKfThemenErmittelnResponse() {
	return new KfThemenErmittelnResponse();
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link KfThemenErmittelnResponse }{@code >}}
   */
  @XmlElementDecl(namespace="http://focus.kundenfeedback.sckont.noegkk.sozvers.at/", name="kfThemenErmittelnResponse")
  public JAXBElement<KfThemenErmittelnResponse> createKfThemenErmittelnResponse(KfThemenErmittelnResponse value) {
	return new JAXBElement<KfThemenErmittelnResponse>(_KfThemenErmittelnResponse_QNAME, KfThemenErmittelnResponse.class, null, value);
  }

  /**
   * Create an instance of {@link KfUnterkategorie }
   */
  public KfUnterkategorie createKfUnterkategorie() {
	return new KfUnterkategorie();
  }

  /**
   * Create an instance of {@link KfUnterkategorieFbgMap }
   */
  public KfUnterkategorieFbgMap createKfUnterkategorieFbgMap() {
	return new KfUnterkategorieFbgMap();
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link KfUnterkategorieFbgMapsErmittelnRequest }{@code >}}
   */
  @XmlElementDecl(namespace="http://focus.kundenfeedback.sckont.noegkk.sozvers.at/", name="kfUnterkategorieFbgMapsErmitteln")
  public JAXBElement<KfUnterkategorieFbgMapsErmittelnRequest> createKfUnterkategorieFbgMapsErmitteln(KfUnterkategorieFbgMapsErmittelnRequest value) {
	return new JAXBElement<KfUnterkategorieFbgMapsErmittelnRequest>(_KfUnterkategorieFbgMapsErmitteln_QNAME, KfUnterkategorieFbgMapsErmittelnRequest.class, null, value);
  }

  /**
   * Create an instance of {@link KfUnterkategorieFbgMapsErmittelnRequest }
   */
  public KfUnterkategorieFbgMapsErmittelnRequest createKfUnterkategorieFbgMapsErmittelnRequest() {
	return new KfUnterkategorieFbgMapsErmittelnRequest();
  }

  /**
   * Create an instance of {@link KfUnterkategorieFbgMapsErmittelnResponse }
   */
  public KfUnterkategorieFbgMapsErmittelnResponse createKfUnterkategorieFbgMapsErmittelnResponse() {
	return new KfUnterkategorieFbgMapsErmittelnResponse();
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link KfUnterkategorieFbgMapsErmittelnResponse }{@code >}}
   */
  @XmlElementDecl(namespace="http://focus.kundenfeedback.sckont.noegkk.sozvers.at/", name="kfUnterkategorieFbgMapsErmittelnResponse")
  public JAXBElement<KfUnterkategorieFbgMapsErmittelnResponse> createKfUnterkategorieFbgMapsErmittelnResponse(KfUnterkategorieFbgMapsErmittelnResponse value) {
	return new JAXBElement<KfUnterkategorieFbgMapsErmittelnResponse>(_KfUnterkategorieFbgMapsErmittelnResponse_QNAME, KfUnterkategorieFbgMapsErmittelnResponse.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link KfUnterkategorienErmittelnRequest }{@code >}}
   */
  @XmlElementDecl(namespace="http://focus.kundenfeedback.sckont.noegkk.sozvers.at/", name="KfUnterkategorienErmitteln")
  public JAXBElement<KfUnterkategorienErmittelnRequest> createKfUnterkategorienErmitteln(KfUnterkategorienErmittelnRequest value) {
	return new JAXBElement<KfUnterkategorienErmittelnRequest>(_KfUnterkategorienErmitteln_QNAME, KfUnterkategorienErmittelnRequest.class, null, value);
  }

  /**
   * Create an instance of {@link KfUnterkategorienErmittelnRequest }
   */
  public KfUnterkategorienErmittelnRequest createKfUnterkategorienErmittelnRequest() {
	return new KfUnterkategorienErmittelnRequest();
  }

  /**
   * Create an instance of {@link KfUnterkategorienErmittelnResponse }
   */
  public KfUnterkategorienErmittelnResponse createKfUnterkategorienErmittelnResponse() {
	return new KfUnterkategorienErmittelnResponse();
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link KfUnterkategorienErmittelnResponse }{@code >}}
   */
  @XmlElementDecl(namespace="http://focus.kundenfeedback.sckont.noegkk.sozvers.at/", name="KfUnterkategorienErmittelnResponse")
  public JAXBElement<KfUnterkategorienErmittelnResponse> createKfUnterkategorienErmittelnResponse(KfUnterkategorienErmittelnResponse value) {
	return new JAXBElement<KfUnterkategorienErmittelnResponse>(_KfUnterkategorienErmittelnResponse_QNAME, KfUnterkategorienErmittelnResponse.class, null, value);
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
