package com.example.restapi.usuarios.repository;

import com.example.restapi.usuarios.model.Acceso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccesoRepository extends JpaRepository<Acceso, Long> {
}
