
package com.example.restapi.rc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getFichaGeneral complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre><
 * &lt;complexType name="getFichaGeneral">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigoPaquete" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroIdentificacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getFichaGeneral", propOrder = {
    "codigoPaquete",
    "numeroIdentificacion"
})
public class GetFichaGeneral {

    protected String codigoPaquete;
    protected String numeroIdentificacion;

    /**
     * Gets the value of the codigoPaquete property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCodigoPaquete() {
        return codigoPaquete;
    }

    /**
     * Sets the value of the codigoPaquete property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCodigoPaquete(String value) {
        this.codigoPaquete = value;
    }

    /**
     * Gets the value of the numeroIdentificacion property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    /**
     * Sets the value of the numeroIdentificacion property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNumeroIdentificacion(String value) {
        this.numeroIdentificacion = value;
    }

}
