/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.restapi.rc;

import java.util.Date;

import jakarta.persistence.Transient;

/**
 *
 * @author Francsico Chalán
 */

public class Persona {

    private Long datId;

    private String datIdentificacion;

    private Date datFechaNacimiento;

    private Date datFechaExpira;

    private String datEstadoCivil;

    private String datGenero;

    private String datNacionalidad;

    private Integer datNacionalidadId;

    @Transient
    private String nombre;
    @Transient
    private String condicionCiudadano;
    @Transient
    private String lugarNacimiento;
    @Transient
    private String conyuge;
    @Transient
    private String nombrePadre;
    @Transient
    private String nombreMadre;
    @Transient
    private String mensajeError;
    @Transient
    private String sexo;
    @Transient
    private String domicilio;

    public Persona() {
    }

    public Persona(Long datId) {
        this.datId = datId;
    }

    public Persona(Long conId, String datIdentificacion, Date fechaNacimiento) {
        this.datId = conId;
        this.datIdentificacion = datIdentificacion;
        this.datFechaNacimiento = fechaNacimiento;
    }

    public Long getConId() {
        return datId;
    }

    public Long getDatId() {
        return datId;
    }

    public void setDatId(Long datId) {
        this.datId = datId;
    }

    public String getDatIdentificacion() {
        return datIdentificacion;
    }

    public void setDatIdentificacion(String datIdentificacion) {
        this.datIdentificacion = datIdentificacion;
    }

    public Date getDatFechaNacimiento() {
        return datFechaNacimiento;
    }

    public void setDatFechaNacimiento(Date datFechaNacimiento) {
        this.datFechaNacimiento = datFechaNacimiento;
    }

    public Date getDatFechaExpira() {
		return datFechaExpira;
	}

    public void setDatFechaExpira(Date datFechaExpira) {
		this.datFechaExpira = datFechaExpira;
	}

    public String getDatEstadoCivil() {
        return datEstadoCivil;
    }

    public void setDatEstadoCivil(String datEstadoCivil) {
        this.datEstadoCivil = datEstadoCivil;
    }

    public String getDatGenero() {
        return datGenero;
    }

    public void setDatGenero(String datGenero) {
        this.datGenero = datGenero;
    }

    public String getDatNacionalidad() {
        return datNacionalidad;
    }

    public void setDatNacionalidad(String datNacionalidad) {
        this.datNacionalidad = datNacionalidad;
    }


    @Override
    public int hashCode() {
        int hash = 0;
        hash += (datId != null ? datId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Persona)) {
            return false;
        }
        Persona other = (Persona) object;
        if ((this.datId == null && other.datId != null) || (this.datId != null && !this.datId.equals(other.datId))) {
            return false;
        }
        return true;
    }

   @Override
    public String toString() {
        return "ec.gob.senescyt.dto.TmpDatosWs[ datId=" + datId + " ]";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCondicionCiudadano() {
        return condicionCiudadano;
    }

    public void setCondicionCiudadano(String condicionCiudadano) {
        this.condicionCiudadano = condicionCiudadano;
    }

    public String getLugarNacimiento() {
        return lugarNacimiento;
    }

    public void setLugarNacimiento(String lugarNacimiento) {
        this.lugarNacimiento = lugarNacimiento;
    }

    public String getConyuge() {
        return conyuge;
    }

    public void setConyuge(String conyuge) {
        this.conyuge = conyuge;
    }

    public String getNombrePadre() {
        return nombrePadre;
    }

    public void setNombrePadre(String nombrePadre) {
        this.nombrePadre = nombrePadre;
    }

    public String getNombreMadre() {
        return nombreMadre;
    }

    public void setNombreMadre(String nombreMadre) {
        this.nombreMadre = nombreMadre;
    }

    public String getMensajeError() {
        return mensajeError;
    }

    public void setMensajeError(String mensajeError) {
        this.mensajeError = mensajeError;
    }

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public Integer getDatNacionalidadId() {
		return datNacionalidadId;
	}

	public void setDatNacionalidadId(Integer datNacionalidadId) {
		this.datNacionalidadId = datNacionalidadId;
	}



}
