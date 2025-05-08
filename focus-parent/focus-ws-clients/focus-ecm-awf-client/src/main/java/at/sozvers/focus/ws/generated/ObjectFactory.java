package at.sozvers.focus.ws.generated;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;

/**
 * This object contains factory methods for each Java content interface and Java element interface generated in the at.sozvers.focus.ws.dupegenerated package.
 * <p>An ObjectFactory allows you to programatically
 * construct new instances of the Java representation for XML content. The Java representation of XML content can consist of schema derived interfaces and classes representing the binding of schema
 * type definitions, element declarations and model groups.  Factory methods for each of these are provided in this class.
 */
@XmlRegistry
public class ObjectFactory {

  private static final QName _PartnerSuchkriterienAndOrTypEquals_QNAME    = new QName("http://awf.sozvers.at/schema/suchen", "equals");
  private static final QName _PartnerSuchkriterienAndOrTypNotEquals_QNAME = new QName("http://awf.sozvers.at/schema/suchen", "not-equals");
  private static final QName _SuchkriterienAndOrTypContains_QNAME         = new QName("http://awf.sozvers.at/schema/suchen", "contains");
  private static final QName _SuchkriterienAndOrTypEmpty_QNAME            = new QName("http://awf.sozvers.at/schema/suchen", "empty");
  private static final QName _SuchkriterienAndOrTypGreaterThanEqual_QNAME = new QName("http://awf.sozvers.at/schema/suchen", "greater-than-equal");
  private static final QName _SuchkriterienAndOrTypGreaterThan_QNAME      = new QName("http://awf.sozvers.at/schema/suchen", "greater-than");
  private static final QName _SuchkriterienAndOrTypLessThanEqual_QNAME    = new QName("http://awf.sozvers.at/schema/suchen", "less-than-equal");
  private static final QName _SuchkriterienAndOrTypLessThan_QNAME         = new QName("http://awf.sozvers.at/schema/suchen", "less-than");
  private static final QName _SuchkriterienAndOrTypNotEmpty_QNAME         = new QName("http://awf.sozvers.at/schema/suchen", "not-empty");

  /**
   * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: at.sozvers.focus.ws.dupegenerated
   */
  public ObjectFactory() {
	//Default Constructor
  }

  /**
   * Create an instance of {@link AmSuchbegriffe }
   */
  public AmSuchbegriffe createAmSuchbegriffe() {
	return new AmSuchbegriffe();
  }

  /**
   * Create an instance of {@link AmSucheingabe }
   */
  public AmSucheingabe createAmSucheingabe() {
	return new AmSucheingabe();
  }

  /**
   * Create an instance of {@link AmSuchergebnis }
   */
  public AmSuchergebnis createAmSuchergebnis() {
	return new AmSuchergebnis();
  }

  /**
   * Create an instance of {@link ArbeitsmappeTyp }
   */
  public ArbeitsmappeTyp createArbeitsmappeTyp() {
	return new ArbeitsmappeTyp();
  }

  /**
   * Create an instance of {@link ArbeitsmappenTyp }
   */
  public ArbeitsmappenTyp createArbeitsmappenTyp() {
	return new ArbeitsmappenTyp();
  }

  /**
   * Create an instance of {@link DokumentErweiterungenTyp }
   */
  public DokumentErweiterungenTyp createDokumentErweiterungenTyp() {
	return new DokumentErweiterungenTyp();
  }

  /**
   * Create an instance of {@link DokumentTyp }
   */
  public DokumentTyp createDokumentTyp() {
	return new DokumentTyp();
  }

  /**
   * Create an instance of {@link DokumenteTyp }
   */
  public DokumenteTyp createDokumenteTyp() {
	return new DokumenteTyp();
  }

  /**
   * Create an instance of {@link ErgebnisAufbereitung }
   */
  public ErgebnisAufbereitung createErgebnisAufbereitung() {
	return new ErgebnisAufbereitung();
  }

  /**
   * Create an instance of {@link FachinfoTyp }
   */
  public FachinfoTyp createFachinfoTyp() {
	return new FachinfoTyp();
  }

  /**
   * Create an instance of {@link FeldTyp }
   */
  public FeldTyp createFeldTyp() {
	return new FeldTyp();
  }

  /**
   * Create an instance of {@link GefundeneVolltexteTyp }
   */
  public GefundeneVolltexteTyp createGefundeneVolltexteTyp() {
	return new GefundeneVolltexteTyp();
  }

  /**
   * Create an instance of {@link GeschaeftsfaelleTyp }
   */
  public GeschaeftsfaelleTyp createGeschaeftsfaelleTyp() {
	return new GeschaeftsfaelleTyp();
  }

  /**
   * Create an instance of {@link GeschaeftsfallTyp }
   */
  public GeschaeftsfallTyp createGeschaeftsfallTyp() {
	return new GeschaeftsfallTyp();
  }

  /**
   * Create an instance of {@link GfSuchbegriffe }
   */
  public GfSuchbegriffe createGfSuchbegriffe() {
	return new GfSuchbegriffe();
  }

  /**
   * Create an instance of {@link GfSucheingabe }
   */
  public GfSucheingabe createGfSucheingabe() {
	return new GfSucheingabe();
  }

  /**
   * Create an instance of {@link GfSuchergebnis }
   */
  public GfSuchergebnis createGfSuchergebnis() {
	return new GfSuchergebnis();
  }

  /**
   * Create an instance of {@link MetadatenTyp }
   */
  public MetadatenTyp createMetadatenTyp() {
	return new MetadatenTyp();
  }

  /**
   * Create an instance of {@link PartnerSuchkriterienAndOrTyp }
   */
  public PartnerSuchkriterienAndOrTyp createPartnerSuchkriterienAndOrTyp() {
	return new PartnerSuchkriterienAndOrTyp();
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ZpvPartnerSuchenTyp }{@code >}
   *
   * @param value
   * 		Java instance representing xml element's value.
   *
   * @return the new instance of {@link JAXBElement }{@code <}{@link ZpvPartnerSuchenTyp }{@code >}
   */
  @XmlElementDecl(namespace="http://awf.sozvers.at/schema/suchen", name="equals", scope=PartnerSuchkriterienAndOrTyp.class)
  public JAXBElement<ZpvPartnerSuchenTyp> createPartnerSuchkriterienAndOrTypEquals(ZpvPartnerSuchenTyp value) {
	return new JAXBElement<>(_PartnerSuchkriterienAndOrTypEquals_QNAME, ZpvPartnerSuchenTyp.class, PartnerSuchkriterienAndOrTyp.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ZpvPartnerSuchenTyp }{@code >}
   *
   * @param value
   * 		Java instance representing xml element's value.
   *
   * @return the new instance of {@link JAXBElement }{@code <}{@link ZpvPartnerSuchenTyp }{@code >}
   */
  @XmlElementDecl(namespace="http://awf.sozvers.at/schema/suchen", name="not-equals", scope=PartnerSuchkriterienAndOrTyp.class)
  public JAXBElement<ZpvPartnerSuchenTyp> createPartnerSuchkriterienAndOrTypNotEquals(ZpvPartnerSuchenTyp value) {
	return new JAXBElement<>(_PartnerSuchkriterienAndOrTypNotEquals_QNAME, ZpvPartnerSuchenTyp.class, PartnerSuchkriterienAndOrTyp.class, value);
  }

  /**
   * Create an instance of {@link PartnerSuchkriterienFeldTyp }
   */
  public PartnerSuchkriterienFeldTyp createPartnerSuchkriterienFeldTyp() {
	return new PartnerSuchkriterienFeldTyp();
  }

  /**
   * Create an instance of {@link PartnerSuchkriterienTyp }
   */
  public PartnerSuchkriterienTyp createPartnerSuchkriterienTyp() {
	return new PartnerSuchkriterienTyp();
  }

  /**
   * Create an instance of {@link Suchbegriffe }
   */
  public Suchbegriffe createSuchbegriffe() {
	return new Suchbegriffe();
  }

  /**
   * Create an instance of {@link Sucheingabe }
   */
  public Sucheingabe createSucheingabe() {
	return new Sucheingabe();
  }

  /**
   * Create an instance of {@link Suchergebnis }
   */
  public Suchergebnis createSuchergebnis() {
	return new Suchergebnis();
  }

  /**
   * Create an instance of {@link SuchkriterienAndOrTyp }
   */
  public SuchkriterienAndOrTyp createSuchkriterienAndOrTyp() {
	return new SuchkriterienAndOrTyp();
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
   *
   * @param value
   * 		Java instance representing xml element's value.
   *
   * @return the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  @XmlElementDecl(namespace="http://awf.sozvers.at/schema/suchen", name="contains", scope=SuchkriterienAndOrTyp.class)
  public JAXBElement<String> createSuchkriterienAndOrTypContains(String value) {
	return new JAXBElement<>(_SuchkriterienAndOrTypContains_QNAME, String.class, SuchkriterienAndOrTyp.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
   *
   * @param value
   * 		Java instance representing xml element's value.
   *
   * @return the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
   */
  @XmlElementDecl(namespace="http://awf.sozvers.at/schema/suchen", name="empty", scope=SuchkriterienAndOrTyp.class)
  public JAXBElement<Object> createSuchkriterienAndOrTypEmpty(Object value) {
	return new JAXBElement<>(_SuchkriterienAndOrTypEmpty_QNAME, Object.class, SuchkriterienAndOrTyp.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
   *
   * @param value
   * 		Java instance representing xml element's value.
   *
   * @return the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  @XmlElementDecl(namespace="http://awf.sozvers.at/schema/suchen", name="equals", scope=SuchkriterienAndOrTyp.class)
  public JAXBElement<String> createSuchkriterienAndOrTypEquals(String value) {
	return new JAXBElement<>(_PartnerSuchkriterienAndOrTypEquals_QNAME, String.class, SuchkriterienAndOrTyp.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
   *
   * @param value
   * 		Java instance representing xml element's value.
   *
   * @return the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  @XmlElementDecl(namespace="http://awf.sozvers.at/schema/suchen", name="greater-than", scope=SuchkriterienAndOrTyp.class)
  public JAXBElement<String> createSuchkriterienAndOrTypGreaterThan(String value) {
	return new JAXBElement<>(_SuchkriterienAndOrTypGreaterThan_QNAME, String.class, SuchkriterienAndOrTyp.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
   *
   * @param value
   * 		Java instance representing xml element's value.
   *
   * @return the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  @XmlElementDecl(namespace="http://awf.sozvers.at/schema/suchen", name="greater-than-equal", scope=SuchkriterienAndOrTyp.class)
  public JAXBElement<String> createSuchkriterienAndOrTypGreaterThanEqual(String value) {
	return new JAXBElement<>(_SuchkriterienAndOrTypGreaterThanEqual_QNAME, String.class, SuchkriterienAndOrTyp.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
   *
   * @param value
   * 		Java instance representing xml element's value.
   *
   * @return the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  @XmlElementDecl(namespace="http://awf.sozvers.at/schema/suchen", name="less-than", scope=SuchkriterienAndOrTyp.class)
  public JAXBElement<String> createSuchkriterienAndOrTypLessThan(String value) {
	return new JAXBElement<>(_SuchkriterienAndOrTypLessThan_QNAME, String.class, SuchkriterienAndOrTyp.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
   *
   * @param value
   * 		Java instance representing xml element's value.
   *
   * @return the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  @XmlElementDecl(namespace="http://awf.sozvers.at/schema/suchen", name="less-than-equal", scope=SuchkriterienAndOrTyp.class)
  public JAXBElement<String> createSuchkriterienAndOrTypLessThanEqual(String value) {
	return new JAXBElement<>(_SuchkriterienAndOrTypLessThanEqual_QNAME, String.class, SuchkriterienAndOrTyp.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
   *
   * @param value
   * 		Java instance representing xml element's value.
   *
   * @return the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
   */
  @XmlElementDecl(namespace="http://awf.sozvers.at/schema/suchen", name="not-empty", scope=SuchkriterienAndOrTyp.class)
  public JAXBElement<Object> createSuchkriterienAndOrTypNotEmpty(Object value) {
	return new JAXBElement<>(_SuchkriterienAndOrTypNotEmpty_QNAME, Object.class, SuchkriterienAndOrTyp.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
   *
   * @param value
   * 		Java instance representing xml element's value.
   *
   * @return the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  @XmlElementDecl(namespace="http://awf.sozvers.at/schema/suchen", name="not-equals", scope=SuchkriterienAndOrTyp.class)
  public JAXBElement<String> createSuchkriterienAndOrTypNotEquals(String value) {
	return new JAXBElement<>(_PartnerSuchkriterienAndOrTypNotEquals_QNAME, String.class, SuchkriterienAndOrTyp.class, value);
  }

  /**
   * Create an instance of {@link SuchkriterienFeldTyp }
   */
  public SuchkriterienFeldTyp createSuchkriterienFeldTyp() {
	return new SuchkriterienFeldTyp();
  }

  /**
   * Create an instance of {@link SuchkriterienTyp }
   */
  public SuchkriterienTyp createSuchkriterienTyp() {
	return new SuchkriterienTyp();
  }

  /**
   * Create an instance of {@link ZpvPartnerSuchen }
   */
  public ZpvPartnerSuchen createZpvPartnerSuchen() {
	return new ZpvPartnerSuchen();
  }

  /**
   * Create an instance of {@link ZpvPartnerSuchenTyp }
   */
  public ZpvPartnerSuchenTyp createZpvPartnerSuchenTyp() {
	return new ZpvPartnerSuchenTyp();
  }
}
