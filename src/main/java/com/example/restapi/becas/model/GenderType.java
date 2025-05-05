package com.example.restapi.becas.model;
import jakarta.persistence.*;

@Entity
@Table(name = "catalogos")
public class GenderType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    private String descripcion;

    private String codigo;

    @Column(name = "tipos_catalogos_id")
    private Long tiposCatalogosId;

    private Boolean estado;

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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Long getTiposCatalogosId() {
        return tiposCatalogosId;
    }

    public void setTiposCatalogosId(Long tiposCatalogosId) {
        this.tiposCatalogosId = tiposCatalogosId;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
}
