package at.sozvers.noegkk.focus.rest.endpoint.person;
/*
import at.sozvers.noegkk.focus.CdiExtension;
import at.sozvers.noegkk.focus.rest.api.zpv.person.StammdatenDTO;
import at.sozvers.noegkk.focus.service.api.zpv.adresse.AdresseAnschriftBTO;
import at.sozvers.noegkk.focus.service.api.zpv.adresse.GeldadresseBTO;
import at.sozvers.noegkk.focus.service.api.zpv.adresse.KontaktEmailBTO;
import at.sozvers.noegkk.focus.service.api.zpv.adresse.KontaktTelefonBTO;
import at.sozvers.noegkk.focus.service.api.zpv.person.StammdatenBTO;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.inject.Inject;
import java.math.BigInteger;
import java.time.LocalDate;
import java.util.ArrayList;

@ExtendWith(CdiExtension.class)
class StammdatenBusinessRestMapperTest {

	
	@Inject
	private StammdatenBusinessRestMapper mapper;
		
	@Inject
	private AdresseAnschriftBusinessRestMapper adresseAnschriftBusinessRestMapper;
	@Inject
	private GeldadresseBusinessRestMapper geldadresseBusinessRestMapper;
	
	@Test
	void test_map_null() {
		StammdatenBTO bto = null;
		StammdatenDTO dto = mapper.map(bto);

		assertNull(dto);
	}
	
	@Test
	void test_map_input() {
		StammdatenBTO bto = new StammdatenBTO();
		
		AdresseAnschriftBTO adressebto = new AdresseAnschriftBTO();
		adressebto.setAnschrift("anschrift");
		adressebto.setOrt("ort");
		adressebto.setPlz("plz");
		bto.setAdresse(adressebto);
		
		
		bto.setAuskunftsSperre(false);
		bto.setAuskunftsSperreGruende(new ArrayList<String>(0));
		bto.setGeburtsDatum(LocalDate.of(1999, 12, 15));
		bto.setGeldAdressen(new ArrayList<GeldadresseBTO>(0));
		bto.setGeschlecht("w");
		bto.setGesetzlichVertreten(true);
		
		KontaktEmailBTO mailbto = new KontaktEmailBTO();
		mailbto.setMailAdresse("mail");
		bto.setKontaktEmail(mailbto);
		
		KontaktTelefonBTO telefonbto = new KontaktTelefonBTO();
		telefonbto.setTelefonNummer("123468568");
		bto.setKontaktTelefon(telefonbto);

		bto.setName("name");
		bto.setPartnerVersicherterRolleId(new BigInteger("123456789"));
		bto.setZustimmungSuen(true);

		
		StammdatenDTO dto = mapper.map(bto);
	
		
		assertNotNull(dto);

		assertNull(dto.getAnrede());
		assertEquals(LocalDate.of(1999, 12, 15), dto.getGeburtsDatum());
		assertEquals("w", dto.getGeschlecht());
		assertEquals("name", dto.getName());
		assertEquals(new BigInteger("123456789"), dto.getPartnerVersicherterRolleId());
		assertEquals("anschrift", dto.getAdresse().getAnschrift());
		assertEquals("ort", dto.getAdresse().getOrt());
		assertEquals("plz", dto.getAdresse().getPlz());
		assertEquals(0, dto.getAuskunftsSperreGruende().size());
		assertEquals(0, dto.getGeldAdressen().size());
		assertEquals("mail", dto.getMailAdresse());
		assertEquals("123468568", dto.getTelefonNummer());
    }
}*/