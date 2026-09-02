package com.pokemonteambuild.pokebuilder.entities;

import jakarta.persistence.*;

import java.util.List;

public class Team {
    @Id @GeneratedValue
    private Long Id;
    private String teamName;

    @OneToMany(mappedBy = "team")
    private List<TeamMember> members;
}
