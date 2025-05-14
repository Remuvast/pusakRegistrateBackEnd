package com.example.restapi.exception;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(DataIntegrityViolationException.class)
    public ResponseEntity<String> handleDuplicateKey(DataIntegrityViolationException ex) {
        String rootMessage = ex.getRootCause() != null ? ex.getRootCause().getMessage() : "";

        if (rootMessage.contains("username_estado_uk")) {
            return ResponseEntity.status(HttpStatus.CONFLICT)
                    .body("Ya existe un usuario con esa cédula y estado vigente.");
        } else if (rootMessage.contains("correo_principal_estado_uk")) {
            return ResponseEntity.status(HttpStatus.CONFLICT)
                    .body("Ya existe un usuario con ese correo principal y estado vigente.");
        }

        return ResponseEntity.status(HttpStatus.CONFLICT)
                .body("Conflicto de integridad de datos: " + rootMessage);
    }

}
