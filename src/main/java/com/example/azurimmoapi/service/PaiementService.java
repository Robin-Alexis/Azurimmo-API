package com.example.azurimmoapi.service;

import com.example.azurimmoapi.model.Contrat;
import com.example.azurimmoapi.model.Paiement;
import com.example.azurimmoapi.repository.ContratRepository;
import com.example.azurimmoapi.repository.PaiementRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Data
@Service
public class PaiementService {

    @Autowired
    private PaiementRepository paiementRepository;

    public Iterable<Paiement> getPaiements() {
        return paiementRepository.findAll();
    }

    public Optional<Paiement> getPaiementById(final Long id) {
        return paiementRepository.findById(id);
    }

    public void deletePaiement(final Long id) {
        paiementRepository.deleteById(id);
    }

    public Paiement savePaiement(Paiement paiement) {
        Paiement saved = paiementRepository.save(paiement);
        return saved;
    }
}
