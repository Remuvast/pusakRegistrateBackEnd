package com.example.restapi.becas.controller;

import com.example.restapi.dto.UsuarioSolicitanteDTO;
import com.example.restapi.service.RegistroService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/registro")
public class UsuarioSolicitanteController {

    private final RegistroService service;

    public UsuarioSolicitanteController(RegistroService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<?> registrarUsuarioYSolicitante(@RequestBody UsuarioSolicitanteDTO dto) {
        service.registrar(dto);
        return ResponseEntity.ok("Registro exitoso");
    }
}
