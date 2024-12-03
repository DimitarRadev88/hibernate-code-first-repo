package com.softuni.exercise.hospital.entities;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "diagnoses")
public class Diagnose {
    private Long id;
    private String name;
    private String comments;
    private Patient patient;
    private Set<Medicament> medicaments;

    public Diagnose() {}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "name", nullable = false)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "comments", columnDefinition = "TEXT", nullable = false)
    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    @OneToOne
    @JoinColumn(name = "patient_id", nullable = false)
    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    @ManyToMany(mappedBy = "diagnoses")
    public Set<Medicament> getMedicaments() {
        return medicaments;
    }

    public void setMedicaments(Set<Medicament> medicaments) {
        this.medicaments = medicaments;
    }
}
