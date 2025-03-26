package com.example.laliga.repository;

import com.example.laliga.model.Competition;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface CompetitionRepository extends JpaRepository<Competition, Long> {
    Optional<Competition> findByCode(String code);
}