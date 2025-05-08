package at.sozvers.noegkk.focus.rest.api.vda;

import at.sozvers.noegkk.focus.rest.api.common.BaseDTO;

public class VDADashboardDTO implements BaseDTO {

  private String dashboardUrl;

  public VDADashboardDTO(String dashboardUrl) {
	this.dashboardUrl = dashboardUrl;
  }

  public String getDashboardUrl() {
	return dashboardUrl;
  }

  public void setDashboardUrl(String dashboardUrl) {
	this.dashboardUrl = dashboardUrl;
  }
}
