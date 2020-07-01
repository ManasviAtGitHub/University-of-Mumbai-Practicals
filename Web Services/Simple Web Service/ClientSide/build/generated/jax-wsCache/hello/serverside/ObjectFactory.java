
package serverside;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the serverside package. 
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

    private final static QName _NameResponse_QNAME = new QName("http://serverside/", "nameResponse");
    private final static QName _Name_QNAME = new QName("http://serverside/", "name");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: serverside
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Name }
     * 
     */
    public Name createName() {
        return new Name();
    }

    /**
     * Create an instance of {@link NameResponse }
     * 
     */
    public NameResponse createNameResponse() {
        return new NameResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serverside/", name = "nameResponse")
    public JAXBElement<NameResponse> createNameResponse(NameResponse value) {
        return new JAXBElement<NameResponse>(_NameResponse_QNAME, NameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Name }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serverside/", name = "name")
    public JAXBElement<Name> createName(Name value) {
        return new JAXBElement<Name>(_Name_QNAME, Name.class, null, value);
    }

}
