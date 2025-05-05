package com.example.restapi.usuarios.repository;

import com.example.restapi.usuarios.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface UsuariosRepository extends JpaRepository<Usuario, Long> {
    Optional<Usuario> findByCodigoActivacion(String codigo);
    Optional<Usuario> findByIdAndCodigoActivacion(Long id, String codigoActivacion);

}
