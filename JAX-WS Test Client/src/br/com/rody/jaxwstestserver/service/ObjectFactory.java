
package br.com.rody.jaxwstestserver.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.com.rody.jaxwstestserver.service package. 
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

    private final static QName _GetEmpregadoById_QNAME = new QName("http://service.jaxwstestserver.rody.com.br/", "getEmpregadoById");
    private final static QName _GetEmpregadoByIdResponse_QNAME = new QName("http://service.jaxwstestserver.rody.com.br/", "getEmpregadoByIdResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.com.rody.jaxwstestserver.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetEmpregadoById }
     * 
     */
    public GetEmpregadoById createGetEmpregadoById() {
        return new GetEmpregadoById();
    }

    /**
     * Create an instance of {@link GetEmpregadoByIdResponse }
     * 
     */
    public GetEmpregadoByIdResponse createGetEmpregadoByIdResponse() {
        return new GetEmpregadoByIdResponse();
    }

    /**
     * Create an instance of {@link Empregado }
     * 
     */
    public Empregado createEmpregado() {
        return new Empregado();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEmpregadoById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.jaxwstestserver.rody.com.br/", name = "getEmpregadoById")
    public JAXBElement<GetEmpregadoById> createGetEmpregadoById(GetEmpregadoById value) {
        return new JAXBElement<GetEmpregadoById>(_GetEmpregadoById_QNAME, GetEmpregadoById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEmpregadoByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.jaxwstestserver.rody.com.br/", name = "getEmpregadoByIdResponse")
    public JAXBElement<GetEmpregadoByIdResponse> createGetEmpregadoByIdResponse(GetEmpregadoByIdResponse value) {
        return new JAXBElement<GetEmpregadoByIdResponse>(_GetEmpregadoByIdResponse_QNAME, GetEmpregadoByIdResponse.class, null, value);
    }

}
