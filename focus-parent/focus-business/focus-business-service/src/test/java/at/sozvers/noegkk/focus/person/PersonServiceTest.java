package at.sozvers.noegkk.focus.person;

import java.util.*;
import at.sozialversicherung.schema.zpv.ibs.beziehungsuchen_11_0.*;
import at.sozialversicherung.schema.zpv.ibs.mitarbeiteridentifikationlesen_7_0.DtoMitarbeiterIdentifikationListeLEI;
import at.sozialversicherung.schema.zpv.ibs.mitarbeiteridentifikationlesen_7_0.DtoMitarbeiterIdentifikationListeLEO;
import at.sozialversicherung.schema.zpv.ibs.partnerlesenkurz_15_0.*;
import at.sozialversicherung.schema.zpv.ibs.partnerlesenkurz_15_0.ReturnInfo;
import at.sozvers.noegkk.focus.service.api.zpv.person.StammdatenBTO;
import at.sozvers.noegkk.focus.service.api.zpv.person.VollmachtBTO;
import at.sozvers.noegkk.focus.service.common.Fachschluessel;
import at.sozvers.noegkk.focus.service.zpv.infrastructure.ZpvCaller;
import at.sozvers.noegkk.focus.service.zpv.person.*;
import at.sozvers.noegkk.jsszpvbe2.action.ZPVServices;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@Disabled("Durch changes im Service temporär deaktiviert")
@ExtendWith(MockitoExtension.class)
class PersonServiceTest {

  @Mock(name="beziehungSuchenZpvCaller")
  private ZpvCaller<DtoBeziehungSUI, DtoBeziehungListeSUO>                                      mockedBeziehungSuchenZpvCaller;
  @Mock
  private DtoBeziehungSUIFactory                                                                mockedDtoBeziehungSUIFactory;
  @Mock
  private DtoPartnerListeLEKIFactory                                                            mockedDtoPartnerListeLEKIFactory;
  @Mock
  private DtoMitarbeiterIdentifikationLEIFactory                                                mockedMaLEIFactory;
  @Mock(name="mitarbeiterIdentifikationLesenZpvCaller")
  private ZpvCaller<DtoMitarbeiterIdentifikationListeLEI, DtoMitarbeiterIdentifikationListeLEO> mockedMaZpvCaller;
  @Mock(name="partnerLesenKurzZpvCaller")
  private ZpvCaller<DtoPartnerListeLEKI, DtoPartnerListeLEKO>                                   mockedPartnerLesenKurzZpvCaller;
  @Mock
  private PersonService                                                                         mockedService;
  @Mock
  private StammdatenBTOExternalServiceMapper                                                    mockedStammdatenBTOExternalServiceMapper;
  @Mock
  private VollmachtBTOExternalServiceMapper                                                     mockedVollmachtBTOExternalServiceMapper;
  @Mock
  private ZPVServices                                                                           mockedZpvServices;
  @InjectMocks
  private PersonService                                                                         service;

  @Test
  void test_PersonService_searchByFachschluessel_5436211194() throws Exception {
	Fachschluessel zpvFachschluessel = Fachschluessel.of("5436211194", "VSNR");

	DtoPartnerListeLEKO dtoPartnerListeLEKO = new DtoPartnerListeLEKO();
	DtoPartnerLEKO      dtoPartnerLEKO      = new DtoPartnerLEKO();
	ReturnInfo          iReturnVO           = new ReturnInfo();
	iReturnVO.setIstOk("J");
	dtoPartnerLEKO.setZusatzFehlerpaket(iReturnVO);
	dtoPartnerListeLEKO.getDtoPartnerLEKOListe().add(dtoPartnerLEKO);

	Mockito.when(mockedStammdatenBTOExternalServiceMapper.map(dtoPartnerListeLEKO.getDtoPartnerLEKOListe().get(0))).thenReturn(new StammdatenBTO());
	Mockito.when(mockedPartnerLesenKurzZpvCaller.call(Mockito.any(), Mockito.any())).thenReturn(dtoPartnerListeLEKO);
	setMaIdentifikationMocks();

	Mockito.when(mockedBeziehungSuchenZpvCaller.call(Mockito.any(), Mockito.any(), Mockito.anyBoolean())).thenReturn(new DtoBeziehungListeSUO());

	VollmachtBTO vollmachtBTO = new VollmachtBTO();
	vollmachtBTO.setName("Karl Heinz");

	Mockito.when(mockedVollmachtBTOExternalServiceMapper.mapToBtoList(Mockito.any(List.class))).thenReturn(Collections.singletonList(vollmachtBTO));

	assertNotNull(service.searchByFachschluessel(zpvFachschluessel));
  }

  public void setMaIdentifikationMocks() throws Exception {
	Mockito.when(mockedMaZpvCaller.call(Mockito.any(), Mockito.any())).thenReturn(new DtoMitarbeiterIdentifikationListeLEO());
  }

  @Test
  void test_PersonService_searchByFachschluessel_fachschluessel_is_1234567890() throws Exception {
	Fachschluessel zpvFachschluessel = Fachschluessel.of("1234567890", "VSNR");

	Mockito.when(mockedPartnerLesenKurzZpvCaller.call(Mockito.any(), Mockito.any())).thenReturn(new DtoPartnerListeLEKO());

	assertNull(service.searchByFachschluessel(zpvFachschluessel));
  }

  @Test
  void test_searchByFachschluessel_PartnerListeEmpty() throws Exception {
	Mockito.when(mockedDtoPartnerListeLEKIFactory.createDtoPartnerListeLEKIWithFachschluessel(Mockito.any())).thenReturn(null);
	DtoPartnerListeLEKO partnerListe = new DtoPartnerListeLEKO();
	Mockito.when(mockedPartnerLesenKurzZpvCaller.call(Mockito.any(), Mockito.any())).thenReturn(partnerListe);

	Fachschluessel fachschluessel = Fachschluessel.of("4107071288", "VSNR");
	StammdatenBTO  stammdaten     = service.searchByFachschluessel(fachschluessel);

	assertNull(stammdaten);
  }

  @Test
  void test_searchByFachschluessel_PartnerListeTwoEntries() throws Exception {
	Mockito.when(mockedDtoPartnerListeLEKIFactory.createDtoPartnerListeLEKIWithFachschluessel(Mockito.any())).thenReturn(null);
	DtoPartnerListeLEKO partnerListe = new DtoPartnerListeLEKO();
	partnerListe.getDtoPartnerLEKOListe().add(new DtoPartnerLEKO());
	partnerListe.getDtoPartnerLEKOListe().add(new DtoPartnerLEKO());
	Mockito.when(mockedPartnerLesenKurzZpvCaller.call(Mockito.any(), Mockito.any())).thenReturn(partnerListe);

	Fachschluessel fachschluessel = Fachschluessel.of("4107071288", "VSNR");
	StammdatenBTO  stammdaten     = service.searchByFachschluessel(fachschluessel);

	assertNull(stammdaten);
  }

  @Test
  void test_searchByFachschluessel_PartnerListe_Auskunftssperre() throws Exception {
	Mockito.when(mockedDtoPartnerListeLEKIFactory.createDtoPartnerListeLEKIWithFachschluessel(Mockito.any())).thenReturn(null);
	DtoPartnerListeLEKO partnerListe = new DtoPartnerListeLEKO();
	DtoPartnerLEKO      partner      = new DtoPartnerLEKO();
	ReturnInfo          ret          = new ReturnInfo();
	ret.setIstOk("J");
	partner.setZusatzFehlerpaket(ret);
	partnerListe.getDtoPartnerLEKOListe().add(partner);
	Mockito.when(mockedPartnerLesenKurzZpvCaller.call(Mockito.any(), Mockito.any())).thenReturn(partnerListe);

	StammdatenBTO stammdatenBto = new StammdatenBTO();
	stammdatenBto.setName("Max Mustermann");
	stammdatenBto.setAuskunftsSperre(true);
	stammdatenBto.setAuskunftsSperreGruende(Arrays.asList("Grund 1", null, "Grund 2"));
	Mockito.when(mockedStammdatenBTOExternalServiceMapper.map(Mockito.any(DtoPartnerLEKO.class))).thenReturn(stammdatenBto);

	Mockito.when(mockedDtoBeziehungSUIFactory.createDtoBeziehungSUIWithFachschluessel(Mockito.any())).thenReturn(null);
	DtoBeziehungListeSUO suo = new DtoBeziehungListeSUO();
	suo.getDtoBeziehungAllgemeinSUOListe().add(new DtoBeziehungAllgemeinSUO());
	Mockito.when(mockedBeziehungSuchenZpvCaller.call(Mockito.any(), Mockito.any(), Mockito.anyBoolean())).thenReturn(suo);
	setMaIdentifikationMocks();

	Fachschluessel fachschluessel = Fachschluessel.of("4107071288", "VSNR");
	StammdatenBTO  stammdaten     = service.searchByFachschluessel(fachschluessel);

	assertNotNull(stammdaten);
	assertEquals("Max Mustermann", stammdaten.getName());
	assertTrue(stammdaten.isGesetzlichVertreten());
	assertEquals(3, stammdaten.getAuskunftsSperreGruende().size());
	assertEquals("Grund 1", stammdaten.getAuskunftsSperreGruende().get(0));
	assertNull(stammdaten.getAuskunftsSperreGruende().get(1));
	assertEquals("Grund 2", stammdaten.getAuskunftsSperreGruende().get(2));
  }

  @Test
  void test_searchByFachschluessel_PartnerListe_GesetzlichVertreten_False_Output_NULL() throws Exception {
	Mockito.when(mockedDtoPartnerListeLEKIFactory.createDtoPartnerListeLEKIWithFachschluessel(Mockito.any())).thenReturn(null);
	setMaIdentifikationMocks();
	DtoPartnerListeLEKO partnerListe = new DtoPartnerListeLEKO();
	DtoPartnerLEKO      partner      = new DtoPartnerLEKO();
	ReturnInfo          ret          = new ReturnInfo();
	ret.setIstOk("J");
	partner.setZusatzFehlerpaket(ret);
	partnerListe.getDtoPartnerLEKOListe().add(partner);
	Mockito.when(mockedPartnerLesenKurzZpvCaller.call(Mockito.any(), Mockito.any())).thenReturn(partnerListe);

	StammdatenBTO stammdatenBto = new StammdatenBTO();
	stammdatenBto.setName("Max Mustermann");
	Mockito.when(mockedStammdatenBTOExternalServiceMapper.map(Mockito.any(DtoPartnerLEKO.class))).thenReturn(stammdatenBto);

	Mockito.when(mockedDtoBeziehungSUIFactory.createDtoBeziehungSUIWithFachschluessel(Mockito.any())).thenReturn(null);
	Mockito.when(mockedBeziehungSuchenZpvCaller.call(Mockito.any(), Mockito.any(), Mockito.anyBoolean())).thenReturn(new DtoBeziehungListeSUO());

	VollmachtBTO vollmachtBTO = new VollmachtBTO();
	vollmachtBTO.setName("Karl Heinz");

	Mockito.when(mockedVollmachtBTOExternalServiceMapper.mapToBtoList(Mockito.any(List.class))).thenReturn(Collections.singletonList(vollmachtBTO));

	Fachschluessel fachschluessel = Fachschluessel.of("4107071288", "VSNR");
	StammdatenBTO  stammdaten     = service.searchByFachschluessel(fachschluessel);

	assertNotNull(stammdaten);
	assertEquals("Max Mustermann", stammdaten.getName());
	assertFalse(stammdaten.isGesetzlichVertreten());
  }

  @Test
  void test_searchByFachschluessel_PartnerListe_GesetzlichVertreten_False_Output_TwoEntries() throws Exception {
	Mockito.when(mockedDtoPartnerListeLEKIFactory.createDtoPartnerListeLEKIWithFachschluessel(Mockito.any())).thenReturn(null);
	DtoPartnerListeLEKO partnerListe = new DtoPartnerListeLEKO();
	DtoPartnerLEKO      partner      = new DtoPartnerLEKO();
	ReturnInfo          ret          = new ReturnInfo();
	ret.setIstOk("J");
	partner.setZusatzFehlerpaket(ret);
	partnerListe.getDtoPartnerLEKOListe().add(partner);
	Mockito.when(mockedPartnerLesenKurzZpvCaller.call(Mockito.any(), Mockito.any())).thenReturn(partnerListe);

	StammdatenBTO stammdatenBto = new StammdatenBTO();
	stammdatenBto.setName("Max Mustermann");
	Mockito.when(mockedStammdatenBTOExternalServiceMapper.map(Mockito.any(DtoPartnerLEKO.class))).thenReturn(stammdatenBto);

	Mockito.when(mockedDtoBeziehungSUIFactory.createDtoBeziehungSUIWithFachschluessel(Mockito.any())).thenReturn(null);
	Mockito.when(mockedBeziehungSuchenZpvCaller.call(Mockito.any(), Mockito.any(), Mockito.anyBoolean())).thenReturn(new DtoBeziehungListeSUO());
	setMaIdentifikationMocks();

	Fachschluessel fachschluessel = Fachschluessel.of("4107071288", "VSNR");
	StammdatenBTO  stammdaten     = service.searchByFachschluessel(fachschluessel);

	assertNotNull(stammdaten);
	assertEquals("Max Mustermann", stammdaten.getName());
	assertFalse(stammdaten.isGesetzlichVertreten());
  }

  @Test
  void test_searchByFachschluessel_PartnerListe_GesetzlichVertreten_True() throws Exception {
	Mockito.when(mockedDtoPartnerListeLEKIFactory.createDtoPartnerListeLEKIWithFachschluessel(Mockito.any())).thenReturn(null);
	DtoPartnerListeLEKO partnerListe = new DtoPartnerListeLEKO();
	DtoPartnerLEKO      partner      = new DtoPartnerLEKO();
	ReturnInfo          ret          = new ReturnInfo();
	ret.setIstOk("J");
	partner.setZusatzFehlerpaket(ret);
	partnerListe.getDtoPartnerLEKOListe().add(partner);
	Mockito.when(mockedPartnerLesenKurzZpvCaller.call(Mockito.any(), Mockito.any())).thenReturn(partnerListe);

	StammdatenBTO stammdatenBto = new StammdatenBTO();
	stammdatenBto.setName("Max Mustermann");
	Mockito.when(mockedStammdatenBTOExternalServiceMapper.map(Mockito.any(DtoPartnerLEKO.class))).thenReturn(stammdatenBto);

	Mockito.when(mockedDtoBeziehungSUIFactory.createDtoBeziehungSUIWithFachschluessel(Mockito.any())).thenReturn(null);
	DtoBeziehungListeSUO suo = new DtoBeziehungListeSUO();
	suo.getDtoBeziehungAllgemeinSUOListe().add(new DtoBeziehungAllgemeinSUO());
	Mockito.when(mockedBeziehungSuchenZpvCaller.call(Mockito.any(), Mockito.any(), Mockito.anyBoolean())).thenReturn(suo);
	setMaIdentifikationMocks();

	Fachschluessel fachschluessel = Fachschluessel.of("4107071288", "VSNR");
	StammdatenBTO  stammdaten     = service.searchByFachschluessel(fachschluessel);

	assertNotNull(stammdaten);
	assertEquals("Max Mustermann", stammdaten.getName());
	assertTrue(stammdaten.isGesetzlichVertreten());
  }

  @Test
  void test_searchByFachschluessel_PartnerListe_ZpvFehlerpaket_NOK() throws Exception {
	Mockito.when(mockedDtoPartnerListeLEKIFactory.createDtoPartnerListeLEKIWithFachschluessel(Mockito.any())).thenReturn(null);
	DtoPartnerListeLEKO partnerListe = new DtoPartnerListeLEKO();
	DtoPartnerLEKO      partner      = new DtoPartnerLEKO();
	ReturnInfo          ret          = new ReturnInfo();
	ret.setIstOk("N");
	partner.setZusatzFehlerpaket(ret);
	partnerListe.getDtoPartnerLEKOListe().add(partner);
	Mockito.when(mockedPartnerLesenKurzZpvCaller.call(Mockito.any(), Mockito.any())).thenReturn(partnerListe);

	Fachschluessel fachschluessel = Fachschluessel.of("4107071288", "VSNR");
	assertThrows(IllegalStateException.class, () -> service.searchByFachschluessel(fachschluessel));
  }
}
