package com.example.laliga.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.time.LocalDateTime;
import lombok.Data;

@Entity
@Table(name = "matches")
@Data
public class Matches {
    @Id
    private Long id;
    private LocalDateTime utcDate;

    @ManyToOne
    private Team homeTeam;

    @ManyToOne
    private Team awayTeam;

    private int homeScore;
    private int awayScore;
}