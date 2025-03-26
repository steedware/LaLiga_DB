package com.example.laliga.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;
import java.time.Period;

@Data
@Entity
public class Player {
    @Id
    private Long id;
    private String name;
    private String position;
    private int shirtNumber;
    private String nationality;
    private LocalDate dateOfBirth;
    private String photoUrl;

    // Statystyki
    private int goals;
    private int assists;
    private int yellowCards;
    private int redCards;
    private int minutesPlayed;

    @ManyToOne
    private Team team;

    @Transient
    public int getAge() {
        return Period.between(dateOfBirth, LocalDate.now()).getYears();
    }
}