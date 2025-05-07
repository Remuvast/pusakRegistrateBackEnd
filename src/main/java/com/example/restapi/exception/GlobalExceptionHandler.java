package com.example.restapi.exception;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(DataIntegrityViolationException.class)
    public ResponseEntity<?> handleDataIntegrityViolation(DataIntegrityViolationException ex) {
        String rootMessage = ex.getMostSpecificCause().getMessage();
        String message;

        if (rootMessage != null) {
            if (rootMessage.contains("username_estado_uk")) {
                message = "El número de identificación ya está registrado y vigente.";
            } else if (rootMessage.contains("correo_principal_estado_uk")) {
                message = "El correo electrónico ya está registrado y vigente.";
            } else {
                message = "Error de integridad de datos: " + rootMessage;
            }
        } else {
            message = "Error de integridad de datos.";
        }

        return ResponseEntity.status(HttpStatus.CONFLICT)
                .body(new ErrorResponse(HttpStatus.CONFLICT.value(), message));
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<?> handleGenericException(Exception ex) {
        ex.printStackTrace(); // Imprime en consola
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body(new ErrorResponse(500, "Ocurrió un error inesperado: " + ex.getMessage()));
    }

    // Clase interna para el formato del error
    static class ErrorResponse {
        private final int status;
        private final String message;

        public ErrorResponse(int status, String message) {
            this.status = status;
            this.message = message;
        }

        public int getStatus() {
            return status;
        }

        public String getMessage() {
            return message;
        }
    }
}
