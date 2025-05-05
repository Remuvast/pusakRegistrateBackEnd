
package com.example.restapi.bsg.rc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ciudadano complex type.
 *
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 *
 * <pre>
 * &lt;complexType name="ciudadano"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Acta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ActaDefuncion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ActaMatrimonio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AnioInscripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Apellidos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Calle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CantonDomicilio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CantonFallecimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CantonInscripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CantonInscripcionDefuncion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CantonInscripcionGenero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CantonMatrimonio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CantonNacimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Clase" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ClaseDefuncion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ClaseMatrimonio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoCantonDomicilio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoCantonFallecimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoCantonInscripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoCantonInscripcionDefuncion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoCantonInscripcionGenero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoCantonMatrimonio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoCantonNacimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoCondicionCedulado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoCondicionDonante" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoDomicilio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoError" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoEstadoCivil" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoGenero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoGrupoEtnico" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoInstruccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoLugarDefuncion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoLugarFallecimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoLugarInscripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoLugarInscripcionGenero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoLugarMatrimonio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoLugarNacimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoNacionalidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoNacionalidadMadre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoNacionalidadPadre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoPaisDomicilio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoPaisFallecimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoPaisInscripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoPaisInscripcionDefuncion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoPaisInscripcionGenero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoPaisMatrimonio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoPaisNacimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoParroquiaDomicilio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoParroquiaFallecimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoParroquiaInscripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoParroquiaInscripcionDefuncion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoParroquiaInscripcionGenero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoParroquiaMatrimonio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoParroquiaNacimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoProfesion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoProvinciaDomicilio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoProvinciaFallecimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoProvinciaInscripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoProvinciaInscripcionDefuncion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoProvinciaInscripcionGenero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoProvinciaMatrimonio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoProvinciaNacimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoSexo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoTipoCedula" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CondicionCedulado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CondicionDonante" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Conyuge" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Domicilio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Error" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EstadoCivil" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FechaActualizacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FechaCedulacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FechaFallecimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FechaInscripcionDefuncion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FechaInscripcionGenero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FechaInscripcionNacimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FechaMatrimonio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FechaNacimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Firma" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="FirmaElectronica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Fotografia" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="Genero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GrupoEtnico" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IndividualDactilar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Instruccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LugarDefuncion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LugarFallecimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LugarInscripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LugarInscripcionGenero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LugarMatrimonio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LugarNacimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NUI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Nacionalidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NacionalidadMadre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NacionalidadPadre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NombreMadre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NombrePadre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Nombres" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NuiConyuge" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NuiMadre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NuiPadre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumeroCasa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Observacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ObservacionInstitucion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Pagina" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PaginaDefuncion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PaginaMatrimonio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PaisDomicilio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PaisFallecimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PaisInscripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PaisInscripcionDefuncion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PaisInscripcionGenero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PaisMatrimonio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PaisNacimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ParroquiaDomicilio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ParroquiaFallecimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ParroquiaInscripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ParroquiaInscripcionDefuncion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ParroquiaInscripcionGenero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ParroquiaMatrimonio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ParroquiaNacimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Profesion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProvinciaDomicilio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProvinciaFallecimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProvinciaInscripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProvinciaInscripcionDefuncion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProvinciaInscripcionGenero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProvinciaMatrimonio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProvinciaNacimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Sexo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TipoCedula" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Tomo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TomoDefuncion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TomoMatrimonio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ciudadano", propOrder = {
    "acta",
    "actaDefuncion",
    "actaMatrimonio",
    "anioInscripcion",
    "apellidos",
    "calle",
    "cantonDomicilio",
    "cantonFallecimiento",
    "cantonInscripcion",
    "cantonInscripcionDefuncion",
    "cantonInscripcionGenero",
    "cantonMatrimonio",
    "cantonNacimiento",
    "clase",
    "claseDefuncion",
    "claseMatrimonio",
    "codigoCantonDomicilio",
    "codigoCantonFallecimiento",
    "codigoCantonInscripcion",
    "codigoCantonInscripcionDefuncion",
    "codigoCantonInscripcionGenero",
    "codigoCantonMatrimonio",
    "codigoCantonNacimiento",
    "codigoCondicionCedulado",
    "codigoCondicionDonante",
    "codigoDomicilio",
    "codigoError",
    "codigoEstadoCivil",
    "codigoGenero",
    "codigoGrupoEtnico",
    "codigoInstruccion",
    "codigoLugarDefuncion",
    "codigoLugarFallecimiento",
    "codigoLugarInscripcion",
    "codigoLugarInscripcionGenero",
    "codigoLugarMatrimonio",
    "codigoLugarNacimiento",
    "codigoNacionalidad",
    "codigoNacionalidadMadre",
    "codigoNacionalidadPadre",
    "codigoPaisDomicilio",
    "codigoPaisFallecimiento",
    "codigoPaisInscripcion",
    "codigoPaisInscripcionDefuncion",
    "codigoPaisInscripcionGenero",
    "codigoPaisMatrimonio",
    "codigoPaisNacimiento",
    "codigoParroquiaDomicilio",
    "codigoParroquiaFallecimiento",
    "codigoParroquiaInscripcion",
    "codigoParroquiaInscripcionDefuncion",
    "codigoParroquiaInscripcionGenero",
    "codigoParroquiaMatrimonio",
    "codigoParroquiaNacimiento",
    "codigoProfesion",
    "codigoProvinciaDomicilio",
    "codigoProvinciaFallecimiento",
    "codigoProvinciaInscripcion",
    "codigoProvinciaInscripcionDefuncion",
    "codigoProvinciaInscripcionGenero",
    "codigoProvinciaMatrimonio",
    "codigoProvinciaNacimiento",
    "codigoSexo",
    "codigoTipoCedula",
    "condicionCedulado",
    "condicionDonante",
    "conyuge",
    "domicilio",
    "error",
    "estadoCivil",
    "fechaActualizacion",
    "fechaCedulacion",
    "fechaFallecimiento",
    "fechaInscripcionDefuncion",
    "fechaInscripcionGenero",
    "fechaInscripcionNacimiento",
    "fechaMatrimonio",
    "fechaNacimiento",
    "firma",
    "firmaElectronica",
    "fotografia",
    "genero",
    "grupoEtnico",
    "individualDactilar",
    "instruccion",
    "lugarDefuncion",
    "lugarFallecimiento",
    "lugarInscripcion",
    "lugarInscripcionGenero",
    "lugarMatrimonio",
    "lugarNacimiento",
    "nui",
    "nacionalidad",
    "nacionalidadMadre",
    "nacionalidadPadre",
    "nombre",
    "nombreMadre",
    "nombrePadre",
    "nombres",
    "nuiConyuge",
    "nuiMadre",
    "nuiPadre",
    "numeroCasa",
    "observacion",
    "observacionInstitucion",
    "pagina",
    "paginaDefuncion",
    "paginaMatrimonio",
    "paisDomicilio",
    "paisFallecimiento",
    "paisInscripcion",
    "paisInscripcionDefuncion",
    "paisInscripcionGenero",
    "paisMatrimonio",
    "paisNacimiento",
    "parroquiaDomicilio",
    "parroquiaFallecimiento",
    "parroquiaInscripcion",
    "parroquiaInscripcionDefuncion",
    "parroquiaInscripcionGenero",
    "parroquiaMatrimonio",
    "parroquiaNacimiento",
    "profesion",
    "provinciaDomicilio",
    "provinciaFallecimiento",
    "provinciaInscripcion",
    "provinciaInscripcionDefuncion",
    "provinciaInscripcionGenero",
    "provinciaMatrimonio",
    "provinciaNacimiento",
    "sexo",
    "tipoCedula",
    "tomo",
    "tomoDefuncion",
    "tomoMatrimonio"
})
public class Ciudadano {

    @XmlElement(name = "Acta")
    protected String acta;
    @XmlElement(name = "ActaDefuncion")
    protected String actaDefuncion;
    @XmlElement(name = "ActaMatrimonio")
    protected String actaMatrimonio;
    @XmlElement(name = "AnioInscripcion")
    protected String anioInscripcion;
    @XmlElement(name = "Apellidos")
    protected String apellidos;
    @XmlElement(name = "Calle")
    protected String calle;
    @XmlElement(name = "CantonDomicilio")
    protected String cantonDomicilio;
    @XmlElement(name = "CantonFallecimiento")
    protected String cantonFallecimiento;
    @XmlElement(name = "CantonInscripcion")
    protected String cantonInscripcion;
    @XmlElement(name = "CantonInscripcionDefuncion")
    protected String cantonInscripcionDefuncion;
    @XmlElement(name = "CantonInscripcionGenero")
    protected String cantonInscripcionGenero;
    @XmlElement(name = "CantonMatrimonio")
    protected String cantonMatrimonio;
    @XmlElement(name = "CantonNacimiento")
    protected String cantonNacimiento;
    @XmlElement(name = "Clase")
    protected String clase;
    @XmlElement(name = "ClaseDefuncion")
    protected String claseDefuncion;
    @XmlElement(name = "ClaseMatrimonio")
    protected String claseMatrimonio;
    @XmlElement(name = "CodigoCantonDomicilio")
    protected String codigoCantonDomicilio;
    @XmlElement(name = "CodigoCantonFallecimiento")
    protected String codigoCantonFallecimiento;
    @XmlElement(name = "CodigoCantonInscripcion")
    protected String codigoCantonInscripcion;
    @XmlElement(name = "CodigoCantonInscripcionDefuncion")
    protected String codigoCantonInscripcionDefuncion;
    @XmlElement(name = "CodigoCantonInscripcionGenero")
    protected String codigoCantonInscripcionGenero;
    @XmlElement(name = "CodigoCantonMatrimonio")
    protected String codigoCantonMatrimonio;
    @XmlElement(name = "CodigoCantonNacimiento")
    protected String codigoCantonNacimiento;
    @XmlElement(name = "CodigoCondicionCedulado")
    protected String codigoCondicionCedulado;
    @XmlElement(name = "CodigoCondicionDonante")
    protected String codigoCondicionDonante;
    @XmlElement(name = "CodigoDomicilio")
    protected String codigoDomicilio;
    @XmlElement(name = "CodigoError")
    protected String codigoError;
    @XmlElement(name = "CodigoEstadoCivil")
    protected String codigoEstadoCivil;
    @XmlElement(name = "CodigoGenero")
    protected String codigoGenero;
    @XmlElement(name = "CodigoGrupoEtnico")
    protected String codigoGrupoEtnico;
    @XmlElement(name = "CodigoInstruccion")
    protected String codigoInstruccion;
    @XmlElement(name = "CodigoLugarDefuncion")
    protected String codigoLugarDefuncion;
    @XmlElement(name = "CodigoLugarFallecimiento")
    protected String codigoLugarFallecimiento;
    @XmlElement(name = "CodigoLugarInscripcion")
    protected String codigoLugarInscripcion;
    @XmlElement(name = "CodigoLugarInscripcionGenero")
    protected String codigoLugarInscripcionGenero;
    @XmlElement(name = "CodigoLugarMatrimonio")
    protected String codigoLugarMatrimonio;
    @XmlElement(name = "CodigoLugarNacimiento")
    protected String codigoLugarNacimiento;
    @XmlElement(name = "CodigoNacionalidad")
    protected String codigoNacionalidad;
    @XmlElement(name = "CodigoNacionalidadMadre")
    protected String codigoNacionalidadMadre;
    @XmlElement(name = "CodigoNacionalidadPadre")
    protected String codigoNacionalidadPadre;
    @XmlElement(name = "CodigoPaisDomicilio")
    protected String codigoPaisDomicilio;
    @XmlElement(name = "CodigoPaisFallecimiento")
    protected String codigoPaisFallecimiento;
    @XmlElement(name = "CodigoPaisInscripcion")
    protected String codigoPaisInscripcion;
    @XmlElement(name = "CodigoPaisInscripcionDefuncion")
    protected String codigoPaisInscripcionDefuncion;
    @XmlElement(name = "CodigoPaisInscripcionGenero")
    protected String codigoPaisInscripcionGenero;
    @XmlElement(name = "CodigoPaisMatrimonio")
    protected String codigoPaisMatrimonio;
    @XmlElement(name = "CodigoPaisNacimiento")
    protected String codigoPaisNacimiento;
    @XmlElement(name = "CodigoParroquiaDomicilio")
    protected String codigoParroquiaDomicilio;
    @XmlElement(name = "CodigoParroquiaFallecimiento")
    protected String codigoParroquiaFallecimiento;
    @XmlElement(name = "CodigoParroquiaInscripcion")
    protected String codigoParroquiaInscripcion;
    @XmlElement(name = "CodigoParroquiaInscripcionDefuncion")
    protected String codigoParroquiaInscripcionDefuncion;
    @XmlElement(name = "CodigoParroquiaInscripcionGenero")
    protected String codigoParroquiaInscripcionGenero;
    @XmlElement(name = "CodigoParroquiaMatrimonio")
    protected String codigoParroquiaMatrimonio;
    @XmlElement(name = "CodigoParroquiaNacimiento")
    protected String codigoParroquiaNacimiento;
    @XmlElement(name = "CodigoProfesion")
    protected String codigoProfesion;
    @XmlElement(name = "CodigoProvinciaDomicilio")
    protected String codigoProvinciaDomicilio;
    @XmlElement(name = "CodigoProvinciaFallecimiento")
    protected String codigoProvinciaFallecimiento;
    @XmlElement(name = "CodigoProvinciaInscripcion")
    protected String codigoProvinciaInscripcion;
    @XmlElement(name = "CodigoProvinciaInscripcionDefuncion")
    protected String codigoProvinciaInscripcionDefuncion;
    @XmlElement(name = "CodigoProvinciaInscripcionGenero")
    protected String codigoProvinciaInscripcionGenero;
    @XmlElement(name = "CodigoProvinciaMatrimonio")
    protected String codigoProvinciaMatrimonio;
    @XmlElement(name = "CodigoProvinciaNacimiento")
    protected String codigoProvinciaNacimiento;
    @XmlElement(name = "CodigoSexo")
    protected String codigoSexo;
    @XmlElement(name = "CodigoTipoCedula")
    protected String codigoTipoCedula;
    @XmlElement(name = "CondicionCedulado")
    protected String condicionCedulado;
    @XmlElement(name = "CondicionDonante")
    protected String condicionDonante;
    @XmlElement(name = "Conyuge")
    protected String conyuge;
    @XmlElement(name = "Domicilio")
    protected String domicilio;
    @XmlElement(name = "Error")
    protected String error;
    @XmlElement(name = "EstadoCivil")
    protected String estadoCivil;
    @XmlElement(name = "FechaActualizacion")
    protected String fechaActualizacion;
    @XmlElement(name = "FechaCedulacion")
    protected String fechaCedulacion;
    @XmlElement(name = "FechaFallecimiento")
    protected String fechaFallecimiento;
    @XmlElement(name = "FechaInscripcionDefuncion")
    protected String fechaInscripcionDefuncion;
    @XmlElement(name = "FechaInscripcionGenero")
    protected String fechaInscripcionGenero;
    @XmlElement(name = "FechaInscripcionNacimiento")
    protected String fechaInscripcionNacimiento;
    @XmlElement(name = "FechaMatrimonio")
    protected String fechaMatrimonio;
    @XmlElement(name = "FechaNacimiento")
    protected String fechaNacimiento;
    @XmlElement(name = "Firma")
    protected byte[] firma;
    @XmlElement(name = "FirmaElectronica")
    protected String firmaElectronica;
    @XmlElement(name = "Fotografia")
    protected byte[] fotografia;
    @XmlElement(name = "Genero")
    protected String genero;
    @XmlElement(name = "GrupoEtnico")
    protected String grupoEtnico;
    @XmlElement(name = "IndividualDactilar")
    protected String individualDactilar;
    @XmlElement(name = "Instruccion")
    protected String instruccion;
    @XmlElement(name = "LugarDefuncion")
    protected String lugarDefuncion;
    @XmlElement(name = "LugarFallecimiento")
    protected String lugarFallecimiento;
    @XmlElement(name = "LugarInscripcion")
    protected String lugarInscripcion;
    @XmlElement(name = "LugarInscripcionGenero")
    protected String lugarInscripcionGenero;
    @XmlElement(name = "LugarMatrimonio")
    protected String lugarMatrimonio;
    @XmlElement(name = "LugarNacimiento")
    protected String lugarNacimiento;
    @XmlElement(name = "NUI")
    protected String nui;
    @XmlElement(name = "Nacionalidad")
    protected String nacionalidad;
    @XmlElement(name = "NacionalidadMadre")
    protected String nacionalidadMadre;
    @XmlElement(name = "NacionalidadPadre")
    protected String nacionalidadPadre;
    @XmlElement(name = "Nombre")
    protected String nombre;
    @XmlElement(name = "NombreMadre")
    protected String nombreMadre;
    @XmlElement(name = "NombrePadre")
    protected String nombrePadre;
    @XmlElement(name = "Nombres")
    protected String nombres;
    @XmlElement(name = "NuiConyuge")
    protected String nuiConyuge;
    @XmlElement(name = "NuiMadre")
    protected String nuiMadre;
    @XmlElement(name = "NuiPadre")
    protected String nuiPadre;
    @XmlElement(name = "NumeroCasa")
    protected String numeroCasa;
    @XmlElement(name = "Observacion")
    protected String observacion;
    @XmlElement(name = "ObservacionInstitucion")
    protected String observacionInstitucion;
    @XmlElement(name = "Pagina")
    protected String pagina;
    @XmlElement(name = "PaginaDefuncion")
    protected String paginaDefuncion;
    @XmlElement(name = "PaginaMatrimonio")
    protected String paginaMatrimonio;
    @XmlElement(name = "PaisDomicilio")
    protected String paisDomicilio;
    @XmlElement(name = "PaisFallecimiento")
    protected String paisFallecimiento;
    @XmlElement(name = "PaisInscripcion")
    protected String paisInscripcion;
    @XmlElement(name = "PaisInscripcionDefuncion")
    protected String paisInscripcionDefuncion;
    @XmlElement(name = "PaisInscripcionGenero")
    protected String paisInscripcionGenero;
    @XmlElement(name = "PaisMatrimonio")
    protected String paisMatrimonio;
    @XmlElement(name = "PaisNacimiento")
    protected String paisNacimiento;
    @XmlElement(name = "ParroquiaDomicilio")
    protected String parroquiaDomicilio;
    @XmlElement(name = "ParroquiaFallecimiento")
    protected String parroquiaFallecimiento;
    @XmlElement(name = "ParroquiaInscripcion")
    protected String parroquiaInscripcion;
    @XmlElement(name = "ParroquiaInscripcionDefuncion")
    protected String parroquiaInscripcionDefuncion;
    @XmlElement(name = "ParroquiaInscripcionGenero")
    protected String parroquiaInscripcionGenero;
    @XmlElement(name = "ParroquiaMatrimonio")
    protected String parroquiaMatrimonio;
    @XmlElement(name = "ParroquiaNacimiento")
    protected String parroquiaNacimiento;
    @XmlElement(name = "Profesion")
    protected String profesion;
    @XmlElement(name = "ProvinciaDomicilio")
    protected String provinciaDomicilio;
    @XmlElement(name = "ProvinciaFallecimiento")
    protected String provinciaFallecimiento;
    @XmlElement(name = "ProvinciaInscripcion")
    protected String provinciaInscripcion;
    @XmlElement(name = "ProvinciaInscripcionDefuncion")
    protected String provinciaInscripcionDefuncion;
    @XmlElement(name = "ProvinciaInscripcionGenero")
    protected String provinciaInscripcionGenero;
    @XmlElement(name = "ProvinciaMatrimonio")
    protected String provinciaMatrimonio;
    @XmlElement(name = "ProvinciaNacimiento")
    protected String provinciaNacimiento;
    @XmlElement(name = "Sexo")
    protected String sexo;
    @XmlElement(name = "TipoCedula")
    protected String tipoCedula;
    @XmlElement(name = "Tomo")
    protected String tomo;
    @XmlElement(name = "TomoDefuncion")
    protected String tomoDefuncion;
    @XmlElement(name = "TomoMatrimonio")
    protected String tomoMatrimonio;

    /**
     * Obtiene el valor de la propiedad acta.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getActa() {
        return acta;
    }

    /**
     * Define el valor de la propiedad acta.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setActa(String value) {
        this.acta = value;
    }

    /**
     * Obtiene el valor de la propiedad actaDefuncion.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getActaDefuncion() {
        return actaDefuncion;
    }

    /**
     * Define el valor de la propiedad actaDefuncion.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setActaDefuncion(String value) {
        this.actaDefuncion = value;
    }

    /**
     * Obtiene el valor de la propiedad actaMatrimonio.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getActaMatrimonio() {
        return actaMatrimonio;
    }

    /**
     * Define el valor de la propiedad actaMatrimonio.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setActaMatrimonio(String value) {
        this.actaMatrimonio = value;
    }

    /**
     * Obtiene el valor de la propiedad anioInscripcion.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAnioInscripcion() {
        return anioInscripcion;
    }

    /**
     * Define el valor de la propiedad anioInscripcion.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAnioInscripcion(String value) {
        this.anioInscripcion = value;
    }

    /**
     * Obtiene el valor de la propiedad apellidos.
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
     * Define el valor de la propiedad apellidos.
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
     * Obtiene el valor de la propiedad calle.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCalle() {
        return calle;
    }

    /**
     * Define el valor de la propiedad calle.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCalle(String value) {
        this.calle = value;
    }

    /**
     * Obtiene el valor de la propiedad cantonDomicilio.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCantonDomicilio() {
        return cantonDomicilio;
    }

    /**
     * Define el valor de la propiedad cantonDomicilio.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCantonDomicilio(String value) {
        this.cantonDomicilio = value;
    }

    /**
     * Obtiene el valor de la propiedad cantonFallecimiento.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCantonFallecimiento() {
        return cantonFallecimiento;
    }

    /**
     * Define el valor de la propiedad cantonFallecimiento.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCantonFallecimiento(String value) {
        this.cantonFallecimiento = value;
    }

    /**
     * Obtiene el valor de la propiedad cantonInscripcion.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCantonInscripcion() {
        return cantonInscripcion;
    }

    /**
     * Define el valor de la propiedad cantonInscripcion.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCantonInscripcion(String value) {
        this.cantonInscripcion = value;
    }

    /**
     * Obtiene el valor de la propiedad cantonInscripcionDefuncion.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCantonInscripcionDefuncion() {
        return cantonInscripcionDefuncion;
    }

    /**
     * Define el valor de la propiedad cantonInscripcionDefuncion.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCantonInscripcionDefuncion(String value) {
        this.cantonInscripcionDefuncion = value;
    }

    /**
     * Obtiene el valor de la propiedad cantonInscripcionGenero.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCantonInscripcionGenero() {
        return cantonInscripcionGenero;
    }

    /**
     * Define el valor de la propiedad cantonInscripcionGenero.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCantonInscripcionGenero(String value) {
        this.cantonInscripcionGenero = value;
    }

    /**
     * Obtiene el valor de la propiedad cantonMatrimonio.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCantonMatrimonio() {
        return cantonMatrimonio;
    }

    /**
     * Define el valor de la propiedad cantonMatrimonio.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCantonMatrimonio(String value) {
        this.cantonMatrimonio = value;
    }

    /**
     * Obtiene el valor de la propiedad cantonNacimiento.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCantonNacimiento() {
        return cantonNacimiento;
    }

    /**
     * Define el valor de la propiedad cantonNacimiento.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCantonNacimiento(String value) {
        this.cantonNacimiento = value;
    }

    /**
     * Obtiene el valor de la propiedad clase.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getClase() {
        return clase;
    }

    /**
     * Define el valor de la propiedad clase.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setClase(String value) {
        this.clase = value;
    }

    /**
     * Obtiene el valor de la propiedad claseDefuncion.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getClaseDefuncion() {
        return claseDefuncion;
    }

    /**
     * Define el valor de la propiedad claseDefuncion.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setClaseDefuncion(String value) {
        this.claseDefuncion = value;
    }

    /**
     * Obtiene el valor de la propiedad claseMatrimonio.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getClaseMatrimonio() {
        return claseMatrimonio;
    }

    /**
     * Define el valor de la propiedad claseMatrimonio.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setClaseMatrimonio(String value) {
        this.claseMatrimonio = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoCantonDomicilio.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCodigoCantonDomicilio() {
        return codigoCantonDomicilio;
    }

    /**
     * Define el valor de la propiedad codigoCantonDomicilio.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCodigoCantonDomicilio(String value) {
        this.codigoCantonDomicilio = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoCantonFallecimiento.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCodigoCantonFallecimiento() {
        return codigoCantonFallecimiento;
    }

    /**
     * Define el valor de la propiedad codigoCantonFallecimiento.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCodigoCantonFallecimiento(String value) {
        this.codigoCantonFallecimiento = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoCantonInscripcion.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCodigoCantonInscripcion() {
        return codigoCantonInscripcion;
    }

    /**
     * Define el valor de la propiedad codigoCantonInscripcion.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCodigoCantonInscripcion(String value) {
        this.codigoCantonInscripcion = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoCantonInscripcionDefuncion.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCodigoCantonInscripcionDefuncion() {
        return codigoCantonInscripcionDefuncion;
    }

    /**
     * Define el valor de la propiedad codigoCantonInscripcionDefuncion.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCodigoCantonInscripcionDefuncion(String value) {
        this.codigoCantonInscripcionDefuncion = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoCantonInscripcionGenero.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCodigoCantonInscripcionGenero() {
        return codigoCantonInscripcionGenero;
    }

    /**
     * Define el valor de la propiedad codigoCantonInscripcionGenero.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCodigoCantonInscripcionGenero(String value) {
        this.codigoCantonInscripcionGenero = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoCantonMatrimonio.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCodigoCantonMatrimonio() {
        return codigoCantonMatrimonio;
    }

    /**
     * Define el valor de la propiedad codigoCantonMatrimonio.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCodigoCantonMatrimonio(String value) {
        this.codigoCantonMatrimonio = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoCantonNacimiento.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCodigoCantonNacimiento() {
        return codigoCantonNacimiento;
    }

    /**
     * Define el valor de la propiedad codigoCantonNacimiento.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCodigoCantonNacimiento(String value) {
        this.codigoCantonNacimiento = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoCondicionCedulado.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCodigoCondicionCedulado() {
        return codigoCondicionCedulado;
    }

    /**
     * Define el valor de la propiedad codigoCondicionCedulado.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCodigoCondicionCedulado(String value) {
        this.codigoCondicionCedulado = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoCondicionDonante.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCodigoCondicionDonante() {
        return codigoCondicionDonante;
    }

    /**
     * Define el valor de la propiedad codigoCondicionDonante.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCodigoCondicionDonante(String value) {
        this.codigoCondicionDonante = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoDomicilio.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCodigoDomicilio() {
        return codigoDomicilio;
    }

    /**
     * Define el valor de la propiedad codigoDomicilio.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCodigoDomicilio(String value) {
        this.codigoDomicilio = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoError.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCodigoError() {
        return codigoError;
    }

    /**
     * Define el valor de la propiedad codigoError.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCodigoError(String value) {
        this.codigoError = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoEstadoCivil.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCodigoEstadoCivil() {
        return codigoEstadoCivil;
    }

    /**
     * Define el valor de la propiedad codigoEstadoCivil.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCodigoEstadoCivil(String value) {
        this.codigoEstadoCivil = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoGenero.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCodigoGenero() {
        return codigoGenero;
    }

    /**
     * Define el valor de la propiedad codigoGenero.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCodigoGenero(String value) {
        this.codigoGenero = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoGrupoEtnico.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCodigoGrupoEtnico() {
        return codigoGrupoEtnico;
    }

    /**
     * Define el valor de la propiedad codigoGrupoEtnico.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCodigoGrupoEtnico(String value) {
        this.codigoGrupoEtnico = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoInstruccion.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCodigoInstruccion() {
        return codigoInstruccion;
    }

    /**
     * Define el valor de la propiedad codigoInstruccion.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCodigoInstruccion(String value) {
        this.codigoInstruccion = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoLugarDefuncion.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCodigoLugarDefuncion() {
        return codigoLugarDefuncion;
    }

    /**
     * Define el valor de la propiedad codigoLugarDefuncion.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCodigoLugarDefuncion(String value) {
        this.codigoLugarDefuncion = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoLugarFallecimiento.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCodigoLugarFallecimiento() {
        return codigoLugarFallecimiento;
    }

    /**
     * Define el valor de la propiedad codigoLugarFallecimiento.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCodigoLugarFallecimiento(String value) {
        this.codigoLugarFallecimiento = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoLugarInscripcion.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCodigoLugarInscripcion() {
        return codigoLugarInscripcion;
    }

    /**
     * Define el valor de la propiedad codigoLugarInscripcion.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCodigoLugarInscripcion(String value) {
        this.codigoLugarInscripcion = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoLugarInscripcionGenero.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCodigoLugarInscripcionGenero() {
        return codigoLugarInscripcionGenero;
    }

    /**
     * Define el valor de la propiedad codigoLugarInscripcionGenero.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCodigoLugarInscripcionGenero(String value) {
        this.codigoLugarInscripcionGenero = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoLugarMatrimonio.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCodigoLugarMatrimonio() {
        return codigoLugarMatrimonio;
    }

    /**
     * Define el valor de la propiedad codigoLugarMatrimonio.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCodigoLugarMatrimonio(String value) {
        this.codigoLugarMatrimonio = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoLugarNacimiento.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCodigoLugarNacimiento() {
        return codigoLugarNacimiento;
    }

    /**
     * Define el valor de la propiedad codigoLugarNacimiento.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCodigoLugarNacimiento(String value) {
        this.codigoLugarNacimiento = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoNacionalidad.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCodigoNacionalidad() {
        return codigoNacionalidad;
    }

    /**
     * Define el valor de la propiedad codigoNacionalidad.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCodigoNacionalidad(String value) {
        this.codigoNacionalidad = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoNacionalidadMadre.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCodigoNacionalidadMadre() {
        return codigoNacionalidadMadre;
    }

    /**
     * Define el valor de la propiedad codigoNacionalidadMadre.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCodigoNacionalidadMadre(String value) {
        this.codigoNacionalidadMadre = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoNacionalidadPadre.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCodigoNacionalidadPadre() {
        return codigoNacionalidadPadre;
    }

    /**
     * Define el valor de la propiedad codigoNacionalidadPadre.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCodigoNacionalidadPadre(String value) {
        this.codigoNacionalidadPadre = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoPaisDomicilio.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCodigoPaisDomicilio() {
        return codigoPaisDomicilio;
    }

    /**
     * Define el valor de la propiedad codigoPaisDomicilio.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCodigoPaisDomicilio(String value) {
        this.codigoPaisDomicilio = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoPaisFallecimiento.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCodigoPaisFallecimiento() {
        return codigoPaisFallecimiento;
    }

    /**
     * Define el valor de la propiedad codigoPaisFallecimiento.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCodigoPaisFallecimiento(String value) {
        this.codigoPaisFallecimiento = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoPaisInscripcion.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCodigoPaisInscripcion() {
        return codigoPaisInscripcion;
    }

    /**
     * Define el valor de la propiedad codigoPaisInscripcion.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCodigoPaisInscripcion(String value) {
        this.codigoPaisInscripcion = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoPaisInscripcionDefuncion.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCodigoPaisInscripcionDefuncion() {
        return codigoPaisInscripcionDefuncion;
    }

    /**
     * Define el valor de la propiedad codigoPaisInscripcionDefuncion.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCodigoPaisInscripcionDefuncion(String value) {
        this.codigoPaisInscripcionDefuncion = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoPaisInscripcionGenero.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCodigoPaisInscripcionGenero() {
        return codigoPaisInscripcionGenero;
    }

    /**
     * Define el valor de la propiedad codigoPaisInscripcionGenero.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCodigoPaisInscripcionGenero(String value) {
        this.codigoPaisInscripcionGenero = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoPaisMatrimonio.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCodigoPaisMatrimonio() {
        return codigoPaisMatrimonio;
    }

    /**
     * Define el valor de la propiedad codigoPaisMatrimonio.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCodigoPaisMatrimonio(String value) {
        this.codigoPaisMatrimonio = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoPaisNacimiento.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCodigoPaisNacimiento() {
        return codigoPaisNacimiento;
    }

    /**
     * Define el valor de la propiedad codigoPaisNacimiento.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCodigoPaisNacimiento(String value) {
        this.codigoPaisNacimiento = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoParroquiaDomicilio.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCodigoParroquiaDomicilio() {
        return codigoParroquiaDomicilio;
    }

    /**
     * Define el valor de la propiedad codigoParroquiaDomicilio.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCodigoParroquiaDomicilio(String value) {
        this.codigoParroquiaDomicilio = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoParroquiaFallecimiento.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCodigoParroquiaFallecimiento() {
        return codigoParroquiaFallecimiento;
    }

    /**
     * Define el valor de la propiedad codigoParroquiaFallecimiento.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCodigoParroquiaFallecimiento(String value) {
        this.codigoParroquiaFallecimiento = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoParroquiaInscripcion.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCodigoParroquiaInscripcion() {
        return codigoParroquiaInscripcion;
    }

    /**
     * Define el valor de la propiedad codigoParroquiaInscripcion.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCodigoParroquiaInscripcion(String value) {
        this.codigoParroquiaInscripcion = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoParroquiaInscripcionDefuncion.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCodigoParroquiaInscripcionDefuncion() {
        return codigoParroquiaInscripcionDefuncion;
    }

    /**
     * Define el valor de la propiedad codigoParroquiaInscripcionDefuncion.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCodigoParroquiaInscripcionDefuncion(String value) {
        this.codigoParroquiaInscripcionDefuncion = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoParroquiaInscripcionGenero.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCodigoParroquiaInscripcionGenero() {
        return codigoParroquiaInscripcionGenero;
    }

    /**
     * Define el valor de la propiedad codigoParroquiaInscripcionGenero.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCodigoParroquiaInscripcionGenero(String value) {
        this.codigoParroquiaInscripcionGenero = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoParroquiaMatrimonio.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCodigoParroquiaMatrimonio() {
        return codigoParroquiaMatrimonio;
    }

    /**
     * Define el valor de la propiedad codigoParroquiaMatrimonio.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCodigoParroquiaMatrimonio(String value) {
        this.codigoParroquiaMatrimonio = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoParroquiaNacimiento.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCodigoParroquiaNacimiento() {
        return codigoParroquiaNacimiento;
    }

    /**
     * Define el valor de la propiedad codigoParroquiaNacimiento.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCodigoParroquiaNacimiento(String value) {
        this.codigoParroquiaNacimiento = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoProfesion.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCodigoProfesion() {
        return codigoProfesion;
    }

    /**
     * Define el valor de la propiedad codigoProfesion.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCodigoProfesion(String value) {
        this.codigoProfesion = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoProvinciaDomicilio.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCodigoProvinciaDomicilio() {
        return codigoProvinciaDomicilio;
    }

    /**
     * Define el valor de la propiedad codigoProvinciaDomicilio.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCodigoProvinciaDomicilio(String value) {
        this.codigoProvinciaDomicilio = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoProvinciaFallecimiento.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCodigoProvinciaFallecimiento() {
        return codigoProvinciaFallecimiento;
    }

    /**
     * Define el valor de la propiedad codigoProvinciaFallecimiento.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCodigoProvinciaFallecimiento(String value) {
        this.codigoProvinciaFallecimiento = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoProvinciaInscripcion.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCodigoProvinciaInscripcion() {
        return codigoProvinciaInscripcion;
    }

    /**
     * Define el valor de la propiedad codigoProvinciaInscripcion.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCodigoProvinciaInscripcion(String value) {
        this.codigoProvinciaInscripcion = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoProvinciaInscripcionDefuncion.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCodigoProvinciaInscripcionDefuncion() {
        return codigoProvinciaInscripcionDefuncion;
    }

    /**
     * Define el valor de la propiedad codigoProvinciaInscripcionDefuncion.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCodigoProvinciaInscripcionDefuncion(String value) {
        this.codigoProvinciaInscripcionDefuncion = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoProvinciaInscripcionGenero.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCodigoProvinciaInscripcionGenero() {
        return codigoProvinciaInscripcionGenero;
    }

    /**
     * Define el valor de la propiedad codigoProvinciaInscripcionGenero.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCodigoProvinciaInscripcionGenero(String value) {
        this.codigoProvinciaInscripcionGenero = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoProvinciaMatrimonio.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCodigoProvinciaMatrimonio() {
        return codigoProvinciaMatrimonio;
    }

    /**
     * Define el valor de la propiedad codigoProvinciaMatrimonio.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCodigoProvinciaMatrimonio(String value) {
        this.codigoProvinciaMatrimonio = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoProvinciaNacimiento.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCodigoProvinciaNacimiento() {
        return codigoProvinciaNacimiento;
    }

    /**
     * Define el valor de la propiedad codigoProvinciaNacimiento.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCodigoProvinciaNacimiento(String value) {
        this.codigoProvinciaNacimiento = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoSexo.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCodigoSexo() {
        return codigoSexo;
    }

    /**
     * Define el valor de la propiedad codigoSexo.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCodigoSexo(String value) {
        this.codigoSexo = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoTipoCedula.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCodigoTipoCedula() {
        return codigoTipoCedula;
    }

    /**
     * Define el valor de la propiedad codigoTipoCedula.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCodigoTipoCedula(String value) {
        this.codigoTipoCedula = value;
    }

    /**
     * Obtiene el valor de la propiedad condicionCedulado.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCondicionCedulado() {
        return condicionCedulado;
    }

    /**
     * Define el valor de la propiedad condicionCedulado.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCondicionCedulado(String value) {
        this.condicionCedulado = value;
    }

    /**
     * Obtiene el valor de la propiedad condicionDonante.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCondicionDonante() {
        return condicionDonante;
    }

    /**
     * Define el valor de la propiedad condicionDonante.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCondicionDonante(String value) {
        this.condicionDonante = value;
    }

    /**
     * Obtiene el valor de la propiedad conyuge.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getConyuge() {
        return conyuge;
    }

    /**
     * Define el valor de la propiedad conyuge.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setConyuge(String value) {
        this.conyuge = value;
    }

    /**
     * Obtiene el valor de la propiedad domicilio.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDomicilio() {
        return domicilio;
    }

    /**
     * Define el valor de la propiedad domicilio.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDomicilio(String value) {
        this.domicilio = value;
    }

    /**
     * Obtiene el valor de la propiedad error.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getError() {
        return error;
    }

    /**
     * Define el valor de la propiedad error.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setError(String value) {
        this.error = value;
    }

    /**
     * Obtiene el valor de la propiedad estadoCivil.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getEstadoCivil() {
        return estadoCivil;
    }

    /**
     * Define el valor de la propiedad estadoCivil.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setEstadoCivil(String value) {
        this.estadoCivil = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaActualizacion.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFechaActualizacion() {
        return fechaActualizacion;
    }

    /**
     * Define el valor de la propiedad fechaActualizacion.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFechaActualizacion(String value) {
        this.fechaActualizacion = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaCedulacion.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFechaCedulacion() {
        return fechaCedulacion;
    }

    /**
     * Define el valor de la propiedad fechaCedulacion.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFechaCedulacion(String value) {
        this.fechaCedulacion = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaFallecimiento.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFechaFallecimiento() {
        return fechaFallecimiento;
    }

    /**
     * Define el valor de la propiedad fechaFallecimiento.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFechaFallecimiento(String value) {
        this.fechaFallecimiento = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaInscripcionDefuncion.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFechaInscripcionDefuncion() {
        return fechaInscripcionDefuncion;
    }

    /**
     * Define el valor de la propiedad fechaInscripcionDefuncion.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFechaInscripcionDefuncion(String value) {
        this.fechaInscripcionDefuncion = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaInscripcionGenero.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFechaInscripcionGenero() {
        return fechaInscripcionGenero;
    }

    /**
     * Define el valor de la propiedad fechaInscripcionGenero.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFechaInscripcionGenero(String value) {
        this.fechaInscripcionGenero = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaInscripcionNacimiento.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFechaInscripcionNacimiento() {
        return fechaInscripcionNacimiento;
    }

    /**
     * Define el valor de la propiedad fechaInscripcionNacimiento.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFechaInscripcionNacimiento(String value) {
        this.fechaInscripcionNacimiento = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaMatrimonio.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFechaMatrimonio() {
        return fechaMatrimonio;
    }

    /**
     * Define el valor de la propiedad fechaMatrimonio.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFechaMatrimonio(String value) {
        this.fechaMatrimonio = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaNacimiento.
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
     * Define el valor de la propiedad fechaNacimiento.
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
     * Obtiene el valor de la propiedad firma.
     *
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getFirma() {
        return firma;
    }

    /**
     * Define el valor de la propiedad firma.
     *
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setFirma(byte[] value) {
        this.firma = value;
    }

    /**
     * Obtiene el valor de la propiedad firmaElectronica.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFirmaElectronica() {
        return firmaElectronica;
    }

    /**
     * Define el valor de la propiedad firmaElectronica.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFirmaElectronica(String value) {
        this.firmaElectronica = value;
    }

    /**
     * Obtiene el valor de la propiedad fotografia.
     *
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getFotografia() {
        return fotografia;
    }

    /**
     * Define el valor de la propiedad fotografia.
     *
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setFotografia(byte[] value) {
        this.fotografia = value;
    }

    /**
     * Obtiene el valor de la propiedad genero.
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
     * Define el valor de la propiedad genero.
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
     * Obtiene el valor de la propiedad grupoEtnico.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getGrupoEtnico() {
        return grupoEtnico;
    }

    /**
     * Define el valor de la propiedad grupoEtnico.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setGrupoEtnico(String value) {
        this.grupoEtnico = value;
    }

    /**
     * Obtiene el valor de la propiedad individualDactilar.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIndividualDactilar() {
        return individualDactilar;
    }

    /**
     * Define el valor de la propiedad individualDactilar.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIndividualDactilar(String value) {
        this.individualDactilar = value;
    }

    /**
     * Obtiene el valor de la propiedad instruccion.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getInstruccion() {
        return instruccion;
    }

    /**
     * Define el valor de la propiedad instruccion.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setInstruccion(String value) {
        this.instruccion = value;
    }

    /**
     * Obtiene el valor de la propiedad lugarDefuncion.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLugarDefuncion() {
        return lugarDefuncion;
    }

    /**
     * Define el valor de la propiedad lugarDefuncion.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLugarDefuncion(String value) {
        this.lugarDefuncion = value;
    }

    /**
     * Obtiene el valor de la propiedad lugarFallecimiento.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLugarFallecimiento() {
        return lugarFallecimiento;
    }

    /**
     * Define el valor de la propiedad lugarFallecimiento.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLugarFallecimiento(String value) {
        this.lugarFallecimiento = value;
    }

    /**
     * Obtiene el valor de la propiedad lugarInscripcion.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLugarInscripcion() {
        return lugarInscripcion;
    }

    /**
     * Define el valor de la propiedad lugarInscripcion.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLugarInscripcion(String value) {
        this.lugarInscripcion = value;
    }

    /**
     * Obtiene el valor de la propiedad lugarInscripcionGenero.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLugarInscripcionGenero() {
        return lugarInscripcionGenero;
    }

    /**
     * Define el valor de la propiedad lugarInscripcionGenero.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLugarInscripcionGenero(String value) {
        this.lugarInscripcionGenero = value;
    }

    /**
     * Obtiene el valor de la propiedad lugarMatrimonio.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLugarMatrimonio() {
        return lugarMatrimonio;
    }

    /**
     * Define el valor de la propiedad lugarMatrimonio.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLugarMatrimonio(String value) {
        this.lugarMatrimonio = value;
    }

    /**
     * Obtiene el valor de la propiedad lugarNacimiento.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLugarNacimiento() {
        return lugarNacimiento;
    }

    /**
     * Define el valor de la propiedad lugarNacimiento.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLugarNacimiento(String value) {
        this.lugarNacimiento = value;
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

    /**
     * Obtiene el valor de la propiedad nacionalidad.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNacionalidad() {
        return nacionalidad;
    }

    /**
     * Define el valor de la propiedad nacionalidad.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNacionalidad(String value) {
        this.nacionalidad = value;
    }

    /**
     * Obtiene el valor de la propiedad nacionalidadMadre.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNacionalidadMadre() {
        return nacionalidadMadre;
    }

    /**
     * Define el valor de la propiedad nacionalidadMadre.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNacionalidadMadre(String value) {
        this.nacionalidadMadre = value;
    }

    /**
     * Obtiene el valor de la propiedad nacionalidadPadre.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNacionalidadPadre() {
        return nacionalidadPadre;
    }

    /**
     * Define el valor de la propiedad nacionalidadPadre.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNacionalidadPadre(String value) {
        this.nacionalidadPadre = value;
    }

    /**
     * Obtiene el valor de la propiedad nombre.
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
     * Define el valor de la propiedad nombre.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreMadre.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNombreMadre() {
        return nombreMadre;
    }

    /**
     * Define el valor de la propiedad nombreMadre.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNombreMadre(String value) {
        this.nombreMadre = value;
    }

    /**
     * Obtiene el valor de la propiedad nombrePadre.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNombrePadre() {
        return nombrePadre;
    }

    /**
     * Define el valor de la propiedad nombrePadre.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNombrePadre(String value) {
        this.nombrePadre = value;
    }

    /**
     * Obtiene el valor de la propiedad nombres.
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
     * Define el valor de la propiedad nombres.
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
     * Obtiene el valor de la propiedad nuiConyuge.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNuiConyuge() {
        return nuiConyuge;
    }

    /**
     * Define el valor de la propiedad nuiConyuge.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNuiConyuge(String value) {
        this.nuiConyuge = value;
    }

    /**
     * Obtiene el valor de la propiedad nuiMadre.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNuiMadre() {
        return nuiMadre;
    }

    /**
     * Define el valor de la propiedad nuiMadre.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNuiMadre(String value) {
        this.nuiMadre = value;
    }

    /**
     * Obtiene el valor de la propiedad nuiPadre.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNuiPadre() {
        return nuiPadre;
    }

    /**
     * Define el valor de la propiedad nuiPadre.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNuiPadre(String value) {
        this.nuiPadre = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroCasa.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNumeroCasa() {
        return numeroCasa;
    }

    /**
     * Define el valor de la propiedad numeroCasa.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNumeroCasa(String value) {
        this.numeroCasa = value;
    }

    /**
     * Obtiene el valor de la propiedad observacion.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getObservacion() {
        return observacion;
    }

    /**
     * Define el valor de la propiedad observacion.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setObservacion(String value) {
        this.observacion = value;
    }

    /**
     * Obtiene el valor de la propiedad observacionInstitucion.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getObservacionInstitucion() {
        return observacionInstitucion;
    }

    /**
     * Define el valor de la propiedad observacionInstitucion.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setObservacionInstitucion(String value) {
        this.observacionInstitucion = value;
    }

    /**
     * Obtiene el valor de la propiedad pagina.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPagina() {
        return pagina;
    }

    /**
     * Define el valor de la propiedad pagina.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPagina(String value) {
        this.pagina = value;
    }

    /**
     * Obtiene el valor de la propiedad paginaDefuncion.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPaginaDefuncion() {
        return paginaDefuncion;
    }

    /**
     * Define el valor de la propiedad paginaDefuncion.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPaginaDefuncion(String value) {
        this.paginaDefuncion = value;
    }

    /**
     * Obtiene el valor de la propiedad paginaMatrimonio.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPaginaMatrimonio() {
        return paginaMatrimonio;
    }

    /**
     * Define el valor de la propiedad paginaMatrimonio.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPaginaMatrimonio(String value) {
        this.paginaMatrimonio = value;
    }

    /**
     * Obtiene el valor de la propiedad paisDomicilio.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPaisDomicilio() {
        return paisDomicilio;
    }

    /**
     * Define el valor de la propiedad paisDomicilio.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPaisDomicilio(String value) {
        this.paisDomicilio = value;
    }

    /**
     * Obtiene el valor de la propiedad paisFallecimiento.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPaisFallecimiento() {
        return paisFallecimiento;
    }

    /**
     * Define el valor de la propiedad paisFallecimiento.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPaisFallecimiento(String value) {
        this.paisFallecimiento = value;
    }

    /**
     * Obtiene el valor de la propiedad paisInscripcion.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPaisInscripcion() {
        return paisInscripcion;
    }

    /**
     * Define el valor de la propiedad paisInscripcion.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPaisInscripcion(String value) {
        this.paisInscripcion = value;
    }

    /**
     * Obtiene el valor de la propiedad paisInscripcionDefuncion.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPaisInscripcionDefuncion() {
        return paisInscripcionDefuncion;
    }

    /**
     * Define el valor de la propiedad paisInscripcionDefuncion.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPaisInscripcionDefuncion(String value) {
        this.paisInscripcionDefuncion = value;
    }

    /**
     * Obtiene el valor de la propiedad paisInscripcionGenero.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPaisInscripcionGenero() {
        return paisInscripcionGenero;
    }

    /**
     * Define el valor de la propiedad paisInscripcionGenero.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPaisInscripcionGenero(String value) {
        this.paisInscripcionGenero = value;
    }

    /**
     * Obtiene el valor de la propiedad paisMatrimonio.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPaisMatrimonio() {
        return paisMatrimonio;
    }

    /**
     * Define el valor de la propiedad paisMatrimonio.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPaisMatrimonio(String value) {
        this.paisMatrimonio = value;
    }

    /**
     * Obtiene el valor de la propiedad paisNacimiento.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPaisNacimiento() {
        return paisNacimiento;
    }

    /**
     * Define el valor de la propiedad paisNacimiento.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPaisNacimiento(String value) {
        this.paisNacimiento = value;
    }

    /**
     * Obtiene el valor de la propiedad parroquiaDomicilio.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getParroquiaDomicilio() {
        return parroquiaDomicilio;
    }

    /**
     * Define el valor de la propiedad parroquiaDomicilio.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setParroquiaDomicilio(String value) {
        this.parroquiaDomicilio = value;
    }

    /**
     * Obtiene el valor de la propiedad parroquiaFallecimiento.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getParroquiaFallecimiento() {
        return parroquiaFallecimiento;
    }

    /**
     * Define el valor de la propiedad parroquiaFallecimiento.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setParroquiaFallecimiento(String value) {
        this.parroquiaFallecimiento = value;
    }

    /**
     * Obtiene el valor de la propiedad parroquiaInscripcion.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getParroquiaInscripcion() {
        return parroquiaInscripcion;
    }

    /**
     * Define el valor de la propiedad parroquiaInscripcion.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setParroquiaInscripcion(String value) {
        this.parroquiaInscripcion = value;
    }

    /**
     * Obtiene el valor de la propiedad parroquiaInscripcionDefuncion.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getParroquiaInscripcionDefuncion() {
        return parroquiaInscripcionDefuncion;
    }

    /**
     * Define el valor de la propiedad parroquiaInscripcionDefuncion.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setParroquiaInscripcionDefuncion(String value) {
        this.parroquiaInscripcionDefuncion = value;
    }

    /**
     * Obtiene el valor de la propiedad parroquiaInscripcionGenero.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getParroquiaInscripcionGenero() {
        return parroquiaInscripcionGenero;
    }

    /**
     * Define el valor de la propiedad parroquiaInscripcionGenero.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setParroquiaInscripcionGenero(String value) {
        this.parroquiaInscripcionGenero = value;
    }

    /**
     * Obtiene el valor de la propiedad parroquiaMatrimonio.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getParroquiaMatrimonio() {
        return parroquiaMatrimonio;
    }

    /**
     * Define el valor de la propiedad parroquiaMatrimonio.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setParroquiaMatrimonio(String value) {
        this.parroquiaMatrimonio = value;
    }

    /**
     * Obtiene el valor de la propiedad parroquiaNacimiento.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getParroquiaNacimiento() {
        return parroquiaNacimiento;
    }

    /**
     * Define el valor de la propiedad parroquiaNacimiento.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setParroquiaNacimiento(String value) {
        this.parroquiaNacimiento = value;
    }

    /**
     * Obtiene el valor de la propiedad profesion.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getProfesion() {
        return profesion;
    }

    /**
     * Define el valor de la propiedad profesion.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setProfesion(String value) {
        this.profesion = value;
    }

    /**
     * Obtiene el valor de la propiedad provinciaDomicilio.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getProvinciaDomicilio() {
        return provinciaDomicilio;
    }

    /**
     * Define el valor de la propiedad provinciaDomicilio.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setProvinciaDomicilio(String value) {
        this.provinciaDomicilio = value;
    }

    /**
     * Obtiene el valor de la propiedad provinciaFallecimiento.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getProvinciaFallecimiento() {
        return provinciaFallecimiento;
    }

    /**
     * Define el valor de la propiedad provinciaFallecimiento.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setProvinciaFallecimiento(String value) {
        this.provinciaFallecimiento = value;
    }

    /**
     * Obtiene el valor de la propiedad provinciaInscripcion.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getProvinciaInscripcion() {
        return provinciaInscripcion;
    }

    /**
     * Define el valor de la propiedad provinciaInscripcion.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setProvinciaInscripcion(String value) {
        this.provinciaInscripcion = value;
    }

    /**
     * Obtiene el valor de la propiedad provinciaInscripcionDefuncion.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getProvinciaInscripcionDefuncion() {
        return provinciaInscripcionDefuncion;
    }

    /**
     * Define el valor de la propiedad provinciaInscripcionDefuncion.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setProvinciaInscripcionDefuncion(String value) {
        this.provinciaInscripcionDefuncion = value;
    }

    /**
     * Obtiene el valor de la propiedad provinciaInscripcionGenero.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getProvinciaInscripcionGenero() {
        return provinciaInscripcionGenero;
    }

    /**
     * Define el valor de la propiedad provinciaInscripcionGenero.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setProvinciaInscripcionGenero(String value) {
        this.provinciaInscripcionGenero = value;
    }

    /**
     * Obtiene el valor de la propiedad provinciaMatrimonio.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getProvinciaMatrimonio() {
        return provinciaMatrimonio;
    }

    /**
     * Define el valor de la propiedad provinciaMatrimonio.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setProvinciaMatrimonio(String value) {
        this.provinciaMatrimonio = value;
    }

    /**
     * Obtiene el valor de la propiedad provinciaNacimiento.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getProvinciaNacimiento() {
        return provinciaNacimiento;
    }

    /**
     * Define el valor de la propiedad provinciaNacimiento.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setProvinciaNacimiento(String value) {
        this.provinciaNacimiento = value;
    }

    /**
     * Obtiene el valor de la propiedad sexo.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * Define el valor de la propiedad sexo.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSexo(String value) {
        this.sexo = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoCedula.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTipoCedula() {
        return tipoCedula;
    }

    /**
     * Define el valor de la propiedad tipoCedula.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTipoCedula(String value) {
        this.tipoCedula = value;
    }

    /**
     * Obtiene el valor de la propiedad tomo.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTomo() {
        return tomo;
    }

    /**
     * Define el valor de la propiedad tomo.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTomo(String value) {
        this.tomo = value;
    }

    /**
     * Obtiene el valor de la propiedad tomoDefuncion.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTomoDefuncion() {
        return tomoDefuncion;
    }

    /**
     * Define el valor de la propiedad tomoDefuncion.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTomoDefuncion(String value) {
        this.tomoDefuncion = value;
    }

    /**
     * Obtiene el valor de la propiedad tomoMatrimonio.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTomoMatrimonio() {
        return tomoMatrimonio;
    }

    /**
     * Define el valor de la propiedad tomoMatrimonio.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTomoMatrimonio(String value) {
        this.tomoMatrimonio = value;
    }

}
