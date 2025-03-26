package com.example.laliga.service;

import com.example.laliga.model.*;
import com.example.laliga.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
public class DataSyncService {

    private final FootballApiService apiService;
    private final CompetitionRepository competitionRepository;
    private final TeamRepository teamRepository;
    private final PlayerRepository playerRepository;
    private final MatchRepository matchRepository;

    @Autowired  // Dodana adnotacja @Autowired
    public DataSyncService(FootballApiService apiService,
                           CompetitionRepository competitionRepository,
                           TeamRepository teamRepository,
                           PlayerRepository playerRepository,
                           MatchRepository matchRepository) {
        this.apiService = apiService;
        this.competitionRepository = competitionRepository;
        this.teamRepository = teamRepository;
        this.playerRepository = playerRepository;
        this.matchRepository = matchRepository;
    }

    @Scheduled(fixedRate = 3600000)
    @Transactional
    public void syncData() {
        try {
            Competition competition = apiService.getCompetition("PD");
            if (competition != null) {
                competitionRepository.save(competition);

                List<Team> teams = apiService.getTeamsByCompetition(competition.getId());
                if (teams != null && !teams.isEmpty()) {
                    teamRepository.saveAll(teams);
                }
            }
        } catch (Exception e) {
            System.err.println("Error during data sync: " + e.getMessage());
            e.printStackTrace();
        }
    }
}