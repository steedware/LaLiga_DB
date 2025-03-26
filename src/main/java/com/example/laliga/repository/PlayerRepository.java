package com.example.laliga.repository;

import com.example.laliga.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

public interface PlayerRepository extends JpaRepository<Player, Long> {
    List<Player> findByNameContainingIgnoreCase(String name);

    @Query("SELECT p FROM Player p ORDER BY p.goals DESC")
    List<Player> findTop5ByOrderByGoalsDesc();
}