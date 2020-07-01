
package paymentservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "PaymentService", targetNamespace = "http://paymentservice/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface PaymentService {


    /**
     * 
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "status", targetNamespace = "http://paymentservice/", className = "paymentservice.Status")
    @ResponseWrapper(localName = "statusResponse", targetNamespace = "http://paymentservice/", className = "paymentservice.StatusResponse")
    @Action(input = "http://paymentservice/PaymentService/statusRequest", output = "http://paymentservice/PaymentService/statusResponse")
    public boolean status(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "paymentMode", targetNamespace = "http://paymentservice/", className = "paymentservice.PaymentMode")
    @ResponseWrapper(localName = "paymentModeResponse", targetNamespace = "http://paymentservice/", className = "paymentservice.PaymentModeResponse")
    @Action(input = "http://paymentservice/PaymentService/paymentModeRequest", output = "http://paymentservice/PaymentService/paymentModeResponse")
    public String paymentMode(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}
