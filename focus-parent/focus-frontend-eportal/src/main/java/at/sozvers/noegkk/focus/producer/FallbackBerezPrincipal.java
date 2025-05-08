package at.sozvers.noegkk.focus.producer;

import java.util.stream.Stream;
import at.itsv.berez.principal.BerezPrincipal;
import jakarta.enterprise.inject.Vetoed;

@Vetoed
public class FallbackBerezPrincipal implements BerezPrincipal {

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
	return Stream.of(new FallbackRolle());
  }

  @Override
  public Stream<ServiceFunktion> serviceFunktionen() {
	return Stream.of(new FallbackServiceFunktion());
  }

  @Override
  public Stream<Organisationseinheit> organisationseinheiten() {
	return Stream.of(new FallbackOrganisationseinheit());
  }

  @Override
  public Traeger traeger() {
	return new FallbackTraeger();
  }

  @Override
  public Person person() {
	return new FallbackPerson();
  }

  public static class FallbackOrganisationseinheit implements Organisationseinheit {

	@Override
	public String name() {
	  return "ORGIT";
	}

	@Override
	public Stream<Rolle> vergebeneRollen() {
	  return Stream.of(new FallbackRolle());
	}
  }

  public static class FallbackPerson implements Person {

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

  public static class FallbackRolle implements Rolle {

	@Override
	public String applikationsCode() {
	  return "FOCUS360";
	}

	@Override
	public String code() {
	  return "ADMIVERW";
	}
  }

  public static class FallbackServiceFunktion implements ServiceFunktion {

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

  public static class FallbackTraeger implements Traeger {

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
