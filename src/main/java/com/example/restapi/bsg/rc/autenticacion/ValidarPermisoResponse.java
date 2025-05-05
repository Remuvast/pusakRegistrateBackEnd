
package com.example.restapi.bsg.rc.autenticacion;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ValidarPermisoResponse complex type.
 *
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 *
 * <pre>
 * &lt;complexType name="ValidarPermisoResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return" type="{http://bsg.gob.ec/AccesoBSGService}validarPermisoRespuesta" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidarPermisoResponse", propOrder = {
    "_return"
})
public class ValidarPermisoResponse {

    @XmlElement(name = "return")
    protected ValidarPermisoRespuesta _return;

    /**
     * Obtiene el valor de la propiedad return.
     *
     * @return
     *     possible object is
     *     {@link ValidarPermisoRespuesta }
     *
     */
    public ValidarPermisoRespuesta getReturn() {
        return _return;
    }

    /**
     * Define el valor de la propiedad return.
     *
     * @param value
     *     allowed object is
     *     {@link ValidarPermisoRespuesta }
     *
     */
    public void setReturn(ValidarPermisoRespuesta value) {
        this._return = value;
    }

}
