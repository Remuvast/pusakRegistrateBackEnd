
package com.example.restapi.rc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getFichaGeneralResponse complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="getFichaGeneralResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://servicio.interoperadorws.interoperacion.dinardap.gob.ec/}fichaGeneral" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getFichaGeneralResponse", propOrder = {
    "_return"
})
public class GetFichaGeneralResponse {

    @XmlElement(name = "return")
    protected FichaGeneral _return;

    /**
     * Gets the value of the return property.
     *
     * @return
     *     possible object is
     *     {@link FichaGeneral }
     *
     */
    public FichaGeneral getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     *
     * @param value
     *     allowed object is
     *     {@link FichaGeneral }
     *
     */
    public void setReturn(FichaGeneral value) {
        this._return = value;
    }

}
