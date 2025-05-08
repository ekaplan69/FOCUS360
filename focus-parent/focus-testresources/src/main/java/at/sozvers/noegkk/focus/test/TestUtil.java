package at.sozvers.noegkk.focus.test;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class TestUtil {
  private TestUtil() {
	//Private Constructor
  }

  public static boolean checkIfAddressIsAvailable(String host, int port, int timeout) {
	try(Socket socket = new Socket()) {
	  socket.connect(new InetSocketAddress(host, port), timeout);
	  return true;
	} catch(IOException e) {
	  return false; // Either timeout or unreachable or failed DNS lookup.
	}
  }

  public static int daysBetween(LocalDate beforeDate, LocalDate afterDate) {
	return (int) ChronoUnit.DAYS.between(beforeDate, afterDate);
  }

  /**
   * Parsing String to Date, Format: dd.MM.yyyy/HH:mm:ss
   *
   * @param date
   *
   * @return
   */
  public static Date parseDate(String date) {
	try {
	  return new SimpleDateFormat("dd.MM.yyyy/HH:mm:ss").parse(date);
	} catch(ParseException e) {
	  return null;
	}
  }
}
