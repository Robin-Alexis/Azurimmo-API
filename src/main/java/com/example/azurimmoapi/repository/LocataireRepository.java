package com.example.azurimmoapi.repository;

import com.example.azurimmoapi.model.Locataire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocataireRepository  extends JpaRepository<Locataire, Long> {
}
