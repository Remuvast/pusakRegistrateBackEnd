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
                "mensaje", existe ? "El correo ya está registrado." : "El correo está disponible."
        ));
    }
}
