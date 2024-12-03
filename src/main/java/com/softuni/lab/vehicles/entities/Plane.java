package com.softuni.lab.vehicles.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "planes")
public class Plane extends Vehicle {
    private Integer passengerCapacity;
    private Company company;

    @Column(name = "passenger_capacity")
    public Integer getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(Integer passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    @ManyToOne
    @JoinColumn(name = "company_id")
    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
}
