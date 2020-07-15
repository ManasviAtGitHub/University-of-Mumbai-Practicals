
package weboperations_service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the weboperations_service package. 
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

    private final static QName _MessageResponse_QNAME = new QName("http://weboperations_service/", "messageResponse");
    private final static QName _SetName_QNAME = new QName("http://weboperations_service/", "setName");
    private final static QName _Message_QNAME = new QName("http://weboperations_service/", "message");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: weboperations_service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SetName }
     * 
     */
    public SetName createSetName() {
        return new SetName();
    }

    /**
     * Create an instance of {@link MessageResponse }
     * 
     */
    public MessageResponse createMessageResponse() {
        return new MessageResponse();
    }

    /**
     * Create an instance of {@link Message }
     * 
     */
    public Message createMessage() {
        return new Message();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MessageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://weboperations_service/", name = "messageResponse")
    public JAXBElement<MessageResponse> createMessageResponse(MessageResponse value) {
        return new JAXBElement<MessageResponse>(_MessageResponse_QNAME, MessageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://weboperations_service/", name = "setName")
    public JAXBElement<SetName> createSetName(SetName value) {
        return new JAXBElement<SetName>(_SetName_QNAME, SetName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Message }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://weboperations_service/", name = "message")
    public JAXBElement<Message> createMessage(Message value) {
        return new JAXBElement<Message>(_Message_QNAME, Message.class, null, value);
    }

}
