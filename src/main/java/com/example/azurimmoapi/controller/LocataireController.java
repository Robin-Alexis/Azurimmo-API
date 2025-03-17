package com.example.azurimmoapi.controller;

import com.example.azurimmoapi.model.Appartement;
import com.example.azurimmoapi.model.Contrat;
import com.example.azurimmoapi.model.Locataire;
import com.example.azurimmoapi.service.ContratService;
import com.example.azurimmoapi.service.LocataireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.Optional;

@RestController
public class LocataireController {

    @Autowired
    private LocataireService locataireService;

    @GetMapping("/locataires")
    public Iterable<Locataire> getAllLocataires() {
        return locataireService.getLocataires();
    }

    @GetMapping("/locataire/{id}")
    public Locataire getLocataire(@PathVariable final Long id) {
        Optional<Locataire> locataire = locataireService.getLocataireById(id);
        return locataire.orElse(null);
    }

    @PostMapping("/locataire")
    public Locataire addLocataire(@RequestBody Locataire locataire) {
        return locataireService.saveLocataire(locataire);
    }

    @PutMapping("/locataire/{id}")
    public Locataire updateLocataire(@PathVariable("id") final Long id, @RequestBody Locataire locataire) {
        Optional<Locataire> l = locataireService.getLocataireById(id);
        if (l.isPresent()) {
            Locataire currentLocataire = l.get();

            String adresse = locataire.getAdresse();
            if(adresse != null) {
                currentLocataire.setAdresse(adresse);
            }

            String prenom = locataire.getPrenom();
            if(prenom != null) {
                currentLocataire.setPrenom(prenom);
            }

            Integer telephone = locataire.getTelephone();
            if(telephone != null) {
                currentLocataire.setTelephone(telephone);;
            }

            String email = locataire.getEmail();
            if(email != null) {
                currentLocataire.setEmail(email);;
            }

            locataireService.saveLocataire(currentLocataire);
            return currentLocataire;
        } else {
            return null;
        }
    }

    @DeleteMapping("/locataire/{id}")
    public void deleteLocataire(@PathVariable("id") final Long id) {

        locataireService.deleteLocataire(id);
    }
}
