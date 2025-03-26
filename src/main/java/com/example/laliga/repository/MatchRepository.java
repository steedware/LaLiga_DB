package com.example.laliga.repository;

import com.example.laliga.model.Matches;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface MatchRepository extends JpaRepository<Matches, Long> {
    List<Matches> findTop5ByOrderByUtcDateDesc();
}