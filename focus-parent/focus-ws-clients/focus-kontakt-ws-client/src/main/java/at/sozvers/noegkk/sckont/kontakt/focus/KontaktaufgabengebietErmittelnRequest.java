package at.sozvers.noegkk.sckont.kontakt.focus;

import jakarta.xml.bind.annotation.*;

/**
 * <p>Java-Klasse für kontaktaufgabengebietErmittelnRequest complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="kontaktaufgabengebietErmittelnRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://focus.kontakt.sckont.noegkk.sozvers.at/}standardRequest">
 *       &lt;sequence>
 *          &lt;element minOccurs="0" name="mstCode" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="kontaktaufgabengebietErmittelnRequest")
public class KontaktaufgabengebietErmittelnRequest extends StandardRequest {
  protected Long mstCode;

  public Long getMstCode() {
	return mstCode;
  }

  public void setMstCode(Long mstCode) {
	this.mstCode = mstCode;
  }
}
