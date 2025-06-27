
package com.example.restapi.wsdl.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResultadoDiscapacitado complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResultadoDiscapacitado">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ResultadoConexion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodigoConadis" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Nombres" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Apellidos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Genero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FechaNacimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DeficienciaPredomina" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GradoDiscapacidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PorcentajeDiscapacidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NivelInstruccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Provincia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Canton" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Parroquia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Direccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DireccionReferencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TlfCelular" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FechaConadis" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Mensaje" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResultadoDiscapacitado", propOrder = {
    "resultadoConexion",
    "codigoConadis",
    "nombres",
    "apellidos",
    "genero",
    "fechaNacimiento",
    "deficienciaPredomina",
    "gradoDiscapacidad",
    "porcentajeDiscapacidad",
    "nivelInstruccion",
    "provincia",
    "canton",
    "parroquia",
    "direccion",
    "direccionReferencia",
    "tlfCelular",
    "fechaConadis",
    "mensaje"
})
public class ResultadoDiscapacitado {

    @XmlElement(name = "ResultadoConexion")
    protected String resultadoConexion;
    @XmlElement(name = "CodigoConadis")
    protected String codigoConadis;
    @XmlElement(name = "Nombres")
    protected String nombres;
    @XmlElement(name = "Apellidos")
    protected String apellidos;
    @XmlElement(name = "Genero")
    protected String genero;
    @XmlElement(name = "FechaNacimiento")
    protected String fechaNacimiento;
    @XmlElement(name = "DeficienciaPredomina")
    protected String deficienciaPredomina;
    @XmlElement(name = "GradoDiscapacidad")
    protected String gradoDiscapacidad;
    @XmlElement(name = "PorcentajeDiscapacidad")
    protected String porcentajeDiscapacidad;
    @XmlElement(name = "NivelInstruccion")
    protected String nivelInstruccion;
    @XmlElement(name = "Provincia")
    protected String provincia;
    @XmlElement(name = "Canton")
    protected String canton;
    @XmlElement(name = "Parroquia")
    protected String parroquia;
    @XmlElement(name = "Direccion")
    protected String direccion;
    @XmlElement(name = "DireccionReferencia")
    protected String direccionReferencia;
    @XmlElement(name = "TlfCelular")
    protected String tlfCelular;
    @XmlElement(name = "FechaConadis")
    protected String fechaConadis;
    @XmlElement(name = "Mensaje")
    protected String mensaje;

    /**
     * Gets the value of the resultadoConexion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultadoConexion() {
        return resultadoConexion;
    }

    /**
     * Sets the value of the resultadoConexion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultadoConexion(String value) {
        this.resultadoConexion = value;
    }

    /**
     * Gets the value of the codigoConadis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoConadis() {
        return codigoConadis;
    }

    /**
     * Sets the value of the codigoConadis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoConadis(String value) {
        this.codigoConadis = value;
    }

    /**
     * Gets the value of the nombres property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombres() {
        return nombres;
    }

    /**
     * Sets the value of the nombres property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombres(String value) {
        this.nombres = value;
    }

    /**
     * Gets the value of the apellidos property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * Sets the value of the apellidos property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApellidos(String value) {
        this.apellidos = value;
    }

    /**
     * Gets the value of the genero property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenero() {
        return genero;
    }

    /**
     * Sets the value of the genero property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenero(String value) {
        this.genero = value;
    }

    /**
     * Gets the value of the fechaNacimiento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * Sets the value of the fechaNacimiento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaNacimiento(String value) {
        this.fechaNacimiento = value;
    }

    /**
     * Gets the value of the deficienciaPredomina property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeficienciaPredomina() {
        return deficienciaPredomina;
    }

    /**
     * Sets the value of the deficienciaPredomina property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeficienciaPredomina(String value) {
        this.deficienciaPredomina = value;
    }

    /**
     * Gets the value of the gradoDiscapacidad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGradoDiscapacidad() {
        return gradoDiscapacidad;
    }

    /**
     * Sets the value of the gradoDiscapacidad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGradoDiscapacidad(String value) {
        this.gradoDiscapacidad = value;
    }

    /**
     * Gets the value of the porcentajeDiscapacidad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPorcentajeDiscapacidad() {
        return porcentajeDiscapacidad;
    }

    /**
     * Sets the value of the porcentajeDiscapacidad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPorcentajeDiscapacidad(String value) {
        this.porcentajeDiscapacidad = value;
    }

    /**
     * Gets the value of the nivelInstruccion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNivelInstruccion() {
        return nivelInstruccion;
    }

    /**
     * Sets the value of the nivelInstruccion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNivelInstruccion(String value) {
        this.nivelInstruccion = value;
    }

    /**
     * Gets the value of the provincia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvincia() {
        return provincia;
    }

    /**
     * Sets the value of the provincia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvincia(String value) {
        this.provincia = value;
    }

    /**
     * Gets the value of the canton property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCanton() {
        return canton;
    }

    /**
     * Sets the value of the canton property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCanton(String value) {
        this.canton = value;
    }

    /**
     * Gets the value of the parroquia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParroquia() {
        return parroquia;
    }

    /**
     * Sets the value of the parroquia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParroquia(String value) {
        this.parroquia = value;
    }

    /**
     * Gets the value of the direccion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Sets the value of the direccion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDireccion(String value) {
        this.direccion = value;
    }

    /**
     * Gets the value of the direccionReferencia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDireccionReferencia() {
        return direccionReferencia;
    }

    /**
     * Sets the value of the direccionReferencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDireccionReferencia(String value) {
        this.direccionReferencia = value;
    }

    /**
     * Gets the value of the tlfCelular property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTlfCelular() {
        return tlfCelular;
    }

    /**
     * Sets the value of the tlfCelular property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTlfCelular(String value) {
        this.tlfCelular = value;
    }

    /**
     * Gets the value of the fechaConadis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaConadis() {
        return fechaConadis;
    }

    /**
     * Sets the value of the fechaConadis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaConadis(String value) {
        this.fechaConadis = value;
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

}
