package at.sozvers.noegkk.focus.rest;

import java.util.HashSet;
import java.util.Set;
import at.sozvers.noegkk.focus.rest.endpoint.beschwerde.BeschwerdeEndpoint;
import at.sozvers.noegkk.focus.rest.endpoint.dienstgeber.DienstgeberEndpoint;
import at.sozvers.noegkk.focus.rest.endpoint.dsgvo.DSGVOEndpoint;
import at.sozvers.noegkk.focus.rest.endpoint.ecarddaten.ECardEndpoint;
import at.sozvers.noegkk.focus.rest.endpoint.ecmawf.DokumenteEndpoint;
import at.sozvers.noegkk.focus.rest.endpoint.kontaktneu.KontaktNeuEndpoint;
import at.sozvers.noegkk.focus.rest.endpoint.kundenfeedback.KundenfeedbackEndpoint;
import at.sozvers.noegkk.focus.rest.endpoint.kva.abzsuc.AbzsucEndpoint;
import at.sozvers.noegkk.focus.rest.endpoint.kva.gbfsuc.GebuehrenbefreiungEndpoint;
import at.sozvers.noegkk.focus.rest.endpoint.kva.kvkerm.KvkermEndpoint;
import at.sozvers.noegkk.focus.rest.endpoint.leistungen.LeistungenEndpoint;
import at.sozvers.noegkk.focus.rest.endpoint.notiz.NotizEndpoint;
import at.sozvers.noegkk.focus.rest.endpoint.patchnotes.PatchnotesEndpoint;
import at.sozvers.noegkk.focus.rest.endpoint.person.PersonEndpoint;
import at.sozvers.noegkk.focus.rest.endpoint.system.SystemEndpoint;
import at.sozvers.noegkk.focus.rest.endpoint.user.UserEndpoint;
import at.sozvers.noegkk.focus.rest.endpoint.versicherungszeit.VersicherungszeitEndpoint;
import at.sozvers.noegkk.focus.rest.zup.ZUPEndpoint;
import jakarta.enterprise.context.Dependent;
import jakarta.ws.rs.core.Application;

@Dependent
public class FocusRestApplication extends Application {

  @Override
  public final Set<Class<?>> getClasses() {
	HashSet<Class<?>> set = new HashSet<>();

	// focus implementations
	registerServices(set);

	// featues (provider)
	registerFeatures(set);

	// filters(interceptors)
	registerFilters();

	return set;
  }

  private void registerServices(HashSet<Class<?>> set) {
	set.add(PersonEndpoint.class);
	set.add(UserEndpoint.class);
	set.add(VersicherungszeitEndpoint.class);
	set.add(AbzsucEndpoint.class);
	set.add(GebuehrenbefreiungEndpoint.class);
	set.add(NotizEndpoint.class);
	set.add(ECardEndpoint.class);
	set.add(KontaktNeuEndpoint.class);
	set.add(KundenfeedbackEndpoint.class);
	set.add(ZUPEndpoint.class);
	set.add(BeschwerdeEndpoint.class);
	set.add(LeistungenEndpoint.class);
	set.add(PatchnotesEndpoint.class);
	set.add(SystemEndpoint.class);
	set.add(DienstgeberEndpoint.class);
	set.add(DSGVOEndpoint.class);
	set.add(DokumenteEndpoint.class);
	set.add(KvkermEndpoint.class);
  }

  private void registerFeatures(HashSet<Class<?>> set) {
	set.add(CorsFeature.class);
	set.add(ValidationExceptionMapper.class);
  }

  private void registerFilters() {
	//Not yet implemented
  }
}
