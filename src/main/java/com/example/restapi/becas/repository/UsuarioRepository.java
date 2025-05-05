package com.example.restapi.becas.repository;

import com.example.restapi.becas.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    @Query(value = "SELECT * FROM usuarios ORDER BY id LIMIT 10", nativeQuery = true)
    List<Usuario> findTop10ByOrderByIdAsc();  // Ordena por ID y trae los primeros 10
}
