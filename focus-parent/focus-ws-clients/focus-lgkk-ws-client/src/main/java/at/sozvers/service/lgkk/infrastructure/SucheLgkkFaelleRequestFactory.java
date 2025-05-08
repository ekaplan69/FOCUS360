package at.sozvers.service.lgkk.infrastructure;

import javax.xml.datatype.*;
import java.time.LocalDate;
import java.util.List;
import at.itsv.noegkk.commons.RequestHeadersCommons;
import at.itsv.services.lgkk.StandardRequestHeader;
import at.sozvers.focus.persistence.focus.dao.FocusSteuerungDAO;
import at.sozvers.noegkk.focus.ws.client.lgkk.LgkkClient;
import at.sozvers.stp.lgkk.webservice.focus360.v20.*;
import jakarta.inject.Inject;

public class SucheLgkkFaelleRequestFactory {

  @Inject
  private FocusSteuerungDAO     focusSteuerungDAO;
  @Inject
  @LgkkService
  private LgkkClient            lgkkClient;
  @Inject
  private RequestHeadersCommons requestHeadersCommons;

  public SucheLGKFaelleV2 createRequest(String vsnr, Double personPid, List<Integer> landesstellen) throws DatatypeConfigurationException {
	LocalDate            stichtagLocalDate            = LocalDate.now().minusDays(focusSteuerungDAO.getLeistungErmittlungStartZeitraum());
	XMLGregorianCalendar stichTagXMLGregorianCalender = localDateToXMLGregorianCalender(stichtagLocalDate);

	return createRequest(vsnr, stichTagXMLGregorianCalender, personPid, landesstellen);
  }

  private XMLGregorianCalendar localDateToXMLGregorianCalender(LocalDate localDate) throws DatatypeConfigurationException {
	XMLGregorianCalendar xmlGregorianCalendar = DatatypeFactory.newInstance().newXMLGregorianCalendar(localDate.toString());

	xmlGregorianCalendar.setHour(0);
	xmlGregorianCalendar.setMinute(0);
	xmlGregorianCalendar.setSecond(0);
	xmlGregorianCalendar.setMillisecond(0);
	xmlGregorianCalendar.setTimezone(+1);

	return xmlGregorianCalendar;
  }

  public SucheLGKFaelleV2 createRequest(String vsnr, XMLGregorianCalendar stichtagDat, Double personPid, List<Integer> landestellen) {
	Focus360RequestV2 focus360Request = new Focus360RequestV2();
	focus360Request.setVsnr(vsnr);
	focus360Request.setStichtagDat(stichtagDat);
	focus360Request.setPersonPid(personPid);
	focus360Request.getLandesstellen().addAll(landestellen);

	return createRequest(focus360Request);
  }

  private SucheLGKFaelleV2 createRequest(Focus360RequestV2 arg) {
	SucheLGKFaelleV2 input = new SucheLGKFaelleV2();
	input.setArg0(arg);
	input.getArg0().setHeader(createStandardRequestHeader());
	if(arg.getVsnr().equals("1111111111")) {
	  input.getArg0().getHeader().getBearbeiter().setBearbeiterID("TESTELGKK");
	}
	return input;
  }

  private StandardRequestHeader createStandardRequestHeader() {
	StandardRequestHeader header = new StandardRequestHeader();
	header.setApplikationsID("FOCUS360");
	header.setBearbeiter(createBearbeiter());
	header.setSystemmodus(lgkkClient.getSystemmodus());
	header.setTransaktionsID(requestHeadersCommons.getTransactionUUID().replace("-", "").substring(0, 13));
	header.setVerarbeitungsmodus(Verarbeitungsmodus.O);
	return header;
  }

  private Bearbeiter createBearbeiter() {
	Bearbeiter b = new Bearbeiter();
	b.setBearbeiterID(requestHeadersCommons.getBearbeiterID());
	b.setMeldendeStelle(requestHeadersCommons.getMeldendeStelle());
	b.setOrgeinheitID(requestHeadersCommons.getMeldendeStelle());
	b.setTraegerID(requestHeadersCommons.getTraegerID());
	b.setBearbeitungsgrund("Focus360");
	return b;
  }

  public SucheLGKDokumenteV1 createRequest(String vsnr, XMLGregorianCalendar vonDat) {
	Focus360DokumentRequest focus360Request = new Focus360DokumentRequest();
	focus360Request.setVsnr(vsnr);
	focus360Request.setVonDatum(vonDat);

	return createRequest(focus360Request);
  }

  private SucheLGKDokumenteV1 createRequest(Focus360DokumentRequest arg) {
	SucheLGKDokumenteV1 input = new SucheLGKDokumenteV1();
	input.setArg0(arg);
	input.getArg0().setHeader(createStandardRequestHeader());
	if(arg.getVsnr().equals("1111111111")) {
	  input.getArg0().getHeader().getBearbeiter().setBearbeiterID("TESTELGKK");
	}
	return input;
  }

  public SucheLGKFaelleV2 createRequestDSGVO(String vsnr, Double personPid, List<Integer> landesstellen) throws DatatypeConfigurationException {
	LocalDate            stichtagLocalDate            = LocalDate.now().minusDays(focusSteuerungDAO.getDSGVOErmittlungStartZeitraum());
	XMLGregorianCalendar stichTagXMLGregorianCalender = localDateToXMLGregorianCalender(stichtagLocalDate);

	return createRequest(vsnr, stichTagXMLGregorianCalender, personPid, landesstellen);
  }
}
