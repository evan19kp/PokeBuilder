package com.pokemonteambuild.pokebuilder.dto;

public class PokemonDto {
    private final String name;
    private final String frontSpriteUrl;
    private final String backSpriteUrl;

    public PokemonDto(String name, String frontSpriteUrl, String backSpriteUrl) {
        this.name = name;
        this.frontSpriteUrl = frontSpriteUrl;
        this.backSpriteUrl = backSpriteUrl;
    }

    public String getName() {
        return name;
    }
    public String getFrontSpriteUrl() {
        return frontSpriteUrl;
    }
    public String getBackSpriteUrl() {
        return backSpriteUrl;
    }
}
