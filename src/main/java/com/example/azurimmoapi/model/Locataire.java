package com.example.azurimmoapi.model;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "locataire")
public class Locataire {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="nom")
    private String adresse;

    @Column(name="prenom")
    private String prenom;

    @Column(name="telephone")
    private Integer telephone;

    @Column(name="email")
    private String email;
}
