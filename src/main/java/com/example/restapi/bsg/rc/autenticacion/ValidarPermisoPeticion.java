
package com.example.restapi.bsg.rc.autenticacion;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para validarPermisoPeticion complex type.
 *
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 *
 * <pre>
 * &lt;complexType name="validarPermisoPeticion"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Cedula" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Urlsw" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "validarPermisoPeticion", propOrder = {
    "cedula",
    "urlsw"
})
public class ValidarPermisoPeticion {

    @XmlElement(name = "Cedula")
    protected String cedula;
    @XmlElement(name = "Urlsw")
    protected String urlsw;

    /**
     * Obtiene el valor de la propiedad cedula.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCedula() {
        return cedula;
    }

    /**
     * Define el valor de la propiedad cedula.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCedula(String value) {
        this.cedula = value;
    }

    /**
     * Obtiene el valor de la propiedad urlsw.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUrlsw() {
        return urlsw;
    }

    /**
     * Define el valor de la propiedad urlsw.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUrlsw(String value) {
        this.urlsw = value;
    }

}
