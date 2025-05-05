package com.example.restapi.becas.controller;

import com.example.restapi.becas.model.IdentificationType;
import com.example.restapi.becas.repository.IdentificacionRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/catalogos")
public class CatalogController {

    private final IdentificacionRepository tipoRepo;

    public CatalogController(IdentificacionRepository tipoRepo) {
        this.tipoRepo = tipoRepo;
    }

    @GetMapping("/tipos-identificacion")
    public List<IdentificationType> getTiposIdentificacion() {
        return tipoRepo.findByTiposCatalogosId(4L);
    }
}
