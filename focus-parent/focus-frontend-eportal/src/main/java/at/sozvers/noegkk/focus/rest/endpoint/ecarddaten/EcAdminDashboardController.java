package at.sozvers.noegkk.focus.rest.endpoint.ecarddaten;

import jakarta.annotation.Resource;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class EcAdminDashboardController {

  private static final String DASHBOARD_URL = "java:global/at/sozvers/noegkk/focus/ecadmin/dashboardUrl";

  @Resource(lookup=DASHBOARD_URL)
  private String dashboardUrl;

  public String getDashboardUrl() {
	return dashboardUrl;
  }
}
