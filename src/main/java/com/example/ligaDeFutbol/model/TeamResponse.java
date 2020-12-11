package com.example.ligaDeFutbol.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;
import java.util.List;

@Data
@Component
public class TeamResponse {
    private List<Team> teams;

    public List<Team> data() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        TeamResponse teams = mapper.readValue(new File("src/main/resources/templates/Teams.json"), TeamResponse.class);
        return teams.getTeams();
    }

}
