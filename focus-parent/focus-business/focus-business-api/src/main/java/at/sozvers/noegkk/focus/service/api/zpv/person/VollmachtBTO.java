package at.sozvers.noegkk.focus.service.api.zpv.person;

import java.time.LocalDate;
import at.sozvers.noegkk.focus.service.api.common.BaseBTO;

public class VollmachtBTO implements BaseBTO {
  private String    artDerVollmacht;
  private String    beziehungsart;
  private LocalDate gueltigBis;
  private LocalDate gueltigVon;
  private String    name;

  public VollmachtBTO() {
  }

  public String getArtDerVollmacht() {
	return artDerVollmacht;
  }

  public void setArtDerVollmacht(String artDerVollmacht) {
	this.artDerVollmacht = artDerVollmacht;
  }

  public String getBeziehungsart() {
	return beziehungsart;
  }

  public void setBeziehungsart(String beziehungsart) {
	this.beziehungsart = beziehungsart;
  }

  public LocalDate getGueltigBis() {
	return gueltigBis;
  }

  public void setGueltigBis(LocalDate gueltigBis) {
	this.gueltigBis = gueltigBis;
  }

  public LocalDate getGueltigVon() {
	return gueltigVon;
  }

  public void setGueltigVon(LocalDate gueltigVon) {
	this.gueltigVon = gueltigVon;
  }

  public String getName() {
	return name;
  }

  public void setName(String name) {
	this.name = name;
  }
}
