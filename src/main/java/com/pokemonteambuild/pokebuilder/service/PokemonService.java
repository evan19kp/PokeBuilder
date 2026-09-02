package com.pokemonteambuild.pokebuilder.service;

import com.pokemonteambuild.pokebuilder.dto.PokeApiResponse;
import com.pokemonteambuild.pokebuilder.dto.PokemonDto;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;
import tools.jackson.databind.ObjectMapper;

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

        ObjectMapper objectMapper = new ObjectMapper();
        PokeApiResponse response = objectMapper.readValue(rawResponse, PokeApiResponse.class);
        String spriteFrontUrl = response.getSprite().getFrontFace();
        String spriteBackUrl = response.getSprite().getBackFace();

        return new PokemonDto(response.getName(), spriteFrontUrl, spriteBackUrl);
    }


}
