package at.sozvers.focus.ws.client;

import java.util.Base64;
import jakarta.annotation.Resource;
import jakarta.ws.rs.client.*;
import jakarta.ws.rs.core.*;

public abstract class ECMAWFAbstractRestClient<T> {

  protected static final String AUTH_TYPE              = "basic";
  protected static final String ECM_BENUTZERKREIS      = "java:global/at/sozvers/noegkk/focus/awf/zup/benutzerkreis";
  protected static final String ECM_ENDPOINT           = "java:global/at/sozvers/noegkk/focus/ecmawf/URL";
  protected static final String ECM_PASSWORD           = "java:global/at/sozvers/noegkk/focus/ecmawf/wssecurity/password";
  protected static final String ECM_SYSTEMMODUS        = "java:global/at/sozvers/noegkk/focus/ecmawf/SYSTEMMODUS";
  protected static final String ECM_USERNAME           = "java:global/at/sozvers/noegkk/focus/ecmawf/wssecurity/username";
  protected static final String ECM_VERARBEITUNGSMODUS = "java:global/at/sozvers/noegkk/focus/ecmawf/VERARBEITUNGSMODUS";
  protected static final String REALM                  = "ECMAWF";
  @Resource(lookup=ECM_BENUTZERKREIS)
  String benutzerkreis;
  @Resource(lookup=ECM_ENDPOINT)
  String endpoint;
  @Resource(lookup=ECM_PASSWORD)
  String password;

  @Resource(lookup=ECM_SYSTEMMODUS)
  String systemmodus;
  @Resource(lookup=ECM_USERNAME)
  String username;
  @Resource(lookup=ECM_VERARBEITUNGSMODUS)
  String verarbeitungsmodus;

  protected Response doPost(T metadaten, String requestPath, ECMAWFHeader header) {
	if(header == null) {
	  throw new IllegalArgumentException("Header cannot be null!");
	}
	header.setSystemmodus(systemmodus);
	header.setVerarbeitungsmodus(verarbeitungsmodus);
	header.setBenutzerkreis(benutzerkreis);
	requestPath = String.format(requestPath, header.getTraeger());

	return prepareRequest(requestPath, header).post(Entity.entity(metadaten, MediaType.APPLICATION_XML_TYPE));
  }

  private Invocation.Builder prepareRequest(String requestPath, ECMAWFHeader header) {
	WebTarget                      target  = createRestWebTarget(requestPath);
	MultivaluedMap<String, Object> headers = header.generateHeaders();
	return target.request().headers(headers).accept(MediaType.APPLICATION_XML);
  }

  public WebTarget createRestWebTarget(String path) {
	// Create the Client
	Client client = ClientBuilder.newBuilder().register((ClientRequestFilter) requestContext -> {
	  // Generate the Base64-encoded credentials
	  String credentials        = username + ":" + password;
	  String encodedCredentials = Base64.getEncoder().encodeToString(credentials.getBytes());

	  // Set the Authorization header
	  MultivaluedMap<String, Object> headers = requestContext.getHeaders();
	  headers.add("Authorization", "Basic " + encodedCredentials);
	}).build();

	// Build and return the WebTarget
	return client.target(endpoint).path(path);
  }

  public String getBenutzerkreis() {
	return benutzerkreis;
  }

  public void setBenutzerkreis(String benutzerkreis) {
	this.benutzerkreis = benutzerkreis;
  }

  public String getEndpoint() {
	return endpoint;
  }

  public void setEndpoint(String endpoint) {
	this.endpoint = endpoint;
  }

  public String getPassword() {
	return password;
  }

  public void setPassword(String password) {
	this.password = password;
  }

  public String getSystemmodus() {
	return systemmodus;
  }

  public void setSystemmodus(String systemmodus) {
	this.systemmodus = systemmodus;
  }

  public String getUsername() {
	return username;
  }

  public void setUsername(String username) {
	this.username = username;
  }

  public String getVerarbeitungsmodus() {
	return verarbeitungsmodus;
  }

  public void setVerarbeitungsmodus(String verarbeitungsmodus) {
	this.verarbeitungsmodus = verarbeitungsmodus;
  }
}
