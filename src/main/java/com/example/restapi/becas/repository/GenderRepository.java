package com.example.restapi.becas.repository;

import com.example.restapi.becas.model.GenderType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface GenderRepository extends JpaRepository<GenderType, Long> {
    @Query(value = "select * from catalogos where tipos_catalogos_id = 10", nativeQuery = true)
    List<GenderType> findByTiposCatalogosId(Long tiposCatalogosId);; // Trae todos los tipos de identificación
}
