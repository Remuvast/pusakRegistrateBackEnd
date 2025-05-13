// Ensure this is the correct package for the class
package com.example.restapi.model;

public class Campo {
    private String nombre;
    private String valor;

    // Constructor to match the usage in RegistroCivilFormatter
    public Campo(String nombre, String valor) {
        this.nombre = nombre;
        this.valor = valor;
    }

    // Getters and setters (optional, if needed)
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
}
