package com.example.restapi.becas.controller;

import com.example.restapi.becas.model.EthnicType;
import com.example.restapi.becas.repository.EthnicRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/catalogos")
public class EthnicController {

    private final EthnicRepository tipoRepo;

    public EthnicController(EthnicRepository tipoRepo) {
        this.tipoRepo = tipoRepo;
    }

    @GetMapping("/etnia")
    public List<EthnicType> getEtnia() {
        return tipoRepo.findByTiposCatalogosId(5L).stream()
                .filter(e -> !"0".equals(e.getCodigo())) // 0 es el código de "SIN INFORMACION"
                .collect(Collectors.toList());
    }
}
