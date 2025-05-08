package at.sozvers.noegkk.focus.service.zvd.versicherungszeit;

import javax.xml.datatype.XMLGregorianCalendar;
import java.time.LocalDate;
import at.sozvers.noegkk.focus.service.api.zvd.VersicherungszeitBTO;
import at.sozvers.noegkk.focus.service.mapping.BTOExternalServiceMapper;
import at.sozvers.zvd.ws.versicherungsverhaeltnisselesenservice.v3.types.Versicherungszeit;

public class VersicherungszeitBTOExternalServiceMapper extends BTOExternalServiceMapper<VersicherungszeitBTO, Versicherungszeit> {

  @Override
  public VersicherungszeitBTO map(Versicherungszeit versicherungszeit) {
	if(versicherungszeit == null) {
	  return null;
	} else {
	  VersicherungszeitBTO bto = new VersicherungszeitBTO();
	  bto.setVonDatum(getLocalDateFromGregorianCalendar(versicherungszeit.getVonDatum()));
	  bto.setBisDatum(getLocalDateFromGregorianCalendar(versicherungszeit.getBisDatum()));
	  bto.setQualifikation(versicherungszeit.getQualifikation());
	  return bto;
	}
  }

  private LocalDate getLocalDateFromGregorianCalendar(XMLGregorianCalendar calendar) {
	if(calendar == null) {
	  return null;
	} else {
	  return LocalDate.of(calendar.getYear(), calendar.getMonth(), calendar.getDay());
	}
  }
}
