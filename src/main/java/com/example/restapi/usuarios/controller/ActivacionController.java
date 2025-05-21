package com.example.restapi.usuarios.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;

import com.example.restapi.usuarios.model.Usuario;
import com.example.restapi.usuarios.repository.UsuariosRepository;

import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class ActivacionController {

    @Autowired
    private UsuariosRepository usuariosRepository;

    @GetMapping("/activar")
    public ResponseEntity<?> activarCuenta(@RequestParam("id") Long id,
                                           @RequestParam("codigo") String codigo) {
        Optional<Usuario> usuarioOpt = usuariosRepository.findByIdAndCodigoActivacion(id, codigo);

        if (usuarioOpt.isPresent()) {
            Usuario usuario = usuarioOpt.get();
            usuario.setActivo(true);
            usuario.setCodigoActivacion(null); // Limpiar el código
            usuariosRepository.save(usuario);

            return ResponseEntity.ok(Map.of(
                    "success", true,
                    "mensaje", "Cuenta activada exitosamente.",
                    "correo", usuario.getCorreoPrincipal()
            ));
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(Map.of(
                    "success", false,
                    "mensaje", "Código o ID inválido."
            ));
        }
    }
}
