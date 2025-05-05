
package com.example.restapi.bsg.rc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para BusquedaPorNombreResponse complex type.
 *
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 *
 * <pre>
 * &lt;complexType name="BusquedaPorNombreResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return" type="{http://www.registrocivil.gob.ec}ciudadanos" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusquedaPorNombreResponse", propOrder = {
    "_return"
})
public class BusquedaPorNombreResponse {

    @XmlElement(name = "return")
    protected Ciudadanos _return;

    /**
     * Obtiene el valor de la propiedad return.
     *
     * @return
     *     possible object is
     *     {@link Ciudadanos }
     *
     */
    public Ciudadanos getReturn() {
        return _return;
    }

    /**
     * Define el valor de la propiedad return.
     *
     * @param value
     *     allowed object is
     *     {@link Ciudadanos }
     *
     */
    public void setReturn(Ciudadanos value) {
        this._return = value;
    }

}
