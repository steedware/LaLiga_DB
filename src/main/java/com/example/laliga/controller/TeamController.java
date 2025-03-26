package com.example.laliga.controller;

import com.example.laliga.model.Team;
import com.example.laliga.repository.TeamRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/teams")
public class TeamController {

    private final TeamRepository teamRepository;

    public TeamController(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }

    @GetMapping("/search")
    @ResponseBody
    public List<Team> searchTeams(@RequestParam String query) {
        return teamRepository.findByNameContainingIgnoreCase(query);
    }

    @GetMapping("/{id}")
    public String teamDetails(@PathVariable Long id, Model model) {
        Team team = teamRepository.findById(id).orElseThrow();
        model.addAttribute("team", team);
        return "team";
    }
}