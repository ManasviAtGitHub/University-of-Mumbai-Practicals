
package serverside;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ServerSideService", targetNamespace = "http://serverside/", wsdlLocation = "http://localhost:9000/hello?wsdl")
public class ServerSideService
    extends Service
{

    private final static URL SERVERSIDESERVICE_WSDL_LOCATION;
    private final static WebServiceException SERVERSIDESERVICE_EXCEPTION;
    private final static QName SERVERSIDESERVICE_QNAME = new QName("http://serverside/", "ServerSideService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:9000/hello?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SERVERSIDESERVICE_WSDL_LOCATION = url;
        SERVERSIDESERVICE_EXCEPTION = e;
    }

    public ServerSideService() {
        super(__getWsdlLocation(), SERVERSIDESERVICE_QNAME);
    }

    public ServerSideService(WebServiceFeature... features) {
        super(__getWsdlLocation(), SERVERSIDESERVICE_QNAME, features);
    }

    public ServerSideService(URL wsdlLocation) {
        super(wsdlLocation, SERVERSIDESERVICE_QNAME);
    }

    public ServerSideService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SERVERSIDESERVICE_QNAME, features);
    }

    public ServerSideService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ServerSideService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ServerSide
     */
    @WebEndpoint(name = "ServerSidePort")
    public ServerSide getServerSidePort() {
        return super.getPort(new QName("http://serverside/", "ServerSidePort"), ServerSide.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ServerSide
     */
    @WebEndpoint(name = "ServerSidePort")
    public ServerSide getServerSidePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://serverside/", "ServerSidePort"), ServerSide.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SERVERSIDESERVICE_EXCEPTION!= null) {
            throw SERVERSIDESERVICE_EXCEPTION;
        }
        return SERVERSIDESERVICE_WSDL_LOCATION;
    }

}
