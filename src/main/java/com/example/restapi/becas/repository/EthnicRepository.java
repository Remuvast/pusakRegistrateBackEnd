package com.example.restapi.becas.repository;

import com.example.restapi.becas.model.EthnicType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface EthnicRepository extends JpaRepository<EthnicType, Long> {
    @Query(value = "select * from catalogos where tipos_catalogos_id = 5", nativeQuery = true)
    List<EthnicType> findByTiposCatalogosId(Long tiposCatalogosId);; // Trae todos los tipos de identificación
}
