
package paymentservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the paymentservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Status_QNAME = new QName("http://paymentservice/", "status");
    private final static QName _PaymentModeResponse_QNAME = new QName("http://paymentservice/", "paymentModeResponse");
    private final static QName _PaymentMode_QNAME = new QName("http://paymentservice/", "paymentMode");
    private final static QName _StatusResponse_QNAME = new QName("http://paymentservice/", "statusResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: paymentservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link StatusResponse }
     * 
     */
    public StatusResponse createStatusResponse() {
        return new StatusResponse();
    }

    /**
     * Create an instance of {@link PaymentMode }
     * 
     */
    public PaymentMode createPaymentMode() {
        return new PaymentMode();
    }

    /**
     * Create an instance of {@link PaymentModeResponse }
     * 
     */
    public PaymentModeResponse createPaymentModeResponse() {
        return new PaymentModeResponse();
    }

    /**
     * Create an instance of {@link Status }
     * 
     */
    public Status createStatus() {
        return new Status();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Status }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://paymentservice/", name = "status")
    public JAXBElement<Status> createStatus(Status value) {
        return new JAXBElement<Status>(_Status_QNAME, Status.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentModeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://paymentservice/", name = "paymentModeResponse")
    public JAXBElement<PaymentModeResponse> createPaymentModeResponse(PaymentModeResponse value) {
        return new JAXBElement<PaymentModeResponse>(_PaymentModeResponse_QNAME, PaymentModeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentMode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://paymentservice/", name = "paymentMode")
    public JAXBElement<PaymentMode> createPaymentMode(PaymentMode value) {
        return new JAXBElement<PaymentMode>(_PaymentMode_QNAME, PaymentMode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://paymentservice/", name = "statusResponse")
    public JAXBElement<StatusResponse> createStatusResponse(StatusResponse value) {
        return new JAXBElement<StatusResponse>(_StatusResponse_QNAME, StatusResponse.class, null, value);
    }

}
