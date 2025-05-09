package at.sozvers.noegkk.sckont.kundenfeedback.focus;

import jakarta.jws.*;
import jakarta.jws.soap.SOAPBinding;
import jakarta.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by the JAX-WS RI. JAX-WS RI 2.2.6b21 Generated source version: 2.2
 */
@WebService(name="SCKONTFeedbackService_1_0", targetNamespace="http://focus.kundenfeedback.sckont.noegkk.sozvers.at/")
@SOAPBinding(parameterStyle=SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({ObjectFactory.class})
public interface SCKONTFeedbackService10 {

  /**
   * @param kfFeedbackAendern
   *
   * @return returns at.sozvers.noegkk.sckont.kundenfeedback.focus.KfFeedbackAendernResponse
   */
  @WebMethod
  @WebResult(name="kfFeedbackAendernResponse", targetNamespace="http://focus.kundenfeedback.sckont.noegkk.sozvers.at/", partName="kfFeedbackAendernResponse")
  public KfFeedbackAendernResponse kfFeedbackAendern(
		  @WebParam(name="kfFeedbackAendern", targetNamespace="http://focus.kundenfeedback.sckont.noegkk.sozvers.at/", partName="kfFeedbackAendern") KfFeedbackAendernRequest kfFeedbackAendern);

  /**
   * @param kfFeedbackErstellen
   *
   * @return returns at.sozvers.noegkk.sckont.kundenfeedback.focus.KfFeedbackErstellenResponse
   */
  @WebMethod
  @WebResult(name="kfFeedbackErstellenResponse", targetNamespace="http://focus.kundenfeedback.sckont.noegkk.sozvers.at/", partName="kfFeedbackErstellenResponse")
  public KfFeedbackErstellenResponse kfFeedbackErstellen(@WebParam(name="kfFeedbackErstellen", targetNamespace="http://focus.kundenfeedback.sckont.noegkk.sozvers.at/",
																   partName="kfFeedbackErstellen") KfFeedbackErstellenRequest kfFeedbackErstellen);

  /**
   * @param kfFeedbackKurzListeErmitteln
   *
   * @return returns at.sozvers.noegkk.sckont.kundenfeedback.focus.KfFeedbackKurzListeErmittelnResponse
   */
  @WebMethod
  @WebResult(name="kfFeedbackKurzListeErmittelnResponse", targetNamespace="http://focus.kundenfeedback.sckont.noegkk.sozvers.at/", partName="kfFeedbackKurzListeErmittelnResponse")
  public KfFeedbackKurzListeErmittelnResponse kfFeedbackKurzListeErmitteln(@WebParam(name="kfFeedbackKurzListeErmitteln", targetNamespace="http://focus.kundenfeedback.sckont.noegkk.sozvers.at/",
																					 partName="kfFeedbackKurzListeErmitteln") KfFeedbackKurzListeErmittelnRequest kfFeedbackKurzListeErmitteln);

  /**
   * @param kfFeedbackLangErmitteln
   *
   * @return returns at.sozvers.noegkk.sckont.kundenfeedback.focus.KfFeedbackLangErmittelnResponse
   */
  @WebMethod
  @WebResult(name="kfFeedbackLangErmittelnResponse", targetNamespace="http://focus.kundenfeedback.sckont.noegkk.sozvers.at/", partName="kfFeedbackLangErmittelnResponse")
  public KfFeedbackLangErmittelnResponse kfFeedbackLangErmitteln(@WebParam(name="kfFeedbackLangErmitteln", targetNamespace="http://focus.kundenfeedback.sckont.noegkk.sozvers.at/",
																		   partName="kfFeedbackLangErmitteln") KfFeedbackLangErmittelnRequest kfFeedbackLangErmitteln);

  /**
   * @param kfFeedbackgruendeErmitteln
   *
   * @return returns at.sozvers.noegkk.sckont.kundenfeedback.focus.KfFeedbackgreundeErmittelnResponse
   */
  @WebMethod
  @WebResult(name="kfFeedbackgruendeErmittelnResponse", targetNamespace="http://focus.kundenfeedback.sckont.noegkk.sozvers.at/", partName="kfFeedbackgruendeErmittelnResponse")
  public KfFeedbackgreundeErmittelnResponse kfFeedbackgruendeErmitteln(@WebParam(name="kfFeedbackgruendeErmitteln", targetNamespace="http://focus.kundenfeedback.sckont.noegkk.sozvers.at/",
																				 partName="kfFeedbackgruendeErmitteln") KfFeedbackgruendeErmittelnRequest kfFeedbackgruendeErmitteln);

  /**
   * @param kfThemaFbgMapsErmitteln
   *
   * @return returns at.sozvers.noegkk.sckont.kundenfeedback.focus.KfThemaFbgMapsErmittelnResponse
   */
  @WebMethod
  @WebResult(name="kfThemaFbgMapsErmittelnResponse", targetNamespace="http://focus.kundenfeedback.sckont.noegkk.sozvers.at/", partName="kfThemaFbgMapsErmittelnResponse")
  public KfThemaFbgMapsErmittelnResponse kfThemaFbgMapsErmitteln(@WebParam(name="kfThemaFbgMapsErmitteln", targetNamespace="http://focus.kundenfeedback.sckont.noegkk.sozvers.at/",
																		   partName="kfThemaFbgMapsErmitteln") KfThemaFbgMapsErmittelnRequest kfThemaFbgMapsErmitteln);

  /**
   * @param kfThemenErmitteln
   *
   * @return returns at.sozvers.noegkk.sckont.kundenfeedback.focus.KfThemenErmittelnResponse
   */
  @WebMethod
  @WebResult(name="kfThemenErmittelnResponse", targetNamespace="http://focus.kundenfeedback.sckont.noegkk.sozvers.at/", partName="kfThemenErmittelnResponse")
  public KfThemenErmittelnResponse kfThemenErmitteln(
		  @WebParam(name="kfThemenErmitteln", targetNamespace="http://focus.kundenfeedback.sckont.noegkk.sozvers.at/", partName="kfThemenErmitteln") KfThemenErmittelnRequest kfThemenErmitteln);

  /**
   * @param kfUnterkategorieFbgMapsErmitteln
   *
   * @return returns at.sozvers.noegkk.sckont.kundenfeedback.focus.KfUnterkategorieFbgMapsErmittelnResponse
   */
  @WebMethod
  @WebResult(name="kfUnterkategorieFbgMapsErmittelnResponse", targetNamespace="http://focus.kundenfeedback.sckont.noegkk.sozvers.at/", partName="kfUnterkategorieFbgMapsErmittelnResponse")
  public KfUnterkategorieFbgMapsErmittelnResponse kfUnterkategorieFbgMapsErmitteln(
		  @WebParam(name="kfUnterkategorieFbgMapsErmitteln", targetNamespace="http://focus.kundenfeedback.sckont.noegkk.sozvers.at/",
					partName="kfUnterkategorieFbgMapsErmitteln") KfUnterkategorieFbgMapsErmittelnRequest kfUnterkategorieFbgMapsErmitteln);

  /**
   * @param kfUnterkategorienErmitteln
   *
   * @return returns at.sozvers.noegkk.sckont.kundenfeedback.focus.KfUnterkategorienErmittelnResponse
   */
  @WebMethod(operationName="KfUnterkategorienErmitteln")
  @WebResult(name="KfUnterkategorienErmittelnResponse", targetNamespace="http://focus.kundenfeedback.sckont.noegkk.sozvers.at/", partName="KfUnterkategorienErmittelnResponse")
  public KfUnterkategorienErmittelnResponse kfUnterkategorienErmitteln(@WebParam(name="KfUnterkategorienErmitteln", targetNamespace="http://focus.kundenfeedback.sckont.noegkk.sozvers.at/",
																				 partName="KfUnterkategorienErmitteln") KfUnterkategorienErmittelnRequest kfUnterkategorienErmitteln);
}
