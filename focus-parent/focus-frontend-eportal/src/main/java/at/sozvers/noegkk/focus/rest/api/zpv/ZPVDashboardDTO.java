package at.sozvers.noegkk.focus.rest.api.zpv;

import at.sozvers.noegkk.focus.rest.api.common.BaseDTO;

public class ZPVDashboardDTO implements BaseDTO {

  private String dashboardUrl;

  public ZPVDashboardDTO(String dashboardUrl) {
	this.dashboardUrl = dashboardUrl;
  }

  public String getDashboardUrl() {
	return dashboardUrl;
  }

  public void setDashboardUrl(String dashboardUrl) {
	this.dashboardUrl = dashboardUrl;
  }
}
