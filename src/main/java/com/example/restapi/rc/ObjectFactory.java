
package com.example.restapi.rc;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the ec.gob.dinardap.interoperacion.interoperadorws.servicio package.
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

    private final static QName _GetFichaGeneralResponse_QNAME = new QName("http://servicio.interoperadorws.interoperacion.dinardap.gob.ec/", "getFichaGeneralResponse");
    private final static QName _GetFichaGeneral_QNAME = new QName("http://servicio.interoperadorws.interoperacion.dinardap.gob.ec/", "getFichaGeneral");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ec.gob.dinardap.interoperacion.interoperadorws.servicio
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetFichaGeneralResponse }
     *
     */
    public GetFichaGeneralResponse createGetFichaGeneralResponse() {
        return new GetFichaGeneralResponse();
    }

    /**
     * Create an instance of {@link DatosPrincipales }
     *
     */
    public DatosPrincipales createDatosPrincipales() {
        return new DatosPrincipales();
    }

    /**
     * Create an instance of {@link Registro }
     *
     */
    public Registro createRegistro() {
        return new Registro();
    }

    /**
     * Create an instance of {@link Item }
     *
     */
    public Item createItem() {
        return new Item();
    }

    /**
     * Create an instance of {@link Detalle }
     *
     */
    public Detalle createDetalle() {
        return new Detalle();
    }

    /**
     * Create an instance of {@link FichaGeneral }
     *
     */
    public FichaGeneral createFichaGeneral() {
        return new FichaGeneral();
    }

    /**
     * Create an instance of {@link GetFichaGeneral }
     *
     */
    public GetFichaGeneral createGetFichaGeneral() {
        return new GetFichaGeneral();
    }

    /**
     * Create an instance of {@link Institucion }
     *
     */
    public Institucion createInstitucion() {
        return new Institucion();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFichaGeneralResponse }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://servicio.interoperadorws.interoperacion.dinardap.gob.ec/", name = "getFichaGeneralResponse")
    public JAXBElement<GetFichaGeneralResponse> createGetFichaGeneralResponse(GetFichaGeneralResponse value) {
        return new JAXBElement<GetFichaGeneralResponse>(_GetFichaGeneralResponse_QNAME, GetFichaGeneralResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFichaGeneral }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://servicio.interoperadorws.interoperacion.dinardap.gob.ec/", name = "getFichaGeneral")
    public JAXBElement<GetFichaGeneral> createGetFichaGeneral(GetFichaGeneral value) {
        return new JAXBElement<GetFichaGeneral>(_GetFichaGeneral_QNAME, GetFichaGeneral.class, null, value);
    }

}
