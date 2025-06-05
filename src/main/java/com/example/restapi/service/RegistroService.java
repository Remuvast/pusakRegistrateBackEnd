// Ahora vamos a crear el servicio que manejará la lógica de inserción en ambas tablas (usuarios y solicitantes):

package com.example.restapi.service;

import com.example.restapi.dto.UsuarioSolicitanteDTO;
import com.example.restapi.service.EmailService;
import com.example.restapi.usuarios.model.Usuario;
import com.example.restapi.usuarios.repository.UsuariosRepository;
import com.example.restapi.becas.model.Solicitante;
import com.example.restapi.becas.repository.SolicitanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.beans.factory.annotation.Value;

import java.time.LocalDate;
import java.util.UUID;

@Service

public class RegistroService {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private EmailService emailService;

    @Autowired
    private UsuariosRepository usuarioRepository;

    @Autowired
    private SolicitanteRepository solicitanteRepository;

    @Value("${app.frontend.activacion.url}")
    private String frontendActivacionUrl;


    public void registrar(UsuarioSolicitanteDTO dto) {
        // 1. Crear y configurar el usuario
        Usuario usuario = new Usuario();
        usuario.setNombres(dto.getNombres());
        usuario.setApellidos(dto.getApellidos());
        usuario.setTipoIdentificacion(dto.getTipoIdentificacion());
        usuario.setNumeroIdentificacion(dto.getNumeroIdentificacion());
        usuario.setUsername(dto.getNumeroIdentificacion());
        usuario.setClave(passwordEncoder.encode(dto.getClave()));
        usuario.setCorreoPrincipal(dto.getCorreoPrincipal());
        usuario.setCorreoAlterno(dto.getCorreoAlterno());
        usuario.setFechaExpiracionClave(LocalDate.now().plusYears(1));
        usuario.setInstitucionesId(2);
        usuario.setPrimeraVez(true);
        usuario.setUsuarioCreacion(dto.getNumeroIdentificacion());
        usuario.setFechaCreacion(LocalDate.now());
        usuario.setVigente(true);
        usuario.setActivo(false); // Desactivado hasta activar vía email
        usuario.setTiposUsuariosId(3);
        usuario.setPreguntas1Id(2);
        usuario.setRespuesta1(dto.getRespuesta1());
        usuario.setPreguntas2Id(3);
        usuario.setRespuesta2(dto.getRespuesta2());
        usuario.setPreguntas3Id(4);
        usuario.setRespuesta3(dto.getRespuesta3());
        usuario.setBloqueado(false);
        usuario.setNombreCompleto(dto.getApellidosNombres());
        usuario.setRegistrado(true);

        // 👉 Generar código de activación
        String codigo = UUID.randomUUID().toString();
        usuario.setCodigoActivacion(codigo);

        // 👉 Guardar usuario
        usuario = usuarioRepository.save(usuario); // se actualiza con ID

        // 2. Crear y guardar solicitante
        Solicitante solicitante = new Solicitante();
        solicitante.setCatalogosTipoIdentificacionId(mapTipoIdentificacion(dto.getTipoIdentificacion()));
        solicitante.setNumeroIdentificacion(dto.getNumeroIdentificacion());
        solicitante.setApellidoCompleto(dto.getApellidos());
        solicitante.setNombreCompleto(dto.getNombres());
        solicitante.setApellidoNombre(dto.getApellidosNombres());
        solicitante.setFechaNacimiento(LocalDate.parse(dto.getFechaNacimiento()));
        solicitante.setCatalogosGeneroId(dto.getCodigoGenero());
        solicitante.setCatalogosEstadoCivilId(dto.getCodigoEstadoCivil());
        solicitante.setCatalogosEtniaId(dto.getCodigoEtnia());
        solicitante.setDiscapacidad(false);
        solicitante.setCatalogosNacionalidadId(dto.getCodigoNacionalidad());
        solicitante.setTelefonoConvencional(dto.getTelefonoConvencional());
        solicitante.setTelefonoCelular1(dto.getCelular());
        solicitante.setCorreoElectronicoPrincipal(dto.getCorreoPrincipal());
        solicitante.setCorreoElectronicoAlternativo(dto.getCorreoAlterno());
        solicitante.setUrbanoRuralResidencia(dto.getCodigoZonaResidencia());
        solicitante.setSectorResidencia(dto.getSectorResidencia());
        solicitante.setCallePrincipalResidencia(dto.getCallePrincipal());
        solicitante.setCalleSecundariaResidencia(dto.getCalleSecundaria());
        solicitante.setNumeroResidencia(dto.getNumero());
        solicitante.setReferenciaGeograficaResidencia(dto.getReferencia());
        solicitante.setUbicacionesGeograficasCantonNacimientoId(dto.getCodigoCantonNacimiento());
        solicitante.setUbicacionesGeograficasParroquiaNacimientoId(dto.getCodigoParroquiaNacimiento());
        solicitante.setUbicacionesGeograficasCantonResidenciaId(dto.getCodigoCantonResidencia());
        solicitante.setUbicacionesGeograficasParroquiaResidenciaId(dto.getCodigoParroquiaResidencia());
        solicitante.setUbicacionesGeograficasProvinciaNacimientoId(dto.getCodigoProvinciaNacimiento());
        solicitante.setUbicacionesGeograficasPaisNacimientoId(dto.getCodPaisNacimiento());
        solicitante.setUbicacionesGeograficasProvinciaResidenciaId(dto.getCodigoProvinciaResidencia());
        solicitante.setUbicacionesGeograficasPaisResidenciaId(dto.getCodPaisResidencia());
        solicitante.setEstado(true);
        solicitante.setLugarNacimiento(dto.getLugarNacimiento());
        solicitante.setOrigenManual(false);
        solicitanteRepository.save(solicitante);

        String url = frontendActivacionUrl;
        String enlace = frontendActivacionUrl + "?id=" + usuario.getId() + "&codigo=" + codigo;

        emailService.enviarCorreoActivacion(
            usuario.getCorreoPrincipal(),
            usuario.getApellidos() + " " + usuario.getNombres(),
            usuario.getNumeroIdentificacion(),
            enlace
        );
    }

    private int mapTipoIdentificacion(String tipo) {
        switch (tipo.toUpperCase()) {
            case "CÉDULA":
                return 913;
            case "DNI":
                return 912;
            case "PASAPORTE":
                return 914;
            default:
                return 913;
        }
    }

}
