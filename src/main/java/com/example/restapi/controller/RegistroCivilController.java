package com.example.restapi.controller;

import com.example.restapi.dto.ConsultaCedulaDTO;
import com.example.restapi.rc.ServicioRegistroCivil;
import com.example.restapi.rc.GetFichaGeneralResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import com.example.restapi.dto.DatosRegistroCivilDTO;

@RestController
@RequestMapping("/api/registro-civil")
public class RegistroCivilController {

    @Autowired
    private ServicioRegistroCivil servicioRegistroCivil;

    @PostMapping("/consultar")
    public ResponseEntity<?> consultarCedula(@RequestBody ConsultaCedulaDTO consultaCedulaDTO) {
        System.out.println("Consultando cédula: " + consultaCedulaDTO.getNumeroCedula());

        if (consultaCedulaDTO.getNumeroCedula() == null || consultaCedulaDTO.getNumeroCedula().isEmpty()) {
            return ResponseEntity.badRequest().body("El número de cédula es obligatorio.");
        }

        DatosRegistroCivilDTO response = servicioRegistroCivil.consultarFichaGeneral(consultaCedulaDTO.getNumeroCedula());
        return ResponseEntity.ok(response);
    }

}
