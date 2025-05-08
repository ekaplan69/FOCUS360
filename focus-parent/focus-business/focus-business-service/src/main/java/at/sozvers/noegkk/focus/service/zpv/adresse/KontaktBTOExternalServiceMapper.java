package at.sozvers.noegkk.focus.service.zpv.adresse;

import at.sozialversicherung.schema.zpv.ibs.adresszuordnungsuchen_10_0.*;
import at.sozvers.noegkk.focus.service.api.zpv.adresse.*;
import at.sozvers.noegkk.focus.service.mapping.BTOExternalServiceMapper;
import jakarta.enterprise.context.Dependent;

@Dependent
public class KontaktBTOExternalServiceMapper extends BTOExternalServiceMapper<KontaktBTO, DtoAdresszuordnungAllgemeinSUO> {

  @Override
  public KontaktBTO map(DtoAdresszuordnungAllgemeinSUO dto) {

	if(dto == null) {
	  return null;
	}

	KontaktBTO ret;

	if(dto instanceof DtoTelefonSUO) {
	  KontaktTelefonBTO bto        = new KontaktTelefonBTO();
	  DtoTelefonSUO     dtoTelefon = ((DtoTelefonSUO) dto);
	  // @formatter:off
			bto.setTelefonNummer(
					String.format("%s %s %s",
							dtoTelefon.getVorwahl() != null ? dtoTelefon.getVorwahl() : "",
							dtoTelefon.getTeilnehmerrufnummer() != null ? dtoTelefon.getTeilnehmerrufnummer() : "",
							dtoTelefon.getDurchwahlnummer() != null ? dtoTelefon.getDurchwahlnummer() : ""
					).trim()
			);
			// @formatter:on
	  ret = bto;
	} else if(dto instanceof DtoeMailSUO) {
	  KontaktEmailBTO bto = new KontaktEmailBTO();
	  bto.setMailAdresse(((DtoeMailSUO) dto).getEmail());
	  ret = bto;
	} else {
	  return null;
	}

	return ret;
  }
}
