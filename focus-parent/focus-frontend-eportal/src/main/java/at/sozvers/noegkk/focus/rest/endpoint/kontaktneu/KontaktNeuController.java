package at.sozvers.noegkk.focus.rest.endpoint.kontaktneu;

import java.util.List;
import at.sozvers.noegkk.focus.rest.api.kontaktneu.*;
import at.sozvers.noegkk.focus.service.api.kontaktneu.*;
import at.sozvers.noegkk.focus.service.common.*;
import at.sozvers.noegkk.focus.service.kontaktneu.KontaktNeuService;
import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class KontaktNeuController {

  @Inject
  private FachschluesselValidator                   fachschluesselValidator;
  @Inject
  private GueltigeOesBasicBusinessRestMapper        gueltigeOesBasicBusinessRestMapper;
  @Inject
  private KontaktAbschlussartBusinessRestMapper     kontaktAbschlussartBusinessRestMapper;
  @Inject
  private KontaktAufgabengebietBusinessRestMapper   kontaktAufgabengebietBusinessRestMapper;
  @Inject
  private KontaktAufggAaMstBusinessRestMapper       kontaktAufggAaMstBusinessRestMapper;
  @Inject
  private KontaktAufggKtMstBusinessRestMapper       kontaktAufggKtMstBusinessRestMapper;
  @Inject
  private KontaktAufggSubMapBusinessRestMapper      kontaktAufggSubMapBusinessRestMapper;
  @Inject
  private KontaktAufggThemaMstBusinessRestMapper    kontaktAufggThemaMstBusinessRestMapper;
  @Inject
  private KontaktBasicBusinessRestMapper            kontaktBasicBusinessRestMapper;
  @Inject
  private KontaktBusinessRestMapper                 kontaktBusinessRestMapper;
  @Inject
  private KontaktErstellenAendernBusinessRestMapper kontaktErstellenAendernBusinessRestMapper;
  @Inject
  private KontaktHistorieBusinessRestMapper         kontaktHistorieBusinessRestMapper;
  @Inject
  private KontaktNeuService                         kontaktService;
  @Inject
  private KontaktThemaBusinessRestMapper            kontaktThemaBusinessRestMapper;
  @Inject
  private KontaktUnterthemenBusinessRestMapper      kontaktUnterthemenBusinessRestMapper;
  @Inject
  private KontaktartBusinessRestMapper              kontaktartBusinessRestMapper;
  @Inject
  private OrganisationValidator                     organisationValidator;

  public Long deleteKontakt(Long id) {
	return kontaktService.deleteKontakt(id);
  }

  public List<KontaktHistorieDTO> kontaktHistorieErmitteln(String bearbeiterKennung) {
	return kontaktHistorieBusinessRestMapper.mapToDtoList(kontaktService.kontaktHistorieErmitteln(bearbeiterKennung));
  }

  public Long saveKontakt(KontaktErstellenAendernDTO dto) {
	organisationValidator.validate(Organisation.of(dto.getScIdMa(), dto.getMitarbeiterOe()));

	KontaktErstellenAendernBTO bto = kontaktErstellenAendernBusinessRestMapper.map(dto);
	return kontaktService.saveKontakt(bto);
  }

  public List<KontaktAbschlussartDTO> searchAbschlussarten() {
	return kontaktAbschlussartBusinessRestMapper.mapToDtoList(kontaktService.searchAbschlussarten());
  }

  public List<KontaktAufgabengebietDTO> searchAufgabengebiete(Long mst) {
	return kontaktAufgabengebietBusinessRestMapper.mapToDtoList(kontaktService.searchAufgabengebiete(mst));
  }

  public KontaktDTO searchKontakt(Long kontaktId) {
	KontaktBTO bto = kontaktService.searchKontakt(kontaktId);
	return kontaktBusinessRestMapper.map(bto);
  }

  public List<KontaktAufggAaMstDTO> searchKontaktAufggAaMstMaps(Long mstCode) {
	return kontaktAufggAaMstBusinessRestMapper.mapToDtoList(kontaktService.searchKontaktAufggAaMapping(mstCode));
  }

  public List<KontaktAufggKtMstDTO> searchKontaktAufggKtMstMaps(Long mstCode) {
	return kontaktAufggKtMstBusinessRestMapper.mapToDtoList(kontaktService.searchKontaktAufggKtMapping(mstCode));
  }

  public List<KontaktAufggSubMapDTO> searchKontaktAufggSubMaps(Long aufgabengebietId) {
	List<KontaktAufggSubMapBTO> btoList = kontaktService.searchKontaktAufggSubMaps(aufgabengebietId);

	return kontaktAufggSubMapBusinessRestMapper.mapToDtoList(btoList);
  }

  public List<KontaktAufggThemaMstDTO> searchKontaktAufggThemaMstMaps(Long mstCode) {
	return kontaktAufggThemaMstBusinessRestMapper.mapToDtoList(kontaktService.searchKontaktAufggThemaMapping(mstCode));
  }

  public List<KontaktKontaktartDTO> searchKontaktarten() {
	return kontaktartBusinessRestMapper.mapToDtoList(kontaktService.searchKontaktarten());
  }

  public List<KontaktBasicDTO> searchKontakte(String fs, String fsArt) {
	Fachschluessel fachschluessel = Fachschluessel.of(fs, fsArt);

	fachschluesselValidator.validate(fachschluessel);

	List<KontaktBasicBTO> btoList = kontaktService.searchKontakte(fachschluessel);

	return kontaktBasicBusinessRestMapper.mapToDtoList(btoList);
  }

  public List<KontaktBasicDTO> searchOffeneKontakte(String ersteller) {
	List<KontaktBasicBTO> btoList = kontaktService.searchOffeneKontakte(ersteller);

	return kontaktBasicBusinessRestMapper.mapToDtoList(btoList);
  }

  public List<KontaktBasicDTO> searchOffeneKontakteForFs(String fs, String fsart) {
	List<KontaktBasicBTO> btoList = kontaktService.searchOffeneKontakteForFs(fs, fsart);

	return kontaktBasicBusinessRestMapper.mapToDtoList(btoList);
  }

  public List<KontaktThemaDTO> searchThemen() {
	return kontaktThemaBusinessRestMapper.mapToDtoList(kontaktService.searchThemen());
  }

  public List<KontaktUnterthemaDTO> searchUnterthemen() {
	return kontaktUnterthemenBusinessRestMapper.mapToDtoList(kontaktService.searchUnterthemen());
  }

  public Long updateKontakt(KontaktErstellenAendernDTO dto) {
	KontaktErstellenAendernBTO bto = kontaktErstellenAendernBusinessRestMapper.map(dto);
	return kontaktService.updateKontakt(bto);
  }
}
