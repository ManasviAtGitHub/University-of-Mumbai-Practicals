
package temperature_service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the temperature_service package. 
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

    private final static QName _FarenheitToCelsius_QNAME = new QName("http://temperature_service/", "farenheit_to_celsius");
    private final static QName _CelsiusToFarenheitResponse_QNAME = new QName("http://temperature_service/", "celsius_to_farenheitResponse");
    private final static QName _CelsiusToFarenheit_QNAME = new QName("http://temperature_service/", "celsius_to_farenheit");
    private final static QName _FarenheitToCelsiusResponse_QNAME = new QName("http://temperature_service/", "farenheit_to_celsiusResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: temperature_service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CelsiusToFarenheit }
     * 
     */
    public CelsiusToFarenheit createCelsiusToFarenheit() {
        return new CelsiusToFarenheit();
    }

    /**
     * Create an instance of {@link FarenheitToCelsiusResponse }
     * 
     */
    public FarenheitToCelsiusResponse createFarenheitToCelsiusResponse() {
        return new FarenheitToCelsiusResponse();
    }

    /**
     * Create an instance of {@link CelsiusToFarenheitResponse }
     * 
     */
    public CelsiusToFarenheitResponse createCelsiusToFarenheitResponse() {
        return new CelsiusToFarenheitResponse();
    }

    /**
     * Create an instance of {@link FarenheitToCelsius }
     * 
     */
    public FarenheitToCelsius createFarenheitToCelsius() {
        return new FarenheitToCelsius();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FarenheitToCelsius }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://temperature_service/", name = "farenheit_to_celsius")
    public JAXBElement<FarenheitToCelsius> createFarenheitToCelsius(FarenheitToCelsius value) {
        return new JAXBElement<FarenheitToCelsius>(_FarenheitToCelsius_QNAME, FarenheitToCelsius.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CelsiusToFarenheitResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://temperature_service/", name = "celsius_to_farenheitResponse")
    public JAXBElement<CelsiusToFarenheitResponse> createCelsiusToFarenheitResponse(CelsiusToFarenheitResponse value) {
        return new JAXBElement<CelsiusToFarenheitResponse>(_CelsiusToFarenheitResponse_QNAME, CelsiusToFarenheitResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CelsiusToFarenheit }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://temperature_service/", name = "celsius_to_farenheit")
    public JAXBElement<CelsiusToFarenheit> createCelsiusToFarenheit(CelsiusToFarenheit value) {
        return new JAXBElement<CelsiusToFarenheit>(_CelsiusToFarenheit_QNAME, CelsiusToFarenheit.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FarenheitToCelsiusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://temperature_service/", name = "farenheit_to_celsiusResponse")
    public JAXBElement<FarenheitToCelsiusResponse> createFarenheitToCelsiusResponse(FarenheitToCelsiusResponse value) {
        return new JAXBElement<FarenheitToCelsiusResponse>(_FarenheitToCelsiusResponse_QNAME, FarenheitToCelsiusResponse.class, null, value);
    }

}
