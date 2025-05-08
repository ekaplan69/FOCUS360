package at.sozvers.noegkk.focus.rest.api.kontakt;

import at.sozvers.noegkk.focus.rest.api.common.BaseDTO;

public class AmountDeletedDTO implements BaseDTO {

  private Long amountDeleted;

  public AmountDeletedDTO(Long amountDeleted) {
	this.amountDeleted = amountDeleted;
  }

  public Long getAmountDeleted() {
	return amountDeleted;
  }

  public void setAmountDeleted(Long amountDeleted) {
	this.amountDeleted = amountDeleted;
  }
}
