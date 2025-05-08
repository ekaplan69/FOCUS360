package at.sozvers.kva.schema.ermittle_krankenversicherungsanspruch;

import jakarta.xml.bind.annotation.XmlRegistry;

/**
 * This object contains factory methods for each Java content interface and Java element interface generated in the at.sozvers.kva.schema.ermittle_krankenversicherungsanspruch package.
 * <p>An ObjectFactory allows you to programatically
 * construct new instances of the Java representation for XML content. The Java representation of XML content can consist of schema derived interfaces and classes representing the binding of schema
 * type definitions, element declarations and model groups.  Factory methods for each of these are provided in this class.
 */
@XmlRegistry
public class ObjectFactory {

  /**
   * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: at.sozvers.kva.schema.ermittle_krankenversicherungsanspruch
   */
  public ObjectFactory() {
  }

  /**
   * Create an instance of {@link ErmittelterKrankenversicherungsanspruch }
   */
  public ErmittelterKrankenversicherungsanspruch createErmittelterKrankenversicherungsanspruch() {
	return new ErmittelterKrankenversicherungsanspruch();
  }

  /**
   * Create an instance of {@link Gebuehrenbefreiung }
   */
  public Gebuehrenbefreiung createGebuehrenbefreiung() {
	return new Gebuehrenbefreiung();
  }

  /**
   * Create an instance of {@link Krankenversicherungsanspruch }
   */
  public Krankenversicherungsanspruch createKrankenversicherungsanspruch() {
	return new Krankenversicherungsanspruch();
  }

  /**
   * Create an instance of {@link KrankenversicherungsanspruchErmittlung }
   */
  public KrankenversicherungsanspruchErmittlung createKrankenversicherungsanspruchErmittlung() {
	return new KrankenversicherungsanspruchErmittlung();
  }
}
