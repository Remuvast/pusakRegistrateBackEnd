
package  com.example.restapi.msp.autenticacion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ValidarPermiso complex type.
 *
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 *
 * <pre>
 * &lt;complexType name="ValidarPermiso">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ValidarPermisoPeticion" type="{http://bsg.gob.ec/AccesoBSGService}validarPermisoPeticion" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidarPermiso", propOrder = {
    "validarPermisoPeticion"
})
public class ValidarPermiso {

    @XmlElement(name = "ValidarPermisoPeticion")
    protected ValidarPermisoPeticion validarPermisoPeticion;

    /**
     * Obtiene el valor de la propiedad validarPermisoPeticion.
     *
     * @return
     *     possible object is
     *     {@link ValidarPermisoPeticion }
     *
     */
    public ValidarPermisoPeticion getValidarPermisoPeticion() {
        return validarPermisoPeticion;
    }

    /**
     * Define el valor de la propiedad validarPermisoPeticion.
     *
     * @param value
     *     allowed object is
     *     {@link ValidarPermisoPeticion }
     *
     */
    public void setValidarPermisoPeticion(ValidarPermisoPeticion value) {
        this.validarPermisoPeticion = value;
    }

}
