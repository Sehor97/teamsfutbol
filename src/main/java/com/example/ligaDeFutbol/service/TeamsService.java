package com.example.ligaDeFutbol.service;

import com.example.ligaDeFutbol.model.Team;
import com.example.ligaDeFutbol.model.TeamResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class TeamsService {
    private final TeamResponse teams;

    @Autowired
    public TeamsService(TeamResponse teams) {
        this.teams = teams;
    }

    public Team findByName(String name) throws IOException {
        List<Team> lsTeam = teams.data();
        return lsTeam.stream().filter(item -> item.getNombre().equals(name)).findAny().orElse(null);
    }
}
