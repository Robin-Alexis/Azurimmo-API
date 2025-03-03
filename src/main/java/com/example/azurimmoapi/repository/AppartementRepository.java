package com.example.azurimmoapi.repository;

import com.example.azurimmoapi.model.Appartement;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

@Repository
public interface AppartementRepository extends JpaRepository<Appartement, Long> {

    List<Appartement> findByBatimentVille(String ville);
    List<Appartement> findByBatimentId(long id);
}
