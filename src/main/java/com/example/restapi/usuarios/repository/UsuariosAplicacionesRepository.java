package com.example.restapi.usuarios.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuariosAplicacionesRepository extends JpaRepository<com.example.restapi.usuarios.model.UsuarioAplicacion, Long> {

    @Query("SELECT ua.id FROM UsuarioAplicacion ua JOIN ua.usuario u WHERE u.numeroIdentificacion = :numeroIdentificacion")
    Long findIdByNumeroIdentificacion(@Param("numeroIdentificacion") String numeroIdentificacion);
}
