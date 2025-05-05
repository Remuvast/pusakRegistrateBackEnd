package com.example.restapi.becas.repository;

import com.example.restapi.becas.model.GeographicLocationsType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GeographicLocationsRepository extends JpaRepository<GeographicLocationsType, Long> {

    @Query(value = "SELECT * FROM ubicaciones_geograficas WHERE tipo = 'P'", nativeQuery = true)
    List<GeographicLocationsType> obtenerPaises();

    @Query(value = "SELECT * FROM ubicaciones_geograficas WHERE tipo = 'E' AND ubicaciones_geograficas_id = ?1", nativeQuery = true)
    List<GeographicLocationsType> obtenerProvinciasPorPais(Long paisId);

    @Query(value = "SELECT * FROM ubicaciones_geograficas WHERE tipo = 'C' AND ubicaciones_geograficas_id = ?1", nativeQuery = true)
    List<GeographicLocationsType> obtenerCantonesPorProvincia(Long provinciaId);

    @Query(value = "SELECT * FROM ubicaciones_geograficas WHERE tipo = 'R' AND ubicaciones_geograficas_id = ?1", nativeQuery = true)
    List<GeographicLocationsType> obtenerParroquiasPorCanton(Long cantonId);
}
