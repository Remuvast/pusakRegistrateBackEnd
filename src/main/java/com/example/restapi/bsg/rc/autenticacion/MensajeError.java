
package com.example.restapi.bsg.rc.autenticacion;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para mensajeError complex type.
 *
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 *
 * <pre>
 * &lt;complexType name="mensajeError"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CodError" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DesError" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mensajeError", propOrder = {
    "codError",
    "desError"
})
public class MensajeError {

    @XmlElement(name = "CodError")
    protected String codError;
    @XmlElement(name = "DesError")
    protected String desError;

    /**
     * Obtiene el valor de la propiedad codError.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCodError() {
        return codError;
    }

    /**
     * Define el valor de la propiedad codError.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCodError(String value) {
        this.codError = value;
    }

    /**
     * Obtiene el valor de la propiedad desError.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDesError() {
        return desError;
    }

    /**
     * Define el valor de la propiedad desError.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDesError(String value) {
        this.desError = value;
    }

}
