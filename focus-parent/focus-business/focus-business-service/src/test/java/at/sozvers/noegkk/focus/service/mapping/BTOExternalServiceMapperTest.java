package at.sozvers.noegkk.focus.service.mapping;

import java.util.ArrayList;
import java.util.List;
import at.sozialversicherung.schema.zpv.ibs.partnerlesenkurz_15_0.DtoPartnerLEKO;
import at.sozialversicherung.schema.zpv.ibs.partnerlesenkurz_15_0.DtoPersonKurz;
import at.sozvers.noegkk.focus.service.api.zpv.person.StammdatenBTO;
import org.apache.commons.lang3.NotImplementedException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class BTOExternalServiceMapperTest {

  private TestMapper mapper;

  @BeforeEach
  public void init() {
	mapper = new TestMapper();
  }

  @Test
  void test_mapToBtoList_NoEntry() {
	List<StammdatenBTO> btoList = mapper.mapToBtoList(new ArrayList<>());
	assertEquals(0, btoList.size());
  }

  @Test
  void test_mapToBtoList_OneEntry() {
	List<DtoPartnerLEKO> lekoList    = new ArrayList<>();
	DtoPartnerLEKO       partnerLeko = new DtoPartnerLEKO();
	DtoPersonKurz        personKurz  = new DtoPersonKurz();
	personKurz.setVorname("Max");
	personKurz.setFamilienname("Mustermann");
	partnerLeko.setDtoPartnerKurz(personKurz);
	lekoList.add(partnerLeko);

	assertThrows(NotImplementedException.class, () -> mapper.mapToBtoList(lekoList));
  }

  @Test
  void test_mapToBtoList_TwoEntries() {
	List<DtoPartnerLEKO> lekoList    = new ArrayList<>();
	DtoPartnerLEKO       partnerLeko = new DtoPartnerLEKO();
	DtoPersonKurz        personKurz  = new DtoPersonKurz();
	personKurz.setVorname("Max");
	personKurz.setFamilienname("Mustermann");
	partnerLeko.setDtoPartnerKurz(personKurz);
	lekoList.add(partnerLeko);

	partnerLeko = new DtoPartnerLEKO();
	personKurz = new DtoPersonKurz();
	personKurz.setVorname("Maria");
	personKurz.setFamilienname("Musterfrau");
	partnerLeko.setDtoPartnerKurz(personKurz);
	lekoList.add(partnerLeko);

	assertThrows(NotImplementedException.class, () -> mapper.mapToBtoList(lekoList));
  }

  @Test
  void test_mapToDtoList_NoEntry() {
	List<DtoPartnerLEKO> dtoList = mapper.mapToDtoList(new ArrayList<>());
	assertEquals(0, dtoList.size());
  }

  @Test
  void test_mapToDtoList_OneEntry() {

	List<StammdatenBTO> btoList    = new ArrayList<>();
	StammdatenBTO       stammdaten = new StammdatenBTO();
	stammdaten.setName("Max Mustermann");
	btoList.add(stammdaten);

	assertThrows(NotImplementedException.class, () -> mapper.mapToDtoList(btoList));
  }

  @Test
  void test_mapToDtoList_TwoEntries() {
	List<StammdatenBTO> btoList    = new ArrayList<>();
	StammdatenBTO       stammdaten = new StammdatenBTO();
	stammdaten.setName("Max Mustermann");
	btoList.add(stammdaten);
	stammdaten = new StammdatenBTO();
	stammdaten.setName("Maria Musterfrau");
	btoList.add(stammdaten);

	assertThrows(NotImplementedException.class, () -> mapper.mapToDtoList(btoList));
  }

  @Test
  void test_map_BTO2DTO() {
	DtoPartnerLEKO leko = new DtoPartnerLEKO();
	assertThrows(NotImplementedException.class, () -> mapper.map(leko));
  }

  @Test
  void test_map_DTO2BTO() {
	StammdatenBTO bto = new StammdatenBTO();
	assertThrows(NotImplementedException.class, () -> mapper.map(bto));
  }

  static class TestMapper extends BTOExternalServiceMapper<StammdatenBTO, DtoPartnerLEKO> {

  }
}
