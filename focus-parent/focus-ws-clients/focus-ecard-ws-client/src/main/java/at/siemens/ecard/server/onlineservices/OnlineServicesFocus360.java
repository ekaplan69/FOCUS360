package at.siemens.ecard.server.onlineservices;

import at.siemens.ecard.server.onlineservices.valueobject.*;
import jakarta.jws.*;
import jakarta.jws.soap.SOAPBinding;
import jakarta.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by the JAX-WS RI. JAX-WS RI 2.1.7-b01- Generated source version: 2.1
 */
@WebService(name="OnlineServicesFocus360", targetNamespace="http://onlineservices.server.ecard.siemens.at")
@SOAPBinding(parameterStyle=SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({at.siemens.ecard.server.onlineservices.ObjectFactory.class, at.siemens.ecard.server.onlineservices.valueobject.ObjectFactory.class})
public interface OnlineServicesFocus360 {

  /**
   * @param parameters
   *
   * @return returns at.siemens.ecard.server.onlineservices.valueobject.ECardAuskunftV2Resp
   */
  @WebMethod(operationName="ECardAuskunftV2")
  @WebResult(name="ECardAuskunftV2Response", targetNamespace="http://onlineservices.server.ecard.siemens.at", partName="parameters")
  public ECardAuskunftV2Resp eCardAuskunftV2(@WebParam(name="ECardAuskunftV2", targetNamespace="http://onlineservices.server.ecard.siemens.at", partName="parameters") ECardAuskunftV2Req parameters);

  /**
   * @param parameters
   *
   * @return returns at.siemens.ecard.server.onlineservices.valueobject.SVPersonKonsultationenAuskunftV4Resp
   */
  @WebMethod(operationName="SVPersonKonsultationenAuskunftV4")
  @WebResult(name="SVPersonKonsultationenAuskunftV4Response", targetNamespace="http://onlineservices.server.ecard.siemens.at", partName="parameters")
  public SVPersonKonsultationenAuskunftV4Resp svPersonKonsultationenAuskunftV4(
		  @WebParam(name="SVPersonKonsultationenAuskunftV4", targetNamespace="http://onlineservices.server.ecard.siemens.at", partName="parameters") SVPersonKonsultationenAuskunftV4Req parameters);
}
