package com.softuni.lab.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "cars")
public class Car extends Vehicle {
    private Integer seats;
    private PlateNumber plateNumber;

    @Column(name = "seats")
    public Integer getSeats() {
        return seats;
    }

    public void setSeats(Integer seats) {
        this.seats = seats;
    }

    @OneToOne
    @JoinColumn(name = "plate_number_id")
    public PlateNumber getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(PlateNumber plateNumber) {
        this.plateNumber = plateNumber;
    }
}
