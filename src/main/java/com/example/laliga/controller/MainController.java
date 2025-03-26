package com.example.laliga.controller;

import com.example.laliga.model.*;
import com.example.laliga.repository.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@Controller
public class MainController {

    private final MatchRepository matchRepository;
    private final TeamRepository teamRepository;
    private final PlayerRepository playerRepository;

    public MainController(MatchRepository matchRepository,
                          TeamRepository teamRepository,
                          PlayerRepository playerRepository) {
        this.matchRepository = matchRepository;
        this.teamRepository = teamRepository;
        this.playerRepository = playerRepository;
    }

    @GetMapping("/")
    public String home(Model model) {
        try {
            List<Matches> recentMatches = matchRepository.findTop5ByOrderByUtcDateDesc();
            List<Team> topTeams = teamRepository.findTop5ByOrderByPointsDesc();
            List<Player> topScorers = playerRepository.findTop5ByOrderByGoalsDesc();

            model.addAttribute("recentMatches", recentMatches != null ? recentMatches : List.of());
            model.addAttribute("topTeams", topTeams != null ? topTeams : List.of());
            model.addAttribute("topScorers", topScorers != null ? topScorers : List.of());

            return "index";
        } catch (Exception e) {
            // Log the error
            System.err.println("Error in home controller: " + e.getMessage());
            e.printStackTrace();
            // Return empty model to avoid 500 error
            model.addAttribute("recentMatches", List.of());
            model.addAttribute("topTeams", List.of());
            model.addAttribute("topScorers", List.of());
            return "index";
        }
    }
}