package at.sozvers.noegkk.focus.app;

import java.io.IOException;
import java.util.Arrays;
import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;

/**
 * Nimmt alle Requests entgegen und dispatched alle in Richtung Angular-App  * (ausgenommen Resourcen), damit das Routing/Fehler-Handling von der Angular-App  * übernommen werden kann  *  * @author <a
 * href="mailto:gernot.mueller@itsv.at">Gernot Müller</a>
 */
public class AngularFilter implements Filter {
  private static final String   ANGULAR_START_PAGE = "/index.html";
  private static final String[] API_PATHS          = {"/api", "/local"};
  private static final String[] RESOURCE_ENDINGS   = {".css", ".js", ".ico", ".ttf", ".png", ".json", ".jpg", ".ttf", ".woff", ".woff2", ".svg"};

  @Override
  public void init(FilterConfig config) {
	//Nothing to init
  }

  public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
	if(req instanceof HttpServletRequest) {
	  HttpServletRequest request = (HttpServletRequest) req;
	  if(Arrays.stream(RESOURCE_ENDINGS).noneMatch(entry -> request.getRequestURI().endsWith(entry)) && Arrays.stream(API_PATHS).noneMatch(entry -> request.getServletPath().startsWith(entry))) {
		request.getRequestDispatcher(ANGULAR_START_PAGE).forward(request, resp);
		return;
	  }
	}
	chain.doFilter(req, resp);
  }

  @Override
  public void destroy() {
	//Nothing to destroy
  }
}


