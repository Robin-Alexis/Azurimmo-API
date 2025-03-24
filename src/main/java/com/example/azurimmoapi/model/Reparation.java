package com.example.azurimmoapi.model;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "reparation")
public class Reparation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="description")
    private String description;

    @Column(name="date")
    private LocalDate date;

    @ManyToOne
    @JoinColumn(name = "appartement_id")
    private Appartement appartement;

    @ManyToOne
    @JoinColumn(name = "societe_id")
    private Societe societe;

    @ManyToOne
    @JoinColumn(name = "type_id")
    private Type type;
}
