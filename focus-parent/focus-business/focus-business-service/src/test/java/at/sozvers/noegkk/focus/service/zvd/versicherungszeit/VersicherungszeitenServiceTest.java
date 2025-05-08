package at.sozvers.noegkk.focus.service.zvd.versicherungszeit;

import java.util.*;
import at.sozialversicherung.schema.zpv.ibs.partnerlesenkurz_15_0.*;
import at.sozvers.focus.persistence.focus.FocusQualifikation;
import at.sozvers.focus.persistence.focus.FocusSteuerung;
import at.sozvers.noegkk.focus.service.common.Fachschluessel;
import at.sozvers.noegkk.focus.service.common.SubsystemNotAvailableException;
import at.sozvers.noegkk.focus.service.zpv.infrastructure.ZpvCaller;
import at.sozvers.noegkk.focus.service.zpv.person.DtoPartnerListeLEKIFactory;
import at.sozvers.noegkk.focus.service.zvd.infrastructure.VersicherungsverhaeltnisLesenRequestFactory;
import at.sozvers.noegkk.focus.ws.client.zvd.ZvdClient;
import at.sozvers.noegkk.jsszpvbe2.action.ZPVServices;
import jakarta.persistence.*;
import jakarta.persistence.Parameter;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.exceptions.base.MockitoException;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class VersicherungszeitenServiceTest {

  @Mock
  private DtoPartnerListeLEKIFactory                          mockedDtoPartnerListeLEKIFactory;
  @Mock
  private EntityManager                                       mockedEm;
  @Mock
  private ZpvCaller<DtoPartnerListeLEKI, DtoPartnerListeLEKO> mockedPartnerLesenKurzZpvCaller;
  @Mock
  private VersicherungsverhaeltnisBTOExternalServiceMapper    mockedVersicherungsverhaeltnisBTOExternalServiceMapper;
  @Mock
  private VersicherungsverhaeltnisLesenRequestFactory         mockedVersicherungsverhaeltnisLesenRequestFactory;
  @Mock
  private ZPVServices                                         mockedZpvServices;
  @Mock
  private ZvdClient                                           mockedZvdClient;
  @InjectMocks
  private VersicherungszeitenService                          service;

  @Test
  void test_getQualifikationKurz_kurzbeschreibungSet() {
	FocusQualifikation qualifikation = new FocusQualifikation();
	qualifikation.setKurzbeschreibung("Kurzbeschreibung");

	Mockito.when(mockedEm.createNamedQuery(FocusQualifikation.QUERY_QUALIFIKATION_ZU_QUALIFIKATIONSCODE, FocusQualifikation.class)).thenReturn(getMockedTypedQueryFocusQualifikation(qualifikation));

	assertEquals("Kurzbeschreibung", service.getQualifikationKurz("Test"));
  }

  private TypedQuery getMockedTypedQueryFocusQualifikation(FocusQualifikation qualifikation) {
	return new TypedQuery<FocusQualifikation>() {
	  @Override
	  public int executeUpdate() {
		return 0;
	  }

	  @Override
	  public int getMaxResults() {
		return 0;
	  }

	  @Override
	  public int getFirstResult() {
		return 0;
	  }

	  @Override
	  public Map<String, Object> getHints() {
		return null;
	  }

	  @Override
	  public Set<Parameter<?>> getParameters() {
		return null;
	  }

	  @Override
	  public Parameter<?> getParameter(String name) {
		return null;
	  }

	  @Override
	  public <T> Parameter<T> getParameter(String name, Class<T> type) {
		return null;
	  }

	  @Override
	  public Parameter<?> getParameter(int position) {
		return null;
	  }

	  @Override
	  public <T> Parameter<T> getParameter(int position, Class<T> type) {
		return null;
	  }

	  @Override
	  public boolean isBound(Parameter<?> param) {
		return false;
	  }

	  @Override
	  public <T> T getParameterValue(Parameter<T> param) {
		return null;
	  }

	  @Override
	  public Object getParameterValue(String name) {
		return null;
	  }

	  @Override
	  public Object getParameterValue(int position) {
		return null;
	  }

	  @Override
	  public FlushModeType getFlushMode() {
		return null;
	  }

	  @Override
	  public LockModeType getLockMode() {
		return null;
	  }

	  @Override
	  public <T> T unwrap(Class<T> cls) {
		return null;
	  }

	  @Override
	  public List<FocusQualifikation> getResultList() {
		return null;
	  }

	  @Override
	  public FocusQualifikation getSingleResult() {
		return qualifikation;
	  }

	  @Override
	  public TypedQuery<FocusQualifikation> setMaxResults(int maxResult) {
		return null;
	  }

	  @Override
	  public TypedQuery<FocusQualifikation> setFirstResult(int startPosition) {
		return null;
	  }

	  @Override
	  public TypedQuery<FocusQualifikation> setHint(String hintName, Object value) {
		return null;
	  }

	  @Override
	  public <T> TypedQuery<FocusQualifikation> setParameter(Parameter<T> param, T value) {
		return null;
	  }

	  @Override
	  public TypedQuery<FocusQualifikation> setParameter(Parameter<Calendar> param, Calendar value, TemporalType temporalType) {
		return null;
	  }

	  @Override
	  public TypedQuery<FocusQualifikation> setParameter(Parameter<Date> param, Date value, TemporalType temporalType) {
		return null;
	  }

	  @Override
	  public TypedQuery<FocusQualifikation> setParameter(String name, Object value) {
		return null;
	  }

	  @Override
	  public TypedQuery<FocusQualifikation> setParameter(String name, Calendar value, TemporalType temporalType) {
		return null;
	  }

	  @Override
	  public TypedQuery<FocusQualifikation> setParameter(String name, Date value, TemporalType temporalType) {
		return null;
	  }

	  @Override
	  public TypedQuery<FocusQualifikation> setParameter(int position, Object value) {
		return null;
	  }

	  @Override
	  public TypedQuery<FocusQualifikation> setParameter(int position, Calendar value, TemporalType temporalType) {
		return null;
	  }

	  @Override
	  public TypedQuery<FocusQualifikation> setParameter(int position, Date value, TemporalType temporalType) {
		return null;
	  }

	  @Override
	  public TypedQuery<FocusQualifikation> setFlushMode(FlushModeType flushMode) {
		return null;
	  }

	  @Override
	  public TypedQuery<FocusQualifikation> setLockMode(LockModeType lockMode) {
		return null;
	  }
	};
  }

  @Test
  void test_getQualifikationKurz_kurzbeschreibung_Null() {
	FocusQualifikation qualifikation = new FocusQualifikation();
	qualifikation.setKurzbeschreibung(null);

	Mockito.when(mockedEm.createNamedQuery(FocusQualifikation.QUERY_QUALIFIKATION_ZU_QUALIFIKATIONSCODE, FocusQualifikation.class)).thenReturn(getMockedTypedQueryFocusQualifikation(null));

	assertEquals("Test", service.getQualifikationKurz("Test"));
  }

  @Test
  void test_getQualifikationKurz_queryResult_Null() {
	Mockito.when(mockedEm.createNamedQuery(FocusQualifikation.QUERY_QUALIFIKATION_ZU_QUALIFIKATIONSCODE, FocusQualifikation.class)).thenReturn(getMockedTypedQueryFocusQualifikation(null));

	assertEquals("Test", service.getQualifikationKurz("Test"));
  }

  @Test
  void test_searchDienstgebername__PartnerListeEmpty() throws Exception {
	Mockito.when(mockedDtoPartnerListeLEKIFactory.createDtoPartnerListeLEKIWithFachschluessel(Mockito.any())).thenReturn(null);
	DtoPartnerListeLEKO partnerListe = new DtoPartnerListeLEKO();
	Mockito.when(mockedPartnerLesenKurzZpvCaller.call(Mockito.any(), Mockito.any())).thenReturn(partnerListe);

	Fachschluessel fachschluessel  = Fachschluessel.of("4107071288", "VSNR");
	String         dienstgebername = service.searchDienstgebername(fachschluessel);

	assertNull(dienstgebername);
  }

  @Test
  void test_searchDienstgebername__namenszeile2_gesetzt() throws Exception {
	DtoPartnerListeLEKO partnerListe = new DtoPartnerListeLEKO();

	DtoNamenszusammenfassungDiakritisch dtoNamenszusammenfassung = new DtoNamenszusammenfassungDiakritisch();
	dtoNamenszusammenfassung.setNamenzeileDiakritisch1("Zeile 1");
	dtoNamenszusammenfassung.setNamenzeileDiakritisch2("Zeile 2");

	DtoPartnerKurz dtoPartnerKurz = new DtoPersonKurz();
	dtoPartnerKurz.setDtoNamenszusammenfassungDiakritisch(dtoNamenszusammenfassung);
	DtoPartnerLEKO partnerLEKO = new DtoPartnerLEKO();
	partnerLEKO.setDtoPartnerKurz(dtoPartnerKurz);
	partnerListe.getDtoPartnerLEKOListe().add(partnerLEKO);

	Mockito.when(mockedDtoPartnerListeLEKIFactory.createDtoPartnerListeLEKIWithFachschluessel(Mockito.any())).thenReturn(null);
	Mockito.when(mockedPartnerLesenKurzZpvCaller.call(Mockito.any(), Mockito.any())).thenReturn(partnerListe);

	Fachschluessel fachschluessel  = Fachschluessel.of("4107071288", "VSNR");
	String         dienstgebername = service.searchDienstgebername(fachschluessel);

	assertEquals("Zeile 1 Zeile 2", dienstgebername);
  }

  @Test
  void test_searchDienstgebername__namenszeile2_null() throws Exception {
	DtoPartnerListeLEKO partnerListe = new DtoPartnerListeLEKO();

	DtoNamenszusammenfassungDiakritisch dtoNamenszusammenfassung = new DtoNamenszusammenfassungDiakritisch();
	dtoNamenszusammenfassung.setNamenzeileDiakritisch1("Zeile 1");
	dtoNamenszusammenfassung.setNamenzeileDiakritisch2(null);

	DtoPartnerKurz dtoPartnerKurz = new DtoPersonKurz();
	dtoPartnerKurz.setDtoNamenszusammenfassungDiakritisch(dtoNamenszusammenfassung);
	DtoPartnerLEKO partnerLEKO = new DtoPartnerLEKO();
	partnerLEKO.setDtoPartnerKurz(dtoPartnerKurz);
	partnerListe.getDtoPartnerLEKOListe().add(partnerLEKO);

	Mockito.when(mockedDtoPartnerListeLEKIFactory.createDtoPartnerListeLEKIWithFachschluessel(Mockito.any())).thenReturn(null);
	Mockito.when(mockedPartnerLesenKurzZpvCaller.call(Mockito.any(), Mockito.any())).thenReturn(partnerListe);

	Fachschluessel fachschluessel  = Fachschluessel.of("4107071288", "VSNR");
	String         dienstgebername = service.searchDienstgebername(fachschluessel);

	assertEquals("Zeile 1", dienstgebername);
  }

  @Test
  void test_searchVersicherungsverhaeltnisseByFachschluessel_throwsException() throws Exception {
	Fachschluessel fachschluessel = Fachschluessel.of("5436211194", "VSNR");

	//zvd client call will throw an exception, so we have a subsystem not available case
	Mockito.when(mockedZvdClient.versicherungsVerhaeltnisseLesen_3_0(Mockito.any())).thenThrow(MockitoException.class);

	Mockito.when(mockedEm.createNamedQuery(FocusSteuerung.QUERY_STEUERUNG_PARAMETER, FocusSteuerung.class)).thenReturn(getMockedTypedQueryFocusSteuerung());

	assertThrows(SubsystemNotAvailableException.class, () -> service.searchVersicherungsverhaeltnisseByFachschluessel(fachschluessel));
  }

  private TypedQuery getMockedTypedQueryFocusSteuerung() {
	return new TypedQuery<FocusSteuerung>() {
	  @Override
	  public int executeUpdate() {
		return 0;
	  }

	  @Override
	  public int getMaxResults() {
		return 0;
	  }

	  @Override
	  public int getFirstResult() {
		return 0;
	  }

	  @Override
	  public Map<String, Object> getHints() {
		return null;
	  }

	  @Override
	  public Set<Parameter<?>> getParameters() {
		return null;
	  }

	  @Override
	  public Parameter<?> getParameter(String name) {
		return null;
	  }

	  @Override
	  public <T> Parameter<T> getParameter(String name, Class<T> type) {
		return null;
	  }

	  @Override
	  public Parameter<?> getParameter(int position) {
		return null;
	  }

	  @Override
	  public <T> Parameter<T> getParameter(int position, Class<T> type) {
		return null;
	  }

	  @Override
	  public boolean isBound(Parameter<?> param) {
		return false;
	  }

	  @Override
	  public <T> T getParameterValue(Parameter<T> param) {
		return null;
	  }

	  @Override
	  public Object getParameterValue(String name) {
		return null;
	  }

	  @Override
	  public Object getParameterValue(int position) {
		return null;
	  }

	  @Override
	  public FlushModeType getFlushMode() {
		return null;
	  }

	  @Override
	  public LockModeType getLockMode() {
		return null;
	  }

	  @Override
	  public <T> T unwrap(Class<T> cls) {
		return null;
	  }

	  @Override
	  public List<FocusSteuerung> getResultList() {
		return null;
	  }

	  @Override
	  public FocusSteuerung getSingleResult() {
		FocusSteuerung steuerung = new FocusSteuerung();
		steuerung.setWert("180");
		return steuerung;
	  }

	  @Override
	  public TypedQuery<FocusSteuerung> setMaxResults(int maxResult) {
		return null;
	  }

	  @Override
	  public TypedQuery<FocusSteuerung> setFirstResult(int startPosition) {
		return null;
	  }

	  @Override
	  public TypedQuery<FocusSteuerung> setHint(String hintName, Object value) {
		return null;
	  }

	  @Override
	  public <T> TypedQuery<FocusSteuerung> setParameter(Parameter<T> param, T value) {
		return null;
	  }

	  @Override
	  public TypedQuery<FocusSteuerung> setParameter(Parameter<Calendar> param, Calendar value, TemporalType temporalType) {
		return null;
	  }

	  @Override
	  public TypedQuery<FocusSteuerung> setParameter(Parameter<Date> param, Date value, TemporalType temporalType) {
		return null;
	  }

	  @Override
	  public TypedQuery<FocusSteuerung> setParameter(String name, Object value) {
		return null;
	  }

	  @Override
	  public TypedQuery<FocusSteuerung> setParameter(String name, Calendar value, TemporalType temporalType) {
		return null;
	  }

	  @Override
	  public TypedQuery<FocusSteuerung> setParameter(String name, Date value, TemporalType temporalType) {
		return null;
	  }

	  @Override
	  public TypedQuery<FocusSteuerung> setParameter(int position, Object value) {
		return null;
	  }

	  @Override
	  public TypedQuery<FocusSteuerung> setParameter(int position, Calendar value, TemporalType temporalType) {
		return null;
	  }

	  @Override
	  public TypedQuery<FocusSteuerung> setParameter(int position, Date value, TemporalType temporalType) {
		return null;
	  }

	  @Override
	  public TypedQuery<FocusSteuerung> setFlushMode(FlushModeType flushMode) {
		return null;
	  }

	  @Override
	  public TypedQuery<FocusSteuerung> setLockMode(LockModeType lockMode) {
		return null;
	  }
	};
  }
}
