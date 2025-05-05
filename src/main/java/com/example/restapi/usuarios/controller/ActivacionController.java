package com.example.restapi.usuarios.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.restapi.service.EmailService;
import com.example.restapi.usuarios.model.Usuario;
import com.example.restapi.usuarios.repository.UsuariosRepository;
import org.springframework.http.HttpStatus;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class ActivacionController {

    @Autowired
    private UsuariosRepository usuariosRepository;

    @GetMapping("/activar")
    public ResponseEntity<String> activarCuenta(@RequestParam("id") Long id,
            @RequestParam("codigo") String codigo) {
        Optional<Usuario> usuarioOpt = usuariosRepository.findByIdAndCodigoActivacion(id, codigo);

        if (usuarioOpt.isPresent()) {
            Usuario usuario = usuarioOpt.get();
            usuario.setActivo(true);
            usuario.setCodigoActivacion(null); // Limpiar el código
            usuariosRepository.save(usuario);
            return ResponseEntity.ok("Cuenta activada exitosamente.");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Código o ID inválido.");
        }
    }
}
