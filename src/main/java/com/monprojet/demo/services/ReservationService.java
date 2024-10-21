package com.monprojet.demo.services;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.monprojet.demo.models.Reservation;
import com.monprojet.demo.models.Users;
import com.monprojet.demo.models.Vols;
import com.monprojet.demo.repository.ReservationRepository;
import com.monprojet.demo.repository.UsersRepository;
import com.monprojet.demo.repository.VolsRepository;

@Service
public class ReservationService {

    @Autowired
    private ReservationRepository reservationRepository;

    @Autowired
    private VolsRepository volsRepository;

    @Autowired
    public UsersRepository usersRepository;

    public Reservation createReservation(Long userId, Long volId, int nbPlaces) {
        Users users = usersRepository.findById(userId).orElseThrow(() -> new RuntimeException("User not found"));
        Vols vols = volsRepository.findById(volId).orElseThrow(() -> new RuntimeException("Vol not found"));

        if (vols.getCapacite() >= nbPlaces) {
            Reservation reservation = new Reservation();
            reservation.setUser(users);
            reservation.setVol(vols);
            reservation.setNbrePassagers(nbPlaces);
            reservation.setDateReservation(LocalDateTime.now());

            vols.setNbrePassagers(vols.getCapacite() - nbPlaces);
            volsRepository.save(vols);
            return reservationRepository.save(reservation);
        }
        else {
            throw new RuntimeException("Not enough places");
        }
        
        
    }




}
