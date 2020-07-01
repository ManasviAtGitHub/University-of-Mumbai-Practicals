
package ordermanagement;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ordermanagement package. 
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

    private final static QName _OrderProduct_QNAME = new QName("http://ordermanagement/", "orderProduct");
    private final static QName _OrderProductResponse_QNAME = new QName("http://ordermanagement/", "orderProductResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ordermanagement
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link OrderProductResponse }
     * 
     */
    public OrderProductResponse createOrderProductResponse() {
        return new OrderProductResponse();
    }

    /**
     * Create an instance of {@link OrderProduct }
     * 
     */
    public OrderProduct createOrderProduct() {
        return new OrderProduct();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderProduct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ordermanagement/", name = "orderProduct")
    public JAXBElement<OrderProduct> createOrderProduct(OrderProduct value) {
        return new JAXBElement<OrderProduct>(_OrderProduct_QNAME, OrderProduct.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderProductResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ordermanagement/", name = "orderProductResponse")
    public JAXBElement<OrderProductResponse> createOrderProductResponse(OrderProductResponse value) {
        return new JAXBElement<OrderProductResponse>(_OrderProductResponse_QNAME, OrderProductResponse.class, null, value);
    }

}
