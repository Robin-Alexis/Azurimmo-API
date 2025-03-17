package com.example.azurimmoapi.repository;

import com.example.azurimmoapi.model.Paiement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaiementRepository  extends JpaRepository<Paiement, Long> {
}
