package at.sozvers.noegkk.focus.rest.endpoint.umgebung;

import jakarta.annotation.Resource;

public class UmgebungController {

  private static final String UMGEBUNG_URL = "java:global/at/sozvers/noegkk/focus/am_mode_detail";

  @Resource(lookup=UMGEBUNG_URL)
  private String umgebungUrl;

  public String getUmgebungUrl() {
	return umgebungUrl;
  }
}
