package at.sozvers.noegkk.focus.rest.api.zpv.person;

import at.sozvers.noegkk.focus.rest.api.common.BaseDTO;

public class ClkTokenDTO implements BaseDTO {

  private String clkLinkUrl;
  private String clkToken;

  public String getClkLinkUrl() {
	return clkLinkUrl;
  }

  public void setClkLinkUrl(String clkLinkUrl) {
	this.clkLinkUrl = clkLinkUrl;
  }

  public String getClkToken() {
	return clkToken;
  }

  public void setClkToken(String clkToken) {
	this.clkToken = clkToken;
  }
}
