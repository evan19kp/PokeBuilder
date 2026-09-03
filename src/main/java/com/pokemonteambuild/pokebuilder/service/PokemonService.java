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

    public PokemonDto getPokemon(String name) {
        String rawResponse = restClient.get()
                                       .uri(String.format("https://pokeapi.co/api/v2/pokemon/%s", name))
                                       .retrieve()
                                       .body(String.class);

        ObjectMapper objectMapper = new ObjectMapper();
        PokeApiResponse response = objectMapper.readValue(rawResponse, PokeApiResponse.class);
        String spriteFrontUrl = response.getSprite().getFrontFace();
        String spriteBackUrl = response.getSprite().getBackFace();

        return new PokemonDto(response.getName(), spriteFrontUrl, spriteBackUrl);
    }


}
