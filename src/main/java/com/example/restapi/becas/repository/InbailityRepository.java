package com.example.restapi.becas.repository;

import com.example.restapi.becas.model.InabilityType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface InbailityRepository extends JpaRepository<InabilityType, Long> {
    @Query(value = "select * from catalogos where tipos_catalogos_id = 7", nativeQuery = true)
    List<InabilityType> findByTiposCatalogosId(Long tiposCatalogosId);; // Trae todos los tipos de identificación
}
