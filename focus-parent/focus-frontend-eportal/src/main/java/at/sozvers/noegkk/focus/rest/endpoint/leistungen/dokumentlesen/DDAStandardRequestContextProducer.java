package at.sozvers.noegkk.focus.rest.endpoint.leistungen.dokumentlesen;

import at.sozvers.noegkk.dda.util.DDADefaultStandardRequestContext;
import jakarta.annotation.Priority;
import jakarta.annotation.Resource;
import jakarta.enterprise.context.RequestScoped;
import jakarta.enterprise.inject.Alternative;
import jakarta.interceptor.Interceptor;

@RequestScoped
@Alternative
@Priority(Interceptor.Priority.APPLICATION + 10)
public class DDAStandardRequestContextProducer extends DDADefaultStandardRequestContext {
  private static String BEARBEITER;
  private static String MELDENDE_STELLE;

  @Resource(lookup="java:global/at/sozvers/noegkk/focus/lgk/dokument/PRIMAERSYSTEMID")
  private static String PRIMAERSYSTEMID;
  @Resource(lookup="java:global/at/sozvers/noegkk/focus/lgk/dokument/BERECHTIGUNGSSYSTEMID")
  private        String BERECHTIGUNGSSYSTEMID;
  @Resource(lookup="java:global/at/sozvers/noegkk/focus/lgk/dokument/VERARBEITUNGSMODUS")
  private        String VERARBEITUNGSMODUS;

  public static void setBearbeiter(String bearbeiter) {
	DDAStandardRequestContextProducer.BEARBEITER = bearbeiter;
  }

  @Override
  public String getTransaktionsId() {
	return "066d6284-d920-4f28-b3f2-46f780691575";
  }

  @Override
  public String getVerarbeitungsmodus() {
	return VERARBEITUNGSMODUS;
  }

  @Override
  public String getPrimaerSystemId() {
	return PRIMAERSYSTEMID;
  }

  @Override
  public String getBearbeitungsgrund() {
	return "Eintrag freigeben";
  }

  @Override
  public String getBerechtigungsSystemId() {
	return BERECHTIGUNGSSYSTEMID;
  }

  @Override
  public String getBearbeiterinId() {
	return BEARBEITER;
  }

  @Override
  public String getMeldendeStelle() {
	return MELDENDE_STELLE;
  }

  public static void setMeldendeStelle(String meldendeStelle) {
	MELDENDE_STELLE = meldendeStelle;
  }
}