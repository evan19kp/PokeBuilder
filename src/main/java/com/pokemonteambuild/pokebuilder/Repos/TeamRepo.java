package com.pokemonteambuild.pokebuilder.Repos;

import com.pokemonteambuild.pokebuilder.entities.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepo extends JpaRepository<Team, Long> {
}
