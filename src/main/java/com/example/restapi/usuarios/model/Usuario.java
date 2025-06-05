package com.example.restapi.usuarios.model;

import javax.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Table(name = "usuarios")
@Data
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "correo_alterno")
    private String correoAlterno;

    private String nombres;
    private String apellidos;

    @Column(name = "tipo_identificacion")
    private String tipoIdentificacion;

    @Column(name = "numero_identificacion")
    private String numeroIdentificacion;

    private String username;
    private String clave;

    @Column(name = "correo_principal")
    private String correoPrincipal;

    @Column(name = "fecha_expiracion_clave")
    private LocalDate fechaExpiracionClave;

    @Column(name = "instituciones_id")
    private Integer institucionesId;

    @Column(name = "primera_vez")
    private Boolean primeraVez;

    @Column(name = "usuario_creacion")
    private String usuarioCreacion;

    @Column(name = "fecha_creacion")
    private LocalDate fechaCreacion;

    @Column(name = "vigente")
    private Boolean vigente;

    @Column(name = "activo")
    private Boolean activo;

    @Column(name = "tipos_usuarios_id")
    private Integer tiposUsuariosId;

    @Column(name = "preguntas1_id")
    private Integer preguntas1Id;
    private String respuesta1;

    @Column(name = "preguntas2_id")
    private Integer preguntas2Id;
    private String respuesta2;

    @Column(name = "preguntas3_id")
    private Integer preguntas3Id;
    private String respuesta3;

    private Boolean bloqueado;

    @Column(name = "nombre_completo")
    private String nombreCompleto;

    private Boolean registrado;

    @Column(name = "codigo_activacion")
    private String codigoActivacion;




}
