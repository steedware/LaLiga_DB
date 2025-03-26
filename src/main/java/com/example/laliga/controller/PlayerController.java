package com.example.laliga.controller;

import com.example.laliga.model.Player;
import com.example.laliga.repository.PlayerRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/players")
public class PlayerController {

    private final PlayerRepository playerRepository;

    public PlayerController(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    @GetMapping("/search")
    @ResponseBody
    public List<Player> searchPlayers(@RequestParam String query) {
        return playerRepository.findByNameContainingIgnoreCase(query);
    }

    @GetMapping("/{id}")
    public String playerDetails(@PathVariable Long id, Model model) {
        Player player = playerRepository.findById(id).orElseThrow();
        model.addAttribute("player", player);
        return "player";
    }
}