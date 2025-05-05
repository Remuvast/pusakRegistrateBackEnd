package com.example.restapi.becas.controller;

import com.example.restapi.becas.model.Usuario;
import com.example.restapi.becas.repository.UsuarioRepository;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

    private final UsuarioRepository usuarioRepository;

    public UsuarioController(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @GetMapping("/top10")
    public List<Usuario> obtenerTop10Usuarios() {
        return usuarioRepository.findTop10ByOrderByIdAsc();
    }
}
