package at.sozvers.noegkk.focus.service.ecard.ecarddaten;

import java.util.ArrayList;
import java.util.List;
import at.siemens.ecard.server.onlineservices.valueobject.ECardV2;

public class ECardUtils {

  public static List<ECardV2> createECardList() {
	List<ECardV2> eCardList = new ArrayList<>();

	ECardV2 eCard = new ECardV2();
	eCard.setVersendeDatum("01012019");
	eCard.setECard("123456789");
	eCard.setEkvkBisDatum("02012019");
	eCardList.add(eCard);

	return eCardList;
  }
}
