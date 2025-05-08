package at.sozvers.noegkk.focus.service.api.lgkk;

import java.util.List;
import at.sozvers.noegkk.focus.service.api.common.BaseBTO;
import at.sozvers.noegkk.focus.service.api.common.MeldungBTO;
import at.sozvers.noegkk.focus.service.api.kva.gbfsuc.GebuehrenbefreiungBTO;

public class LeistungenBTO implements BaseBTO {

  private AuMhRgWegBTO                auMhRgWeg;
  private List<BetreuungszeitenBTO>   betreute;
  private EkosBTO                     ekos;
  private FrtBTO                      frt;
  private List<GebuehrenbefreiungBTO> gbs;
  private HbHmBTO                     hbhm;
  private KhBTO                       kh;
  private LohnPfBTO                   lohnpf;
  private List<MedStBTO>              medSt;
  private List<MeldungBTO>            meldungen;
  private UnfallerhBTO                unfallerh;
  private List<VwstBTO>               vwst;
  private WahWazaBTO                  wahWaza;
  private WazaKoBTO                   wazaKo;

  public AuMhRgWegBTO getAuMhRgWeg() {
	return auMhRgWeg;
  }

  public void setAuMhRgWeg(AuMhRgWegBTO auMhRgWeg) {
	this.auMhRgWeg = auMhRgWeg;
  }

  public List<BetreuungszeitenBTO> getBetreute() {
	return betreute;
  }

  public void setBetreute(List<BetreuungszeitenBTO> betreute) {
	this.betreute = betreute;
  }

  public EkosBTO getEkos() {
	return ekos;
  }

  public void setEkos(EkosBTO ekos) {
	this.ekos = ekos;
  }

  public FrtBTO getFrt() {
	return frt;
  }

  public void setFrt(FrtBTO frt) {
	this.frt = frt;
  }

  public List<GebuehrenbefreiungBTO> getGbs() {
	return gbs;
  }

  public void setGbs(List<GebuehrenbefreiungBTO> gbs) {
	this.gbs = gbs;
  }

  public HbHmBTO getHbhm() {
	return hbhm;
  }

  public void setHbhm(HbHmBTO hbhm) {
	this.hbhm = hbhm;
  }

  public KhBTO getKh() {
	return kh;
  }

  public void setKh(KhBTO kh) {
	this.kh = kh;
  }

  public LohnPfBTO getLohnpf() {
	return lohnpf;
  }

  public void setLohnpf(LohnPfBTO lohnpf) {
	this.lohnpf = lohnpf;
  }

  public List<MedStBTO> getMedSt() {
	return medSt;
  }

  public void setMedSt(List<MedStBTO> medSt) {
	this.medSt = medSt;
  }

  public List<MeldungBTO> getMeldungen() {
	return meldungen;
  }

  public void setMeldungen(List<MeldungBTO> meldungen) {
	this.meldungen = meldungen;
  }

  public UnfallerhBTO getUnfallerh() {
	return unfallerh;
  }

  public void setUnfallerh(UnfallerhBTO unfallerh) {
	this.unfallerh = unfallerh;
  }

  public List<VwstBTO> getVwst() {
	return vwst;
  }

  public void setVwst(List<VwstBTO> vwst) {
	this.vwst = vwst;
  }

  public WahWazaBTO getWahWaza() {
	return wahWaza;
  }

  public void setWahWaza(WahWazaBTO wahWaza) {
	this.wahWaza = wahWaza;
  }

  public WazaKoBTO getWazaKo() {
	return wazaKo;
  }

  public void setWazaKo(WazaKoBTO wazaKo) {
	this.wazaKo = wazaKo;
  }
}
