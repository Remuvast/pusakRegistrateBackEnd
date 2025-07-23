package com.example.restapi.becas.controller;

import com.example.restapi.becas.model.MaritalStatusType;
import com.example.restapi.becas.repository.MaritalStatusRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/catalogos")
public class MaritalStatusController {

    private final MaritalStatusRepository tipoRepo;

    public MaritalStatusController(MaritalStatusRepository tipoRepo) {
        this.tipoRepo = tipoRepo;
    }

    @GetMapping("/estado-civil")
    public List<MaritalStatusType> getEstadoCivil() {
        return tipoRepo.findByTiposCatalogosId(6L).stream()
                .filter(m -> !"ISI".equals(m.getCodigo())) // GSI es el código de "SIN INFORMACION"
                .collect(Collectors.toList());
    }
}
