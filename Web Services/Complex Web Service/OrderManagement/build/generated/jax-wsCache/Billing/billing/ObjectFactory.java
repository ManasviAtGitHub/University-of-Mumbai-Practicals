
package billing;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the billing package. 
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

    private final static QName _PrintBillResponse_QNAME = new QName("http://billing/", "printBillResponse");
    private final static QName _PrintBill_QNAME = new QName("http://billing/", "printBill");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: billing
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PrintBillResponse }
     * 
     */
    public PrintBillResponse createPrintBillResponse() {
        return new PrintBillResponse();
    }

    /**
     * Create an instance of {@link PrintBill }
     * 
     */
    public PrintBill createPrintBill() {
        return new PrintBill();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrintBillResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://billing/", name = "printBillResponse")
    public JAXBElement<PrintBillResponse> createPrintBillResponse(PrintBillResponse value) {
        return new JAXBElement<PrintBillResponse>(_PrintBillResponse_QNAME, PrintBillResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrintBill }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://billing/", name = "printBill")
    public JAXBElement<PrintBill> createPrintBill(PrintBill value) {
        return new JAXBElement<PrintBill>(_PrintBill_QNAME, PrintBill.class, null, value);
    }

}
