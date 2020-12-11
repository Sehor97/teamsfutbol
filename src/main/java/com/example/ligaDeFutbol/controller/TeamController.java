package com.example.ligaDeFutbol.controller;

import com.example.ligaDeFutbol.model.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.ligaDeFutbol.service.TeamsService;

import java.io.IOException;


@RestController
@RequestMapping("/teams")
public class TeamController {
    private final TeamsService teamsService;

    @Autowired
    public TeamController(TeamsService teamsService) {
        this.teamsService = teamsService;
    }

    @GetMapping(path = "/name")
    public ResponseEntity<Team> getByName(@RequestParam(name = "name") String name) throws IOException {
        return ResponseEntity.ok(teamsService.findByName(name));
    }

}
