package com.example.restapi.becas.controller;

import com.example.restapi.becas.model.InabilityType;
import com.example.restapi.becas.repository.InbailityRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/catalogos")
public class InavilityController {

    private final InbailityRepository tipoRepo;

    public InavilityController(InbailityRepository tipoRepo) {
        this.tipoRepo = tipoRepo;
    }

    @GetMapping("/discapacidades")
    public List<InabilityType> getDiscapaciades() {
        return tipoRepo.findByTiposCatalogosId(10L);
    }
}
