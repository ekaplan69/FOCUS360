package at.sozvers.noegkk.focus.rest.endpoint.leistungen.dokumentlesen;

import at.sozvers.noegkk.dda.util.DDADefaultConfig;
import jakarta.annotation.Priority;
import jakarta.annotation.Resource;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Alternative;
import jakarta.interceptor.Interceptor;

@ApplicationScoped
@Alternative
@Priority(Interceptor.Priority.APPLICATION + 10)
public class DDAConfigProducer extends DDADefaultConfig {
  @Resource(lookup="java:global/at/sozvers/noegkk/focus/lgk/dokument/password")
  private static String password;
  @Resource(lookup="java:global/at/sozvers/noegkk/focus/lgk/dokument/QUELLSYSTEMID")
  private        String QUELLSYSTEMID;
  @Resource(lookup="java:global/at/sozvers/noegkk/focus/lgk/dokument/URL")
  private        String host;
  @Resource(lookup="java:global/at/sozvers/noegkk/focus/lgk/dokument/username")
  private        String username;

  @Override
  public String getHost() {
	return host;
  }

  @Override
  public String getProdukt() {
	return "FOCUS360";
  }

  @Override
  public String getMandant() {
	return "1X";
  }

  @Override
  public String getUsername() {
	return username;
  }

  @Override
  public String getPassword() {
	return password;
  }

  @Override
  public Integer getTimeout() {
	return Integer.valueOf("20000");
  }

  @Override
  public String getApplikationsId() {
	return "FOCUS360";
  }

  @Override
  public String getSystemId() {
	return QUELLSYSTEMID;
  }
}
