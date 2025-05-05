package com.example.restapi.becas.repository;

import com.example.restapi.becas.model.IdentificationType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface IdentificacionRepository extends JpaRepository<IdentificationType, Long> {
    @Query(value = "select * from catalogos where tipos_catalogos_id = 4", nativeQuery = true)
    List<IdentificationType> findByTiposCatalogosId(Long tiposCatalogosId);; // Trae todos los tipos de identificación
}
