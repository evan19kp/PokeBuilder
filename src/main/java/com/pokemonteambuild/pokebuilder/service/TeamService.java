package com.pokemonteambuild.pokebuilder.service;

import com.pokemonteambuild.pokebuilder.Repos.TeamRepo;
import com.pokemonteambuild.pokebuilder.entities.Team;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TeamService {
    private final PokemonService pokemonService;
    private final TeamRepo teamRepo;

    public TeamService(PokemonService pokemonService, TeamRepo teamRepo) {
        this.pokemonService = pokemonService;
        this.teamRepo = teamRepo;
    }

    public Optional<Team> getTeam(Long id) {
        if (id == null) {
            throw new IllegalArgumentException("Team ID must not be null.");
            }
        else {
            return teamRepo.findById(id);
        }
    }

    public void addTeam(Team team) {
        teamRepo.save(team);
    }

    public void updateTeam(Long id, Team team) {
        if (id == null) {
            throw new IllegalArgumentException("Team ID must not be null.");
        }
        else if (!teamRepo.existsById(id)) {
            throw new IllegalArgumentException("Team ID not found.");
        }
        else {
            teamRepo.save(team);
        }

    }

    public void deleteTeam(Long id) {
        if (id == null) {
            throw new IllegalArgumentException("Team ID must not be null.");
        }
        else if (!teamRepo.existsById(id)) {
            throw new IllegalArgumentException("Team ID not found.");
        }
        else {
            teamRepo.deleteById(id);
        }
    }

}
