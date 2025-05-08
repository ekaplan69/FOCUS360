package at.sozvers.noegkk.focus.rest.endpoint.person;

import jakarta.annotation.Resource;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ZPVDashboardController {

  private static final String DASHBOARD_URL = "java:global/at/sozvers/noegkk/focus/zpv/dashboardUrl";

  @Resource(lookup=DASHBOARD_URL)
  private String dashboardUrl;

  public String getDashboardUrl() {
	return dashboardUrl;
  }
}
