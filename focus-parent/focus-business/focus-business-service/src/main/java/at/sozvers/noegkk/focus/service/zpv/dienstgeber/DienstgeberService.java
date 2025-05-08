package at.sozvers.noegkk.focus.service.zpv.dienstgeber;

import at.sozialversicherung.schema.zpv.ibs.partnerlesenlang_20_0.DtoPartnerLELI;
import at.sozialversicherung.schema.zpv.ibs.partnerlesenlang_20_0.DtoPartnerLELO;
import at.sozvers.noegkk.focus.service.api.zpv.dienstgeber.DienstgeberBTO;
import at.sozvers.noegkk.focus.service.common.Fachschluessel;
import at.sozvers.noegkk.focus.service.zpv.infrastructure.ZPVService;
import at.sozvers.noegkk.focus.service.zpv.infrastructure.ZpvCaller;
import at.sozvers.noegkk.jsszpvbe2.action.ZPVServices;
import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

import static at.sozvers.noegkk.focus.service.zpv.infrastructure.ZpvConstants.ZPV_FALSE;

@Dependent
public class DienstgeberService {

  @Inject
  private DienstgeberBtoExternalServiceMapper       dienstgeberBtoExternalServiceMapper;
  @Inject
  private DtoPartnerLeliFactory                     dtoPartnerLeliFactory;
  @Inject
  private ZpvCaller<DtoPartnerLELI, DtoPartnerLELO> partnerLesenLangCaller;
  @Inject
  @ZPVService
  private ZPVServices                               zpvServices;

  public DienstgeberBTO searchByFachschluessel(Fachschluessel fachschluessel) throws Exception {
	DienstgeberBTO bto;

	DtoPartnerLELO dtoPartnerLELO = getDtoPartnerListeLELO(fachschluessel);

	bto = dienstgeberBtoExternalServiceMapper.map(dtoPartnerLELO);

	return bto;
  }

  public DtoPartnerLELO getDtoPartnerListeLELO(Fachschluessel fachschluessel) throws Exception {
	DtoPartnerLELI dtoPartnerLELI = dtoPartnerLeliFactory.createDtoPartnerLeli(fachschluessel);

	DtoPartnerLELO dtoPartnerLELO = partnerLesenLangCaller.call(zpvServices::partnerLesenLang_20_0, dtoPartnerLELI);

	if(ZPV_FALSE.equals(dtoPartnerLELO.getFehlerpaket().getIstOk())) {
	  return null;
	}

	return dtoPartnerLELO;
  }
}
