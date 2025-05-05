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

    public void registrar(UsuarioSolicitanteDTO dto) {
        // Guardar en tabla usuarios
        Usuario usuario = new Usuario();
        usuario.setNombres(dto.getNombres());
        usuario.setApellidos(dto.getApellidos());
        usuario.setTipoIdentificacion(dto.getTipoIdentificacion());
        usuario.setNumeroIdentificacion(dto.getNumeroIdentificacion());
        usuario.setUsername(dto.getNumeroIdentificacion());
        //passwordEncoder es un bean que debes definir en tu configuración de seguridad
        usuario.setClave(passwordEncoder.encode(dto.getClave()));
        usuario.setCorreoPrincipal(dto.getCorreoPrincipal());
        usuario.setCorreoAlterno(dto.getCorreoAlterno());
        usuario.setFechaExpiracionClave(LocalDate.now().plusYears(1));
        usuario.setInstitucionesId(2);
        usuario.setPrimeraVez(true);
        usuario.setUsuarioCreacion(dto.getNumeroIdentificacion());
        usuario.setFechaCreacion(LocalDate.now());
        usuario.setVigente(true);
        usuario.setActivo(false);
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
        usuarioRepository.save(usuario);

        // Guardar en tabla solicitantes
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
        usuario.setCodigoActivacion(UUID.randomUUID().toString());
        usuario = usuarioRepository.save(usuario); // importante reasignar para obtener el ID generado
        emailService.enviarCorreoActivacion(
            usuario.getCorreoPrincipal(),
            usuario.getNombreCompleto(),
            usuario.getId(),
            usuario.getCodigoActivacion()
        );
    }

    private int mapTipoIdentificacion(String tipo) {
        return switch (tipo.toUpperCase()) {
            case "CÉDULA" -> 913;
            case "DNI" -> 912;
            case "PASAPORTE" -> 914;
            default -> 913;
        };
    }
}
