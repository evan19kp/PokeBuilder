package com.pokemonteambuild.pokebuilder.service;

import com.pokemonteambuild.pokebuilder.dto.PokemonDto;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

@Service
public class PokemonService {
    private final RestClient restClient;

    public PokemonService() {
        this.restClient = RestClient.create();
    }

    public PokemonDto getPikachu() {
        String rawResponse = restClient.get()
                                       .uri("https://pokeapi.co/api/v2/pokemon/pikachu")
                                       .retrieve()
                                       .body(String.class);
        System.out.println(rawResponse);

        return new PokemonDto("placeholder", "placeholder");
    }


}
