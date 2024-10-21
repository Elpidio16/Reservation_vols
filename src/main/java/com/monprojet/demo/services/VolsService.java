package com.monprojet.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.monprojet.demo.models.Vols;
import com.monprojet.demo.repository.VolsRepository;

@Service
public class VolsService {

    @Autowired
    private VolsRepository volsRepository;

    public Vols createVols(Vols vols) {
        return volsRepository.save(vols);
    }

    public List<Vols> searchVols(String destination) {
        return volsRepository.findByDepart(destination);
    }

}
