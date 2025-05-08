package at.sozvers.noegkk.focus.rest.api.lgkk;

import at.sozvers.noegkk.focus.rest.api.common.BaseDTO;

public class LeistungenDashboardDTO implements BaseDTO {

  private String dashboardUrl;

  public LeistungenDashboardDTO(String dashboardUrl) {
	this.dashboardUrl = dashboardUrl;
  }

  public String getDashboardUrl() {
	return dashboardUrl;
  }

  public void setDashboardUrl(String dashboardUrl) {
	this.dashboardUrl = dashboardUrl;
  }
}
