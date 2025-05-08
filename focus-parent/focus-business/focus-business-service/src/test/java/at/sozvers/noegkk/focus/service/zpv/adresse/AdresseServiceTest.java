package at.sozvers.noegkk.focus.service.zpv.adresse;

import java.util.List;
import at.sozialversicherung.schema.zpv.ibs.adresszuordnungsuchen_10_0.*;
import at.sozvers.noegkk.focus.service.api.zpv.adresse.AdresseBTO;
import at.sozvers.noegkk.focus.service.common.Fachschluessel;
import at.sozvers.noegkk.focus.service.common.FachschluesselValidator;
import at.sozvers.noegkk.focus.service.zpv.infrastructure.ZpvCaller;
import at.sozvers.noegkk.focus.service.zpv.infrastructure.ZpvConstants;
import at.sozvers.noegkk.jsszpvbe2.action.ZPVServices;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class AdresseServiceTest {

  @InjectMocks
  private AdresseService                                                    adresseService;
  @Mock
  private DtoAdresszuordnungListeSUIFactory                                 mockedDtoAdresszuordnungListeSUIFactory;
  @Mock
  private FachschluesselValidator                                           mockedFachschluesselValidator;
  @Mock
  private AdresseBTOExternalServiceMapper                                   mockedServiceMapper;
  @Mock
  private ZpvCaller<DtoAdresszuordnungListeSUI, DtoAdresszuordnungListeSUO> mockedZpvCaller;
  @Mock
  private ZPVServices                                                       mockedZpvServices;

  @Test
  void test_searchByFachschluessel_AnschHauptPriva() throws Exception {
	DtoAdresszuordnungListeSUO adresszuordnungListe = new DtoAdresszuordnungListeSUO();
	ReturnInfo                 fehlerpaket          = new ReturnInfo();
	fehlerpaket.setIstOk("J");
	adresszuordnungListe.setFehlerpaket(fehlerpaket);
	DtoAdresszuordnungPartnerListeSUO adresspartnerListe = new DtoAdresszuordnungPartnerListeSUO();
	DtoAnschriftStrasseSUO            adresszuordnung    = new DtoAnschriftStrasseSUO();
	adresszuordnung.setStrasse("Kremser Landstraße");
	adresszuordnung.setHausnummer("3");
	adresszuordnung.setPostleitzahl("3100");
	adresszuordnung.setOrt("St. Pölten");
	adresszuordnung.setAdresstyp("Anschrift");
	adresszuordnung.setAdresstypKurz("ANSCH");
	adresszuordnung.setVerwendungsart("Hauptadresse");
	adresszuordnung.setVerwendungsartKurz("HAUPT");
	adresszuordnung.setGebrauchKurz("privat");
	adresszuordnung.setGebrauchKurz("PRIVA");
	adresspartnerListe.getDtoAdresszuordnungAllgemeinSUOListe().add(adresszuordnung);
	adresszuordnungListe.getDtoAdresszuordnungPartnerListeSUOListe().add(adresspartnerListe);

	Mockito.when(mockedZpvCaller.call(Mockito.any(), Mockito.any())).thenReturn(adresszuordnungListe);

	Fachschluessel   fachschluessel = Fachschluessel.of("1561040787", "VSNR");
	List<AdresseBTO> adresseList    = adresseService.searchByFachschluessel(fachschluessel, ZpvConstants.GEBRAUCHART_PRIVA);

	assertEquals(0, adresseList.size());
  }

  @Test
  void test_searchByFachschluessel_FehlerpaketNichtOK() throws Exception {
	DtoAdresszuordnungListeSUO adresszuordnungListe = new DtoAdresszuordnungListeSUO();
	ReturnInfo                 fehlerpaket          = new ReturnInfo();
	fehlerpaket.setIstOk("N");
	adresszuordnungListe.setFehlerpaket(fehlerpaket);

	Mockito.when(mockedZpvCaller.call(Mockito.any(), Mockito.any())).thenReturn(adresszuordnungListe);

	Fachschluessel   fachschluessel = Fachschluessel.of("1561040787", "VSNR");
	List<AdresseBTO> adresseList    = adresseService.searchByFachschluessel(fachschluessel, ZpvConstants.GEBRAUCHART_PRIVA);

	assertEquals(0, adresseList.size());
  }

  @Test
  void test_searchByFachschluessel_LeereListe() throws Exception {
	DtoAdresszuordnungListeSUO adresszuordnungListe = new DtoAdresszuordnungListeSUO();
	ReturnInfo                 fehlerpaket          = new ReturnInfo();
	fehlerpaket.setIstOk("J");
	adresszuordnungListe.setFehlerpaket(fehlerpaket);
	DtoAdresszuordnungPartnerListeSUO adresspartnerListe = new DtoAdresszuordnungPartnerListeSUO();
	DtoAdresszuordnungAllgemeinSUO    adresszuordnung    = new DtoAdresszuordnungAllgemeinSUO();
	adresspartnerListe.getDtoAdresszuordnungAllgemeinSUOListe().add(adresszuordnung);
	adresszuordnungListe.getDtoAdresszuordnungPartnerListeSUOListe().add(adresspartnerListe);

	Mockito.when(mockedZpvCaller.call(Mockito.any(), Mockito.any())).thenReturn(adresszuordnungListe);

	Fachschluessel   fachschluessel = Fachschluessel.of("1561040787", "VSNR");
	List<AdresseBTO> adresseList    = adresseService.searchByFachschluessel(fachschluessel, ZpvConstants.GEBRAUCHART_PRIVA);

	assertEquals(0, adresseList.size());
  }
}
