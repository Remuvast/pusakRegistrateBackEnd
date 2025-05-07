package com.example.restapi.becas.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "usuarios")
public class Usuario {

    @Id
    private Long id;

    @Column(name = "nombres")
    private String nombres;

    @Column(name = "apellidos")
    private String apellidos;

    @Column(name = "tipo_identificacion")
    private String tipo_identificacion;

    @Column(name = "numero_identificacion")
    private String numero_identificacion;
}
