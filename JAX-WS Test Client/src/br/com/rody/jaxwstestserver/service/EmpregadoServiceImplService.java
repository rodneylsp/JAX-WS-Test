
package br.com.rody.jaxwstestserver.service;

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
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "EmpregadoServiceImplService", targetNamespace = "http://service.jaxwstestserver.rody.com.br/", wsdlLocation = "http://localhost:8080/qualquernome/empregadoservice?wsdl")
public class EmpregadoServiceImplService
    extends Service
{

    private final static URL EMPREGADOSERVICEIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException EMPREGADOSERVICEIMPLSERVICE_EXCEPTION;
    private final static QName EMPREGADOSERVICEIMPLSERVICE_QNAME = new QName("http://service.jaxwstestserver.rody.com.br/", "EmpregadoServiceImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/qualquernome/empregadoservice?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        EMPREGADOSERVICEIMPLSERVICE_WSDL_LOCATION = url;
        EMPREGADOSERVICEIMPLSERVICE_EXCEPTION = e;
    }

    public EmpregadoServiceImplService() {
        super(__getWsdlLocation(), EMPREGADOSERVICEIMPLSERVICE_QNAME);
    }

    public EmpregadoServiceImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), EMPREGADOSERVICEIMPLSERVICE_QNAME, features);
    }

    public EmpregadoServiceImplService(URL wsdlLocation) {
        super(wsdlLocation, EMPREGADOSERVICEIMPLSERVICE_QNAME);
    }

    public EmpregadoServiceImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, EMPREGADOSERVICEIMPLSERVICE_QNAME, features);
    }

    public EmpregadoServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public EmpregadoServiceImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns EmpregadoServiceImpl
     */
    @WebEndpoint(name = "EmpregadoServiceImplPort")
    public EmpregadoServiceImpl getEmpregadoServiceImplPort() {
        return super.getPort(new QName("http://service.jaxwstestserver.rody.com.br/", "EmpregadoServiceImplPort"), EmpregadoServiceImpl.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns EmpregadoServiceImpl
     */
    @WebEndpoint(name = "EmpregadoServiceImplPort")
    public EmpregadoServiceImpl getEmpregadoServiceImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://service.jaxwstestserver.rody.com.br/", "EmpregadoServiceImplPort"), EmpregadoServiceImpl.class, features);
    }

    private static URL __getWsdlLocation() {
        if (EMPREGADOSERVICEIMPLSERVICE_EXCEPTION!= null) {
            throw EMPREGADOSERVICEIMPLSERVICE_EXCEPTION;
        }
        return EMPREGADOSERVICEIMPLSERVICE_WSDL_LOCATION;
    }

}
