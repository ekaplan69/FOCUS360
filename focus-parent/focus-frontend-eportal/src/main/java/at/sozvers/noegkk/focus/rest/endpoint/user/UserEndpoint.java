package at.sozvers.noegkk.focus.rest.endpoint.user;

import java.util.*;
import java.util.stream.Collectors;
import at.itsv.berez.principal.BerezPrincipal;
import at.itsv.berez.principal.BerezPrincipal.Rolle;
import at.sozvers.noegkk.focus.interceptors.ExceptionMeldungsMapper;
import at.sozvers.noegkk.focus.rest.api.user.User;
import at.sozvers.noegkk.focus.rest.api.user.UserInfo;
import at.sozvers.noegkk.focus.service.api.kontaktneu.*;
import at.sozvers.noegkk.focus.service.kontaktneu.KontaktNeuService;
import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;

import static at.sozvers.noegkk.focus.rest.endpoint.constants.RestPaths.APPLICATION_JSON_CHARSET_UTF_8;
import static at.sozvers.noegkk.focus.rest.endpoint.constants.RestPaths.USER_ENDPOINT;
import static java.nio.charset.StandardCharsets.ISO_8859_1;
import static java.nio.charset.StandardCharsets.UTF_8;

/**
 * @author BrunneRe
 */
@ExceptionMeldungsMapper
@Dependent
@Path(USER_ENDPOINT)
public class UserEndpoint implements User {

  @Inject
  KontaktNeuService kontaktNeuService;
  @Inject
  private BerezPrincipal berePrincipal;

  @GET
  @Produces(APPLICATION_JSON_CHARSET_UTF_8)
  public UserInfo getUserInfo() {
	UserInfo user = new UserInfo(Optional.ofNullable(berePrincipal.benutzername()).orElse(null),
								 Optional.ofNullable(berePrincipal.person()).map(BerezPrincipal.Person::eingetrageneVornameDaten).orElse(null),
								 Optional.ofNullable(berePrincipal.person()).map(BerezPrincipal.Person::eingetrageneNachnameDaten).orElse(null),
								 Optional.of(berePrincipal.traeger()).map(BerezPrincipal.Traeger::code).orElse(null), Optional.ofNullable(berePrincipal.organisationseinheiten())
																															  .map(organisationseinheiten -> organisationseinheiten.map(
																																	  organisationseinheit -> convertToUTF8(
																																			  organisationseinheit.name())).toList()).orElse(null),
								 Optional.ofNullable(berePrincipal.rollen()).map(rollen -> rollen.map(Rolle::name).toList()).orElse(null), Collections.emptyList());
	List<String> oes   = new ArrayList<>();
	List<String> aufgg = new ArrayList<>();
	oes.addAll(kontaktNeuService.leseGueltigeOesWithoutHeader(berePrincipal.benutzername(), getFocusRollen(user.getRollen())).stream().map(GueltigeOeBTO::getBere_org).toList());
	if(!user.getRollen().contains("FOCUS360.ADMIVERW") && !user.getRollen().contains("FOCUS360.KONTVERW")) {
	  oes.add("Ohne Organisationseinheit");
	}
	try {
	  List<KontaktAufgabengebietBTO> list = kontaktNeuService.searchAufgabengebieteWithoutHeader(berePrincipal.benutzername(), Long.parseLong(berePrincipal.benutzername().substring(0, 2)));
	  aufgg.addAll(list.stream().filter(n -> n.getSubAufgabengebietJN().equals('N')).map(KontaktAufgabengebietBTO::getAufgabengebietBezeichnung).toList());
	} catch(NumberFormatException nfe) {
	  //Just catch Error
	}
	user.setAufgabengebiete(aufgg);
	user.setOrganisationseinheiten(oes);

	List<String>          offeneKontakte     = new ArrayList<>();
	List<KontaktBasicBTO> offeneKontakteFull = kontaktNeuService.searchOffeneKontakte(berePrincipal.benutzername());
	if(!offeneKontakteFull.isEmpty()) {
	  KontaktBTO kontakt;
	  for(int i = 0; i < offeneKontakteFull.size(); i++) {
		kontakt = kontaktNeuService.searchKontaktWithoutHeader(offeneKontakteFull.get(i).getId());
		String offenerKontakt = kontakt.getFachschluessel() + ";" + offeneKontakteFull.get(i).getId().toString() + ";" + offeneKontakteFull.get(i).getAufgabengebiet();
		offeneKontakte.add(offenerKontakt);
	  }
	}
	user.setOffeneKontakte(offeneKontakte);
	return user;
  }

  private String convertToUTF8(String name) {
	return new String(name.getBytes(ISO_8859_1), UTF_8);
  }

  private List<String> getFocusRollen(List<String> alleUserRollen) {
	List<String> focusRollen = alleUserRollen.stream().filter(s -> s.startsWith("FOCUS360")).collect(Collectors.toList());
	focusRollen.replaceAll(s -> s.replace("FOCUS360.", ""));
	return focusRollen;
  }
}
