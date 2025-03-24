package com.example.azurimmoapi.model;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "societe")
public class Societe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="nom")
    private String nom;
}
