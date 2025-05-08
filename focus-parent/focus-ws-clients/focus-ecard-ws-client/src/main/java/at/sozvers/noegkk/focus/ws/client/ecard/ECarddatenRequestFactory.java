package at.sozvers.noegkk.focus.ws.client.ecard;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import at.itsv.noegkk.commons.RequestHeadersCommons;
import at.siemens.ecard.server.onlineservices.valueobject.ECardAuskunftV2Req;
import at.siemens.ecard.server.onlineservices.valueobject.SVPersonKonsultationenAuskunftV4Req;
import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class ECarddatenRequestFactory {

  public static final String FOCUS_360 = "FOCUS360";
  public static final String VERSION   = "0002";

  @Inject
  private RequestHeadersCommons requestHeaders;

  public ECardAuskunftV2Req eCardAuskunft(String vsnr) {
	ECardAuskunftV2Req request = new ECardAuskunftV2Req();

	request.setMxOriginatorId(requestHeaders.getBearbeiterID());
	request.setTraegerId(requestHeaders.getTraegerID());
	request.setVersion(VERSION);
	request.setIdApp(FOCUS_360);

	request.setVsNr(vsnr);

	return request;
  }

  public SVPersonKonsultationenAuskunftV4Req konsultationenAuskunftV4Req(String vsnr, int konsultationAb) {
	SVPersonKonsultationenAuskunftV4Req request = new SVPersonKonsultationenAuskunftV4Req();

	request.setMxOriginatorId(requestHeaders.getBearbeiterID());
	request.setTraegerId(requestHeaders.getTraegerID());
	request.setVersion(VERSION);
	request.setIdApp(FOCUS_360);

	request.setVsNr(vsnr);

	LocalDate now    = LocalDate.now();
	LocalDate before = now.minusDays(konsultationAb);

	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMMyyyy");

	String behandlungAb  = before.format(formatter);
	String behandlungBis = now.format(formatter);

	request.setBehandlungAb(behandlungAb);
	request.setBehandlungBis(behandlungBis);

	return request;
  }
}
