package at.sozvers.noegkk.focus.rest;

import java.io.IOException;
import jakarta.ws.rs.container.*;
import jakarta.ws.rs.core.Feature;
import jakarta.ws.rs.core.FeatureContext;
import jakarta.ws.rs.ext.Provider;

@Provider
public class CorsFeature implements Feature {

  @Override
  public boolean configure(FeatureContext featureContext) {
	if("true".equals(System.getProperty("debug.enable"))) {
	  featureContext.register(new CorsResponseFilter());
	  return true;
	}
	return false;
  }

  @Provider
  public static class CorsResponseFilter implements ContainerResponseFilter {
	@Override
	public void filter(ContainerRequestContext requestContext, ContainerResponseContext responseContext) throws IOException {
	  responseContext.getHeaders().add("Access-Control-Allow-Origin", "*");
	  responseContext.getHeaders().add("Access-Control-Allow-Methods", "OPTIONS, GET, POST, DELETE, PUT, PATCH");
	  responseContext.getHeaders().add("Access-Control-Max-Age", "86400"); // 24 hours
	  responseContext.getHeaders().add("Access-Control-Allow-Headers", "Content-Type, Authorization");
	}
  }
}

