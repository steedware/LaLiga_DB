package com.example.laliga.repository;

import com.example.laliga.model.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

public interface TeamRepository extends JpaRepository<Team, Long> {
    List<Team> findByNameContainingIgnoreCase(String name);

    @Query("SELECT t FROM Team t ORDER BY t.points DESC")
    List<Team> findTop5ByOrderByPointsDesc();
}