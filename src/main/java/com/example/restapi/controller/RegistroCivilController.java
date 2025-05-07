package com.example.restapi.controller;

import com.example.restapi.dto.ConsultaCedulaDTO;
import com.example.restapi.rc.ServicioRegistroCivil;
import com.example.restapi.rc.GetFichaGeneralResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;

@RestController
@RequestMapping("/api/registro-civil")
public class RegistroCivilController {

    @Autowired
    private ServicioRegistroCivil servicioRegistroCivil;

    @PostMapping("/consultar")
    public ResponseEntity<?> consultarCedula(@RequestBody ConsultaCedulaDTO consultaCedulaDTO) {
        try {
            System.out.println("Consultando cédula: " + consultaCedulaDTO.getNumeroCedula());

            if (consultaCedulaDTO.getNumeroCedula() == null || consultaCedulaDTO.getNumeroCedula().isEmpty()) {
                return ResponseEntity.badRequest().body("El número de cédula es obligatorio.");
            }

            // Llamar al servicio con la cédula enviada en el JSON
            GetFichaGeneralResponse response = servicioRegistroCivil.consultarFichaGeneral(consultaCedulaDTO.getNumeroCedula());

            if (response == null) {
                return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                        .body("Ocurrió un error al consultar la cédula.");
            }

            return ResponseEntity.ok(response);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Ocurrió un error al consultar la cédula.");
        }
    }
}
