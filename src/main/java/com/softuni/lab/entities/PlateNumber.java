package com.softuni.lab.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "plate_numbers")
public class PlateNumber {
    private Long id;
    private String number;

    public PlateNumber() {}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "number", unique = true)
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
