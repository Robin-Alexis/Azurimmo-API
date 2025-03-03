package com.example.azurimmoapi.repository;

import org.springframework.stereotype.Repository;
import com.example.azurimmoapi.model.Batiment;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface BatimentRepository extends  JpaRepository<Batiment, Long> {
}
