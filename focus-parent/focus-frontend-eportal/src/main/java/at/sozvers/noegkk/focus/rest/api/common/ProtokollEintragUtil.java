package at.sozvers.noegkk.focus.rest.api.common;

import java.util.ArrayList;
import java.util.List;
import at.sozvers.noegkk.architektur.zup.model.*;

public class ProtokollEintragUtil {
  private ProtokollEintragUtil() {
	//Private Constructor
  }

  public static List<ProtokollEintrag> getProtokollEintraege(ZupInfoDTO zupInfoDto) {
	List<ProtokollEintrag> protokollEintraege = new ArrayList<>();
	ProtokollEintrag       protokollEintrag   = new ProtokollEintrag();

	if(zupInfoDto != null) {
	  protokollEintrag.setKriterium1(new Kriterium<>(KriteriumTyp1Enum.PRID, zupInfoDto.getPartnerId() != null ? zupInfoDto.getPartnerId() : "0000000000"));
	  protokollEintrag.setKriterium2(new Kriterium<>("FachschluesselArt", zupInfoDto.getFachschluesselArt()));
	  protokollEintrag.setKriterium3(new Kriterium<>("Fachschluessel", zupInfoDto.getFachschluessel()));
	  protokollEintrag.setProtkollierungspflicht(ProtokollierungspflichtEnum.P);

	  if(zupInfoDto.getZusatzinfo() != null) {
		protokollEintrag.setZusatzinfo(zupInfoDto.getZusatzinfo());
	  }
	}
	protokollEintraege.add(protokollEintrag);
	return protokollEintraege;
  }
}
