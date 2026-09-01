package com.pokemonteambuild.pokebuilder.dto;

public class PokemonDto {
    private String name;
    private String spriteURL;

    public PokemonDto(String name, String spriteURL) {
        this.name = name;
        this.spriteURL = spriteURL;
    }

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }

    public String getSpriteURL() {
        return spriteURL;
    }

    public void setSpriteURL() {
        this.spriteURL = spriteURL;
    }
}
