package com.example.restapi.becas.controller;

import com.example.restapi.becas.model.MaritalStatusType;
import com.example.restapi.becas.repository.MaritalStatusRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/catalogos")
public class MaritalStatusController {

    private final MaritalStatusRepository tipoRepo;

    public MaritalStatusController(MaritalStatusRepository tipoRepo) {
        this.tipoRepo = tipoRepo;
    }

    @GetMapping("/estado-civil")
    public List<MaritalStatusType> getEstadoCivil() {
        return tipoRepo.findByTiposCatalogosId(6L);
    }
}
