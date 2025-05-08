package at.sozvers.noegkk.focus.ws.client.kva.abzsuc;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collections;
import java.util.Map;
import at.itsv.noegkk.commons.RequestHeadersCommons;
import at.itsv.security.servicesecurity.client.SecuredServiceClient;
import at.sozvers.kva.definitions.angehoerigenbeziehung.suchen.AngehoerigenbeziehungenSuchenService;
import at.sozvers.kva.schema.angehoerigenbeziehung.suchen.AngehoerigenBeziehungErmittelnRequest;
import at.sozvers.kva.schema.angehoerigenbeziehung.suchen.AngehoerigenBeziehungErmittelnResponse;
import jakarta.enterprise.context.Dependent;
import jakarta.xml.ws.BindingProvider;
import jakarta.xml.ws.handler.MessageContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Dependent
public class KvaAbzsucClient {

  private static final Logger LOG = LoggerFactory.getLogger(KvaAbzsucClient.class);
  private              String berechtigungssystemid;
  private              String password;
  private              String primaersystemid;
  private              String quellsystemid;
  private              String systemmodus;
  private              String username;
  private              String verarbeitungsmodus;
  private              String wsUrl;

  public KvaAbzsucClient() {

  }

  public KvaAbzsucClient(String wsUrl, String verarbeitungsmodus, String systemmodus, String username, String password, String quellsystem, String berechtigungssystem, String primaersystem) {
	this.wsUrl = wsUrl;
	this.verarbeitungsmodus = verarbeitungsmodus;
	this.systemmodus = systemmodus;
	this.username = username;
	this.password = password;
	this.quellsystemid = quellsystem;
	this.berechtigungssystemid = berechtigungssystem;
	this.primaersystemid = primaersystem;
  }

  public AngehoerigenBeziehungErmittelnResponse sucheAngehoerige_2_0(AngehoerigenBeziehungErmittelnRequest input, RequestHeadersCommons requestHeadersCommons) throws MalformedURLException {
	URL       wsdlURL = KvaAbzsucClient.class.getResource("/wsdl/AngehoerigenBeziehungSuchen.wsdl");
	final var client  = new AngehoerigenbeziehungenSuchenService(wsdlURL).getAngehoerigenBeziehungSuchenPort();

	SecuredServiceClient.createForService(client).withCredentials(username, password).withTimestamp().apply();

	addEndpoint(client, "/KVAWS/abzsuc/2_0/AngehoerigenBeziehungSuchen");

	((BindingProvider) client).getRequestContext().put(MessageContext.HTTP_REQUEST_HEADERS,
													   Map.of("KVA-SVSTD11-RQ-QUELL-APPLIKATIONS-ID", Collections.singletonList("FOCUS360"), "KVA-SVSTD11-RQ-QUELL-SYSTEM-ID",
															  Collections.singletonList(quellsystemid), "KVA-SVSTD11-RQ-ZIEL-SYSTEM-MODUS", Collections.singletonList(systemmodus),
															  "KVA-SVSTD11-RQ-CTX-TRANSAKTION-ID", Collections.singletonList(requestHeadersCommons.getTransactionUUID()),
															  "KVA-SVSTD11-RQ-CTX-VERARBEITUNGS-MODUS", Collections.singletonList(verarbeitungsmodus), "KVA-SVSTD11-RQ-CTX-PRIMARE-SYSTEM-ID",
															  Collections.singletonList(primaersystemid), "KVA-SVSTD11-RQ-CTX-BEARBEITER-ID",
															  Collections.singletonList(requestHeadersCommons.getBearbeiterID()), "KVA-SVSTD11-RQ-CTX-BEARBEITER-BERECHTIGUNGSSYSTEM",
															  Collections.singletonList(berechtigungssystemid), "KVA-SVSTD11-RQ-CTX-BEARBEITER-MELDENDE-STELLE",
															  Collections.singletonList(requestHeadersCommons.getMeldendeStelle()), "KVA-SVSTD11-RQ-CTX-BEARBEITUNGSGRUND",
															  Collections.singletonList("FOCUS360")));

	return client.sucheAngehoerige(input);
  }

  private void addEndpoint(Object obj, String endpoint) {
	LOG.info(wsUrl);
	((BindingProvider) obj).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, wsUrl + endpoint);
  }

  public AngehoerigenBeziehungErmittelnResponse sucheVersicherte_2_0(AngehoerigenBeziehungErmittelnRequest input, RequestHeadersCommons requestHeadersCommons) throws MalformedURLException {
	URL       wsdlURL = KvaAbzsucClient.class.getResource("/wsdl/AngehoerigenBeziehungSuchen.wsdl");
	final var client  = new AngehoerigenbeziehungenSuchenService(wsdlURL).getAngehoerigenBeziehungSuchenPort();

	SecuredServiceClient.createForService(client).withCredentials(username, password).withTimestamp().apply();

	addEndpoint(client, "/KVAWS/abzsuc/2_0/AngehoerigenBeziehungSuchen");

	((BindingProvider) client).getRequestContext().put(MessageContext.HTTP_REQUEST_HEADERS,
													   Map.of("KVA-SVSTD11-RQ-QUELL-APPLIKATIONS-ID", Collections.singletonList("FOCUS360"), "KVA-SVSTD11-RQ-QUELL-SYSTEM-ID",
															  Collections.singletonList(quellsystemid), "KVA-SVSTD11-RQ-ZIEL-SYSTEM-MODUS", Collections.singletonList(systemmodus),
															  "KVA-SVSTD11-RQ-CTX-TRANSAKTION-ID", Collections.singletonList(requestHeadersCommons.getTransactionUUID()),
															  "KVA-SVSTD11-RQ-CTX-VERARBEITUNGS-MODUS", Collections.singletonList(verarbeitungsmodus), "KVA-SVSTD11-RQ-CTX-PRIMARE-SYSTEM-ID",
															  Collections.singletonList(primaersystemid), "KVA-SVSTD11-RQ-CTX-BEARBEITER-ID",
															  Collections.singletonList(requestHeadersCommons.getBearbeiterID()), "KVA-SVSTD11-RQ-CTX-BEARBEITER-BERECHTIGUNGSSYSTEM",
															  Collections.singletonList(berechtigungssystemid), "KVA-SVSTD11-RQ-CTX-BEARBEITER-MELDENDE-STELLE",
															  Collections.singletonList(requestHeadersCommons.getMeldendeStelle()), "KVA-SVSTD11-RQ-CTX-BEARBEITUNGSGRUND",
															  Collections.singletonList("FOCUS360")));

	return client.sucheVersicherte(input);
  }
}
