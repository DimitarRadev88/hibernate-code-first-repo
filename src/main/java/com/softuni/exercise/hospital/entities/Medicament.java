package com.softuni.exercise.hospital.entities;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "medicaments")
public class Medicament {
    private Long id;
    private String name;
    private Set<Diagnose> diagnoses;

    public Medicament() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "name", nullable = false, unique = true)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @ManyToMany
    @JoinTable(name = "diagnoses_medicaments",
            joinColumns = @JoinColumn(name = "medicament_id"),
            inverseJoinColumns = @JoinColumn(name = "diagnose_id")

    )
    public Set<Diagnose> getDiagnoses() {
        return diagnoses;
    }

    public void setDiagnoses(Set<Diagnose> diagnoses) {
        this.diagnoses = diagnoses;
    }
}
