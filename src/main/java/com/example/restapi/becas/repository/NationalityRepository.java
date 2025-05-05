package com.example.restapi.becas.repository;

import com.example.restapi.becas.model.NationalityType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface NationalityRepository extends JpaRepository<NationalityType, Long> {
    @Query(value = "select * from catalogos where tipos_catalogos_id = 9", nativeQuery = true)
    List<NationalityType> findByTiposCatalogosId(Long tiposCatalogosId);; // Trae todos los tipos de identificación
}
