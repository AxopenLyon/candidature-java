package fr.axopen.candidature.repository;

import fr.axopen.candidature.bo.Chantier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ChantierRepository extends JpaRepository<Chantier, Long> {

    @Query("SELECT c FROM Chantier c WHERE c.numero = :numero")
    Chantier findByNumero(@Param("numero") Long numero);

}
