package com.example.azurimmoapi.service;
import com.example.azurimmoapi.model.Reparation;
import com.example.azurimmoapi.repository.ReparationRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Data
@Service
public class ReparationService {

    @Autowired
    private ReparationRepository reparationRepository;

    public Iterable<Reparation> getReparations() {
        return reparationRepository.findAll();
    }
}
