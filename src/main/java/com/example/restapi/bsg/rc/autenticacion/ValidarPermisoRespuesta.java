
package com.example.restapi.bsg.rc.autenticacion;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para validarPermisoRespuesta complex type.
 *
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 *
 * <pre>
 * &lt;complexType name="validarPermisoRespuesta"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Digest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Fecha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FechaF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Mensaje" type="{http://bsg.gob.ec/AccesoBSGService}mensajeError" minOccurs="0"/&gt;
 *         &lt;element name="Nonce" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TienePermiso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "validarPermisoRespuesta", propOrder = {
    "digest",
    "fecha",
    "fechaF",
    "mensaje",
    "nonce",
    "tienePermiso"
})
public class ValidarPermisoRespuesta {

    @XmlElement(name = "Digest")
    protected String digest;
    @XmlElement(name = "Fecha")
    protected String fecha;
    @XmlElement(name = "FechaF")
    protected String fechaF;
    @XmlElement(name = "Mensaje")
    protected MensajeError mensaje;
    @XmlElement(name = "Nonce")
    protected String nonce;
    @XmlElement(name = "TienePermiso")
    protected String tienePermiso;

    /**
     * Obtiene el valor de la propiedad digest.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDigest() {
        return digest;
    }

    /**
     * Define el valor de la propiedad digest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDigest(String value) {
        this.digest = value;
    }

    /**
     * Obtiene el valor de la propiedad fecha.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * Define el valor de la propiedad fecha.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFecha(String value) {
        this.fecha = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaF.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFechaF() {
        return fechaF;
    }

    /**
     * Define el valor de la propiedad fechaF.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFechaF(String value) {
        this.fechaF = value;
    }

    /**
     * Obtiene el valor de la propiedad mensaje.
     *
     * @return
     *     possible object is
     *     {@link MensajeError }
     *
     */
    public MensajeError getMensaje() {
        return mensaje;
    }

    /**
     * Define el valor de la propiedad mensaje.
     *
     * @param value
     *     allowed object is
     *     {@link MensajeError }
     *
     */
    public void setMensaje(MensajeError value) {
        this.mensaje = value;
    }

    /**
     * Obtiene el valor de la propiedad nonce.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNonce() {
        return nonce;
    }

    /**
     * Define el valor de la propiedad nonce.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNonce(String value) {
        this.nonce = value;
    }

    /**
     * Obtiene el valor de la propiedad tienePermiso.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTienePermiso() {
        return tienePermiso;
    }

    /**
     * Define el valor de la propiedad tienePermiso.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTienePermiso(String value) {
        this.tienePermiso = value;
    }

}
