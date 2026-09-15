package com.example.restapi.usuarios.controller;

import com.example.restapi.usuarios.repository.UsuariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/usuarios")
public class UsuariosController {

    @Autowired
    private UsuariosRepository usuariosRepository;

    @GetMapping("/existe-correo")
    public ResponseEntity<?> verificarCorreo(@RequestParam String correo) {
        boolean existe = usuariosRepository.existsByCorreoPrincipal(correo);

        return ResponseEntity.ok(Map.of(
                "correo", correo,
                "existe", existe,
                "mensaje", existe ? "El correo ya está registrado." : "El correo está disponible."));
    }


    // renes.munoz - Postulaciones Validar Tipo de Usuario
    @GetMapping("/existe")
    public ResponseEntity<?> existeCedula(@RequestParam String identificacion) {

        // El registro realizado desde este formulario
        // corresponde al usuario externo.
        Integer tipoUsuarioExterno = 3;

        boolean existe =
                usuariosRepository.existsByNumeroIdentificacionAndTiposUsuariosId(
                        identificacion,
                        tipoUsuarioExterno
                );

        return ResponseEntity.ok(Map.of(
                "numeroIdentificacion", identificacion,
                "existe", existe,
                "mensaje", existe
                        ? "El usuario ya está registrado."
                        : "El usuario está disponible."
        ));
    }


}
