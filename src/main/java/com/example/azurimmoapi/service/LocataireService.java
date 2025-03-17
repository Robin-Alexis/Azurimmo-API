package com.example.azurimmoapi.service;

import com.example.azurimmoapi.model.Contrat;
import com.example.azurimmoapi.model.Locataire;
import com.example.azurimmoapi.repository.ContratRepository;
import com.example.azurimmoapi.repository.LocataireRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Data
@Service
public class LocataireService {

    @Autowired
    private LocataireRepository locataireRepository;

    public Iterable<Locataire> getLocataires() {
        return locataireRepository.findAll();
    }

    public Optional<Locataire> getLocataireById(final Long id) {
        return locataireRepository.findById(id);
    }

    public void deleteLocataire(final Long id) {
        locataireRepository.deleteById(id);
    }

    public Locataire saveLocataire(Locataire locataire) {
        Locataire saved = locataireRepository.save(locataire);
        return saved;
    }
}
