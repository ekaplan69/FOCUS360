package at.sozvers.noegkk.focus;

import java.io.*;
import java.security.Principal;
import java.util.*;
import jakarta.enterprise.inject.Vetoed;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

@Vetoed
public class FallbackHttpServletRequest implements HttpServletRequest {
  @Override
  public Object getAttribute(String s) {
	return null;
  }

  @Override
  public Enumeration<String> getAttributeNames() {
	return null;
  }

  @Override
  public String getCharacterEncoding() {
	return null;
  }

  @Override
  public void setCharacterEncoding(String s) throws UnsupportedEncodingException {
	//Just because Compiler acts weirdly
  }

  @Override
  public int getContentLength() {
	return 0;
  }

  @Override
  public long getContentLengthLong() {
	return 0;
  }

  @Override
  public String getContentType() {
	return null;
  }

  @Override
  public ServletInputStream getInputStream() throws IOException {
	return null;
  }

  @Override
  public String getParameter(String s) {
	return null;
  }

  @Override
  public Enumeration<String> getParameterNames() {
	return null;
  }

  @Override
  public String[] getParameterValues(String s) {
	return new String[0];
  }

  @Override
  public Map<String, String[]> getParameterMap() {
	return null;
  }

  @Override
  public String getProtocol() {
	return null;
  }

  @Override
  public String getScheme() {
	return null;
  }

  @Override
  public String getServerName() {
	return null;
  }

  @Override
  public int getServerPort() {
	return 0;
  }

  @Override
  public BufferedReader getReader() throws IOException {
	return null;
  }

  @Override
  public String getRemoteAddr() {
	return null;
  }

  @Override
  public String getRemoteHost() {
	return null;
  }

  @Override
  public void setAttribute(String s, Object o) {
	//Just because Compiler acts weirdly
  }

  @Override
  public void removeAttribute(String s) {
	//Just because Compiler acts weirdly
  }

  @Override
  public Locale getLocale() {
	return null;
  }

  @Override
  public Enumeration<Locale> getLocales() {
	return null;
  }

  @Override
  public boolean isSecure() {
	return false;
  }

  @Override
  public RequestDispatcher getRequestDispatcher(String s) {
	return null;
  }

  @Override
  public int getRemotePort() {
	return 0;
  }

  @Override
  public String getLocalName() {
	return null;
  }

  @Override
  public String getLocalAddr() {
	return null;
  }

  @Override
  public int getLocalPort() {
	return 0;
  }

  @Override
  public ServletContext getServletContext() {
	return null;
  }

  @Override
  public AsyncContext startAsync() throws IllegalStateException {
	return null;
  }

  @Override
  public AsyncContext startAsync(ServletRequest servletRequest, ServletResponse servletResponse) throws IllegalStateException {
	return null;
  }

  @Override
  public boolean isAsyncStarted() {
	return false;
  }

  @Override
  public boolean isAsyncSupported() {
	return false;
  }

  @Override
  public AsyncContext getAsyncContext() {
	return null;
  }

  @Override
  public DispatcherType getDispatcherType() {
	return null;
  }

  @Override
  public String getRequestId() {
	return "";
  }

  @Override
  public String getProtocolRequestId() {
	return "";
  }

  @Override
  public ServletConnection getServletConnection() {
	return null;
  }

  @Override
  public String getAuthType() {
	return null;
  }

  @Override
  public Cookie[] getCookies() {
	return new Cookie[0];
  }

  @Override
  public long getDateHeader(String s) {
	return 0;
  }

  @Override
  public String getHeader(String s) {
	return null;
  }

  @Override
  public Enumeration<String> getHeaders(String s) {
	return null;
  }

  @Override
  public Enumeration<String> getHeaderNames() {
	return null;
  }

  @Override
  public int getIntHeader(String s) {
	return 0;
  }

  @Override
  public String getMethod() {
	return null;
  }

  @Override
  public String getPathInfo() {
	return null;
  }

  @Override
  public String getPathTranslated() {
	return null;
  }

  @Override
  public String getContextPath() {
	return null;
  }

  @Override
  public String getQueryString() {
	return null;
  }

  @Override
  public String getRemoteUser() {
	return null;
  }

  @Override
  public boolean isUserInRole(String s) {
	return false;
  }

  @Override
  public Principal getUserPrincipal() {
	return null;
  }

  @Override
  public String getRequestedSessionId() {
	return null;
  }

  @Override
  public String getRequestURI() {
	return null;
  }

  @Override
  public StringBuffer getRequestURL() {
	return null;
  }

  @Override
  public String getServletPath() {
	return null;
  }

  @Override
  public HttpSession getSession(boolean b) {
	return null;
  }

  @Override
  public HttpSession getSession() {
	return null;
  }

  @Override
  public String changeSessionId() {
	return null;
  }

  @Override
  public boolean isRequestedSessionIdValid() {
	return false;
  }

  @Override
  public boolean isRequestedSessionIdFromCookie() {
	return false;
  }

  @Override
  public boolean isRequestedSessionIdFromURL() {
	return false;
  }

  @Override
  public boolean authenticate(HttpServletResponse httpServletResponse) throws IOException, ServletException {
	return false;
  }

  @Override
  public void login(String s, String s1) throws ServletException {
	//Just because Compiler acts weirdly
  }

  @Override
  public void logout() throws ServletException {
	//Just because Compiler acts weirdly
  }

  @Override
  public Collection<Part> getParts() throws IOException, ServletException {
	return null;
  }

  @Override
  public Part getPart(String s) throws IOException, ServletException {
	return null;
  }

  @Override
  public <T extends HttpUpgradeHandler> T upgrade(Class<T> aClass) throws IOException, ServletException {
	return null;
  }
  //Generate Override methods
}
