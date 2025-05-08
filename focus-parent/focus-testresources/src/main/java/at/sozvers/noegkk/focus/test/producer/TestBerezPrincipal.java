package at.sozvers.noegkk.focus.test.producer;

import java.util.stream.Stream;
import at.itsv.berez.principal.BerezPrincipal;
import jakarta.enterprise.context.Dependent;

@Dependent
public class TestBerezPrincipal implements BerezPrincipal {

  @Override
  public String eindeutigerBenutzername() {
	return "12FOCUS";
  }

  @Override
  public String benutzername() {
	return "12FOCUS";
  }

  @Override
  public Stream<Rolle> rollen() {
	return Stream.of(new RolleTest());
  }

  @Override
  public Stream<ServiceFunktion> serviceFunktionen() {
	return Stream.of(new ServiceFunktionTest());
  }

  @Override
  public Stream<Organisationseinheit> organisationseinheiten() {
	return Stream.of(new OrganisationseinheitTest());
  }

  @Override
  public Traeger traeger() {
	return new TraegerTest();
  }

  @Override
  public Person person() {
	return new PersonTest();
  }

  public static class OrganisationseinheitTest implements Organisationseinheit {

	@Override
	public String name() {
	  return "ORGIT";
	}

	@Override
	public Stream<Rolle> vergebeneRollen() {
	  return Stream.of(new RolleTest());
	}
  }

  public static class PersonTest implements Person {

	@Override
	public String name() {
	  return "Max Mustermann";
	}

	@Override
	public String eingetrageneVornameDaten() {
	  return "Max";
	}

	@Override
	public String eingetrageneNachnameDaten() {
	  return "Mustermann";
	}
  }

  public static class RolleTest implements Rolle {

	@Override
	public String applikationsCode() {
	  return "FOCUS360";
	}

	@Override
	public String code() {
	  return "LOGIN";
	}
  }

  public static class ServiceFunktionTest implements ServiceFunktion {

	@Override
	public String applikationsCode() {
	  return "FOCUS360";
	}

	@Override
	public String serviceCode() {
	  return "SERVICE";
	}

	@Override
	public String code() {
	  return "CODE";
	}
  }

  public static class TraegerTest implements Traeger {

	@Override
	public String code() {
	  return "12";
	}

	@Override
	public String name() {
	  return "NOEGKK";
	}
  }
}
