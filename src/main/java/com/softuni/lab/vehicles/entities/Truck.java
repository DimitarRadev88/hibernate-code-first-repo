package com.softuni.lab.vehicles.entities;

import jakarta.persistence.*;
import java.util.Set;

@Entity
@Table(name = "trucks")
public class Truck extends Vehicle {

    private Double loadCapacity;
    private Set<Driver> drivers;


    @Column(name = "load_capacity")
    public Double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(Double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @ManyToMany(mappedBy = "trucks")
    public Set<Driver> getDrivers() {
        return drivers;
    }

    public void setDrivers(Set<Driver> drivers) {
        this.drivers = drivers;
    }

}
