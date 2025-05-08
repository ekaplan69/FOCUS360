package at.sozvers.noegkk.focus.service.api.kva.gbfsuc;

import java.util.Date;
import at.sozvers.noegkk.focus.service.api.common.BaseBTO;
import at.sozvers.noegkk.focus.service.api.common.xml.DateAdapter;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlAccessorType(XmlAccessType.FIELD)
public class GebuehrenbefreiungBTO implements BaseBTO {

  private String befreiung;
  private String befreiungsgrund;
  @XmlJavaTypeAdapter(value=DateAdapter.class)
  private Date   bisDate;
  @XmlJavaTypeAdapter(value=DateAdapter.class)
  private Date   vonDate;

  public String getBefreiung() {
	return befreiung;
  }

  public void setBefreiung(String befreiung) {
	this.befreiung = befreiung;
  }

  public String getBefreiungsgrund() {
	return befreiungsgrund;
  }

  public void setBefreiungsgrund(String befreiungsgrund) {
	this.befreiungsgrund = befreiungsgrund;
  }

  public Date getBisDate() {
	return bisDate;
  }

  public void setBisDate(Date bisDate) {
	this.bisDate = bisDate;
  }

  public Date getVonDate() {
	return vonDate;
  }

  public void setVonDate(Date vonDate) {
	this.vonDate = vonDate;
  }
}
