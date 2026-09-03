package com.pokemonteambuild.pokebuilder.service;

import com.pokemonteambuild.pokebuilder.Repos.TeamMemberRepo;
import com.pokemonteambuild.pokebuilder.entities.Team;
import com.pokemonteambuild.pokebuilder.entities.TeamMember;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import java.util.Optional;

@Service
public class TeamMemberService {
    private final PokemonService pokemonService;
    private final TeamMemberRepo teamMemberRepo;

    public TeamMemberService(PokemonService pokemonService, TeamMemberRepo teamMemberRepo) {
        this.pokemonService = pokemonService;
        this.teamMemberRepo = teamMemberRepo;
    }

    public Optional<TeamMember> getTeamMember(Long id) {
        if (id == null) {
            throw new IllegalArgumentException("Team Member Id must not be null.");
        }
        else {
            return teamMemberRepo.findById(id);
        }
    }

    public void addTeamMember(TeamMember teamMember) {
        teamMemberRepo.save(teamMember);
    }

    public void updateTeamMember(Long id, TeamMember teamMember) {
        if (id == null) {
            throw new IllegalArgumentException("Team Member ID must not be null.");
        }
        else if (!teamMemberRepo.existsById(id)) {
            throw new IllegalArgumentException("Team Member ID not found.");
        }
        else {
            teamMemberRepo.save(teamMember);
        }
    }

    public void deleteTeamMember(Long id) {
        if (id == null) {
            throw new IllegalArgumentException("Team Member ID must not be null.");
        }
        else if (!teamMemberRepo.existsById(id)) {
            throw new IllegalArgumentException("Team Member ID not found.");
        }
        else {
            teamMemberRepo.deleteById(id);
        }
    }


}
