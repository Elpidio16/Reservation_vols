package com.monprojet.demo.models;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Vols {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String depart;
    private String numeroVol;
    private String destination;
    private LocalDateTime date;
    private double prix;
    private int capacite;

    @OneToMany(mappedBy = "vol", cascade = CascadeType.ALL)
    private List<Reservation> reservations;


    // Getters and Setters

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDepart() {
        return depart;
    }

    public void setDepart(String depart) {
        this.depart = depart;
    }

    public String getNumeroVol() {
        return numeroVol;
    }

    public void setNumeroVol(String numeroVol) {
        this.numeroVol = numeroVol;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public int getCapacite() {
        return capacite;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }

    public void setNbrePassagers(int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setNbrePassagers'");
    }
}
