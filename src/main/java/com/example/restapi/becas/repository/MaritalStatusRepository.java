package com.example.restapi.becas.repository;

import com.example.restapi.becas.model.MaritalStatusType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface MaritalStatusRepository extends JpaRepository<MaritalStatusType, Long> {
    @Query(value = "select * from catalogos where tipos_catalogos_id = 6", nativeQuery = true)
    List<MaritalStatusType> findByTiposCatalogosId(Long tiposCatalogosId);; // Trae todos los tipos de identificación
}
