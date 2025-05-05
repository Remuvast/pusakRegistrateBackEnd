package com.example.restapi.becas.model;

import jakarta.persistence.*;

@Entity
@Table(name = "ubicaciones_geograficas")
public class GeographicLocationsType {

    @Id
    private Long id;

    private String nombre;

    private String codigo;

    @Column(name = "ubicaciones_geograficas_id")
    private Long padreId;

    private String tipo;

    // Getters y Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Long getPadreId() {
        return padreId;
    }

    public void setPadreId(Long padreId) {
        this.padreId = padreId;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
