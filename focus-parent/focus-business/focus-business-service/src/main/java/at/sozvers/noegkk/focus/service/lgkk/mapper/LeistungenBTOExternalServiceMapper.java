package at.sozvers.noegkk.focus.service.lgkk.mapper;

import java.util.List;
import at.sozvers.noegkk.focus.service.api.lgkk.*;
import at.sozvers.noegkk.focus.service.mapping.BTOExternalServiceMapper;
import at.sozvers.stp.lgkk.webservice.focus360.v20.Focus360ResponseV2;
import at.sozvers.stp.lgkk.webservice.focus360.v20.SucheLGKFaelleV2Response;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class LeistungenBTOExternalServiceMapper extends BTOExternalServiceMapper<LeistungenBTO, SucheLGKFaelleV2Response> {

  @Inject
  AuMhRgWegBTOExternalServiceMapper auMhRgWegBTOExternalServiceMapper;
  @Inject
  BetreuteBTOExternalServiceMapper  betreuteBTOExternalServiceMapper;
  @Inject
  EkosBTOExternalServiceMapper      ekosBTOExternalServiceMapper;
  @Inject
  FrtBTOExternalServiceMapper       frtBTOExternalServiceMapper;
  @Inject
  HbhmBTOExternalServiceMapper      hbhmBTOExternalServiceMapper;
  @Inject
  KhBTOExternalServiceMapper        khBTOExternalServiceMapper;
  @Inject
  LohnpfBTOExternalServiceMapper    lohnpfBTOExternalServiceMapper;
  @Inject
  MedStBTOExternalServiceMapper     medStBTOExternalServiceMapper;
  @Inject
  UnfallerhBTOExternalServiceMapper unfallerhBTOExternalServiceMapper;
  @Inject
  VwstBTOExternalServiceMapper      vwstBTOExternalServiceMapper;
  @Inject
  WahWazaBTOExternalServiceMapper   wahWazaBTOExternalServiceMapper;
  @Inject
  WazaKoBTOExternalServiceMapper    wazaKoBTOExternalServiceMapper;

  @Override
  public LeistungenBTO map(SucheLGKFaelleV2Response responseWrapper) {
	LeistungenBTO      leistungenBTO = new LeistungenBTO();
	Focus360ResponseV2 response      = responseWrapper.getReturn();

	HbHmBTO hbHmBTO = hbhmBTOExternalServiceMapper.map(response.getHbhm());
	leistungenBTO.setHbhm(hbHmBTO);

	List<VwstBTO> vwst = vwstBTOExternalServiceMapper.mapToBtoList(response.getVwst());
	leistungenBTO.setVwst(vwst);

	UnfallerhBTO unfallerhBTO = unfallerhBTOExternalServiceMapper.map(response.getUnfallerh());
	leistungenBTO.setUnfallerh(unfallerhBTO);

	EkosBTO ekosBTO = ekosBTOExternalServiceMapper.map(response.getEkos());
	leistungenBTO.setEkos(ekosBTO);

	List<MedStBTO> medStBTOList = medStBTOExternalServiceMapper.mapToBtoList(response.getMedSt());
	leistungenBTO.setMedSt(medStBTOList);

	FrtBTO frtBTO = frtBTOExternalServiceMapper.map(response.getFrt());
	leistungenBTO.setFrt(frtBTO);

	WazaKoBTO wazaKoBTO = wazaKoBTOExternalServiceMapper.map(response.getWazaKo());
	leistungenBTO.setWazaKo(wazaKoBTO);

	AuMhRgWegBTO auMhRgWegBTO = auMhRgWegBTOExternalServiceMapper.map(response.getAuMhRgWeg());
	leistungenBTO.setAuMhRgWeg(auMhRgWegBTO);

	KhBTO khBTO = khBTOExternalServiceMapper.map(response.getKh());
	leistungenBTO.setKh(khBTO);

	WahWazaBTO wahWazaBTO = wahWazaBTOExternalServiceMapper.map(response.getWahWaza());
	leistungenBTO.setWahWaza(wahWazaBTO);

	List<BetreuungszeitenBTO> betreuungszeitenBTOList = betreuteBTOExternalServiceMapper.mapToBtoList(response.getBetreute());
	leistungenBTO.setBetreute(betreuungszeitenBTOList);

	LohnPfBTO lohnPfBTO = lohnpfBTOExternalServiceMapper.map(response.getLohnpf());
	leistungenBTO.setLohnpf(lohnPfBTO);

	return leistungenBTO;
  }
}
