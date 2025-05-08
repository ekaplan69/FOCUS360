package at.sozvers.noegkk.focus.rest.endpoint.leistungen.mapper;

import java.util.List;
import at.sozvers.noegkk.focus.rest.api.kva.gbfsuc.GebuehrenbefreiungDTO;
import at.sozvers.noegkk.focus.rest.api.lgkk.*;
import at.sozvers.noegkk.focus.rest.endpoint.kva.gbfsuc.GebuehrenbefreiungBusinessRestMapper;
import at.sozvers.noegkk.focus.rest.mapping.BusinessRestMapper;
import at.sozvers.noegkk.focus.service.api.lgkk.LeistungenBTO;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class LeistungenBusinessRestMapper extends BusinessRestMapper<LeistungenDTO, LeistungenBTO> {

  @Inject
  private AuMhRgWegBusinessRestMapper          auMhRgWegBusinessRestMapper;
  @Inject
  private BetreuungszeitenBusinessRestMapper   betreuungszeitenBusinessRestMapper;
  @Inject
  private EkosBusinessRestMapper               ekosBusinessRestMapper;
  @Inject
  private FrtBusinessRestMapper                frtBusinessRestMapper;
  @Inject
  private GebuehrenbefreiungBusinessRestMapper gebuehrenbefreiungBusinessRestMapper;
  @Inject
  private HbHmBusinessRestMapper               hbHmBusinessRestMapper;
  @Inject
  private KhBusinessRestMapper                 khBusinessRestMapper;
  @Inject
  private LohnPfBusinessRestMapper             lohnPfBusinessRestMapper;
  @Inject
  private MedStBusinessRestMapper              medStBusinessRestMapper;
  @Inject
  private UnfallerhBusinessRestMapper          unfallerhBusinessRestMapper;
  @Inject
  private VwstBusinessRestMapper               vwstBusinessRestMapper;
  @Inject
  private WahWazaBusinessRestMapper            wahWazaBusinessRestMapper;
  @Inject
  private WazaKoBusinessRestMapper             wazaKoBusinessRestMapper;

  @Override
  public LeistungenDTO map(LeistungenBTO bto) {
	LeistungenDTO dto = new LeistungenDTO();

	HbHmDTO hbHmDTO = hbHmBusinessRestMapper.map(bto.getHbhm());
	dto.setHbhm(hbHmDTO);

	List<VwstDTO> vwstDTOList = vwstBusinessRestMapper.mapToDtoList(bto.getVwst());
	dto.setVwst(vwstDTOList);

	EkosDTO ekosDTO = ekosBusinessRestMapper.map(bto.getEkos());
	dto.setEkos(ekosDTO);

	List<MedStDTO> medStDTOList = medStBusinessRestMapper.mapToDtoList(bto.getMedSt());
	dto.setMedSt(medStDTOList);

	UnfallerhDTO unfallerhDTO = unfallerhBusinessRestMapper.map(bto.getUnfallerh());
	dto.setUnfallerh(unfallerhDTO);

	FrtDTO frtDTO = frtBusinessRestMapper.map(bto.getFrt());
	dto.setFrt(frtDTO);

	WazaKoDTO wazaKoDTO = wazaKoBusinessRestMapper.map(bto.getWazaKo());
	dto.setWazaKo(wazaKoDTO);

	AuMhRgWegDTO auMhRgWegDTO = auMhRgWegBusinessRestMapper.map(bto.getAuMhRgWeg());
	dto.setAuMhRgWeg(auMhRgWegDTO);

	KhDTO khDTO = khBusinessRestMapper.map(bto.getKh());
	dto.setKh(khDTO);

	WahWazaDTO wahWazaDTO = wahWazaBusinessRestMapper.map(bto.getWahWaza());
	dto.setWahWaza(wahWazaDTO);

	List<BetreuungszeitenDTO> betreuungszeitenDTOList = betreuungszeitenBusinessRestMapper.mapToDtoList(bto.getBetreute());
	dto.setBetreute(betreuungszeitenDTOList);

	LohnPfDTO lohnPfDTO = lohnPfBusinessRestMapper.map(bto.getLohnpf());
	dto.setLohnPf(lohnPfDTO);

	List<GebuehrenbefreiungDTO> gbsDTO = gebuehrenbefreiungBusinessRestMapper.mapToDtoList(bto.getGbs());
	dto.setGbs(gbsDTO);

	dto.setMeldungen(bto.getMeldungen());

	return dto;
  }
}
