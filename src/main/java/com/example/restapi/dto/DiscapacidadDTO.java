package com.example.restapi.dto;

public class DiscapacidadDTO {
    private boolean wsDisponible;
    private String valor;
    private String tipo;
    private String porcentaje;

    // Getters y Setters

    public boolean isWsDisponible() {
        return wsDisponible;
    }

    public void setWsDisponible(boolean wsDisponible) {
        this.wsDisponible = wsDisponible;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(String porcentaje) {
        this.porcentaje = porcentaje;
    }
}
