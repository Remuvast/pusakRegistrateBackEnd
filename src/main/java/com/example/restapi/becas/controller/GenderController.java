package com.example.restapi.becas.controller;

import com.example.restapi.becas.model.GenderType;
import com.example.restapi.becas.repository.GenderRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/catalogos")
public class GenderController {

    private final GenderRepository tipoRepo;

    public GenderController(GenderRepository tipoRepo) {
        this.tipoRepo = tipoRepo;
    }

    @GetMapping("/generos")
    public List<GenderType> getTiposGeneros() {
        return tipoRepo.findByTiposCatalogosId(10L);
    }
}
