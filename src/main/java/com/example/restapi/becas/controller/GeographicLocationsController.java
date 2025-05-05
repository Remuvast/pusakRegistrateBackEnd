package com.example.restapi.becas.controller;

import com.example.restapi.becas.model.GeographicLocationsType;
import com.example.restapi.becas.repository.GeographicLocationsRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ubicaciones")
public class GeographicLocationsController {

    private final GeographicLocationsRepository repo;

    public GeographicLocationsController(GeographicLocationsRepository repo) {
        this.repo = repo;
    }

    // 🟢 Obtener todos los países
    @GetMapping("/paises")
    public List<GeographicLocationsType> obtenerPaises() {
        return repo.obtenerPaises();
    }

    // 🟢 Obtener provincias por país
    @GetMapping("/provincias/{paisId}")
    public List<GeographicLocationsType> obtenerProvincias(@PathVariable Long paisId) {
        return repo.obtenerProvinciasPorPais(paisId);
    }

    // 🟢 Obtener cantones por provincia
    @GetMapping("/cantones/{provinciaId}")
    public List<GeographicLocationsType> obtenerCantones(@PathVariable Long provinciaId) {
        return repo.obtenerCantonesPorProvincia(provinciaId);
    }

    // 🟢 Obtener parroquias por cantón
    @GetMapping("/parroquias/{cantonId}")
    public List<GeographicLocationsType> obtenerParroquias(@PathVariable Long cantonId) {
        return repo.obtenerParroquiasPorCanton(cantonId);
    }
}
