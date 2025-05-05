
package com.example.restapi.bsg.rc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para BusquedaPorNui complex type.
 *
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 *
 * <pre>
 * &lt;complexType name="BusquedaPorNui"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CodigoInstitucion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoAgencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Usuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Contrasenia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NUI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusquedaPorNui", propOrder = {
    "codigoInstitucion",
    "codigoAgencia",
    "usuario",
    "contrasenia",
    "nui"
})
public class BusquedaPorNui {

    @XmlElement(name = "CodigoInstitucion")
    protected String codigoInstitucion;
    @XmlElement(name = "CodigoAgencia")
    protected String codigoAgencia;
    @XmlElement(name = "Usuario")
    protected String usuario;
    @XmlElement(name = "Contrasenia")
    protected String contrasenia;
    @XmlElement(name = "NUI")
    protected String nui;

    /**
     * Obtiene el valor de la propiedad codigoInstitucion.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCodigoInstitucion() {
        return codigoInstitucion;
    }

    /**
     * Define el valor de la propiedad codigoInstitucion.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCodigoInstitucion(String value) {
        this.codigoInstitucion = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoAgencia.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCodigoAgencia() {
        return codigoAgencia;
    }

    /**
     * Define el valor de la propiedad codigoAgencia.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCodigoAgencia(String value) {
        this.codigoAgencia = value;
    }

    /**
     * Obtiene el valor de la propiedad usuario.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * Define el valor de la propiedad usuario.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUsuario(String value) {
        this.usuario = value;
    }

    /**
     * Obtiene el valor de la propiedad contrasenia.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getContrasenia() {
        return contrasenia;
    }

    /**
     * Define el valor de la propiedad contrasenia.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setContrasenia(String value) {
        this.contrasenia = value;
    }

    /**
     * Obtiene el valor de la propiedad nui.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNUI() {
        return nui;
    }

    /**
     * Define el valor de la propiedad nui.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNUI(String value) {
        this.nui = value;
    }

}
