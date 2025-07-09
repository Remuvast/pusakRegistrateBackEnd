package com.example.restapi.service;

import com.example.restapi.dto.UsuarioSolicitanteDTO;
import com.example.restapi.service.EmailService;
import com.example.restapi.usuarios.model.Usuario;
import com.example.restapi.usuarios.repository.UsuariosRepository;
import com.example.restapi.becas.model.Solicitante;
import com.example.restapi.becas.repository.SolicitanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Value;

import java.time.LocalDate;
import java.util.UUID;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;

@Service
public class RegistroService {

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
        usuario.setClave(hashSHA512(dto.getClave()));
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

        String nombreCompleto = (dto.getApellidosNombres() == null || dto.getApellidosNombres().isBlank())
                ? (dto.getApellidos() + " " + dto.getNombres()).trim()
                : dto.getApellidosNombres().trim();

        usuario.setNombreCompleto(nombreCompleto);
        usuario.setRegistrado(true);

        String codigo = UUID.randomUUID().toString();
        usuario.setCodigoActivacion(codigo);

        usuario = usuarioRepository.save(usuario);

        // 2. Crear y guardar solicitante
        Solicitante solicitante = new Solicitante();
        solicitante.setCatalogosTipoIdentificacionId(mapTipoIdentificacion(dto.getTipoIdentificacion()));
        solicitante.setNumeroIdentificacion(dto.getNumeroIdentificacion());
        solicitante.setApellidoCompleto(dto.getApellidos());
        solicitante.setNombreCompleto(dto.getNombres());
        solicitante.setApellidoNombre(nombreCompleto);
        solicitante.setFechaNacimiento(LocalDate.parse(dto.getFechaNacimiento()));
        solicitante.setCatalogosGeneroId(dto.getCodigoGenero());
        solicitante.setCatalogosEstadoCivilId(dto.getCodigoEstadoCivil());
        solicitante.setCatalogosEtniaId(dto.getCodigoEtnia());

        Boolean discapacidadFlag = (dto.getPorcentajeDiscapacidad() != null && dto.getPorcentajeDiscapacidad() > 0);
        solicitante.setDiscapacidad(discapacidadFlag);
        solicitante.setCatalogosTipoDiscapacidadId(dto.getCodigoTipoDiscapacidad());
        solicitante.setPorcentajeDiscapacidad(dto.getPorcentajeDiscapacidad());

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

        String enlace = frontendActivacionUrl + "?id=" + usuario.getId() + "&codigo=" + codigo;

        emailService.enviarCorreoActivacion(
                usuario.getCorreoPrincipal(),
                usuario.getApellidos() + " " + usuario.getNombres(),
                usuario.getNumeroIdentificacion(),
                enlace);
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

    private String hashSHA512(String password) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-512");
            byte[] hashBytes = md.digest(password.getBytes(StandardCharsets.UTF_8));
            StringBuilder sb = new StringBuilder();
            for (byte b : hashBytes) {
                sb.append(String.format("%02x", b));
            }
            return sb.toString();
        } catch (Exception e) {
            throw new RuntimeException("Error generando hash SHA-512", e);
        }
    }

}
