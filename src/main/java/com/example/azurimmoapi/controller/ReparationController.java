package com.example.azurimmoapi.controller;

import com.example.azurimmoapi.model.Reparation;
import com.example.azurimmoapi.service.ReparationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReparationController {

    @Autowired
    private ReparationService reparationService;

    @GetMapping("/reparations")
    public Iterable<Reparation> getAllReparations() {
        return reparationService.getReparations();
    }
}
