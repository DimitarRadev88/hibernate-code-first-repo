package com.softuni.lab;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("vehicle");


        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        em.getTransaction().commit();


    }
}
