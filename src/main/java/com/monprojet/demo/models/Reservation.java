package com.monprojet.demo.models;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private Users user;

    @ManyToOne
    @JoinColumn(name = "vol_id", nullable = false)
    private Vols vol;
    
    private int nbrePassagers;
    private LocalDateTime dateReservation;

    // Getters et Setters

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public Vols getVol() {
        return vol;
    }

    public void setVol(Vols vol) {
        this.vol = vol;
    }

    public int getNbrePassagers() {
        return nbrePassagers;
    }

    public void setNbrePassagers(int nbrePassagers) {
        this.nbrePassagers = nbrePassagers;
    }

    public LocalDateTime getDateReservation() {
        return dateReservation;
    }

    public void setDateReservation(LocalDateTime dateReservation) {
        this.dateReservation = dateReservation;
    }
}

