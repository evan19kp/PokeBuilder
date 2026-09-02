package com.pokemonteambuild.pokebuilder.Repos;

import com.pokemonteambuild.pokebuilder.entities.TeamMember;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamMemberRepo extends JpaRepository<TeamMember, Long> {
}
