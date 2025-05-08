package at.sozvers.noegkk.focus.service.common;

import jakarta.enterprise.context.Dependent;

import static at.sozvers.noegkk.focus.service.zpv.infrastructure.ZpvConstants.*;

@Dependent
public class FachschluesselValidator implements Validator<Fachschluessel> {

  private static final int    BTNR_LENGTH   = 10;
  private static final int    DGNR_LENGTH   = 9;
  private static final String NUMBER_REGEXP = "^[0-9]+$";
  private static final int    VSNR_LENGTH   = 10;

  @Override
  public void validate(Fachschluessel fachschluessel) {
	// @formatter:off
		if(fachschluessel.getFachschluessel() == null || fachschluessel.getFachschluessel().isEmpty()
			|| fachschluessel.getFachschluesselArt() == null || fachschluessel.getFachschluesselArt().isEmpty()
		// @formatter:on
		) {
		  throw new ValidationException("Fachschluessel und FachschluesselArt müssen gesetzt sein.");
		}
	if(FACHSCHLUESSELART_KURZ_VSNR.equals(fachschluessel.getFachschluesselArt())) {
	  if(!validateVSNR(fachschluessel.getFachschluessel())) {
		throw new ValidationException(String.format("Fachschluessel %s ist keine gültige VSNR.", fachschluessel.getFachschluessel()));
	  }
	} else if(FACHSCHLUESSELART_KURZ_DGNR.equals(fachschluessel.getFachschluesselArt())) {
	  if(!validateDGNR(fachschluessel.getFachschluessel())) {
		throw new ValidationException(String.format("Fachschluessel %s ist keine gültige DGNR.", fachschluessel.getFachschluessel()));
	  }
	} else if(FACHSCHLUESSELART_KURZ_BTNR.equals(fachschluessel.getFachschluesselArt())) {
	  if(!validateBTNR(fachschluessel.getFachschluessel())) {
		throw new ValidationException(String.format("Fachschluessel %s ist keine gültige BTNR.", fachschluessel.getFachschluessel()));
	  }
	} else {
	  throw new ValidationException(String.format("FachschluesselArt %s nicht erlaubt.", fachschluessel.getFachschluesselArt()));
	}
  }

  private boolean validateVSNR(String vsnr) {
	if(vsnr.length() == VSNR_LENGTH && vsnr.matches(NUMBER_REGEXP)) {
	  // https://www.sozialversicherung.at/portal27/esvportal/content?contentid=10007.686020&viewmode=content
	  int sum = (Character.getNumericValue(vsnr.charAt(0)) * 3) + (Character.getNumericValue(vsnr.charAt(1)) * 7) + (Character.getNumericValue(vsnr.charAt(2)) * 9) + (Character.getNumericValue(
			  vsnr.charAt(4)) * 5) + (Character.getNumericValue(vsnr.charAt(5)) * 8) + (Character.getNumericValue(vsnr.charAt(6)) * 4) + (Character.getNumericValue(
			  vsnr.charAt(7)) * 2) + (Character.getNumericValue(vsnr.charAt(8)) * 1) + (Character.getNumericValue(vsnr.charAt(9)) * 6);
	  int pruefziffer = sum % 11;
	  if(pruefziffer == Character.getNumericValue(vsnr.charAt(3))) {
		return true;
	  }
	}
	return false;
  }

  private boolean validateDGNR(String dgnr) {
	return dgnr.length() == DGNR_LENGTH && dgnr.matches(NUMBER_REGEXP);
  }

  private boolean validateBTNR(String btnr) {
	return (btnr.length() == BTNR_LENGTH && btnr.startsWith("0") && btnr.matches(NUMBER_REGEXP));
  }
}
