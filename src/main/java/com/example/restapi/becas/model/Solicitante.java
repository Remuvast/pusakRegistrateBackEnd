package com.example.restapi.becas.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "solicitantes")
@Data
public class Solicitante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "catalogos_tipo_identificacion_id")
    private Integer catalogosTipoIdentificacionId;

    @Column(name = "numero_identificacion")
    private String numeroIdentificacion;

    @Column(name = "apellido_completo")
    private String apellidoCompleto;

    @Column(name = "nombre_completo")
    private String nombreCompleto;

    @Column(name = "apellido_nombre")
    private String apellidoNombre;

    @Column(name = "fecha_nacimiento")
    private java.time.LocalDate fechaNacimiento;

    @Column(name = "catalogos_genero_id")
    private Integer catalogosGeneroId;

    @Column(name = "catalogos_estado_civil_id")
    private Integer catalogosEstadoCivilId;

    @Column(name = "catalogos_etnia_id")
    private Integer catalogosEtniaId;

    private Boolean discapacidad;

    @Column(name = "catalogos_tipo_discapacidad_id")
    private Integer catalogosTipoDiscapacidadId;

    @Column(name = "porcentaje_discapacidad")
    private Integer porcentajeDiscapacidad;

    @Column(name = "catalogos_nacionalidad_id")
    private Integer catalogosNacionalidadId;

    @Column(name = "telefono_convencional")
    private String telefonoConvencional;

    @Column(name = "telefono_celular_1")
    private String telefonoCelular1;

    @Column(name = "telefono_celular_2")
    private String telefonoCelular2;

    @Column(name = "correo_electronico_principal")
    private String correoElectronicoPrincipal;

    @Column(name = "correo_electronico_alternativo")
    private String correoElectronicoAlternativo;

    @Column(name = "urbano_rural_residencia")
    private String urbanoRuralResidencia;

    @Column(name = "direccion_residencia")
    private String direccionResidencia;

    @Column(name = "sector_residencia")
    private String sectorResidencia;

    @Column(name = "calle_principal_residencia")
    private String callePrincipalResidencia;

    @Column(name = "calle_secundaria_residencia")
    private String calleSecundariaResidencia;

    @Column(name = "numero_residencia")
    private String numeroResidencia;

    @Column(name = "referencia_geografica_residencia")
    private String referenciaGeograficaResidencia;

    @Column(name = "codigo_postal_residencia")
    private String codigoPostalResidencia;

    @Column(name = "ubicaciones_geograficas_canton_nacimiento_id")
    private Integer ubicacionesGeograficasCantonNacimientoId;

    @Column(name = "ubicaciones_geograficas_parroquia_nacimiento_id")
    private Integer ubicacionesGeograficasParroquiaNacimientoId;

    @Column(name = "ubicaciones_geograficas_canton_residencia_id")
    private Integer ubicacionesGeograficasCantonResidenciaId;

    @Column(name = "ubicaciones_geograficas_parroquia_residencia_id")
    private Integer ubicacionesGeograficasParroquiaResidenciaId;

    @Column(name = "ubicaciones_geograficas_provincia_nacimiento_id")
    private Integer ubicacionesGeograficasProvinciaNacimientoId;

    @Column(name = "ubicaciones_geograficas_pais_nacimiento_id")
    private Integer ubicacionesGeograficasPaisNacimientoId;

    @Column(name = "ubicaciones_geograficas_provincia_residencia_id")
    private Integer ubicacionesGeograficasProvinciaResidenciaId;

    @Column(name = "ubicaciones_geograficas_pais_residencia_id")
    private Integer ubicacionesGeograficasPaisResidenciaId;

    private Boolean estado;

    @Column(name = "lugar_nacimiento")
    private String lugarNacimiento;

    @Column(name = "origen_manual")
    private Boolean origenManual;
}
