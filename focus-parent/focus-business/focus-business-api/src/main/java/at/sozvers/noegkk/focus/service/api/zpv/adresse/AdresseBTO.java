package at.sozvers.noegkk.focus.service.api.zpv.adresse;

import at.sozvers.noegkk.focus.service.api.common.BaseBTO;

public abstract class AdresseBTO implements BaseBTO {

  public abstract AdresseType getType();

  public enum AdresseType {

	ANSCHRIFT, GELDADRESSE, KONTAKT_EMAIL, KONTAKT_TELEFON
  }
}
