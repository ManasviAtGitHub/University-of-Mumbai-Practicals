
package sortingmachine;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the sortingmachine package. 
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

    private final static QName _MergeSort_QNAME = new QName("http://sortingmachine/", "mergeSort");
    private final static QName _MergeSortResponse_QNAME = new QName("http://sortingmachine/", "mergeSortResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: sortingmachine
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MergeSortResponse }
     * 
     */
    public MergeSortResponse createMergeSortResponse() {
        return new MergeSortResponse();
    }

    /**
     * Create an instance of {@link MergeSort }
     * 
     */
    public MergeSort createMergeSort() {
        return new MergeSort();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MergeSort }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sortingmachine/", name = "mergeSort")
    public JAXBElement<MergeSort> createMergeSort(MergeSort value) {
        return new JAXBElement<MergeSort>(_MergeSort_QNAME, MergeSort.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MergeSortResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sortingmachine/", name = "mergeSortResponse")
    public JAXBElement<MergeSortResponse> createMergeSortResponse(MergeSortResponse value) {
        return new JAXBElement<MergeSortResponse>(_MergeSortResponse_QNAME, MergeSortResponse.class, null, value);
    }

}
