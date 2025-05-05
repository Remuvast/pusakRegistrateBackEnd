package com.example.restapi.becas.controller;

import com.example.restapi.becas.model.NationalityType;
import com.example.restapi.becas.repository.NationalityRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/catalogos")
public class NationalityController {

    private final NationalityRepository tipoRepo;

    public NationalityController(NationalityRepository tipoRepo) {
        this.tipoRepo = tipoRepo;
    }

    @GetMapping("/nacionalidad")
    public List<NationalityType> getNacionalidad() {
        return tipoRepo.findByTiposCatalogosId(9L);
    }
}
