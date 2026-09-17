package com.example.restapi.becas.controller;

import com.example.restapi.dto.UsuarioSolicitanteDTO;
import com.example.restapi.service.RegistroService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;

@RestController
@RequestMapping("/api/registro")
public class UsuarioSolicitanteController {

    private final RegistroService service;

    public UsuarioSolicitanteController(RegistroService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<?> registrarUsuarioYSolicitante(@RequestBody UsuarioSolicitanteDTO dto) {

        try {
            service.registrar(dto);

            return ResponseEntity.ok(
                    Collections.singletonMap("mensaje", "Registro exitoso")
            );

        } catch (Exception e) {

            e.printStackTrace();

            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(Collections.singletonMap(
                            "mensaje",
                            "No se pudo completar el registro. Por favor, inténtelo nuevamente más tarde."
                    ));
        }
    }
}