package at.sozvers.noegkk.focus.person;

import java.math.BigInteger;
import java.time.LocalDate;
import java.util.Arrays;
import at.sozialversicherung.schema.zpv.ibs.partnerlesenkurz_15_0.DtoPartnerLEKO;
import at.sozvers.noegkk.focus.service.api.zpv.person.PersonBTO;
import at.sozvers.noegkk.focus.service.api.zpv.person.StammdatenBTO;
import at.sozvers.noegkk.focus.service.zpv.person.PartnerBTOExternalServiceMapper;
import at.sozvers.noegkk.focus.service.zpv.person.StammdatenBTOExternalServiceMapper;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class PartnerBTOExternalServiceMapperTest {

  @InjectMocks
  private PartnerBTOExternalServiceMapper    mapper;
  @Mock
  private StammdatenBTOExternalServiceMapper mockedStammdatenBTOExternalServiceMapper;

  @Test
  void test_map() {
	StammdatenBTO bto = new StammdatenBTO();
	bto.setName("Max Mustermann");
	//		bto.setAnrede("Herr");
	bto.setGeschlecht("männlich");
	bto.setGeburtsDatum(LocalDate.of(2019, 1, 1));
	bto.setAuskunftsSperre(true);
	bto.setAuskunftsSperreGruende(Arrays.asList("Grund 1", "Grund 2", "Grund blabla"));
	bto.setPartnerVersicherterRolleId(BigInteger.valueOf(127));

	Mockito.when(mockedStammdatenBTOExternalServiceMapper.map(Mockito.any(DtoPartnerLEKO.class))).thenReturn(bto);

	PersonBTO personBto = mapper.map(new DtoPartnerLEKO());

	assertNotNull(personBto);
	StammdatenBTO stammdatenBto = personBto.getStammdaten();

	assertNull(personBto.getVsnr());
	assertEquals("Max Mustermann", stammdatenBto.getName());
	assertEquals("männlich", stammdatenBto.getGeschlecht());
	assertEquals(LocalDate.of(2019, 1, 1), stammdatenBto.getGeburtsDatum());
	assertTrue(stammdatenBto.isAuskunftsSperre());
	assertEquals(3, stammdatenBto.getAuskunftsSperreGruende().size());
	assertEquals("Grund 1", stammdatenBto.getAuskunftsSperreGruende().get(0));
	assertEquals("Grund 2", stammdatenBto.getAuskunftsSperreGruende().get(1));
	assertEquals("Grund blabla", stammdatenBto.getAuskunftsSperreGruende().get(2));
  }
}
