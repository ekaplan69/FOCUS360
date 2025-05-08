package at.sozvers.noegkk.focus.rest.endpoint.kundenfeedback;

import java.util.List;
import at.sozvers.noegkk.focus.rest.api.feedback.*;
import at.sozvers.noegkk.focus.rest.endpoint.kundenfeedback.mapping.*;
import at.sozvers.noegkk.focus.service.api.kundenfeedback.KundenfeedbackKurzBTO;
import at.sozvers.noegkk.focus.service.common.Fachschluessel;
import at.sozvers.noegkk.focus.service.common.FachschluesselValidator;
import at.sozvers.noegkk.focus.service.kundenfeedback.KundenfeedbackService;
import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class KundenfeedbackController {
  @Inject
  KundenfeedbackService service;
  @Inject
  private FachschluesselValidator                           fachschluesselValidator;
  @Inject
  private KundenfeedbackAendernBusinessRestMapper           kundenfeedbackAendernBusinessRestMapper;
  @Inject
  private KundenfeedbackErstellenBusinessRestMapper         kundenfeedbackErstellenBusinessRestMapper;
  @Inject
  private KundenfeedbackFeedbackgrundBusinessRestMapper     kundenfeedbackFeedbackgrundBusinessRestMapper;
  @Inject
  private KundenfeedbackKurzBusinessRestMapper              kundenfeedbackKurzBusinessRestMapper;
  @Inject
  private KundenfeedbackLangBusinessRestMapper              kundenfeedbackLangBusinessRestMapper;
  @Inject
  private KundenfeedbackThemaBusinessRestMapper             kundenfeedbackThemaBusinessRestMapper;
  @Inject
  private KundenfeedbackThemaFbgBusinessRestMapper          kundenfeedbackThemaFbgBusinessRestMapper;
  @Inject
  private KundenfeedbackUnterkategorieBusinessRestMapper    kundenfeedbackUnterkategorieBusinessRestMapper;
  @Inject
  private KundenfeedbackUnterkategorieFbgBusinessRestMapper kundenfeedbackUnterkategorieFbgBusinessRestMapper;

  public Long createFeedback(KundenfeedbackErstellenDTO dto) {
	return service.createFeedback(kundenfeedbackErstellenBusinessRestMapper.map(dto));
  }

  public List<KundenfeedbackKurzDTO> searchFeedbackKurzListe(String fs, String fsArtKurz, String ersteller) {
	Fachschluessel fachschluessel = null;
	if(fs != null && fsArtKurz != null) {
	  fachschluessel = Fachschluessel.of(fs, fsArtKurz);
	  fachschluesselValidator.validate(fachschluessel);
	}

	List<KundenfeedbackKurzBTO> btoList = service.searchFeedbackKurz(fachschluessel, ersteller);

	return kundenfeedbackKurzBusinessRestMapper.mapToDtoList(btoList);
  }

  public KundenfeedbackLangDTO searchFeedbackLang(Long id) {
	return kundenfeedbackLangBusinessRestMapper.map(service.searchFeedbackLang(id));
  }

  public List<KundenfeedbackFeedbackgrundDTO> searchFeedbackgruende() {
	return kundenfeedbackFeedbackgrundBusinessRestMapper.mapToDtoList(service.searchFeedbackgruende());
  }

  public List<KundenfeedbackThemaFbgMapDTO> searchThemaFbgMaps() {
	return kundenfeedbackThemaFbgBusinessRestMapper.mapToDtoList(service.searchThemaFbgMaps());
  }

  public List<KundenfeedbackThemaDTO> searchThemen() {
	return kundenfeedbackThemaBusinessRestMapper.mapToDtoList(service.searchThemen());
  }

  public List<KundenfeedbackUnterkategorieFbgMapDTO> searchUnterkategorieFbgMaps() {
	return kundenfeedbackUnterkategorieFbgBusinessRestMapper.mapToDtoList(service.searchUnterkategorieFbgMaps());
  }

  public List<KundenfeedbackUnterkategorieDTO> searchUnterkategorien() {
	return kundenfeedbackUnterkategorieBusinessRestMapper.mapToDtoList(service.searchUnterkategorien());
  }

  public Long updateFeedback(KundenfeedbackAendernDTO dto) {
	return service.updateFeedback(kundenfeedbackAendernBusinessRestMapper.map(dto));
  }
}
