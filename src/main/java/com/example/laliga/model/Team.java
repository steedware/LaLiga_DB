package com.example.laliga.model;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Data
@Entity
public class Team {
    @Id
    private Long id;
    private String name;
    private String shortName;
    private String tla;
    private String crestUrl;

    // Statystyki
    private int points;
    private int position;

    @ManyToOne
    private Competition competition;

    @OneToMany(mappedBy = "team")
    private List<Player> players;
}