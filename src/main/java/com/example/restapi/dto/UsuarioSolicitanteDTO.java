package com.example.restapi.dto;

import lombok.Data;

@Data
public class UsuarioSolicitanteDTO {
    // Datos para la tabla usuarios
    private Long id;
    private String codigoActivacion;
    private String nombres;
    private String apellidos;
    private String tipoIdentificacion;
    private String numeroIdentificacion;
    private String correoPrincipal;
    private String correoAlterno;
    private String respuesta1;
    private String respuesta2;
    private String respuesta3;
    private String apellidosNombres;
    private String clave;


    // Datos para la tabla solicitantes
    private String fechaNacimiento;
    private Integer codigoGenero;
    private Integer codigoEstadoCivil;
    private Integer codigoEtnia;
    private Integer codigoNacionalidad;
    private String telefonoConvencional;
    private String celular;
    private String codigoZonaResidencia;
    private String sectorResidencia;
    private String callePrincipal;
    private String calleSecundaria;
    private String numero;
    private String referencia;
    private Integer codigoCantonNacimiento;
    private Integer codigoParroquiaNacimiento;
    private Integer codigoCantonResidencia;
    private Integer codigoParroquiaResidencia;
    private Integer codigoProvinciaNacimiento;
    private Integer codPaisNacimiento;
    private Integer codigoProvinciaResidencia;
    private Integer codPaisResidencia;
    private String lugarNacimiento;
}
