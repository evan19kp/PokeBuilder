package com.pokemonteambuild.pokebuilder.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class PokemonController {
    @GetMapping("/pokemon/{name}")
    public String getPokemon() {
        return "test";
    }
}
