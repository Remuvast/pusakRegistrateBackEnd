package com.example.restapi.dto;

import java.util.List;
import com.example.restapi.model.Campo;

public class DatosRegistroCivilDTO {
    private String cedula;
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String fechaNacimiento;
    private String sexo;
    private String estadoCivil;
    private String apellidosCompletos;
    private String nombresApellidos;
    private List<Campo> datosGlobales;

    private boolean nombreBloqueado;
    public DatosRegistroCivilDTO() {}

    // Getters y setters
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getApellidosCompletos() {
        return apellidosCompletos;
    }

    public void setApellidosCompletos(String apellidosCompletos) {
        this.apellidosCompletos = apellidosCompletos;
    }

    public String getNombresApellidos() {
        return nombresApellidos;
    }

    public void setNombresApellidos(String nombresApellidos) {
        this.nombresApellidos = nombresApellidos;
    }

    public List<Campo> getDatosGlobales() {
        return datosGlobales;
    }

    public void setDatosGlobales(List<Campo> datosGlobales) {
        this.datosGlobales = datosGlobales;
    }

    public boolean isNombreBloqueado() {
        return nombreBloqueado;
    }

    public void setNombreBloqueado(boolean nombreBloqueado) {
        this.nombreBloqueado = nombreBloqueado;
    }
}
