package at.sozvers.noegkk.focus.service.ecm.geschaeftsfall;

import java.util.List;
import at.itsv.berez.principal.BerezPrincipal;
import at.itsv.noegkk.commons.RequestHeadersCommons;
import at.sozvers.focus.ws.client.*;
import at.sozvers.focus.ws.client.factory.SucheingabeRequestFactory;
import at.sozvers.focus.ws.generated.Sucheingabe;
import at.sozvers.noegkk.focus.test.producer.BerezPrincipalTestProducer;
import jakarta.ws.rs.core.Response;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.spy;

@ExtendWith(MockitoExtension.class)
class DokumentSuchenRestClientIT {

  private static final String BENUTZERKREIS      = "B";
  private static final String ENDPOINT           = "https://ecmservicesitu.sozvers.at";
  private static final String PASSWORD           = "rfCiqURYaadLXUzP2z2nkXD7u";
  private static final String SYSTEMMODUS        = "T";
  private static final String USERNAME           = "12FOCUS";
  private static final String VERARBEITUNGSMODUS = "O";
  @Spy
  BerezPrincipal berezPrincipal;
  SucheingabeRequestFactory sucheingabeRequestFactory = new SucheingabeRequestFactory();
  @Mock
  private RequestHeadersCommons      requestHeadersCommons;
  private DokumentSuchenRestClient   testedObject;
  private DokumentAnzeigenRestClient testedObject2;

  @BeforeEach
  public void before() {
	MockitoAnnotations.initMocks(this);

	Mockito.when(requestHeadersCommons.getTransactionUUID()).thenReturn("A4I83NJDOI879GSO");
	Mockito.when(requestHeadersCommons.getOrgeinheitId()).thenReturn("ORGIT");
	Mockito.when(requestHeadersCommons.getBearbeiterID()).thenReturn("12FOCUS");

	berezPrincipal = BerezPrincipalTestProducer.berePrincipal();

	if(testedObject == null) {
	  testedObject = newInstanceSuchen();
	}
	if(testedObject2 == null) {
	  testedObject2 = newInstanceAnzeigen();
	}
  }

  public DokumentSuchenRestClient newInstanceSuchen() {
	DokumentSuchenRestClient client = spy(DokumentSuchenRestClient.class);
	client.setEndpoint(ENDPOINT);
	client.setUsername(USERNAME);
	client.setPassword(PASSWORD);
	client.setSystemmodus(SYSTEMMODUS);
	client.setBenutzerkreis(BENUTZERKREIS);
	client.setVerarbeitungsmodus(VERARBEITUNGSMODUS);
	return client;
  }

  public DokumentAnzeigenRestClient newInstanceAnzeigen() {
	DokumentAnzeigenRestClient client = spy(DokumentAnzeigenRestClient.class);
	client.setEndpoint(ENDPOINT);
	client.setUsername(USERNAME);
	client.setPassword(PASSWORD);
	client.setSystemmodus(SYSTEMMODUS);
	client.setBenutzerkreis(BENUTZERKREIS);
	client.setVerarbeitungsmodus(VERARBEITUNGSMODUS);
	return client;
  }

  //  @Test
  @Disabled
  void dokumentAnzeigen_Success() {
	Response response = testedObject2.dokumentAnzeigen("7209d1bbb8fc45f8a3bd76bd70f4ebea", new ECMAWFHeader(requestHeadersCommons));
	assertThat(response).isNotNull();
	Assertions.assertEquals(200, response.getStatus());
  }

  // @Test
  @Disabled
  // QDASH-558 - Es fehlen für die Variable X-AWF-Benutzername im ECMAWFHeader die Freischaltungen der User
  void dokumentSuchen_Success() {
	List<Sucheingabe> sucheingabeList = sucheingabeRequestFactory.allRequestsAsList(1340812L);

	for(Sucheingabe sucheingabe : sucheingabeList) {
	  sucheingabe.getSuchbegriffe().getPartnerSuchkriterien().getFeld().get(0).getOr().getEqualsOrNotEquals().remove(1);
	  Response response = testedObject.dokumentSuchen(sucheingabe, new ECMAWFHeader(requestHeadersCommons));

	  assertThat(response).isNotNull();
	  Assertions.assertEquals(200, response.getStatus());
	}
  }
}
