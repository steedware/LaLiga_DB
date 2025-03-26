package com.example.laliga.service;

import com.example.laliga.model.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class FootballApiService {

    @Value("${football.api.url}")
    private String apiUrl;  // Dodaj tę deklarację

    private final RestTemplate restTemplate;

    public FootballApiService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public Competition getCompetition(String code) {
        String url = apiUrl + "/competitions/" + code;
        return restTemplate.getForObject(url, Competition.class);
    }

    public List<Team> getTeamsByCompetition(Long competitionId) {
        String url = apiUrl + "/competitions/" + competitionId + "/teams";
        TeamsResponse response = restTemplate.getForObject(url, TeamsResponse.class);
        return response != null ? response.getTeams() : List.of();
    }

    private static class TeamsResponse {
        private List<Team> teams;

        public List<Team> getTeams() {
            return teams;
        }

        public void setTeams(List<Team> teams) {
            this.teams = teams;
        }
    }
}