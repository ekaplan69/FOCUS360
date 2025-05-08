package at.sozvers.noegkk.focus.service.common;

import java.util.ResourceBundle;
import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class MessageProvider {

  private ResourceBundle resourceBundle;

  public String getMessage(String property) {
	return resourceBundle.getString(property);
  }

  @PostConstruct
  private void init() {
	resourceBundle = ResourceBundle.getBundle("ErrorMessages");
  }
}
