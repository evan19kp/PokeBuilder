package com.pokemonteambuild.pokebuilder.entities;

import jakarta.persistence.*;

@Entity
public class TeamMember {
    @Id @GeneratedValue
    private Long Id;
    private String name;
    private String spriteFrontUrl;
    private String spriteBackUrl;

    @ManyToOne
    @JoinColumn(name = "team_id")
    private Team team;
}
