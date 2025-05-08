package at.sozvers.noegkk.focus.service.common;

import java.util.Arrays;
import java.util.List;

public class TextUtil {

  private TextUtil() {
	//private Constructor
  }

  /**
   * Ersetzt Parameter im Format (@1, @2 usw.) durch die angegebenen Parameter. Geeignet zum Formatieren von ZPV-Fehlermeldungen.
   *
   * @param text
   * @param params
   *
   * @return
   */
  public static String replacePlaceholder(String text, String... params) {
	return replacePlaceholder(text, Arrays.asList(params));
  }

  /**
   * Ersetzt Parameter im Format (@1, @2 usw.) durch die angegebenen Parameter. Geeignet zum Formatieren von ZPV-Fehlermeldungen.
   *
   * @param text
   * @param params
   *
   * @return
   */
  public static String replacePlaceholder(String text, List<String> params) {
	int i = 1;

	for(String param : params) {
	  text = text.replace("@" + i, param);
	  i++;
	}

	return text;
  }
}
