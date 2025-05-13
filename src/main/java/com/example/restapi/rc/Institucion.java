
package com.example.restapi.rc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for institucion complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="institucion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="datosPrincipales" type="{http://servicio.interoperadorws.interoperacion.dinardap.gob.ec/}datosPrincipales" minOccurs="0"/>
 *         &lt;element name="detalle" type="{http://servicio.interoperadorws.interoperacion.dinardap.gob.ec/}detalle" minOccurs="0"/>
 *         &lt;element name="mensaje" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "institucion", propOrder = {
    "datosPrincipales",
    "detalle",
    "mensaje",
    "nombre"
})
public class Institucion {

    protected DatosPrincipales datosPrincipales;
    protected Detalle detalle;
    protected String mensaje;
    protected String nombre;

    /**
     * Gets the value of the datosPrincipales property.
     *
     * @return
     *     possible object is
     *     {@link DatosPrincipales }
     *
     */
    public DatosPrincipales getDatosPrincipales() {
        return datosPrincipales;
    }

    /**
     * Sets the value of the datosPrincipales property.
     *
     * @param value
     *     allowed object is
     *     {@link DatosPrincipales }
     *
     */
    public void setDatosPrincipales(DatosPrincipales value) {
        this.datosPrincipales = value;
    }

    /**
     * Gets the value of the detalle property.
     *
     * @return
     *     possible object is
     *     {@link Detalle }
     *
     */
    public Detalle getDetalle() {
        return detalle;
    }

    /**
     * Sets the value of the detalle property.
     *
     * @param value
     *     allowed object is
     *     {@link Detalle }
     *
     */
    public void setDetalle(Detalle value) {
        this.detalle = value;
    }

    /**
     * Gets the value of the mensaje property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMensaje() {
        return mensaje;
    }

    /**
     * Sets the value of the mensaje property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMensaje(String value) {
        this.mensaje = value;
    }

    /**
     * Gets the value of the nombre property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Sets the value of the nombre property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNombre(String value) {
        this.nombre = value;
    }
}
