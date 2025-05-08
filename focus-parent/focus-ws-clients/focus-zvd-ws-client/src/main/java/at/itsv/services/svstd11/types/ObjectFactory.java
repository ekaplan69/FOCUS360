package at.itsv.services.svstd11.types;

import jakarta.xml.bind.annotation.XmlRegistry;

/**
 * This object contains factory methods for each Java content interface and Java element interface generated in the at.itsv.services.svstd11.types package.
 * <p>An ObjectFactory allows you to programatically
 * construct new instances of the Java representation for XML content. The Java representation of XML content can consist of schema derived interfaces and classes representing the binding of schema
 * type definitions, element declarations and model groups.  Factory methods for each of these are provided in this class.
 */
@XmlRegistry
public class ObjectFactory {

  /**
   * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: at.itsv.services.svstd11.types
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
   * Create an instance of {@link RequestKontext }
   */
  public RequestKontext createRequestKontext() {
	return new RequestKontext();
  }

  /**
   * Create an instance of {@link ResponseKontext }
   */
  public ResponseKontext createResponseKontext() {
	return new ResponseKontext();
  }

  /**
   * Create an instance of {@link ReturnInfo }
   */
  public ReturnInfo createReturnInfo() {
	return new ReturnInfo();
  }

  /**
   * Create an instance of {@link StandardRequestHeader }
   */
  public StandardRequestHeader createStandardRequestHeader() {
	return new StandardRequestHeader();
  }

  /**
   * Create an instance of {@link ZielSystem }
   */
  public ZielSystem createZielSystem() {
	return new ZielSystem();
  }
}
