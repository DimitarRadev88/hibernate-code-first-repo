package com.softuni.exercise.billsPaymentSystem.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "billing_detail")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class BillingDetail {
    private Long id;
    private String number;
    private User owner;

    protected BillingDetail() {}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "number", nullable = false, unique = true)
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @ManyToOne(cascade = CascadeType.REMOVE)
    @JoinColumn(name = "owner_id")
    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

}
