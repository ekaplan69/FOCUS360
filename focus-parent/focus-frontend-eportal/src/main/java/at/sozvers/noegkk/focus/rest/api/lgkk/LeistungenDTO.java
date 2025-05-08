package at.sozvers.noegkk.focus.rest.api.lgkk;

import java.util.List;
import at.sozvers.noegkk.focus.rest.api.common.BaseDTO;
import at.sozvers.noegkk.focus.rest.api.kva.gbfsuc.GebuehrenbefreiungDTO;
import at.sozvers.noegkk.focus.service.api.common.MeldungBTO;

public class LeistungenDTO implements BaseDTO {

  private AuMhRgWegDTO                auMhRgWeg;
  private List<BetreuungszeitenDTO>   betreute;
  private EkosDTO                     ekos;
  private FrtDTO                      frt;
  private List<GebuehrenbefreiungDTO> gbs;
  private HbHmDTO                     hbhm;
  private KhDTO                       kh;
  private LohnPfDTO                   lohnPf;
  private List<MedStDTO>              medSt;
  private List<MeldungBTO>            meldungen;
  private UnfallerhDTO                unfallerh;
  private List<VwstDTO>               vwst;
  private WahWazaDTO                  wahWaza;
  private WazaKoDTO                   wazaKo;

  public AuMhRgWegDTO getAuMhRgWeg() {
	return auMhRgWeg;
  }

  public void setAuMhRgWeg(AuMhRgWegDTO auMhRgWeg) {
	this.auMhRgWeg = auMhRgWeg;
  }

  public List<BetreuungszeitenDTO> getBetreute() {
	return betreute;
  }

  public void setBetreute(List<BetreuungszeitenDTO> betreute) {
	this.betreute = betreute;
  }

  public EkosDTO getEkos() {
	return ekos;
  }

  public void setEkos(EkosDTO ekos) {
	this.ekos = ekos;
  }

  public FrtDTO getFrt() {
	return frt;
  }

  public void setFrt(FrtDTO frt) {
	this.frt = frt;
  }

  public List<GebuehrenbefreiungDTO> getGbs() {
	return gbs;
  }

  public void setGbs(List<GebuehrenbefreiungDTO> gbs) {
	this.gbs = gbs;
  }

  public HbHmDTO getHbhm() {
	return hbhm;
  }

  public void setHbhm(HbHmDTO hbhm) {
	this.hbhm = hbhm;
  }

  public KhDTO getKh() {
	return kh;
  }

  public void setKh(KhDTO kh) {
	this.kh = kh;
  }

  public LohnPfDTO getLohnPf() {
	return lohnPf;
  }

  public void setLohnPf(LohnPfDTO lohnPf) {
	this.lohnPf = lohnPf;
  }

  public List<MedStDTO> getMedSt() {
	return medSt;
  }

  public void setMedSt(List<MedStDTO> medSt) {
	this.medSt = medSt;
  }

  public List<MeldungBTO> getMeldungen() {
	return meldungen;
  }

  public void setMeldungen(List<MeldungBTO> meldungen) {
	this.meldungen = meldungen;
  }

  public UnfallerhDTO getUnfallerh() {
	return unfallerh;
  }

  public void setUnfallerh(UnfallerhDTO unfallerh) {
	this.unfallerh = unfallerh;
  }

  public List<VwstDTO> getVwst() {
	return vwst;
  }

  public void setVwst(List<VwstDTO> vwst) {
	this.vwst = vwst;
  }

  public WahWazaDTO getWahWaza() {
	return wahWaza;
  }

  public void setWahWaza(WahWazaDTO wahWaza) {
	this.wahWaza = wahWaza;
  }

  public WazaKoDTO getWazaKo() {
	return wazaKo;
  }

  public void setWazaKo(WazaKoDTO wazaKo) {
	this.wazaKo = wazaKo;
  }
}
