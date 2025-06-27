package com.example.restapi.controller;

import com.example.restapi.dto.ConsultaCedulaDTO;
import com.example.restapi.dto.DiscapacidadDTO;
import com.example.restapi.service.ServicioMspDiscapacidad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/discapacidad")
public class DiscapacidadController {

    @Autowired
    private ServicioMspDiscapacidad servicio;

    @PostMapping("/consultar")
    public ResponseEntity<DiscapacidadDTO> consultar(@RequestBody ConsultaCedulaDTO cedulaDTO) {
        DiscapacidadDTO dto = servicio.consultar(cedulaDTO.getNumeroCedula());
        return ResponseEntity.ok(dto);
    }
}
