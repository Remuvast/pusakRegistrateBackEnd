
package com.example.restapi.wsdl.generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.example.restapi.wsdl.generated package. 
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

    private final static QName _BuscarPersonaConDiscapacidadError_QNAME = new QName("http://www.salud.gob.ec/WebServiceSnapDiscapacidades", "BuscarPersonaConDiscapacidadError");
    private final static QName _BuscarPersonaConDiscapacidadResponse_QNAME = new QName("http://www.salud.gob.ec/WebServiceSnapDiscapacidades", "BuscarPersonaConDiscapacidadResponse");
    private final static QName _ProbarConexionError_QNAME = new QName("http://www.salud.gob.ec/WebServiceSnapDiscapacidades", "ProbarConexionError");
    private final static QName _Credenciales_QNAME = new QName("http://www.salud.gob.ec/WebServiceSnapDiscapacidades", "Credenciales");
    private final static QName _DatosAcceso_QNAME = new QName("http://www.salud.gob.ec/WebServiceSnapDiscapacidades", "DatosAcceso");
    private final static QName _ProbarConexionResponse_QNAME = new QName("http://www.salud.gob.ec/WebServiceSnapDiscapacidades", "ProbarConexionResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.example.restapi.wsdl.generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link WebServiceSnapDiscapacidadesFault }
     * 
     */
    public WebServiceSnapDiscapacidadesFault createWebServiceSnapDiscapacidadesFault() {
        return new WebServiceSnapDiscapacidadesFault();
    }

    /**
     * Create an instance of {@link ResultadoProbarConexion }
     * 
     */
    public ResultadoProbarConexion createResultadoProbarConexion() {
        return new ResultadoProbarConexion();
    }

    /**
     * Create an instance of {@link ParametrosAcceso }
     * 
     */
    public ParametrosAcceso createParametrosAcceso() {
        return new ParametrosAcceso();
    }

    /**
     * Create an instance of {@link Credenciales }
     * 
     */
    public Credenciales createCredenciales() {
        return new Credenciales();
    }

    /**
     * Create an instance of {@link ResultadoDiscapacitado }
     * 
     */
    public ResultadoDiscapacitado createResultadoDiscapacitado() {
        return new ResultadoDiscapacitado();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WebServiceSnapDiscapacidadesFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.salud.gob.ec/WebServiceSnapDiscapacidades", name = "BuscarPersonaConDiscapacidadError")
    public JAXBElement<WebServiceSnapDiscapacidadesFault> createBuscarPersonaConDiscapacidadError(WebServiceSnapDiscapacidadesFault value) {
        return new JAXBElement<WebServiceSnapDiscapacidadesFault>(_BuscarPersonaConDiscapacidadError_QNAME, WebServiceSnapDiscapacidadesFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResultadoDiscapacitado }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.salud.gob.ec/WebServiceSnapDiscapacidades", name = "BuscarPersonaConDiscapacidadResponse")
    public JAXBElement<ResultadoDiscapacitado> createBuscarPersonaConDiscapacidadResponse(ResultadoDiscapacitado value) {
        return new JAXBElement<ResultadoDiscapacitado>(_BuscarPersonaConDiscapacidadResponse_QNAME, ResultadoDiscapacitado.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WebServiceSnapDiscapacidadesFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.salud.gob.ec/WebServiceSnapDiscapacidades", name = "ProbarConexionError")
    public JAXBElement<WebServiceSnapDiscapacidadesFault> createProbarConexionError(WebServiceSnapDiscapacidadesFault value) {
        return new JAXBElement<WebServiceSnapDiscapacidadesFault>(_ProbarConexionError_QNAME, WebServiceSnapDiscapacidadesFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Credenciales }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.salud.gob.ec/WebServiceSnapDiscapacidades", name = "Credenciales")
    public JAXBElement<Credenciales> createCredenciales(Credenciales value) {
        return new JAXBElement<Credenciales>(_Credenciales_QNAME, Credenciales.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParametrosAcceso }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.salud.gob.ec/WebServiceSnapDiscapacidades", name = "DatosAcceso")
    public JAXBElement<ParametrosAcceso> createDatosAcceso(ParametrosAcceso value) {
        return new JAXBElement<ParametrosAcceso>(_DatosAcceso_QNAME, ParametrosAcceso.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResultadoProbarConexion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.salud.gob.ec/WebServiceSnapDiscapacidades", name = "ProbarConexionResponse")
    public JAXBElement<ResultadoProbarConexion> createProbarConexionResponse(ResultadoProbarConexion value) {
        return new JAXBElement<ResultadoProbarConexion>(_ProbarConexionResponse_QNAME, ResultadoProbarConexion.class, null, value);
    }

}
