package at.sozvers.noegkk.focus.ws.client.zup;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class HostData {
  private HostData() {
	//Private Constructor
  }

  public static String getAddress() throws UnknownHostException {
	return InetAddress.getLocalHost().getHostAddress();
  }

  public static String getName() throws UnknownHostException {
	return InetAddress.getLocalHost().getHostName();
  }
}
