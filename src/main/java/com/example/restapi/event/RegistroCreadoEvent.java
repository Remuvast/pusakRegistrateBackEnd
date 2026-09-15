package com.example.restapi.event;

public class RegistroCreadoEvent {

    private final Long usuarioId;
    private final String codigoActivacion;
    private final String correo;
    private final String nombreCompleto;
    private final String numeroIdentificacion;

    public RegistroCreadoEvent(
            Long usuarioId,
            String codigoActivacion,
            String correo,
            String nombreCompleto,
            String numeroIdentificacion) {

        this.usuarioId = usuarioId;
        this.codigoActivacion = codigoActivacion;
        this.correo = correo;
        this.nombreCompleto = nombreCompleto;
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public Long getUsuarioId() {
        return usuarioId;
    }

    public String getCodigoActivacion() {
        return codigoActivacion;
    }

    public String getCorreo() {
        return correo;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }
}
