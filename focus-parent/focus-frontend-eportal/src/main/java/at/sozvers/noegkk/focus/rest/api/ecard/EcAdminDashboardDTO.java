package at.sozvers.noegkk.focus.rest.api.ecard;

import at.sozvers.noegkk.focus.rest.api.common.BaseDTO;

public class EcAdminDashboardDTO implements BaseDTO {

  private String dashboardUrl;

  public EcAdminDashboardDTO(String dashboardUrl) {
	this.dashboardUrl = dashboardUrl;
  }

  public String getDashboardUrl() {
	return dashboardUrl;
  }

  public void setDashboardUrl(String dashboardUrl) {
	this.dashboardUrl = dashboardUrl;
  }
}
