
package calculatorApp;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the calculatorApp package. 
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

    private final static QName _Multiply_QNAME = new QName("http://applicationserver/", "multiply");
    private final static QName _Modulus_QNAME = new QName("http://applicationserver/", "modulus");
    private final static QName _Substract_QNAME = new QName("http://applicationserver/", "substract");
    private final static QName _ModulusResponse_QNAME = new QName("http://applicationserver/", "modulusResponse");
    private final static QName _DivideResponse_QNAME = new QName("http://applicationserver/", "divideResponse");
    private final static QName _Divide_QNAME = new QName("http://applicationserver/", "divide");
    private final static QName _SubstractResponse_QNAME = new QName("http://applicationserver/", "substractResponse");
    private final static QName _AddResponse_QNAME = new QName("http://applicationserver/", "addResponse");
    private final static QName _MultiplyResponse_QNAME = new QName("http://applicationserver/", "multiplyResponse");
    private final static QName _Add_QNAME = new QName("http://applicationserver/", "add");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: calculatorApp
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Add }
     * 
     */
    public Add createAdd() {
        return new Add();
    }

    /**
     * Create an instance of {@link SubstractResponse }
     * 
     */
    public SubstractResponse createSubstractResponse() {
        return new SubstractResponse();
    }

    /**
     * Create an instance of {@link AddResponse }
     * 
     */
    public AddResponse createAddResponse() {
        return new AddResponse();
    }

    /**
     * Create an instance of {@link MultiplyResponse }
     * 
     */
    public MultiplyResponse createMultiplyResponse() {
        return new MultiplyResponse();
    }

    /**
     * Create an instance of {@link ModulusResponse }
     * 
     */
    public ModulusResponse createModulusResponse() {
        return new ModulusResponse();
    }

    /**
     * Create an instance of {@link Divide }
     * 
     */
    public Divide createDivide() {
        return new Divide();
    }

    /**
     * Create an instance of {@link DivideResponse }
     * 
     */
    public DivideResponse createDivideResponse() {
        return new DivideResponse();
    }

    /**
     * Create an instance of {@link Multiply }
     * 
     */
    public Multiply createMultiply() {
        return new Multiply();
    }

    /**
     * Create an instance of {@link Modulus }
     * 
     */
    public Modulus createModulus() {
        return new Modulus();
    }

    /**
     * Create an instance of {@link Substract }
     * 
     */
    public Substract createSubstract() {
        return new Substract();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Multiply }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://applicationserver/", name = "multiply")
    public JAXBElement<Multiply> createMultiply(Multiply value) {
        return new JAXBElement<Multiply>(_Multiply_QNAME, Multiply.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Modulus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://applicationserver/", name = "modulus")
    public JAXBElement<Modulus> createModulus(Modulus value) {
        return new JAXBElement<Modulus>(_Modulus_QNAME, Modulus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Substract }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://applicationserver/", name = "substract")
    public JAXBElement<Substract> createSubstract(Substract value) {
        return new JAXBElement<Substract>(_Substract_QNAME, Substract.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModulusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://applicationserver/", name = "modulusResponse")
    public JAXBElement<ModulusResponse> createModulusResponse(ModulusResponse value) {
        return new JAXBElement<ModulusResponse>(_ModulusResponse_QNAME, ModulusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DivideResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://applicationserver/", name = "divideResponse")
    public JAXBElement<DivideResponse> createDivideResponse(DivideResponse value) {
        return new JAXBElement<DivideResponse>(_DivideResponse_QNAME, DivideResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Divide }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://applicationserver/", name = "divide")
    public JAXBElement<Divide> createDivide(Divide value) {
        return new JAXBElement<Divide>(_Divide_QNAME, Divide.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubstractResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://applicationserver/", name = "substractResponse")
    public JAXBElement<SubstractResponse> createSubstractResponse(SubstractResponse value) {
        return new JAXBElement<SubstractResponse>(_SubstractResponse_QNAME, SubstractResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://applicationserver/", name = "addResponse")
    public JAXBElement<AddResponse> createAddResponse(AddResponse value) {
        return new JAXBElement<AddResponse>(_AddResponse_QNAME, AddResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultiplyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://applicationserver/", name = "multiplyResponse")
    public JAXBElement<MultiplyResponse> createMultiplyResponse(MultiplyResponse value) {
        return new JAXBElement<MultiplyResponse>(_MultiplyResponse_QNAME, MultiplyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Add }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://applicationserver/", name = "add")
    public JAXBElement<Add> createAdd(Add value) {
        return new JAXBElement<Add>(_Add_QNAME, Add.class, null, value);
    }

}
