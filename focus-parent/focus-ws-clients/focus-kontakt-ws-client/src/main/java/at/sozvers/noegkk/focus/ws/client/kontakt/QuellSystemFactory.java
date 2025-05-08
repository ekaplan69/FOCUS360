package at.sozvers.noegkk.focus.ws.client.kontakt;

import at.sozvers.noegkk.sckont.kontakt.focus.QuellSystem;

public class QuellSystemFactory {
  private QuellSystemFactory() {
	//Private Constructor
  }

  public static QuellSystem createQuellSystem() {
	QuellSystem quellSystem = new QuellSystem();

	quellSystem.setApplikationsId("FOCUS");
	quellSystem.setSystemId("FOCUS");

	return quellSystem;
  }
}
