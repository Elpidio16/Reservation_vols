package com.monprojet.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.monprojet.demo.models.Vols;

@Repository
public interface VolsRepository extends JpaRepository<Vols, Long> {
    List<Vols> findByDepart(String destination);
}
